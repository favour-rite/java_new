public class Product{
	public static void main(String[] args){
		System.out.println("a"+"\t"+ "b"+"\t"+"pow(a,  b)");
		int num= 0;
		int add = 0;
		double pow = 0;

		while ( add <5 ){
		pow = Math.pow  (add , num);
		num = add + 1;
			add++;
			num++;
			pow++;
		System.out.println( add+"\t"+ num + "\t" + pow);
		
		
		} 



}



}