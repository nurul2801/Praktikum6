package praktikum_6;

public class Main {
    public String namaLengkap;
    public String asalKota;
    public String nomorPonsel;
    
    public Main(String namaLengkap, String asalKota, String nomorPonsel) {
        this.namaLengkap = namaLengkap;
        this.asalKota = asalKota;
        this.nomorPonsel = nomorPonsel;
    }
    
    public String getnamaLengkap()
    {
        return namaLengkap;
    }
    
    public String getasalKota()
    {
        return asalKota;
    }
    
    public String getnomorPonsel()
    {
        return nomorPonsel;
    }
}