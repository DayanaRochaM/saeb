package com.dr.saeb.model;
import javax.persistence.*; 

@Entity
@Table(name = "tb_inse_escola", schema = "saeb")
public class InseEscolaModel {
	
	@Id
	@Column(name = "id_inse_escola", unique=true, nullable = false)
    private long id;
 
    @Column(name = "nu_ano_inicio", nullable = false)
    private int anoInicio;
    
    @Column(name = "nu_ano_fim", nullable = false)
    private int anoFim;
    
    @Column(name = "qtd_alunos", nullable = false)
    private int quantidadeAlunos;
    
    @Column(name = "nu_valor_inse")
    private double valorInse;
    
    @Column(name = "pc_nivel_i")
    private double porcentagenteNivelI;
    
    @Column(name = "pc_nivel_ii")
    private double porcentagenteNivelII;
    
    @Column(name = "pc_nivel_iii")
    private double porcentagenteNivelIII;
    
    @Column(name = "pc_nivel_iv")
    private double porcentagenteNivelIV;
    
    @Column(name = "pc_nivel_v")
    private double porcentagenteNivelV;
    
    @Column(name = "pc_nivel_vi")
    private double porcentagenteNivelVI;
    
    @Column(name = "pc_nivel_vii")
    private double porcentagenteNivelVII;
    
    @Column(name = "pc_nivel_viii")
    private double porcentagenteNivelVIII;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_escola")
    EscolaModel escolaModel;
    
    @ManyToOne
    @JoinColumn(name = "fk_id_classificacao")
    ClassificacaoModel classificacaoModel;
    
    public InseEscolaModel() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public int getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(int quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public double getValorInse() {
		return valorInse;
	}

	public void setValorInse(double valorInse) {
		this.valorInse = valorInse;
	}

	public EscolaModel getEscolaModel() {
		return escolaModel;
	}

	public void setEscolaModel(EscolaModel escolaModel) {
		this.escolaModel = escolaModel;
	}

	public double getPorcentagenteNivelI() {
		return porcentagenteNivelI;
	}

	public void setPorcentagenteNivelI(double porcentagenteNivelI) {
		this.porcentagenteNivelI = porcentagenteNivelI;
	}

	public double getPorcentagenteNivelII() {
		return porcentagenteNivelII;
	}

	public void setPorcentagenteNivelII(double porcentagenteNivelII) {
		this.porcentagenteNivelII = porcentagenteNivelII;
	}

	public double getPorcentagenteNivelIII() {
		return porcentagenteNivelIII;
	}

	public void setPorcentagenteNivelIII(double porcentagenteNivelIII) {
		this.porcentagenteNivelIII = porcentagenteNivelIII;
	}

	public double getPorcentagenteNivelIV() {
		return porcentagenteNivelIV;
	}

	public void setPorcentagenteNivelIV(double porcentagenteNivelIV) {
		this.porcentagenteNivelIV = porcentagenteNivelIV;
	}

	public double getPorcentagenteNivelV() {
		return porcentagenteNivelV;
	}

	public void setPorcentagenteNivelV(double porcentagenteNivelV) {
		this.porcentagenteNivelV = porcentagenteNivelV;
	}

	public double getPorcentagenteNivelVI() {
		return porcentagenteNivelVI;
	}

	public void setPorcentagenteNivelVI(double porcentagenteNivelVI) {
		this.porcentagenteNivelVI = porcentagenteNivelVI;
	}

	public double getPorcentagenteNivelVII() {
		return porcentagenteNivelVII;
	}

	public void setPorcentagenteNivelVII(double porcentagenteNivelVII) {
		this.porcentagenteNivelVII = porcentagenteNivelVII;
	}

	public double getPorcentagenteNivelVIII() {
		return porcentagenteNivelVIII;
	}

	public void setPorcentagenteNivelVIII(double porcentagenteNivelVIII) {
		this.porcentagenteNivelVIII = porcentagenteNivelVIII;
	}

	public ClassificacaoModel getClassificacaoModel() {
		return classificacaoModel;
	}

	public void setClassificacaoModel(ClassificacaoModel classificacaoModel) {
		this.classificacaoModel = classificacaoModel;
	}
	 
}
