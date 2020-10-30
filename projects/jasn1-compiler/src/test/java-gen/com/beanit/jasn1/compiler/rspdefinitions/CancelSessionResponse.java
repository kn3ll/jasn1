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

public class CancelSessionResponse implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 65);

	public CancelSessionResponseOk cancelSessionResponseOk = null;
	public BerInteger cancelSessionResponseError = null;
	
	public CancelSessionResponse() {
	}

	public CancelSessionResponse(byte[] code) {
		this.code = code;
	}

	public CancelSessionResponse(CancelSessionResponseOk cancelSessionResponseOk, BerInteger cancelSessionResponseError) {
		this.cancelSessionResponseOk = cancelSessionResponseOk;
		this.cancelSessionResponseError = cancelSessionResponseError;
	}

	private final transient List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"cancelSessionResponseOk",
		"cancelSessionResponseError"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "cancelSessionResponseOk":
				return cancelSessionResponseOk;
			case "cancelSessionResponseError":
				return cancelSessionResponseError;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "cancelSessionResponseOk":
				return CancelSessionResponseOk.class;
			case "cancelSessionResponseError":
				return BerInteger.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "cancelSessionResponseOk":
				cancelSessionResponseOk = (CancelSessionResponseOk) value;
				break;
			case "cancelSessionResponseError":
				cancelSessionResponseError = (BerInteger) value;
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
		if (cancelSessionResponseError != null) {
			codeLength += cancelSessionResponseError.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (cancelSessionResponseOk != null) {
			codeLength += cancelSessionResponseOk.encode(reverseOS, false);
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
			cancelSessionResponseOk = new CancelSessionResponseOk();
			codeLength += cancelSessionResponseOk.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			cancelSessionResponseError = new BerInteger();
			codeLength += cancelSessionResponseError.decode(is, false);
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

		if (cancelSessionResponseOk != null) {
			sb.append("cancelSessionResponseOk: ");
			cancelSessionResponseOk.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cancelSessionResponseError != null) {
			sb.append("cancelSessionResponseError: ").append(cancelSessionResponseError);
			return;
		}

		sb.append("<none>");
	}

}

