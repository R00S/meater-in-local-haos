package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

/* compiled from: BitEncoding.java */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.a */
/* loaded from: classes3.dex */
public class C10113a {

    /* renamed from: a */
    private static final boolean f38582a;

    static {
        String property;
        try {
            property = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            property = null;
        }
        f38582a = "true".equals(property);
    }

    /* renamed from: a */
    private static /* synthetic */ void m34238a(int i2) {
        String str = (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) ? 2 : 3];
        if (i2 == 1 || i2 == 3 || i2 == 6 || i2 == 8 || i2 == 10 || i2 == 12 || i2 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i2 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i2 == 3) {
            objArr[1] = "encode8to7";
        } else if (i2 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i2 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i2 == 10) {
            objArr[1] = "dropMarker";
        } else if (i2 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i2 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i2) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 != 1 && i2 != 3 && i2 != 6 && i2 != 8 && i2 != 10 && i2 != 12 && i2 != 14) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* renamed from: b */
    private static void m34239b(byte[] bArr, int i2) {
        if (bArr == null) {
            m34238a(4);
        }
        int length = bArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = (byte) ((bArr[i3] + i2) & 127);
        }
    }

    /* renamed from: c */
    private static byte[] m34240c(String[] strArr) {
        if (strArr == null) {
            m34238a(11);
        }
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i2 = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i3 = 0;
            while (i3 < length2) {
                bArr[i2] = (byte) str2.charAt(i3);
                i3++;
                i2++;
            }
        }
        return bArr;
    }

    /* renamed from: d */
    private static byte[] m34241d(byte[] bArr) {
        if (bArr == null) {
            m34238a(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = (bArr[i2] & 255) >>> i3;
            i2++;
            int i6 = i3 + 1;
            bArr2[i4] = (byte) (i5 + ((bArr[i2] & ((1 << i6) - 1)) << (7 - i3)));
            if (i3 == 6) {
                i2++;
                i3 = 0;
            } else {
                i3 = i6;
            }
        }
        return bArr2;
    }

    /* renamed from: e */
    public static byte[] m34242e(String[] strArr) {
        if (strArr == null) {
            m34238a(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char cCharAt = strArr[0].charAt(0);
            if (cCharAt == 0) {
                byte[] bArrM34269a = C10122j.m34269a(m34243f(strArr));
                if (bArrM34269a == null) {
                    m34238a(8);
                }
                return bArrM34269a;
            }
            if (cCharAt == 65535) {
                strArr = m34243f(strArr);
            }
        }
        byte[] bArrM34240c = m34240c(strArr);
        m34239b(bArrM34240c, 127);
        return m34241d(bArrM34240c);
    }

    /* renamed from: f */
    private static String[] m34243f(String[] strArr) {
        if (strArr == null) {
            m34238a(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
