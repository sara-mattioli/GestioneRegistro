package esercizio_2;
import java.util.Scanner;
public class GestioneRegistroEta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num=0;
		
		System.out.println("Inserire il nome del file del registro:");
      String nome_file=input.nextLine();
      RegistroEtaCompleto re=new RegistroEtaCompleto(nome_file);
      do{System.out.println("Inserire:");
      System.out.println("1-Visualizza registro");
      System.out.println("2-Aggiungi elemento");
      System.out.println("3-Incrementa età");
      System.out.println("4-Salva dati");
      System.out.println("5-Esci");
      num=input.nextInt();
     
	if(num==1) {
		re.contenutoRegistro();
		}
	 if(num==2) {
   	  System.out.println("Inserire nome:");
   	  String nome=input.next();
   	  System.out.println("Inserire età:");
   	  int eta=input.nextInt();
   	  re.aggiungiPersona(nome,eta);}
	 if(num==3) {
		 System.out.println("Inserire nome:");
		 String nome=input.next();
		 re.incrementaEta(nome);
	 }
	 if(num==4) {
		 re.salvataggio();
	 }
	 if(num==5) {System.out.println("Fine");}
	}while(num!=1 || num!=2 || num!=3 || num!=4 || num!=5);
	 
	 
	}
	}
    
		


