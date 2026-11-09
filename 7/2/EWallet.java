public class EWallet {
    // TODO: Buat method public static void validateAmount(double amount)
    // Jangan menulis throws pada signature.
    // Jika amount <= 0, lempar InvalidAmountException dengan pesan "Jumlah transfer harus lebih dari 0".
    public static void validateAmount(double amount) {
        if (amount <= 0) throw new InvalidAmountException("Jumlah transfer harus lebih dari 0");
    }

    // TODO: Buat method public static void transfer(String amountInput, double balance) throws TransferFailedException
    // Di dalam try, parse amountInput menjadi double dengan Double.parseDouble.
    // Jika hasil parse lebih besar dari balance, lempar TransferFailedException
    // dengan pesan "Saldo tidak mencukupi" dan cause null.
    // catch (NumberFormatException e): lempar TransferFailedException
    // dengan pesan "Jumlah transfer tidak valid" dan e sebagai cause.
    // Jika hasil parse berhasil dan amount <= balance, method selesai tanpa melempar exception.
    // Method ini tidak memanggil validateAmount.
    public static void transfer(String amountInput, double balance) throws TransferFailedException {
        try {
            double pal = Double.parseDouble(amountInput);
            if (pal > balance) throw new TransferFailedException("Saldo tidak mencukupi", null);
        } catch (NumberFormatException e) {
            throw new TransferFailedException("Jumlah transfer tidak valid", e);
        }
    }
}