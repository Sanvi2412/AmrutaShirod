package org

import spock.lang.Specification
import spock.lang.Unroll

class DataDrivenExample extends Specification{
	@Unroll('#x and #y is equal to #z')
	def "data-Driven Testing"(){
		expect:"The sum of x and y is equal to z"
		z==x+y
		
		where :"The data table is given below"
		x |y |z
		10|20|30
		20|30|50
		5|15|30
		
	}
}
