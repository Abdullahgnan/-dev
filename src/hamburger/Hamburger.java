package hamburger;


	public class Hamburger {
		private String ekmekTipi;
		private String isim;
		private String et;
		private double fiyat;

		private String ogeEkle1;
		private double esyaFiyatEkle;

		private String ogeEkle2;
		private double esyaFiyatEkle2;

		private String ogeEkle3;
		private double esyaFiyatEkle3;

		private String ogeEkle4;
		private double esyaFiyatEkle4;

		public Hamburger(String ekmekTipi, String et, String isim, double fiyat) {
			this.ekmekTipi = ekmekTipi;
			this.et = et;
			this.et = isim;
			this.fiyat = fiyat;
		}

		public void esyadanEkle1(String esyaEkle1, double fiyat) {
			this.ogeEkle1 = ogeEkle1;
			this.esyaFiyatEkle = fiyat;
		}

		public void esyadanEkle2(String esyaEkle1, double fiyat) {
			this.ogeEkle2 = ogeEkle1;
			this.esyaFiyatEkle2 = fiyat;
		}

		public void esyadanEkle3(String esyaEkle1, double fiyat) {
			this.ogeEkle3 = ogeEkle1;
			this.esyaFiyatEkle4 = fiyat;
		}

		public void esyadanEkle4(String esyaEkle1, double fiyat) {
			this.ogeEkle4 = ogeEkle1;
			this.esyaFiyatEkle4 = fiyat;
		}

		public double HamburgerFiyatveTuru() {
			double fiyat = this.fiyat;
			System.out.println(this.isim + " hamburger in türü :  " + this.ekmekTipi + " fiyatý " + this.fiyat);

			if (this.ogeEkle1 != null) {
				fiyat += this.esyaFiyatEkle;
				System.out.println("ekle " + this.ogeEkle1 + " for an extra " + this.esyaFiyatEkle);
			}
			if (this.ogeEkle2 != null) {
				fiyat += this.esyaFiyatEkle2;
				System.out.println(this.ogeEkle2 + " ekstra için " + this.esyaFiyatEkle2);
			}
			if (this.ogeEkle3 != null) {
				fiyat += this.esyaFiyatEkle3;
				System.out.println("Added " + this.ogeEkle3 + " for an extra " + this.esyaFiyatEkle3);
			}
			if (this.ogeEkle4 != null) {
				fiyat += this.esyaFiyatEkle4;
				System.out.println("Added " + this.ogeEkle4 + " for an extra " + this.esyaFiyatEkle4);
			}
			return fiyat;
		}
	}



