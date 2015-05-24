import java.util.*;

public class sort{
	public static void main(String[] args) {//Main method
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 12 number to fill the dimensional array which is 6*2");
		//store the array value
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		int g = input.nextInt();
		int h = input.nextInt();
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		int l = input.nextInt();
		
		int array[][] = {{a,b},{c,d},{e,f},{g,h},{i,j},{k,l}};
		System.out.println("Your array is :{"+ a +","+ b +"},{"+ c +","+ d +"},{"+ e +","+ f +"},{"+ g + ","+ h +"},{"+ i +","+ j +"},{"+ k +","+ l +"}");
		sort(array);//sort array
		System.out.println("Your new array is:");
		for (i = 0; i < array.length; i++) {
			System.out.print("{" + array[i][0] + ", " + array[i][1] + "}");
		}
  }

public static void sort(int array[][]) {
	//i begin from the row
    for (int i = 0; i < array.length; i++) {
		double currentMin = array[i][0];
		int currentMinIndex = i;
		//compare with other row
		for (int j = i+1 ; j < array.length; j++) {
			if (currentMin > array[j][0] || (currentMin == array[j][0] && array[currentMinIndex][1] > array[j][1])){
				currentMin = array[j][0];
				currentMinIndex = j;
			}
		}

		//find the smaller number exchange it 
		if (currentMinIndex != i) {
			int temp = array[currentMinIndex][0];
			int temp1 = array[currentMinIndex][1];
			array[currentMinIndex][0] = array[i][0];
			array[currentMinIndex][1] = array[i][1];
			array[i][0] = temp;
			array[i][1] = temp1;
		}
	}
  }

}
