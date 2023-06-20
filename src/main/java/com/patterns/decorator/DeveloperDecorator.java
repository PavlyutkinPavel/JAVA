package com.patterns.decorator;

public class DeveloperDecorator implements IDeveloper{
    public IDeveloper iDeveloper;

    public DeveloperDecorator(IDeveloper iDeveloper) {
        this.iDeveloper = iDeveloper;
    }

    @Override
    public void writeCode() {
        iDeveloper.writeCode();
    }
}
