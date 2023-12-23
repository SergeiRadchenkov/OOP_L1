import java.util.Random;

public class case7_BaseHero {
    protected static int number;
    protected static Random r;
    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        case7_BaseHero.number = 0;
        case7_BaseHero.r = new Random();
    }

    public case7_BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public case7_BaseHero() {
        this(String.format("Hero_Priest #%d", ++case7_BaseHero.number),
                case7_BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }

    public void Attack(case7_BaseHero target) {
        int damage = case7_BaseHero.r.nextInt(10, 20);
        target.GetDamage(damage);
    }
}
