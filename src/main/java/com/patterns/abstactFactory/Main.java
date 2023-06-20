package com.patterns.abstactFactory;

import com.patterns.abstactFactory.fabrics.Factory;
import com.patterns.abstactFactory.fabrics.JavaFactory;

public class Main {
    public static void main(String[] args){
        Factory factory = new JavaFactory();

        Developer developer = factory.createDeveloper();
        Language language = factory.createLanguage();
        Course course = factory.createCourse();

        System.out.println(developer.introduction);
        System.out.println(language.language);
        System.out.println(course.lessons);
    }
}
