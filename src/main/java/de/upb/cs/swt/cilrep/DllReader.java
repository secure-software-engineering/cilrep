package de.upb.cs.swt.cilrep;

import de.upb.cs.swt.cilrep.assemblycomponents.AssemblyComponents;
import de.upb.cs.swt.cilrep.common.HelperFunctions;
import de.upb.cs.swt.cilrep.filecomponents.FileComponents;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.MethodDefTable;
import de.upb.cs.swt.cilrep.filecomponents.MetadataLogicalFormat.TypeDefTable;
import de.upb.cs.swt.cilrep.filecomponents.MetadataPhysicalLayout.FileHeaders.MetadataRoot;
import de.upb.cs.swt.cilrep.instructions.BaseInstructions.Add;
import de.upb.cs.swt.cilrep.instructions.InstructionsHelper;

import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DllReader {
    private static final String    HEXES    = "0123456789ABCDEF";
    public Project readProject(Path path) {
        try {

            // Load as binary:
            byte[] bytes = Files.readAllBytes(path);

            String[] hex = getHex(bytes);
            int headerIndex = 0;

            /*for (int i = 0; i < hex.length; i++){
                if (hex[i].equals("42")){
                    if (hex[i - 1].equals("4A")
                        && hex[i - 2].equals("53")
                        && hex[i - 3].equals("42")){
                        headerIndex = i;
                    }
                }
            }*/


            String asText = new String(bytes, StandardCharsets.ISO_8859_1);

            FileComponents fc = new FileComponents();
            fc.readBytes(bytes);

            AssemblyComponents ac = new AssemblyComponents(fc);
            ac.populateMethods(bytes);
            List methods = ac.methods;
        }
        catch (IOException ioException){

        }

        return new Project();
    }

    String[] getHex(byte[] raw) {
        final String[] hex = new String[raw.length];
        for (int i = 0; i < raw.length; i++){
            hex[i] = (HEXES.charAt((raw[i] & 0xF0) >> 4))
                    + "" + (HEXES.charAt((raw[i] & 0x0F)));
        }
        return hex;
    }

    void extractOpCodeAndClassNames(){
        Path myDirectoryPath = Paths.get("C:\\Users\\nij\\Desktop\\CIL Work\\cilrep\\src\\main\\java\\de\\upb\\cs\\swt\\cilrep\\instructions\\BaseInstructions");
        File dir = myDirectoryPath.toFile();
        File[] directoryListing = dir.listFiles();
        Path file = Paths.get("C:\\Users\\nij\\Desktop\\CIL Work\\output.txt");
        List<String> lines = new ArrayList<>();

        if (directoryListing != null) {
            for (File child : directoryListing) {
                try {
                    Charset charset = StandardCharsets.UTF_8;

                    String content = file.toString();
                    content = content.replaceAll("implements", "extends");
                    Files.write(file, content.getBytes(charset));
                    break;
                    /*String foundStr = child.getName();

                    Scanner scanner = new Scanner(child);

                    int lineNum = 0;
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        lineNum++;
                        if(line.contains("OpCode = ")) {
                            String OpCode = line.substring(line.indexOf("=") + 2,
                                    line.indexOf(";"));
                            foundStr += "," + OpCode;
                        }
                        else if (line.contains("AssemblyFormat = ")){
                            String assemblyFormat = line.substring(line.indexOf("=") + 3,
                                    line.indexOf(";") - 1);
                            foundStr += "," + assemblyFormat;
                            break;
                        }
                    }*/
                    //lines.add(foundStr);

                    //Files.write(file, lines, Charset.forName("UTF-8"));
                }
                catch (FileNotFoundException e){
                    System.out.println("file not found");
                }
                catch (IOException ioException){
                    System.out.println("io exception");
                }

            }
        }
    }

    public static void main(String[] args){

        Object obj = InstructionsHelper.getInstanceFromClassName("de.upb.cs.swt.cilrep.instructions.BaseInstructions.LoadConstantInt32Short");
        /*DllReader dllr = new DllReader();
        dllr.extractOpCodeAndClassNames();*/


        /*try {
            Class cls = Class.forName("de.upb.cs.swt.cilrep.instructions.BaseInstructions.Add");
            Add myTestObject = (Add) cls.getDeclaredConstructor().newInstance();
            myTestObject = myTestObject;

        }
        catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());

        }
        catch (InstantiationException ex) {

        }
        catch (IllegalAccessException ex){

        }
        catch (NoSuchMethodException ex){

        }
        catch (InvocationTargetException ex){

        }


        try {
            FileReader fr = new FileReader("C:\\Users\\nij\\Desktop\\CIL Work\\output.txt");
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] strings = line.split(",");
                    Integer opCode = Integer.getInteger(strings[1]);
                    System.out.println("aMap.put(" + strings[1] + ", \"de.upb.cs.swt.cilrep.instructions.BaseInstructions." + strings[0].substring(0, strings[0].length() - 5) + "\");");
                }
            }
        }
        catch (IOException ex){

        }*/

    }
}
