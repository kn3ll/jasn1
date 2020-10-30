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


public class PERFM implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static class TarList implements BerSequenceOf, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		public List<BerOctetString> seqOf = null;

		public TarList() {
			seqOf = new ArrayList<BerOctetString>();
		}

		public TarList(byte[] code) {
			this.code = code;
		}

		public TarList(List<BerOctetString> seqOf) {
			this.seqOf = seqOf;
		}

		public List<? extends BerType> getSeqOf() {
			return seqOf;
		}
		public Class<? extends BerType> getSeqOfElementClass() {
			return BerOctetString.class;
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
			for (int i = (seqOf.size() - 1); i >= 0; i--) {
				codeLength += seqOf.get(i).encode(reverseOS, true);
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

			if (length.val == -1) {
				while (true) {
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

					BerOctetString element = new BerOctetString();
					subCodeLength += element.decode(is, false);
					seqOf.add(element);
				}
			}
			while (subCodeLength < totalLength) {
				BerOctetString element = new BerOctetString();
				subCodeLength += element.decode(is, true);
				seqOf.add(element);
			}
			if (subCodeLength != totalLength) {
				throw new IOException("Decoded SequenceOf or SetOf has wrong length. Expected " + totalLength + " but has " + subCodeLength);

			}
			codeLength += subCodeLength;

			return codeLength;
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

			sb.append("{\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			if (seqOf == null) {
				sb.append("null");
			}
			else {
				Iterator<BerOctetString> it = seqOf.iterator();
				if (it.hasNext()) {
					sb.append(it.next());
					while (it.hasNext()) {
						sb.append(",\n");
						for (int i = 0; i < indentLevel + 1; i++) {
							sb.append("\t");
						}
						sb.append(it.next());
					}
				}
			}

			sb.append("\n");
			for (int i = 0; i < indentLevel; i++) {
				sb.append("\t");
			}
			sb.append("}");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public PEHeader rfmHeader = null;
	public ApplicationIdentifier instanceAID = null;
	public ApplicationIdentifier securityDomainAID = null;
	public TarList tarList = null;
	public BerOctetString minimumSecurityLevel = null;
	public BerOctetString uiccAccessDomain = null;
	public BerOctetString uiccAdminAccessDomain = null;
	public ADFRFMAccess adfRFMAccess = null;
	
	public PERFM() {
	}

	public PERFM(byte[] code) {
		this.code = code;
	}

	public PERFM(PEHeader rfmHeader, ApplicationIdentifier instanceAID, ApplicationIdentifier securityDomainAID, TarList tarList, BerOctetString minimumSecurityLevel, BerOctetString uiccAccessDomain, BerOctetString uiccAdminAccessDomain, ADFRFMAccess adfRFMAccess) {
		this.rfmHeader = rfmHeader;
		this.instanceAID = instanceAID;
		this.securityDomainAID = securityDomainAID;
		this.tarList = tarList;
		this.minimumSecurityLevel = minimumSecurityLevel;
		this.uiccAccessDomain = uiccAccessDomain;
		this.uiccAdminAccessDomain = uiccAdminAccessDomain;
		this.adfRFMAccess = adfRFMAccess;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"rfm-header",
		"instanceAID",
		"securityDomainAID",
		"tarList",
		"minimumSecurityLevel",
		"uiccAccessDomain",
		"uiccAdminAccessDomain",
		"adfRFMAccess"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "rfm-header":
				return rfmHeader;
			case "instanceAID":
				return instanceAID;
			case "securityDomainAID":
				return securityDomainAID;
			case "tarList":
				return tarList;
			case "minimumSecurityLevel":
				return minimumSecurityLevel;
			case "uiccAccessDomain":
				return uiccAccessDomain;
			case "uiccAdminAccessDomain":
				return uiccAdminAccessDomain;
			case "adfRFMAccess":
				return adfRFMAccess;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "rfm-header":
				return PEHeader.class;
			case "instanceAID":
				return ApplicationIdentifier.class;
			case "securityDomainAID":
				return ApplicationIdentifier.class;
			case "tarList":
				return TarList.class;
			case "minimumSecurityLevel":
				return BerOctetString.class;
			case "uiccAccessDomain":
				return BerOctetString.class;
			case "uiccAdminAccessDomain":
				return BerOctetString.class;
			case "adfRFMAccess":
				return ADFRFMAccess.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "rfm-header":
				rfmHeader = (PEHeader) value;
				break;
			case "instanceAID":
				instanceAID = (ApplicationIdentifier) value;
				break;
			case "securityDomainAID":
				securityDomainAID = (ApplicationIdentifier) value;
				break;
			case "tarList":
				tarList = (TarList) value;
				break;
			case "minimumSecurityLevel":
				minimumSecurityLevel = (BerOctetString) value;
				break;
			case "uiccAccessDomain":
				uiccAccessDomain = (BerOctetString) value;
				break;
			case "uiccAdminAccessDomain":
				uiccAdminAccessDomain = (BerOctetString) value;
				break;
			case "adfRFMAccess":
				adfRFMAccess = (ADFRFMAccess) value;
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
		if (adfRFMAccess != null) {
			codeLength += adfRFMAccess.encode(reverseOS, true);
		}
		
		codeLength += uiccAdminAccessDomain.encode(reverseOS, true);
		
		codeLength += uiccAccessDomain.encode(reverseOS, true);
		
		codeLength += minimumSecurityLevel.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 1
		reverseOS.write(0x81);
		codeLength += 1;
		
		if (tarList != null) {
			codeLength += tarList.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
			codeLength += 1;
		}
		
		if (securityDomainAID != null) {
			codeLength += securityDomainAID.encode(reverseOS, false);
			// write tag: APPLICATION_CLASS, PRIMITIVE, 15
			reverseOS.write(0x4F);
			codeLength += 1;
		}
		
		codeLength += instanceAID.encode(reverseOS, false);
		// write tag: APPLICATION_CLASS, PRIMITIVE, 15
		reverseOS.write(0x4F);
		codeLength += 1;
		
		codeLength += rfmHeader.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		reverseOS.write(0xA0);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				rfmHeader = new PEHeader();
				subCodeLength += rfmHeader.decode(is, false);
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
				instanceAID = new ApplicationIdentifier();
				subCodeLength += instanceAID.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				tarList = new TarList();
				subCodeLength += tarList.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				minimumSecurityLevel = new BerOctetString();
				subCodeLength += minimumSecurityLevel.decode(is, false);
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
			if (berTag.equals(BerOctetString.tag)) {
				uiccAccessDomain = new BerOctetString();
				subCodeLength += uiccAccessDomain.decode(is, false);
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
			if (berTag.equals(BerOctetString.tag)) {
				uiccAdminAccessDomain = new BerOctetString();
				subCodeLength += uiccAdminAccessDomain.decode(is, false);
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
			if (berTag.equals(ADFRFMAccess.tag)) {
				adfRFMAccess = new ADFRFMAccess();
				subCodeLength += adfRFMAccess.decode(is, false);
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
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			rfmHeader = new PEHeader();
			subCodeLength += rfmHeader.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 15)) {
			instanceAID = new ApplicationIdentifier();
			subCodeLength += instanceAID.decode(is, false);
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
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			tarList = new TarList();
			subCodeLength += tarList.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			minimumSecurityLevel = new BerOctetString();
			subCodeLength += minimumSecurityLevel.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerOctetString.tag)) {
			uiccAccessDomain = new BerOctetString();
			subCodeLength += uiccAccessDomain.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerOctetString.tag)) {
			uiccAdminAccessDomain = new BerOctetString();
			subCodeLength += uiccAdminAccessDomain.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(ADFRFMAccess.tag)) {
			adfRFMAccess = new ADFRFMAccess();
			subCodeLength += adfRFMAccess.decode(is, false);
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
		if (rfmHeader != null) {
			sb.append("rfmHeader: ");
			rfmHeader.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("rfmHeader: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (instanceAID != null) {
			sb.append("instanceAID: ").append(instanceAID);
		}
		else {
			sb.append("instanceAID: <empty-required-field>");
		}
		
		if (securityDomainAID != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("securityDomainAID: ").append(securityDomainAID);
		}
		
		if (tarList != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("tarList: ");
			tarList.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (minimumSecurityLevel != null) {
			sb.append("minimumSecurityLevel: ").append(minimumSecurityLevel);
		}
		else {
			sb.append("minimumSecurityLevel: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (uiccAccessDomain != null) {
			sb.append("uiccAccessDomain: ").append(uiccAccessDomain);
		}
		else {
			sb.append("uiccAccessDomain: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (uiccAdminAccessDomain != null) {
			sb.append("uiccAdminAccessDomain: ").append(uiccAdminAccessDomain);
		}
		else {
			sb.append("uiccAdminAccessDomain: <empty-required-field>");
		}
		
		if (adfRFMAccess != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("adfRFMAccess: ");
			adfRFMAccess.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

