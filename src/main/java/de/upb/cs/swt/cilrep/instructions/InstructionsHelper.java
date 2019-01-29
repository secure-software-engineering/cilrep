package de.upb.cs.swt.cilrep.instructions;

import de.upb.cs.swt.cilrep.common.Constants;
import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.instructions.ParameterTypes.TypesBase;

import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class InstructionsHelper {
    public static Map<Integer, String> opCodeToInstruction;

    public static ArrayList<Class> getPackageClasses(String packageName){
        ArrayList<Class> classes = new ArrayList<>();
        try {
            final StandardJavaFileManager fileManager = ToolProvider.getSystemJavaCompiler().getStandardFileManager(null, null, null);
            classes = StreamSupport.stream(fileManager.list(StandardLocation.CLASS_PATH, packageName, Collections.singleton(JavaFileObject.Kind.CLASS), false).spliterator(), false)
                    .map(javaFileObject -> {
                        try {
                            final String[] split = javaFileObject.getName()
                                    .replace(".class", "")
                                    .replace(")", "")
                                    .split(Pattern.quote(File.separator));

                            final String fullClassName = packageName + "." + split[split.length - 1];
                            return Class.forName(fullClassName);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .collect(Collectors.toCollection(ArrayList::new));


        }
        catch (IOException exception){

        }
        return classes;
    }

    public static Object getInstanceFromClassName(String clsName){
        Object obj = null;
        try {
            Class cls = Class.forName(clsName);
            obj = cls.getDeclaredConstructor().newInstance();
        }
        catch (ClassNotFoundException ex){
        }
        catch (InstantiationException ex) {
        }
        catch (IllegalAccessException ex){
        }
        catch (NoSuchMethodException ex){
        }
        catch (InvocationTargetException ex){
        }
        return obj;
    }

    public static Instruction readInstruction(Integer _startIndex, byte[] _bytes){

        Instruction instruction = null;
        try{
            Integer opCodeLength = 1;
            if (isTwoBytesOpCode(_bytes[_startIndex])){
                opCodeLength = 2;
            }
            Integer opCode = HelperFunctions.readNBytesIntoInt32(opCodeLength, _startIndex, _bytes);
            String instructionClassName = opCodeToInstruction.get(opCode);
            instruction = (Instruction) getInstanceFromClassName(instructionClassName);
            if (instruction == null){
                instruction = instruction;
            }
            if (instruction.hasParameter){
                TypesBase param = instruction.getParameter();
                Integer paramValue = HelperFunctions.readNBytesIntoInt32(
                        param.getSizeInBytes(),
                        _startIndex + instruction.getOpCodeByteSize(),
                        _bytes
                        );
                param.value = paramValue;
            }
        }
        catch (ClassCastException ex){

            return instruction;
        }
        return instruction;
    }

    public static boolean isTwoBytesOpCode(byte data){
        return data == Constants.OpCodePrefix;
    }


    static {
        Map<Integer, String> aMap = new HashMap<>();

        try {
            // Base Instructions
            String packageName = "de.upb.cs.swt.cilrep.instructions.BaseInstructions";
            ArrayList<Class> classes = getPackageClasses(packageName);
            for (Class cls : classes){
                aMap.put((Integer) cls.getField(Constants.OpCodeFieldName).get(null), cls.getName());
            }
            packageName = "de.upb.cs.swt.cilrep.instructions.ObjectModelInstructions";
            classes = getPackageClasses(packageName);
            for (Class cls : classes){
                aMap.put((Integer) cls.getField(Constants.OpCodeFieldName).get(null), cls.getName());

            }
        }
        catch (NoSuchFieldException ex){

        }
        catch (IllegalAccessException ex){

        }
        opCodeToInstruction = Collections.unmodifiableMap(aMap);
    }
}
