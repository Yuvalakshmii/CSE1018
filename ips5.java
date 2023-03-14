import java.lang.*;
import java.util.*;
public class Main{
     private String gameName;
     private int playerLevel,playerRank;
        
    public Main(String gn){
        gameName=gn;
    }
    public void getPlayerStats(int pl, int pr){
       // this.gameName=gn;
        this.playerLevel=pl;
        this.playerRank=pr;
    }
    public void printStats(String gn,int pl, int pr){
        System.out.println("\nGame: "+gn +"\nPlayer Level: " +pl+"\nGlobal Rank: " +pr);
        
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String gameName=s.nextLine();
        int playerLevel=s.nextInt();
        int playerRank=s.nextInt();
        Main obj1= new Main(gameName);
        obj1.getPlayerStats(playerLevel,playerRank);
        obj1.printStats(gameName,playerLevel,playerRank);
        
    }
}
