import java.util.Scanner;


public class SayiTahminOyunu {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cevap = (int)(Math.random()*101);
		int giri;
		int giri_say�s� = 1;
		boolean oyundevami = true;
		boolean giri_gecerli;
		while(oyundevami){
			giri_gecerli = true;
			System.out.print("Tahmininiz: ");
			giri = sc.nextInt();
			
			if(giri <= -1 || giri >= 101){
				System.out.println("L�tfen belirtilen aral�kta bir say� giriniz");
				giri_gecerli = false;
				giri_say�s�--;
			}
			if(giri_say�s� == 5){
				System.err.println("do�ru cevap: "+ cevap + "\ndeneme hakk�n�z doldu!");
				oyundevami = false;
				break;
			}
			if(giri == cevap){
				oyundevami = false;
				System.out.println("do�ru tahmin!!!");
				break;
			}
			if(giri_gecerli){
			if(giri < cevap){
				System.out.println("yukar�!");
				System.out.println("kalan deneme hakk� = " + (5 - giri_say�s�));
		
			}
			if(giri > cevap){
				System.out.println("asa��!");
				System.out.println("kalan deneme hakk� = " + (5 - giri_say�s�));
				}}
			
			 giri_say�s�++;
			}
		}
	
	}

