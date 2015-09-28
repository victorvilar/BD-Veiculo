package br.ufrn.imd.bd.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name="SEQ_MANUTENCAO", initialValue=1, allocationSize=1, sequenceName="seq_manutencao")
public class Manutencao implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_MANUTENCAO")
	private int idManutencao;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	@JoinColumn(name="idVeiculo")
	private Veiculo veiculo;
	
	public Manutencao(){
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdManutencao() {
		return idManutencao;
	}

	public void setIdManutencao(int idManutencao) {
		this.idManutencao = idManutencao;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
