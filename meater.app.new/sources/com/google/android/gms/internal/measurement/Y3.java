package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class Y3 implements Serializable, Iterable<Byte> {

    /* renamed from: C, reason: collision with root package name */
    public static final Y3 f33948C = new C2484g4(I4.f33784b);

    /* renamed from: D, reason: collision with root package name */
    private static final InterfaceC2450c4 f33949D = new C2508j4();

    /* renamed from: B, reason: collision with root package name */
    private int f33950B = 0;

    static {
        new C2441b4();
    }

    Y3() {
    }

    static C2468e4 B(int i10) {
        return new C2468e4(i10);
    }

    static /* synthetic */ int h(byte b10) {
        return b10 & 255;
    }

    static int i(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static Y3 r(String str) {
        return new C2484g4(str.getBytes(I4.f33783a));
    }

    public static Y3 v(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static Y3 w(byte[] bArr, int i10, int i11) {
        i(i10, i10 + i11, bArr.length);
        return new C2484g4(f33949D.a(bArr, i10, i11));
    }

    protected abstract int A(int i10, int i11, int i12);

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    protected final int f() {
        return this.f33950B;
    }

    public final int hashCode() {
        int iA = this.f33950B;
        if (iA == 0) {
            int iZ = z();
            iA = A(iZ, 0, iZ);
            if (iA == 0) {
                iA = 1;
            }
            this.f33950B = iA;
        }
        return iA;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new X3(this);
    }

    public abstract Y3 j(int i10, int i11);

    public final String toString() {
        String strA;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer numValueOf = Integer.valueOf(z());
        if (z() <= 50) {
            strA = N5.a(this);
        } else {
            strA = N5.a(j(0, 47)) + "...";
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, numValueOf, strA);
    }

    abstract void x(V3 v32);

    abstract byte y(int i10);

    public abstract int z();
}
