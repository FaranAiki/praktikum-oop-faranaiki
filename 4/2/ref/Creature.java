// Berkas pendukung: jangan diubah atau dikumpulkan.
public class Creature {
    private String name;
    private int stamina;

    public Creature(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() { return name; }
    public int getStamina() { return stamina; }

    // amount dijamin nonnegatif; pengurangan dibatasi hingga stamina 0.
    protected void consumeStamina(int amount) {
        stamina = Math.max(0, stamina - amount);
    }
}
