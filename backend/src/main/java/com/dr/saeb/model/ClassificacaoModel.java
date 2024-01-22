package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_classificacao", schema = "saeb")
public class ClassificacaoModel {
	
	@Id
	@Column(name = "id_classificacao", unique=true, nullable = false)
    private long id;
 
    @Column(name = "no_classificacao", nullable = false)
    private String nome;
    
    @Column(name = "nu_ano_inicio", nullable = false)
    private int anoInicio;
    
    @Column(name = "nu_ano_fim", nullable = false)
    private int anoFim;
    
    @Column(name = "nu_valor_minimo", nullable = false)
    private double valorMinimo;

    @Column(name = "nu_valor_maximo")
    private double valorMaximo;
    
    public ClassificacaoModel() {  }

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

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	public double getValorMinimo() {
		return valorMinimo;
	}

	public void setValorMinimo(double valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	public double getValorMaximo() {
		return valorMaximo;
	}

	public void setValorMaximo(double valorMaximo) {
		this.valorMaximo = valorMaximo;
	}
   
}
