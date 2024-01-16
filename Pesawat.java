package PROJECT_GAME;

public class Pesawat {
     int bahanBakar;
    int ketinggian;
    int kecepatan;
    String maskapai;
   

    public void terbang() {
        bahanBakar--;
        if (bahanBakar > 10) {
            ketinggian++;
            System.out.println(maskapai + " terbang.......");

        } else {
            System.out.println("Bahan bakar habis, " + maskapai + " tidak bisa terbang");

        }
    }

    public void matikanMesin() {

        if (ketinggian > 0) {

            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");

        } else {
            System.out.println(maskapai + " Mesin dimatikan.........");

        }
    }

    public void turun() {

        ketinggian = 0;
        bahanBakar--;
        System.out.println(maskapai + " turun");
    }

    public void belok() {
        bahanBakar--;
        System.out.println(maskapai + " belok");
    }

    public void maju() {
        bahanBakar--;
        System.out.println(maskapai + " maju");
        kecepatan++;
    }

    public void mundur() {
        bahanBakar--;
        System.out.println(maskapai + " mundur");
        kecepatan++;
    }
}

    

