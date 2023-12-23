import java.util.Random;

public class case5 {
    private static int number;
    private static Random r;
    private String name;
    private int hp;
    private int maxHp;
    private int mana;
    private int maxMana;

    static {
        case5.number = 0;
        case5.r = new Random();
    }

    public case5(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this.maxMana = mana;
    }

    public case5() {
        this(String.format("Hero_Magician #%d", ++case5.number),
                case5.r.nextInt(100, 200),
                case5.r.nextInt(50, 150));
    }

    public int Attack() {
        int damage = case5.r.nextInt(20, 30);
        this.mana = (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Energy: %d Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }
}
