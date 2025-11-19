package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2759h2 extends AbstractC2816p3 {

    /* renamed from: c, reason: collision with root package name */
    private char f35371c;

    /* renamed from: d, reason: collision with root package name */
    private long f35372d;

    /* renamed from: e, reason: collision with root package name */
    private String f35373e;

    /* renamed from: f, reason: collision with root package name */
    private final C2766i2 f35374f;

    /* renamed from: g, reason: collision with root package name */
    private final C2766i2 f35375g;

    /* renamed from: h, reason: collision with root package name */
    private final C2766i2 f35376h;

    /* renamed from: i, reason: collision with root package name */
    private final C2766i2 f35377i;

    /* renamed from: j, reason: collision with root package name */
    private final C2766i2 f35378j;

    /* renamed from: k, reason: collision with root package name */
    private final C2766i2 f35379k;

    /* renamed from: l, reason: collision with root package name */
    private final C2766i2 f35380l;

    /* renamed from: m, reason: collision with root package name */
    private final C2766i2 f35381m;

    /* renamed from: n, reason: collision with root package name */
    private final C2766i2 f35382n;

    C2759h2(P2 p22) {
        super(p22);
        this.f35371c = (char) 0;
        this.f35372d = -1L;
        this.f35374f = new C2766i2(this, 6, false, false);
        this.f35375g = new C2766i2(this, 6, true, false);
        this.f35376h = new C2766i2(this, 6, false, true);
        this.f35377i = new C2766i2(this, 5, false, false);
        this.f35378j = new C2766i2(this, 5, true, false);
        this.f35379k = new C2766i2(this, 5, false, true);
        this.f35380l = new C2766i2(this, 4, false, false);
        this.f35381m = new C2766i2(this, 3, false, false);
        this.f35382n = new C2766i2(this, 2, false, false);
    }

    private static String F(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) == -1) ? "" : str.substring(0, iLastIndexOf);
    }

    private final String Q() {
        String str;
        synchronized (this) {
            try {
                if (this.f35373e == null) {
                    this.f35373e = this.f35457a.S() != null ? this.f35457a.S() : "FA";
                }
                C3445p.k(this.f35373e);
                str = this.f35373e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    protected static Object w(String str) {
        if (str == null) {
            return null;
        }
        return new C2787l2(str);
    }

    private static String x(boolean z10, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i10 = 0;
        if (obj instanceof Long) {
            if (!z10) {
                return String.valueOf(obj);
            }
            Long l10 = (Long) obj;
            if (Math.abs(l10.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l10.longValue()));
            return str + Math.round(Math.pow(10.0d, strValueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof C2787l2 ? ((C2787l2) obj).f35435a : z10 ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z10 ? th.getClass().getName() : th.toString());
        String strF = F(P2.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && F(className).equals(strF)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i10++;
        }
        return sb2.toString();
    }

    static String y(boolean z10, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strX = x(z10, obj);
        String strX2 = x(z10, obj2);
        String strX3 = x(z10, obj3);
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strX)) {
            sb2.append(str2);
            sb2.append(strX);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strX2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strX2);
        }
        if (!TextUtils.isEmpty(strX3)) {
            sb2.append(str3);
            sb2.append(strX3);
        }
        return sb2.toString();
    }

    protected final void A(int i10, boolean z10, boolean z11, String str, Object obj, Object obj2, Object obj3) {
        if (!z10 && D(i10)) {
            z(i10, y(false, str, obj, obj2, obj3));
        }
        if (z11 || i10 < 5) {
            return;
        }
        C3445p.k(str);
        J2 j2I = this.f35457a.I();
        if (j2I == null) {
            z(6, "Scheduler not set. Not logging error/warn");
            return;
        }
        if (!j2I.t()) {
            z(6, "Scheduler not initialized. Not logging error/warn");
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 >= 9) {
            i10 = 8;
        }
        j2I.E(new RunnableC2773j2(this, i10, str, obj, obj2, obj3));
    }

    protected final boolean D(int i10) {
        return Log.isLoggable(Q(), i10);
    }

    public final C2766i2 G() {
        return this.f35381m;
    }

    public final C2766i2 H() {
        return this.f35374f;
    }

    public final C2766i2 I() {
        return this.f35376h;
    }

    public final C2766i2 J() {
        return this.f35375g;
    }

    public final C2766i2 K() {
        return this.f35380l;
    }

    public final C2766i2 L() {
        return this.f35382n;
    }

    public final C2766i2 M() {
        return this.f35377i;
    }

    public final C2766i2 N() {
        return this.f35379k;
    }

    public final C2766i2 O() {
        return this.f35378j;
    }

    public final String P() {
        Pair<String, Long> pairA;
        if (h().f35600f == null || (pairA = h().f35600f.a()) == null || pairA == C2835s2.f35595B) {
            return null;
        }
        return String.valueOf(pairA.second) + ":" + ((String) pairA.first);
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.e b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2763i c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ E e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2742f f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2738e2 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2835s2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ C2747f4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ Q5 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ C2759h2 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.C2795m3, com.google.android.gms.measurement.internal.InterfaceC2809o3
    public final /* bridge */ /* synthetic */ J2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2816p3
    protected final boolean u() {
        return false;
    }

    protected final void z(int i10, String str) {
        Log.println(i10, Q(), str);
    }
}
