package fr.bl;

public class ReferentielPeriode {

		private long perid;
		private String perMillesimeDebutGregorien;
		private String perMillesimeDebutAffichage;
		private String perMillesimeFinGregorien;
		private String perMillesimeFinAffichage;
		private String perDescription;
		/**
		 * @param perid
		 * @param perMillesimeDebutGregorien
		 * @param perMillesimeDebutAffichage
		 * @param perMillesimeFinGregorien
		 * @param perMillesimeFinAffichage
		 * @param perDescription
		 */
		public ReferentielPeriode(long perid,
				String perMillesimeDebutGregorien,
				String perMillesimeDebutAffichage,
				String perMillesimeFinGregorien,
				String perMillesimeFinAffichage, String perDescription) {
			super();
			this.perid = perid;
			this.perMillesimeDebutGregorien = perMillesimeDebutGregorien;
			this.perMillesimeDebutAffichage = perMillesimeDebutAffichage;
			this.perMillesimeFinGregorien = perMillesimeFinGregorien;
			this.perMillesimeFinAffichage = perMillesimeFinAffichage;
			this.perDescription = perDescription;
		}
		public long getPerid() {
			return perid;
		}
		public void setPerid(long perid) {
			this.perid = perid;
		}
		public String getPerMillesimeDebutGregorien() {
			return perMillesimeDebutGregorien;
		}
		public void setPerMillesimeDebutGregorien(String perMillesimeDebutGregorien) {
			this.perMillesimeDebutGregorien = perMillesimeDebutGregorien;
		}
		public String getPerMillesimeDebutAffichage() {
			return perMillesimeDebutAffichage;
		}
		public void setPerMillesimeDebutAffichage(String perMillesimeDebutAffichage) {
			this.perMillesimeDebutAffichage = perMillesimeDebutAffichage;
		}
		public String getPerMillesimeFinGregorien() {
			return perMillesimeFinGregorien;
		}
		public void setPerMillesimeFinGregorien(String perMillesimeFinGregorien) {
			this.perMillesimeFinGregorien = perMillesimeFinGregorien;
		}
		public String getPerMillesimeFinAffichage() {
			return perMillesimeFinAffichage;
		}
		public void setPerMillesimeFinAffichage(String perMillesimeFinAffichage) {
			this.perMillesimeFinAffichage = perMillesimeFinAffichage;
		}
		public String getPerDescription() {
			return perDescription;
		}
		public void setPerDescription(String perDescription) {
			this.perDescription = perDescription;
		}
		
		
}
