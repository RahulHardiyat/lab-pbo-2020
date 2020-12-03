/**
 * ini adalah class Penumpang.
 * Class ini mewakili entitas penumpang bus
 * 
 * 
 * @author (Rahul Hardiyat) 
 * @version (11 November 2020)
 */

public class Penumpang {
    //inisiasi variabel awal
    private String nama;
    private int umur;
    private boolean hamil;
    
    /**
    * Constructor for objects of class Penumpang
    * 
    * @param nama memberi nama penumpang
    * @param umur memberi berapa umur penumpang
    * @param hamil memberi status hamil dari penumpang
    */

    public Penumpang(String nama, int umur, boolean hamil){   
        this.nama = nama;
        this.umur = umur;
        this.hamil = hamil;
    }
    
    /**
     * Sebuah method yang mengembalikan  nama
     * 
     * @return nama 
     */
    public String getNama(){
        return this.nama; 
    }
    
    /**
    * Sebuah method yang mengembalikan umur
    * 
    * @return umur 
    */
    public int getUmur(){
        return this.umur;
    }
    
    /**
    * Sebuah method yang mengembalikan variabel hamil
    * 
    * @return boolean hamil
    */
    public boolean getHamil(){  
       
        return this.hamil;
    }
}
