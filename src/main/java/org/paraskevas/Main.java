package org.paraskevas;

import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Executing Kotlin code...");
        BillionGenKotlinKt.main();
//        System.out.println("Executing Java code...");
//        BillionNumberGeneratorJava.main(args);
//        System.out.println("Java code execution completed.");
    }
}