import java.util.HashMap;

public class IntToRomanNumber {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		map.put(40, "XL");
		map.put(50, "L");
		map.put(90, "XC");
		map.put(100, "C");
		map.put(400, "CD");
		map.put(500, "D");
		map.put(900, "CM");
		map.put(1000, "M");
		String res="";
		for(Integer i:bases) {
			while(num>=i){
				res=res+map.get(i);
				num=num-i;
				
			}
		}


		System.out.println("Roman No is: "+res);

	}

}