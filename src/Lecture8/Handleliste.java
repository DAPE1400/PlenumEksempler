package Lecture8;

public class Handleliste {
    //TODO: consider if 10 size make sense? What does?
    String[] handleliste = new String[10];

    public void addElement(String str){
        //TODO: legg til et nytt element i den første tilgjengelige plassen (hint: != null)
        //TODO: hva hvis listen er tom for plasser?
    }

    public void removeElement(int pos){
        //TODO: fjern element fra listen på posisjon pos
    }

    public static void main(String[] args) {
        Handleliste h = new Handleliste();

        h.addElement("Gummihansker");
        h.addElement("Sylteagurk");
        h.addElement("Duct tape");
        h.addElement("Marshmallows");
        h.addElement("Hagenisse");
        h.addElement("Kvikk lønsj");
        h.addElement("Stor presenning");
        h.addElement("Ballonger");
        h.addElement("WD-40");
        h.addElement("Vekkerklokke");
        h.addElement("Surströmming");

        // fant marshmellows
        h.removeElement(4);

        // kom på at man også trengte pølser og lomper
        h.addElement("Pølser");
        h.addElement("Lomper");

        // TODO: man fant Pølser så fjern pølser fra listen, men hvor ligger den?

    }
}
