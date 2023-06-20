package com.patterns.fabric_method.factories;

import com.patterns.fabric_method.Developer;
import com.patterns.fabric_method.JavaDeveloper;

public class JavaDeveloperFactory extends DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
