package oop21.primaprovaintercors;

import java.util.ArrayList;

public class StudioTecnico {
	private ArrayList<ProfessionistaBase> professionisti;

	public StudioTecnico(ArrayList<ProfessionistaBase> professionisti) {
		this.professionisti = professionisti;
	}
	
	public ArrayList<ProfessionistaBase> getProfessionisti() {
		return this.professionisti;
	}

	public void setProfessionisti(ArrayList<ProfessionistaBase> professionisti) {
		this.professionisti = professionisti;
	}

	public void addProfessionista(ProfessionistaBase professionista) {
		this.professionisti.add(professionista);
	}

	public void effettuaIncontro(String matricolaProfessionista, Cliente cliente) {
		ProfessionistaBase professionistaTrovato = null;

		for (ProfessionistaBase p : this.professionisti) {
			if (p.getMatricola() == matricolaProfessionista) {
				professionistaTrovato = p;
			}
		}

		if (professionistaTrovato == null) {
			throw new RuntimeException(
					"Il professionista con la matricola passata non è presente nello studio tecnico. ");
		}

		if (professionistaTrovato.getNumeroIncontriEffettuati() < 100)
			professionistaTrovato.assistiCliente(cliente);
	}
	
	public ProfessionistaBase tecnicoMaxIncontri() {
		ProfessionistaBase professionistaMaxIncontri = null;
		
		for (ProfessionistaBase p : this.professionisti) {
			if (professionistaMaxIncontri == null )
				professionistaMaxIncontri = p;
			
			else if (p.getNumeroIncontriEffettuati() > professionistaMaxIncontri.getNumeroIncontriEffettuati()) {
				professionistaMaxIncontri = p;
			}
		}
		
		if (professionistaMaxIncontri == null) throw new RuntimeException("non ci sono professionisti nello studio tecnico");
		
		return professionistaMaxIncontri;
	}
}
