package org.sample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Failure implements IAnnotationTransformer {

	public void transform(ITestAnnotation ann, Class arg1, Constructor arg2, Method arg3) {
		ann.setRetryAnalyzer(Multirunlogic.class);
	}


}
