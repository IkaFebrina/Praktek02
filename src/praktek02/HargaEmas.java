package praktek02;
public class HargaEmas {
    double Berat_Emas;
    double Harga_Per_Gram;

    public HargaEmas() {
        Berat_Emas=3.2;
        Harga_Per_Gram=210000;
    }

    public HargaEmas(double Berat_Emas, double Harga_Per_Gram) {
        this.Berat_Emas = Berat_Emas;
        this.Harga_Per_Gram = Harga_Per_Gram;
    }
    
    
    
    void cetakInfo(){
        System.out.println("==================================");
        System.out.println("Berat_Emas      :"+Berat_Emas);
        System.out.println("Harga_Per_Gram  :"+Harga_Per_Gram);
        System.out.println("==================================");
    }
    
    double HitungHarga(){
        double Harga;
        Harga=Berat_Emas*Harga_Per_Gram;
        return Harga;
    }
    
    void CetakHarga(){
        System.out.println("Harganya adalah : "+HitungHarga());
    }
}
