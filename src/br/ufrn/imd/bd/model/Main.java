package br.ufrn.imd.bd.model;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

	public static void main(String[] args) throws Exception {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdVeiculo");
		EntityManager em = emf.createEntityManager();
		System.out.println("Banco Veiculo criado!!");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Veiculo v1 = new Veiculo();
		v1.setPlaca("OKA-1801");
		v1.setModelo("C3 Tendance");
		v1.setAno(2013);
		v1.setCor("Branca");
		v1.setDataFabricacao(sdf.parse("12/12/2012"));

		Veiculo v2 = new Veiculo();
		v2.setPlaca("NOH-5152");
		v2.setModelo("Kyron");
		v2.setAno(2013);
		v2.setCor("Branca");
		v2.setDataFabricacao(sdf.parse("12/12/2012"));

		Veiculo v3 = new Veiculo();
		v3.setPlaca("JXK-1988");
		v3.setModelo("Parati");
		v3.setAno(2004);
		v3.setCor("Preta");
		v3.setDataFabricacao(sdf.parse("12/12/2003"));

		Veiculo v4 = new Veiculo();
		v4.setPlaca("JWI-5323");
		v4.setModelo("Hilux");
		v4.setAno(2011);
		v4.setCor("Prata");
		v4.setDataFabricacao(sdf.parse("12/12/2010"));

		Veiculo v5 = new Veiculo();
		v5.setPlaca("NOU-0619");
		v5.setModelo("March");
		v5.setAno(2009);
		v5.setCor("Prata");
		v5.setDataFabricacao(sdf.parse("12/12/2008"));

		Veiculo v6 = new Veiculo();
		v6.setPlaca("JWG-5033");
		v6.setModelo("Astra");
		v6.setAno(1984);
		v6.setCor("Azul");
		v6.setDataFabricacao(sdf.parse("12/12/1984"));

		Veiculo v7 = new Veiculo();
		v7.setPlaca("JXH-7097");
		v7.setModelo("S-10");
		v7.setAno(2005);
		v7.setCor("Verde");
		v7.setDataFabricacao(sdf.parse("12/12/2004"));

		Revendedor r1 = new Revendedor();
		r1.setNome("Catarino Antao Palmeira");
		r1.setEndereco("Rua dos Passaros");
		r1.setTelefone("11111111");

		Revendedor r2 = new Revendedor();
		r2.setNome("Palmira Natacha Portela");
		r2.setEndereco("Rua dos Bosques");
		r2.setTelefone("22222222");

		Revendedor r3 = new Revendedor();
		r3.setNome("Aldo Sandra Silva");
		r3.setEndereco("Rua das Flores");
		r3.setTelefone("33333333");

		Manutencao m1 = new Manutencao();
		m1.setDescricao("Troca do Oleo");
		m1.setData(sdf.parse("09/02/2015"));

		Manutencao m2 = new Manutencao();
		m2.setDescricao("Troca do Ar Condicionado");
		m2.setData(sdf.parse("15/06/2015"));

		Manutencao m3 = new Manutencao();
		m3.setDescricao("Balanceamento dos Pneus");
		m3.setData(sdf.parse("25/02/2015"));

		Manutencao m4 = new Manutencao();
		m4.setDescricao("Troca das Velas");
		m4.setData(sdf.parse("19/08/2015"));

		Manutencao m5 = new Manutencao();
		m5.setDescricao("Troca do parachoque");
		m5.setData(sdf.parse("16/01/2015"));

		Manutencao m6 = new Manutencao();
		m6.setDescricao("Troca de Pneu");
		m6.setData(sdf.parse("11/09/2015"));

		Manutencao m7 = new Manutencao();
		m7.setDescricao("Troca de carro");
		m7.setData(sdf.parse("04/05/2015"));

		Manutencao m8 = new Manutencao();
		m8.setDescricao("Regulagem de Motores");
		m8.setData(sdf.parse("02/01/2015"));

		Manutencao m9 = new Manutencao();
		m9.setDescricao("Troca de Motor");
		m9.setData(sdf.parse("20/09/2015"));

		Manutencao m10 = new Manutencao();
		m10.setDescricao("Troca de Correia Dentada");
		m10.setData(sdf.parse("30/01/2015"));

		Manutencao m11 = new Manutencao();
		m11.setDescricao("Troca de Retrovisor");
		m11.setData(sdf.parse("23/02/2015"));

		Manutencao m12 = new Manutencao();
		m12.setDescricao("Troca de Calota");
		m12.setData(sdf.parse("15/09/2015"));

		Manutencao m13 = new Manutencao();
		m13.setDescricao("Troca do Cilindro de Gas");
		m13.setData(sdf.parse("19/08/2015"));

		Manutencao m14 = new Manutencao();
		m14.setDescricao("Troca do Amortecedor");
		m14.setData(sdf.parse("30/06/2015"));

		Manutencao m15 = new Manutencao();
		m15.setDescricao("Troca do Airbag");
		m15.setData(sdf.parse("16/04/2015"));

		Manutencao m16 = new Manutencao();
		m16.setDescricao("Troca do Teto Solar");
		m16.setData(sdf.parse("18/06/2015"));

		Manutencao m17 = new Manutencao();
		m17.setDescricao("Troca do Ar Condicionado");
		m17.setData(sdf.parse("18/01/2015"));
		
		v1.setRevendedor(r1);
		v2.setRevendedor(r1);
		v3.setRevendedor(r2);
		v4.setRevendedor(r3);
		v5.setRevendedor(r3);
		v6.setRevendedor(r3);
		v7.setRevendedor(r3);

		r1.setVeiculos(new HashSet<Veiculo>());
		r1.getVeiculos().add(v1);
		r1.getVeiculos().add(v2);
		r2.setVeiculos(new HashSet<Veiculo>());
		r2.getVeiculos().add(v3);
		r3.setVeiculos(new HashSet<Veiculo>());
		r3.getVeiculos().add(v4);
		r3.getVeiculos().add(v5);
		r3.getVeiculos().add(v6);
		r3.getVeiculos().add(v7);

		v1.setManutencoes(new HashSet<Manutencao>());
		v2.setManutencoes(new HashSet<Manutencao>());
		v2.getManutencoes().add(m1);
		v2.getManutencoes().add(m2);
		v2.getManutencoes().add(m3);
		v3.setManutencoes(new HashSet<Manutencao>());
		v3.getManutencoes().add(m4);
		v3.getManutencoes().add(m5);
		v3.getManutencoes().add(m6);
		v3.getManutencoes().add(m7);
		v4.setManutencoes(new HashSet<Manutencao>());
		v4.getManutencoes().add(m8);
		v5.setManutencoes(new HashSet<Manutencao>());
		v5.getManutencoes().add(m9);
		v5.getManutencoes().add(m10);
		v6.setManutencoes(new HashSet<Manutencao>());
		v6.getManutencoes().add(m11);
		v6.getManutencoes().add(m12);
		v6.getManutencoes().add(m13);
		v6.getManutencoes().add(m14);
		v7.setManutencoes(new HashSet<Manutencao>());
		v7.getManutencoes().add(m15);
		v7.getManutencoes().add(m16);
		v7.getManutencoes().add(m17);

		m1.setVeiculo(v2);
		m2.setVeiculo(v2);
		m3.setVeiculo(v2);
		m4.setVeiculo(v3);
		m5.setVeiculo(v3);
		m6.setVeiculo(v3);
		m7.setVeiculo(v3);
		m8.setVeiculo(v4);
		m9.setVeiculo(v5);
		m10.setVeiculo(v5);
		m11.setVeiculo(v6);
		m12.setVeiculo(v6);
		m13.setVeiculo(v6);
		m14.setVeiculo(v6);
		m15.setVeiculo(v7);
		m16.setVeiculo(v7);
		m17.setVeiculo(v7);

		em.getTransaction().begin();
		em.persist(v1);
		em.persist(v2);
		em.persist(v3);
		em.persist(v4);
		em.persist(v5);
		em.persist(v6);
		em.persist(v7);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		em.persist(m1);
		em.persist(m2);
		em.persist(m3);
		em.persist(m4);
		em.persist(m5);
		em.persist(m6);
		em.persist(m7);
		em.persist(m8);
		em.persist(m9);
		em.persist(m10);
		em.persist(m11);
		em.persist(m12);
		em.persist(m13);
		em.persist(m14);
		em.persist(m15);
		em.persist(m16);
		em.persist(m17);

		em.getTransaction().commit();
		System.out.println("Dados OK");

		// Retornar todos os veículos do ano de 2011 e de cor prata.
		System.out.println("\nLista de Querys solicitadas\n");
		Query a = em.createQuery("from Veiculo v where v.ano = 2011 and v.cor = 'Prata'");
		//select v.* from Veiculo v where v.ano = 2011 and cor = 'Prata'
		System.out.println("\nRetornar todos os veículos do ano de 2011 e de cor prata.\n");
		List<Veiculo> resultsA = a.getResultList();
		for (Veiculo elemento : resultsA) {
			System.out.println("Veiculo: " + elemento.getIdVeiculo() + " Placa: " + elemento.getPlaca() + " Modelo: "
					+ elemento.getModelo() + " Ano: " + elemento.getAno() + " Cor: " + elemento.getCor());
		}

		// Retornar todos os revendedores do modelo Astra.
		Query b = em.createQuery("select distinct r from Revendedor r join r.veiculos v where v.modelo = 'Astra'");
		//select r.* from Revendedor R, Veiculo V where r.idRevendedor = v.idRevendedor and v.modelo = 'Astra'
		System.out.println("\nRetornar todos os revendedores do modelo Astra.\n");
		List<Revendedor> resultsB = b.getResultList();
		for (Revendedor elemento : resultsB) {
			System.out.println("Revendedor: " + elemento.getIdRevendedor() + " Nome: " + elemento.getNome()
					+ " Endereco: " + elemento.getEndereco() + " Telefone: " + elemento.getTelefone());
		}
		
		// Retornar todos os veículos que possuírem manutenção igual a “troca do ar-condicionado”.
		System.out.println("\nRetornar todos os veículos que possuírem manutenção igual a “troca do ar-condicionado”.\n");
		Query c = em.createQuery("select distinct v from Veiculo v join v.manutencoes m where m.descricao = 'Troca do Ar Condicionado'");
		//select v.* from Veiculo v, Manutencao m where v.idVeiculo = m.idVeiculo and m.descricao = 'Troca do Ar Condicionado'
		List<Veiculo> resultsC = c.getResultList();
		for (Veiculo elemento : resultsC) {
			System.out.println("Veiculo: " + elemento.getIdVeiculo() + " Placa: " + elemento.getPlaca() + " Modelo: "
					+ elemento.getModelo() + " Ano: " + elemento.getAno() + " Cor: " + elemento.getCor());
		}

	}

}
