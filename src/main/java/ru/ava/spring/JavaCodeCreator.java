package ru.ava.spring;

public class JavaCodeCreator implements CodeCreator {
    ClassNameGenerator classNameGenerator;
    public void setClassNameGenerator(AnimalsClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    public String getClassExample() {
        return "public class " + classNameGenerator.generateClassName() + "(){\n\n}";
    }

}
