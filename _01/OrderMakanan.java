public class OrderMakanan {
  private String name;
  private int count;
  private int harga;

  public void setNamaMakanan(String name) {
      this.name = name;
  }

  public String getNamaMakanan() {return this.name;}

  public void setcountMakanan(int count) {
      this.count = count;
  }

  public int getcountMakanan() {
      return this.count;
  }

  public void setHargaSatuan(int harga) {this.harga = harga;}

  public int getHargaSatuan() { return this.harga;}

  public OrderMakanan(String name, int count, int harga) {
      this.name = name;
      this.count = count;
      this.harga = harga;
  }

  public void increasecountMakanan(int tambahan) {
      if (tambahan <= 0) return;
      this.count += tambahan;
  }

  public void decreasecountMakanan(int pengurangan) {
      if (pengurangan <= 0)return;
      this.count -= pengurangan;
  }

  public int getTotalHarga() {
      return this.count * this.harga;
  }
}
