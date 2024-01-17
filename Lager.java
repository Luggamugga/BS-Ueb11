public class Lager{
    private int aepfel;
    private int apfelmus;

    public Lager(int aepfel,int apfelmus){
        this.aepfel = aepfel;
        this.apfelmus = apfelmus;
    }

    public synchronized void aepfelEinlagern(int anzahl) {
        aepfel = aepfel + anzahl;
        System.out.println(anzahl + " Äpfel eingelagert, Anz. Äpfel:" + aepfel
        );
        notifyAll();
    }
    public synchronized void apfelmusEntnehmen(int id, int anzahl) throws
            InterruptedException
    {
        while(apfelmus < anzahl){
            System.out.println("Identitaet " + id +
                    " muss warten. Anz. apfelmus:" + apfelmus);
            wait();
        }
            apfelmus = apfelmus - anzahl;
        System.out.println(anzahl + " Apfelmus entnommen von " + id + ", Anz. Apfelmus:" + apfelmus);
    }
    public synchronized void aepfelEntnehmen(int anzahl) throws InterruptedException {

        while(aepfel < anzahl){
            System.out.println("Koch muss warten. Anz. Äpfel:" + aepfel);
            wait();
        }
         aepfel = aepfel - anzahl;
        System.out.println(anzahl + " Äpfel entnommen, Anz. Äpfel:" + aepfel);
    }
    public synchronized void apfelmusEinlagern(int anzahl) {
         apfelmus = apfelmus + anzahl;
         System.out.println("Apfelmus einlagern Anz. : " + anzahl );
            notifyAll();
    }
}