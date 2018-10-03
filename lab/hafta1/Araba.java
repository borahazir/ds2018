public class Araba implements Comparable<Araba> {
    public int modelYili;
    public String marka;
    public double motorHacmi;
    public String plaka;

    public Araba(String marka, int modelYili, double motorHacmi, String plaka) {
        this.marka = marka;
        this.modelYili = modelYili;
        this.motorHacmi = motorHacmi;
        this.plaka = plaka;
    }

    @Override
    public int compareTo(Araba a) {
        return modelYili-a.modelYili;
    }
}

