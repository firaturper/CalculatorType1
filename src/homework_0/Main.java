package homework_0;

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
						+"\n"+ "Mühendislik Hesap Makinesi için 2'e basýnýz.");
				        String x = scan.next(); /* 1 ve 2 dýþýnda bir karakter girildiðinde hata vermemesi 
				        için klavyeden alýnan deðer String tipinde bir deðermiþ gibi alýndý  */ 
				
				      //Basit Hesap Makinesi Ýþlem Baþlangýcý
				        
				       
		 if(x.equals("1")) {
					
					System.out.println("Basit Hesap Makinesini Seçtiniz."
							+"\n"+ "Þimdi Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: "
							+"\n"+ "Toplama Ýþlemi Ýçin 1'e Basýnýz."
							+"\n"+ "Çýkarma Ýþlemi Ýçin 2'ye Basýnýz."
							+"\n"+ "Çarpma Ýþlemi Ýçin 3'e Basýnýz."
							+"\n"+ "Bölme Ýþlemi Ýçin 4'e Basýnýz.");
					String y = scan.next(); // Burada da x girdisi için düþünülen mantýk iþliyor 
					if(y.equals("1")) {
						
						    System.out.println("Toplama Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
						    double a = scan.nextDouble();
						    System.out.println("Toplama Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
						    double b = scan.nextDouble();
						    basit.toplama(a,b);
						  
					}
					else if(y.equals("2")) {
						
					    System.out.println("Çýkarma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Çýkarma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.cikarma(a,b);
					   
					    
				  }
					else if(y.equals("3")) {
						
					    System.out.println("Çarpma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Çarpma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.carpma(a,b);
					    
				 }
					else if(y.equals("4")) {
						
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
		 else if (x.equals("2")) {
					System.out.println("Mühendislik Hesap Makinesini Seçtiniz."
							+"\n"+ "Þimdi Lütfen Yapmak Ýstediðiniz Ýþlemi Seçiniz: "
							+"\n"+ "Toplama Ýþlemi Ýçin 1'e Basýnýz."
							+"\n"+ "Çýkarma Ýþlemi Ýçin 2'ye Basýnýz."
							+"\n"+ "Çarpma Ýþlemi Ýçin 3'e Basýnýz."
							+"\n"+ "Bölme Ýþlemi Ýçin 4'e Basýnýz."
							+"\n"+ "Üs Alma Ýþlemi Ýçin 5'e Basýnýz."
							+"\n"+ "Kare Kök Alma Ýþlemi Ýçin 6'ya Basýnýz."
							);
					String z = scan.next(); // týpký x ve y girdisi için düþünülen mantýk
					
					if(z.equals("1")) {
						
						System.out.println("Toplama Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Toplama Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.toplama(a,b);
					    
					}
					
					else if(z.equals("2")) {
						
						System.out.println("Çýkarma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Çýkarma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.cikarma(a,b);
					 
					}
					
		            else if(z.equals("3")) {
						
						System.out.println("Çarpma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Çarpma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.carpma(a,b);
					   
					}
					
		            else if(z.equals("4")) {
						
						System.out.println("Bölme Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Bölme Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    basit.bolme(a,b);
					   
					}
					
		               else if(z.equals("5")) {
						
						System.out.println("Üs Alma Ýþlemi Ýçin Ýlk Sayýyý Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Üs Alma Ýþlemi Ýçin Ýkinci Sayýyý Giriniz: ");
					    double b = scan.nextDouble();
					    muh.usalma(a,b);
					    
					}
					
		               else if(z.equals("6")) {
		   				
		   				System.out.println("Karekök Alma Ýþlemi Ýçin Sayý Giriniz: ");
		   			    double a = scan.nextDouble();
		   			    muh.karekokalma(a);
		   			
		   			}
					
		               else {
		            	   System.out.println("Yanlýþ Giriþ Yaptýnýz.");
		            	   
		               }
					
		 }// Mühendislik Hesap Makinesi Ýþlem Sonu
		 
		 else { /* Klavyeye 1 ve 2 dýþýnýnda girilen her deðer buraya yönlenir */
					
					System.out.println("Yanlýþ Giriþ Yaptýnýz.");
					continue;
				}
		
     }
		
		} 
	}

