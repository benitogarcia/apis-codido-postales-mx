package com.jbenny.cp.mx.models.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "direcciones")
public class DireccionEntity {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "id_mpio")
	private MunicipioEntity municipio;

	@NotNull(message = "Código postal es requerido.")
	@NotEmpty(message = "Código postal es requerido.")
	@NotBlank(message = "Código postal es requerido.")
	@Column(name = "codigo_postal")
	private Integer codigopostal;

	@NotNull(message = "Asentamiento es requerido.")
	@NotEmpty(message = "Asentamiento es requerido.")
	@NotBlank(message = "Asentamiento es requerido.")
	private String asentamiento;

	@NotNull(message = "Ciudad es requerido.")
	@NotEmpty(message = "Ciudad es requerido.")
	@NotBlank(message = "Ciudad es requerido.")
	private String ciudad;

	@NotNull(message = "Tipo asentamiento es requerido.")
	@NotEmpty(message = "Tipo asentamiento es requerido.")
	@NotBlank(message = "Tipo asentamiento es requerido.")
	private String tipo_asentamiento;

	@NotNull(message = "Zona es requerido.")
	@NotEmpty(message = "Zona es requerido.")
	@NotBlank(message = "Zona es requerido.")
	private String zona;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MunicipioEntity getMunicipio() {
		return municipio;
	}

	public void setMunicipio(MunicipioEntity municipio) {
		this.municipio = municipio;
	}

	public Integer getCodigo_postal() {
		return codigopostal;
	}

	public void setCodigo_postal(Integer codigo_postal) {
		this.codigopostal = codigo_postal;
	}

	public String getAsentamiento() {
		return asentamiento;
	}

	public void setAsentamiento(String asentamiento) {
		this.asentamiento = asentamiento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTipo_asentamiento() {
		return tipo_asentamiento;
	}

	public void setTipo_asentamiento(String tipo_asentamiento) {
		this.tipo_asentamiento = tipo_asentamiento;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DireccionEntity other = (DireccionEntity) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "DireccionEntity [id=" + id + ", municipio=" + municipio + ", codigo_postal=" + codigopostal
				+ ", asentamiento=" + asentamiento + ", ciudad=" + ciudad + ", tipo_asentamiento=" + tipo_asentamiento
				+ ", zona=" + zona + "]";
	}

}
