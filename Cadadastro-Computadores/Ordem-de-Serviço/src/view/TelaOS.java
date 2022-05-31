package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import control.OrdemServicoInternaProcessa;
import model.OrdemServicoInterna;


public class TelaOS extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel painel;
	private JLabel title, linha, lbData, lbNomeCliente, lbEquipamento, lbAcessorio, lbNumeroSerie, lbDefeito, lbServicoExecutado,lbPecaUtilizada,lbQTDUtilizada,lbPecaSerialNumber,lbTecnico;
	private JTextField tfData, tfNomeCliente,tfAcessorio, tfNumeroSerie, tfDefeito, tfServicoExecutado,tfPecaUtilizada,tfQTDUtilizada,tfPecaSerialNumber,tfTecnico;
	private JComboBox<String> cbEquipamento;
	private JButton create, read, update, delete;
	private JScrollPane scroll;
	private JTable table;
	private DefaultTableModel tableModel;
	private int indice = -1;
	
	TelaOS(){
		setTitle("Ordem de Serviço Interna");
		setBounds(500, 10, 900, 960);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);
		//painel.setBackground(new Color(255,255,255));
		
		title = new JLabel("Ordem de Serviço Interna");
		title.setBounds(220, 20, 1000, 40);
		title.setFont(new Font("Arial", Font.BOLD, 35));
		painel.add(title);
		
		linha = new JLabel("__________________________________________");
		linha.setBounds(200, 35, 470, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		lbData = new JLabel("Data:");
		lbData.setBounds(520, 40, 100, 120);
		lbData.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbData);
		
		lbNomeCliente = new JLabel("Nome Cliente:");
		lbNomeCliente.setBounds(30, 40, 200, 120);
		lbNomeCliente.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbNomeCliente);
		
		lbEquipamento = new JLabel("Produto:");
		lbEquipamento.setBounds(30, 150, 200, 120);
		lbEquipamento.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbEquipamento);

		title = new JLabel("Descrição do Equipamento");
		title.setBounds(250, 130, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		painel.add(title);
		
		linha = new JLabel("_____________________________________________________________________");
		linha.setBounds(50, 138, 870, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		lbNumeroSerie = new JLabel("Número de Série:");
		lbNumeroSerie.setBounds(300, 150, 200, 120);
		lbNumeroSerie.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbNumeroSerie);
		
		lbAcessorio = new JLabel("Acessórios:");
		lbAcessorio.setBounds(30, 200, 200, 120);
		lbAcessorio.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbAcessorio);
		
		lbDefeito = new JLabel("Defeito:");
		lbDefeito.setBounds(420, 200, 200, 120);
		lbDefeito.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbDefeito);
		
		lbServicoExecutado = new JLabel("Serviço Executado:");
		lbServicoExecutado.setBounds(30, 260, 200, 120);
		lbServicoExecutado.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbServicoExecutado);
		
		title = new JLabel("Peças Utilizadas");
		title.setBounds(320, 350, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		painel.add(title);

		linha = new JLabel("_____________________________________________________________________");
		linha.setBounds(50, 360, 870, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		
		
		// Text Field
		
		tfData = new JTextField();
		tfData.setBounds(580, 80, 200, 35);
		painel.add(tfData);
		
		tfNomeCliente = new JTextField();
		tfNomeCliente.setBounds(180, 80, 300, 35);
		painel.add(tfNomeCliente);
		
		cbEquipamento = new JComboBox<String>(
				new String[] { "Impressora", "Celular", "Laptop", "Monitor", "Computador", "Videogame" });
		cbEquipamento.setBounds(130, 190, 135, 35);
		painel.add(cbEquipamento);
		
		tfNumeroSerie = new JTextField();
		tfNumeroSerie.setBounds(490, 190, 300, 35);
		painel.add(tfNumeroSerie);
		
		tfAcessorio = new JTextField();
		tfAcessorio.setBounds(150, 240, 250, 35);
		painel.add(tfAcessorio);
		
		tfDefeito = new JTextField();
		tfDefeito.setBounds(510, 240, 290, 35);
		painel.add(tfDefeito);
		
		tfServicoExecutado = new JTextField();
		tfServicoExecutado.setBounds(250, 300, 500, 35);
		painel.add(tfServicoExecutado);
	}
	



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			//create();
		}
		if (e.getSource() == read) {
			//read();
		}
		if (e.getSource() == update) {
			//alterar();
		}
		if (e.getSource() == delete) {
			//excluir();
		}
	}

	public static void main(String[] args) {
		OrdemServicoInternaProcessa.carregar();
		TelaOS login = new TelaOS();
		login.setVisible(true);
	}
}