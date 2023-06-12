import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
	
		//Variables
		String answer;
		int score = 0;

		//Welcome statement
		Scanner scanner = new Scanner(System.in);
		System.out.println("----------------------------------------------");
		System.out.println("Welcome to the Jamaican Driver's License Test!");
		System.out.println("----------------------------------------------");
		
		System.out.println("\nYou need at least 75% to pass.");
		
		System.out.println("\nWould you like to begin? ");
		answer = scanner.nextLine().trim().toLowerCase();
		
		if(answer.equals("yes")) {
			System.out.println("\nOkay, lets begin!");
			score = 0;
		}else {
			System.out.println("\nGoodbye!");
			System.exit(0);
			
		//Questions
		}
		System.out.println("\nWhat is a cul-de-sac? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("a dead end road")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
			System.out.println("\nIncorrect!");
		}
	
		System.out.println("\nIndicate three places where you are not permitted to overtake: ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("At a pedestrian crossing, at a humoback bridge and at a crossroad")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
			System.out.println("\nIncorrect!");
		}	
		
		System.out.println("\nIf two vehicles are of similar size meet on a hill which one has the right of way? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("The vehicle going downhill")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat does the green signal at the traffic light mean? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Proceed if the way is clear")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}	
		
		System.out.println("\nIf you are involved in an accident when should you report it to the police? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Within 24 hrs")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}	
		
		System.out.println("\nOn what position should your car be before making a left turn from a one way street? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("In the nearest lane to the left")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}	
		
		System.out.println("\nWhat should you do when approaching a roundabout? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Merge with the traffic at a reduced speed")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nIf you are driving behind another motorist at 50 km/h how far away should you be? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("23 m (approx. 75 feet)")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhy should à driver not park on the brow of a hill? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Because the vehicle may cause an obstruction.")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is a fording? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("A place where a stream crosses the road")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat does a broken white line in the road mean? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("You may overtake if the way is clear")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is the maximum speed limit for trucks in built up areas? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("50km/h (30 m.p.h.)")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is the maximum speed limit for cars in built up areas? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("50km/h (30 m.p.h.)")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is meant by yield right of way? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("To give way)")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is a concealed entrance? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("It is a driveway which is not clearly seen leading onto the roadway.")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhen a driver gives a slow down signal what does that mean? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("He intends to slow down or stop")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nAfter passing through water what should you do? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Ride your brakes gently for a while")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhen the road is divided into three lanes when do you use the centre lane? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("If you are turning right or going straight ahead")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nWhat is the main cause of skidding? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("Faulty driving")) {
			System.out.println("\nCorrect!");
			score += 1;
		}else {
				System.out.println("\nIncorrect!");
		}
		
		System.out.println("\nHow should you drive on wet or slippery roads? ");
		answer = scanner.nextLine().trim().toLowerCase();
		if(answer.equals("It is safer to drive in low gear")) {
			System.out.println("\nCorrect!");
			score += 1;
			scanner.close();
		}else {
				System.out.println("\nIncorrect!");
		}
		
		//Calculations
		System.out.println("\nYou got " + score + " question(s) correct!");
		System.out.println("\nYou got " + (score / 20) * 100 + "%.");
		if(score < 15) {
			System.out.println("\nYou failed!");
		}else {
			System.out.println("\nYou passed!");
			}
		
		}
	}
