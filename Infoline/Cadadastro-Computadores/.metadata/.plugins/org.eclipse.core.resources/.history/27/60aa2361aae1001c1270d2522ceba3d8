package control;

import java.util.ArrayList;

import model.OrdemServicoInterna;

public class OrdemServicoInternaProcessa {

	public static ArrayList<OrdemServicoInterna> manutencoes = new ArrayList<>();
	private static OrdemServicoInternaDAO md = new OrdemServicoInternaDAO();

	public static void carregar() {
		manutencoes = md.ler();
	}
	
	public static void salvar() {
		md.escrever(manutencoes);
	}

}
