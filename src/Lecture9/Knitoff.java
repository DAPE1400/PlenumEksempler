package Lecture9;

import java.util.ArrayList;


public class Knitoff {
    public static void main(String[] args) {
        var spaceYarnBasket = new ArrayList<String>();

        spaceYarnBasket.add("Nebula Yarn");
        spaceYarnBasket.add("Nano-fiber Polyester");    // Not allowed
        spaceYarnBasket.add("Quantum Yarn");
        spaceYarnBasket.add("Dark Matter Yarn");
        spaceYarnBasket.add("Anti-Gravity Cloth");        // Not allowed

        // Correctly disqualify all materials that are not yarn
        for (int i = 0; i < spaceYarnBasket.size(); i++) {
            if (!spaceYarnBasket.get(i).contains("Yarn")) {
                spaceYarnBasket.remove(i);
                System.out.println("Disqualifying: " + spaceYarnBasket.get(i)); //mistake: after remove this is a different element.
            }
        }


    }
}