package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_localizacao", schema = "saeb")
public class LocalizacaoModel {
	
	@Id
	@Column(name = "id_localizacao", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_localizacao", nullable = false)
    private String nome;
    
    public LocalizacaoModel() {}

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

}
