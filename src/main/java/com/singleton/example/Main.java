package com.singleton.example;

// import java.io.*;
public class Main {

    /**
     * Gets references to the singleton
     * instance and checks if they point to the same object.
     */
    public void createSingleton() {


        MySingleton ms1 = MySingleton.createMySingleton();

        MySingleton ms2 = MySingleton.createMySingleton();


        System.out.println( ms1 == ms2 );

    }

    public static void main(String[] args) {
      new  Main().createSingleton();
    }
}
