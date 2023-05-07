package school.mjc.stage0.conditions.finalTask;

import javax.crypto.spec.PSource;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x==0 && y==0){
            System.out.println("zero");
        } else if (y > 0) {
            if (x>0){
                System.out.println("first");
            }
            System.out.println("second");
        } else {
            if (x<0){
                System.out.println("third");
            }
            System.out.println("fourth");
        }
    }
}
