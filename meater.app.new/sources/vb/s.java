package vb;

import Hb.U;
import Hb.y0;
import Ra.H;
import Ra.InterfaceC1695h;
import Ra.m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntegerValueTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class s implements y0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f51619a;

    /* renamed from: b, reason: collision with root package name */
    private final H f51620b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<U> f51621c;

    public Void c() {
        return null;
    }

    @Override // Hb.y0
    public List<m0> getParameters() {
        return kotlin.collections.r.m();
    }

    @Override // Hb.y0
    public Oa.j q() {
        return this.f51620b.q();
    }

    @Override // Hb.y0
    public y0 r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // Hb.y0
    public Collection<U> s() {
        return this.f51621c;
    }

    @Override // Hb.y0
    public /* bridge */ /* synthetic */ InterfaceC1695h t() {
        return (InterfaceC1695h) c();
    }

    public String toString() {
        return "IntegerValueType(" + this.f51619a + ')';
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }
}
