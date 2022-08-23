package control;

import java.util.ArrayList;

import model.OrdemServicoInterna;

public class OrdemServicoInternaProcessa {

	public static ArrayList<OrdemServicoInterna> os = new ArrayList<>();
	private static OrdemServicoInternaDAO osd = new OrdemServicoInternaDAO();

	public static void carregar() {
		os = osd.ler();
	}
	
	public static void salvar() {
		osd.escrever(os);
	}

}
