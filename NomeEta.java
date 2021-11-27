package esercizio_2;
import java.io.Serializable;
//serve serializable per poter salvare su file

public class NomeEta implements Serializable {
	static final long serialVersionUID = 1;
	private int eta;
	private String nome;
	
	public NomeEta(String name,int age) {
		this.nome=name;
		this.eta=age;
		}
	public String getNome() {return nome;}
	public int getEta() {return eta;}
	public int incrementaEta() {return eta++;}
	public String toString() {return nome + eta;}

}
