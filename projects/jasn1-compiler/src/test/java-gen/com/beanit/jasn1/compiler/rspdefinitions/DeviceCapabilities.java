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

public class DeviceCapabilities implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public VersionType gsmSupportedRelease = null;
	public VersionType utranSupportedRelease = null;
	public VersionType cdma2000onexSupportedRelease = null;
	public VersionType cdma2000hrpdSupportedRelease = null;
	public VersionType cdma2000ehrpdSupportedRelease = null;
	public VersionType eutranSupportedRelease = null;
	public VersionType contactlessSupportedRelease = null;
	public VersionType rspCrlSupportedVersion = null;
	
	public DeviceCapabilities() {
	}

	public DeviceCapabilities(byte[] code) {
		this.code = code;
	}

	public DeviceCapabilities(VersionType gsmSupportedRelease, VersionType utranSupportedRelease, VersionType cdma2000onexSupportedRelease, VersionType cdma2000hrpdSupportedRelease, VersionType cdma2000ehrpdSupportedRelease, VersionType eutranSupportedRelease, VersionType contactlessSupportedRelease, VersionType rspCrlSupportedVersion) {
		this.gsmSupportedRelease = gsmSupportedRelease;
		this.utranSupportedRelease = utranSupportedRelease;
		this.cdma2000onexSupportedRelease = cdma2000onexSupportedRelease;
		this.cdma2000hrpdSupportedRelease = cdma2000hrpdSupportedRelease;
		this.cdma2000ehrpdSupportedRelease = cdma2000ehrpdSupportedRelease;
		this.eutranSupportedRelease = eutranSupportedRelease;
		this.contactlessSupportedRelease = contactlessSupportedRelease;
		this.rspCrlSupportedVersion = rspCrlSupportedVersion;
	}

	private final transient List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"gsmSupportedRelease",
		"utranSupportedRelease",
		"cdma2000onexSupportedRelease",
		"cdma2000hrpdSupportedRelease",
		"cdma2000ehrpdSupportedRelease",
		"eutranSupportedRelease",
		"contactlessSupportedRelease",
		"rspCrlSupportedVersion"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "gsmSupportedRelease":
				return gsmSupportedRelease;
			case "utranSupportedRelease":
				return utranSupportedRelease;
			case "cdma2000onexSupportedRelease":
				return cdma2000onexSupportedRelease;
			case "cdma2000hrpdSupportedRelease":
				return cdma2000hrpdSupportedRelease;
			case "cdma2000ehrpdSupportedRelease":
				return cdma2000ehrpdSupportedRelease;
			case "eutranSupportedRelease":
				return eutranSupportedRelease;
			case "contactlessSupportedRelease":
				return contactlessSupportedRelease;
			case "rspCrlSupportedVersion":
				return rspCrlSupportedVersion;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "gsmSupportedRelease":
				return VersionType.class;
			case "utranSupportedRelease":
				return VersionType.class;
			case "cdma2000onexSupportedRelease":
				return VersionType.class;
			case "cdma2000hrpdSupportedRelease":
				return VersionType.class;
			case "cdma2000ehrpdSupportedRelease":
				return VersionType.class;
			case "eutranSupportedRelease":
				return VersionType.class;
			case "contactlessSupportedRelease":
				return VersionType.class;
			case "rspCrlSupportedVersion":
				return VersionType.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "gsmSupportedRelease":
				gsmSupportedRelease = (VersionType) value;
				break;
			case "utranSupportedRelease":
				utranSupportedRelease = (VersionType) value;
				break;
			case "cdma2000onexSupportedRelease":
				cdma2000onexSupportedRelease = (VersionType) value;
				break;
			case "cdma2000hrpdSupportedRelease":
				cdma2000hrpdSupportedRelease = (VersionType) value;
				break;
			case "cdma2000ehrpdSupportedRelease":
				cdma2000ehrpdSupportedRelease = (VersionType) value;
				break;
			case "eutranSupportedRelease":
				eutranSupportedRelease = (VersionType) value;
				break;
			case "contactlessSupportedRelease":
				contactlessSupportedRelease = (VersionType) value;
				break;
			case "rspCrlSupportedVersion":
				rspCrlSupportedVersion = (VersionType) value;
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
		if (rspCrlSupportedVersion != null) {
			codeLength += rspCrlSupportedVersion.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 7
			reverseOS.write(0x87);
			codeLength += 1;
		}
		
		if (contactlessSupportedRelease != null) {
			codeLength += contactlessSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 6
			reverseOS.write(0x86);
			codeLength += 1;
		}
		
		if (eutranSupportedRelease != null) {
			codeLength += eutranSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 5
			reverseOS.write(0x85);
			codeLength += 1;
		}
		
		if (cdma2000ehrpdSupportedRelease != null) {
			codeLength += cdma2000ehrpdSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 4
			reverseOS.write(0x84);
			codeLength += 1;
		}
		
		if (cdma2000hrpdSupportedRelease != null) {
			codeLength += cdma2000hrpdSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 3
			reverseOS.write(0x83);
			codeLength += 1;
		}
		
		if (cdma2000onexSupportedRelease != null) {
			codeLength += cdma2000onexSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
		}
		
		if (utranSupportedRelease != null) {
			codeLength += utranSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			reverseOS.write(0x81);
			codeLength += 1;
		}
		
		if (gsmSupportedRelease != null) {
			codeLength += gsmSupportedRelease.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 0
			reverseOS.write(0x80);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				gsmSupportedRelease = new VersionType();
				subCodeLength += gsmSupportedRelease.decode(is, false);
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
				utranSupportedRelease = new VersionType();
				subCodeLength += utranSupportedRelease.decode(is, false);
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
				cdma2000onexSupportedRelease = new VersionType();
				subCodeLength += cdma2000onexSupportedRelease.decode(is, false);
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
				cdma2000hrpdSupportedRelease = new VersionType();
				subCodeLength += cdma2000hrpdSupportedRelease.decode(is, false);
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
				cdma2000ehrpdSupportedRelease = new VersionType();
				subCodeLength += cdma2000ehrpdSupportedRelease.decode(is, false);
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
				eutranSupportedRelease = new VersionType();
				subCodeLength += eutranSupportedRelease.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
				contactlessSupportedRelease = new VersionType();
				subCodeLength += contactlessSupportedRelease.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
				rspCrlSupportedVersion = new VersionType();
				subCodeLength += rspCrlSupportedVersion.decode(is, false);
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
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
			gsmSupportedRelease = new VersionType();
			subCodeLength += gsmSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			utranSupportedRelease = new VersionType();
			subCodeLength += utranSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			cdma2000onexSupportedRelease = new VersionType();
			subCodeLength += cdma2000onexSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 3)) {
			cdma2000hrpdSupportedRelease = new VersionType();
			subCodeLength += cdma2000hrpdSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 4)) {
			cdma2000ehrpdSupportedRelease = new VersionType();
			subCodeLength += cdma2000ehrpdSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 5)) {
			eutranSupportedRelease = new VersionType();
			subCodeLength += eutranSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 6)) {
			contactlessSupportedRelease = new VersionType();
			subCodeLength += contactlessSupportedRelease.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 7)) {
			rspCrlSupportedVersion = new VersionType();
			subCodeLength += rspCrlSupportedVersion.decode(is, false);
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
		if (gsmSupportedRelease != null) {
			sb.append("\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("gsmSupportedRelease: ").append(gsmSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (utranSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("utranSupportedRelease: ").append(utranSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (cdma2000onexSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cdma2000onexSupportedRelease: ").append(cdma2000onexSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (cdma2000hrpdSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cdma2000hrpdSupportedRelease: ").append(cdma2000hrpdSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (cdma2000ehrpdSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("cdma2000ehrpdSupportedRelease: ").append(cdma2000ehrpdSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (eutranSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("eutranSupportedRelease: ").append(eutranSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (contactlessSupportedRelease != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("contactlessSupportedRelease: ").append(contactlessSupportedRelease);
			firstSelectedElement = false;
		}
		
		if (rspCrlSupportedVersion != null) {
			if (!firstSelectedElement) {
				sb.append(",\n");
			}
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("rspCrlSupportedVersion: ").append(rspCrlSupportedVersion);
			firstSelectedElement = false;
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

