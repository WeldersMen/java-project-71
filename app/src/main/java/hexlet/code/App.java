package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;


@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff 1.0",
        description = "Compares two configuration files and shows a difference.")

public class App implements Runnable {
    @Parameters(index = "0", description = "path to first file")
    private String filepath1;
    @Parameters(index = "1", description = "path to first file")
    private String filepath2;
    @Option(names = {"-f", "--format"}, description ="output format [default: stylish]")
    private String format = "stylish";

    public static void main(String[] args) {
     CommandLine.run(new App(), args);
    }

    @Override
    public void run() {
        // Ваша реализация самой логики сравнения файлов
        System.out.println("Filepath 1: " + filepath1);
        System.out.println("Filepath 2: " + filepath2);
        System.out.println("Output Format: " + format);
    }
}

