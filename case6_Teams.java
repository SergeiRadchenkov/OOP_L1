import java.util.Random;

public class case6_Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;
        System.out.printf("magicianCount: %d priestCount: %d \n", magicianCount, priestCount);
        case6_Priest[] priests = new case6_Priest[priestCount];
        case6_Magician[] magicians = new case6_Magician[magicianCount];
        for (int i = 0; i < priestCount; i++) {
            priests[i] = new case6_Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();
        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new case6_Magician();
            System.out.println(magicians[i].getInfo());
        }
    }
}
