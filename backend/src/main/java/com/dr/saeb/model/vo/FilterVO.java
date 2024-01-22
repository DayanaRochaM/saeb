package com.dr.saeb.model.vo;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data 
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterVO implements Serializable{
	 
	private static final Long serialVersionUID = -9162864322402794479L;
	private Integer ano;
	private Long idRegiao;
	private Long idUF;
	private Long idMunicipio;
	private Long idEscola;
	private Long idDependenciaAdministrativa;
	private Long idLocalizacao;
	private Long idArea;
	
	public Long getIdRegiao() { 
		return idRegiao;
	}

	public static Long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getAno() {
		return ano;
	}

	public Long getIdUF() {
		return idUF;
	}

	public Long getIdMunicipio() {
		return idMunicipio;
	}

	public Long getIdEscola() {
		return idEscola;
	}

	public Long getIdDependenciaAdministrativa() {
		return idDependenciaAdministrativa;
	}

	public Long getIdLocalizacao() {
		return idLocalizacao;
	}

	public Long getIdArea() {
		return idArea;
	}
	
}
