
public class Gugudan_Array {

	public static void main(String[] args) {

		int[] result = new int[9];
		
		System.out.println("----------");
		for (int i=0; i<result.length; i++) {
			result[i] = 2 * (i + 1);
			System.out.println(result[i]);
		}
		
		System.out.println("----------");
		result = new int[9];
		
		for (int i=0; i<result.length; i++) {
			result[i] = 3 * (i + 1);
			System.out.println(result[i]);
		}

	}

}
