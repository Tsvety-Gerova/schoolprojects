package project;
import java.util.Scanner;
public class project06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
double wavelenght;
System.out.println("Enter a number");
wavelenght = sc.nextDouble();

if (wavelenght >= 380 && wavelenght < 450){
	System.out.println("The colour is violet");}
	else if (wavelenght >= 450 && wavelenght < 495){
		System.out.println("The colour is blue");}
	else if (wavelenght >= 495 && wavelenght < 570){
		System.out.println("The colour is green");}
	else if (wavelenght >= 570 && wavelenght < 590){
		System.out.println("The colour is yellow");}
	else if (wavelenght >= 590 && wavelenght < 620){
		System.out.println("The colour is orange");}
	else if (wavelenght >= 620 && wavelenght < 750){
		System.out.println("The colour is red");}
		 if (wavelenght < 380 || wavelenght > 750 ){
			System.out.println("The entered wavelength is not a part of the visible spectrum");
}
		}
	}


