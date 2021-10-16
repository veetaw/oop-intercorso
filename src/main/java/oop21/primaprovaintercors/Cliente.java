package oop21.primaprovaintercors;

import java.util.ArrayList;

public class Cliente {
	private String codiceFiscale;
	private int nrRelazioniTecnicheOttenute;
	private ArrayList<String> documentiDaConsegnare;
	private ArrayList<Float> speseSostenute;

	public Cliente(String codiceFiscale, int nrRelazioniTecnicheOttenute, ArrayList<String> documentiDaConsegnare,
			ArrayList<Float> speseSostenute) {
		this.codiceFiscale = codiceFiscale;
		this.nrRelazioniTecnicheOttenute = nrRelazioniTecnicheOttenute;
		this.documentiDaConsegnare = documentiDaConsegnare;
		this.speseSostenute = speseSostenute;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public int getNrRelazioniTecnicheOttenute() {
		return nrRelazioniTecnicheOttenute;
	}

	public void setNrRelazioniTecnicheOttenute(int nrRelazioniTecnicheOttenute) {
		this.nrRelazioniTecnicheOttenute = nrRelazioniTecnicheOttenute;
	}

	public void incrementaNrRelazioniTecnicheOttenute() {
		++this.nrRelazioniTecnicheOttenute;
	}

	public ArrayList<String> getDocumentiDaConsegnare() {
		return documentiDaConsegnare;
	}

	public void setDocumentiDaConsegnare(ArrayList<String> documentiDaConsegnare) {
		this.documentiDaConsegnare = documentiDaConsegnare;
	}

	public void addDocumentoDaConsegnare(String documento) {
		this.documentiDaConsegnare.add(documento);
	}

	public ArrayList<Float> getSpeseSostenute() {
		return speseSostenute;
	}

	public void setSpeseSostenute(ArrayList<Float> speseSostenute) {
		this.speseSostenute = speseSostenute;
	}

	@Override
	public String toString() {
		return "Cliente : c.f.: " + codiceFiscale + ". nrRelazioniTecnicheOttenute : "
				+ String.valueOf(nrRelazioniTecnicheOttenute);
	}
}
