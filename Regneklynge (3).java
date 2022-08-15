import java.util.*;

public class Regneklynge{
	private ArrayList<Rack> liste;
	private int maxNoderPerRack;
	/*
	Size kan gi antall racks. 
	*/

	/*Regneklynge(String filnavn)
	Hvordan kan en konstruktør utføre det vi skal? 
	*/

	public Regneklynge(int maxNoderPerRack){
		//Konstruktør

		liste = new ArrayList<Rack>();
		this.maxNoderPerRack = maxNoderPerRack;
	}

	public Regneklynge(String filnavn){
		// begynn å lese fra fil

		hentDataFraFil();


	}

	private void hentDataFraFil(String filnavn){
		File filen = new File("tekstfil.txt");
		Scanner scanneren;
		try{
			scanneren = new Scanner(filen);	
			String forsteLinje = scanneren.nextLine();
			System.out.println("Forste linje: " + forsteLinje);
			int antallNoderPerRack = Integer.parseInt(forsteLinje); //omgjor string til int

			// ny regneklynge her
			while(scanneren.hasNextLine()){
				String linjen = scanneren.nextLine();
				Scanner lineScanner = new Scanner(linjen);
				int antall = Integer.parseInt(lineScanner.next());
				int minne = Integer.parseInt(lineScanner.next());
				int antPross = Integer.parseInt(lineScanner.next());
				System.out.println("Linje 1: Antall: " + antall + " minne: " + minne + " prosessorer: " + antPross );
				
			}

		}
		catch(FileNotFoundException theException){
			System.out.println("RIP, problem med fil.");
			System.exit(1);
		
	
	}

	}
	public int antProsessorer(){
		//Snakker med Rack-->Node
		int counter = 0;

		for (Rack tempRack : liste){
			counter += tempRack.antProsessorer();
			
		}
		return counter;
	}

	public int noderMedNokMinne(int paakrevdMinne){
		//Snakker med Rack. Rack snakker med Node

		int counter = 0;

		for (Rack racket : liste){
			counter += racket.noderMedNokMinne(paakrevdMinne);

		}
		return counter;
		
	}


	public void settInnNode(Node noden){
		/*Bruker void da den ikke skal vise oss noe, men jobber. Metoden leter etter et rack som har nok plass til å sette inn en node. Dersom det ikke er et 
		rack tilgjengelig så lager den en ny. 
		Looks for rack to insert Node, if no rack available it makes a new one.
		*/
		for(Rack tempRack : liste){
			if (tempRack.settInn(noden) == true){
				//Hvis "true" er noden satt inn i racket. Bruker return slik at den går ut/avslutter.
				
				// successful insertion into rack
				return;
			}
		}
		Rack nyRack = new Rack(maxNoderPerRack);
		nyRack.settInn(noden);
		liste.add(nyRack);
	}

	public int antallRacks(){
		//Metoden lager en løkke som lagrer antall racks i counter og returnerer antall Rakcs. 
		int counter = 0;
		for(Rack racket : liste){
			counter++;
		}
	return counter;
	}

	/*
	Kommentar til retter:
	Dette er et forsøk på å lage en metode som skal brukes i deloppgave E, 
	men får det ikke helt til.
	*/

	private int leseFraFil(String LesFil){
		// This belongs to part E
		File fil = new File(LesFil);
		Scanner nyLinje = new Scanner(fil);
		int node = nyLinje.nextInt();
		return node;
	}
	

	/*
	public static void main(String[] args) {
		Regneklynge abel = new Regneklynge(12);
		//Objektet abel har maks 12 noder per rack.

		for(int i = 0;i<650;i++){
			abel.settInnNode(new Node(64, 1));

		}

		for (int i = 0; i<16;i++ ) {
			abel.settInnNode(new Node(1024, 2));
		}

	}
	*/
}




