/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.tagging_test;

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


public class ChoiceOfIndirectTypes implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	private UntaggedInteger untaggedInt = null;
	private ExplicitlyTaggedInteger untaggedInt2 = null;
	private ImplicitlyTaggedInteger untaggedInt3 = null;
	private UntaggedInteger explicitlyTaggedInt = null;
	private ExplicitlyTaggedInteger explicitlyTaggedInt2 = null;
	private ImplicitlyTaggedInteger explicitlyTaggedInt3 = null;
	private UntaggedInteger implicitlyTaggedInt = null;
	private ExplicitlyTaggedInteger implicitlyTaggedInt2 = null;
	private ImplicitlyTaggedInteger implicitlyTaggedInt3 = null;
	private UntaggedChoice untaggedChoice = null;
	private TaggedChoice untaggedChoice2 = null;
	private UntaggedChoice taggedChoice = null;
	private TaggedChoice taggedChoice2 = null;
	private TaggedAny untaggedAny = null;
	private UntaggedAny taggedAny = null;
	private TaggedAny taggedAny2 = null;
	
	public ChoiceOfIndirectTypes() {
	}

	public ChoiceOfIndirectTypes(byte[] code) {
		this.code = code;
	}

	public void setUntaggedInt(UntaggedInteger untaggedInt) {
		this.untaggedInt = untaggedInt;
	}

	public UntaggedInteger getUntaggedInt() {
		return untaggedInt;
	}

	public void setUntaggedInt2(ExplicitlyTaggedInteger untaggedInt2) {
		this.untaggedInt2 = untaggedInt2;
	}

	public ExplicitlyTaggedInteger getUntaggedInt2() {
		return untaggedInt2;
	}

	public void setUntaggedInt3(ImplicitlyTaggedInteger untaggedInt3) {
		this.untaggedInt3 = untaggedInt3;
	}

	public ImplicitlyTaggedInteger getUntaggedInt3() {
		return untaggedInt3;
	}

	public void setExplicitlyTaggedInt(UntaggedInteger explicitlyTaggedInt) {
		this.explicitlyTaggedInt = explicitlyTaggedInt;
	}

	public UntaggedInteger getExplicitlyTaggedInt() {
		return explicitlyTaggedInt;
	}

	public void setExplicitlyTaggedInt2(ExplicitlyTaggedInteger explicitlyTaggedInt2) {
		this.explicitlyTaggedInt2 = explicitlyTaggedInt2;
	}

	public ExplicitlyTaggedInteger getExplicitlyTaggedInt2() {
		return explicitlyTaggedInt2;
	}

	public void setExplicitlyTaggedInt3(ImplicitlyTaggedInteger explicitlyTaggedInt3) {
		this.explicitlyTaggedInt3 = explicitlyTaggedInt3;
	}

	public ImplicitlyTaggedInteger getExplicitlyTaggedInt3() {
		return explicitlyTaggedInt3;
	}

	public void setImplicitlyTaggedInt(UntaggedInteger implicitlyTaggedInt) {
		this.implicitlyTaggedInt = implicitlyTaggedInt;
	}

	public UntaggedInteger getImplicitlyTaggedInt() {
		return implicitlyTaggedInt;
	}

	public void setImplicitlyTaggedInt2(ExplicitlyTaggedInteger implicitlyTaggedInt2) {
		this.implicitlyTaggedInt2 = implicitlyTaggedInt2;
	}

	public ExplicitlyTaggedInteger getImplicitlyTaggedInt2() {
		return implicitlyTaggedInt2;
	}

	public void setImplicitlyTaggedInt3(ImplicitlyTaggedInteger implicitlyTaggedInt3) {
		this.implicitlyTaggedInt3 = implicitlyTaggedInt3;
	}

	public ImplicitlyTaggedInteger getImplicitlyTaggedInt3() {
		return implicitlyTaggedInt3;
	}

	public void setUntaggedChoice(UntaggedChoice untaggedChoice) {
		this.untaggedChoice = untaggedChoice;
	}

	public UntaggedChoice getUntaggedChoice() {
		return untaggedChoice;
	}

	public void setUntaggedChoice2(TaggedChoice untaggedChoice2) {
		this.untaggedChoice2 = untaggedChoice2;
	}

	public TaggedChoice getUntaggedChoice2() {
		return untaggedChoice2;
	}

	public void setTaggedChoice(UntaggedChoice taggedChoice) {
		this.taggedChoice = taggedChoice;
	}

	public UntaggedChoice getTaggedChoice() {
		return taggedChoice;
	}

	public void setTaggedChoice2(TaggedChoice taggedChoice2) {
		this.taggedChoice2 = taggedChoice2;
	}

	public TaggedChoice getTaggedChoice2() {
		return taggedChoice2;
	}

	public void setUntaggedAny(TaggedAny untaggedAny) {
		this.untaggedAny = untaggedAny;
	}

	public TaggedAny getUntaggedAny() {
		return untaggedAny;
	}

	public void setTaggedAny(UntaggedAny taggedAny) {
		this.taggedAny = taggedAny;
	}

	public UntaggedAny getTaggedAny() {
		return taggedAny;
	}

	public void setTaggedAny2(TaggedAny taggedAny2) {
		this.taggedAny2 = taggedAny2;
	}

	public TaggedAny getTaggedAny2() {
		return taggedAny2;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "untaggedInt":
				return untaggedInt;
			case "untaggedInt2":
				return untaggedInt2;
			case "untaggedInt3":
				return untaggedInt3;
			case "explicitlyTaggedInt":
				return explicitlyTaggedInt;
			case "explicitlyTaggedInt2":
				return explicitlyTaggedInt2;
			case "explicitlyTaggedInt3":
				return explicitlyTaggedInt3;
			case "implicitlyTaggedInt":
				return implicitlyTaggedInt;
			case "implicitlyTaggedInt2":
				return implicitlyTaggedInt2;
			case "implicitlyTaggedInt3":
				return implicitlyTaggedInt3;
			case "untaggedChoice":
				return untaggedChoice;
			case "untaggedChoice2":
				return untaggedChoice2;
			case "taggedChoice":
				return taggedChoice;
			case "taggedChoice2":
				return taggedChoice2;
			case "untaggedAny":
				return untaggedAny;
			case "taggedAny":
				return taggedAny;
			case "taggedAny2":
				return taggedAny2;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "untaggedInt":
				return UntaggedInteger.class;
			case "untaggedInt2":
				return ExplicitlyTaggedInteger.class;
			case "untaggedInt3":
				return ImplicitlyTaggedInteger.class;
			case "explicitlyTaggedInt":
				return UntaggedInteger.class;
			case "explicitlyTaggedInt2":
				return ExplicitlyTaggedInteger.class;
			case "explicitlyTaggedInt3":
				return ImplicitlyTaggedInteger.class;
			case "implicitlyTaggedInt":
				return UntaggedInteger.class;
			case "implicitlyTaggedInt2":
				return ExplicitlyTaggedInteger.class;
			case "implicitlyTaggedInt3":
				return ImplicitlyTaggedInteger.class;
			case "untaggedChoice":
				return UntaggedChoice.class;
			case "untaggedChoice2":
				return TaggedChoice.class;
			case "taggedChoice":
				return UntaggedChoice.class;
			case "taggedChoice2":
				return TaggedChoice.class;
			case "untaggedAny":
				return TaggedAny.class;
			case "taggedAny":
				return UntaggedAny.class;
			case "taggedAny2":
				return TaggedAny.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "untaggedInt":
				untaggedInt = (UntaggedInteger) value;
				break;
			case "untaggedInt2":
				untaggedInt2 = (ExplicitlyTaggedInteger) value;
				break;
			case "untaggedInt3":
				untaggedInt3 = (ImplicitlyTaggedInteger) value;
				break;
			case "explicitlyTaggedInt":
				explicitlyTaggedInt = (UntaggedInteger) value;
				break;
			case "explicitlyTaggedInt2":
				explicitlyTaggedInt2 = (ExplicitlyTaggedInteger) value;
				break;
			case "explicitlyTaggedInt3":
				explicitlyTaggedInt3 = (ImplicitlyTaggedInteger) value;
				break;
			case "implicitlyTaggedInt":
				implicitlyTaggedInt = (UntaggedInteger) value;
				break;
			case "implicitlyTaggedInt2":
				implicitlyTaggedInt2 = (ExplicitlyTaggedInteger) value;
				break;
			case "implicitlyTaggedInt3":
				implicitlyTaggedInt3 = (ImplicitlyTaggedInteger) value;
				break;
			case "untaggedChoice":
				untaggedChoice = (UntaggedChoice) value;
				break;
			case "untaggedChoice2":
				untaggedChoice2 = (TaggedChoice) value;
				break;
			case "taggedChoice":
				taggedChoice = (UntaggedChoice) value;
				break;
			case "taggedChoice2":
				taggedChoice2 = (TaggedChoice) value;
				break;
			case "untaggedAny":
				untaggedAny = (TaggedAny) value;
				break;
			case "taggedAny":
				taggedAny = (UntaggedAny) value;
				break;
			case "taggedAny2":
				taggedAny2 = (TaggedAny) value;
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
		int sublength;

		if (taggedAny2 != null) {
			codeLength += taggedAny2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			reverseOS.write(0xB2);
			codeLength += 1;
			return codeLength;
		}
		
		if (taggedAny != null) {
			sublength = taggedAny.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
			return codeLength;
		}
		
		if (untaggedAny != null) {
			codeLength += untaggedAny.encode(reverseOS, true);
			return codeLength;
		}
		
		if (taggedChoice2 != null) {
			codeLength += taggedChoice2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			reverseOS.write(0xAF);
			codeLength += 1;
			return codeLength;
		}
		
		if (taggedChoice != null) {
			sublength = taggedChoice.encode(reverseOS);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
			return codeLength;
		}
		
		if (untaggedChoice2 != null) {
			codeLength += untaggedChoice2.encode(reverseOS, true);
			return codeLength;
		}
		
		if (untaggedChoice != null) {
			codeLength += untaggedChoice.encode(reverseOS);
			return codeLength;
		}
		
		if (implicitlyTaggedInt3 != null) {
			codeLength += implicitlyTaggedInt3.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 23
			reverseOS.write(0x97);
			codeLength += 1;
			return codeLength;
		}
		
		if (implicitlyTaggedInt2 != null) {
			codeLength += implicitlyTaggedInt2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
			return codeLength;
		}
		
		if (implicitlyTaggedInt != null) {
			codeLength += implicitlyTaggedInt.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 2
			reverseOS.write(0x82);
			codeLength += 1;
			return codeLength;
		}
		
		if (explicitlyTaggedInt3 != null) {
			sublength = explicitlyTaggedInt3.encode(reverseOS, true);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			reverseOS.write(0xB5);
			codeLength += 1;
			return codeLength;
		}
		
		if (explicitlyTaggedInt2 != null) {
			sublength = explicitlyTaggedInt2.encode(reverseOS, true);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
			reverseOS.write(0xAB);
			codeLength += 1;
			return codeLength;
		}
		
		if (explicitlyTaggedInt != null) {
			sublength = explicitlyTaggedInt.encode(reverseOS, true);
			codeLength += sublength;
			codeLength += BerLength.encodeLength(reverseOS, sublength);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (untaggedInt3 != null) {
			codeLength += untaggedInt3.encode(reverseOS, true);
			return codeLength;
		}
		
		if (untaggedInt2 != null) {
			codeLength += untaggedInt2.encode(reverseOS, true);
			return codeLength;
		}
		
		if (untaggedInt != null) {
			codeLength += untaggedInt.encode(reverseOS, true);
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

		if (berTag.equals(UntaggedInteger.tag)) {
			untaggedInt = new UntaggedInteger();
			codeLength += untaggedInt.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(ExplicitlyTaggedInteger.tag)) {
			untaggedInt2 = new ExplicitlyTaggedInteger();
			codeLength += untaggedInt2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(ImplicitlyTaggedInteger.tag)) {
			untaggedInt3 = new ImplicitlyTaggedInteger();
			codeLength += untaggedInt3.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			BerLength length = new BerLength();
			codeLength += length.decode(is);
			explicitlyTaggedInt = new UntaggedInteger();
			codeLength += explicitlyTaggedInt.decode(is, true);
			if (length.val == -1) {
				int nextByte1 = is.read();
				int nextByte2 = is.read();
				if (nextByte1 != 0 || nextByte2 != 0) {
					throw new IOException("Decoded sequence has wrong end of contents octets.");
				}
				codeLength += 2;
			}
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			BerLength length = new BerLength();
			codeLength += length.decode(is);
			explicitlyTaggedInt2 = new ExplicitlyTaggedInteger();
			codeLength += explicitlyTaggedInt2.decode(is, true);
			if (length.val == -1) {
				int nextByte1 = is.read();
				int nextByte2 = is.read();
				if (nextByte1 != 0 || nextByte2 != 0) {
					throw new IOException("Decoded sequence has wrong end of contents octets.");
				}
				codeLength += 2;
			}
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			BerLength length = new BerLength();
			codeLength += length.decode(is);
			explicitlyTaggedInt3 = new ImplicitlyTaggedInteger();
			codeLength += explicitlyTaggedInt3.decode(is, true);
			if (length.val == -1) {
				int nextByte1 = is.read();
				int nextByte2 = is.read();
				if (nextByte1 != 0 || nextByte2 != 0) {
					throw new IOException("Decoded sequence has wrong end of contents octets.");
				}
				codeLength += 2;
			}
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			implicitlyTaggedInt = new UntaggedInteger();
			codeLength += implicitlyTaggedInt.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			implicitlyTaggedInt2 = new ExplicitlyTaggedInteger();
			codeLength += implicitlyTaggedInt2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
			implicitlyTaggedInt3 = new ImplicitlyTaggedInteger();
			codeLength += implicitlyTaggedInt3.decode(is, false);
			return codeLength;
		}

		untaggedChoice = new UntaggedChoice();
		int choiceDecodeLength = untaggedChoice.decode(is, berTag);
		if (choiceDecodeLength != 0) {
			return codeLength + choiceDecodeLength;
		}
		else {
			untaggedChoice = null;
		}

		if (berTag.equals(TaggedChoice.tag)) {
			untaggedChoice2 = new TaggedChoice();
			codeLength += untaggedChoice2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			BerLength length = new BerLength();
			codeLength += length.decode(is);
			taggedChoice = new UntaggedChoice();
			codeLength += taggedChoice.decode(is, null);
			if (length.val == -1) {
				int nextByte1 = is.read();
				int nextByte2 = is.read();
				if (nextByte1 != 0 || nextByte2 != 0) {
					throw new IOException("Decoded sequence has wrong end of contents octets.");
				}
				codeLength += 2;
			}
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			taggedChoice2 = new TaggedChoice();
			codeLength += taggedChoice2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(TaggedAny.tag)) {
			untaggedAny = new TaggedAny();
			codeLength += untaggedAny.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			BerLength length = new BerLength();
			codeLength += length.decode(is);
			taggedAny = new UntaggedAny();
			codeLength += taggedAny.decode(is, null);
			if (length.val == -1) {
				int nextByte1 = is.read();
				int nextByte2 = is.read();
				if (nextByte1 != 0 || nextByte2 != 0) {
					throw new IOException("Decoded sequence has wrong end of contents octets.");
				}
				codeLength += 2;
			}
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			taggedAny2 = new TaggedAny();
			codeLength += taggedAny2.decode(is, false);
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

		if (untaggedInt != null) {
			sb.append("untaggedInt: ").append(untaggedInt);
			return;
		}

		if (untaggedInt2 != null) {
			sb.append("untaggedInt2: ").append(untaggedInt2);
			return;
		}

		if (untaggedInt3 != null) {
			sb.append("untaggedInt3: ").append(untaggedInt3);
			return;
		}

		if (explicitlyTaggedInt != null) {
			sb.append("explicitlyTaggedInt: ").append(explicitlyTaggedInt);
			return;
		}

		if (explicitlyTaggedInt2 != null) {
			sb.append("explicitlyTaggedInt2: ").append(explicitlyTaggedInt2);
			return;
		}

		if (explicitlyTaggedInt3 != null) {
			sb.append("explicitlyTaggedInt3: ").append(explicitlyTaggedInt3);
			return;
		}

		if (implicitlyTaggedInt != null) {
			sb.append("implicitlyTaggedInt: ").append(implicitlyTaggedInt);
			return;
		}

		if (implicitlyTaggedInt2 != null) {
			sb.append("implicitlyTaggedInt2: ").append(implicitlyTaggedInt2);
			return;
		}

		if (implicitlyTaggedInt3 != null) {
			sb.append("implicitlyTaggedInt3: ").append(implicitlyTaggedInt3);
			return;
		}

		if (untaggedChoice != null) {
			sb.append("untaggedChoice: ");
			untaggedChoice.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (untaggedChoice2 != null) {
			sb.append("untaggedChoice2: ");
			untaggedChoice2.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (taggedChoice != null) {
			sb.append("taggedChoice: ");
			taggedChoice.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (taggedChoice2 != null) {
			sb.append("taggedChoice2: ");
			taggedChoice2.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (untaggedAny != null) {
			sb.append("untaggedAny: ").append(untaggedAny);
			return;
		}

		if (taggedAny != null) {
			sb.append("taggedAny: ").append(taggedAny);
			return;
		}

		if (taggedAny2 != null) {
			sb.append("taggedAny2: ").append(taggedAny2);
			return;
		}

		sb.append("<none>");
	}

}

