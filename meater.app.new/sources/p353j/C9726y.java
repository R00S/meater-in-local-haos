package p353j;

import java.util.Arrays;
import kotlin.collections.C10801m;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: Segment.kt */
/* renamed from: j.y */
/* loaded from: classes3.dex */
public final class C9726y {

    /* renamed from: a */
    public static final a f37090a = new a(null);

    /* renamed from: b */
    public final byte[] f37091b;

    /* renamed from: c */
    public int f37092c;

    /* renamed from: d */
    public int f37093d;

    /* renamed from: e */
    public boolean f37094e;

    /* renamed from: f */
    public boolean f37095f;

    /* renamed from: g */
    public C9726y f37096g;

    /* renamed from: h */
    public C9726y f37097h;

    /* compiled from: Segment.kt */
    /* renamed from: j.y$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C9726y() {
        this.f37091b = new byte[8192];
        this.f37095f = true;
        this.f37094e = false;
    }

    /* renamed from: a */
    public final void m32161a() {
        C9726y c9726y = this.f37097h;
        int i2 = 0;
        if (!(c9726y != this)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        C9801m.m32343c(c9726y);
        if (c9726y.f37095f) {
            int i3 = this.f37093d - this.f37092c;
            C9726y c9726y2 = this.f37097h;
            C9801m.m32343c(c9726y2);
            int i4 = 8192 - c9726y2.f37093d;
            C9726y c9726y3 = this.f37097h;
            C9801m.m32343c(c9726y3);
            if (!c9726y3.f37094e) {
                C9726y c9726y4 = this.f37097h;
                C9801m.m32343c(c9726y4);
                i2 = c9726y4.f37092c;
            }
            if (i3 > i4 + i2) {
                return;
            }
            C9726y c9726y5 = this.f37097h;
            C9801m.m32343c(c9726y5);
            m32167g(c9726y5, i3);
            m32162b();
            C9727z.m32169b(this);
        }
    }

    /* renamed from: b */
    public final C9726y m32162b() {
        C9726y c9726y = this.f37096g;
        if (c9726y == this) {
            c9726y = null;
        }
        C9726y c9726y2 = this.f37097h;
        C9801m.m32343c(c9726y2);
        c9726y2.f37096g = this.f37096g;
        C9726y c9726y3 = this.f37096g;
        C9801m.m32343c(c9726y3);
        c9726y3.f37097h = this.f37097h;
        this.f37096g = null;
        this.f37097h = null;
        return c9726y;
    }

    /* renamed from: c */
    public final C9726y m32163c(C9726y c9726y) {
        C9801m.m32346f(c9726y, "segment");
        c9726y.f37097h = this;
        c9726y.f37096g = this.f37096g;
        C9726y c9726y2 = this.f37096g;
        C9801m.m32343c(c9726y2);
        c9726y2.f37097h = c9726y;
        this.f37096g = c9726y;
        return c9726y;
    }

    /* renamed from: d */
    public final C9726y m32164d() {
        this.f37094e = true;
        return new C9726y(this.f37091b, this.f37092c, this.f37093d, true, false);
    }

    /* renamed from: e */
    public final C9726y m32165e(int i2) {
        C9726y c9726yM32170c;
        if (!(i2 > 0 && i2 <= this.f37093d - this.f37092c)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i2 >= 1024) {
            c9726yM32170c = m32164d();
        } else {
            c9726yM32170c = C9727z.m32170c();
            byte[] bArr = this.f37091b;
            byte[] bArr2 = c9726yM32170c.f37091b;
            int i3 = this.f37092c;
            C10801m.m38705f(bArr, bArr2, 0, i3, i3 + i2, 2, null);
        }
        c9726yM32170c.f37093d = c9726yM32170c.f37092c + i2;
        this.f37092c += i2;
        C9726y c9726y = this.f37097h;
        C9801m.m32343c(c9726y);
        c9726y.m32163c(c9726yM32170c);
        return c9726yM32170c;
    }

    /* renamed from: f */
    public final C9726y m32166f() {
        byte[] bArr = this.f37091b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        C9801m.m32345e(bArrCopyOf, "java.util.Arrays.copyOf(this, size)");
        return new C9726y(bArrCopyOf, this.f37092c, this.f37093d, false, true);
    }

    /* renamed from: g */
    public final void m32167g(C9726y c9726y, int i2) {
        C9801m.m32346f(c9726y, "sink");
        if (!c9726y.f37095f) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i3 = c9726y.f37093d;
        if (i3 + i2 > 8192) {
            if (c9726y.f37094e) {
                throw new IllegalArgumentException();
            }
            int i4 = c9726y.f37092c;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = c9726y.f37091b;
            C10801m.m38705f(bArr, bArr, 0, i4, i3, 2, null);
            c9726y.f37093d -= c9726y.f37092c;
            c9726y.f37092c = 0;
        }
        byte[] bArr2 = this.f37091b;
        byte[] bArr3 = c9726y.f37091b;
        int i5 = c9726y.f37093d;
        int i6 = this.f37092c;
        C10801m.m38703d(bArr2, bArr3, i5, i6, i6 + i2);
        c9726y.f37093d += i2;
        this.f37092c += i2;
    }

    public C9726y(byte[] bArr, int i2, int i3, boolean z, boolean z2) {
        C9801m.m32346f(bArr, "data");
        this.f37091b = bArr;
        this.f37092c = i2;
        this.f37093d = i3;
        this.f37094e = z;
        this.f37095f = z2;
    }
}
