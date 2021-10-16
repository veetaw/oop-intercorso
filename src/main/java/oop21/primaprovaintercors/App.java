package oop21.primaprovaintercors;

import java.util.ArrayList;

public class App {
	private ArrayList<Cliente> clienti = new ArrayList<Cliente>();
	private StudioTecnico studioTecnico = null;
	
	public static void main(String[] args) {
		App app = new App();
		
		app.instanziaClienti();
		app.instanziaUfficioTecnico();
		app.createAppuntamenti();
		app.stampaProfessionistaConPiuIncontri();
		app.firmaRelazioni();
		app.stampaTuttiClienti();
		
	}
	
	public void instanziaClienti() {
		for (int i = 0; i < 30; ++i) {
			this.clienti.add(new Cliente("PGRRGADS", 0, new ArrayList<String>(), new ArrayList<Float>()));
		}
	}

	public void instanziaUfficioTecnico() {
		this.studioTecnico = new StudioTecnico(new ArrayList<ProfessionistaBase>());

		studioTecnico.addProfessionista(
				new TecnicoIscrittoAlbo("101230", "cognome", "nome", "specializzazione", 80, new ArrayList<Cliente>()));
		studioTecnico.addProfessionista(new TecnicoIscrittoAlbo("101231", "cognomeee", "nomeeee", "specializzazione", 2,
				new ArrayList<Cliente>()));
		studioTecnico.addProfessionista(new TecnicoIscrittoAlbo("101232", "cognomeeeee", "nomeeeeeee",
				"specializzazione", 140, new ArrayList<Cliente>()));

		for (int i = 0; i < 10; ++i) {
			String iString = String.valueOf(i);
			studioTecnico.addProfessionista(new TecnicoNonIscrittoAllAlbo("1123123" + iString, "nome " + iString,
					"cognome " + iString, new ArrayList<Cliente>(this.clienti.subList(i, i + 3)), i));
		}
	}

	public void createAppuntamenti() {
		for (int i = 0; i < 40; ++i) {
			this.studioTecnico.getProfessionisti()
					.get((int) (Math.random() * 100) % this.studioTecnico.getProfessionisti().size())
					.assistiCliente(this.clienti.get((int) (Math.random() * 100) % this.clienti.size()));
			;
		}
	}
	
	public void stampaProfessionistaConPiuIncontri() {
		System.out.println(this.studioTecnico.tecnicoMaxIncontri());
	}

	public void firmaRelazioni() {
		for( ProfessionistaBase p : this.studioTecnico.getProfessionisti() ) {
			if (p instanceof TecnicoIscrittoAlbo) {
				ArrayList<Cliente> clienti = p.getClientiPerCuiFareRelazione();
				for( int i = 0; i< clienti.size(); ++i) {
					((TecnicoIscrittoAlbo) p).firmaRelazioneTecnica(clienti.get(i));
				}
			}
		}
	}
	
	public void stampaTuttiClienti() {
		for (Cliente c : this.clienti) {
			System.out.println(c);
		}
	}
}
