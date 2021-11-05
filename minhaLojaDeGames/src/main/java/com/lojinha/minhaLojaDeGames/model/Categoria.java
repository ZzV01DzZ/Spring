package com.lojinha.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotBlank
	@Size (min = 1, max = 50, message = "O genero deve conter no mínimo 1 e no máximo 50 caracteres")
	private String genero;
	
	@NotBlank
	@Size (min = 1, max = 1000, message = "A descrição deve conter no mínimo 1 e no máximo 1000 caracteres")
	private String descricao;
	
	@NotBlank
	@Size (min = 1, max = 20, message = "A plataforma deve conter no mínimo 1 e no máximo 20 caracteres")
	private String plataforma;
	

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;


	public long getId_categoria() {
		return id_categoria;
	}


	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	

}
