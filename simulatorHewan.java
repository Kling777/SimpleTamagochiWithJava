import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class coreSimulator {
    private int hp ;
    private int str ;
    private int exp ;
    private int stress;

    public void setKura(int hp,int str,int exp,int stress){
        this.hp = hp;
        this.str = str;
        this.exp = exp;
        this.stress = stress;
    }

    public int getHP(){
        return hp;
    }
    public int getSTR(){
        return str;
    }
    public int getEXP(){
        return exp;
    }
    public int getSTRES(){
        return stress;
    }
    }


public class simulatorHewan {
    public static void main(String[] args) {
        //pemanggilan class coreSimulator dan set data kura-kura
        coreSimulator ipt = new coreSimulator();
        ipt.setKura(50, 100, 20, 0);

        //tipe data dan variabel
        String opsi[] = {"makan","jalan-jalan","gelud","kerja","tidur","info","quit"};
        String opsiHewan[] = {"kura-kura","rubah"};
        boolean i = true;
        boolean kunciGAME = false;
        int hari = 1 ; 
        String Nama = "";
        int konfirm;
        int konfirm2;
        String hewan = null;
        //hp = kesehatan
        //str = energi
        //exp = uang
        //stres = stres

        ImageIcon intro = new ImageIcon(simulatorHewan.class.getResource("aset/gweh.jpg"));
        ImageIcon gmbrHewan = null;
        ImageIcon Eat = null;
        ImageIcon jalan2 = null;
        ImageIcon gelud = null;
        ImageIcon sayan = null;
        ImageIcon turu = null;
        ImageIcon mati = null;
        ImageIcon sakit = null;
        ImageIcon miskin = null;
        ImageIcon gila = null;
        ImageIcon sukses = null;
       

        //output selamat datang 
        JOptionPane.showMessageDialog(null, "u9807652134 \nMEMPERSEMBAHKAN", null,JOptionPane.PLAIN_MESSAGE,intro);
        JOptionPane.showMessageDialog(null, "SIMULATOR HEWAN :D :D :D :D :D",null,JOptionPane.PLAIN_MESSAGE);

        //pemilihan hewan
        int pilihanHewan = JOptionPane.showOptionDialog(null, "silakan pilih hewan", null,0, JOptionPane.PLAIN_MESSAGE, null, opsiHewan, null);
        switch(pilihanHewan){
            //kura kura
           case 0 :
           gmbrHewan = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/turtle48.png"));
           Eat = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/turtleEat.png"));
           jalan2 = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/jalan2.png"));
           gelud = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/gelud.png"));
           sayan = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/kerja.png"));
           turu = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/turu.gif"));
           mati = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/kubur.png"));
           sakit = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/sakit.png"));
           miskin = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/kismin.png"));
           gila = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/evil.png"));
           sukses = new ImageIcon(simulatorHewan.class.getResource("aset/trtl/turtleDrip.jpg"));
           hewan = "KURA-KURA";
           break;
           //rubah
           case 1 :
           gmbrHewan = new ImageIcon(simulatorHewan.class.getResource("aset/fox/foxy.png"));
           Eat = new ImageIcon(simulatorHewan.class.getResource("aset/fox/makan.jpg"));
           jalan2 = new ImageIcon(simulatorHewan.class.getResource("aset/fox/jalan.jpg"));
           gelud = new ImageIcon(simulatorHewan.class.getResource("aset/fox/gel.jpg"));
           sayan = new ImageIcon(simulatorHewan.class.getResource("aset/fox/kerja2.png"));
           turu = new ImageIcon(simulatorHewan.class.getResource("aset/fox/turu.png"));
           mati = new ImageIcon(simulatorHewan.class.getResource("aset/fox/mati.png"));
           sakit = new ImageIcon(simulatorHewan.class.getResource("aset/fox/sakit.jpg"));
           miskin = new ImageIcon(simulatorHewan.class.getResource("aset/fox/miskin.png"));
           gila = new ImageIcon(simulatorHewan.class.getResource("aset/fox/gila.png"));
           sukses = new ImageIcon(simulatorHewan.class.getResource("aset/fox/sukses.jpg"));
           hewan = "RUBAH";
           break;
        }

        //perulangan isi nama
        //hanya akan berhenti jika nama tidak null dan tidak kosong
        while(Nama != null && Nama.isEmpty()){
            //pemberian nama kuro
            Nama = JOptionPane.showInputDialog(null, "beri nama "+hewan, null, JOptionPane.INFORMATION_MESSAGE);
            if(Nama != null && Nama.isEmpty()){
                //menyuruh masukan nama jika nama kosong
                JOptionPane.showMessageDialog(null,"TOLONG MASUKAN NAMA APAPUN",null,JOptionPane.PLAIN_MESSAGE);
           }else if(Nama != null && !Nama.isEmpty()){
            //jika nama tidak null dan tidak kosong buat kunciGame jadi true
            kunciGAME = true;   
           }else if(Nama == null){
              //jika nama null program akan bertanya berhenti atau tidak
                konfirm2 = JOptionPane.showConfirmDialog(null, "apa anda yakin ingin menghentikan program?", null, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(konfirm2 == 0){
             //kalau pilih iya, program akan berhenti
                JOptionPane.showMessageDialog(null, "PROGRAM BERHENTI",null,JOptionPane.PLAIN_MESSAGE);
                }else{
             //kalau pilih tidak, nama akan diganti ""(empty) dan akan kembali ke perulangan isi nama
                Nama = "";
            }
        }
    }
           
           if(kunciGAME){
               //game hanya akan berjalan jika kunciGAME menjadi true
           
               //perulangan dalam game
               do{
                
               //output statistik
               int pilihan = JOptionPane.showOptionDialog(null, "===STATISTIK "+Nama+"=== (tekan info untuk cara bermain) \nKESEHATAN: "+ipt.getHP()+"\nENERGI: "+ipt.getSTR()+"\nUANG: "+ipt.getEXP()+"\nSTRES: "+ipt.getSTRES(),
                "KEGIATAN HARI KE-"+hari, 0, JOptionPane.PLAIN_MESSAGE, gmbrHewan, opsi, null);
   
                //pilihan kegiatan dan setelah di tekan akan menambahkan statistik dan hari 
               switch(pilihan){
                   //makan
                   case 0 :
                   JOptionPane.showMessageDialog(null, Nama+" makan dan menambah statistik \nKESEHATAN = "+ipt.getHP()+" + 5\nENERGI = "+ipt.getSTR()+" + 10\nUANG = "+ipt.getEXP()+" - 15\nSTRES = "+ipt.getSTRES()+" + 0", null, 0,Eat);
                   ipt.setKura(ipt.getHP()+5, ipt.getSTR()+10, ipt.getEXP()-15,ipt.getSTRES());
                   hari++;
                   break;
                   //jalan
                   case 1 :
                   JOptionPane.showMessageDialog(null, Nama+" jalan jalan di taman dan menambah statistik \nKESEHATAN = "+ipt.getHP()+" + 5\nENERGI = "+ipt.getSTR()+" - 10\nUANG = "+ipt.getEXP()+" + 0\nSTRES = "+ipt.getSTRES()+" - 15", null, 0,jalan2);
                   ipt.setKura(ipt.getHP()+5, ipt.getSTR()-10, ipt.getEXP(),ipt.getSTRES()-15);
                   hari++;
                   break;
                   //gelud
                   case 2 :
                   JOptionPane.showMessageDialog(null, Nama+" bertarung dan menambah statistik \nKESEHATAN = "+ipt.getHP()+" - 10\nENERGI = "+ipt.getSTR()+" - 15\nUANG = "+ipt.getEXP()+" + 40\nSTRES = "+ipt.getSTRES()+" + 20", null, 0,gelud);
                   ipt.setKura(ipt.getHP()-10, ipt.getSTR()-15, ipt.getEXP()+40,ipt.getSTRES()+20);
                   hari++;
                   break;
                   //kerja
                   case 3 :
                   JOptionPane.showMessageDialog(null, Nama+" berkerja dan menambah statistik \nKESEHATAN = "+ipt.getHP()+" - 5\nENERGI = "+ipt.getSTR()+" - 10\nUANG = "+ipt.getEXP()+" + 20\nSTRES = "+ipt.getSTRES()+" + 10", null, 0,sayan);
                   ipt.setKura(ipt.getHP()-5, ipt.getSTR()-10, ipt.getEXP()+20,ipt.getSTRES()+10);
                   hari++;
                   break;
                   //tidur
                   case 4 :
                   JOptionPane.showMessageDialog(null, Nama+" tidur seharian dan menambah statistik \nKESEHATAN = "+ipt.getHP()+" + 5\nENERGI = "+ipt.getSTR()+" + 5\nUANG = "+ipt.getEXP()+" + 0\nSTRES = "+ipt.getSTRES()+" + 5", null, 0,turu);
                   ipt.setKura(ipt.getHP()+5, ipt.getSTR()+5, ipt.getEXP(),ipt.getSTRES()+5);
                   hari++;
                   break;
                   //info
                   case 5 :
                   JOptionPane.showMessageDialog(null, "CARA MAIN? MUDAH!\njangan sampai KESEHATAN,ENERGI,UANG jadi 0\nSTRES naik sampai 100 \ndan capailah UANG sebanyak 500\ndengan pilihan: \n1) makan: \nKESEHATAN = +5\nENERGI = +10\nUANG = -15\nSTRES = +0\n2) jalan: \nKESEHATAN = +5\nENERGI = -10\nUANG = +0\nSTRES = -15\n3) gelud: \nKESEHATAN = -10\nENERGI = -15\nUANG = +40\nSTRES = +20\n4) kerja: \nKESEHATAN = -5\nENERGI = -10\nUANG = +20\nSTRES = -10\n5) tidur: \nKESEHATAN = +5\nENERGI = +5\nUANG = +0\nSTRES = +5", 
                   "Dibuat oleh u9807652134 A.K.A Lingga_adi", JOptionPane.PLAIN_MESSAGE,null);
                   break; 
                   //quit dan konfirmasi
                   default:
                   konfirm = JOptionPane.showConfirmDialog(null, "apa anda yakin?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                   if(konfirm == 0){
                    //mengubah i menjadi false dan menghentikan game
                       i = false;
                   }
                   break;
                 }

               //ending jika KESEHATAN,ENERGI <= 0, UANG <= -1, STRES >=100 dan UANG >= 500
               if(ipt.getHP() <= 0){
                   //ending meninggal
                   JOptionPane.showMessageDialog(null, "Di hari ke-"+hari+"\n"+Nama+" meninggal :(", "INALILLAHI", 0, mati);
                   i = false;
               }else if(ipt.getSTR() <= 0){
                   //ending sakit   
                   JOptionPane.showMessageDialog(null, "Di hari ke-"+hari+"\n"+Nama+" mengalami sakit yang parah karena kehabisan energi", "sakit parah", 0, sakit);
                   i = false;
               }else if(ipt.getEXP() < 0){
                   //ending miskin
                   JOptionPane.showMessageDialog(null, "Di hari ke-"+hari+"\n"+Nama+" kehabisan semua uang dan harus hidup di kota kedinginan", "jadi kismin", 0, miskin);
                   i = false;
               }else if(ipt.getSTRES() >= 100){
                   //ending gila
                   JOptionPane.showMessageDialog(null, "Di hari ke-"+hari+"\n"+Nama+" menjadi gila karena stres dan mulai meneror kota", "kegilaan ini membunuhku", 0, gila);
                   i = false;
               }else if(ipt.getEXP() >= 500){
                   //ending sukses
                   JOptionPane.showMessageDialog(null, "DI HARI KE-"+hari+"\n"+Nama+" MENCAPAI KESUKSESAN DAN HIDUP HARMONI", "KESUKSESAN", 0, sukses);
                   i = false;
               }
   
               //nilai i selalu true diubah jika pilih quit atau mencapai sebuah ending
               //jila i false game akan berhenti
           }while(i);
           
       }
    
        


        // u9807652134 || Lingga_adi || Kling

        //ide projek ini diambil dari tugas 5 OOP
        //projek dibuat langsung setelah zoom meeting informasi projek, versi pertama dibuat selama 2 atau 3 hari(LUPA :D) dan sudah di kirim ke guru RPL smk 9 gambiran
        //ini versi 2 dengan  fitur berhenti tambahan dan penataan interface dan kode
        //:D :D :D
    
    }
}
