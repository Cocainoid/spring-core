package ru.ava.spring;

public class AnimalsClassNameGenerator implements ClassNameGenerator {
    public String generateClassName() {
        String [] names = {"Cat", "Dog", "Dolphin", "Kapibara"};
        return names[(int) (Math.random() * 4)];
    }
}
