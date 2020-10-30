/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pedefinitions;

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


public class ApplicationLoadPackage implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public ApplicationIdentifier loadPackageAID = null;
	public ApplicationIdentifier securityDomainAID = null;
	public BerOctetString nonVolatileCodeLimitC6 = null;
	public BerOctetString volatileDataLimitC7 = null;
	public BerOctetString nonVolatileDataLimitC8 = null;
	public BerOctetString hashValue = null;
	public BerOctetString loadBlockObject = null;
	
	public ApplicationLoadPackage() {
	}

	public ApplicationLoadPackage(byte[] code) {
		this.code = code;
	}

	public ApplicationLoadPackage(ApplicationIdentifier loadPackageAID, ApplicationIdentifier securityDomainAID, BerOctetString nonVolatileCodeLimitC6, BerOctetString volatileDataLimitC7, BerOctetString nonVolatileDataLimitC8, BerOctetString hashValue, BerOctetString loadBlockObject) {
		this.loadPackageAID = loadPackageAID;
		this.securityDomainAID = securityDomainAID;
		this.nonVolatileCodeLimitC6 = nonVolatileCodeLimitC6;
		this.volatileDataLimitC7 = volatileDataLimitC7;
		this.nonVolatileDataLimitC8 = nonVolatileDataLimitC8;
		this.hashValue = hashValue;
		this.loadBlockObject = loadBlockObject;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"loadPackageAID",
		"securityDomainAID",
		"nonVolatileCodeLimitC6",
		"volatileDataLimitC7",
		"nonVolatileDataLimitC8",
		"hashValue",
		"loadBlockObject"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "loadPackageAID":
				return loadPackageAID;
			case "securityDomainAID":
				return securityDomainAID;
			case "nonVolatileCodeLimitC6":
				return nonVolatileCodeLimitC6;
			case "volatileDataLimitC7":
				return volatileDataLimitC7;
			case "nonVolatileDataLimitC8":
				return nonVolatileDataLimitC8;
			case "hashValue":
				return hashValue;
			case "loadBlockObject":
				return loadBlockObject;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "loadPackageAID":
				return ApplicationIdentifier.class;
			case "securityDomainAID":
				return ApplicationIdentifier.class;
			case "nonVolatileCodeLimitC6":
				return BerOctetString.class;
			case "volatileDataLimitC7":
				return BerOctetString.class;
			case "nonVolatileDataLimitC8":
				return BerOctetString.class;
			case "hashValue":
				return BerOctetString.class;
			case "loadBlockObject":
				return BerOctetString.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "loadPackageAID":
				loadPackageAID = (ApplicationIdentifier) value;
				break;
			case "securityDomainAID":
				securityDomainAID = (ApplicationIdentifier) value;
				break;
			case "nonVolatileCodeLimitC6":
				nonVolatileCodeLimitC6 = (BerOctetString) value;
				break;
			case "volatileDataLimitC7":
				volatileDataLimitC7 = (BerOctetString) value;
				break;
			case "nonVolatileDataLimitC8":
				nonVolatileDataLimitC8 = (BerOctetString) value;
				break;
			case "hashValue":
				hashValue = (BerOctetString) value;
				break;
			case "loadBlockObject":
				loadBlockObject = (BerOctetString) value;
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
		codeLength += loadBlockObject.encode(reverseOS, false);
		// write tag: PRIVATE_CLASS, PRIMITIVE, 4
		reverseOS.write(0xC4);
		codeLength += 1;
		
		if (hashValue != null) {
			codeLength += hashValue.encode(reverseOS, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 1
			reverseOS.write(0xC1);
			codeLength += 1;
		}
		
		if (nonVolatileDataLimitC8 != null) {
			codeLength += nonVolatileDataLimitC8.encode(reverseOS, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 8
			reverseOS.write(0xC8);
			codeLength += 1;
		}
		
		if (volatileDataLimitC7 != null) {
			codeLength += volatileDataLimitC7.encode(reverseOS, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 7
			reverseOS.write(0xC7);
			codeLength += 1;
		}
		
		if (nonVolatileCodeLimitC6 != null) {
			codeLength += nonVolatileCodeLimitC6.encode(reverseOS, false);
			// write tag: PRIVATE_CLASS, PRIMITIVE, 6
			reverseOS.write(0xC6);
			codeLength += 1;
		}
		
		if (securityDomainAID != null) {
			codeLength += securityDomainAID.encode(reverseOS, false);
			// write tag: APPLICATION_CLASS, PRIMITIVE, 15
			reverseOS.write(0x4F);
			codeLength += 1;
		}
		
		codeLength += loadPackageAID.encode(reverseOS, false);
		// write tag: APPLICATION_CLASS, PRIMITIVE, 15
		reverseOS.write(0x4F);
		codeLength += 1;
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		if (totalLength == -1) {
			subCodeLength += berTag.decode(is);

			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 15)) {
				loadPackageAID = new ApplicationIdentifier();
				subCodeLength += loadPackageAID.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 15)) {
				securityDomainAID = new ApplicationIdentifier();
				subCodeLength += securityDomainAID.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 6)) {
				nonVolatileCodeLimitC6 = new BerOctetString();
				subCodeLength += nonVolatileCodeLimitC6.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
				volatileDataLimitC7 = new BerOctetString();
				subCodeLength += volatileDataLimitC7.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 8)) {
				nonVolatileDataLimitC8 = new BerOctetString();
				subCodeLength += nonVolatileDataLimitC8.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 1)) {
				hashValue = new BerOctetString();
				subCodeLength += hashValue.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 4)) {
				loadBlockObject = new BerOctetString();
				subCodeLength += loadBlockObject.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			int nextByte = is.read();
			if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0
			|| nextByte != 0) {
				if (nextByte == -1) {
					throw new EOFException("Unexpected end of input stream.");
				}
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			codeLength += subCodeLength + 1;
			return codeLength;
		}

		codeLength += totalLength;

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 15)) {
			loadPackageAID = new ApplicationIdentifier();
			subCodeLength += loadPackageAID.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 15)) {
			securityDomainAID = new ApplicationIdentifier();
			subCodeLength += securityDomainAID.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 6)) {
			nonVolatileCodeLimitC6 = new BerOctetString();
			subCodeLength += nonVolatileCodeLimitC6.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 7)) {
			volatileDataLimitC7 = new BerOctetString();
			subCodeLength += volatileDataLimitC7.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 8)) {
			nonVolatileDataLimitC8 = new BerOctetString();
			subCodeLength += nonVolatileDataLimitC8.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 1)) {
			hashValue = new BerOctetString();
			subCodeLength += hashValue.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.PRIVATE_CLASS, BerTag.PRIMITIVE, 4)) {
			loadBlockObject = new BerOctetString();
			subCodeLength += loadBlockObject.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
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

		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (loadPackageAID != null) {
			sb.append("loadPackageAID: ").append(loadPackageAID);
		}
		else {
			sb.append("loadPackageAID: <empty-required-field>");
		}
		
		if (securityDomainAID != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("securityDomainAID: ").append(securityDomainAID);
		}
		
		if (nonVolatileCodeLimitC6 != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nonVolatileCodeLimitC6: ").append(nonVolatileCodeLimitC6);
		}
		
		if (volatileDataLimitC7 != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("volatileDataLimitC7: ").append(volatileDataLimitC7);
		}
		
		if (nonVolatileDataLimitC8 != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("nonVolatileDataLimitC8: ").append(nonVolatileDataLimitC8);
		}
		
		if (hashValue != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("hashValue: ").append(hashValue);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (loadBlockObject != null) {
			sb.append("loadBlockObject: ").append(loadBlockObject);
		}
		else {
			sb.append("loadBlockObject: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

