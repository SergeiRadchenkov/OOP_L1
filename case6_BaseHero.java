import java.util.Random;

public class case6_BaseHero {
    protected static int number;
    protected static Random r;
    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        case6_BaseHero.number = 0;
        case6_BaseHero.r = new Random();
    }
 
    public case6_BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public case6_BaseHero() {
        this(String.format("Hero_Priest #%d", ++case6_BaseHero.number),
        case6_BaseHero.r.nextInt(100, 200));
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
}
