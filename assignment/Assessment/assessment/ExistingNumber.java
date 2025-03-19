public class ExistingNumber{
public static void main(String[] args){
	System.out.print(exist());
}

	public static boolean exist(){

	int [] numbers = {10,20,30,40};
	int target =20;
	for(int count = 0; count < numbers.length; count++){
		if (numbers[count] == target){
			return true;
		}
	}
return false;


}



}