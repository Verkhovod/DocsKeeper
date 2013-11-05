package com.docskeeper.utils;

import org.jboss.security.auth.spi.Util;

/**
 * Utils class for base security operations
 * 
 * @author a.pryshchepa
 * @email vinglfm@gmail.com
 */
public class SecurityHelper {
	private static final String HASH_ALGORITHM = "MD5";
	private static final String HASH_ENCODING = "BASE64";

	/**
	 * @param password
	 *            plain password to hash
	 * @return hash of the specified password
	 */
	public static String createHashPassword(String password) {
		return Util.createPasswordHash(HASH_ALGORITHM, HASH_ENCODING, null,
				null, password);
	}
}
