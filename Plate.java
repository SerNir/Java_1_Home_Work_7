public class Plate {
    private int volume;
    private int filled;

    public int getVolume() {
        return volume;
    }

    public int getFilled() {
        return filled;
    }

    public void setFilled(int filled) {
        this.filled = filled;
        if(filled < 0){
            clearPlate();
        }

    }

    public Plate(int volume) {
        this.volume = volume;
        this.filled = 0;
    }

    public void fillPlate(int filled) {
        if (filled > 0 && filled <= volume) {
            this.filled = filled;
        }
    }

    public void clearPlate() {
        this.filled = 0;
        System.out.println("Тарелка очищена");
    }

    public void infoPlate() {
        System.out.println("Объем миски " + volume + ", количество еды " + filled);
    }
}