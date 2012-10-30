package Stack;
// Klasse zum Testen des Stacks   


public class StackTest{
		

	public static void main(String[] args) {
		
		Integer[] arrayOfInts;
		arrayOfInts = new Integer[3];
		
		// Stapel aus bereits vorhandenem Array 'arrayOfInts' erstellen
		StackArray<Integer> Stapel= new StackArray<Integer>(arrayOfInts);
		
		// Stapel auff�llen
		Stapel.push(1);
		
		// noch einen Stapel erstellen (Array der L�nge 1 wird automatisch erstellt)
		StackArray<String> Stapel2;
		Stapel2= new StackArray<String>(1);
		
		// Stapel f�llen
		Stapel2.push("Eins");
		Stapel2.push("Zwei");
			
		try{
			// Test Stapel
			System.out.println(Stapel.pop());
			
			//Test Stapel2
			System.out.println(Stapel2.pop());
			System.out.println(Stapel2.pop());
			
		}catch (EmptyStackException es){
			System.out.println("Schlecht!");
		}
		

	}

}
