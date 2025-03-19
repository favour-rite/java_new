import java.util.Arrays;
public class Pixel{
	public static void main(String [] args){


	int [] pixel = {12,23,45,21,34,53,121,44,23};

	for (int count = 0; count < pixel.length; count++){
		if(pixel[count] >= 0 && pixel[count] <= 20){
			pixel[count] = 10;

		}else if (pixel[count] >= 21 && pixel[count] <= 40){
			pixel[count] = 30;

		}else if (pixel[count] >= 41 && pixel[count] <= 60){
			pixel[count] = 50;

		}else if (pixel[count] >= 61 && pixel[count] <= 80){
			pixel[count] = 70;

		}else if (pixel[count] >= 81 && pixel[count] <= 100){
			pixel[count] = 90;

		}else if (pixel[count] >= 101 && pixel[count] <= 120){
			pixel[count] = 110;

		}else if (pixel[count] >= 121 && pixel[count] <= 140){
			pixel[count] = 130;

		}else if (pixel[count] >= 141 && pixel[count] <= 160){
			pixel[count] = 150;

		}else if (pixel[count] >= 161 && pixel[count] <= 180){
			pixel[count] = 170;

		}else if (pixel[count] >= 181){
			pixel[count] = 190;
		}

	}
		System.out.print(Arrays.toString(pixel));








}



}