//Dette er et forsøk på E

class SkrivFil{
	public static void main(String[] args) {
		Scanner in; 
		//se under try, her sier vi at "in" er new Scanner og ny 
		try{
			in = new Scanner(new FileReader("DeloppgaveE.txt"));

			while(in.hasNext()){
				//løkke over teksten, printer ut så lenge den har en linje å lese.
				String line = in.nextLine();
				System.out.println(line);
			}
			In.close();
		}
		cath (FileNotFoundException){

		}
	}
}