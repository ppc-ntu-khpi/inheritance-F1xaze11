package domain;

public class Animal {

    protected String name;
    protected int weight;

    public Animal() {
        name = "тварина";
        weight = 25;
    }

    public void eat() {
        System.out.println(name + " їсть...");
    }

    public void speak() {
        System.out.println(name + " видає звук...");
    }

    @Override
    public String toString() {
        return "Моя тварина:\nІм'я:\t" + name + "\nВага:\t" + weight + " кг";
    }
}