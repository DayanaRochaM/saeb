package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_escola", schema = "saeb")
public class EscolaModel {
	
	@Id
	@Column(name = "id_escola", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_escola", nullable = false)
    private String nome;
    
    @Column(name = "nu_latitude")
    private String latitude;
    
    @Column(name = "nu_longitude")
    private String longitude;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_municipio")
    MunicipioModel municipioModel;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_dependencia_administrativa")
    DependenciaAdministrativaModel dependenciaAdministrativaModel;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_localizacao")
    LocalizacaoModel localizacaoModel;
    
    public EscolaModel() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public MunicipioModel getMunicipioModel() {
		return municipioModel;
	}

	public void setMunicipioModel(MunicipioModel municipioModel) {
		this.municipioModel = municipioModel;
	}

	public DependenciaAdministrativaModel getDependenciaAdministrativaModel() {
		return dependenciaAdministrativaModel;
	}

	public void setDependenciaAdministrativaModel(DependenciaAdministrativaModel dependenciaAdministrativaModel) {
		this.dependenciaAdministrativaModel = dependenciaAdministrativaModel;
	}

	public LocalizacaoModel getLocalizacaoModel() {
		return localizacaoModel;
	}

	public void setLocalizacaoModel(LocalizacaoModel localizacaoModel) {
		this.localizacaoModel = localizacaoModel;
	}
}
