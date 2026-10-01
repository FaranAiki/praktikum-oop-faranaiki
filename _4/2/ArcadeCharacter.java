// TODO: Buat class abstract ArcadeCharacter
public abstract class ArcadeCharacter {
    // TODO: Deklarasikan name (String) dan hp (int) sebagai protected
    protected String name;
    protected int hp;

    // TODO: Buat constructor.
    // Jika hp input < 1, ubah jadi 1. Jika hp input > 100, ubah jadi 100.
    public ArcadeCharacter(String name, int hp) {
      this.hp = Math.min(Math.max(hp, 1), 100);
      this.name = name;
    }

    // TODO: Buat getter untuk getName dan getHp
    public String getName() {return name;}
    public int getHp() {return hp;}

    // TODO: Buat method boolean isAlive(). Return true jika hp lebih dari 0.
    public boolean isAlive() {
      return hp > 0;
    }

    // TODO: Buat method void takeDamage(int damage).
    // Pastikan damage > 0 sebelum mengurangi hp. Jika hp menjadi minus, set hp ke 0.
    public void takeDamage(int damage) {
      if (damage <= 0) return;
      hp = Math.max(0, hp - damage);
    }

    // TODO: Buat method abstract int calculateDamage(int basePower).
    public abstract int calculateDamage(int basePower);
}
