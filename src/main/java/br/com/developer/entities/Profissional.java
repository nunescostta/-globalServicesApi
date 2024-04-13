package br.com.developer.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_profissional")

@Data
public class Profissional {

	@Id
	@Column(name = "id")
	private UUID id;
	
	@Column(name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name = "email", length = 20, nullable = false)
	private String email;
	
	@Column(name = "cpf", length = 16, nullable = false)
	private String cpf;
	
	@Column(name = "telefone", length = 12, nullable = false)
	private String telefone;
}
