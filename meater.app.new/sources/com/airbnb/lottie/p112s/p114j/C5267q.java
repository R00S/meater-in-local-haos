package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5210r;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;

/* compiled from: ShapeTrimPath.java */
/* renamed from: com.airbnb.lottie.s.j.q */
/* loaded from: classes.dex */
public class C5267q implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12791a;

    /* renamed from: b */
    private final a f12792b;

    /* renamed from: c */
    private final C5238b f12793c;

    /* renamed from: d */
    private final C5238b f12794d;

    /* renamed from: e */
    private final C5238b f12795e;

    /* compiled from: ShapeTrimPath.java */
    /* renamed from: com.airbnb.lottie.s.j.q$a */
    public enum a {
        Simultaneously,
        Individually;

        /* renamed from: g */
        public static a m9708g(int i2) {
            if (i2 == 1) {
                return Simultaneously;
            }
            if (i2 == 2) {
                return Individually;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i2);
        }
    }

    public C5267q(String str, a aVar, C5238b c5238b, C5238b c5238b2, C5238b c5238b3) {
        this.f12791a = str;
        this.f12792b = aVar;
        this.f12793c = c5238b;
        this.f12794d = c5238b2;
        this.f12795e = c5238b3;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5210r(abstractC5268a, this);
    }

    /* renamed from: b */
    public C5238b m9703b() {
        return this.f12794d;
    }

    /* renamed from: c */
    public String m9704c() {
        return this.f12791a;
    }

    /* renamed from: d */
    public C5238b m9705d() {
        return this.f12795e;
    }

    /* renamed from: e */
    public C5238b m9706e() {
        return this.f12793c;
    }

    /* renamed from: f */
    public a m9707f() {
        return this.f12792b;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f12793c + ", end: " + this.f12794d + ", offset: " + this.f12795e + "}";
    }
}
