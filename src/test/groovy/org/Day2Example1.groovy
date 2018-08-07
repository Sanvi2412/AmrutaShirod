package org;

import spock.lang.Specification


class Day2Example1 extends Specification{
	
	def "scenario:Addition"(){
		
		given:"An integer with value 4 and 5"
		def i=4
		def j=5
		
		when:"Both numbers is added"
		def a=i+j
		
		then:"Final value is"
		println(a)	
	
	}
	
	def "scenario:Subtraction"(){
		
		given:"An integer with value 10 and 5"
		def i=10
		def j=5
		
		when:"Both numbers is subtracted"
		def s=i-j
		
		then:"Final value is"
		println(s)
		
	}
	
	def "scenario:Multiplication"(){
		
		given:"An integer with value 4 and 5"
		def i=4
		def j=5
		
		when:"Both numbers is multiplied"
		def m=i*j
		
		then:"Final value is"
		println(m)
		
	}
	
	def "scenario:Division"(){
		
		given:"An integer with value 10 and 5"
		def i=10
		def j=5
		
		when:"Both numbers is divides"
		def d=i/j
		
		then:"Final value is"
		println(d)
		
		
	}


}
