public class InventoryCounter {

    // TODO: atribut private InventoryItem[] items dan int count
    private InventoryItem[] items;
    private int count;

    // TODO: konstruktor InventoryCounter yang menerima int capacity, dan menginisiasi kapasitas items, serta set nilai count ke 0
    public InventoryCounter(int capacity) {
        this.items = new InventoryItem[capacity];
	this.count = 0;
    }

    // TODO: public boolean addItem(String raw) yang menambahkan item string mentah ke items.
    // Gunakan InventoryAdapter untuk parsing input mentah.
    // Pastikan penambahan item dengan nama yang sama hanya mengubah nilai item yang sudah ada di items.
    // Kembalikan true jika penambahan berhasil, false jika gagal karena inventory penuh
       public boolean addItem(String raw) {
	   for (int i = 0; i < count; i++) {
               if (items[i].getName().equals(InventoryAdapter.parse(raw).getName())) {
		  this.items[i].addQuantity(InventoryAdapter.parse(raw).getQuantity());
	          return true;
	       }
	   }
           if (count >= items.length) return false;
	   this.items[count] = InventoryAdapter.parse(raw);
	   this.count++;
	   return true;
       }

    // TODO: public Number getQuantity(String name) yang mengembalikan nilai quntity dari InventoryItem di items dengan nama = name
    // Asumsi input name valid dan merujuk ke item yang valid
	public Number getQuantity(String name) {
	   for (InventoryItem it: this.items) {
		if (it == null) break; // sebenarnya udah diasumsiin valid sih
		if (it.getName().equals(name.trim())) return it.getQuantity();
	   }
	   return null;
	}

    // TODO: getter public int getItemCount()
       public int getItemCount() {
           return this.count;
       }

}
