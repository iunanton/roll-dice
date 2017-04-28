public class dice {
   public static int rollDice() {
	double randomNumber = Math.random();
	int randomInt = (int) (randomNumber * 6 + 1);
	return randomInt;
   }
   public static void main(String[] args) {
	for (int i=0; i<10; i++){
		int roll = rollDice();
		System.out.println("Roll # "+i+": "+roll);
	}
   }
}
