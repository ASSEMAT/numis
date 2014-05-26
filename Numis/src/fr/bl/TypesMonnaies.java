package fr.bl;

public class TypesMonnaies {

	private long typId;
	private String typCode;
	private String typLibelle;
	private ReferentielPeriode typPerId;
	private String typMillesimeDebutGregorien;
	private String typMillesimeDebutAffichage;
	private String typMillesimeFinGregorien;
	private String typMillesimeFinAffichage;
	/**
	 * @param typId
	 * @param typCode
	 * @param typLibelle
	 * @param typPerId
	 * @param typMillesimeDebutGregorien
	 * @param typMillesimeDebutAffichage
	 * @param typMillesimeFinGregorien
	 * @param typMillesimeFinAffichage
	 */
	public TypesMonnaies(long typId, String typCode, String typLibelle,
			ReferentielPeriode typPerId, String typMillesimeDebutGregorien,
			String typMillesimeDebutAffichage, String typMillesimeFinGregorien,
			String typMillesimeFinAffichage) {
		super();
		this.typId = typId;
		this.typCode = typCode;
		this.typLibelle = typLibelle;
		this.typPerId = typPerId;
		this.typMillesimeDebutGregorien = typMillesimeDebutGregorien;
		this.typMillesimeDebutAffichage = typMillesimeDebutAffichage;
		this.typMillesimeFinGregorien = typMillesimeFinGregorien;
		this.typMillesimeFinAffichage = typMillesimeFinAffichage;
	}
	public long getTypId() {
		return typId;
	}
	public void setTypId(long typId) {
		this.typId = typId;
	}
	public String getTypCode() {
		return typCode;
	}
	public void setTypCode(String typCode) {
		this.typCode = typCode;
	}
	public String getTypLibelle() {
		return typLibelle;
	}
	public void setTypLibelle(String typLibelle) {
		this.typLibelle = typLibelle;
	}
	public ReferentielPeriode getTypPerId() {
		return typPerId;
	}
	public void setTypPerId(ReferentielPeriode typPerId) {
		this.typPerId = typPerId;
	}
	public String getTypMillesimeDebutGregorien() {
		return typMillesimeDebutGregorien;
	}
	public void setTypMillesimeDebutGregorien(String typMillesimeDebutGregorien) {
		this.typMillesimeDebutGregorien = typMillesimeDebutGregorien;
	}
	public String getTypMillesimeDebutAffichage() {
		return typMillesimeDebutAffichage;
	}
	public void setTypMillesimeDebutAffichage(String typMillesimeDebutAffichage) {
		this.typMillesimeDebutAffichage = typMillesimeDebutAffichage;
	}
	public String getTypMillesimeFinGregorien() {
		return typMillesimeFinGregorien;
	}
	public void setTypMillesimeFinGregorien(String typMillesimeFinGregorien) {
		this.typMillesimeFinGregorien = typMillesimeFinGregorien;
	}
	public String getTypMillesimeFinAffichage() {
		return typMillesimeFinAffichage;
	}
	public void setTypMillesimeFinAffichage(String typMillesimeFinAffichage) {
		this.typMillesimeFinAffichage = typMillesimeFinAffichage;
	}

	
}
