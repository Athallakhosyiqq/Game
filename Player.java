package PROJECT_GAME;

public class Player {

   String Name;
    int Speed, HealthPoin, Damage, Defend;
    
    void run(){
        System.out.println(Name +" is running...");
        System.out.println("Speed: "+ Speed);
    }
    
    void Attack(String a, int b, String c){
        System.out.println(Name +" is attacking "+a);
        System.out.println("Damage: "+ Damage);
        b -= Damage;
        System.out.println("A r a s e n healthpoint: "+b);
        if (b==0) {
            System.out.println(c+" Is the winner");
        }
    }
    
    void Defend(){
        System.out.println(Name +" is defending...");
        System.out.println("Defend: "+Defend);
    }

    boolean IsDead(){
        if(HealthPoin <= 0) return true;
        return false;
    }
}