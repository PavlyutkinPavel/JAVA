package com.patterns.fabric_method;

import com.patterns.fabric_method.factories.DeveloperFactory;
import com.patterns.fabric_method.factories.JavaDeveloperFactory;
import com.patterns.fabric_method.factories.PythonDeveloperFactory;

public class Main {
    public static void main(String[] args){
        DeveloperFactory factory = new JavaDeveloperFactory();
        Developer developer = factory.createDeveloper();
        System.out.println(developer.programLanguage);
    }
}
