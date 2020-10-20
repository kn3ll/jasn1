/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.compile_test;

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


public class MyChoice2 implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static class Element1 implements BerChoice, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		public BerInteger test = null;
		
		public Element1() {
		}

		public Element1(byte[] code) {
			this.code = code;
		}

		public Element1(BerInteger test) {
			this.test = test;
		}

		private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		));
		public List<String> getFields() {
			return FIELDS;
		}
		public BerType getField(String fieldName) {
			switch(fieldName) {
				case "test":
					return test;
				default:
					return null;
			}
		}
		public Class<? extends BerType> getFieldClass(String fieldName) {
			switch(fieldName) {
				case "test":
					return BerInteger.class;
				default:
					return null;
			}
		}
		public void setField(String fieldName, BerType value) {
			switch(fieldName) {
				case "test":
					test = (BerInteger) value;
					break;
				default:
					throw new IllegalArgumentException("Unknown field " + fieldName);
			}
		}
		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (test != null) {
				codeLength += test.encode(reverseOS, true);
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerInteger.tag)) {
				test = new BerInteger();
				codeLength += test.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (test != null) {
				sb.append("test: ").append(test);
				return;
			}

			sb.append("<none>");
		}

	}

	public static class Element4 implements BerChoice, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		public BerInteger test = null;
		public BerBoolean test2 = null;
		
		public Element4() {
		}

		public Element4(byte[] code) {
			this.code = code;
		}

		public Element4(BerInteger test, BerBoolean test2) {
			this.test = test;
			this.test2 = test2;
		}

		private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		));
		public List<String> getFields() {
			return FIELDS;
		}
		public BerType getField(String fieldName) {
			switch(fieldName) {
				case "test":
					return test;
				case "test2":
					return test2;
				default:
					return null;
			}
		}
		public Class<? extends BerType> getFieldClass(String fieldName) {
			switch(fieldName) {
				case "test":
					return BerInteger.class;
				case "test2":
					return BerBoolean.class;
				default:
					return null;
			}
		}
		public void setField(String fieldName, BerType value) {
			switch(fieldName) {
				case "test":
					test = (BerInteger) value;
					break;
				case "test2":
					test2 = (BerBoolean) value;
					break;
				default:
					throw new IllegalArgumentException("Unknown field " + fieldName);
			}
		}
		public int encode(OutputStream reverseOS) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					reverseOS.write(code[i]);
				}
				return code.length;
			}

			int codeLength = 0;
			if (test2 != null) {
				codeLength += test2.encode(reverseOS, true);
				return codeLength;
			}
			
			if (test != null) {
				codeLength += test.encode(reverseOS, true);
				return codeLength;
			}
			
			throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
		}

		public int decode(InputStream is) throws IOException {
			return decode(is, null);
		}

		public int decode(InputStream is, BerTag berTag) throws IOException {

			int codeLength = 0;
			BerTag passedTag = berTag;

			if (berTag == null) {
				berTag = new BerTag();
				codeLength += berTag.decode(is);
			}

			if (berTag.equals(BerInteger.tag)) {
				test = new BerInteger();
				codeLength += test.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerBoolean.tag)) {
				test2 = new BerBoolean();
				codeLength += test2.decode(is, false);
				return codeLength;
			}

			if (passedTag != null) {
				return 0;
			}

			throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
		}

		public void encodeAndSave(int encodingSizeGuess) throws IOException {
			ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
			encode(reverseOS);
			code = reverseOS.getArray();
		}

		public String toString() {
			StringBuilder sb = new StringBuilder();
			appendAsString(sb, 0);
			return sb.toString();
		}

		public void appendAsString(StringBuilder sb, int indentLevel) {

			if (test != null) {
				sb.append("test: ").append(test);
				return;
			}

			if (test2 != null) {
				sb.append("test2: ").append(test2);
				return;
			}

			sb.append("<none>");
		}

	}

	public Element1 element1 = null;
	public BerInteger element2 = null;
	public BerBoolean myboolean = null;
	public Element4 element4 = null;
	
	public MyChoice2() {
	}

	public MyChoice2(byte[] code) {
		this.code = code;
	}

	public MyChoice2(Element1 element1, BerInteger element2, BerBoolean myboolean, Element4 element4) {
		this.element1 = element1;
		this.element2 = element2;
		this.myboolean = myboolean;
		this.element4 = element4;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "element1":
				return element1;
			case "element2":
				return element2;
			case "myboolean":
				return myboolean;
			case "element4":
				return element4;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "element1":
				return Element1.class;
			case "element2":
				return BerInteger.class;
			case "myboolean":
				return BerBoolean.class;
			case "element4":
				return Element4.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "element1":
				element1 = (Element1) value;
				break;
			case "element2":
				element2 = (BerInteger) value;
				break;
			case "myboolean":
				myboolean = (BerBoolean) value;
				break;
			case "element4":
				element4 = (Element4) value;
				break;
			default:
				throw new IllegalArgumentException("Unknown field " + fieldName);
		}
	}
	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (element4 != null) {
			codeLength += element4.encode(reverseOS);
			return codeLength;
		}
		
		if (myboolean != null) {
			codeLength += myboolean.encode(reverseOS, true);
			return codeLength;
		}
		
		if (element2 != null) {
			codeLength += element2.encode(reverseOS, true);
			return codeLength;
		}
		
		if (element1 != null) {
			codeLength += element1.encode(reverseOS);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		element1 = new Element1();
		int choiceDecodeLength = element1.decode(is, berTag);
		if (choiceDecodeLength != 0) {
			return codeLength + choiceDecodeLength;
		}
		else {
			element1 = null;
		}

		if (berTag.equals(BerInteger.tag)) {
			element2 = new BerInteger();
			codeLength += element2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerBoolean.tag)) {
			myboolean = new BerBoolean();
			codeLength += myboolean.decode(is, false);
			return codeLength;
		}

		element4 = new Element4();
		choiceDecodeLength = element4.decode(is, berTag);
		if (choiceDecodeLength != 0) {
			return codeLength + choiceDecodeLength;
		}
		else {
			element4 = null;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (element1 != null) {
			sb.append("element1: ");
			element1.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (element2 != null) {
			sb.append("element2: ").append(element2);
			return;
		}

		if (myboolean != null) {
			sb.append("myboolean: ").append(myboolean);
			return;
		}

		if (element4 != null) {
			sb.append("element4: ");
			element4.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

