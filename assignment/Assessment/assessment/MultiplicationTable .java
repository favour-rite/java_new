public class MultiplicationTable {

 public static void main(String[] args) {

 System.out.println(" Multiplication Table");


 System.out.print(" ");
 for (int count = 1; count <= 12; count++)
 System.out.print(" " + count);

System.out.println("\n — — — — — — — — — — —— — — — — — — — —");
 for (int counter = 1; counter <= 12; counter++) {

 System.out.print(i + " | ");
 for (int count = 1; count <= 12; count++) {

 System.out.printf("%4d", count * counter);
 	}
 System.out.println();
 }
  }
 }
