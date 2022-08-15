import java.util.ArrayList;
/*
ArrayList():
Valgte ArrayList da det er en dynamisk liste som lar seg legge til, fjerne og finne elementer. 

Denne klassen tar inn maks antall noder. 
*/

public class Rack{
	private int maxNoder;
	private ArrayList<Node> liste;
	//Kan gjøre dette private

	public Rack(int max){
		//konstruktør 
		this.maxNoder = max;
		liste = new ArrayList<Node>();
	}

	public int noderMedNokMinne(int paakrevdMinne){
		int counter=0;
		for (Node noden : liste) {
			if(noden.minnestorrelse>=paakrevdMinne){
				counter++;
			}
		}
		return counter;
	}

	public int antProsessorer(){
		int counter = 0;
		for (Node noden : liste) {
			counter += noden.prosessorantall;
		}
		return counter;	
	}

	public boolean settInn(Node noden){
		if(liste.size() < maxNoder){
			liste.add(noden);
			return true;
		}
		else{
			return false;
		}
	}
}



