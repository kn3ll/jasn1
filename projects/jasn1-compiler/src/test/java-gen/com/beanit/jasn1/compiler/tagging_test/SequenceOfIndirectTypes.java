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


public class SequenceOfIndirectTypes implements BerSequenceSet, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

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
	
	public SequenceOfIndirectTypes() {
	}

	public SequenceOfIndirectTypes(byte[] code) {
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
		"untaggedInt",
		"untaggedInt2",
		"untaggedInt3",
		"explicitlyTaggedInt",
		"explicitlyTaggedInt2",
		"explicitlyTaggedInt3",
		"implicitlyTaggedInt",
		"implicitlyTaggedInt2",
		"implicitlyTaggedInt3",
		"untaggedChoice",
		"untaggedChoice2",
		"taggedChoice",
		"taggedChoice2",
		"untaggedAny",
		"taggedAny",
		"taggedAny2"
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

		codeLength += taggedAny2.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
		reverseOS.write(0xB2);
		codeLength += 1;
		
		sublength = taggedAny.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
		reverseOS.write(0xA8);
		codeLength += 1;
		
		codeLength += untaggedAny.encode(reverseOS, true);
		
		codeLength += taggedChoice2.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
		reverseOS.write(0xAF);
		codeLength += 1;
		
		sublength = taggedChoice.encode(reverseOS);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
		reverseOS.write(0xA5);
		codeLength += 1;
		
		codeLength += untaggedChoice2.encode(reverseOS, true);
		
		codeLength += untaggedChoice.encode(reverseOS);
		
		codeLength += implicitlyTaggedInt3.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 23
		reverseOS.write(0x97);
		codeLength += 1;
		
		codeLength += implicitlyTaggedInt2.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
		reverseOS.write(0xAC);
		codeLength += 1;
		
		codeLength += implicitlyTaggedInt.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 2
		reverseOS.write(0x82);
		codeLength += 1;
		
		sublength = explicitlyTaggedInt3.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
		reverseOS.write(0xB5);
		codeLength += 1;
		
		sublength = explicitlyTaggedInt2.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
		reverseOS.write(0xAB);
		codeLength += 1;
		
		sublength = explicitlyTaggedInt.encode(reverseOS, true);
		codeLength += sublength;
		codeLength += BerLength.encodeLength(reverseOS, sublength);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
		reverseOS.write(0xA1);
		codeLength += 1;
		
		codeLength += untaggedInt3.encode(reverseOS, true);
		
		codeLength += untaggedInt2.encode(reverseOS, true);
		
		codeLength += untaggedInt.encode(reverseOS, true);
		
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
		codeLength += totalLength;

		subCodeLength += berTag.decode(is);
		if (berTag.equals(UntaggedInteger.tag)) {
			untaggedInt = new UntaggedInteger();
			subCodeLength += untaggedInt.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(ExplicitlyTaggedInteger.tag)) {
			untaggedInt2 = new ExplicitlyTaggedInteger();
			subCodeLength += untaggedInt2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(ImplicitlyTaggedInteger.tag)) {
			untaggedInt3 = new ImplicitlyTaggedInteger();
			subCodeLength += untaggedInt3.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			subCodeLength += length.decode(is);
			explicitlyTaggedInt = new UntaggedInteger();
			subCodeLength += explicitlyTaggedInt.decode(is, true);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			subCodeLength += length.decode(is);
			explicitlyTaggedInt2 = new ExplicitlyTaggedInteger();
			subCodeLength += explicitlyTaggedInt2.decode(is, true);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			subCodeLength += length.decode(is);
			explicitlyTaggedInt3 = new ImplicitlyTaggedInteger();
			subCodeLength += explicitlyTaggedInt3.decode(is, true);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 2)) {
			implicitlyTaggedInt = new UntaggedInteger();
			subCodeLength += implicitlyTaggedInt.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			implicitlyTaggedInt2 = new ExplicitlyTaggedInteger();
			subCodeLength += implicitlyTaggedInt2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 23)) {
			implicitlyTaggedInt3 = new ImplicitlyTaggedInteger();
			subCodeLength += implicitlyTaggedInt3.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		untaggedChoice = new UntaggedChoice();
		subCodeLength += untaggedChoice.decode(is, berTag);
		subCodeLength += berTag.decode(is);
		
		if (berTag.equals(TaggedChoice.tag)) {
			untaggedChoice2 = new TaggedChoice();
			subCodeLength += untaggedChoice2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			subCodeLength += length.decode(is);
			taggedChoice = new UntaggedChoice();
			subCodeLength += taggedChoice.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			taggedChoice2 = new TaggedChoice();
			subCodeLength += taggedChoice2.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(TaggedAny.tag)) {
			untaggedAny = new TaggedAny();
			subCodeLength += untaggedAny.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			subCodeLength += length.decode(is);
			taggedAny = new UntaggedAny();
			subCodeLength += taggedAny.decode(is, null);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			taggedAny2 = new TaggedAny();
			subCodeLength += taggedAny2.decode(is, false);
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
		if (untaggedInt != null) {
			sb.append("untaggedInt: ").append(untaggedInt);
		}
		else {
			sb.append("untaggedInt: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (untaggedInt2 != null) {
			sb.append("untaggedInt2: ").append(untaggedInt2);
		}
		else {
			sb.append("untaggedInt2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (untaggedInt3 != null) {
			sb.append("untaggedInt3: ").append(untaggedInt3);
		}
		else {
			sb.append("untaggedInt3: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (explicitlyTaggedInt != null) {
			sb.append("explicitlyTaggedInt: ").append(explicitlyTaggedInt);
		}
		else {
			sb.append("explicitlyTaggedInt: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (explicitlyTaggedInt2 != null) {
			sb.append("explicitlyTaggedInt2: ").append(explicitlyTaggedInt2);
		}
		else {
			sb.append("explicitlyTaggedInt2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (explicitlyTaggedInt3 != null) {
			sb.append("explicitlyTaggedInt3: ").append(explicitlyTaggedInt3);
		}
		else {
			sb.append("explicitlyTaggedInt3: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (implicitlyTaggedInt != null) {
			sb.append("implicitlyTaggedInt: ").append(implicitlyTaggedInt);
		}
		else {
			sb.append("implicitlyTaggedInt: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (implicitlyTaggedInt2 != null) {
			sb.append("implicitlyTaggedInt2: ").append(implicitlyTaggedInt2);
		}
		else {
			sb.append("implicitlyTaggedInt2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (implicitlyTaggedInt3 != null) {
			sb.append("implicitlyTaggedInt3: ").append(implicitlyTaggedInt3);
		}
		else {
			sb.append("implicitlyTaggedInt3: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (untaggedChoice != null) {
			sb.append("untaggedChoice: ");
			untaggedChoice.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("untaggedChoice: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (untaggedChoice2 != null) {
			sb.append("untaggedChoice2: ");
			untaggedChoice2.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("untaggedChoice2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (taggedChoice != null) {
			sb.append("taggedChoice: ");
			taggedChoice.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("taggedChoice: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (taggedChoice2 != null) {
			sb.append("taggedChoice2: ");
			taggedChoice2.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("taggedChoice2: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (untaggedAny != null) {
			sb.append("untaggedAny: ").append(untaggedAny);
		}
		else {
			sb.append("untaggedAny: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (taggedAny != null) {
			sb.append("taggedAny: ").append(taggedAny);
		}
		else {
			sb.append("taggedAny: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (taggedAny2 != null) {
			sb.append("taggedAny2: ").append(taggedAny2);
		}
		else {
			sb.append("taggedAny2: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

