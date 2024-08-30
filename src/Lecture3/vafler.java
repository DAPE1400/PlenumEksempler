package Lecture3;

@SuppressWarnings("SpellCheckingInspection")
public class vafler {
    public static void main(String[] args) {
        // Ingredienser
        int hvetemel = 4; // dl
        int sukker = 1; // dl
        int bakepulver = 1; // ts
        int kardemomme = 1; // ts
        int melk = 4; // dl
        int egg = 3; // stk
        int smeltetSmor = 100; // gram
        int hviletid = 30; // minutter

        // Røre steg for steg
        boolean blandTorreIngredienser = false;
        boolean speMedMelk = false;
        boolean rorInnEggOgSmor = false;
        boolean laRorenSvelle = false;
        boolean justerMedVannEllerMelk = false;
        boolean stekVafler = false;
        boolean serverVafler = false;

        // Steg 1: Ha mel, sukker, bakepulver og kardemomme i en bolle.
        if (hvetemel == 4 && sukker == 1 && bakepulver == 1 && kardemomme == 1) {
            blandTorreIngredienser = true;
        }

        // Steg 2: Spe med litt av melken om gangen, rør godt mellom hver gang
        if (blandTorreIngredienser && melk == 4) {
            speMedMelk = true;
        }

        // Steg 3: Rør inn egg og tilsett smeltet smør
        if (speMedMelk && egg == 3 && smeltetSmor == 100) {
            rorInnEggOgSmor = true;
        }

        // Steg 4: La røren svelle i 1/2 time
        if (rorInnEggOgSmor && hviletid == 30) {
            laRorenSvelle = true;
        }

        // Steg 5: Juster røren med litt vann eller melk om den er for tykk
        if (laRorenSvelle) {
            justerMedVannEllerMelk = true; // Vi antar at røren er justert hvis nødvendig
        }

        // Steg 6: Stek vaflene i et vaffeljern
        if (justerMedVannEllerMelk) {
            stekVafler = true;
        }

        // Steg 7: Server vaflene
        if (stekVafler) {
            serverVafler = true;
        }

        // Output
        if (serverVafler) {
            System.out.println("Vaflene er klare til å serveres med syltetøy, rømme, sukker, smør og/eller brunost!");
        } else {
            System.out.println("Noe gikk galt, vaflene er ikke klare.");
        }
    }
}
