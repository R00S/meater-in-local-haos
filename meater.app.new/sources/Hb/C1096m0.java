package Hb;

import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: StarProjectionImpl.kt */
/* renamed from: Hb.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1096m0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ra.m0 f5762a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4164i f5763b;

    public C1096m0(Ra.m0 typeParameter) {
        C3862t.g(typeParameter, "typeParameter");
        this.f5762a = typeParameter;
        this.f5763b = C4165j.b(EnumC4168m.f46627C, new C1094l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U d(C1096m0 c1096m0) {
        return C1098n0.b(c1096m0.f5762a);
    }

    private final U f() {
        return (U) this.f5763b.getValue();
    }

    @Override // Hb.E0
    public U a() {
        return f();
    }

    @Override // Hb.E0
    public Q0 b() {
        return Q0.f5695H;
    }

    @Override // Hb.E0
    public boolean c() {
        return true;
    }

    @Override // Hb.E0
    public E0 r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
