/**
 * 
 */
package tvRater;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is the test driver class for TVRater
 */
public class TVTimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// variables
		
		String line;
		ArrayList<TVRater> programmes = new ArrayList<TVRater>();
		String[] lineSplit;
		int ratingAsInt;
		double audienceAsDouble;
		
		File file = new File("TVProgrammes.csv");
		File fileBBC = new File("BBCProgrammes.csv");
		
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(fileBBC);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Removing the column header
			
			br.readLine();
			
			// first line input
			
			line = br.readLine();
			
			while (line != null) {
				
			lineSplit = line.split(",");
			ratingAsInt = Integer.parseInt(lineSplit[2]);
			audienceAsDouble = Double.parseDouble(lineSplit[3]);
			
			TVRater program = new TVRater(lineSplit[0], lineSplit[1], ratingAsInt, audienceAsDouble);
			
			programmes.add(program);
			
			line = br.readLine();
				
			}
			
			displayAllInfo(programmes);
			
			System.out.println();
			
			String broadcaster = "BBC";
			
			System.out.println("Programs on " + broadcaster + " : ");
			
			displayToConsoleAndPrintToCSV(programmes, bw, broadcaster);
			
			
			br.close();
			fr.close();
			
			bw.close();
			fw.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

	/**
	 * 
	 * This method identifies the programmes of a specified broadcaster, prints them to console and writes those to a CSV file called BBCProgrammes.csv
	 * 
	 * @param programmes
	 * @param bw
	 * @param broadcaster
	 * @throws IOException
	 */
	public static void displayToConsoleAndPrintToCSV(ArrayList<TVRater> programmes, BufferedWriter bw,
			String broadcaster) throws IOException {
		for (TVRater t : programmes) {
			if (t.getBroadcaster().equalsIgnoreCase(broadcaster)) {
				System.out.println(t.getProgrammeName());
				bw.write(t.getProgrammeName());
				bw.newLine();
				
			}
		}
	}
	
	public static void displayAllInfo(ArrayList<TVRater> programmes){
		for (TVRater p : programmes) {
			System.out.println("Programme Name \t: " + p.getProgrammeName());
			System.out.println("Broadcaster \t: " + p.getBroadcaster());
			System.out.println("Rating \t\t: " + p.getRating());
			System.out.println("Audience \t: " + p.getAudience());
			System.out.println("____________________________________");
			
		}
	}

}
