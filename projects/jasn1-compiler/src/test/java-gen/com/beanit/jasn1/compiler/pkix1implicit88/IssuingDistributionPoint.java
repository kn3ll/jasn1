/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pkix1implicit88;

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

import com.beanit.jasn1.compiler.pkix1explicit88.Attribute;
import com.beanit.jasn1.compiler.pkix1explicit88.CertificateSerialNumber;
import com.beanit.jasn1.compiler.pkix1explicit88.DirectoryString;
import com.beanit.jasn1.compiler.pkix1explicit88.Name;
import com.beanit.jasn1.compiler.pkix1explicit88.ORAddress;
import com.beanit.jasn1.compiler.pkix1explicit88.RelativeDistinguishedName;

public class IssuingDistributionPoint implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public DistributionPointName distributionPoint = null;
	public BerBoolean onlyContainsUserCerts = null;
	public BerBoolean onlyContainsCACerts = null;
	public ReasonFlags onlySomeReasons = null;
	public BerBoolean indirectCRL = null;
	public BerBoolean onlyContainsAttributeCerts = null;
	
	public IssuingDistributionPoint() {
	}

	public IssuingDistributionPoint(byte[] code) {
		this.code = code;
	}

	public IssuingDistributionPoint(DistributionPointName distributionPoint, BerBoolean onlyContainsUserCerts, BerBoolean onlyContainsCACerts, ReasonFlags onlySomeReasons, BerBoolean indirectCRL, BerBoolean onlyContainsAttributeCerts) {
		this.distributionPoint = distributionPoint;
		this.onlyContainsUserCerts = onlyContainsUserCerts;
		this.onlyContainsCACerts = onlyContainsCACerts;
		this.onlySomeReasons = onlySomeReasons;
		this.indirectCRL = indirectCRL;
		this.onlyContainsAttributeCerts = onlyContainsAttributeCerts;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"distributionPoint",
		"onlyContainsUserCerts",
		"onlyContainsCACerts",
		"onlySomeReasons",
		"indirectCRL",
		"onlyContainsAttributeCerts"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "distributionPoint":
				return distributionPoint;
			case "onlyContainsUserCerts":
				return onlyContainsUserCerts;
			case "onlyContainsCACerts":
				return onlyContainsCACerts;
			case "onlySomeReasons":
				return onlySomeReasons;
			case "indirectCRL":
				return indirectCRL;
			case "onlyContainsAttributeCerts":
				return onlyContainsAttributeCerts;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "distributionPoint":
				return DistributionPointName.class;
			case "onlyContainsUserCerts":
				return BerBoolean.class;
			case "onlyContainsCACerts":
				return BerBoolean.class;
			case "onlySomeReasons":
				return ReasonFlags.class;
			case "indirectCRL":
				return BerBoolean.class;
			case "onlyContainsAttributeCerts":
				return BerBoolean.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "distributionPoint":
				distributionPoint = (DistributionPointName) value;
				break;
			case "onlyContainsUserCerts":
				onlyContainsUserCerts = (BerBoolean) value;
				break;
			case "onlyContainsCACerts":
				onlyContainsCACerts = (BerBoolean) value;
				break;
			case "onlySomeReasons":
				onlySomeReasons = (ReasonFlags) value;
				break;
			case "indirectCRL":
				indirectCRL = (BerBoolean) value;
				break;
			case "onlyContainsAttributeCerts":
				onlyContainsAttributeCerts = (BerBoolean) value;
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
		int sublength;

		if (onlyContainsAttributeCerts != null) {
			codeLength += onlyContainsAttributeCerts.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (indirectCRL != null) {
			codeLength += indirectCRL.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (onlySomeReasons != null) {
			codeLength += onlySomeReasons.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (onlyContainsCACerts != null) {
			codeLength += onlyContainsCACerts.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (onlyContainsUserCerts != null) {
			codeLength += onlyContainsUserCerts.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (distributionPoint != null) {
			sublength = distributionPoint.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
			codeLength += 1;
		}
		
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				subCodeLength += length.decode(is);
				distributionPoint = new DistributionPointName();
				int choiceDecodeLength = distributionPoint.decode(is, null);
				if (length.val == -1) {
					int nextByte1 = is.read();
					int nextByte2 = is.read();
					if (nextByte1 != 0 || nextByte2 != 0) {
						throw new IOException("Decoded sequence has wrong end of contents octets. Byte position: " + (subCodeLength + codeLength));
					}
					subCodeLength += 2;
				}
				if (choiceDecodeLength != 0) {
					subCodeLength += choiceDecodeLength;
					subCodeLength += berTag.decode(is);
				}
				else {
					distributionPoint = null;
				}

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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				onlyContainsUserCerts = new BerBoolean();
				subCodeLength += onlyContainsUserCerts.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
				onlyContainsCACerts = new BerBoolean();
				subCodeLength += onlyContainsCACerts.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
				onlySomeReasons = new ReasonFlags();
				subCodeLength += onlySomeReasons.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
				indirectCRL = new BerBoolean();
				subCodeLength += indirectCRL.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
				onlyContainsAttributeCerts = new BerBoolean();
				subCodeLength += onlyContainsAttributeCerts.decode(is, false);
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

		if (totalLength == 0) {
			return codeLength;
		}
		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			subCodeLength += length.decode(is);
			distributionPoint = new DistributionPointName();
			subCodeLength += distributionPoint.decode(is, null);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			onlyContainsUserCerts = new BerBoolean();
			subCodeLength += onlyContainsUserCerts.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			onlyContainsCACerts = new BerBoolean();
			subCodeLength += onlyContainsCACerts.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			onlySomeReasons = new ReasonFlags();
			subCodeLength += onlySomeReasons.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			indirectCRL = new BerBoolean();
			subCodeLength += indirectCRL.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			onlyContainsAttributeCerts = new BerBoolean();
			subCodeLength += onlyContainsAttributeCerts.decode(is, false);
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
		boolean firstSelectedElement = true;
		if (distributionPoint != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("distributionPoint: ");
			distributionPoint.appendAsString(sb, indentLevel + 1);
			firstSelectedElement = false;
		}
		
		if (onlyContainsUserCerts != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onlyContainsUserCerts: ").append(onlyContainsUserCerts);
			firstSelectedElement = false;
		}
		
		if (onlyContainsCACerts != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onlyContainsCACerts: ").append(onlyContainsCACerts);
			firstSelectedElement = false;
		}
		
		if (onlySomeReasons != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onlySomeReasons: ").append(onlySomeReasons);
			firstSelectedElement = false;
		}
		
		if (indirectCRL != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("indirectCRL: ").append(indirectCRL);
			firstSelectedElement = false;
		}
		
		if (onlyContainsAttributeCerts != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("onlyContainsAttributeCerts: ").append(onlyContainsAttributeCerts);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

