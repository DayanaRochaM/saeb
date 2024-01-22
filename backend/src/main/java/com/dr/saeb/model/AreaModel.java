package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_area", schema = "saeb")
public class AreaModel {
	
	@Id
	@Column(name = "id_area", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_area", nullable = false)
    private String nome;
    
    public AreaModel() {}

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
