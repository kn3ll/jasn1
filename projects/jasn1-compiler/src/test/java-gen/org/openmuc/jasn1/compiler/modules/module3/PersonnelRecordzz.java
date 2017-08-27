/**
 * This class file was automatically generated by jASN1 v1.8.2 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.modules.module3;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;

import org.openmuc.jasn1.compiler.modules.module2.Datez;

public class PersonnelRecordzz implements Serializable {

	private static final long serialVersionUID = 1L;

	public static class Children implements Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<ChildInformationzz> seqOf = null;

		public Children() {
			seqOf = new ArrayList<ChildInformationzz>();
		}

		public Children(byte[] code) {
			this.code = code;
		}

		public List<ChildInformationzz> getChildInformationzz() {
			if (seqOf == null) {
				seqOf = new ArrayList<ChildInformationzz>();
			}
			return seqOf;
		}

		public int encode(BerByteArrayOutputStream os) throws IOException {
			return encode(os, true);
		}

		public int encode(BerByteArrayOutputStream os, boolean withTag) throws IOException {

			if (code != null) {
				for (int i = code.length - 1; i >= 0; i--) {
					os.write(code[i]);
				}
				if (withTag) {
					return tag.encode(os) + code.length;
				}
				return code.length;
			}

			int codeLength = 0;
			for (int i = (seqOf.size() - 1); i >= 0; i--) {
				codeLength += seqOf.get(i).encode(os, true);
			}

			codeLength += BerLength.encodeLength(os, codeLength);

			if (withTag) {
				codeLength += tag.encode(os);
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

					ChildInformationzz element = new ChildInformationzz();
					subCodeLength += element.decode(is, false);
					seqOf.add(element);
				}
			}
			while (subCodeLength < totalLength) {
				ChildInformationzz element = new ChildInformationzz();
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
			BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
			encode(os, false);
			code = os.getArray();
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
				Iterator<ChildInformationzz> it = seqOf.iterator();
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

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.CONSTRUCTED, 0);

	public byte[] code = null;
	private Namezz name = null;
	private BerVisibleString title = null;
	private EmployeeNumberzz number = null;
	private Datezz dateOfHire = null;
	private Namezz nameOfSpouse = null;
	private Children children = null;
	
	public PersonnelRecordzz() {
	}

	public PersonnelRecordzz(byte[] code) {
		this.code = code;
	}

	public void setName(Namezz name) {
		this.name = name;
	}

	public Namezz getName() {
		return name;
	}

	public void setTitle(BerVisibleString title) {
		this.title = title;
	}

	public BerVisibleString getTitle() {
		return title;
	}

	public void setNumber(EmployeeNumberzz number) {
		this.number = number;
	}

	public EmployeeNumberzz getNumber() {
		return number;
	}

	public void setDateOfHire(Datezz dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public Datezz getDateOfHire() {
		return dateOfHire;
	}

	public void setNameOfSpouse(Namezz nameOfSpouse) {
		this.nameOfSpouse = nameOfSpouse;
	}

	public Namezz getNameOfSpouse() {
		return nameOfSpouse;
	}

	public void setChildren(Children children) {
		this.children = children;
	}

	public Children getChildren() {
		return children;
	}

	public int encode(BerByteArrayOutputStream os) throws IOException {
		return encode(os, true);
	}

	public int encode(BerByteArrayOutputStream os, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			if (withTag) {
				return tag.encode(os) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		int sublength;

		if (children != null) {
			codeLength += children.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			os.write(0xA3);
			codeLength += 1;
		}
		
		sublength = nameOfSpouse.encode(os, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(os, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
		os.write(0xA2);
		codeLength += 1;
		
		sublength = dateOfHire.encode(os, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(os, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		os.write(0xA1);
		codeLength += 1;
		
		codeLength += number.encode(os, true);
		
		sublength = title.encode(os, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(os, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		os.write(0xA0);
		codeLength += 1;
		
		codeLength += name.encode(os, true);
		
		codeLength += BerLength.encodeLength(os, codeLength);

		if (withTag) {
			codeLength += tag.encode(os);
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
			if (berTag.equals(Namezz.tag)) {
				name = new Namezz();
				subCodeLength += name.decode(is, false);
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
				codeLength += length.decode(is);
				title = new BerVisibleString();
				subCodeLength += title.decode(is, true);
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
			if (berTag.equals(EmployeeNumberzz.tag)) {
				number = new EmployeeNumberzz();
				subCodeLength += number.decode(is, false);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
				codeLength += length.decode(is);
				dateOfHire = new Datezz();
				subCodeLength += dateOfHire.decode(is, true);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				codeLength += length.decode(is);
				nameOfSpouse = new Namezz();
				subCodeLength += nameOfSpouse.decode(is, true);
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
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
				children = new Children();
				subCodeLength += children.decode(is, false);
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

		while (subCodeLength < totalLength) {
			subCodeLength += berTag.decode(is);
			if (berTag.equals(Namezz.tag)) {
				name = new Namezz();
				subCodeLength += name.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				subCodeLength += new BerLength().decode(is);
				title = new BerVisibleString();
				subCodeLength += title.decode(is, true);
			}
			else if (berTag.equals(EmployeeNumberzz.tag)) {
				number = new EmployeeNumberzz();
				subCodeLength += number.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
				subCodeLength += new BerLength().decode(is);
				dateOfHire = new Datezz();
				subCodeLength += dateOfHire.decode(is, true);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				subCodeLength += new BerLength().decode(is);
				nameOfSpouse = new Namezz();
				subCodeLength += nameOfSpouse.decode(is, true);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
				children = new Children();
				subCodeLength += children.decode(is, false);
			}
		}
		if (subCodeLength != totalLength) {
			throw new IOException("Length of set does not match length tag, length tag: " + totalLength + ", actual set length: " + subCodeLength);

		}
		codeLength += subCodeLength;

		return codeLength;
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = os.getArray();
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
		if (name != null) {
			sb.append("name: ");
			name.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("name: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (title != null) {
			sb.append("title: ").append(title);
		}
		else {
			sb.append("title: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (number != null) {
			sb.append("number: ").append(number);
		}
		else {
			sb.append("number: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (dateOfHire != null) {
			sb.append("dateOfHire: ").append(dateOfHire);
		}
		else {
			sb.append("dateOfHire: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (nameOfSpouse != null) {
			sb.append("nameOfSpouse: ");
			nameOfSpouse.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("nameOfSpouse: <empty-required-field>");
		}
		
		if (children != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("children: ");
			children.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

