package cz.roman.spanek.courses.hibernate.model;
// Generated 24.4.2018 9:20:27 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Firma generated by hbm2java
 */
@Entity
@Table(name = "firma", schema = "public", uniqueConstraints = @UniqueConstraint(columnNames = "nazev"))
public class Firma implements java.io.Serializable {

	private String ico;
	private String nazev;
	private String adresa;
	private Set<Kontakt> kontakts = new HashSet<Kontakt>(0);
	private Set<Omezeni> omezenis = new HashSet<Omezeni>(0);

	public Firma() {
	}

	public Firma(String ico, String nazev, String adresa) {
		this.ico = ico;
		this.nazev = nazev;
		this.adresa = adresa;
	}

	public Firma(String ico, String nazev, String adresa, Set<Kontakt> kontakts, Set<Omezeni> omezenis) {
		this.ico = ico;
		this.nazev = nazev;
		this.adresa = adresa;
		this.kontakts = kontakts;
		this.omezenis = omezenis;
	}

	@Id

	@Column(name = "ico", unique = true, nullable = false, length = 150)
	public String getIco() {
		return this.ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	@Column(name = "nazev", unique = true, nullable = false, length = 150)
	public String getNazev() {
		return this.nazev;
	}

	public void setNazev(String nazev) {
		this.nazev = nazev;
	}

	@Column(name = "adresa", nullable = false, length = 150)
	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "firma")
	public Set<Kontakt> getKontakts() {
		return this.kontakts;
	}

	public void setKontakts(Set<Kontakt> kontakts) {
		this.kontakts = kontakts;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "firmas")
	public Set<Omezeni> getOmezenis() {
		return this.omezenis;
	}

	public void setOmezenis(Set<Omezeni> omezenis) {
		this.omezenis = omezenis;
	}

}
