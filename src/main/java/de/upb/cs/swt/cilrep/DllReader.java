package de.upb.cs.swt.cilrep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DllReader {
    public Project readProject(Path path) {
        try {

            // Load as binary:
            byte[] bytes = Files.readAllBytes(path);
            String asText = new String(bytes, StandardCharsets.ISO_8859_1);

            // Load as text, with some Charset:
            List<String> lines = Files.readAllLines(path, StandardCharsets.ISO_8859_1);
            lines = lines;
        }
        catch (IOException ioException){

        }

        return new Project();
    }

    public static void main(String[] args){
        Path myDirectoryPath = Paths.get("C:\\Users\\nij\\Desktop\\CIL Work\\cilrep\\src\\main\\java\\de\\upb\\cs\\swt\\cilrep\\instructions\\BaseInstructions");
        File dir = myDirectoryPath.toFile();
        File[] directoryListing = dir.listFiles();
        Path file = Paths.get("C:\\Users\\nij\\Desktop\\output.txt");
        List<String> lines = new ArrayList<>();

        if (directoryListing != null) {
            for (File child : directoryListing) {
                try {
                    String foundStr = child.getName();

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
                    }
                    lines.add(foundStr);

                    Files.write(file, lines, Charset.forName("UTF-8"));
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

}
