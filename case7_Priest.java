public class case7_Priest extends case7_BaseHero {
    private int elixir;
    private int maxElixir;

    public case7_Priest() {
        super(String.format("Hero_Priest #%d", ++case7_Magician.number),
                case7_Magician.r.nextInt(100, 200));
        this.maxElixir = case7_Magician.r.nextInt(50, 150);
        this.elixir = maxElixir;
    }
    
    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
