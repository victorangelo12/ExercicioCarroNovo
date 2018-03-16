package br.com.fiap.ads.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name = "passageiro", sequenceName = "SQ_T_PASSAGEIRO", allocationSize = 1)

public class Passageiro {
	@Id
	@Column(name= "cd_passageiro")
	@GeneratedValue(generator="passageiro", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_passageiro", nullable = false, length = 100)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;

	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passageiro(String nome, Calendar dataNascimento, Genero genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}