/**
 * This class file was automatically generated by jASN1 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.information_objects;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;


public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	private BerInteger itemCode = null;
	private BerVisibleString itemDescription = null;
	private BerAny feature = null;
	private BerInteger quantity = null;
	private BerReal unitPrice = null;
	private BerReal itemTotal = null;
	private BerBoolean isTaxable = null;
	
	public Item() {
	}

	public Item(byte[] code) {
		this.code = code;
	}

	public void setItemCode(BerInteger itemCode) {
		this.itemCode = itemCode;
	}

	public BerInteger getItemCode() {
		return itemCode;
	}

	public void setItemDescription(BerVisibleString itemDescription) {
		this.itemDescription = itemDescription;
	}

	public BerVisibleString getItemDescription() {
		return itemDescription;
	}

	public void setFeature(BerAny feature) {
		this.feature = feature;
	}

	public BerAny getFeature() {
		return feature;
	}

	public void setQuantity(BerInteger quantity) {
		this.quantity = quantity;
	}

	public BerInteger getQuantity() {
		return quantity;
	}

	public void setUnitPrice(BerReal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BerReal getUnitPrice() {
		return unitPrice;
	}

	public void setItemTotal(BerReal itemTotal) {
		this.itemTotal = itemTotal;
	}

	public BerReal getItemTotal() {
		return itemTotal;
	}

	public void setIsTaxable(BerBoolean isTaxable) {
		this.isTaxable = isTaxable;
	}

	public BerBoolean getIsTaxable() {
		return isTaxable;
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
		codeLength += isTaxable.encode(reverseOS, true);
		
		codeLength += itemTotal.encode(reverseOS, true);
		
		codeLength += unitPrice.encode(reverseOS, true);
		
		codeLength += quantity.encode(reverseOS, true);
		
		codeLength += feature.encode(reverseOS);
		
		codeLength += itemDescription.encode(reverseOS, true);
		
		codeLength += itemCode.encode(reverseOS, true);
		
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
			if (berTag.equals(BerInteger.tag)) {
				itemCode = new BerInteger();
				subCodeLength += itemCode.decode(is, false);
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
			if (berTag.equals(BerVisibleString.tag)) {
				itemDescription = new BerVisibleString();
				subCodeLength += itemDescription.decode(is, false);
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
			feature = new BerAny();
			int choiceDecodeLength = feature.decode(is, berTag);
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
				feature = null;
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
			if (berTag.equals(BerInteger.tag)) {
				quantity = new BerInteger();
				subCodeLength += quantity.decode(is, false);
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
			if (berTag.equals(BerReal.tag)) {
				unitPrice = new BerReal();
				subCodeLength += unitPrice.decode(is, false);
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
			if (berTag.equals(BerReal.tag)) {
				itemTotal = new BerReal();
				subCodeLength += itemTotal.decode(is, false);
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
			if (berTag.equals(BerBoolean.tag)) {
				isTaxable = new BerBoolean();
				subCodeLength += isTaxable.decode(is, false);
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
		if (berTag.equals(BerInteger.tag)) {
			itemCode = new BerInteger();
			subCodeLength += itemCode.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerVisibleString.tag)) {
			itemDescription = new BerVisibleString();
			subCodeLength += itemDescription.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		feature = new BerAny();
		subCodeLength += feature.decode(is, berTag);
		subCodeLength += berTag.decode(is);
		
		if (berTag.equals(BerInteger.tag)) {
			quantity = new BerInteger();
			subCodeLength += quantity.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerReal.tag)) {
			unitPrice = new BerReal();
			subCodeLength += unitPrice.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerReal.tag)) {
			itemTotal = new BerReal();
			subCodeLength += itemTotal.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerBoolean.tag)) {
			isTaxable = new BerBoolean();
			subCodeLength += isTaxable.decode(is, false);
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
		if (itemCode != null) {
			sb.append("itemCode: ").append(itemCode);
		}
		else {
			sb.append("itemCode: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (itemDescription != null) {
			sb.append("itemDescription: ").append(itemDescription);
		}
		else {
			sb.append("itemDescription: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (feature != null) {
			sb.append("feature: ").append(feature);
		}
		else {
			sb.append("feature: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (quantity != null) {
			sb.append("quantity: ").append(quantity);
		}
		else {
			sb.append("quantity: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (unitPrice != null) {
			sb.append("unitPrice: ").append(unitPrice);
		}
		else {
			sb.append("unitPrice: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (itemTotal != null) {
			sb.append("itemTotal: ").append(itemTotal);
		}
		else {
			sb.append("itemTotal: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (isTaxable != null) {
			sb.append("isTaxable: ").append(isTaxable);
		}
		else {
			sb.append("isTaxable: <empty-required-field>");
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

