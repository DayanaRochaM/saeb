package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_dependencia_administrativa", schema = "saeb")
public class DependenciaAdministrativaModel {
	
	@Id
	@Column(name = "id_dependencia_administrativa", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_dependencia_administrativa", nullable = false)
    private String nome;
    
    public DependenciaAdministrativaModel() {}

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
