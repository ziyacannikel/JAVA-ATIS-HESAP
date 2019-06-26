import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.println("atılmak istenen açıyı derece cinsinden girin");
		double sayı1=k.nextDouble();//ATIŞ AÇISIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII===SAYI1
		while(sayı1<0 || sayı1>90)
		{
			System.out.println("açı 0 ile 90 derece arasında olmalıdır");
			sayı1=k.nextInt();
		}
		System.out.println("atış hızını m/sn cinsinden girin");
		double sayı2=k.nextDouble();//ATIŞ HIZIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII===SAYI2
		while(sayı2<0)
		{
			System.out.println("atış hızı 0 m/sn den küçük olamaz");
			sayı2=k.nextDouble();
		}
		System.out.println("atış yapılan yerin zeminden yüksekliğini metre cinsinden girin");
		double sayı3=k.nextDouble();//ATIŞ YERİNİN YÜKSEKLİĞİİİİİİİİİİİİİİİİİİİİİİİ===SAYI3
		while(sayı3<0)
		{
			System.out.println("atış yüksekliği 0 metreden küçük olamaz");
			sayı3=k.nextDouble();
		}
		
		while(sayı2==0 & sayı3==0){
				System.out.println("yükseklik ve hız 0 olursa atış olmaz");
				System.out.println("atış hızını m/sn cinsinden girin");
			    sayı2=k.nextDouble();
				while(sayı2<0)
				{
					System.out.println("atış hızı 0 m/sn den küçük olamaz");
					sayı2=k.nextDouble();
				}
				System.out.println("atış yapılan yerin zeminden yüksekliğini metre cinsinden girin");
			    sayı3=k.nextDouble();//ATIŞ YERİNİN YÜKSEKLİĞİİİİİİİİİİİİİİİİİİİİİİİ===SAYI3
				while(sayı3<0)
				{
					System.out.println("atış yüksekliği 0 metreden küçük olamaz");
					sayı3=k.nextDouble();
				}
		}
        
		double[][] açılar=new double[1][2];
		açılar=açı(sayı1);
		double uçuş;
		uçuş=(açılar[0][0]*sayı2)/5+Math.sqrt(sayı3/5);//UÇUŞ SÜRESİİİİİİİİİİİİİİİİİİİİİ
		System.out.println("CİSMİN UÇUŞ SÜRESİ :"+uçuş+" sn");
		double yol = 0;
		if(sayı1==90)
		{
			System.out.println("CİSİM YATAY OLARAK YOL ALMAZ");
		}
		else
		{
			yol=(açılar[0][1]*sayı2)*uçuş;//ALINAN YOLLLLLLLLLLLLLLLLLLL
		}
		System.out.println("YATAYDA ALINAN YOL :"+yol+" m");
		
	    double çıkış =(sayı2*açılar[0][0])/10;
	    double hmax=0;
	    if(sayı1==0)
	    {
	    	System.out.println("CİSİM OLDUĞU NOKTADAN DAHA YÜKSEK BİR NOKTAYA ÇIKMAZ");
	    	System.out.println("CİSMİN MAXİMUM YÜKSEKİLĞİ "+sayı3+" m  DİR");
	    }
	    else
	    {
	    	System.out.println("CİSİM "+çıkış+" sn BOYUNCA YÜKSELİR DAHA SONRA İNİŞE GEÇER");
	    	hmax=(5*çıkış*çıkış)+sayı3;
	    	System.out.println("CİSMİN YÜKSELEBİLECEĞİ MAXİMUM NOKTA "+hmax+" m DİR");
	    }
	
	    double sonhız=0;
	    double lazım=0;
	    double lazım1=0;
	    if(sayı1==90)
	    {
	    	System.out.println("CİSMİN SON HIZI "+sayı2+" m/sn DİR");
	    	System.out.println("CİSMİN YATAY SON HIZI 0.0 m/sn DİR");
	    }
	    else
	    {
	    	lazım=Math.pow((uçuş-çıkış)*10, 2);
	    	lazım1=Math.pow(açılar[0][1]*sayı2, 2);
	    	sonhız=Math.sqrt(lazım+lazım1);
	    	System.out.println("CİSMİN BİLEŞKE SON HIZI "+sonhız+" m/sn DİR");
	    	System.out.println("CİSMİN YATAY SON HIZI "+açılar[0][1]*sayı2+" m/sn DİR");
	    	System.out.println("CİSMİN DİKEYSON HIZI "+(uçuş-çıkış)*10+" m/sn DİR");
	    	
	    	
	    }
        	    
	
	
	
	}
	
	public static double[][] açı(double sayı1)
	{
		double veri[][]=new double[1][2];
		double sin=Math.sin(Math.toRadians(sayı1));
		double cos=Math.cos(Math.toRadians(sayı1));
		veri[0][0]=sin;
		veri[0][1]=cos;
		return veri;
	}
	
		
				

}
