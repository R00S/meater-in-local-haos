package Hb;

import kotlin.jvm.internal.C3862t;

/* compiled from: SpecialTypes.kt */
/* renamed from: Hb.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1072a0 extends R0 {

    /* renamed from: C, reason: collision with root package name */
    private final Gb.n f5726C;

    /* renamed from: D, reason: collision with root package name */
    private final Ba.a<U> f5727D;

    /* renamed from: E, reason: collision with root package name */
    private final Gb.i<U> f5728E;

    /* JADX WARN: Multi-variable type inference failed */
    public C1072a0(Gb.n storageManager, Ba.a<? extends U> computation) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(computation, "computation");
        this.f5726C = storageManager;
        this.f5727D = computation;
        this.f5728E = storageManager.g(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U W0(Ib.g gVar, C1072a0 c1072a0) {
        return gVar.a(c1072a0.f5727D.invoke());
    }

    @Override // Hb.R0
    protected U S0() {
        return this.f5728E.invoke();
    }

    @Override // Hb.R0
    public boolean T0() {
        return this.f5728E.f();
    }

    @Override // Hb.U
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public C1072a0 Y0(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new C1072a0(this.f5726C, new Z(kotlinTypeRefiner, this));
    }
}
