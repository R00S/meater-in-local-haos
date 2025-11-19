package m8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import l8.AbstractC3912e;
import l8.C3910c;
import l8.C3916i;
import m8.J;

/* compiled from: MapMaker.java */
/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    boolean f45170a;

    /* renamed from: b, reason: collision with root package name */
    int f45171b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f45172c = -1;

    /* renamed from: d, reason: collision with root package name */
    J.m f45173d;

    /* renamed from: e, reason: collision with root package name */
    J.m f45174e;

    /* renamed from: f, reason: collision with root package name */
    AbstractC3912e<Object> f45175f;

    int a() {
        int i10 = this.f45172c;
        if (i10 == -1) {
            return 4;
        }
        return i10;
    }

    int b() {
        int i10 = this.f45171b;
        if (i10 == -1) {
            return 16;
        }
        return i10;
    }

    AbstractC3912e<Object> c() {
        return (AbstractC3912e) C3916i.a(this.f45175f, d().j());
    }

    J.m d() {
        return (J.m) C3916i.a(this.f45173d, J.m.f45210B);
    }

    J.m e() {
        return (J.m) C3916i.a(this.f45174e, J.m.f45210B);
    }

    public <K, V> ConcurrentMap<K, V> f() {
        return !this.f45170a ? new ConcurrentHashMap(b(), 0.75f, a()) : J.a(this);
    }

    I g(J.m mVar) {
        J.m mVar2 = this.f45173d;
        l8.m.s(mVar2 == null, "Key strength was already set to %s", mVar2);
        this.f45173d = (J.m) l8.m.l(mVar);
        if (mVar != J.m.f45210B) {
            this.f45170a = true;
        }
        return this;
    }

    public I h() {
        return g(J.m.f45211C);
    }

    public String toString() {
        C3916i.b bVarB = C3916i.b(this);
        int i10 = this.f45171b;
        if (i10 != -1) {
            bVarB.a("initialCapacity", i10);
        }
        int i11 = this.f45172c;
        if (i11 != -1) {
            bVarB.a("concurrencyLevel", i11);
        }
        J.m mVar = this.f45173d;
        if (mVar != null) {
            bVarB.b("keyStrength", C3910c.e(mVar.toString()));
        }
        J.m mVar2 = this.f45174e;
        if (mVar2 != null) {
            bVarB.b("valueStrength", C3910c.e(mVar2.toString()));
        }
        if (this.f45175f != null) {
            bVarB.h("keyEquivalence");
        }
        return bVarB.toString();
    }
}
