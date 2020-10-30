/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.modules.module2;

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


public class PersonnelRecordz implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static class Children implements BerSequenceOf, Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		private List<ChildInformationz> seqOf = null;

		public Children() {
			seqOf = new ArrayList<ChildInformationz>();
		}

		public Children(byte[] code) {
			this.code = code;
		}

		public List<ChildInformationz> getChildInformationz() {
			if (seqOf == null) {
				seqOf = new ArrayList<ChildInformationz>();
			}
			return seqOf;
		}

		public List<? extends BerType> getSeqOf() {
			return seqOf;
		}
		public Class<? extends BerType> getSeqOfElementClass() {
			return ChildInformationz.class;
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

					ChildInformationz element = new ChildInformationz();
					subCodeLength += element.decode(is, false);
					seqOf.add(element);
				}
			}
			while (subCodeLength < totalLength) {
				ChildInformationz element = new ChildInformationz();
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
				Iterator<ChildInformationz> it = seqOf.iterator();
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
	private Namez name = null;
	private BerVisibleString title = null;
	private EmployeeNumberZ number = null;
	private Datez dateOfHire = null;
	private Namez nameOfSpouse = null;
	private Children children = null;
	
	public PersonnelRecordz() {
	}

	public PersonnelRecordz(byte[] code) {
		this.code = code;
	}

	public void setName(Namez name) {
		this.name = name;
	}

	public Namez getName() {
		return name;
	}

	public void setTitle(BerVisibleString title) {
		this.title = title;
	}

	public BerVisibleString getTitle() {
		return title;
	}

	public void setNumber(EmployeeNumberZ number) {
		this.number = number;
	}

	public EmployeeNumberZ getNumber() {
		return number;
	}

	public void setDateOfHire(Datez dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	public Datez getDateOfHire() {
		return dateOfHire;
	}

	public void setNameOfSpouse(Namez nameOfSpouse) {
		this.nameOfSpouse = nameOfSpouse;
	}

	public Namez getNameOfSpouse() {
		return nameOfSpouse;
	}

	public void setChildren(Children children) {
		this.children = children;
	}

	public Children getChildren() {
		return children;
	}

	private final transient List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"name",
		"title",
		"number",
		"dateOfHire",
		"nameOfSpouse",
		"children"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "name":
				return name;
			case "title":
				return title;
			case "number":
				return number;
			case "dateOfHire":
				return dateOfHire;
			case "nameOfSpouse":
				return nameOfSpouse;
			case "children":
				return children;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "name":
				return Namez.class;
			case "title":
				return BerVisibleString.class;
			case "number":
				return EmployeeNumberZ.class;
			case "dateOfHire":
				return Datez.class;
			case "nameOfSpouse":
				return Namez.class;
			case "children":
				return Children.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "name":
				name = (Namez) value;
				break;
			case "title":
				title = (BerVisibleString) value;
				break;
			case "number":
				number = (EmployeeNumberZ) value;
				break;
			case "dateOfHire":
				dateOfHire = (Datez) value;
				break;
			case "nameOfSpouse":
				nameOfSpouse = (Namez) value;
				break;
			case "children":
				children = (Children) value;
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

		if (children != null) {
			codeLength += children.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
		}
		
		sublength = nameOfSpouse.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
		reverseOS.write(0xA2);
		codeLength += 1;
		
		sublength = dateOfHire.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += number.encode(reverseOS, true);
		
		sublength = title.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		reverseOS.write(0xA0);
		codeLength += 1;
		
		codeLength += name.encode(reverseOS, true);
		
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
			int lastSubCodeLength = 0;
			subCodeLength += berTag.decode(is);

			while (true) {
				if (lastSubCodeLength == subCodeLength) {
					throw new IOException("Unknown berTag: class:" + berTag.tagClass + " primitive: " + berTag.primitive + " number: " + berTag.tagNumber);
				}
				lastSubCodeLength = subCodeLength;
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
				if (berTag.equals(Namez.tag)) {
					name = new Namez();
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
				if (berTag.equals(EmployeeNumberZ.tag)) {
					number = new EmployeeNumberZ();
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
					dateOfHire = new Datez();
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
					nameOfSpouse = new Namez();
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
				if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
					int nextByte = is.read();
					if (nextByte != 0) {
						if (nextByte == -1) {
							throw new EOFException("Unexpected end of input stream.");
						}
						throw new IOException("Decoded sequence has wrong end of contents octets");
					} else {
						codeLength += subCodeLength + 1;
						return codeLength;
					}

				}

			}

		}

		while (subCodeLength < totalLength) {
			subCodeLength += berTag.decode(is);
			if (berTag.equals(Namez.tag)) {
				name = new Namez();
				subCodeLength += name.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				subCodeLength += new BerLength().decode(is);
				title = new BerVisibleString();
				subCodeLength += title.decode(is, true);
			}
			else if (berTag.equals(EmployeeNumberZ.tag)) {
				number = new EmployeeNumberZ();
				subCodeLength += number.decode(is, false);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
				subCodeLength += new BerLength().decode(is);
				dateOfHire = new Datez();
				subCodeLength += dateOfHire.decode(is, true);
			}
			else if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				subCodeLength += new BerLength().decode(is);
				nameOfSpouse = new Namez();
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

