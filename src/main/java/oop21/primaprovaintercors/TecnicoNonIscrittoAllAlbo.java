package oop21.primaprovaintercors;

import java.util.ArrayList;

public class TecnicoNonIscrittoAllAlbo extends ProfessionistaBase implements ProfessionistaBaseInterface {
	public TecnicoNonIscrittoAllAlbo(String matricola, String cognome, String nome,
			ArrayList<Cliente> clientiSupportati, int nrIncontriEffettuati) {
		super(matricola, cognome, nome, clientiSupportati, nrIncontriEffettuati);
	}

	@Override
	public void assistiCliente(Cliente cliente) {
		ArrayList<String> documentiDaConsegnare = new ArrayList<String>();

		for (int i = 0; i < (int) (Math.random() * 100) % 3; ++i) {
			char c = (char) ((int) (Math.random() * 100) % 26 + 'A');
			documentiDaConsegnare.add("Certificato " + c);
		}

		// cliente.addDocumentoDaConsegnare(listaDocumenti.get((int) (Math.random() * 100) %
		// listaDocumenti.size() ));

		cliente.setDocumentiDaConsegnare(documentiDaConsegnare);
	}

	@Override
	public String toString() {
		return "Tecnico Non Iscritto all'albo. " + super.toString();
	}

}
