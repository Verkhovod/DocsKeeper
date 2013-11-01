package com.docskeeper.model.entries;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;

public class BaseTest {
	protected static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		validator = validatorFactory.getValidator();
	}

}
