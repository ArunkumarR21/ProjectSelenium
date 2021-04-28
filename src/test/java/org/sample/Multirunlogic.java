package org.sample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Multirunlogic implements IRetryAnalyzer {
	int min = 0, max = 5;

	public boolean retry(ITestResult arg0) {
		if(min<max) {
		
		return true;
	}
	return false;
	}
}
