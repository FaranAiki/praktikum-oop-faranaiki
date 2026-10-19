public class MemoryTube {
    // TODO: Deklarasikan atribut id dan content dengan tipe String dan modifier private
    private String id, content;

    // TODO: Buat constructor untuk menginisialisasi id dan content
    public MemoryTube(String id, String content) {
      this.id = id;
      this.content = content;
    }

    // TODO: Buat getter untuk id dan content
    public String getId() {
      return this.id;
    }

    public String getContent() {
      return this.content;
    }

    // TODO: Buat method getSignature() yang mereturn String gabungan id dan content dipisah " - " menggunakan method concat()
    // Contoh: id "123", content "abc" -> "123 - abc"
    public String getSignature() {
      return String.format("%s - %s", id, content);
    }


    // TODO: Buat method scramble() tanpa parameter dan return type void
    // Method ini mengubah isi dari atribut content menjadi kebalikannya menggunakan StringBuilder dan method reverse()
    public void scramble() {
      this.content = new StringBuilder(this.content).reverse().toString();
    }
}
