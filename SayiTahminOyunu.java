import java.util.Scanner;


public class SayiTahminOyunu {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int cevap = (int)(Math.random()*101);
		int giri;
		int giri_sayýsý = 1;
		boolean oyundevami = true;
		boolean giri_gecerli;
		while(oyundevami){
			giri_gecerli = true;
			System.out.print("Tahmininiz: ");
			giri = sc.nextInt();
			
			if(giri <= -1 || giri >= 101){
				System.out.println("Lütfen belirtilen aralýkta bir sayý giriniz");
				giri_gecerli = false;
				giri_sayýsý--;
			}
			if(giri_sayýsý == 5){
				System.err.println("doðru cevap: "+ cevap + "\ndeneme hakkýnýz doldu!");
				oyundevami = false;
				break;
			}
			if(giri == cevap){
				oyundevami = false;
				System.out.println("doðru tahmin!!!");
				break;
			}
			if(giri_gecerli){
			if(giri < cevap){
				System.out.println("yukarý!");
				System.out.println("kalan deneme hakký = " + (5 - giri_sayýsý));
		
			}
			if(giri > cevap){
				System.out.println("asaðý!");
				System.out.println("kalan deneme hakký = " + (5 - giri_sayýsý));
				}}
			
			 giri_sayýsý++;
			}
		}
	
	}

