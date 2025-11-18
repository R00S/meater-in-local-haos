package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5197e;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5242f;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: CircleShape.java */
/* renamed from: com.airbnb.lottie.s.j.a */
/* loaded from: classes.dex */
public class C5251a implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12693a;

    /* renamed from: b */
    private final InterfaceC5249m<PointF, PointF> f12694b;

    /* renamed from: c */
    private final C5242f f12695c;

    /* renamed from: d */
    private final boolean f12696d;

    public C5251a(String str, InterfaceC5249m<PointF, PointF> interfaceC5249m, C5242f c5242f, boolean z) {
        this.f12693a = str;
        this.f12694b = interfaceC5249m;
        this.f12695c = c5242f;
        this.f12696d = z;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5197e(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public String m9628b() {
        return this.f12693a;
    }

    /* renamed from: c */
    public InterfaceC5249m<PointF, PointF> m9629c() {
        return this.f12694b;
    }

    /* renamed from: d */
    public C5242f m9630d() {
        return this.f12695c;
    }

    /* renamed from: e */
    public boolean m9631e() {
        return this.f12696d;
    }
}
