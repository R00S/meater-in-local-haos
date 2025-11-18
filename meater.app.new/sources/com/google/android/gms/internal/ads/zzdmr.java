package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public abstract class zzdmr implements Serializable, Iterable<Byte> {

    /* renamed from: f */
    public static final zzdmr f25661f = new C6945mu(zzdod.f25774c);

    /* renamed from: g */
    private static final InterfaceC6797iu f25662g;

    /* renamed from: h */
    private static final Comparator<zzdmr> f25663h;

    /* renamed from: i */
    private int f25664i = 0;

    static {
        C6612du c6612du = null;
        f25662g = C7425zt.m16158a() ? new C6982nu(c6612du) : new C6723gu(c6612du);
        f25663h = new C6649eu();
    }

    zzdmr() {
    }

    /* renamed from: A */
    public static zzdmr m19595A(byte[] bArr, int i2, int i3) {
        m19601y(i2, i2 + i3, bArr.length);
        return new C6945mu(f25662g.mo15168a(bArr, i2, i3));
    }

    /* renamed from: D */
    public static zzdmr m19596D(byte[] bArr) {
        return m19595A(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    static zzdmr m19597i(byte[] bArr) {
        return new C6945mu(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static int m19598s(byte b2) {
        return b2 & 255;
    }

    /* renamed from: x */
    static C6834ju m19600x(int i2) {
        return new C6834ju(i2, null);
    }

    /* renamed from: y */
    static int m19601y(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < i2) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i3);
        sb3.append(" >= ");
        sb3.append(i4);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* renamed from: z */
    public static zzdmr m19602z(String str) {
        return new C6945mu(str.getBytes(zzdod.f25772a));
    }

    /* renamed from: C */
    public abstract zzdmr mo15566C(int i2, int i3);

    /* renamed from: c */
    public final byte[] m19603c() {
        int size = size();
        if (size == 0) {
            return zzdod.f25774c;
        }
        byte[] bArr = new byte[size];
        mo15315h(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    protected abstract String mo15567f(Charset charset);

    /* renamed from: g */
    abstract void mo15568g(zzdmq zzdmqVar) throws IOException;

    /* renamed from: h */
    protected abstract void mo15315h(byte[] bArr, int i2, int i3, int i4);

    public final int hashCode() {
        int iMo15571u = this.f25664i;
        if (iMo15571u == 0) {
            int size = size();
            iMo15571u = mo15571u(size, 0, size);
            if (iMo15571u == 0) {
                iMo15571u = 1;
            }
            this.f25664i = iMo15571u;
        }
        return iMo15571u;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C6612du(this);
    }

    /* renamed from: n */
    public final String m19604n() {
        return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo15567f(zzdod.f25772a);
    }

    /* renamed from: o */
    public abstract boolean mo15569o();

    /* renamed from: q */
    public abstract zzdnd mo15570q();

    /* renamed from: r */
    protected final int m19605r() {
        return this.f25664i;
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    /* renamed from: u */
    protected abstract int mo15571u(int i2, int i3, int i4);

    /* renamed from: v */
    public abstract byte mo15316v(int i2);

    /* renamed from: w */
    abstract byte mo15317w(int i2);
}
