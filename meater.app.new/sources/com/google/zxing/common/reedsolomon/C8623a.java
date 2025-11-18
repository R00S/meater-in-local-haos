package com.google.zxing.common.reedsolomon;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: GenericGF.java */
/* renamed from: com.google.zxing.common.reedsolomon.a */
/* loaded from: classes2.dex */
public final class C8623a {

    /* renamed from: a */
    public static final C8623a f32750a = new C8623a(4201, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: b */
    public static final C8623a f32751b = new C8623a(1033, 1024, 1);

    /* renamed from: c */
    public static final C8623a f32752c;

    /* renamed from: d */
    public static final C8623a f32753d;

    /* renamed from: e */
    public static final C8623a f32754e;

    /* renamed from: f */
    public static final C8623a f32755f;

    /* renamed from: g */
    public static final C8623a f32756g;

    /* renamed from: h */
    public static final C8623a f32757h;

    /* renamed from: i */
    private final int[] f32758i;

    /* renamed from: j */
    private final int[] f32759j;

    /* renamed from: k */
    private final C8624b f32760k;

    /* renamed from: l */
    private final C8624b f32761l;

    /* renamed from: m */
    private final int f32762m;

    /* renamed from: n */
    private final int f32763n;

    /* renamed from: o */
    private final int f32764o;

    static {
        C8623a c8623a = new C8623a(67, 64, 1);
        f32752c = c8623a;
        f32753d = new C8623a(19, 16, 1);
        f32754e = new C8623a(285, 256, 0);
        C8623a c8623a2 = new C8623a(301, 256, 1);
        f32755f = c8623a2;
        f32756g = c8623a2;
        f32757h = c8623a;
    }

    public C8623a(int i2, int i3, int i4) {
        this.f32763n = i2;
        this.f32762m = i3;
        this.f32764o = i4;
        this.f32758i = new int[i3];
        this.f32759j = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f32758i[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f32759j[this.f32758i[i7]] = i7;
        }
        this.f32760k = new C8624b(this, new int[]{0});
        this.f32761l = new C8624b(this, new int[]{1});
    }

    /* renamed from: a */
    static int m27225a(int i2, int i3) {
        return i2 ^ i3;
    }

    /* renamed from: b */
    C8624b m27226b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i3 == 0) {
            return this.f32760k;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new C8624b(this, iArr);
    }

    /* renamed from: c */
    int m27227c(int i2) {
        return this.f32758i[i2];
    }

    /* renamed from: d */
    public int m27228d() {
        return this.f32764o;
    }

    /* renamed from: e */
    C8624b m27229e() {
        return this.f32760k;
    }

    /* renamed from: f */
    int m27230f(int i2) {
        if (i2 != 0) {
            return this.f32758i[(this.f32762m - this.f32759j[i2]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    int m27231g(int i2) {
        if (i2 != 0) {
            return this.f32759j[i2];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    int m27232h(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f32758i;
        int[] iArr2 = this.f32759j;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.f32762m - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f32763n) + ',' + this.f32762m + ')';
    }
}
