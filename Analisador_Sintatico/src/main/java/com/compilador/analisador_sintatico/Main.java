/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.compilador.analisador_sintatico;

import java.io.IOException;
import javax.swing.JFileChooser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


/**
 *
 * @author conra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //serve para encontrar o código fonte
        String path = "";
        JFileChooser fc = new JFileChooser();
        int retorna = fc.showOpenDialog(null);
        if(retorna == JFileChooser.APPROVE_OPTION){
            path = fc.getSelectedFile().getAbsolutePath();
        }
        
        CharStream cs = CharStreams.fromFileName(path);
        MyGramaticaLexer lexer = new MyGramaticaLexer(cs);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        MyGramaticaParser parser = new MyGramaticaParser(tokens);
        parser.program();
    }
}
