public class Main {
    public static void main(String[] args) {
        Guru guru1 = new Guru() {
            @Override
            public void printInfo() {
                System.out.println("Nama Guru: " + getNamaGuru());
                System.out.println("NIP: " + getNIP());
                System.out.println("NUPTK: " + getNUPTK());
                System.out.println("Pendidikan: " + getPendidikan());
                System.out.println("Kontak: " + getKontak());
            }
        };

        // Mengisi data guru
        guru1.setNamaGuru("Ustman");
        guru1.setNIP(111);
        guru1.setNUPTK(222);
        guru1.setPendidikan("S1 Teknik Informatika");
        guru1.setKontak(333);

        // Mencetak informasi guru
        guru1.printInfo();
    }
}