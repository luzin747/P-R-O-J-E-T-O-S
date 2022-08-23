package model;

import java.util.Currency;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;

public class OrdemServicoInterna {

	// Atributos
	private Date Data;
	private String nomeCliente;
	private String equipamento;
	private String acessorio;
	private String numeroSerie;
	private String defeito;
	private String servicoExecutado;
	private String pecaUtilizada;
	private int qtdUtilizada;
	private String pecaSerialNumber;
	private String tecnico;

	private final Locale BRASIL = new Locale("pt", "BR");
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private DecimalFormat df = new DecimalFormat("#.00");

	public OrdemServicoInterna(String Data, String nomeCliente, String equipamento, String acessorio,
			String numeroSerie, String defeito, String servicoExecutado, String pecaUtilizada, int qtdUtilizada,
			String pecaSerialNumber, String tecnico) {
		try {
			this.Data = sdf.parse(Data);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		this.nomeCliente = nomeCliente;
		this.equipamento = equipamento;
		this.acessorio = acessorio;
		this.numeroSerie = numeroSerie;
		this.defeito = defeito;
		this.servicoExecutado = servicoExecutado;
		this.pecaUtilizada = pecaUtilizada;
		this.qtdUtilizada = qtdUtilizada;
		this.pecaSerialNumber = pecaSerialNumber;
		this.tecnico = tecnico;
	}

	public OrdemServicoInterna(String linha) throws ParseException {
		df.setCurrency(Currency.getInstance(BRASIL));

		this.Data = sdf.parse(linha.split(";")[0]);
		this.nomeCliente = linha.split(";")[1];
		this.equipamento = linha.split(";")[2];
		this.acessorio = linha.split(";")[3];
		this.numeroSerie = linha.split(";")[4];
		this.defeito = linha.split(";")[5];
		this.servicoExecutado = linha.split(";")[6];
		this.pecaUtilizada = linha.split(";")[7];
		this.qtdUtilizada = Integer.parseInt(linha.split(";")[8]);
		this.pecaSerialNumber = linha.split(";")[9];
		this.tecnico = linha.split(";")[10];

	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

	public String getAcessorio() {
		return acessorio;
	}

	public void setAcessorio(String acessorio) {
		this.acessorio = acessorio;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getDefeito() {
		return defeito;
	}

	public void setDefeito(String defeito) {
		this.defeito = defeito;
	}

	public String getServicoExecutado() {
		return servicoExecutado;
	}

	public void setServicoExecutado(String servicoExecutado) {
		this.servicoExecutado = servicoExecutado;
	}

	public String getPecaUtilizada() {
		return pecaUtilizada;
	}

	public void setPecaUtilizada(String pecaUtilizada) {
		this.pecaUtilizada = pecaUtilizada;
	}

	public int getQtdUtilizada() {
		return qtdUtilizada;
	}

	public void setQtdUtilizada(int qtdUtilizada) {
		this.qtdUtilizada = qtdUtilizada;
	}

	public String getPecaSerialNumber() {
		return pecaSerialNumber;
	}

	public void setPecaSerialNumber(String pecaSerialNumber) {
		this.pecaSerialNumber = pecaSerialNumber;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
	}

	public Locale getBRASIL() {
		return BRASIL;
	}

	@Override
	public int hashCode() {
		return Objects.hash(BRASIL, Data, acessorio, defeito, df, equipamento, nomeCliente, numeroSerie,
				pecaSerialNumber, pecaUtilizada, qtdUtilizada, sdf, servicoExecutado, tecnico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemServicoInterna other = (OrdemServicoInterna) obj;
		return Objects.equals(BRASIL, other.BRASIL) && Objects.equals(Data, other.Data)
				&& Objects.equals(acessorio, other.acessorio) && Objects.equals(defeito, other.defeito)
				&& Objects.equals(df, other.df) && Objects.equals(equipamento, other.equipamento)
				&& Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(numeroSerie, other.numeroSerie)
				&& Objects.equals(pecaSerialNumber, other.pecaSerialNumber)
				&& Objects.equals(pecaUtilizada, other.pecaUtilizada) && qtdUtilizada == other.qtdUtilizada
				&& Objects.equals(sdf, other.sdf) && Objects.equals(servicoExecutado, other.servicoExecutado)
				&& Objects.equals(tecnico, other.tecnico);
	}

	@Override
	public String toString() {
		return Data + nomeCliente + equipamento + acessorio + numeroSerie + defeito + servicoExecutado + pecaUtilizada
				+ qtdUtilizada + pecaSerialNumber + tecnico;
	}

	public String toCSV() {
		return Data + nomeCliente + equipamento + acessorio + numeroSerie + defeito + servicoExecutado + pecaUtilizada
				+ qtdUtilizada + pecaSerialNumber + tecnico + "\r\n";
	}

}
