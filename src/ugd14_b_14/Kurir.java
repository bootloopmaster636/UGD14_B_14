/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd14_b_14;

/**
 *
 * @author Yohanes Alvian Wijaya Irawan
 */
public class Kurir {
    private String nama, id_kurir;
    private double gaji_pokok;

    public Kurir(String nama, String id_kurir, double gaji_pokok) {
        if(nama.isEmpty())
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        if(id_kurir.length()!=6 || !id_kurir.startsWith("KU"))
            throw new IllegalArgumentException("id_kurir harus 6 digit dan diawali dengan KUXXXX(Contoh KU1234");
        if(gaji_pokok<0)
            throw new IllegalArgumentException("Gaji tidak boleh kurang dari 0");
        else{
            this.nama = nama;
            this.id_kurir = id_kurir;
            this.gaji_pokok = gaji_pokok;
        } 
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    
    
    public void hitungTotalGaji(double tunjangan){
        //NPM 1 (210711011)
        //NPM 2 (210711047)
        if(tunjangan<0)
            throw new IllegalArgumentException("Tunjangan tidak boleh kurang dari 0");
        else
            gaji_pokok += hitungBonus(10, 10_000) + tunjangan - hitungPajak(17);
            
    }
    
    public double hitungPajak(double presentase){
        if(presentase<0)
            throw new IllegalArgumentException("Presentase tidak boleh kurang dari 0");
        else
            return gaji_pokok*presentase/100;
        
    }
    
    public double hitungBonus(double jumlahPaket, double biayaPerPaket){
        if(jumlahPaket<0)
            throw new IllegalArgumentException("Jumlah paket tidak boleh kurang dari 0");
        if(biayaPerPaket<0)
            throw new IllegalArgumentException("Biaya per paket tidak boleh kurang dari 0");
        else
            return jumlahPaket*biayaPerPaket*0.1;
    }
    
    public String tampil()
    {   
        return "Kurir dengan "+nama+" id kurir "+id_kurir+" memiliki Gaji " + gaji_pokok;
    }
    
    
}
