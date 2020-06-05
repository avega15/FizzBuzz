//The famouse Fizz Buzz question!
//Print Fizz if divisible by 3, Buzz if divisible by 5, FizzBuzz if divisible my 3 and 5!
public class fizzbuzz{
	public static void main(String[] args) {
		
		//Iterate from 1 to 100 and use our solver every step
		for(int i = 1; i <= 100; i++){
			System.out.println(fizzBuzzSolver(i));
		}
	}
	
	
	public static String fizzBuzzSolver(int number){
		//Check if the current iteration is divisble by 3 AND 5 by using modulo
		if(number % 3 == 0 && number % 5 == 0){
			return "FizzBuzz";
		}
		//Check if divisble by 3
		if(number % 3 == 0){
			return "Fizz";
		}
		//Check if divisble by 5
		if(number % 5 == 0){
			return "Buzz";
		}
		//Spit back the number it isn't divisble by 3 or 5.
		return String.valueOf(number);
	}
}

