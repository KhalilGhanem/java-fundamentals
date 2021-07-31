/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());
        Path path = Paths.get("gates.js");

        JavaScriptLinter(path);


    }

    public static String JavaScriptLinter(Path path){
        String massage="";
        int count=0;


        try {
            List<String> fileLines = Files.readAllLines(path);
            for(String line : fileLines){
                count++;
                if (!line.endsWith(";") &&  !line.isBlank() && !line.endsWith("{") && !line.endsWith("}") && !line.contains("if ") && !line.contains("else")  ){
                    System.out.println("Line "+count+": Missing semicolon.");
                    massage+="Line "+count+": Missing semicolon.\n";
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return massage;
    }
}

// if((!line.endsWith(";") && !( line.isEmpty() || line.endsWith("{") || line.endsWith("}") || line.contains("if ") ||line.contains("else"))) ){
//         System.out.println("Line "+count+": Missing semicolon.");
//         }