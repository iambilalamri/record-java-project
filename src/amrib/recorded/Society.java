package amrib.recorded;

public class Society {

	private Long id;
	private String name;
	private String siret;
	private String adresse;
	private String phone;
	private String email;

	public Society(Long id, String name, String siret, String adresse, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.siret = siret;
		this.adresse = adresse;
		this.phone = phone;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Society [id=" + id + ", name=" + name + ", siret=" + siret + ", adresse=" + adresse + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
