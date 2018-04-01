package praktek02;
public class HargaEmasAksi {
    public static void main(String[] args) {
        HargaEmas ana = new HargaEmas();
        HargaEmas ani = new HargaEmas();
        HargaEmas anu = new HargaEmas();
        
        ana.Berat_Emas = 2.4;
        ana.Harga_Per_Gram = 210000;
        
        ani.Berat_Emas = 1.2;
        ani.Harga_Per_Gram = 210000;
        
        anu.Berat_Emas = 4.3;
        anu.Harga_Per_Gram = 210000;
        
        ana.cetakInfo();
        ani.cetakInfo();
        anu.cetakInfo();
    }
}
