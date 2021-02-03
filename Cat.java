import java.util.Random;

public class Cat {
    private String name;
    private int age;
    private boolean catWellEat;
    private final int appetite;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.catWellEat = false;
        appetite = 12;
    }

    public String getName() {
        return this.name;
    }

    public boolean getCatWellEat() {
        return this.catWellEat;
    }

    public void eat(Plate plate) {
        if (!catWellEat) {
            if (plate.getFilled() >= appetite) {
                catWellEat = true;
                System.out.println(name + " поел из миски");
                int a = plate.getFilled() - appetite;
                plate.setFilled(a);
            } else {
                System.out.println("В миске недостаточно еды!");
            }
        } else if (catWellEat) {
            System.out.println("Кот " + name + " неголоден.");
        }
    }

    public void infoCat() {
        System.out.println(getName() + " is well eat: " + getCatWellEat());
    }

    public static Cat[] createArrayCat(int count) {
        Cat[] cats = new Cat[count];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("cat" + i, i);
        }
        return cats;
    }


    public static void infoArrayCat(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].infoCat();
        }
    }

    public static void eatArrayCat(Cat[] cats, Plate plate) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
    }
}