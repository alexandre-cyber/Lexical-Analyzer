/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexico;

import java.io.File;

/**
 *
 * @author cultureh
 */
public class Alexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String path = "C:/Users/cultureh/Documents/NetBeansProjects/alexico/src/alexico/Lexer.flex";
        generarLexer(path);
    }

    public static void generarLexer(String path) {
        // 2nd code here
        File file = new File(path);
        jflex.Main.generate(file);
    }
}
