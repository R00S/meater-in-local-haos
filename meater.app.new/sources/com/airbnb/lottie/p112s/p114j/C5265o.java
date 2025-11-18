package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5208p;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5244h;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: ShapePath.java */
/* renamed from: com.airbnb.lottie.s.j.o */
/* loaded from: classes.dex */
public class C5265o implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12769a;

    /* renamed from: b */
    private final int f12770b;

    /* renamed from: c */
    private final C5244h f12771c;

    public C5265o(String str, int i2, C5244h c5244h) {
        this.f12769a = str;
        this.f12770b = i2;
        this.f12771c = c5244h;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5208p(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public String m9690b() {
        return this.f12769a;
    }

    /* renamed from: c */
    public C5244h m9691c() {
        return this.f12771c;
    }

    public String toString() {
        return "ShapePath{name=" + this.f12769a + ", index=" + this.f12770b + '}';
    }
}
