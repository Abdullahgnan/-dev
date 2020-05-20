package hamburger;


	public class DeluxeBurger extends Hamburger {
		
	    public DeluxeBurger(String ekmekTipi, String et, String isim, double fiyat) {
	        super(ekmekTipi, et, isim, fiyat);
	        super.ogedenEkle1("içicekler", 1.0d);
	        super.ogedenEkle2("cipsler", 1.0d);
	    }

	  
	    public double calcHamburgerPrice() {
	        double tabanFiyati = super.hamburgerinFiyati();
	        return tabanFiyati;
	    }

	
	    public void ogedenEkle1(String ogeEkle1, double fiyat) {
	        System.out.println("Deluxe Burger'e ek öðeler eklenemez");
	    }

	    public void ogedenEkle2(String ogeEkle1, double fiyat) {
	        System.out.println("Deluxe Burger'e ek öðeler eklenemez");
	    }


	    public void ogedenEkle3(String ogeEkle1, double fiyat) {
	        System.out.println("Deluxe Burger'e ek öðeler eklenemez");
	    }

	    public void ogedenEkle4(String ogeEkle1, double fiyat) {
	        System.out.println("Deluxe Burger'e ek öðeler eklenemez");
	    }
	}
}
