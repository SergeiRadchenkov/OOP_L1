public class case6_Priest extends case6_BaseHero{
    private int elixir;
    private int maxElixir;

    public case6_Priest() {
        super(String.format("Hero_Priest #%d", ++case6_Magician.number),
                case6_Magician.r.nextInt(100, 200));
        this.maxElixir = case6_Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }

    public int Attack() {
        int damage = case6_BaseHero.r.nextInt(20, 30);
        this.elixir -= (int) (damage * 0.8);
        if (elixir < 0)
            return 0;
        else
            return damage;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
