/**
 * This class file was automatically generated by jASN1 v1.8.2 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.modules.module1;

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

import org.openmuc.jasn1.compiler.modules.module2.EmployeeNumberZ;
import org.openmuc.jasn1.compiler.modules.module3.Datezz;
import org.openmuc.jasn1.compiler.modules.module3.EmployeeNumberzz;

public class MyInt2 extends MyInt {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3);

	public byte[] code = null;

	public MyInt2() {
	}

	public MyInt2(byte[] code) {
		super(code);
	}

	public MyInt2(BigInteger value) {
		super(value);
	}

	public MyInt2(long value) {
		super(value);
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

		int codeLength;

		codeLength = super.encode(os, true);
		codeLength += BerLength.encodeLength(os, codeLength);
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

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		codeLength += super.decode(is, true);

		return codeLength;
	}

}
