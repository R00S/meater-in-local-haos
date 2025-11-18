package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5206n;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: RectangleShape.java */
/* renamed from: com.airbnb.lottie.s.j.j */
/* loaded from: classes.dex */
public class C5260j implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12751a;

    /* renamed from: b */
    private final InterfaceC5249m<PointF, PointF> f12752b;

    /* renamed from: c */
    private final C5242f f12753c;

    /* renamed from: d */
    private final C5238b f12754d;

    public C5260j(String str, InterfaceC5249m<PointF, PointF> interfaceC5249m, C5242f c5242f, C5238b c5238b) {
        this.f12751a = str;
        this.f12752b = interfaceC5249m;
        this.f12753c = c5242f;
        this.f12754d = c5238b;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5206n(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public C5238b m9671b() {
        return this.f12754d;
    }

    /* renamed from: c */
    public String m9672c() {
        return this.f12751a;
    }

    /* renamed from: d */
    public InterfaceC5249m<PointF, PointF> m9673d() {
        return this.f12752b;
    }

    /* renamed from: e */
    public C5242f m9674e() {
        return this.f12753c;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f12752b + ", size=" + this.f12753c + '}';
    }
}
