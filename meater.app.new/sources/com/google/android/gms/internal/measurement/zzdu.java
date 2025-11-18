package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzdu implements Serializable, Iterable<Byte> {

    /* renamed from: f */
    public static final zzdu f28037f = new C7595u1(zzff.f28139c);

    /* renamed from: g */
    private static final InterfaceC7577r1 f28038g;

    /* renamed from: h */
    private static final Comparator<zzdu> f28039h;

    /* renamed from: i */
    private int f28040i = 0;

    static {
        C7559o1 c7559o1 = null;
        f28038g = C7535k1.m21167b() ? new C7607w1(c7559o1) : new C7565p1(c7559o1);
        f28039h = new C7553n1();
    }

    zzdu() {
    }

    /* renamed from: n */
    public static zzdu m22150n(String str) {
        return new C7595u1(str.getBytes(zzff.f28137a));
    }

    /* renamed from: o */
    static zzdu m22151o(byte[] bArr) {
        return new C7595u1(bArr);
    }

    /* renamed from: q */
    public static zzdu m22152q(byte[] bArr, int i2, int i3) {
        m22154v(i2, i2 + i3, bArr.length);
        return new C7595u1(f28038g.mo21275a(bArr, i2, i3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static int m22153u(byte b2) {
        return b2 & 255;
    }

    /* renamed from: v */
    static int m22154v(int i2, int i3, int i4) {
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

    /* renamed from: x */
    static C7589t1 m22155x(int i2) {
        return new C7589t1(i2, null);
    }

    /* renamed from: c */
    public abstract byte mo21395c(int i2);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract int mo21396f();

    /* renamed from: h */
    protected abstract int mo21411h(int i2, int i3, int i4);

    public final int hashCode() {
        int iMo21411h = this.f28040i;
        if (iMo21411h == 0) {
            int iMo21396f = mo21396f();
            iMo21411h = mo21411h(iMo21396f, 0, iMo21396f);
            if (iMo21411h == 0) {
                iMo21411h = 1;
            }
            this.f28040i = iMo21411h;
        }
        return iMo21411h;
    }

    /* renamed from: i */
    public abstract zzdu mo21412i(int i2, int i3);

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C7559o1(this);
    }

    /* renamed from: r */
    protected abstract String mo21413r(Charset charset);

    /* renamed from: s */
    abstract void mo21414s(zzdv zzdvVar) throws IOException;

    /* renamed from: t */
    abstract byte mo21397t(int i2);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo21396f()));
    }

    /* renamed from: w */
    public final String m22156w() {
        return mo21396f() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : mo21413r(zzff.f28137a);
    }

    /* renamed from: y */
    public abstract boolean mo21415y();

    /* renamed from: z */
    protected final int m22157z() {
        return this.f28040i;
    }
}
