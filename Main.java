public class Main {

    public static void main(String[] args) {

        Cat[] cats = Cat.createArrayCat(20);

        Plate plate = new Plate(100);
        plate.setFilled(100);

        Cat.eatArrayCat(cats, plate);

        Cat.infoArrayCat(cats);

        plate.fillPlate(96);

        Cat.eatArrayCat(cats, plate);

        Cat.infoArrayCat(cats);


    }

}
