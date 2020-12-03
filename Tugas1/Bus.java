import java.util.ArrayList;

/**
 * ini adalah class Bus.
 * Class ini mewakili class Bus untuk menampung entitas penumpang
 * 
 * 
 * @author (Rahul Hardiyat) 
 * @version (11 November 2020)
 */
public class Bus {
    //inisialsi variabel awal
    ArrayList<Penumpang> penumpangBiasa1;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;
    
    /**
    * konstrukto dari kelas obejek
    * 
    * penumpangBiasa1 menampung lokasi penumpang biasa
    * penumpangPrioritas menampung lokasi penumpang proritas
    * semuaPenumpang menampung semua lokasi entitas dari class Penumpang
    */
    public Bus(){
       penumpangBiasa1 =  new ArrayList<Penumpang>();
       penumpangPrioritas =  new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      
    /**
     * Sebuah method yang mengembalikan list penumpang biasa yang diminta.
     * 
     * @return penumpangBiasa1 
     */
    public ArrayList<Penumpang> getPenumpangBiasa(){ 
        for(Penumpang penumpang:penumpangBiasa1)
        {
            penumpang.getNama();
        }
        return penumpangBiasa1;
    }

    /**
     * Sebuah method yang mengembalikan list penumpang prioritas yang diminta.
     * 
     * @return penumpangPrioritas 
     */
    public ArrayList<Penumpang> getPenumpangPrioritas()
    {    
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    /**
    * Sebuah method yang mengembalikan jumlah penumpang biasa yang diminta.
    * 
    * @return jumlaB 
    */
    public int getJumlahPenumpangBiasa(){
        System.out.print("\n");
        int jumlahB = penumpangBiasa1.size();
        System.out.println("jumlah penumpang biasa : " +jumlahB);
        return jumlahB;
    }
    
     /**
    * Mengembalikan jumlah penumpang prioritas yang diminta.
    * 
    * @return jumlaP 
    */
    public int getJumlahPenumpangPrioritas(){
        int jumlahP = penumpangPrioritas.size();
        System.out.println("jumlah penumpang prioritas : " +jumlahP);
        return jumlahP;
    }
    
    /**
    *Mengembalikan jumlah semua penumpang pada class ini.
    * 
    * @return jumlah dari penumpang biasa + penumpang prioritas 
    */
    public int getJumlAllpenumpang(){
        return penumpangBiasa1.size() + penumpangPrioritas.size();
    }
    
    /**
    * Memeriksa dan menambahkan penumpang sekaligus mengelompokkan penumpang.
    * 
    * @return true kalau penumpang berhasil ditambahkan dan false jika tidak 
    */
    public boolean naikPenumpang (Penumpang penumpang){
        //inisiasi jumlah maksimal penumpang prioritas dan biasa
        int b=4, p=2;
        //membuat syarat pengelompokkan penumang berdasarkan entitas penumpang
        if((penumpangPrioritas.size() < p ) && ((penumpang.getUmur()<10 || penumpang.getUmur() > 60) || (penumpang.getHamil()==true))){
            System.out.println("Penumpang prioritas bernama "+penumpang.getNama()+" <BERHASIL> ditambahkan!");
            return penumpangPrioritas.add(penumpang);
        }
        else if(penumpangBiasa1.size() < b ){
            System.out.println("Penumpang biasa bernama "+penumpang.getNama()+" <BERHASIL> ditambahkan!");
            return penumpangBiasa1.add(penumpang); 
        } else{
            System.out.print("Penumpang bernama " +penumpang.getNama()+ "<GAGAL> ditambahkan!");
            System.out.println("<Tidak Ada Kursi Kosong!>");
            System.out.println("");
            return false;
        } 
    }
    
    /**
    * Memeriksa nama penumpang sekaligus menurunkannya.
    * 
    * @return true kalau penumpang berhasil diturunkan dan false jika tidak 
    */
    public boolean turunkanPenumpang(String nama){
       // memerika nama penumpang biasa dan menurunkannya dengan mengembalikan nilai true
       for (int i = 0; i < penumpangBiasa1.size(); i ++) {  
          if(nama.equals(penumpangBiasa1.get(i).getNama())){
             penumpangBiasa1.remove(i);
             System.out.println("penumpang bernama "+nama+" telah diturunkan11!");
             return true;
          } 
       }
       // memerika nama penumpang prioritas dan menurunkannya dengan mengembalikan nilai true
       for (int i = 0; i < penumpangPrioritas.size(); i ++) {  
           if(nama.equals(penumpangPrioritas.get(i).getNama())){
             penumpangPrioritas.remove(i);
             System.out.println("penumpang bernama "+nama+" telah diturunkan22");
             return true;
           }
        }
       // memerika nama penumpang prioritas dan biasa jika tidak ada yang sama mengembalikan false
        for (int i = 0; i < semuaPenumpang.size(); i ++) {  
           if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa1.get(i).getNama()))){
                System.out.println("Tidak Ada penumpang yang dimaksudkan"); 
               return false;
           }
       } 
       return true;
    }
    
    /**
    * Menggabungkan semua penumpang .
    * 
    * @return semua penumpang 
    */
    public ArrayList<Penumpang> semuaPenumpang()
    { 
        semuaPenumpang = penumpangBiasa1;
        semuaPenumpang.addAll(penumpangPrioritas);
        System.out.print("semua penumpang : ");
        for(Penumpang penumpang : semuaPenumpang)
        {
            System.out.print(penumpang.getNama()+ ", ");
        }

        return semuaPenumpang;
    }
    
    /**
    * mencetak jumlah penumpang biasa
    * mencetak jumlah penumpang prioritas
    * menxetak jumlah semua penumpang.
    * 
    * @return result1,result2 dan jumlah jumlahB+jumlahP 
    */
    public String toString(){
           String result1 = " ";
           String result2 = " ";
           
           System.out.println("");
           
           for(Penumpang penumpang : penumpangBiasa1) {
               result1 += penumpang.getNama().toString(); 
            }
            
           for(Penumpang penumpang : penumpangPrioritas) {
               result2 += penumpang.getNama().toString();
 
            }
            
            if(penumpangBiasa1.isEmpty() == true ){  
              System.out.println("daftar nama penumpang Biasa = <kosong>") ;
          }else{
              System.out.println("daftar nama penumpang biasa = " +result1);
          }
            
          if(penumpangPrioritas.isEmpty() == true ){  
              System.out.println("daftar nama penumpang prioritas = <kosong>") ;
          }else{
              System.out.println("daftar nama penumpang prioritas = " +result2);
          }
          
            System.out.println("jumlah semua penumpang = " +getJumlAllpenumpang());
           
        return "daftar1 nama penumpang biasa = "+result1+"daftar1 nama penumpang prioritas = "+result2+"jumlah1 semua penumpang = "+getJumlAllpenumpang()+"\n";
    }
}
