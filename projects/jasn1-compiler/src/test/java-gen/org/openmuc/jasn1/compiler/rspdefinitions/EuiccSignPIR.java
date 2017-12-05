/**
 * This class file was automatically generated by jASN1 v1.8.3-SNAPSHOT (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.rspdefinitions;

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

import org.openmuc.jasn1.compiler.pkix1explicit88.Certificate;
import org.openmuc.jasn1.compiler.pkix1explicit88.CertificateList;
import org.openmuc.jasn1.compiler.pkix1explicit88.Time;
import org.openmuc.jasn1.compiler.pkix1implicit88.SubjectKeyIdentifier;

public class EuiccSignPIR extends BerOctetString {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.APPLICATION_CLASS, BerTag.PRIMITIVE, 55);

	public EuiccSignPIR() {
	}

	public EuiccSignPIR(byte[] value) {
		super(value);
	}

	public int encode(OutputStream os, boolean withTag) throws IOException {

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
