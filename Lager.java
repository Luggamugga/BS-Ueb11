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
        while(){
            System.out.println("identität" + id + "muss warten. Anz. apfelmus:" + apfelmus);

        }
        System.out.println(anzahl + " Apfelmus entnommen von " + id + ", Anz. Apfelmus:" + apfelmus);
        notifyAll();
    }
    public synchronized void aepfelEntnehmen(int anzahl) throws InterruptedException {
        while(){
            System.out.println("Koch muss warten. Anz. Äpfel:" + aepfel);
      
        }
        System.out.println(anzahl + " Äpfel entnommen, Anz. Äpfel:" + aepfel);
        notifyAll();
    }
    public synchronized void apfelmusEinlagern(int anzahl) {
         apfelmus = apfelmus + anzahl;
            notifyAll();
    }
}