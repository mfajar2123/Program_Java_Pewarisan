package pewarisan;

class sepakbola { //superclass, parent
     String namapemain;
     String skill;
     String kakiterkuat;
     String klub;
     int    nomorpunggung;
     
//method cetak
void cetak(){
        System.out.println(" Nama Pemain     : "+this.namapemain);
        System.out.println(" Kaki Terkuat    : "+this.kakiterkuat);
        System.out.println(" Klub            : "+this.klub);
        System.out.println(" Nomor Punggung  : "+this.nomorpunggung);
        System.out.println(" Skill           : "+this.skill);
        System.out.println();
        
   }
}
class menball extends sepakbola  {//sub class, anak

}
class menball2 extends sepakbola  {//sub class, anak

}
       
        
public class Pewarisan{        
    public static void main(String[] args)  {
        sepakbola objsepakbola = new sepakbola ();
        objsepakbola.namapemain = "Harry Maguire";
        objsepakbola.skill = "Blunder atau Melakukan Kesalahan";
        objsepakbola.kakiterkuat = "Kanan";
        objsepakbola.klub = "Manchester United";
        objsepakbola.nomorpunggung = 5;
        
    //cetak
    objsepakbola.cetak();
    
        menball objmenball = new menball ();
        objmenball.namapemain = "Neymar";
        objmenball.skill = "Rabona";
        objmenball.kakiterkuat = "Kanan";
        objmenball.klub = "Paris Saint Germain";
        objmenball.nomorpunggung = 10;
        
    //cetak
    objmenball.cetak();
    
        menball2 objmenball2 = new menball2 ();
        objmenball2.namapemain = "Roberto Firmino";
        objmenball2.skill = "no look goal";
        objmenball2.kakiterkuat = "Kanan";
        objmenball2.klub = "Liverpool";
        objmenball2.nomorpunggung = 9;
        
    //cetak
    objmenball2.cetak();
        
    }
    
}
