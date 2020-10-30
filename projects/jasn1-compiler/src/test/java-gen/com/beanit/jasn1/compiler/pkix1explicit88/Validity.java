/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pkix1explicit88;

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


public class Validity implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public Time notBefore = null;
	public Time notAfter = null;
	
	public Validity() {
	}

	public Validity(byte[] code) {
		this.code = code;
	}

	public Validity(Time notBefore, Time notAfter) {
		this.notBefore = notBefore;
		this.notAfter = notAfter;
	}

	private final transient List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"notBefore",
		"notAfter"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "notBefore":
				return notBefore;
			case "notAfter":
				return notAfter;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "notBefore":
				return Time.class;
			case "notAfter":
				return Time.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "notBefore":
				notBefore = (Time) value;
				break;
			case "notAfter":
				notAfter = (Time) value;
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
		codeLength += notAfter.encode(reverseOS);
		
		codeLength += notBefore.encode(reverseOS);
		
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
			notBefore = new Time();
			int choiceDecodeLength = notBefore.decode(is, berTag);
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
				notBefore = null;
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
			notAfter = new Time();
			choiceDecodeLength = notAfter.decode(is, berTag);
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
				notAfter = null;
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
		notBefore = new Time();
		subCodeLength += notBefore.decode(is, berTag);
		subCodeLength += berTag.decode(is);
		
		notAfter = new Time();
		subCodeLength += notAfter.decode(is, berTag);
		if (subCodeLength == totalLength) {
			return codeLength;
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
		if (notBefore != null) {
			sb.append("notBefore: ");
			notBefore.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("notBefore: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (notAfter != null) {
			sb.append("notAfter: ");
			notAfter.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("notAfter: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

