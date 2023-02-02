public class GuessingGame{
	public static void main(String[] args){

		Integer numberToGuess;
		Integer guessedNumber;

		Toolbox myToolbox = new Toolbox();
		System.out.println("Welcome to Guessing Game");

		numberToGuess = myToolbox.getRandomInteger(10);

		
		guessedNumber = myToolbox.readIntegerFromCmd();


		if(guessedNumber > numberToGuess){

			System.out.println("too high");

		}else if(guessedNumber < numberToGuess){

			System.out.println("too low");

		}else if(numberToGuess.equals(guessedNumber)){

			System.out.println("right");	
		}




	}
}