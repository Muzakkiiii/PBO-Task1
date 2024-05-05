abstract class Guru {
    private String NamaGuru;
    private int NIP;
    private int NUPTK;
    private String Pendidikan;
    private int Kontak;

    public String getNamaGuru() {
        return NamaGuru;
    }

    public void setNamaGuru(String NamaGuru) {
        this.NamaGuru = NamaGuru;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public int getNUPTK() {
        return NUPTK;
    }

    public void setNUPTK(int NUPTK) {
        this.NUPTK = NUPTK;
    }

    public String getPendidikan() {
        return Pendidikan;
    }

    public void setPendidikan(String Pendidikan) {
        this.Pendidikan = Pendidikan;
    }

    public int getKontak() {
        return Kontak;
    }

    public void setKontak(int Kontak) {
        this.Kontak = Kontak;
    }

    // Metode abstrak yang akan diimplementasikan oleh kelas turunan
    public abstract void printInfo();
}
