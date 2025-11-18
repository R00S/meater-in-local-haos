package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5207o;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5248l;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: Repeater.java */
/* renamed from: com.airbnb.lottie.s.j.k */
/* loaded from: classes.dex */
public class C5261k implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12755a;

    /* renamed from: b */
    private final C5238b f12756b;

    /* renamed from: c */
    private final C5238b f12757c;

    /* renamed from: d */
    private final C5248l f12758d;

    public C5261k(String str, C5238b c5238b, C5238b c5238b2, C5248l c5248l) {
        this.f12755a = str;
        this.f12756b = c5238b;
        this.f12757c = c5238b2;
        this.f12758d = c5248l;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5207o(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public C5238b m9675b() {
        return this.f12756b;
    }

    /* renamed from: c */
    public String m9676c() {
        return this.f12755a;
    }

    /* renamed from: d */
    public C5238b m9677d() {
        return this.f12757c;
    }

    /* renamed from: e */
    public C5248l m9678e() {
        return this.f12758d;
    }
}
