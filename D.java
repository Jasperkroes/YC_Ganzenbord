import java.util.Scanner;

class D{

	/**
	* Opdracht:
	* Je mag alleen fris drinken als je jonger bent dan 16.
	* Je mag alleen fris + bier drinken als je jonger bent dan 18.
	* Je mag alles drinken als je 18 of ouder bent.
	*/
	public static void main(String[] args){
		
		//default age
		int age = 15;
		
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();

		if(age < 16){
			System.out.println("Je mag alleen fris drinken.");			
		} else if(age < 18){
			System.out.println("Je mag alleen bier en fris drinken.");
		} else {
			System.out.println("Je mag alles drinken.");
		}
	}

}