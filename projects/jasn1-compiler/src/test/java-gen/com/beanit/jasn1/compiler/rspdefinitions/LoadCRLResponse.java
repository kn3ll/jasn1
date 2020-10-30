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

public class LoadCRLResponse implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 53);

	public LoadCRLResponseOk loadCRLResponseOk = null;
	public LoadCRLResponseError loadCRLResponseError = null;
	
	public LoadCRLResponse() {
	}

	public LoadCRLResponse(byte[] code) {
		this.code = code;
	}

	public LoadCRLResponse(LoadCRLResponseOk loadCRLResponseOk, LoadCRLResponseError loadCRLResponseError) {
		this.loadCRLResponseOk = loadCRLResponseOk;
		this.loadCRLResponseError = loadCRLResponseError;
	}

	private final transient List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"loadCRLResponseOk",
		"loadCRLResponseError"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "loadCRLResponseOk":
				return loadCRLResponseOk;
			case "loadCRLResponseError":
				return loadCRLResponseError;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "loadCRLResponseOk":
				return LoadCRLResponseOk.class;
			case "loadCRLResponseError":
				return LoadCRLResponseError.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "loadCRLResponseOk":
				loadCRLResponseOk = (LoadCRLResponseOk) value;
				break;
			case "loadCRLResponseError":
				loadCRLResponseError = (LoadCRLResponseError) value;
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
		if (loadCRLResponseError != null) {
			codeLength += loadCRLResponseError.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
			codeLength += BerLength.encodeLength(reverseOS, codeLength);
			if (withTag) {
				codeLength += tag.encode(reverseOS);
			}
			return codeLength;
		}
		
		if (loadCRLResponseOk != null) {
			codeLength += loadCRLResponseOk.encode(reverseOS, false);
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
			loadCRLResponseOk = new LoadCRLResponseOk();
			codeLength += loadCRLResponseOk.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			loadCRLResponseError = new LoadCRLResponseError();
			codeLength += loadCRLResponseError.decode(is, false);
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

		if (loadCRLResponseOk != null) {
			sb.append("loadCRLResponseOk: ");
			loadCRLResponseOk.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (loadCRLResponseError != null) {
			sb.append("loadCRLResponseError: ").append(loadCRLResponseError);
			return;
		}

		sb.append("<none>");
	}

}

