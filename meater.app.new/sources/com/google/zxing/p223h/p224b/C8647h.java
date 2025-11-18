package com.google.zxing.p223h.p224b;

import com.google.zxing.C8621b;
import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext.java */
/* renamed from: com.google.zxing.h.b.h */
/* loaded from: classes2.dex */
final class C8647h {

    /* renamed from: a */
    private final String f32835a;

    /* renamed from: b */
    private EnumC8651l f32836b;

    /* renamed from: c */
    private C8621b f32837c;

    /* renamed from: d */
    private C8621b f32838d;

    /* renamed from: e */
    private final StringBuilder f32839e;

    /* renamed from: f */
    int f32840f;

    /* renamed from: g */
    private int f32841g;

    /* renamed from: h */
    private C8650k f32842h;

    /* renamed from: i */
    private int f32843i;

    C8647h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = (char) (bytes[i2] & 255);
            if (c2 == '?' && str.charAt(i2) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.f32835a = sb.toString();
        this.f32836b = EnumC8651l.FORCE_NONE;
        this.f32839e = new StringBuilder(str.length());
        this.f32841g = -1;
    }

    /* renamed from: h */
    private int m27332h() {
        return this.f32835a.length() - this.f32843i;
    }

    /* renamed from: a */
    public int m27333a() {
        return this.f32839e.length();
    }

    /* renamed from: b */
    public StringBuilder m27334b() {
        return this.f32839e;
    }

    /* renamed from: c */
    public char m27335c() {
        return this.f32835a.charAt(this.f32840f);
    }

    /* renamed from: d */
    public String m27336d() {
        return this.f32835a;
    }

    /* renamed from: e */
    public int m27337e() {
        return this.f32841g;
    }

    /* renamed from: f */
    public int m27338f() {
        return m27332h() - this.f32840f;
    }

    /* renamed from: g */
    public C8650k m27339g() {
        return this.f32842h;
    }

    /* renamed from: i */
    public boolean m27340i() {
        return this.f32840f < m27332h();
    }

    /* renamed from: j */
    public void m27341j() {
        this.f32841g = -1;
    }

    /* renamed from: k */
    public void m27342k() {
        this.f32842h = null;
    }

    /* renamed from: l */
    public void m27343l(C8621b c8621b, C8621b c8621b2) {
        this.f32837c = c8621b;
        this.f32838d = c8621b2;
    }

    /* renamed from: m */
    public void m27344m(int i2) {
        this.f32843i = i2;
    }

    /* renamed from: n */
    public void m27345n(EnumC8651l enumC8651l) {
        this.f32836b = enumC8651l;
    }

    /* renamed from: o */
    public void m27346o(int i2) {
        this.f32841g = i2;
    }

    /* renamed from: p */
    public void m27347p() {
        m27348q(m27333a());
    }

    /* renamed from: q */
    public void m27348q(int i2) {
        C8650k c8650k = this.f32842h;
        if (c8650k == null || i2 > c8650k.m27372a()) {
            this.f32842h = C8650k.m27371l(i2, this.f32836b, this.f32837c, this.f32838d, true);
        }
    }

    /* renamed from: r */
    public void m27349r(char c2) {
        this.f32839e.append(c2);
    }

    /* renamed from: s */
    public void m27350s(String str) {
        this.f32839e.append(str);
    }
}
