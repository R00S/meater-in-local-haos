package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC0412s1;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.m1 */
/* loaded from: classes.dex */
public final class C0394m1 {

    /* renamed from: a */
    private static final C0394m1 f2825a = new C0394m1(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f2826b;

    /* renamed from: c */
    private int[] f2827c;

    /* renamed from: d */
    private Object[] f2828d;

    /* renamed from: e */
    private int f2829e;

    /* renamed from: f */
    private boolean f2830f;

    private C0394m1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    private void m3032b() {
        int i2 = this.f2826b;
        int[] iArr = this.f2827c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f2827c = Arrays.copyOf(iArr, i3);
            this.f2828d = Arrays.copyOf(this.f2828d, i3);
        }
    }

    /* renamed from: c */
    private static boolean m3033c(int[] iArr, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m3034d(Object[] objArr, Object[] objArr2, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (!objArr[i3].equals(objArr2[i3])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C0394m1 m3035e() {
        return f2825a;
    }

    /* renamed from: h */
    private static int m3036h(int[] iArr, int i2) {
        int i3 = 17;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        return i3;
    }

    /* renamed from: i */
    private static int m3037i(Object[] objArr, int i2) {
        int iHashCode = 17;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + objArr[i3].hashCode();
        }
        return iHashCode;
    }

    /* renamed from: k */
    static C0394m1 m3038k(C0394m1 c0394m1, C0394m1 c0394m12) {
        int i2 = c0394m1.f2826b + c0394m12.f2826b;
        int[] iArrCopyOf = Arrays.copyOf(c0394m1.f2827c, i2);
        System.arraycopy(c0394m12.f2827c, 0, iArrCopyOf, c0394m1.f2826b, c0394m12.f2826b);
        Object[] objArrCopyOf = Arrays.copyOf(c0394m1.f2828d, i2);
        System.arraycopy(c0394m12.f2828d, 0, objArrCopyOf, c0394m1.f2826b, c0394m12.f2826b);
        return new C0394m1(i2, iArrCopyOf, objArrCopyOf, true);
    }

    /* renamed from: l */
    static C0394m1 m3039l() {
        return new C0394m1();
    }

    /* renamed from: p */
    private static void m3040p(int i2, Object obj, InterfaceC0412s1 interfaceC0412s1) throws IOException {
        int iM3202a = C0409r1.m3202a(i2);
        int iM3203b = C0409r1.m3203b(i2);
        if (iM3203b == 0) {
            interfaceC0412s1.mo2979p(iM3202a, ((Long) obj).longValue());
            return;
        }
        if (iM3203b == 1) {
            interfaceC0412s1.mo2971h(iM3202a, ((Long) obj).longValue());
            return;
        }
        if (iM3203b == 2) {
            interfaceC0412s1.mo2986w(iM3202a, (AbstractC0377h) obj);
            return;
        }
        if (iM3203b != 3) {
            if (iM3203b != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.m2533d());
            }
            interfaceC0412s1.mo2967d(iM3202a, ((Integer) obj).intValue());
        } else if (interfaceC0412s1.mo2972i() == InterfaceC0412s1.a.ASCENDING) {
            interfaceC0412s1.mo2982s(iM3202a);
            ((C0394m1) obj).m3048q(interfaceC0412s1);
            interfaceC0412s1.mo2954F(iM3202a);
        } else {
            interfaceC0412s1.mo2954F(iM3202a);
            ((C0394m1) obj).m3048q(interfaceC0412s1);
            interfaceC0412s1.mo2982s(iM3202a);
        }
    }

    /* renamed from: a */
    void m3041a() {
        if (!this.f2830f) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0394m1)) {
            return false;
        }
        C0394m1 c0394m1 = (C0394m1) obj;
        int i2 = this.f2826b;
        return i2 == c0394m1.f2826b && m3033c(this.f2827c, c0394m1.f2827c, i2) && m3034d(this.f2828d, c0394m1.f2828d, this.f2826b);
    }

    /* renamed from: f */
    public int m3042f() {
        int iM2435Y;
        int i2 = this.f2829e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f2826b; i4++) {
            int i5 = this.f2827c[i4];
            int iM3202a = C0409r1.m3202a(i5);
            int iM3203b = C0409r1.m3203b(i5);
            if (iM3203b == 0) {
                iM2435Y = CodedOutputStream.m2435Y(iM3202a, ((Long) this.f2828d[i4]).longValue());
            } else if (iM3203b == 1) {
                iM2435Y = CodedOutputStream.m2454o(iM3202a, ((Long) this.f2828d[i4]).longValue());
            } else if (iM3203b == 2) {
                iM2435Y = CodedOutputStream.m2444g(iM3202a, (AbstractC0377h) this.f2828d[i4]);
            } else if (iM3203b == 3) {
                iM2435Y = (CodedOutputStream.m2432V(iM3202a) * 2) + ((C0394m1) this.f2828d[i4]).m3042f();
            } else {
                if (iM3203b != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.m2533d());
                }
                iM2435Y = CodedOutputStream.m2452m(iM3202a, ((Integer) this.f2828d[i4]).intValue());
            }
            i3 += iM2435Y;
        }
        this.f2829e = i3;
        return i3;
    }

    /* renamed from: g */
    public int m3043g() {
        int i2 = this.f2829e;
        if (i2 != -1) {
            return i2;
        }
        int iM2420J = 0;
        for (int i3 = 0; i3 < this.f2826b; i3++) {
            iM2420J += CodedOutputStream.m2420J(C0409r1.m3202a(this.f2827c[i3]), (AbstractC0377h) this.f2828d[i3]);
        }
        this.f2829e = iM2420J;
        return iM2420J;
    }

    public int hashCode() {
        int i2 = this.f2826b;
        return ((((527 + i2) * 31) + m3036h(this.f2827c, i2)) * 31) + m3037i(this.f2828d, this.f2826b);
    }

    /* renamed from: j */
    public void m3044j() {
        this.f2830f = false;
    }

    /* renamed from: m */
    final void m3045m(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f2826b; i3++) {
            C0411s0.m3212c(sb, i2, String.valueOf(C0409r1.m3202a(this.f2827c[i3])), this.f2828d[i3]);
        }
    }

    /* renamed from: n */
    void m3046n(int i2, Object obj) {
        m3041a();
        m3032b();
        int[] iArr = this.f2827c;
        int i3 = this.f2826b;
        iArr[i3] = i2;
        this.f2828d[i3] = obj;
        this.f2826b = i3 + 1;
    }

    /* renamed from: o */
    void m3047o(InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (interfaceC0412s1.mo2972i() == InterfaceC0412s1.a.DESCENDING) {
            for (int i2 = this.f2826b - 1; i2 >= 0; i2--) {
                interfaceC0412s1.mo2966c(C0409r1.m3202a(this.f2827c[i2]), this.f2828d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f2826b; i3++) {
            interfaceC0412s1.mo2966c(C0409r1.m3202a(this.f2827c[i3]), this.f2828d[i3]);
        }
    }

    /* renamed from: q */
    public void m3048q(InterfaceC0412s1 interfaceC0412s1) throws IOException {
        if (this.f2826b == 0) {
            return;
        }
        if (interfaceC0412s1.mo2972i() == InterfaceC0412s1.a.ASCENDING) {
            for (int i2 = 0; i2 < this.f2826b; i2++) {
                m3040p(this.f2827c[i2], this.f2828d[i2], interfaceC0412s1);
            }
            return;
        }
        for (int i3 = this.f2826b - 1; i3 >= 0; i3--) {
            m3040p(this.f2827c[i3], this.f2828d[i3], interfaceC0412s1);
        }
    }

    private C0394m1(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f2829e = -1;
        this.f2826b = i2;
        this.f2827c = iArr;
        this.f2828d = objArr;
        this.f2830f = z;
    }
}
