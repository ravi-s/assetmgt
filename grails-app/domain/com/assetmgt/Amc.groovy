package com.assetmgt
/**
 * 
 * @author Ravishankar
 * <p> Description: Asset Management Company domain class</p>
 */
class Amc {

	String name
	String email
	String website
	String address
	Date dateCreated
	Date lastUpdated
    static constraints = {
		name blank:false
		email email:true, nullable:true
		website nullable:true, url:true
		address nullable:true, maxSize: 500
		
    }
}
