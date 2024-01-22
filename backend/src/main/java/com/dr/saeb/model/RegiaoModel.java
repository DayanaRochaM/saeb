package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_regiao", schema = "saeb")
public class RegiaoModel {

    @Id
    @Column(name = "id_regiao", unique=true, nullable = false)
    private long id;

    @Column(name = "sg_regiao", nullable = false)
    private String sigla;

    @Column(name = "no_regiao", nullable = false)
    private String nome;

    public RegiaoModel() {
    }

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

}
