package com.patterns.fabric_method.factories;

import com.patterns.fabric_method.Developer;
import com.patterns.fabric_method.PythonDeveloper;

public class PythonDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
