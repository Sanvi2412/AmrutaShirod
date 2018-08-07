package org

import geb.Page

class LoginPageObject  extends Page{
	
	static content={
		name = {$("input" , "#userName")}
			}
	static content1={
		password = {$("input" , "#password")}
	}
	static content2={
		loginbutton = {$("input" , "#login")}
	}

}
