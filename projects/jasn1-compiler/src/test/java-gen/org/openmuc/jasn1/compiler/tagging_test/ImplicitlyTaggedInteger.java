/**
 * This class file was automatically generated by jASN1 v1.8.3-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.tagging_test;

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
import org.openmuc.jasn1.ber.*;
import org.openmuc.jasn1.ber.types.*;
import org.openmuc.jasn1.ber.types.string.*;


public class ImplicitlyTaggedInteger extends BerInteger {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 33);

	public ImplicitlyTaggedInteger() {
	}

	public ImplicitlyTaggedInteger(byte[] code) {
		super(code);
	}

	public ImplicitlyTaggedInteger(BigInteger value) {
		super(value);
	}

	public ImplicitlyTaggedInteger(long value) {
		super(value);
	}

	public int encode(OutputStream os, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
			if (withTag) {
				return tag.encode(os) + code.length;
			}
			return code.length;
		}

		int codeLength;

		codeLength = super.encode(os, false);
		if (withTag) {
			codeLength += tag.encode(os);
		}

		return codeLength;
	}

	public int decode(InputStream is, boolean withTag) throws IOException {

		int codeLength = 0;

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		codeLength += super.decode(is, false);

		return codeLength;
	}

}
