package Lecture3;

@SuppressWarnings("SpellCheckingInspection")
public class vafler {
    public static void main(String[] args) {
        // Lageret vårt
        double tilgjengeligMel = 5.0; // i desiliter
        double tilgjengeligSukker = 2.0; // i desiliter
        double tilgjengeligBakepulver = 2.0; // i teskjeer
        double tilgjengeligKardemomme = 2.0; // i teskjeer
        double tilgjengeligMelk = 6.0; // i desiliter
        int tilgjengeligeEgg = 5;
        double tilgjengeligSmor = 150.0; // i gram

        // Oppskriftmengder
        double mel = 4.0; // i desiliter
        double sukker = 1.0; // i desiliter
        double bakepulver = 1.0; // i teskjeer
        double kardemomme = 1.0; // i teskjeer
        double melk = 4.0; // i desiliter
        int egg = 3;
        double smeltetSmor = 100.0; // i gram

        // Sjekker om vi har nok ingredienser og trekker fra etter bruk
        if (tilgjengeligMel >= mel) {
            System.out.println("Vi har nok mel.");
            tilgjengeligMel = tilgjengeligMel - mel; // Trekker fra mel
        } else {
            System.out.println("Vi trenger mer mel.");
        }

        if (tilgjengeligSukker >= sukker) {
            System.out.println("Vi har nok sukker.");
            tilgjengeligSukker = tilgjengeligSukker - sukker; // Trekker fra sukker
        } else {
            System.out.println("Vi trenger mer sukker.");
        }

        if (tilgjengeligBakepulver >= bakepulver) {
            System.out.println("Vi har nok bakepulver.");
            tilgjengeligBakepulver = tilgjengeligBakepulver - bakepulver; // Trekker fra bakepulver
        } else {
            System.out.println("Vi trenger mer bakepulver.");
        }

        if (tilgjengeligKardemomme >= kardemomme) {
            System.out.println("Vi har nok kardemomme.");
            tilgjengeligKardemomme = tilgjengeligKardemomme - kardemomme; // Trekker fra kardemomme
        } else {
            System.out.println("Vi trenger mer kardemomme.");
        }

        if (tilgjengeligMelk >= melk) {
            System.out.println("Vi har nok melk.");
            tilgjengeligMelk = tilgjengeligMelk - melk; // Trekker fra melk
        } else {
            System.out.println("Vi trenger mer melk.");
        }

        if (tilgjengeligeEgg >= egg) {
            System.out.println("Vi har nok egg.");
            tilgjengeligeEgg = tilgjengeligeEgg - egg; // Trekker fra egg
        } else {
            System.out.println("Vi trenger flere egg.");
        }

        if (tilgjengeligSmor >= smeltetSmor) {
            System.out.println("Vi har nok smør.");
            tilgjengeligSmor = tilgjengeligSmor - smeltetSmor; // Trekker fra smør
        } else {
            System.out.println("Vi trenger mer smør.");
        }

        // Utskrift av oppskriften trinn for trinn
        System.out.println("\nSlik lager du vafler:");

        // Trinn 1
        System.out.println("1. Ha mel, sukker, bakepulver og kardemomme i en bolle.");
        System.out.println("   Bland " + mel + " dl hvetemel, " + sukker + " dl sukker, " +
                bakepulver + " ts bakepulver og " + kardemomme + " ts kardemomme i en bolle.\n");

        // Trinn 2
        System.out.println("2. Spe med litt av melken om gangen. Rør godt mellom hver gang for å få en glatt røre uten melklumper.");
        System.out.println("   Spe med totalt " + melk + " dl melk. Rør godt for å unngå klumper.\n");

        // Trinn 3
        System.out.println("3. Rør inn egg og tilsett smeltet smør. La røren svelle i 1/2 time.");
        System.out.println("   Tilsett " + egg + " egg og " + smeltetSmor + " gram smeltet smør.");
        System.out.println("   La røren stå og svelle i 30 minutter. Juster røren med litt vann eller melk om den er for tykk.\n");

        // Trinn 4
        System.out.println("4. Stek vaflene i et vaffeljern, og legg dem over på rist. Server dem gjerne varme.");
        System.out.println("   Stek i vaffeljern og nyt varme vafler!\n");

        // Oppsummering av oppskriften
        System.out.println("\nVaffeloppskrift:");
        System.out.println("Hvetemel: " + mel + " dl");
        System.out.println("Sukker: " + sukker + " dl");
        System.out.println("Bakepulver: " + bakepulver + " ts");
        System.out.println("Malt kardemomme: " + kardemomme + " ts");
        System.out.println("Melk: " + melk + " dl");
        System.out.println("Egg: " + egg + " stk.");
        System.out.println("Smeltet smør: " + smeltetSmor + " gram");

        // Lagerstatus etter bruk
        System.out.println("\nLager etter bruk:");
        System.out.println("Tilgjengelig hvetemel: " + tilgjengeligMel + " dl");
        System.out.println("Tilgjengelig sukker: " + tilgjengeligSukker + " dl");
        System.out.println("Tilgjengelig bakepulver: " + tilgjengeligBakepulver + " ts");
        System.out.println("Tilgjengelig kardemomme: " + tilgjengeligKardemomme + " ts");
        System.out.println("Tilgjengelig melk: " + tilgjengeligMelk + " dl");
        System.out.println("Tilgjengelige egg: " + tilgjengeligeEgg);
        System.out.println("Tilgjengelig smør: " + tilgjengeligSmor + " gram");
    }
}

