package com.patterns.abstactFactory.fabrics;

import com.patterns.abstactFactory.*;

public class PythonFactory extends Factory{
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Language createLanguage() {
        return new PythonLanguage();
    }

    @Override
    public Course createCourse() {
        return new PythonCourse();
    }
}
