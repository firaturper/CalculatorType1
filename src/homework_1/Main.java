package homework_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BasitHesapMakineImpl basit = new BasitHesapMakineImpl();
		MuhendislikHesapMakineImpl muh = new MuhendislikHesapMakineImpl();
		//Hesap Makinesi Seçimi
		 while(true) {
		System.out.println("Lütfen Hesap Makinesi Türü Seçiniz: "
				+"\n"+ "Basit Hesap Makinesi için 1'e basýnýz."
				+"\n"+ "Mühendislik Hesap Makinesi için 2'ye basýnýz.");
		        int x = scan.nextInt();
		
		      //Basit Hesap Makinesi Ýþlem Baþlangýcý
		        
		       
 if(x==1) {
			
			System.out.println("Basit Hesap Makinesini Seçtiniz."
					+"\n"+ "Þimdi Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: "
					+"\n"+ "Toplama Ýþlemi Ýçin 1'e Basýnýz."
					+"\n"+ "Çýkarma Ýþlemi Ýçin 2'ye Basýnýz."
					+"\n"+ "Çarpma Ýþlemi Ýçin 3'e Basýnýz."
					+"\n"+ "Bölme Ýþlemi Ýçin 4'e Basýnýz.");
			int y = scan.nextInt();
			if(y==1) {
				
				    System.out.println("Toplama Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
				    double a = scan.nextDouble();
				    System.out.println("Toplama Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
				    double b = scan.nextDouble();
				    basit.toplama(a,b);
			}
			else if(y==2) {
				
			    System.out.println("Çýkarma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Çýkarma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.cikarma(a,b);
		  }
			else if(y==3) {
				
			    System.out.println("Çarpma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Çarpma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.carpma(a,b);
		 }
			else if(y==4) {
				
			    System.out.println("Bölme Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Bölme Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.bolme(a,b);
		} 
			else {
				System.out.println("Yanlýþ Giriþ Yaptýnýz.");
				
			}
			
 } //Basit Hesap Makinesi Ýþlem Sonu
 //Mühendislik Hesap Makinesi Ýþlem Baþlangýcý
 else if (x==2) {
			System.out.println("Mühendislik Hesap Makinesini Seçtiniz."
					+"\n"+ "Þimdi Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: "
					+"\n"+ "Toplama Ýþlemi Ýçin 1'e Basýnýz."
					+"\n"+ "Çýkarma Ýþlemi Ýçin 2'ye Basýnýz."
					+"\n"+ "Çarpma Ýþlemi Ýçin 3'e Basýnýz."
					+"\n"+ "Bölme Ýþlemi Ýçin 4'e Basýnýz."
					+"\n"+ "Üs Alma Ýþlemi Ýçin 5'e Basýnýz."
					+"\n"+ "Kare Kök Alma Ýþlemi Ýçin 6'ya Basýnýz."
					);
			int z = scan.nextInt();
			
			if(z==1) {
				
				System.out.println("Toplama Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Toplama Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.toplama(a,b);
			}
			
			else if(z==2) {
				
				System.out.println("Çýkarma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Çýkarma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.cikarma(a,b);
			}
			
            else if(z==3) {
				
				System.out.println("Çarpma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Çarpma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.carpma(a,b);
			}
			
            else if(z==4) {
				
				System.out.println("Bölme Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Bölme Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    basit.bolme(a,b);
			}
			
               else if(z==5) {
				
				System.out.println("Üs Alma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Üs Alma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
			    double b = scan.nextDouble();
			    muh.usalma(a,b);
			}
			
               else if(z==6) {
   				
   				System.out.println("Karekök Alma Ýþlemi Ýçin Sayý Giriniz: ");
   			    double a = scan.nextDouble();
   			    muh.karekokalma(a);
   			}
			
               else {
            	   System.out.println("Yanlýþ Giriþ Yaptýnýz.");
            	   
               }
			
 }// Mühendislik Hesap Makinesi Ýþlem Sonu
 
 else {
			
			System.out.println("Yanlýþ Seçim Yaptýnýz.");
			continue;
		}
	  }
		
	}

}
