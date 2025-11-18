package com.google.zxing.p223h.p224b;

import com.google.zxing.C8621b;

/* compiled from: SymbolInfo.java */
/* renamed from: com.google.zxing.h.b.k */
/* loaded from: classes2.dex */
public class C8650k {

    /* renamed from: a */
    static final C8650k[] f32848a;

    /* renamed from: b */
    private static C8650k[] f32849b;

    /* renamed from: c */
    private final boolean f32850c;

    /* renamed from: d */
    private final int f32851d;

    /* renamed from: e */
    private final int f32852e;

    /* renamed from: f */
    public final int f32853f;

    /* renamed from: g */
    public final int f32854g;

    /* renamed from: h */
    private final int f32855h;

    /* renamed from: i */
    private final int f32856i;

    /* renamed from: j */
    private final int f32857j;

    static {
        C8650k[] c8650kArr = {new C8650k(false, 3, 5, 8, 8, 1), new C8650k(false, 5, 7, 10, 10, 1), new C8650k(true, 5, 7, 16, 6, 1), new C8650k(false, 8, 10, 12, 12, 1), new C8650k(true, 10, 11, 14, 6, 2), new C8650k(false, 12, 12, 14, 14, 1), new C8650k(true, 16, 14, 24, 10, 1), new C8650k(false, 18, 14, 16, 16, 1), new C8650k(false, 22, 18, 18, 18, 1), new C8650k(true, 22, 18, 16, 10, 2), new C8650k(false, 30, 20, 20, 20, 1), new C8650k(true, 32, 24, 16, 14, 2), new C8650k(false, 36, 24, 22, 22, 1), new C8650k(false, 44, 28, 24, 24, 1), new C8650k(true, 49, 28, 22, 14, 2), new C8650k(false, 62, 36, 14, 14, 4), new C8650k(false, 86, 42, 16, 16, 4), new C8650k(false, 114, 48, 18, 18, 4), new C8650k(false, 144, 56, 20, 20, 4), new C8650k(false, 174, 68, 22, 22, 4), new C8650k(false, 204, 84, 24, 24, 4, 102, 42), new C8650k(false, 280, 112, 14, 14, 16, 140, 56), new C8650k(false, 368, 144, 16, 16, 16, 92, 36), new C8650k(false, 456, 192, 18, 18, 16, 114, 48), new C8650k(false, 576, 224, 20, 20, 16, 144, 56), new C8650k(false, 696, 272, 22, 22, 16, 174, 68), new C8650k(false, 816, 336, 24, 24, 16, 136, 56), new C8650k(false, 1050, 408, 18, 18, 36, 175, 68), new C8650k(false, 1304, 496, 20, 20, 36, 163, 62), new C8643d()};
        f32848a = c8650kArr;
        f32849b = c8650kArr;
    }

    public C8650k(boolean z, int i2, int i3, int i4, int i5, int i6) {
        this(z, i2, i3, i4, i5, i6, i2, i3);
    }

    /* renamed from: e */
    private int m27369e() {
        int i2 = this.f32855h;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    /* renamed from: k */
    private int m27370k() {
        int i2 = this.f32855h;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    /* renamed from: l */
    public static C8650k m27371l(int i2, EnumC8651l enumC8651l, C8621b c8621b, C8621b c8621b2, boolean z) {
        for (C8650k c8650k : f32849b) {
            if (!(enumC8651l == EnumC8651l.FORCE_SQUARE && c8650k.f32850c) && ((enumC8651l != EnumC8651l.FORCE_RECTANGLE || c8650k.f32850c) && ((c8621b == null || (c8650k.m27378j() >= c8621b.m27224b() && c8650k.m27377i() >= c8621b.m27223a())) && ((c8621b2 == null || (c8650k.m27378j() <= c8621b2.m27224b() && c8650k.m27377i() <= c8621b2.m27223a())) && i2 <= c8650k.f32851d)))) {
                return c8650k;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        }
        return null;
    }

    /* renamed from: a */
    public final int m27372a() {
        return this.f32851d;
    }

    /* renamed from: b */
    public int mo27316b(int i2) {
        return this.f32856i;
    }

    /* renamed from: c */
    public final int m27373c() {
        return this.f32852e;
    }

    /* renamed from: d */
    public final int m27374d(int i2) {
        return this.f32857j;
    }

    /* renamed from: f */
    public int mo27317f() {
        return this.f32851d / this.f32856i;
    }

    /* renamed from: g */
    public final int m27375g() {
        return m27370k() * this.f32854g;
    }

    /* renamed from: h */
    public final int m27376h() {
        return m27369e() * this.f32853f;
    }

    /* renamed from: i */
    public final int m27377i() {
        return m27375g() + (m27370k() << 1);
    }

    /* renamed from: j */
    public final int m27378j() {
        return m27376h() + (m27369e() << 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f32850c ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f32853f);
        sb.append('x');
        sb.append(this.f32854g);
        sb.append(", symbol size ");
        sb.append(m27378j());
        sb.append('x');
        sb.append(m27377i());
        sb.append(", symbol data size ");
        sb.append(m27376h());
        sb.append('x');
        sb.append(m27375g());
        sb.append(", codewords ");
        sb.append(this.f32851d);
        sb.append('+');
        sb.append(this.f32852e);
        return sb.toString();
    }

    C8650k(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f32850c = z;
        this.f32851d = i2;
        this.f32852e = i3;
        this.f32853f = i4;
        this.f32854g = i5;
        this.f32855h = i6;
        this.f32856i = i7;
        this.f32857j = i8;
    }
}
