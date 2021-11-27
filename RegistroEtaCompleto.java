package esercizio_2;
import java.util.Scanner;
import java.util.Vector;
import java.io.*;
public class RegistroEtaCompleto {
	public Vector<NomeEta> informazioni=new Vector<NomeEta>();
	private String file;
	
	public RegistroEtaCompleto(String nome_file) {
		this.file=nome_file;
		try {
			ObjectInputStream file_input =
					new ObjectInputStream (new BufferedInputStream (
					new FileInputStream (file )));
			informazioni=(Vector<NomeEta>) file_input.readObject();
			file_input.close();
		}catch (FileNotFoundException e) {
			System.out.println("Il file " + file + " non esiste");
			System.out.println("Sara' creato dopo il salvataggio");
			System.out.println();
		}
		catch (ClassNotFoundException e) {
			//serve a controllare il caso i cui il file non contenga alcun oggetto
			System.out.println("ERRORE di lettura");
			System.out.println(e);
		}
		catch(IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);
		}
		
	}
	
	public void contenutoRegistro() {
		for(int i=0;i<informazioni.size();i++) {
			System.out.println(informazioni.get(i));
		}
	}
	public void aggiungiPersona(String nome,int eta) {
		NomeEta pp=new NomeEta(nome,eta);
		if(informazioni.equals(pp)) {System.out.println("Questa persona è già presente nel registro");}
		else {informazioni.add(pp);}
	}
	
	public void incrementaEta(String nome) {
		for(int i=0;i<informazioni.size();i++) {
			if(informazioni.get(i).getNome().equals(nome)) {
				informazioni.get(i).incrementaEta();
			}
			
		}
		
			
		}
	
	public void salvataggio() {
		try {
			ObjectOutputStream out = new
					ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			out.writeObject(informazioni);
			out.close();
		}catch(IOException e) {
			System.out.println("Errore di I/O");
			System.out.println(e);
		}
	}

}
