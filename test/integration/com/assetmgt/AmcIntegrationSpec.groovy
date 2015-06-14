package com.assetmgt

import grails.test.spock.IntegrationSpec
import spock.lang.*

class AmcIntegrationSpec extends IntegrationSpec {

    
    void "test existence of an AMC in db"() {
		given: " An AMC"
			def amc = new Amc(name: "SBI Funds Management Private Ltd.", 
				email:"partnerforlife@sbimf.com", website:"http://www.sbimf.com")
	    when: "AMC is saved"
			amc.save(failOnError:true)
		then: " record saved and can be found in database"
			amc.id != null
			Amc.read(amc.id).name == amc.name
    }
}
