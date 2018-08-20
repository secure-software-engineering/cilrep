package de.upb.cs.swt.cilrep;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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

}
