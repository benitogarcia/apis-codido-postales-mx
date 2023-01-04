package com.jbenny.cp.mx.models.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "estados")
public class EstadoEntity {

	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "Estado es requerido.")
	@NotEmpty(message = "Estado es requerido.")
	@NotBlank(message = "Estado es requerido.")
	private String estado;

	@NotNull(message = "Abreviatura es requerido.")
	@NotEmpty(message = "Abreviatura es requerido.")
	@NotBlank(message = "Abreviatura es requerido.")
	private String abreviatura;

	@NotNull(message = "Capital es requerido.")
	@NotEmpty(message = "Capital es requerido.")
	@NotBlank(message = "Capital es requerido.")
	private String capital;

	public EstadoEntity() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
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
		EstadoEntity other = (EstadoEntity) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "EstadoEntity [id=" + id + ", estado=" + estado + ", abreviatura=" + abreviatura + ", capital=" + capital
				+ "]";
	}

}
