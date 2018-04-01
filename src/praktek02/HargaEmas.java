package praktek02;
public class HargaEmas {
    double Berat_Emas;
    double Harga_Per_Gram;
    
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
}
