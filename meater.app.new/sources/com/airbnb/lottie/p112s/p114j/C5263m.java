package com.airbnb.lottie.p112s.p114j;

import android.graphics.Path;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5198f;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: ShapeFill.java */
/* renamed from: com.airbnb.lottie.s.j.m */
/* loaded from: classes.dex */
public class C5263m implements InterfaceC5252b {

    /* renamed from: a */
    private final boolean f12762a;

    /* renamed from: b */
    private final Path.FillType f12763b;

    /* renamed from: c */
    private final String f12764c;

    /* renamed from: d */
    private final C5237a f12765d;

    /* renamed from: e */
    private final C5240d f12766e;

    public C5263m(String str, boolean z, Path.FillType fillType, C5237a c5237a, C5240d c5240d) {
        this.f12764c = str;
        this.f12762a = z;
        this.f12763b = fillType;
        this.f12765d = c5237a;
        this.f12766e = c5240d;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5198f(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public C5237a m9684b() {
        return this.f12765d;
    }

    /* renamed from: c */
    public Path.FillType m9685c() {
        return this.f12763b;
    }

    /* renamed from: d */
    public String m9686d() {
        return this.f12764c;
    }

    /* renamed from: e */
    public C5240d m9687e() {
        return this.f12766e;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f12762a + '}';
    }
}
