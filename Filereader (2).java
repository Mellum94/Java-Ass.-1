import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Filereader{

	//scanner.next() -> gir neste ord (delt av mellomrom)
	//scanner.nextline() -> gir neste linje

	private void hentDataFraFil(String filnavn) {

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