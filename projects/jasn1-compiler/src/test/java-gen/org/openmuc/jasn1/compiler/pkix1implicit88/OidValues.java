/**
 * This class file was automatically generated by jASN1 v1.8.2 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.pkix1implicit88;

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

import org.openmuc.jasn1.compiler.pkix1explicit88.Attribute;
import org.openmuc.jasn1.compiler.pkix1explicit88.CertificateSerialNumber;
import org.openmuc.jasn1.compiler.pkix1explicit88.DirectoryString;
import org.openmuc.jasn1.compiler.pkix1explicit88.Name;
import org.openmuc.jasn1.compiler.pkix1explicit88.ORAddress;
import org.openmuc.jasn1.compiler.pkix1explicit88.RelativeDistinguishedName;

public final class OidValues {
	public static final BerObjectIdentifier anyExtendedKeyUsage = new BerObjectIdentifier(new int[]{2, 5, 29, 37, 0});
	public static final BerObjectIdentifier anyPolicy = new BerObjectIdentifier(new int[]{2, 5, 29, 32, 0});
	public static final BerObjectIdentifier holdInstruction = new BerObjectIdentifier(new int[]{2, 2, 840, 10040, 2});
	public static final BerObjectIdentifier idCe = new BerObjectIdentifier(new int[]{2, 5, 29});
	public static final BerObjectIdentifier idCeAuthorityKeyIdentifier = new BerObjectIdentifier(new int[]{2, 5, 29, 35});
	public static final BerObjectIdentifier idCeBasicConstraints = new BerObjectIdentifier(new int[]{2, 5, 29, 19});
	public static final BerObjectIdentifier idCeCRLDistributionPoints = new BerObjectIdentifier(new int[]{2, 5, 29, 31});
	public static final BerObjectIdentifier idCeCRLNumber = new BerObjectIdentifier(new int[]{2, 5, 29, 20});
	public static final BerObjectIdentifier idCeCRLReasons = new BerObjectIdentifier(new int[]{2, 5, 29, 21});
	public static final BerObjectIdentifier idCeCertificateIssuer = new BerObjectIdentifier(new int[]{2, 5, 29, 29});
	public static final BerObjectIdentifier idCeCertificatePolicies = new BerObjectIdentifier(new int[]{2, 5, 29, 32});
	public static final BerObjectIdentifier idCeDeltaCRLIndicator = new BerObjectIdentifier(new int[]{2, 5, 29, 27});
	public static final BerObjectIdentifier idCeExtKeyUsage = new BerObjectIdentifier(new int[]{2, 5, 29, 37});
	public static final BerObjectIdentifier idCeFreshestCRL = new BerObjectIdentifier(new int[]{2, 5, 29, 46});
	public static final BerObjectIdentifier idCeHoldInstructionCode = new BerObjectIdentifier(new int[]{2, 5, 29, 23});
	public static final BerObjectIdentifier idCeInhibitAnyPolicy = new BerObjectIdentifier(new int[]{2, 5, 29, 54});
	public static final BerObjectIdentifier idCeInvalidityDate = new BerObjectIdentifier(new int[]{2, 5, 29, 24});
	public static final BerObjectIdentifier idCeIssuerAltName = new BerObjectIdentifier(new int[]{2, 5, 29, 18});
	public static final BerObjectIdentifier idCeIssuingDistributionPoint = new BerObjectIdentifier(new int[]{2, 5, 29, 28});
	public static final BerObjectIdentifier idCeKeyUsage = new BerObjectIdentifier(new int[]{2, 5, 29, 15});
	public static final BerObjectIdentifier idCeNameConstraints = new BerObjectIdentifier(new int[]{2, 5, 29, 30});
	public static final BerObjectIdentifier idCePolicyConstraints = new BerObjectIdentifier(new int[]{2, 5, 29, 36});
	public static final BerObjectIdentifier idCePolicyMappings = new BerObjectIdentifier(new int[]{2, 5, 29, 33});
	public static final BerObjectIdentifier idCePrivateKeyUsagePeriod = new BerObjectIdentifier(new int[]{2, 5, 29, 16});
	public static final BerObjectIdentifier idCeSubjectAltName = new BerObjectIdentifier(new int[]{2, 5, 29, 17});
	public static final BerObjectIdentifier idCeSubjectDirectoryAttributes = new BerObjectIdentifier(new int[]{2, 5, 29, 9});
	public static final BerObjectIdentifier idCeSubjectKeyIdentifier = new BerObjectIdentifier(new int[]{2, 5, 29, 14});
	public static final BerObjectIdentifier idHoldinstructionCallissuer = new BerObjectIdentifier(new int[]{2, 2, 840, 10040, 2, 2});
	public static final BerObjectIdentifier idHoldinstructionNone = new BerObjectIdentifier(new int[]{2, 2, 840, 10040, 2, 1});
	public static final BerObjectIdentifier idHoldinstructionReject = new BerObjectIdentifier(new int[]{2, 2, 840, 10040, 2, 3});
	public static final BerObjectIdentifier idKpOCSPSigning = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 9});
	public static final BerObjectIdentifier idKpClientAuth = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 2});
	public static final BerObjectIdentifier idKpCodeSigning = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 3});
	public static final BerObjectIdentifier idKpEmailProtection = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 4});
	public static final BerObjectIdentifier idKpServerAuth = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 1});
	public static final BerObjectIdentifier idKpTimeStamping = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 3, 8});
	public static final BerObjectIdentifier idPeAuthorityInfoAccess = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 1, 1});
	public static final BerObjectIdentifier idPeSubjectInfoAccess = new BerObjectIdentifier(new int[]{1, 3, 6, 1, 5, 5, 7, 1, 11});
}
