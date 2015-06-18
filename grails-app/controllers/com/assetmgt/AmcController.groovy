package com.assetmgt

class AmcController {
	
	def amcService
	
	def loadamc() {
		
	}

	def uploadamc() {
		 def f = request.getFile('infile')
		if (f.contentType != 'text/csv') {
			flash.message = 'File you uploaded is not a csv file'
			redirect action:'loadamc'
		}
		// To do: else
	else {
		int records = amcService.loadAMC(f.inputStream)
		flash.message = "Uploaded $records for AMC"
	}
		
		
	} 
}
