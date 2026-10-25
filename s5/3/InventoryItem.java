public class InventoryItem {

    // TODO: tambahkan atribut private String name dan Number quantity
    private String name;
    private Number quantity;

    // TODO: konstrukor yang menerima dan menyimpan String name dan Number quantity
    public InventoryItem(String name, Number quantity) {
       this.name = name;
       this.quantity = quantity;
    }

    // TODO: getter public String getName()
    public String getName() {
        return this.name;
    }

    public Number getQuantity() {
	return this.quantity;
    }

    // TODO: getter public Number getQuantity()

    // TODO: public void addQuantity(Number amount) yang menambahkan amount ke quantity. Pastikan jika hasil penjumlahan tidak mampu direpresentasikan Integer, cast ke Long.
    // Hint: tambahkan quantity dalam tipe Long ( gunakan .longValue() ), lalu cast ke Integer jika hasilnya masih ada didalam range Integer.
    public void addQuantity(Number amount) {
        long val = this.quantity.longValue() + amount.longValue();
	if (val > Long.MAX_VALUE) return;
	if (val > Integer.MAX_VALUE) {
             this.quantity = (Long) val;
	     return;
	}
	this.quantity = (Integer) (this.quantity.intValue() + amount.intValue());
    }
}
