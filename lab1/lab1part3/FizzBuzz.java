public class FizzBuzz{
	public static void main(String[] args) {
		for(Integer i = Integer.valueOf(1); i < 61; i++){

			if(i % 3 != 0 && i % 5 != 0){
				System.out.print(i);
			}if(i % 3 == 0){
				System.out.print("Fizz");
			}if(i % 5 == 0){
				System.out.print("Buzz");
			}
			
			System.out.println();
		}

	
}
}