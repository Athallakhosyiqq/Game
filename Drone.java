package PROJECT_GAME;

public class Drone {

    int energi;
    int ketinggian;
    int kecepatan;
    String merk;

    void Terbang() {
        energi--;
        if (energi > 10) {
            ketinggian++;
            System.out.println("Drone terbang.......");

        } else {
            System.out.println("Energi lemah drone tidak bisa terbang");

        }
    }

    void Matikanmesin() {

        if (ketinggian > 0) {

            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");

        } else {
            System.out.println(" Mesin dimatikan.........");

        }
    }

    void Turun() {

        ketinggian = 0;
        energi--;
        System.out.println("Drone turun");
    }

    void Belok() {
        energi--;
        System.out.println("Drone Belok");
    }

    void Maju() {
        energi--;
        System.out.println("Drone Maju");
        kecepatan++;
    }

    void Mundur() {
        energi--;
        System.out.println("Drone Mundur");
        kecepatan++;
    }

}
