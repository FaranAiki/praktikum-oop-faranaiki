public class InventoryAdapter {

    // TODO: implementasi public static InventoryItem parse(String raw) yang merubah string mentah "nama:quantity" menjadi objek kembalian InventoryItem
    // Gunakan method bawaan String untuk membantu, seperti .trim() untuk menghilangkan whiteospace di luar kata terluar dalam string.
    // Pastikan tipe quantity adalah Integer jika masih didalam range value Integer. Gunakan Long jika Integer tidak cukup.
    // Asumsi input raw PASTI mengikuti format "nama:quantity" (dengan kemungkinan whitespace).
    public static InventoryItem parse(String raw) {
	String pecah[] = raw.trim().split(":");
	String name = pecah[0].trim();
	long val = Long.parseLong(pecah[1].trim());
	if (val > Integer.MAX_VALUE) {
            return new InventoryItem(name, (Long) val);
	} else {
	    return new InventoryItem(name, (Integer) Integer.parseInt(pecah[1].trim()));
	}
    }
}
