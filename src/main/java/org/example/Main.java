package org.example;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gutentag");
        System.out.println("Inserisci due cifre da processare\ninserisci A:\n");
        float a = in.nextFloat();
        System.out.println("inserisci B:\n");
        float b = in.nextFloat();
        float[] array = new float[2];

        Calcolatrice advancedIA = new Calcolatrice();
        array[0] = advancedIA.add(a,b);
        array[1] = advancedIA.minus(a,b);

        System.out.println("Il risultato è:\n");
        try {
            System.out.println("Eaborazione in corso...");
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException e){
            System.out.println("Ci stanno tracciando, stacca, stacca\nLA NOSTRA CALCOLATRICE E' TEMPORANEAMENTE FUORI USO");
        }
        System.out.println("Sum " + array[0] + " Minus " + array[1]);
    }
}