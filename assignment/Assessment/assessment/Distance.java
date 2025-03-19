public class Distance { 
    public static void main(String[] args) { 
        double x1=0,x2=2; 
        double y1=2,y2=0; 
        double X= Math.pow((x2-x1),2); 
        double Y= Math.pow((y2-y1),2); 
        double d = Math.sqrt(X + Y); 
 
        System.out.println("Distance is: "+d); 
    } 
}
