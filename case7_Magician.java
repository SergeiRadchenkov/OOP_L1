public class case7_Magician extends case7_BaseHero {
    private int mana;
    private int maxMana;

    public case7_Magician() {
        super(String.format("Hero_Magician #%d", ++case7_Magician.number),
                case7_Magician.r.nextInt(100, 200));
        this.maxMana = case7_Magician.r.nextInt(50, 150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d",super.getInfo(), this.mana);
    }
}
