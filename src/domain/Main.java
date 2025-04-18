package domain;

public class Main {
    public static void main(String[] args) {
        Chameleon leo = new Chameleon("Лео", 1, "зелений");

        System.out.println(leo);
        leo.eat();
        leo.speak();
        leo.crawl();
        leo.hide();
        leo.changeColor("коричневий");
    }
}