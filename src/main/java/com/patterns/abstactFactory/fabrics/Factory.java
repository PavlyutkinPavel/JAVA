package com.patterns.abstactFactory.fabrics;

import com.patterns.abstactFactory.Course;
import com.patterns.abstactFactory.Developer;
import com.patterns.abstactFactory.Language;

public abstract class Factory {
    public abstract Developer createDeveloper();
    public abstract Language createLanguage();
    public abstract Course createCourse();

}
