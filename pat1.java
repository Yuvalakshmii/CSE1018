import java.lang.*;
import java.util.*;
public class Main {
    String swordName;
    int piercingDamage,slashingDamage,playerXP;
    public Main(String sn) {
        swordName=sn;
    }
    static void startTheGame() {
        System.out.println("START");
    }
    public void setWeaponFeatures(int pd,int sd,int pxp) {
        piercingDamage=pd;
        slashingDamage=sd;
        playerXP=pxp;
    }
    public void attack() {
        System.out.println("Player Attacked Using: "+swordName);
    }
    public void parry() {
        System.out.println("Enemy Parried Using: "+swordName);
    }
    static void endTheGame() {
        System.out.println("GAME OVER");
    }
    public void gameSummary() {
        
        System.out.println("Sword Name: " +swordName +"\nPiercing Damage :"  
      +piercingDamage+ "\nSlashing Damage: "+slashingDamage+ "\nPlayer XP: "  +playerXP);
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter p1: ");
        String s1=s.next();
        System.out.println("enter p2: ");
        String s2=s.next();

        Main player1= new Main(s1);
        Main player2= new Main(s2);
        
        startTheGame();
      
        player1.setWeaponFeatures(20,10,100);
        player2.setWeaponFeatures(15,5,100);

        player1.attack();
        player2.playerXP=player2.playerXP - player1.piercingDamage;
     
        player2.parry();
        player1.playerXP=player1.playerXP - player2.slashingDamage;
      
        endTheGame();
       
        System.out.println("***SUMMARY***");
        player1.gameSummary();
        player2.gameSummary();
        if(player1.playerXP>player2.playerXP) {
            System.out.println("WINNER: "+player1.swordName);
        }
        if(player2.playerXP>player1.playerXP) {
            System.out.println("WINNER: "+player2.swordName);
        }
    }
}

// Dagger
// Valyrian
// 20
// 10
// 100
// 15
// 5
// 100
