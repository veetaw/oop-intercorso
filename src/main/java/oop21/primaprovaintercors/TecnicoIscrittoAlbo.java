package oop21.primaprovaintercors;

import java.util.ArrayList;

public class TecnicoIscrittoAlbo extends ProfessionistaBase implements ProfessionistaBaseInterface {
	private String specializzazione;

	public TecnicoIscrittoAlbo(String matricola, String cognome, String nome, String specializzazione,
			int numeroIncontriEffettuati, ArrayList<Cliente> clientiPerCuiFareRelazione) {
		super(matricola, cognome, nome, clientiPerCuiFareRelazione, numeroIncontriEffettuati);
		this.specializzazione = specializzazione;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public void firmaRelazioneTecnica(Cliente cliente) {
		if (this.getClientiPerCuiFareRelazione().contains(cliente)) {
			this.removeClientiPerCuiFareRelazione(cliente);
			cliente.incrementaNrRelazioniTecnicheOttenute();
		} else {
			throw new RuntimeException("Il cliente non ha prima fatto un incontro");
		}
	}

	@Override
	public void assistiCliente(Cliente cliente) {
		this.addClientiPerCuiFareRelazione(cliente);
		this.incrementNumeroIncontriEffettuati();
	}
	
	@Override
	public String toString() {
		return "Tecnico Iscritto all'albo. " + super.toString();
	}
}
