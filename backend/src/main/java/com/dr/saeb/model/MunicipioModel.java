package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_municipio", schema = "saeb")
public class MunicipioModel {
	
	@Id
	@Column(name = "id_municipio", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_municipio", nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_unidade_federativa")
    UnidadeFederativaModel unidadeFederativaModel;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_area")
    AreaModel areaModel;
	
    public MunicipioModel() {}

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

	public UnidadeFederativaModel getUnidadeFederativaModel() {
		return unidadeFederativaModel;
	}

	public void setUnidadeFederativaModel(UnidadeFederativaModel unidadeFederativaModel) {
		this.unidadeFederativaModel = unidadeFederativaModel;
	}

	public AreaModel getAreaModel() {
		return areaModel;
	}

	public void setAreaModel(AreaModel areaModel) {
		this.areaModel = areaModel;
	}
    
}
