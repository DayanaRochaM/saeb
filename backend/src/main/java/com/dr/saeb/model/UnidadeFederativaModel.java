package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_unidade_federativa", schema = "saeb")
public class UnidadeFederativaModel {
	
	@Id
	@Column(name = "id_unidade_federativa", unique=true, nullable = false)
    private long id;
 
    @Column(name = "sg_unidade_federativa", nullable = false)
    private String sigla;
    
    @Column(name = "no_unidade_federativa", nullable = false)
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_regiao")
    RegiaoModel regiao;
    
    public UnidadeFederativaModel() {  }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RegiaoModel getRegiao() {
		return regiao;
	}

	public void setRegiao(RegiaoModel regiao) {
		this.regiao = regiao;
	} 
    
}
