import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class case7_Program {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = 0;
        int priestCount = 0;
 

        List<case7_BaseHero> teams = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            if (rand.nextInt(2) == 0) {
                teams.add(new case7_Priest());
                priestCount++;
            }
            else{
                teams.add(new case7_Magician());
                magicianCount++;
            }

            System.out.println(teams.get(i).getInfo());
        }
        System.out.println();
        System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);
    }
}
