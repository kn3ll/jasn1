/**
 * This class file was automatically generated by jASN1 v1.8.2 (http://www.openmuc.org)
 */

package org.openmuc.jasn1.compiler.rspdefinitions;

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

import org.openmuc.jasn1.compiler.pkix1explicit88.Certificate;
import org.openmuc.jasn1.compiler.pkix1explicit88.CertificateList;
import org.openmuc.jasn1.compiler.pkix1explicit88.Time;
import org.openmuc.jasn1.compiler.pkix1implicit88.SubjectKeyIdentifier;

public class ListNotificationResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public static final BerTag tag = new BerTag(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 40);

	public static class NotificationMetadataList implements Serializable {

		private static final long serialVersionUID = 1L;

		public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);
		public byte[] code = null;
		public List<NotificationMetadata> seqOf = null;

		public NotificationMetadataList() {
			seqOf = new ArrayList<NotificationMetadata>();
		}

		public NotificationMetadataList(byte[] code) {
			this.code = code;
		}

		public NotificationMetadataList(List<NotificationMetadata> seqOf) {
			this.seqOf = seqOf;
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

					NotificationMetadata element = new NotificationMetadata();
					subCodeLength += element.decode(is, false);
					seqOf.add(element);
				}
			}
			while (subCodeLength < totalLength) {
				NotificationMetadata element = new NotificationMetadata();
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
				Iterator<NotificationMetadata> it = seqOf.iterator();
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

	public NotificationMetadataList notificationMetadataList = null;
	public BerInteger listNotificationsResultError = null;
	
	public ListNotificationResponse() {
	}

	public ListNotificationResponse(byte[] code) {
		this.code = code;
	}

	public ListNotificationResponse(NotificationMetadataList notificationMetadataList, BerInteger listNotificationsResultError) {
		this.notificationMetadataList = notificationMetadataList;
		this.listNotificationsResultError = listNotificationsResultError;
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
		if (listNotificationsResultError != null) {
			codeLength += listNotificationsResultError.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			os.write(0x81);
			codeLength += 1;
			codeLength += BerLength.encodeLength(os, codeLength);
			if (withTag) {
				codeLength += tag.encode(os);
			}
			return codeLength;
		}
		
		if (notificationMetadataList != null) {
			codeLength += notificationMetadataList.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			os.write(0xA0);
			codeLength += 1;
			codeLength += BerLength.encodeLength(os, codeLength);
			if (withTag) {
				codeLength += tag.encode(os);
			}
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		BerLength length = new BerLength();
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		codeLength += length.decode(is);
		codeLength += berTag.decode(is);

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			notificationMetadataList = new NotificationMetadataList();
			codeLength += notificationMetadataList.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			listNotificationsResultError = new BerInteger();
			codeLength += listNotificationsResultError.decode(is, false);
			return codeLength;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
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

		if (notificationMetadataList != null) {
			sb.append("notificationMetadataList: ");
			notificationMetadataList.appendAsString(sb, indentLevel + 1);
			return;
		}

		if (listNotificationsResultError != null) {
			sb.append("listNotificationsResultError: ").append(listNotificationsResultError);
			return;
		}

		sb.append("<none>");
	}

}

