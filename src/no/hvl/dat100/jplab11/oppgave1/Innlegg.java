package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

// https://github.com/dat100hib/dat100public/blob/master/programmering/jplab11/JP11.md

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		return this.bruker;
	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return this.dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return this.id;

	}

	public int getLikes() {
		return this.likes;

	}
	
	public void doLike () {
		this.likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		System.out.println(this.getId() + "" + innlegg.getId());
		// System.out.println(this.getId() + "" + innlegg.getBruker());
		return this.getId() == innlegg.getId();
 	}
	
	@Override
	public String toString() {
		// "1\nOle Olsen\n23-10\n7\n"
		return getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
