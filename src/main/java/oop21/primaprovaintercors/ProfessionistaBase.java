package oop21.primaprovaintercors;

import java.util.ArrayList;

public class ProfessionistaBase implements ProfessionistaBaseInterface {
	private String matricola;
	private String cognome;
	private String nome;

	private ArrayList<Cliente> clientiSupportati;
	private int nrIncontriEffettuati;

	public ProfessionistaBase(String matricola, String cognome, String nome, ArrayList<Cliente> clientiSupportati,
			int nrIncontriEffettuati) {
		this.matricola = matricola;
		this.cognome = cognome;
		this.nome = nome;
		this.clientiSupportati = clientiSupportati;
		this.nrIncontriEffettuati = nrIncontriEffettuati;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void assistiCliente(Cliente cliente) { // TODO: chiedere se va bene questo
		throw new RuntimeException("Il metodo assistiCliente della classe base non dovrebbe essere chiamato");
	}

	public int getNumeroIncontriEffettuati() {
		return nrIncontriEffettuati;
	}

	public void setNumeroIncontriEffettuati(int numeroIncontriEffettuati) {
		this.nrIncontriEffettuati = numeroIncontriEffettuati;
	}

	public void incrementNumeroIncontriEffettuati() {
		++this.nrIncontriEffettuati;
	}

	public ArrayList<Cliente> getClientiPerCuiFareRelazione() {
		return clientiSupportati;
	}

	public void setClientiPerCuiFareRelazione(ArrayList<Cliente> clientiPerCuiFareRelazione) {
		this.clientiSupportati = clientiPerCuiFareRelazione;
	}

	public void addClientiPerCuiFareRelazione(Cliente cliente) {
		if (this.clientiSupportati == null)
			this.clientiSupportati = new ArrayList<Cliente>();
		this.clientiSupportati.add(cliente);
	}

	public void removeClientiPerCuiFareRelazione(Cliente cliente) {
		this.clientiSupportati.remove(cliente);
	}

	@Override
	public String toString() {
		return " matricola : " + matricola + ". Sr. " + nome + " " + cognome + ". nrIncontriEffettuati; "
				+ String.valueOf(nrIncontriEffettuati);
	}
}
