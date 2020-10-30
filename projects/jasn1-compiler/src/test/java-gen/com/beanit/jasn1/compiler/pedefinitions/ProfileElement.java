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


public class ProfileElement implements BerChoice, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public ProfileHeader header = null;
	public PEGenericFileManagement genericFileManagement = null;
	public PEPINCodes pinCodes = null;
	public PEPUKCodes pukCodes = null;
	public PEAKAParameter akaParameter = null;
	public PECDMAParameter cdmaParameter = null;
	public PESecurityDomain securityDomain = null;
	public PERFM rfm = null;
	public PEApplication application = null;
	public PENonStandard nonStandard = null;
	public PEEnd end = null;
	public PEDummy rfu1 = null;
	public PEDummy rfu2 = null;
	public PEDummy rfu3 = null;
	public PEDummy rfu4 = null;
	public PEDummy rfu5 = null;
	public PEMF mf = null;
	public PECD cd = null;
	public PETELECOM telecom = null;
	public PEUSIM usim = null;
	public PEOPTUSIM optUsim = null;
	public PEISIM isim = null;
	public PEOPTISIM optIsim = null;
	public PEPHONEBOOK phonebook = null;
	public PEGSMACCESS gsmAccess = null;
	public PECSIM csim = null;
	public PEOPTCSIM optCsim = null;
	public PEEAP eap = null;
	
	public ProfileElement() {
	}

	public ProfileElement(byte[] code) {
		this.code = code;
	}

	public ProfileElement(ProfileHeader header, PEGenericFileManagement genericFileManagement, PEPINCodes pinCodes, PEPUKCodes pukCodes, PEAKAParameter akaParameter, PECDMAParameter cdmaParameter, PESecurityDomain securityDomain, PERFM rfm, PEApplication application, PENonStandard nonStandard, PEEnd end, PEDummy rfu1, PEDummy rfu2, PEDummy rfu3, PEDummy rfu4, PEDummy rfu5, PEMF mf, PECD cd, PETELECOM telecom, PEUSIM usim, PEOPTUSIM optUsim, PEISIM isim, PEOPTISIM optIsim, PEPHONEBOOK phonebook, PEGSMACCESS gsmAccess, PECSIM csim, PEOPTCSIM optCsim, PEEAP eap) {
		this.header = header;
		this.genericFileManagement = genericFileManagement;
		this.pinCodes = pinCodes;
		this.pukCodes = pukCodes;
		this.akaParameter = akaParameter;
		this.cdmaParameter = cdmaParameter;
		this.securityDomain = securityDomain;
		this.rfm = rfm;
		this.application = application;
		this.nonStandard = nonStandard;
		this.end = end;
		this.rfu1 = rfu1;
		this.rfu2 = rfu2;
		this.rfu3 = rfu3;
		this.rfu4 = rfu4;
		this.rfu5 = rfu5;
		this.mf = mf;
		this.cd = cd;
		this.telecom = telecom;
		this.usim = usim;
		this.optUsim = optUsim;
		this.isim = isim;
		this.optIsim = optIsim;
		this.phonebook = phonebook;
		this.gsmAccess = gsmAccess;
		this.csim = csim;
		this.optCsim = optCsim;
		this.eap = eap;
	}

	private final List<String> FIELDS = Collections.unmodifiableList(Arrays.asList(
		"header",
		"genericFileManagement",
		"pinCodes",
		"pukCodes",
		"akaParameter",
		"cdmaParameter",
		"securityDomain",
		"rfm",
		"application",
		"nonStandard",
		"end",
		"rfu1",
		"rfu2",
		"rfu3",
		"rfu4",
		"rfu5",
		"mf",
		"cd",
		"telecom",
		"usim",
		"opt-usim",
		"isim",
		"opt-isim",
		"phonebook",
		"gsm-access",
		"csim",
		"opt-csim",
		"eap"
	));
	public List<String> getFields() {
		return FIELDS;
	}
	public BerType getField(String fieldName) {
		switch(fieldName) {
			case "header":
				return header;
			case "genericFileManagement":
				return genericFileManagement;
			case "pinCodes":
				return pinCodes;
			case "pukCodes":
				return pukCodes;
			case "akaParameter":
				return akaParameter;
			case "cdmaParameter":
				return cdmaParameter;
			case "securityDomain":
				return securityDomain;
			case "rfm":
				return rfm;
			case "application":
				return application;
			case "nonStandard":
				return nonStandard;
			case "end":
				return end;
			case "rfu1":
				return rfu1;
			case "rfu2":
				return rfu2;
			case "rfu3":
				return rfu3;
			case "rfu4":
				return rfu4;
			case "rfu5":
				return rfu5;
			case "mf":
				return mf;
			case "cd":
				return cd;
			case "telecom":
				return telecom;
			case "usim":
				return usim;
			case "opt-usim":
				return optUsim;
			case "isim":
				return isim;
			case "opt-isim":
				return optIsim;
			case "phonebook":
				return phonebook;
			case "gsm-access":
				return gsmAccess;
			case "csim":
				return csim;
			case "opt-csim":
				return optCsim;
			case "eap":
				return eap;
			default:
				return null;
		}
	}
	public Class<? extends BerType> getFieldClass(String fieldName) {
		switch(fieldName) {
			case "header":
				return ProfileHeader.class;
			case "genericFileManagement":
				return PEGenericFileManagement.class;
			case "pinCodes":
				return PEPINCodes.class;
			case "pukCodes":
				return PEPUKCodes.class;
			case "akaParameter":
				return PEAKAParameter.class;
			case "cdmaParameter":
				return PECDMAParameter.class;
			case "securityDomain":
				return PESecurityDomain.class;
			case "rfm":
				return PERFM.class;
			case "application":
				return PEApplication.class;
			case "nonStandard":
				return PENonStandard.class;
			case "end":
				return PEEnd.class;
			case "rfu1":
				return PEDummy.class;
			case "rfu2":
				return PEDummy.class;
			case "rfu3":
				return PEDummy.class;
			case "rfu4":
				return PEDummy.class;
			case "rfu5":
				return PEDummy.class;
			case "mf":
				return PEMF.class;
			case "cd":
				return PECD.class;
			case "telecom":
				return PETELECOM.class;
			case "usim":
				return PEUSIM.class;
			case "opt-usim":
				return PEOPTUSIM.class;
			case "isim":
				return PEISIM.class;
			case "opt-isim":
				return PEOPTISIM.class;
			case "phonebook":
				return PEPHONEBOOK.class;
			case "gsm-access":
				return PEGSMACCESS.class;
			case "csim":
				return PECSIM.class;
			case "opt-csim":
				return PEOPTCSIM.class;
			case "eap":
				return PEEAP.class;
			default:
				return null;
		}
	}
	public void setField(String fieldName, BerType value) {
		switch(fieldName) {
			case "header":
				header = (ProfileHeader) value;
				break;
			case "genericFileManagement":
				genericFileManagement = (PEGenericFileManagement) value;
				break;
			case "pinCodes":
				pinCodes = (PEPINCodes) value;
				break;
			case "pukCodes":
				pukCodes = (PEPUKCodes) value;
				break;
			case "akaParameter":
				akaParameter = (PEAKAParameter) value;
				break;
			case "cdmaParameter":
				cdmaParameter = (PECDMAParameter) value;
				break;
			case "securityDomain":
				securityDomain = (PESecurityDomain) value;
				break;
			case "rfm":
				rfm = (PERFM) value;
				break;
			case "application":
				application = (PEApplication) value;
				break;
			case "nonStandard":
				nonStandard = (PENonStandard) value;
				break;
			case "end":
				end = (PEEnd) value;
				break;
			case "rfu1":
				rfu1 = (PEDummy) value;
				break;
			case "rfu2":
				rfu2 = (PEDummy) value;
				break;
			case "rfu3":
				rfu3 = (PEDummy) value;
				break;
			case "rfu4":
				rfu4 = (PEDummy) value;
				break;
			case "rfu5":
				rfu5 = (PEDummy) value;
				break;
			case "mf":
				mf = (PEMF) value;
				break;
			case "cd":
				cd = (PECD) value;
				break;
			case "telecom":
				telecom = (PETELECOM) value;
				break;
			case "usim":
				usim = (PEUSIM) value;
				break;
			case "opt-usim":
				optUsim = (PEOPTUSIM) value;
				break;
			case "isim":
				isim = (PEISIM) value;
				break;
			case "opt-isim":
				optIsim = (PEOPTISIM) value;
				break;
			case "phonebook":
				phonebook = (PEPHONEBOOK) value;
				break;
			case "gsm-access":
				gsmAccess = (PEGSMACCESS) value;
				break;
			case "csim":
				csim = (PECSIM) value;
				break;
			case "opt-csim":
				optCsim = (PEOPTCSIM) value;
				break;
			case "eap":
				eap = (PEEAP) value;
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
		if (eap != null) {
			codeLength += eap.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 27
			reverseOS.write(0xBB);
			codeLength += 1;
			return codeLength;
		}
		
		if (optCsim != null) {
			codeLength += optCsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 26
			reverseOS.write(0xBA);
			codeLength += 1;
			return codeLength;
		}
		
		if (csim != null) {
			codeLength += csim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 25
			reverseOS.write(0xB9);
			codeLength += 1;
			return codeLength;
		}
		
		if (gsmAccess != null) {
			codeLength += gsmAccess.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 24
			reverseOS.write(0xB8);
			codeLength += 1;
			return codeLength;
		}
		
		if (phonebook != null) {
			codeLength += phonebook.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 23
			reverseOS.write(0xB7);
			codeLength += 1;
			return codeLength;
		}
		
		if (optIsim != null) {
			codeLength += optIsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 22
			reverseOS.write(0xB6);
			codeLength += 1;
			return codeLength;
		}
		
		if (isim != null) {
			codeLength += isim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			reverseOS.write(0xB5);
			codeLength += 1;
			return codeLength;
		}
		
		if (optUsim != null) {
			codeLength += optUsim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 20
			reverseOS.write(0xB4);
			codeLength += 1;
			return codeLength;
		}
		
		if (usim != null) {
			codeLength += usim.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			reverseOS.write(0xB3);
			codeLength += 1;
			return codeLength;
		}
		
		if (telecom != null) {
			codeLength += telecom.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			reverseOS.write(0xB2);
			codeLength += 1;
			return codeLength;
		}
		
		if (cd != null) {
			codeLength += cd.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 17
			reverseOS.write(0xB1);
			codeLength += 1;
			return codeLength;
		}
		
		if (mf != null) {
			codeLength += mf.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			reverseOS.write(0xB0);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu5 != null) {
			codeLength += rfu5.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			reverseOS.write(0xAF);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu4 != null) {
			codeLength += rfu4.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
			reverseOS.write(0xAE);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu3 != null) {
			codeLength += rfu3.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			reverseOS.write(0xAD);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu2 != null) {
			codeLength += rfu2.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfu1 != null) {
			codeLength += rfu1.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
			reverseOS.write(0xAB);
			codeLength += 1;
			return codeLength;
		}
		
		if (end != null) {
			codeLength += end.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			reverseOS.write(0xAA);
			codeLength += 1;
			return codeLength;
		}
		
		if (nonStandard != null) {
			codeLength += nonStandard.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			reverseOS.write(0xA9);
			codeLength += 1;
			return codeLength;
		}
		
		if (application != null) {
			codeLength += application.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			reverseOS.write(0xA8);
			codeLength += 1;
			return codeLength;
		}
		
		if (rfm != null) {
			codeLength += rfm.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			reverseOS.write(0xA7);
			codeLength += 1;
			return codeLength;
		}
		
		if (securityDomain != null) {
			codeLength += securityDomain.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
			return codeLength;
		}
		
		if (cdmaParameter != null) {
			codeLength += cdmaParameter.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
			return codeLength;
		}
		
		if (akaParameter != null) {
			codeLength += akaParameter.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			reverseOS.write(0xA4);
			codeLength += 1;
			return codeLength;
		}
		
		if (pukCodes != null) {
			codeLength += pukCodes.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			reverseOS.write(0xA3);
			codeLength += 1;
			return codeLength;
		}
		
		if (pinCodes != null) {
			codeLength += pinCodes.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			reverseOS.write(0xA2);
			codeLength += 1;
			return codeLength;
		}
		
		if (genericFileManagement != null) {
			codeLength += genericFileManagement.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 1
			reverseOS.write(0xA1);
			codeLength += 1;
			return codeLength;
		}
		
		if (header != null) {
			codeLength += header.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			reverseOS.write(0xA0);
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

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			header = new ProfileHeader();
			codeLength += header.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 1)) {
			genericFileManagement = new PEGenericFileManagement();
			codeLength += genericFileManagement.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			pinCodes = new PEPINCodes();
			codeLength += pinCodes.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			pukCodes = new PEPUKCodes();
			codeLength += pukCodes.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			akaParameter = new PEAKAParameter();
			codeLength += akaParameter.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			cdmaParameter = new PECDMAParameter();
			codeLength += cdmaParameter.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			securityDomain = new PESecurityDomain();
			codeLength += securityDomain.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
			rfm = new PERFM();
			codeLength += rfm.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			application = new PEApplication();
			codeLength += application.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			nonStandard = new PENonStandard();
			codeLength += nonStandard.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
			end = new PEEnd();
			codeLength += end.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			rfu1 = new PEDummy();
			codeLength += rfu1.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			rfu2 = new PEDummy();
			codeLength += rfu2.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
			rfu3 = new PEDummy();
			codeLength += rfu3.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
			rfu4 = new PEDummy();
			codeLength += rfu4.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			rfu5 = new PEDummy();
			codeLength += rfu5.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
			mf = new PEMF();
			codeLength += mf.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 17)) {
			cd = new PECD();
			codeLength += cd.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			telecom = new PETELECOM();
			codeLength += telecom.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
			usim = new PEUSIM();
			codeLength += usim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 20)) {
			optUsim = new PEOPTUSIM();
			codeLength += optUsim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			isim = new PEISIM();
			codeLength += isim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 22)) {
			optIsim = new PEOPTISIM();
			codeLength += optIsim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 23)) {
			phonebook = new PEPHONEBOOK();
			codeLength += phonebook.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 24)) {
			gsmAccess = new PEGSMACCESS();
			codeLength += gsmAccess.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 25)) {
			csim = new PECSIM();
			codeLength += csim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 26)) {
			optCsim = new PEOPTCSIM();
			codeLength += optCsim.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 27)) {
			eap = new PEEAP();
			codeLength += eap.decode(is, false);
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

		if (header != null) {
			sb.append("header: ");
			header.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (genericFileManagement != null) {
			sb.append("genericFileManagement: ");
			genericFileManagement.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (pinCodes != null) {
			sb.append("pinCodes: ");
			pinCodes.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (pukCodes != null) {
			sb.append("pukCodes: ");
			pukCodes.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (akaParameter != null) {
			sb.append("akaParameter: ");
			akaParameter.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cdmaParameter != null) {
			sb.append("cdmaParameter: ");
			cdmaParameter.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (securityDomain != null) {
			sb.append("securityDomain: ");
			securityDomain.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfm != null) {
			sb.append("rfm: ");
			rfm.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (application != null) {
			sb.append("application: ");
			application.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (nonStandard != null) {
			sb.append("nonStandard: ");
			nonStandard.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (end != null) {
			sb.append("end: ");
			end.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu1 != null) {
			sb.append("rfu1: ");
			rfu1.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu2 != null) {
			sb.append("rfu2: ");
			rfu2.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu3 != null) {
			sb.append("rfu3: ");
			rfu3.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu4 != null) {
			sb.append("rfu4: ");
			rfu4.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (rfu5 != null) {
			sb.append("rfu5: ");
			rfu5.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (mf != null) {
			sb.append("mf: ");
			mf.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (cd != null) {
			sb.append("cd: ");
			cd.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (telecom != null) {
			sb.append("telecom: ");
			telecom.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (usim != null) {
			sb.append("usim: ");
			usim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optUsim != null) {
			sb.append("optUsim: ");
			optUsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (isim != null) {
			sb.append("isim: ");
			isim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optIsim != null) {
			sb.append("optIsim: ");
			optIsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (phonebook != null) {
			sb.append("phonebook: ");
			phonebook.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (gsmAccess != null) {
			sb.append("gsmAccess: ");
			gsmAccess.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (csim != null) {
			sb.append("csim: ");
			csim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (optCsim != null) {
			sb.append("optCsim: ");
			optCsim.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (eap != null) {
			sb.append("eap: ");
			eap.appendAsString(sb, indentLevel + 1);
			return;
		}

		sb.append("<none>");
	}

}

