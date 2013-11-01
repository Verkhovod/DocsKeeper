package com.docskeeper.model.entries;

import java.util.Set;

import javax.validation.ConstraintViolation;

import junit.framework.TestCase;

import org.junit.Test;

import com.docskeeper.model.utilities.ValidationHelper;


public class UserTest extends BaseTest {

	private User user;

	@Test
	public void shouldThrowValidationErrorWhenConstructorArgumentsAreNull() {
		int exceptionsCount = 2;

		user = new User(null, null);
		Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);

		TestCase.assertEquals(exceptionsCount, constraintViolations.size());
		for (ConstraintViolation<User> msg : constraintViolations) {
			TestCase.assertEquals(ValidationHelper.MAY_NOT_BE_NULL, msg.getMessage());
		}
	}

}
