package org.example;

public class Auto {
    private final String name;

    public Auto(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                '}';
    }
}
