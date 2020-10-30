/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.rspdefinitions;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Arrays;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;

import com.beanit.jasn1.compiler.pkix1explicit88.Certificate;
import com.beanit.jasn1.compiler.pkix1explicit88.CertificateList;
import com.beanit.jasn1.compiler.pkix1explicit88.Time;
import com.beanit.jasn1.compiler.pkix1implicit88.SubjectKeyIdentifier;

public class AuthenticateServerResponse implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 56);

	public AuthenticateResponseOk authenticateResponseOk = null;
	public AuthenticateResponseError authenticateResponseError = null;
	
	public AuthenticateServerResponse() {
	}

	public AuthenticateServerResponse(byte[] code) {
		this.code = code;
	}

	public AuthenticateServerResponse(AuthenticateResponseOk authenticateResponseOk, AuthenticateResponseError authenticateResponseError) {
		this.authenticateResponseOk = authenticateResponseOk;
		this.authenticateResponseError = authenticateResponseError;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"authenticateResponseOk",
		"authenticateResponseError"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "authenticateResponseOk":
				return authenticateResponseOk;
			case "authenticateResponseError":
				return authenticateResponseError;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "authenticateResponseOk":
				return AuthenticateResponseOk.class;
			case "authenticateResponseError":
				return AuthenticateResponseError.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "authenticateResponseOk":
				authenticateResponseOk = (AuthenticateResponseOk) value;
				break;
			case "authenticateResponseError":
				authenticateResponseError = (AuthenticateResponseError) value;
				break;
			default:
				throw new IllegalArgumentException("Unknown field " + fieldName);
		}
	}
	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (authenticateResponseError != null) {
			codeLength += authenticateResponseError.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (authenticateResponseOk != null) {
			codeLength += authenticateResponseOk.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
			codeLength += 1;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		BerLength length = new BerLength();
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		codeLength += length.decode(is);
		codeLength += berTag.decode(is);

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			authenticateResponseOk = new AuthenticateResponseOk();
			codeLength += authenticateResponseOk.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			authenticateResponseError = new AuthenticateResponseError();
			codeLength += authenticateResponseError.decode(is, false);
			return codeLength;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (authenticateResponseOk != null) {
			sb.append("authenticateResponseOk: ");
			authenticateResponseOk.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (authenticateResponseError != null) {
			sb.append("authenticateResponseError: ");
			authenticateResponseError.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

