package okhttp3.internal;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import p353j.C9703f;

/* compiled from: hostnames.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m32267d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "toCanonicalHost", "(Ljava/lang/String;)Ljava/lang/String;", HttpUrl.FRAGMENT_ENCODE_SET, "containsInvalidHostnameAsciiCodes", "(Ljava/lang/String;)Z", "input", HttpUrl.FRAGMENT_ENCODE_SET, "pos", "limit", "Ljava/net/InetAddress;", "decodeIpv6", "(Ljava/lang/String;II)Ljava/net/InetAddress;", HttpUrl.FRAGMENT_ENCODE_SET, "address", "addressOffset", "decodeIpv4Suffix", "(Ljava/lang/String;II[BI)Z", "inet6AddressToAscii", "([B)Ljava/lang/String;", "okhttp"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (C9801m.m32348h(cCharAt, 31) <= 0 || C9801m.m32348h(cCharAt, 127) >= 0 || C10547v.m37556V(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4;
        while (i2 < i3) {
            if (i5 == bArr.length) {
                return false;
            }
            if (i5 != i4) {
                if (str.charAt(i2) != '.') {
                    return false;
                }
                i2++;
            }
            int i6 = i2;
            int i7 = 0;
            while (i6 < i3) {
                char cCharAt = str.charAt(i6);
                if (C9801m.m32348h(cCharAt, 48) < 0 || C9801m.m32348h(cCharAt, 57) > 0) {
                    break;
                }
                if ((i7 == 0 && i2 != i6) || (i7 = ((i7 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i6++;
            }
            if (i6 - i2 == 0) {
                return false;
            }
            bArr[i5] = (byte) i7;
            i5++;
            i2 = i6;
        }
        return i5 == i4 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r13 == 16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
    
        if (r14 != (-1)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < bArr.length) {
            int i6 = i4;
            while (i6 < 16 && bArr[i6] == 0 && bArr[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i3 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        C9703f c9703f = new C9703f();
        while (i2 < bArr.length) {
            if (i2 == i3) {
                c9703f.writeByte(58);
                i2 += i5;
                if (i2 == 16) {
                    c9703f.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c9703f.writeByte(58);
                }
                c9703f.mo32001C0((Util.and(bArr[i2], 255) << 8) | Util.and(bArr[i2 + 1], 255));
                i2 += 2;
            }
        }
        return c9703f.m32021T();
    }

    public static final String toCanonicalHost(String str) {
        C9801m.m32346f(str, "$this$toCanonicalHost");
        if (!C10547v.m37538J(str, ":", false, 2, null)) {
            try {
                String ascii = IDN.toASCII(str);
                C9801m.m32345e(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                C9801m.m32345e(locale, "Locale.US");
                if (ascii == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = ascii.toLowerCase(locale);
                C9801m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!(lowerCase.length() == 0) && !containsInvalidHostnameAsciiCodes(lowerCase)) {
                    return lowerCase;
                }
                return null;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressDecodeIpv6 = (C10546u.m37511E(str, "[", false, 2, null) && C10546u.m37514p(str, "]", false, 2, null)) ? decodeIpv6(str, 1, str.length() - 1) : decodeIpv6(str, 0, str.length());
        if (inetAddressDecodeIpv6 == null) {
            return null;
        }
        byte[] address = inetAddressDecodeIpv6.getAddress();
        if (address.length == 16) {
            C9801m.m32345e(address, "address");
            return inet6AddressToAscii(address);
        }
        if (address.length == 4) {
            return inetAddressDecodeIpv6.getHostAddress();
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
