package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		int counter = 0;
		for (int x = 0; x < this.innleggtabell.length; x++) {
			if (this.innleggtabell[x] != null) {
				counter++;
			}
		}
		return counter;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggtabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int x = 0; x < this.getAntall(); x++) {
			if (this.innleggtabell[x].getId() == (innlegg.getId())){
				System.out.println(x);
				return x;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int x = 0; x < this.getAntall(); x++) {
			if (this.innleggtabell[x].equals(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return this.innleggtabell.length > nesteledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		for (int x = 0; x < nesteledig; x++) {
	        if (this.innleggtabell[x].getId() == innlegg.getId()) {
	            return false; // Innlegg with the same ID already exists, return false
	        }
	    }
	    
	    if (nesteledig < innleggtabell.length) {
	        this.innleggtabell[nesteledig] = innlegg;
	        this.nesteledig++;
	        return true; // Successfully added the innlegg, return true
	    }
	    
	    return false; // No available space in the array, return false
	}
	
	public String toString() {
		// 2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n
		String result = "" + getAntall() + "\n";
		for (int x = 0; x < getAntall(); x++) {
			String strToAdd = this.innleggtabell[x].toString();
			result += strToAdd;
		}
		return result;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}