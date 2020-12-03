import java.util.Scanner;

/**
 * ini adalah class Main.
 * Class ini untuk proses naik dan turunnya penumpang dari bus
 * memensimulasikan interaksi kedua class Penumpang dan Bus
 * 
 * 
 * @author (Rahul Hardiyat) 
 * @version (11 November 2020)
 */
public class Main {
   /**
    * method static untuk menampilkan interaksi kedua kelas
    * mensimuasikan secara applicable proses naik dan turunnya penumpang
    */
    
    static void main(){
       
    
      //inisiasi variabel awal
      int index;
      int pilihan = 0;
       //membuat objek bus dan scanner 
      Bus b1 = new Bus();
      Scanner input = new Scanner(System.in);
      //input.close();
      //front end untuk menampilkan menu
      System.out.println("===== BUS TRANS KOETA RADJA =====");
      System.out.println("MENU");
      System.out.println("1. Naikkan Penumpang");
      System.out.println("2. Turunkan Penumpang");
      System.out.println("3. Lihat Penumpang");
      System.out.println("4. exit");
      System.out.print("Pilih nomor: ");
      index = input.nextInt();
      //back end untuk konfigurasi menu
       while(index !=4){   
           switch (index) {
             case 1:
               while(pilihan != 2 ){
                 //menginput parameter kontraktor
                 System.out.print("Masukan nama : ");
                 String nama = input.next(); 
                 System.out.print("Masukan umur: ");
                 int umur = input.nextInt();
                 System.out.print("Hamil [y/n]: "); 
                 Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("Y")?true:false;
                 //membuat objeck penumpang berdasarkan class bus
                 Penumpang penumpang = new Penumpang(nama, umur, hamil);
                 b1.naikPenumpang(penumpang);
                 //menampilkan hasilnya
                 b1.toString();
                 System.out.println("");
                 //ingin menginput ulang atau tidak
                 System.out.print("naikkan lagi? (1.iya 2.tidak) :");
                 pilihan = input.nextInt();
                 System.out.println("============================");
                }
                break;
             case 2: 
                //menginput nama yang ingin diturunkan
                System.out.print("\nMasukan nama yang ingin dihapus: ");
                String nama = input.next();
                b1.turunkanPenumpang(nama);
                //menampilkan hasilnya
                b1.toString();
                System.out.println("============================");
                System.out.println("");
                 break;
             case 3:
                //menampilkan semua hasil
                b1.toString(); 
                System.out.println("============================");
                System.out.println("");
                break;
             case 4:
                //keluar dari simulasi
                System.exit(0);
                break;
                 default:
                    //jika tidak ada pilihan yang tepat
                    System.out.println("Pilihan salah!");
           }
       
            System.out.println("===== BUS TRANS KOETA RADJA =====");
            System.out.println("MENU");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. exit");
            System.out.print("Pilih nomor: ");
            index = input.nextInt();
        
          
       }
  }
    
   /**
    * memimplentasikan konsep oop untuk proses naik dan turunnya penumpang
    * 
    */
  public static void main(String[] args) {
        Penumpang p1 = new Penumpang("ami ", 5, false);
        Penumpang p2 = new Penumpang("ayu ", 15, false);
        Penumpang p3 = new Penumpang("sarna ", 7, false);
        Penumpang p4 = new Penumpang("sari ", 4, false);
        Penumpang p5 = new Penumpang("ani ", 2, false);
        Penumpang p6 = new Penumpang("anta ", 18, false);
        Penumpang p7 = new Penumpang("sewa ", 45, false);
        Penumpang p8 = new Penumpang("sifa ", 1, false);
        Penumpang p9 = new Penumpang("barbara ", 27 ,false );
        
        Bus b1 = new Bus();      
       
        b1.naikPenumpang(p1);
        b1.naikPenumpang(p2); 
        b1.naikPenumpang(p3);
        b1.naikPenumpang(p4);
        b1.naikPenumpang(p5);
        b1.naikPenumpang(p6);
        b1.naikPenumpang(p7);
        b1.naikPenumpang(p8);
        b1.naikPenumpang(p9);
        
        //b1.turunkanPenumpang("ayu ");
        

        b1.getJumlahPenumpangBiasa();
        b1.getJumlahPenumpangPrioritas();
        
        b1.getPenumpangPrioritas();
        //b1.semuaPenumpang();
        
        
        b1.toString();
    }
    
}