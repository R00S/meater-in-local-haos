package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class P implements Iterable, Serializable {

    /* renamed from: C, reason: collision with root package name */
    public static final P f34503C = new N(C2689r0.f34653b);

    /* renamed from: B, reason: collision with root package name */
    private int f34504B = 0;

    static {
        int i10 = F.f34483a;
    }

    P() {
    }

    static int v(int i10, int i11, int i12) {
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

    public static P x(byte[] bArr, int i10, int i11) {
        v(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new N(bArr2);
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    abstract byte f(int i10);

    public abstract int h();

    public final int hashCode() {
        int i10 = this.f34504B;
        if (i10 == 0) {
            int iH = h();
            i10 = i(iH, 0, iH);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f34504B = i10;
        }
        return i10;
    }

    protected abstract int i(int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new I(this);
    }

    public abstract P j(int i10, int i11);

    abstract void r(H h10);

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(h()), h() <= 50 ? C2667j1.a(this) : C2667j1.a(j(0, 47)).concat("..."));
    }

    protected final int w() {
        return this.f34504B;
    }
}
