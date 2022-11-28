import java.util.Arrays;
public class Bouquet {
    Bouquet[] flowers;
    //int count;
    Bouquet () {
        flowers = new Bouquet[0];
    }

    Bouquet[] getFlowers() {
        if (flowers==null) {
            flowers=new Bouquet[0];
        }
        return flowers;
    }
    void addFlower (Flower i){
        this.flowers = Arrays.copyOf(getFlowers(), getFlowers().length + 1);
    }
}

