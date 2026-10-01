// TODO: Extend ArcadeCharacter
public class Fighter extends ArcadeCharacter {
    // TODO: Deklarasikan private int comboMultiplier
    private int comboMultiplier;

    // TODO: Buat constructor (Panggil super).
    // Jika comboMultiplier < 1, set menjadi 1.
    public Fighter(String name, int hp, int comboMultiplier) {
      super(name, hp);
      this.comboMultiplier = Math.max(1, comboMultiplier);
    }

    // TODO: Override method calculateDamage(int basePower).
    // Hitung (basePower * comboMultiplier).
    // Jika hp karakter ini <= 20, tambahkan 50 ke hasil akhir. Return nilainya.
    @Override
    public int calculateDamage(int basePower) {
      int t = basePower * comboMultiplier;
      return hp <= 20 ? t + 50 : t;
    }
}
