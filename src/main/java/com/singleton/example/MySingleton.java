package com.singleton.example;
import java.util.*;
public class MySingleton {

    //the static singleton object
    private static  MySingleton theObject;

    private MySingleton() {
    }

    public static MySingleton createMySingleton() {

        if (theObject == null)
            theObject = new MySingleton();
        return theObject;
    }

}
