import java.time.LocalDateTime;

public class Festmeny {
    public Festmeny(String cim, String festo, String stilus) {
        this.cim = cim;
        this.festo = festo;
        this.stilus = stilus;
    }

    public Festmeny(String sor) {
    }

    public String getFesto() {
        return festo;
    }

    public String getStilus() {
        return stilus;
    }

    public int getLicitekSzama() {
        return licitekSzama;
    }

    public int getLegmagasabbLicit() {
        return legmagasabbLicit;
    }

    public LocalDateTime getLegutolsoLicitIdeje() {
        return legutolsoLicitIdeje;
    }

    public boolean isElkelt() {
        return elkelt;
    }

    public void setElkelt(boolean elkelt) {
        this.elkelt = elkelt;
    }
    public void licit(int mertek){

    };
    public void licit(){
        int ossz = 100;
        if(licitekSzama<0){
            licitekSzama++;
            legutolsoLicitIdeje=LocalDateTime.now();
        }
        if(licitekSzama>0){
            ossz=(int)(legmagasabbLicit*1.10);
            licitekSzama++;
            legutolsoLicitIdeje=LocalDateTime.now();
        }
    }
    String cim;
    String festo;
    String stilus;
    int licitekSzama = 0;
    int legmagasabbLicit = 0;
    LocalDateTime legutolsoLicitIdeje;
    boolean elkelt = false;
}
