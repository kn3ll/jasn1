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


public class FileManagement implements BerSequenceOf, Serializable {

	private static final long serialVersionUID = 1L;

	public static class CHOICE implements BerChoice, Serializable {

		private static final long serialVersionUID = 1L;

		public byte[] code = null;
		public BerOctetString filePath = null;
		public Fcp createFCP = null;
		public UInt16 fillFileOffset = null;
		public BerOctetString fillFileContent = null;
		
		public CHOICE() {
		}

		public CHOICE(byte[] code) {
			this.code = code;
		}

		public CHOICE(BerOctetString filePath, Fcp createFCP, UInt16 fillFileOffset, BerOctetString fillFileContent) {
			this.filePath = filePath;
			this.createFCP = createFCP;
			this.fillFileOffset = fillFileOffset;
			this.fillFileContent = fillFileContent;
		}

		private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		));
		public List<String> getFields() {
			return FIELDS;
		}
		public BerType getField(String fieldName) {
			switch(fieldName) {
				case "filePath":
					return filePath;
				case "createFCP":
					return createFCP;
				case "fillFileOffset":
					return fillFileOffset;
				case "fillFileContent":
					return fillFileContent;
				default:
					return null;
			}
		}
		public Class<? extends BerType> getFieldClass(String fieldName) {
			switch(fieldName) {
				case "filePath":
					return BerOctetString.class;
				case "createFCP":
					return Fcp.class;
				case "fillFileOffset":
					return UInt16.class;
				case "fillFileContent":
					return BerOctetString.class;
				default:
					return null;
			}
		}
		public void setField(String fieldName, BerType value) {
			switch(fieldName) {
				case "filePath":
					filePath = (BerOctetString) value;
					break;
				case "createFCP":
					createFCP = (Fcp) value;
					break;
				case "fillFileOffset":
					fillFileOffset = (UInt16) value;
					break;
				case "fillFileContent":
					fillFileContent = (BerOctetString) value;
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
			if (fillFileContent != null) {
				codeLength += fillFileContent.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 1
				reverseOS.write(0x81);
				codeLength += 1;
				return codeLength;
			}
			
			if (fillFileOffset != null) {
				codeLength += fillFileOffset.encode(reverseOS, true);
				return codeLength;
			}
			
			if (createFCP != null) {
				codeLength += createFCP.encode(reverseOS, false);
				// write tag: APPLICATION_CLASS, CONSTRUCTED, 2
				reverseOS.write(0x62);
				codeLength += 1;
				return codeLength;
			}
			
			if (filePath != null) {
				codeLength += filePath.encode(reverseOS, false);
				// write tag: CONTEXT_CLASS, PRIMITIVE, 0
				reverseOS.write(0x80);
				codeLength += 1;
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

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 0)) {
				filePath = new BerOctetString();
				codeLength += filePath.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 2)) {
				createFCP = new Fcp();
				codeLength += createFCP.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(UInt16.tag)) {
				fillFileOffset = new UInt16();
				codeLength += fillFileOffset.decode(is, false);
				return codeLength;
			}

			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				fillFileContent = new BerOctetString();
				codeLength += fillFileContent.decode(is, false);
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

			if (filePath != null) {
				sb.append("filePath: ").append(filePath);
				return;
			}

			if (createFCP != null) {
				sb.append("createFCP: ");
				createFCP.appendAsString(sb, indentLevel + 1);
				return;
			}

			if (fillFileOffset != null) {
				sb.append("fillFileOffset: ").append(fillFileOffset);
				return;
			}

			if (fillFileContent != null) {
				sb.append("fillFileContent: ").append(fillFileContent);
				return;
			}

			sb.append("<none>");
		}

	}

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
	public byte[] code = null;
	public List<CHOICE> seqOf = null;

	public FileManagement() {
		seqOf = new ArrayList<CHOICE>();
	}

	public FileManagement(byte[] code) {
		this.code = code;
	}

	public FileManagement(List<CHOICE> seqOf) {
		this.seqOf = seqOf;
	}

	public List<? extends BerType> getSeqOf() {
		return seqOf;
	}
	public Class<? extends BerType> getSeqOfElementClass() {
		return CHOICE.class;
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
			codeLength += seqOf.get(i).encode(reverseOS);
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

				CHOICE element = new CHOICE();
				subCodeLength += element.decode(is, berTag);
				seqOf.add(element);
			}
		}
		while (subCodeLength < totalLength) {
			CHOICE element = new CHOICE();
			subCodeLength += element.decode(is, null);
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
			Iterator<CHOICE> it = seqOf.iterator();
			if (it.hasNext()) {
				it.next().appendAsString(sb, indentLevel + 1);
				while (it.hasNext()) {
					sb.append(",\n");
					for (int i = 0; i < indentLevel + 1; i++) {
						sb.append("\t");
					}
					it.next().appendAsString(sb, indentLevel + 1);
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

