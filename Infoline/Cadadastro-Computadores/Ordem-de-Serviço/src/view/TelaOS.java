package view;

//1;22/02/2022;Luiz;Celular;N;01;N�o Liga;Troca de Placa;H310-M 2.0;none;none;1;0;0;A823;0;0;Luiz;

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
	private JLabel title, linha, lbID,lbData, lbNomeCliente, lbEquipamento, lbAcessorio, lbNumeroSerie, lbDefeito, lbServicoExecutado,lbTecnico;
	private JTextField tfID, tfData, tfNomeCliente,tfAcessorio, tfNumeroSerie, tfDefeito, tfServicoExecutado,tfPecaUtilizada,tfpecaUtilizada01,tfpecaUtilizada02,tfqtdUtilizada,tfqtdUtilizada01,tfqtdUtilizada02,tfPecaSerialNumber,tfpecaSerialNumber01,tfpecaSerialNumber02;
	private JComboBox<String> cbEquipamento, cbTecnico;
	private JButton create, read, update, delete;
	private JScrollPane scroll;
	private JTable table;
	private DefaultTableModel tableModel;
	private int indice = -1;
	
	TelaOS(){
		setTitle("Ordem de Servi�o Interna");
		setBounds(500, 10, 900, 960);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel(); 
		setContentPane(painel); 
		setLayout(null);
		//painel.setBackground(new Color(255,255,255));
		
		title = new JLabel("Ordem de Servi�o Interna");
		title.setBounds(220, 20, 1000, 40);
		title.setFont(new Font("Arial", Font.BOLD, 35));
		painel.add(title);
		
		linha = new JLabel("__________________________________________");
		linha.setBounds(200, 35, 470, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		lbID = new JLabel("ID:");
		lbID.setBounds(25, 30, 100, 30);
		lbID.setFont(new Font("Arial", Font.BOLD, 20));
		painel.add(lbID);
		
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

		title = new JLabel("Descri��o do Equipamento");
		title.setBounds(250, 130, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		painel.add(title);
		
		linha = new JLabel("_____________________________________________________________________");
		linha.setBounds(50, 138, 870, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		lbNumeroSerie = new JLabel("N�mero de S�rie:");
		lbNumeroSerie.setBounds(300, 150, 200, 120);
		lbNumeroSerie.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbNumeroSerie);
		
		lbAcessorio = new JLabel("Acess�rios:");
		lbAcessorio.setBounds(30, 200, 200, 120);
		lbAcessorio.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbAcessorio);
		
		lbDefeito = new JLabel("Defeito:");
		lbDefeito.setBounds(420, 200, 200, 120);
		lbDefeito.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbDefeito);
		
		lbServicoExecutado = new JLabel("Servi�o Executado:");
		lbServicoExecutado.setBounds(30, 260, 200, 120);
		lbServicoExecutado.setFont(new Font("Calibri", Font.BOLD, 25));
		painel.add(lbServicoExecutado);
		
		title = new JLabel("Pe�as Utilizadas");
		title.setBounds(320, 350, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		painel.add(title);

		linha = new JLabel("_____________________________________________________________________");
		linha.setBounds(50, 360, 870, 30);
		linha.setFont(new Font("", Font.BOLD, 20));
		painel.add(linha);
		
		title = new JLabel("Pe�as");
		title.setBounds(120, 400, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 27));
		painel.add(title);
		
		title = new JLabel("QTD");
		title.setBounds(390, 400, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 27));
		painel.add(title);
		
		title = new JLabel("N�mero de S�rie");
		title.setBounds(590, 400, 1000, 40);
		title.setFont(new Font("Calibri", Font.BOLD, 27));
		painel.add(title);
		
		lbTecnico = new JLabel("T�cnico:");
		lbTecnico.setBounds(643, 522, 270, 160);
		lbTecnico.setFont(new Font("Calibri", Font.BOLD, 22));
		painel.add(lbTecnico);
		
		linha = new JLabel("______________________________");
		linha.setBounds(630, 600, 870, 30);
		linha.setFont(new Font("", Font.BOLD, 15));
		painel.add(linha);
		
		
		
		
		
		// Text Field
		
		tfID = new JTextField();
		tfID.setBounds(65, 30, 60, 30);
		tfID.setText(""+calcId());
		tfID.setEnabled(false);
		painel.add(tfID);
		
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
		
		//PE�A UTILIZADA
		tfPecaUtilizada = new JTextField();
		tfPecaUtilizada.setBounds(30, 440, 240, 30);
		painel.add(tfPecaUtilizada);
		
		tfpecaUtilizada01 = new JTextField();
		tfpecaUtilizada01.setBounds(30, 480, 240, 30);
		painel.add(tfpecaUtilizada01);
		
		tfpecaUtilizada02 = new JTextField();
		tfpecaUtilizada02.setBounds(30, 520, 240, 30);
		painel.add(tfpecaUtilizada02);
		
		//QUANTIDADE  UTILIZADA
		tfqtdUtilizada = new JTextField();
		tfqtdUtilizada.setBounds(350, 440, 120, 30);
		painel.add(tfqtdUtilizada);
		
		tfqtdUtilizada01 = new JTextField();
		tfqtdUtilizada01.setBounds(350, 480, 120, 30);
		painel.add(tfqtdUtilizada01);
		
		tfqtdUtilizada02 = new JTextField();
		tfqtdUtilizada02.setBounds(350, 520, 120, 30);
		painel.add(tfqtdUtilizada02);
		
		//PE�A SERIAL NUMBER
		tfPecaSerialNumber = new JTextField();
		tfPecaSerialNumber.setBounds(550, 440, 270, 30);
		painel.add(tfPecaSerialNumber);
		
		tfpecaSerialNumber01 = new JTextField();
		tfpecaSerialNumber01.setBounds(550, 480, 270, 30);
		painel.add(tfpecaSerialNumber01);
		
		tfpecaSerialNumber02 = new JTextField();
		tfpecaSerialNumber02.setBounds(550, 520, 270, 30);
		painel.add(tfpecaSerialNumber02);
		
		
		cbTecnico = new JComboBox<String>(
				new String[] { "Luiz Fernando", "Paulo Carvalho", "Fausto Fabiano"});
		cbTecnico.setBounds(730, 580, 135, 35);
		painel.add(cbTecnico);
		
		create = new JButton("Cadastrar");
		read = new JButton("Consultar");
		update = new JButton("Alterar");
		delete = new JButton("Excluir");
		
		create.setBounds(40, 580, 120, 32);
		read.setBounds(180, 580, 120, 32);
		update.setBounds(320, 580, 120, 32);
		delete.setBounds(460, 580, 120, 32);
		
		painel.add(create);
		painel.add(read);
		painel.add(update);
		painel.add(delete);
		
		tableModel = new DefaultTableModel();
		tableModel.addColumn(" -- ID --");
		tableModel.addColumn(" -- Data --");
		tableModel.addColumn(" -- Nome Cliente --");
		tableModel.addColumn(" -- Equipamento --");
		tableModel.addColumn(" -- T�cnico Respons�vel --");
		
		if (OrdemServicoInternaProcessa.os.size() != 0) {
			preencheTabela();
		}
		table = new JTable(tableModel);
		table.setEnabled(false);
		scroll = new JScrollPane(table);
		scroll.setBounds(40, 665, 655, 215);
		painel.add(scroll);

		create.addActionListener(this);
		read.addActionListener(this);
		update.addActionListener(this);
		delete.addActionListener(this);

		update.setEnabled(false);
		delete.setEnabled(false);
	}
	



	private void preencheTabela() {
		int totLinhas = tableModel.getRowCount();
		if (tableModel.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModel.removeRow(0);
			}
		}
		for (OrdemServicoInterna osi : OrdemServicoInternaProcessa.os) {
			tableModel.addRow(new String[] { String.format("%d", osi.getId()),osi.getData(), osi.getNomeCliente(), osi.getEquipamento(), osi.getTecnico()});
		}
		
	}
	
	private void limparCampos() {
		
		tfData.setText("");
		tfNomeCliente.setText("");
		tfAcessorio.setText("");
		tfNumeroSerie.setText("");
		tfNumeroSerie.setText("");
		tfServicoExecutado.setText("");
		tfPecaUtilizada.setText("");
		tfpecaUtilizada01.setText("");
		tfpecaUtilizada02.setText("");
		tfqtdUtilizada.setText("");
		tfqtdUtilizada01.setText("");
		tfqtdUtilizada02.setText("");
		tfPecaSerialNumber.setText("");
		tfpecaSerialNumber01.setText("");
		tfpecaSerialNumber02.setText("");
		
	}
	
	private void create() {

		// o IF esta vendo se tem algum campo n�o preenchido
		if (tfData.getText().length() != 0 && tfNomeCliente.getText().length() != 0) {

			OrdemServicoInternaProcessa.os.add(new OrdemServicoInterna(Integer.parseInt(tfID.getText()),tfData.getText(),tfNomeCliente.getText(),
					cbEquipamento.getSelectedItem().toString(),tfAcessorio.getText(), tfNumeroSerie.getText(),tfDefeito.getText(),tfServicoExecutado.getText(),tfPecaUtilizada.getText(),tfpecaUtilizada01.getText(),tfpecaUtilizada02.getText(), Integer.parseInt(tfqtdUtilizada.getText()),
					Integer.parseInt(tfqtdUtilizada01.getText()),Integer.parseInt(tfqtdUtilizada02.getText()),tfPecaSerialNumber.getText(),tfpecaSerialNumber01.getText(),tfpecaSerialNumber02.getText(),cbTecnico.getSelectedItem().toString()));

			preencheTabela();
			limparCampos();
			OrdemServicoInternaProcessa.salvar();

		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
	}
	
	private void read(){
		String text = JOptionPane.showInputDialog(this, "Digite o id do item");
		try {
			int id = Integer.parseInt(text);

			boolean existe = false;
			for (OrdemServicoInterna m : OrdemServicoInternaProcessa.os) {
				if (m.getId() == id) {
					int indice = OrdemServicoInternaProcessa.os.indexOf(m);
					tfID.setText(String.format("%d", OrdemServicoInternaProcessa.os.get(indice).getId()));
					tfData.setText(OrdemServicoInternaProcessa.os.get(indice).getData());
					tfNomeCliente.setText(OrdemServicoInternaProcessa.os.get(indice).getNomeCliente());
					cbEquipamento.setSelectedItem(OrdemServicoInternaProcessa.os.get(indice).getEquipamento());
					tfAcessorio.setText(OrdemServicoInternaProcessa.os.get(indice).getAcessorio());
					tfNumeroSerie.setText(OrdemServicoInternaProcessa.os.get(indice).getNumeroSerie());
					tfDefeito.setText(OrdemServicoInternaProcessa.os.get(indice).getDefeito());
					tfServicoExecutado.setText(OrdemServicoInternaProcessa.os.get(indice).getServicoExecutado());
					tfPecaUtilizada.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaUtilizada());
					tfpecaUtilizada01.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaUtilizada01());
					tfpecaUtilizada02.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaUtilizada02());
					tfqtdUtilizada.setText(String.format("%d", OrdemServicoInternaProcessa.os.get(indice).getQtdUtilizada()));
					tfqtdUtilizada01.setText(String.format("%d", OrdemServicoInternaProcessa.os.get(indice).getQtdUtilizada01()));
					tfqtdUtilizada02.setText(String.format("%d", OrdemServicoInternaProcessa.os.get(indice).getQtdUtilizada02()));
					tfPecaSerialNumber.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaUtilizada());
					tfpecaSerialNumber01.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaSerialNumber01());
					tfpecaSerialNumber02.setText(OrdemServicoInternaProcessa.os.get(indice).getPecaSerialNumber02());
					cbTecnico.setSelectedItem(OrdemServicoInternaProcessa.os.get(indice).getTecnico());
					
					create.setEnabled(false);
					update.setEnabled(true);
					delete.setEnabled(true);
					
					
					OrdemServicoInternaProcessa.salvar();
					
				} 
			
			}
			if (existe) {
				JOptionPane.showMessageDialog(this, "Id inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Id inv�lido!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		

	}
	
	public static int calcId() {
		return OrdemServicoInternaProcessa.os.get(OrdemServicoInternaProcessa.os.size()-1).getId()+1;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == create) {
			create();
		}
		if (e.getSource() == read) {
			read();
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