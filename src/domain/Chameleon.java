package domain;

public class Chameleon extends Reptile {

    private String currentColor;

    public Chameleon(String name, int weight, String color) {
        super();  // Викликаємо конструктор батьківського класу
        this.name = name;
        this.weight = weight;
        this.currentColor = color;
    }

    public Chameleon() {
        this("Лео", 1, "зелений");
    }

    public Chameleon(String name) {
        this(name, 1, "зелений");
    }

    public void changeColor(String newColor) {
        System.out.println(name + " змінює колір з " + currentColor + " на " + newColor + ".");
        currentColor = newColor;
    }

    public void hide() {
        System.out.println(name + " ховається в оточенні.");
    }

    @Override
    public void crawl() {
        System.out.println(name + " нечутно повзе по гілці...");
    }

    @Override
    public void speak() {
        System.out.println(name + " клацає тихо.");
    }

    @Override
    public void eat() {
        System.out.println(name + " ловить комаху язиком.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nКолір:\t" + currentColor + "\n\nЦе — хамелеон!";
    }
}