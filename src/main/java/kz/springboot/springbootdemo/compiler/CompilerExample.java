package kz.springboot.springbootdemo.compiler;

import javax.tools.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerExample {
    public static void main(String[] args) throws IOException {
        // Create a new file manager
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);

        // Define the Java source file
        File file = new File("HelloWorld.java");

        // Create a compilation unit
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(Arrays.asList(file));

        // Define compilation options
        List<String> options = new ArrayList<>();
        options.addAll(Arrays.asList("-classpath", System.getProperty("java.class.path")));

        // Create a diagnostic listener
        DiagnosticCollector<JavaFileObject> diagnosticListener = new DiagnosticCollector<>();

        // Define the output directory
        File outputDir = new File("bin");
        outputDir.mkdirs();

        // Define the Java compiler task
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, diagnosticListener, options, null, compilationUnits);

        // Compile the Java source file
        boolean success = task.call();

        // Output any compilation errors
        for (Diagnostic<? extends JavaFileObject> diagnostic : diagnosticListener.getDiagnostics()) {
            System.err.format("Error on line %d in %s%n", diagnostic.getLineNumber(), diagnostic.getSource().toUri());
        }
    }
}
