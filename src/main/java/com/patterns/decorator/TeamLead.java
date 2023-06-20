package com.patterns.decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void writeCode() {
        super.writeCode();
        System.out.println("Leads project ...");
    }
}
