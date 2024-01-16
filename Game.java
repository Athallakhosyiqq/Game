package PROJECT_GAME;

public class Game {

    public static void main(String[] args) {

        Player kamu = new Player();
        Player musuh = new Player();

        kamu.Name = "Pixel Blast";
        kamu.Speed = 50;
        kamu.HealthPoin = 100;
        kamu.Damage = 43;
        kamu.Defend = 10;

        musuh.Name = " A r a s e n";
        musuh.Speed = 34;
        musuh.HealthPoin = 100;
        musuh.Damage = 100;
        musuh.Defend = 15;

        kamu.Attack(musuh.Name, musuh.HealthPoin, musuh.Name);

        Drone xoxo = new Drone();

        xoxo.energi = 30;
        xoxo.kecepatan = 120;
        xoxo.ketinggian = 70;
        xoxo.merk = "Googlepixel";

        xoxo.Terbang();
        xoxo.Maju();
        xoxo.Belok();
        xoxo.Matikanmesin();
        xoxo.Mundur();
        xoxo.Turun();

        Pesawat oxox = new Pesawat();

        oxox.bahanBakar = 50;
        oxox.kecepatan = 175;
        oxox.ketinggian = 80;
        oxox.maskapai = "Boeing";

        oxox.terbang();
        oxox.matikanMesin();
        oxox.turun();
        oxox.belok();
        oxox.maju();
        oxox.mundur();

    }
}
