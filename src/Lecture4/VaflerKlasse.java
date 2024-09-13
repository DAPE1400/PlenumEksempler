package Lecture4;

// Klassen som representerer en oppskrift
class VaffelOppskrift {
    // Attributter som holder mengder av ingredienser
    double mel;
    double sukker;
    double bakepulver;
    double kardemomme;
    double melk;
    int egg;
    double smor;

    // Metode for å skrive ut oppskriften trinn for trinn
    public void skrivOppskrift() {
        System.out.println("1. Ha mel, sukker, bakepulver og kardemomme i en bolle.");
        System.out.println("   Bland " + mel + " dl hvetemel, " + sukker + " dl sukker, " +
                bakepulver + " ts bakepulver og " + kardemomme + " ts kardemomme i en bolle.\n");

        System.out.println("2. Spe med litt av melken om gangen. Rør godt mellom hver gang for å få en glatt røre uten melklumper.");
        System.out.println("   Spe med totalt " + melk + " dl melk. Rør godt for å unngå klumper.\n");

        System.out.println("3. Rør inn egg og tilsett smeltet smør. La røren svelle i 1/2 time.");
        System.out.println("   Tilsett " + egg + " egg og " + smor + " gram smeltet smør.");
        System.out.println("   La røren stå og svelle i 30 minutter. Juster røren med litt vann eller melk om den er for tykk.\n");

        System.out.println("4. Stek vaflene i et vaffeljern, og legg dem over på rist. Server dem gjerne varme.\n");
    }

    // Metode for å vise mengdene i oppskriften
    public void visIngredienser() {
        System.out.println("Vaffeloppskrift:");
        System.out.println("Hvetemel: " + mel + " dl");
        System.out.println("Sukker: " + sukker + " dl");
        System.out.println("Bakepulver: " + bakepulver + " ts");
        System.out.println("Malt kardemomme: " + kardemomme + " ts");
        System.out.println("Melk: " + melk + " dl");
        System.out.println("Egg: " + egg + " stk.");
        System.out.println("Smeltet smør: " + smor + " gram\n");
    }
}

// Klassen som representerer lageret vårt
class Lager {
    // Attributter for tilgjengelige ingredienser
    double mel;
    double sukker;
    double bakepulver;
    double kardemomme;
    double melk;
    int egg;
    double smor;

    // Metode for å sjekke om vi har nok ingredienser og trekke fra lageret
    public void brukIngredienser(VaffelOppskrift oppskrift) {
        if (mel >= oppskrift.mel) {
            System.out.println("Vi har nok mel.");
            mel = mel - oppskrift.mel;
        } else {
            System.out.println("Vi trenger mer mel.");
        }

        if (sukker >= oppskrift.sukker) {
            System.out.println("Vi har nok sukker.");
            sukker = sukker - oppskrift.sukker;
        } else {
            System.out.println("Vi trenger mer sukker.");
        }

        if (bakepulver >= oppskrift.bakepulver) {
            System.out.println("Vi har nok bakepulver.");
            bakepulver = bakepulver - oppskrift.bakepulver;
        } else {
            System.out.println("Vi trenger mer bakepulver.");
        }

        if (kardemomme >= oppskrift.kardemomme) {
            System.out.println("Vi har nok kardemomme.");
            kardemomme = kardemomme - oppskrift.kardemomme;
        } else {
            System.out.println("Vi trenger mer kardemomme.");
        }

        if (melk >= oppskrift.melk) {
            System.out.println("Vi har nok melk.");
            melk = melk - oppskrift.melk;
        } else {
            System.out.println("Vi trenger mer melk.");
        }

        if (egg >= oppskrift.egg) {
            System.out.println("Vi har nok egg.");
            egg = egg - oppskrift.egg;
        } else {
            System.out.println("Vi trenger flere egg.");
        }

        if (smor >= oppskrift.smor) {
            System.out.println("Vi har nok smør.");
            smor = smor - oppskrift.smor;
        } else {
            System.out.println("Vi trenger mer smør.");
        }
    }

    // Metode for å vise lagerstatus etter bruk
    public void visLagerstatus() {
        System.out.println("\nLager etter bruk:");
        System.out.println("Tilgjengelig hvetemel: " + mel + " dl");
        System.out.println("Tilgjengelig sukker: " + sukker + " dl");
        System.out.println("Tilgjengelig bakepulver: " + bakepulver + " ts");
        System.out.println("Tilgjengelig kardemomme: " + kardemomme + " ts");
        System.out.println("Tilgjengelig melk: " + melk + " dl");
        System.out.println("Tilgjengelige egg: " + egg);
        System.out.println("Tilgjengelig smør: " + smor + " gram");
    }
}

// Hovedklassen der vi oppretter objekter og bruker metodene
public class VaflerKlasse {
    public static void main(String[] args) {
        // Oppretting av oppskrift-objekt uten konstruktør
        VaffelOppskrift oppskrift = new VaffelOppskrift();
        oppskrift.mel = 4.0;
        oppskrift.sukker = 1.0;
        oppskrift.bakepulver = 1.0;
        oppskrift.kardemomme = 1.0;
        oppskrift.melk = 4.0;
        oppskrift.egg = 3;
        oppskrift.smor = 100.0;

        // Vis oppskriften
        oppskrift.skrivOppskrift();

        // Oppretting av lager-objekt uten konstruktør
        Lager lager = new Lager();
        lager.mel = 5.0;
        lager.sukker = 2.0;
        lager.bakepulver = 2.0;
        lager.kardemomme = 2.0;
        lager.melk = 6.0;
        lager.egg = 5;
        lager.smor = 150.0;

        // Vis ingredienser i oppskriften
        oppskrift.visIngredienser();

        // Bruk ingrediensene fra lageret og trekk fra
        lager.brukIngredienser(oppskrift);

        // Vis lagerstatus etter at vi har brukt ingrediensene
        lager.visLagerstatus();
    }
}
