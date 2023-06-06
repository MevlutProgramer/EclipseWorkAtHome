import java.util.Scanner;

public class GenelTekrarScanenr {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String MedeniDuru="";
System.out.println("Merhaba adiniz nedir?");
String ad=sc.next();
System.out.println("Tanistigima memnun oldum"+ad+"\n Kac yasindasin ?");
int yas=sc.nextInt();
System.out.println("Ooo cok  guzel \n Evli misin?");
boolean evlimi=sc.nextBoolean();

if(evlimi) {
	MedeniDuru="Evli";
}else {
	MedeniDuru="Bekar";
}System.out.println("Adın: "+ad+"\n Yasin : "+yas+"\n Medeni Durumu : "+MedeniDuru);
	}

}
