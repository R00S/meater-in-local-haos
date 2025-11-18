package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class Base64Variant implements Serializable {
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final transient int _maxLineLength;
    final String _name;
    private final transient char _paddingChar;
    private final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z, char c2, int i2) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < length; i3++) {
            char c3 = this._base64ToAsciiC[i3];
            this._base64ToAsciiB[i3] = (byte) c3;
            this._asciiToBase64[c3] = i3;
        }
        if (z) {
            this._asciiToBase64[c2] = -2;
        }
    }

    protected void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException("Unexpected end-of-String in base64 content");
    }

    protected void _reportInvalidBase64(char c2, int i2, String str) throws IllegalArgumentException {
        String str2;
        if (c2 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c2) + ") as character #" + (i2 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c2)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c2) || Character.isISOControl(c2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c2 + "' (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Char(char c2) {
        if (c2 <= 127) {
            return this._asciiToBase64[c2];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] << 8) | (bArr[i4] & 255)) << 8;
            int i7 = i5 + 1;
            encodeBase64Chunk(sb, i6 | (bArr[i5] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i2 = i7;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            encodeBase64Partial(sb, i10, i8);
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public int encodeBase64Chunk(int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, char[] cArr, int i4) {
        int i5 = i4 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 12) & 63];
        if (this._usesPadding) {
            int i7 = i6 + 1;
            cArr[i6] = i3 == 2 ? cArr2[(i2 >> 6) & 63] : this._paddingChar;
            int i8 = i7 + 1;
            cArr[i7] = this._paddingChar;
            return i8;
        }
        if (i3 != 2) {
            return i6;
        }
        int i9 = i6 + 1;
        cArr[i6] = cArr2[(i2 >> 6) & 63];
        return i9;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    protected Object readResolve() {
        return Base64Variants.valueOf(this._name);
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c2) {
        return c2 == this._paddingChar;
    }

    public int decodeBase64Char(int i2) {
        if (i2 <= 127) {
            return this._asciiToBase64[i2];
        }
        return -1;
    }

    public boolean usesPaddingChar(int i2) {
        return i2 == this._paddingChar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r4 >= 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        _reportInvalidBase64(r2, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r3 < r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        _reportBase64EOF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        r2 = r3 + 1;
        r3 = r11.charAt(r3);
        r6 = decodeBase64Char(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r6 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        _reportInvalidBase64(r3, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        r3 = (r4 << 6) | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r2 < r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (usesPadding() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r12.append(r3 >> 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        _reportBase64EOF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r4 = r2 + 1;
        r2 = r11.charAt(r2);
        r6 = decodeBase64Char(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r6 >= 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r6 == (-2)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        _reportInvalidBase64(r2, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r4 < r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        _reportBase64EOF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        r2 = r4 + 1;
        r4 = r11.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (usesPaddingChar(r4) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        _reportInvalidBase64(r4, 3, "expected padding character '" + getPaddingChar() + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        r12.append(r3 >> 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        r2 = (r3 << 6) | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
    
        if (r4 < r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009c, code lost:
    
        if (usesPadding() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:
    
        r12.appendTwoBytes(r2 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        _reportBase64EOF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        r3 = r4 + 1;
        r4 = r11.charAt(r4);
        r6 = decodeBase64Char(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b1, code lost:
    
        if (r6 >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r6 == (-2)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        _reportInvalidBase64(r4, 3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        r12.appendTwoBytes(r2 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00be, code lost:
    
        r12.appendThreeBytes((r2 << 6) | r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r4 = decodeBase64Char(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void decode(java.lang.String r11, com.fasterxml.jackson.core.util.ByteArrayBuilder r12) throws java.lang.IllegalArgumentException {
        /*
            r10 = this;
            int r0 = r11.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto Lca
        L8:
            int r3 = r2 + 1
            char r2 = r11.charAt(r2)
            if (r3 < r0) goto L12
            goto Lca
        L12:
            r4 = 32
            if (r2 <= r4) goto Lc7
            int r4 = r10.decodeBase64Char(r2)
            r5 = 0
            if (r4 >= 0) goto L20
            r10._reportInvalidBase64(r2, r1, r5)
        L20:
            if (r3 < r0) goto L25
            r10._reportBase64EOF()
        L25:
            int r2 = r3 + 1
            char r3 = r11.charAt(r3)
            int r6 = r10.decodeBase64Char(r3)
            if (r6 >= 0) goto L35
            r7 = 1
            r10._reportInvalidBase64(r3, r7, r5)
        L35:
            int r3 = r4 << 6
            r3 = r3 | r6
            if (r2 < r0) goto L4a
            boolean r4 = r10.usesPadding()
            if (r4 != 0) goto L47
            int r11 = r3 >> 4
            r12.append(r11)
            goto Lca
        L47:
            r10._reportBase64EOF()
        L4a:
            int r4 = r2 + 1
            char r2 = r11.charAt(r2)
            int r6 = r10.decodeBase64Char(r2)
            r7 = 3
            r8 = -2
            r9 = 2
            if (r6 >= 0) goto L93
            if (r6 == r8) goto L5e
            r10._reportInvalidBase64(r2, r9, r5)
        L5e:
            if (r4 < r0) goto L63
            r10._reportBase64EOF()
        L63:
            int r2 = r4 + 1
            char r4 = r11.charAt(r4)
            boolean r5 = r10.usesPaddingChar(r4)
            if (r5 != 0) goto L8c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "expected padding character '"
            r5.append(r6)
            char r6 = r10.getPaddingChar()
            r5.append(r6)
            java.lang.String r6 = "'"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r10._reportInvalidBase64(r4, r7, r5)
        L8c:
            int r3 = r3 >> 4
            r12.append(r3)
            goto L6
        L93:
            int r2 = r3 << 6
            r2 = r2 | r6
            if (r4 < r0) goto La7
            boolean r3 = r10.usesPadding()
            if (r3 != 0) goto La4
            int r11 = r2 >> 2
            r12.appendTwoBytes(r11)
            goto Lca
        La4:
            r10._reportBase64EOF()
        La7:
            int r3 = r4 + 1
            char r4 = r11.charAt(r4)
            int r6 = r10.decodeBase64Char(r4)
            if (r6 >= 0) goto Lbe
            if (r6 == r8) goto Lb8
            r10._reportInvalidBase64(r4, r7, r5)
        Lb8:
            int r2 = r2 >> 2
            r12.appendTwoBytes(r2)
            goto Lc4
        Lbe:
            int r2 = r2 << 6
            r2 = r2 | r6
            r12.appendThreeBytes(r2)
        Lc4:
            r2 = r3
            goto L6
        Lc7:
            r2 = r3
            goto L8
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.Base64Variant.decode(java.lang.String, com.fasterxml.jackson.core.util.ByteArrayBuilder):void");
    }

    public void encodeBase64Chunk(StringBuilder sb, int i2) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i2 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i2, int i3) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        if (this._usesPadding) {
            sb.append(i3 == 2 ? this._base64ToAsciiC[(i2 >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i3 == 2) {
            sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 12) & 63];
        if (!this._usesPadding) {
            if (i3 != 2) {
                return i6;
            }
            int i7 = i6 + 1;
            bArr[i6] = bArr2[(i2 >> 6) & 63];
            return i7;
        }
        byte b2 = (byte) this._paddingChar;
        int i8 = i6 + 1;
        bArr[i6] = i3 == 2 ? bArr2[(i2 >> 6) & 63] : b2;
        int i9 = i8 + 1;
        bArr[i8] = b2;
        return i9;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i2) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i2);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, int i2) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._usesPadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
    }
}
