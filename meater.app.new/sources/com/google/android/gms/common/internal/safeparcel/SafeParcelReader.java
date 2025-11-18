package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    /* renamed from: A */
    public static float m14423A(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readFloat();
    }

    /* renamed from: B */
    public static Float m14424B(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, iM14432J, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: C */
    public static int m14425C(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: D */
    public static IBinder m14426D(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return strongBinder;
    }

    /* renamed from: E */
    public static int m14427E(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readInt();
    }

    /* renamed from: F */
    public static Integer m14428F(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, iM14432J, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: G */
    public static long m14429G(Parcel parcel, int i2) {
        m14436N(parcel, i2, 8);
        return parcel.readLong();
    }

    /* renamed from: H */
    public static Long m14430H(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, iM14432J, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: I */
    public static short m14431I(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: J */
    public static int m14432J(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    /* renamed from: K */
    public static void m14433K(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + m14432J(parcel, i2));
    }

    /* renamed from: L */
    public static int m14434L(Parcel parcel) {
        int iM14425C = m14425C(parcel);
        int iM14432J = m14432J(parcel, iM14425C);
        int iDataPosition = parcel.dataPosition();
        if (m14458v(iM14425C) != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iM14425C))), parcel);
        }
        int i2 = iM14432J + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new ParseException("Size read is invalid start=" + iDataPosition + " end=" + i2, parcel);
    }

    /* renamed from: M */
    private static void m14435M(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        throw new ParseException("Expected size " + i4 + " got " + i3 + " (0x" + Integer.toHexString(i3) + ")", parcel);
    }

    /* renamed from: N */
    private static void m14436N(Parcel parcel, int i2, int i3) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == i3) {
            return;
        }
        throw new ParseException("Expected size " + i3 + " got " + iM14432J + " (0x" + Integer.toHexString(iM14432J) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m14437a(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i3 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i3);
    }

    /* renamed from: b */
    public static BigDecimal[] m14438b(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[i4] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
        }
        parcel.setDataPosition(iDataPosition + iM14432J);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m14439c(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return new BigInteger(bArrCreateByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m14440d(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bigIntegerArr[i4] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(iDataPosition + iM14432J);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m14441e(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return zArrCreateBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m14442f(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return bundle;
    }

    /* renamed from: g */
    public static byte[] m14443g(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return bArrCreateByteArray;
    }

    /* renamed from: h */
    public static double[] m14444h(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return dArrCreateDoubleArray;
    }

    /* renamed from: i */
    public static float[] m14445i(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return fArrCreateFloatArray;
    }

    /* renamed from: j */
    public static int[] m14446j(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return iArrCreateIntArray;
    }

    /* renamed from: k */
    public static ArrayList<Integer> m14447k(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM14432J);
        return arrayList;
    }

    /* renamed from: l */
    public static long[] m14448l(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return jArrCreateLongArray;
    }

    /* renamed from: m */
    public static Parcel m14449m(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, iDataPosition, iM14432J);
        parcel.setDataPosition(iDataPosition + iM14432J);
        return parcelObtain;
    }

    /* renamed from: n */
    public static Parcel[] m14450n(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = parcel.readInt();
            if (i5 != 0) {
                int iDataPosition2 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, iDataPosition2, i5);
                parcelArr[i4] = parcelObtain;
                parcel.setDataPosition(iDataPosition2 + i5);
            } else {
                parcelArr[i4] = null;
            }
        }
        parcel.setDataPosition(iDataPosition + iM14432J);
        return parcelArr;
    }

    /* renamed from: o */
    public static <T extends Parcelable> T m14451o(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM14432J);
        return tCreateFromParcel;
    }

    /* renamed from: p */
    public static String m14452p(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return string;
    }

    /* renamed from: q */
    public static String[] m14453q(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return strArrCreateStringArray;
    }

    /* renamed from: r */
    public static ArrayList<String> m14454r(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM14432J);
        return arrayListCreateStringArrayList;
    }

    /* renamed from: s */
    public static <T> T[] m14455s(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM14432J);
        return tArr;
    }

    /* renamed from: t */
    public static <T> ArrayList<T> m14456t(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int iM14432J = m14432J(parcel, i2);
        int iDataPosition = parcel.dataPosition();
        if (iM14432J == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM14432J);
        return arrayListCreateTypedArrayList;
    }

    /* renamed from: u */
    public static void m14457u(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i2, parcel);
    }

    /* renamed from: v */
    public static int m14458v(int i2) {
        return (char) i2;
    }

    /* renamed from: w */
    public static boolean m14459w(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: x */
    public static Boolean m14460x(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, iM14432J, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: y */
    public static double m14461y(Parcel parcel, int i2) {
        m14436N(parcel, i2, 8);
        return parcel.readDouble();
    }

    /* renamed from: z */
    public static Double m14462z(Parcel parcel, int i2) {
        int iM14432J = m14432J(parcel, i2);
        if (iM14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, iM14432J, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
