package com.airbnb.lottie.p112s.p114j;

import android.graphics.PointF;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5205m;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.InterfaceC5249m;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: PolystarShape.java */
/* renamed from: com.airbnb.lottie.s.j.i */
/* loaded from: classes.dex */
public class C5259i implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12738a;

    /* renamed from: b */
    private final a f12739b;

    /* renamed from: c */
    private final C5238b f12740c;

    /* renamed from: d */
    private final InterfaceC5249m<PointF, PointF> f12741d;

    /* renamed from: e */
    private final C5238b f12742e;

    /* renamed from: f */
    private final C5238b f12743f;

    /* renamed from: g */
    private final C5238b f12744g;

    /* renamed from: h */
    private final C5238b f12745h;

    /* renamed from: i */
    private final C5238b f12746i;

    /* compiled from: PolystarShape.java */
    /* renamed from: com.airbnb.lottie.s.j.i$a */
    public enum a {
        Star(1),
        Polygon(2);


        /* renamed from: i */
        private final int f12750i;

        a(int i2) {
            this.f12750i = i2;
        }

        /* renamed from: g */
        public static a m9670g(int i2) {
            for (a aVar : values()) {
                if (aVar.f12750i == i2) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C5259i(String str, a aVar, C5238b c5238b, InterfaceC5249m<PointF, PointF> interfaceC5249m, C5238b c5238b2, C5238b c5238b3, C5238b c5238b4, C5238b c5238b5, C5238b c5238b6) {
        this.f12738a = str;
        this.f12739b = aVar;
        this.f12740c = c5238b;
        this.f12741d = interfaceC5249m;
        this.f12742e = c5238b2;
        this.f12743f = c5238b3;
        this.f12744g = c5238b4;
        this.f12745h = c5238b5;
        this.f12746i = c5238b6;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5205m(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public C5238b m9661b() {
        return this.f12743f;
    }

    /* renamed from: c */
    public C5238b m9662c() {
        return this.f12745h;
    }

    /* renamed from: d */
    public String m9663d() {
        return this.f12738a;
    }

    /* renamed from: e */
    public C5238b m9664e() {
        return this.f12744g;
    }

    /* renamed from: f */
    public C5238b m9665f() {
        return this.f12746i;
    }

    /* renamed from: g */
    public C5238b m9666g() {
        return this.f12740c;
    }

    /* renamed from: h */
    public InterfaceC5249m<PointF, PointF> m9667h() {
        return this.f12741d;
    }

    /* renamed from: i */
    public C5238b m9668i() {
        return this.f12742e;
    }

    /* renamed from: j */
    public a m9669j() {
        return this.f12739b;
    }
}
