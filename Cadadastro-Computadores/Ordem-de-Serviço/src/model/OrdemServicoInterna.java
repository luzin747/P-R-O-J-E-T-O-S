package model;

import java.util.Currency;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Objects;

public class OrdemServicoInterna {

	// Atributos
	private int id;
	private String Data;
	private String nomeCliente;
	private String equipamento;
	private String acessorio;
	private String numeroSerie;
	private String defeito;
	private String servicoExecutado;
	private String pecaUtilizada;
	private String pecaUtilizada01;
	private String pecaUtilizada02;
	private int qtdUtilizada;
	private int qtdUtilizada01;
	private int qtdUtilizada02;
	private String pecaSerialNumber;
	private String pecaSerialNumber01;
	private String pecaSerialNumber02;
	private String tecnico;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");

	public OrdemServicoInterna(int id,String Data, String nomeCliente, String equipamento, String acessorio,
			String numeroSerie, String defeito, String servicoExecutado, String pecaUtilizada,String pecaUtilizada01,String pecaUtilizada02, int qtdUtilizada,
			int qtdUtilizada01, int qtdUtilizada02, String pecaSerialNumber,String pecaSerialNumber01,String pecaSerialNumber02, String tecnico) {
		
		this.id = id;
		this.Data = Data;
		this.nomeCliente = nomeCliente;
		this.equipamento = equipamento;
		this.acessorio = acessorio;
		this.numeroSerie = numeroSerie;
		this.defeito = defeito;
		this.servicoExecutado = servicoExecutado;
		this.pecaUtilizada = pecaUtilizada;
		this.pecaUtilizada01 = pecaUtilizada01;
		this.pecaUtilizada02 = pecaUtilizada02;
		this.qtdUtilizada = qtdUtilizada;
		this.qtdUtilizada01 = qtdUtilizada01;
		this.qtdUtilizada02 = qtdUtilizada01;
		this.pecaSerialNumber = pecaSerialNumber;
		this.pecaSerialNumber01 = pecaSerialNumber01;
		this.pecaSerialNumber02 = pecaSerialNumber02;
		this.tecnico = tecnico;
	}

	public OrdemServicoInterna(String linha) throws ParseException {
		df.setCurrency(Currency.getInstance(BRASIL));
		
		Integer.parseInt(linha.split(";")[0]);
		this.Data = linha.split(";")[1];
		this.nomeCliente = linha.split(";")[2];
		this.equipamento = linha.split(";")[3];
		this.acessorio = linha.split(";")[4];
		this.numeroSerie = linha.split(";")[5];
		this.defeito = linha.split(";")[6];
		this.servicoExecutado = linha.split(";")[7];
		this.pecaUtilizada = linha.split(";")[8];
		this.pecaUtilizada01 = linha.split(";")[9];
		this.pecaUtilizada02 = linha.split(";")[10];
		this.qtdUtilizada = Integer.parseInt(linha.split(";")[11]);
		this.qtdUtilizada01 = Integer.parseInt(linha.split(";")[12]);
		this.qtdUtilizada02 = Integer.parseInt(linha.split(";")[13]);
		this.pecaSerialNumber = linha.split(";")[14];
		this.pecaSerialNumber01 = linha.split(";")[15];
		this.pecaSerialNumber02 = linha.split(";")[16];
		this.tecnico = linha.split(";")[17];

	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
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

	public String getPecaUtilizada01() {
		return pecaUtilizada01;
	}

	public void setPecaUtilizada01(String pecaUtilizada01) {
		this.pecaUtilizada01 = pecaUtilizada01;
	}

	public String getPecaUtilizada02() {
		return pecaUtilizada02;
	}

	public void setPecaUtilizada02(String pecaUtilizada02) {
		this.pecaUtilizada02 = pecaUtilizada02;
	}

	public int getQtdUtilizada() {
		return qtdUtilizada;
	}

	public void setQtdUtilizada(int qtdUtilizada) {
		this.qtdUtilizada = qtdUtilizada;
	}

	public int getQtdUtilizada01() {
		return qtdUtilizada01;
	}

	public void setQtdUtilizada01(int qtdUtilizada01) {
		this.qtdUtilizada01 = qtdUtilizada01;
	}

	public int getQtdUtilizada02() {
		return qtdUtilizada02;
	}

	public void setQtdUtilizada02(int qtdUtilizada02) {
		this.qtdUtilizada02 = qtdUtilizada02;
	}

	public String getPecaSerialNumber() {
		return pecaSerialNumber;
	}

	public void setPecaSerialNumber(String pecaSerialNumber) {
		this.pecaSerialNumber = pecaSerialNumber;
	}

	public String getPecaSerialNumber01() {
		return pecaSerialNumber01;
	}

	public void setPecaSerialNumber01(String pecaSerialNumber01) {
		this.pecaSerialNumber01 = pecaSerialNumber01;
	}

	public String getPecaSerialNumber02() {
		return pecaSerialNumber02;
	}

	public void setPecaSerialNumber02(String pecaSerialNumber02) {
		this.pecaSerialNumber02 = pecaSerialNumber02;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BRASIL == null) ? 0 : BRASIL.hashCode());
		result = prime * result + ((Data == null) ? 0 : Data.hashCode());
		result = prime * result + ((acessorio == null) ? 0 : acessorio.hashCode());
		result = prime * result + ((defeito == null) ? 0 : defeito.hashCode());
		result = prime * result + ((df == null) ? 0 : df.hashCode());
		result = prime * result + ((equipamento == null) ? 0 : equipamento.hashCode());
		result = prime * result + id;
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + ((numeroSerie == null) ? 0 : numeroSerie.hashCode());
		result = prime * result + ((pecaSerialNumber == null) ? 0 : pecaSerialNumber.hashCode());
		result = prime * result + ((pecaSerialNumber01 == null) ? 0 : pecaSerialNumber01.hashCode());
		result = prime * result + ((pecaSerialNumber02 == null) ? 0 : pecaSerialNumber02.hashCode());
		result = prime * result + ((pecaUtilizada == null) ? 0 : pecaUtilizada.hashCode());
		result = prime * result + ((pecaUtilizada01 == null) ? 0 : pecaUtilizada01.hashCode());
		result = prime * result + ((pecaUtilizada02 == null) ? 0 : pecaUtilizada02.hashCode());
		result = prime * result + qtdUtilizada;
		result = prime * result + qtdUtilizada01;
		result = prime * result + qtdUtilizada02;
		result = prime * result + ((servicoExecutado == null) ? 0 : servicoExecutado.hashCode());
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
		return result;
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
		if (BRASIL == null) {
			if (other.BRASIL != null)
				return false;
		} else if (!BRASIL.equals(other.BRASIL))
			return false;
		if (Data == null) {
			if (other.Data != null)
				return false;
		} else if (!Data.equals(other.Data))
			return false;
		if (acessorio == null) {
			if (other.acessorio != null)
				return false;
		} else if (!acessorio.equals(other.acessorio))
			return false;
		if (defeito == null) {
			if (other.defeito != null)
				return false;
		} else if (!defeito.equals(other.defeito))
			return false;
		if (df == null) {
			if (other.df != null)
				return false;
		} else if (!df.equals(other.df))
			return false;
		if (equipamento == null) {
			if (other.equipamento != null)
				return false;
		} else if (!equipamento.equals(other.equipamento))
			return false;
		if (id != other.id)
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (numeroSerie == null) {
			if (other.numeroSerie != null)
				return false;
		} else if (!numeroSerie.equals(other.numeroSerie))
			return false;
		if (pecaSerialNumber == null) {
			if (other.pecaSerialNumber != null)
				return false;
		} else if (!pecaSerialNumber.equals(other.pecaSerialNumber))
			return false;
		if (pecaSerialNumber01 == null) {
			if (other.pecaSerialNumber01 != null)
				return false;
		} else if (!pecaSerialNumber01.equals(other.pecaSerialNumber01))
			return false;
		if (pecaSerialNumber02 == null) {
			if (other.pecaSerialNumber02 != null)
				return false;
		} else if (!pecaSerialNumber02.equals(other.pecaSerialNumber02))
			return false;
		if (pecaUtilizada == null) {
			if (other.pecaUtilizada != null)
				return false;
		} else if (!pecaUtilizada.equals(other.pecaUtilizada))
			return false;
		if (pecaUtilizada01 == null) {
			if (other.pecaUtilizada01 != null)
				return false;
		} else if (!pecaUtilizada01.equals(other.pecaUtilizada01))
			return false;
		if (pecaUtilizada02 == null) {
			if (other.pecaUtilizada02 != null)
				return false;
		} else if (!pecaUtilizada02.equals(other.pecaUtilizada02))
			return false;
		if (qtdUtilizada != other.qtdUtilizada)
			return false;
		if (qtdUtilizada01 != other.qtdUtilizada01)
			return false;
		if (qtdUtilizada02 != other.qtdUtilizada02)
			return false;
		if (servicoExecutado == null) {
			if (other.servicoExecutado != null)
				return false;
		} else if (!servicoExecutado.equals(other.servicoExecutado))
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + Data + nomeCliente + equipamento + acessorio + numeroSerie + defeito + servicoExecutado + pecaUtilizada
				+ qtdUtilizada + pecaSerialNumber + tecnico + "\n";
	}

	public String toCSV() {
		return id + Data + nomeCliente + equipamento + acessorio + numeroSerie + defeito + servicoExecutado + pecaUtilizada
				+ qtdUtilizada + pecaSerialNumber + tecnico + "\n";
	}

}
