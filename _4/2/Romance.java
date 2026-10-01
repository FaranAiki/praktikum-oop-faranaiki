// TODO: Extend ArcadeCharacter
public class Romance extends ArcadeCharacter {
    // TODO: Deklarasikan private int jealousyLevel
    private int jealousyLevel;

    // TODO: Buat constructor
    // jealousyLevel harus dibatasi antara 0 sampai 10 (inklusif).
    public Romance(String name, int hp, int jealousyLevel) {
      super(name, hp);
      this.jealousyLevel=Math.max(0, Math.min(jealousyLevel, 10));
    }

    // TODO: Override method calculateDamage(int basePower).
    // Jika jealousyLevel == 10, tambahkan 20 ke hp (hp maksimal 100).
    // return (basePower + (jealousyLevel * 15)).
    @Override
    public int calculateDamage(int basePower) {
      hp = Math.min(100, hp + (jealousyLevel == 10 ? 20 : 0));
      return (basePower + (jealousyLevel * 15));
    }
}
