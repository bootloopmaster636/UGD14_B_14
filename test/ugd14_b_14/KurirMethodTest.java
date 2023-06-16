/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ugd14_b_14;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yohanes Alvian Wijaya Irawan
 */
public class KurirMethodTest {
    
    public KurirMethodTest() {
    }

    @Test
    public void testHitungTotalGaji(){
        int gajiSebeleum = 50_000;
        double tunjangan = -1;
        double expResult = 61500.0;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        k.hitungTotalGaji(tunjangan);
        
        assertFalse(k.getGaji_pokok()!=expResult);
    }
    
    @Test
    public void testHitungTotalGaji2(){
        int gajiSebeleum = 50_000;
        double tunjangan = 10_000;
        double expResult = 61500.0;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        k.hitungTotalGaji(tunjangan);
        
        assertFalse(k.getGaji_pokok()!=expResult);
    }
    
    @Test
    public void testHitungPajak(){
        int gajiSebeleum = 50_000;
        double presentase = -1;
        double expResult = -500;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        
        assertTrue(k.hitungPajak(presentase) == expResult);
    }
    
    @Test
    public void testHitungPajak2(){
        int gajiSebeleum = 50_000;
        double presentase = 10;
        double expResult = 5_000;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        
        assertTrue(k.hitungPajak(presentase) == expResult);
    }
    
    @Test
    public void testHitungBonus(){
        int gajiSebeleum = 50_000;
        int jumlahPaket = 5;
        double biayaPerPaket = -5000;
        double expResult = -2_501;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        
        
        assertFalse(k.hitungBonus(jumlahPaket, biayaPerPaket) == expResult);
    }
    
    @Test
    public void testHitungBonus2(){
        int gajiSebeleum = 50_000;
        int jumlahPaket = -5;
        double biayaPerPaket = 5000;
        double expResult = -2_501;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        
        
        assertFalse(k.hitungBonus(jumlahPaket, biayaPerPaket) == expResult);
    }
    
    @Test
    public void testHitungBonus3(){
        int gajiSebeleum = 50_000;
        int jumlahPaket = 5;
        double biayaPerPaket = 5000;
        double expResult = 2_500;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebeleum);
        double bonus = k.hitungBonus(jumlahPaket, biayaPerPaket);
        
        assertEquals(bonus, expResult, 0.0);
    }
    
    @Test
    public void testTampil(){
        String expResult = "Kurir dengan Anton id kurir KU1234 memiliki Gaji 50000.0";
        double gajiSebelum = 50_000;
        Kurir k = new Kurir("Anton", "KU1234", gajiSebelum);
        assertEquals(expResult, k.tampil());
    }
    
}
