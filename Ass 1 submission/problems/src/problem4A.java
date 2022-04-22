public class problem4A {
    public boolean checkweight(int w){
        boolean confirmation;

        if (w <= 0 || w>100){
            throw new IllegalArgumentException("Weight not accepted");
        }

        else if (w % 2 == 0 && w != 2) {
            confirmation = true;
            return confirmation;
        }
        else {
            confirmation = false;
            return confirmation;
        }

    }
}
