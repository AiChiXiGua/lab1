package com.company;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		plusMinusExpressions<String,Integer,String,Integer> tempPme = new plusMinusExpressions<>();
		String exp = "4*y*z^2";
		String input = "!simplify x=2";
		Main m = new Main();
		String output = m.dealInput(input, exp);
		 if (output.contains("!")) {
             exp = output.replace("!","");
             output = exp;
         }
		String testresult = "4*y*z^2";
		assertEquals(output, testresult);
	}
}
