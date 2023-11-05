package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filePath = mappe + "/" + filnavn; // get the file path first, or make the file path with the file

		
		try (PrintWriter writer = new PrintWriter(new File(filePath))) {
            Innlegg[] innleggtabell = samling.getSamling();
            
            writer.println(samling.getAntall());
            for (Innlegg innlegg : innleggtabell) {
                if (innlegg != null) {
                	String strToWrite = innlegg.toString();
                	strToWrite = strToWrite.substring(0, strToWrite.length() - 1);
                	
                    writer.println(strToWrite); // bruker toString() fra før
                }
            }
            
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
		
	}
}
