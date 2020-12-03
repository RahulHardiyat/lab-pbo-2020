import java.util.ArrayList;
import java.util.*;



public class Bus {
    ArrayList<Penumpang> penumpangBiasa1;
    ArrayList<Penumpang> penumpangPrioritas;
    ArrayList<Penumpang> semuaPenumpang;
    
    Scanner input = new Scanner(System.in);
   
    public Bus(){

       penumpangBiasa1 =  new ArrayList<Penumpang>();
       penumpangPrioritas =  new ArrayList<Penumpang>();
       semuaPenumpang = new ArrayList<Penumpang>();
    }
      

    public ArrayList<Penumpang> getPenumpangBiasa(){ 
        
        for(Penumpang penumpang:penumpangBiasa1)
        {
            penumpang.getNama();
           }
        return penumpangBiasa1;
    }

    public ArrayList<Penumpang> getPenumpangPrioritas()
    {    
        
        for(Penumpang penumpang : penumpangPrioritas)
        {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa(){
        System.out.print("\n");
        int jumlahB = penumpangBiasa1.size();
        System.out.println("jumlah penumpang biasa : " +jumlahB);
        return jumlahB;
    }
    
    public int getJumlahPenumpangPrioritas(){
        int jumlahP = penumpangPrioritas.size();
        System.out.println("jumlah penumpang prioritas : " +jumlahP);
        return jumlahP;
    }
    
    public int getJumlAllpenumpang(){
        return penumpangBiasa1.size() + penumpangPrioritas.size();
    }

    public boolean naikPenumpang (Penumpang penumpang){
        int b=5, p=1;
        if((penumpangPrioritas.size() < p ) && (penumpang.getUmur()<10 || penumpang.getUmur() > 60) || (penumpang.getHamil()==true)){
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
    
    public boolean turunkanPenumpang(String nama){
       
        for (int i = 0; i < penumpangBiasa1.size(); i ++) {  
           if(nama.equals(penumpangBiasa1.get(i).getNama())){
              penumpangBiasa1.remove(i);
              System.out.println("penumpang bernama "+nama+" telah diturunkan11!");
             return penumpangBiasa1.equals(nama);
           } 
        }
           
        for (int i = 0; i < penumpangPrioritas.size(); i ++) {  
            if(nama.equals(penumpangPrioritas.get(i).getNama())){
              penumpangPrioritas.remove(i);
              System.out.println("penumpang bernama "+nama+" telah diturunkan22");
             return penumpangPrioritas.equals(nama);
            }
        }
        
        for (int i = 0; i < semuaPenumpang.size(); i ++) {  
           if(( nama !=(penumpangPrioritas.get(i).getNama()) || (nama != penumpangBiasa1.get(i).getNama()))){
                System.out.println("Tidak Ada penumpang yang dimaksudkan"); 
               return false;
           }
       } 
       return penumpangPrioritas.equals(nama);
    }

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
