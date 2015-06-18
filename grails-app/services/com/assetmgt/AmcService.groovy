package com.assetmgt

import grails.transaction.Transactional
import com.opencsv.*


class AmcException extends RuntimeException {
	String message
	Amc amc
}

@Transactional
class AmcService {

	/**
	 * Reads file contents as a stream, parse the csv file and save each record
	 * as AMC object
	 * @param instream
	 * @return
	 */
	int loadAMC(InputStream instream) {
		// Read file stream as a reader to parse the CSV file
		InputStreamReader reader = new InputStreamReader(instream)
		CSVReader csvreader = new CSVReader(reader)
		int l = 0
		for (String[] sa in csvreader){
			String name = sa[0]
			String email = sa[1]
			String website = sa[2] ?: ''
			//String address = sa[3] ?: ''
			Amc amc = new Amc(name:name, email:email, website:website)
			if (amc.save())
				l++
		}
		csvreader.close()
		return l;
	}
}
