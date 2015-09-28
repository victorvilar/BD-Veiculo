package br.ufrn.imd.bd.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="SEQ_VEICULO", initialValue=1, allocationSize=1, sequenceName="seq_veiculo")
public class Veiculo implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_VEICULO")
	private int idVeiculo;
	private String placa;
	private String modelo;
	private int ano;
	private String cor;
	@Temporal(TemporalType.DATE)
	private Date dataFabricacao;
	
	@OneToMany(mappedBy="veiculo") //Relacionamento
	private Collection<Manutencao> manutencoes;
	
	@ManyToOne
	@JoinColumn(name="idRevendedor")
	private Revendedor revendedor;
	
	public Veiculo(){
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public Collection<Manutencao> getManutencoes() {
		return manutencoes;
	}

	public void setManutencoes(Collection<Manutencao> manutencoes) {
		this.manutencoes = manutencoes;
	}

	public Revendedor getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
	
	
}
