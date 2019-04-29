package br.com.yuri.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String cargo;
	private Date datanascimento;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	

}
