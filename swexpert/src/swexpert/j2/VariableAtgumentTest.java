package swexpert.j2;

public class VariableAtgumentTest {
	public static double scoreSum(double... score) {
		double sum = 0;
		for (int i = 0; i < score.length; i++)
			sum = sum + score[i];
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(scoreSum(80,60,100));
		System.out.println(scoreSum(10,100));
		System.out.println(scoreSum(80,60,100,22,33,44));
	}
}
