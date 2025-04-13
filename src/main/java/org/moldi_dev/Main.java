package org.moldi_dev;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.moldi_dev.antlr_4_gen.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        String source = readResourceFile(fileName);

        System.out.println("✨ CZ Interpreter - C with Gen Z Slang | Normalize Gen Z coding bestie ✨");

        System.out.print("📁 Parsing file: " + fileName + "\n");
        System.out.println("📁 File contents:");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(source);
        System.out.println("-----------------------------------------------------------------------");

        CharStream input = CharStreams.fromString(source);
        CZLexer lexer = new CZLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CZParser parser = new CZParser(tokens);

        ParseTree tree = parser.program();

        CZInterpreter interpreter = new CZInterpreter();
        interpreter.visit(tree);
    }

    private static String readResourceFile(String fileName) throws Exception {
        InputStream input = Main.class.getClassLoader().getResourceAsStream(fileName);

        if (input == null) {
            throw new RuntimeException("Resource not found: " + fileName);
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }
}
