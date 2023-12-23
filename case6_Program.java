public class case6_Program {
    public static void main(String[] args) {
        case6_Magician hero1 = new case6_Magician();
        System.out.println(hero1.getInfo());
        
        case6_Priest hero2 = new case6_Priest();
        System.out.println(hero2.getInfo());

        case6_Priest hero3 = new case6_Priest();
        System.out.println(hero3.getInfo());

        hero3.GetDamage(hero2.Attack());
        hero3.GetDamage(hero3.Attack());
        System.out.println(hero3.getInfo());
        System.out.println(hero2.getInfo());
    }
}
