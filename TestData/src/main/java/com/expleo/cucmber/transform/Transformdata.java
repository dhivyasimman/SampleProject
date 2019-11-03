package com.expleo.cucmber.transform;

import cucumber.api.Transformer;

public class Transformdata extends Transformer<String> {
	
	@Override
	public String transform(String args) {
		return args + " Transform";
	}

}
