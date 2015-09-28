package br.ufrn.imd.bd.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="SEQ_REVENDEDOR", initialValue=1, allocationSize=1, sequenceName="seq_revendedor")
public class Revendedor implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_REVENDEDOR")
	private int idRevendedor;
	private String nome;
	private String endereco;
	private String telefone;

	@OneToMany(mappedBy="revendedor")
	private Collection<Veiculo> veiculos;
	
	public Revendedor(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdRevendedor() {
		return idRevendedor;
	}

	public void setIdRevendedor(int idRevendedor) {
		this.idRevendedor = idRevendedor;
	}

	public Collection<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(Collection<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
	
}
