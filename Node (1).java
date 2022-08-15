//Legger til kommentarer som skal hjelpe med forståelsen.  

public class Node{
	private int minnestorrelse;
	private int prosessorantall;

	public Node(int minne, int prosessor){
		//Konstruktør
		this.minnestorrelse = minne;
		this.prosessorantall = prosessor;
	}
	public int antProsessorer(int prosessorer){
		//Hadde glemt å skrive public
		return prosessorantall;
	}

	public int getMinneStorrelse(){
		return this.minnestorrelse;
	}
	public int getProsessorAntall(){
		return this.prosessorantall;
	}
}


// Kommentar: Inkapsulere metodene. Lag var private. Lag metode som retuernerer/sjekker minnestr. 



