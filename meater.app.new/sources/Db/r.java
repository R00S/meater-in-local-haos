package Db;

import kotlin.jvm.internal.C3862t;

/* compiled from: DeserializedPackageFragment.kt */
/* loaded from: classes3.dex */
public abstract class r extends Ua.H {

    /* renamed from: H, reason: collision with root package name */
    private final Gb.n f3724H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(qb.c fqName, Gb.n storageManager, Ra.H module) {
        super(module, fqName);
        C3862t.g(fqName, "fqName");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(module, "module");
        this.f3724H = storageManager;
    }

    public abstract InterfaceC1004j F0();

    public boolean L0(qb.f name) {
        C3862t.g(name, "name");
        Ab.k kVarS = s();
        return (kVarS instanceof Fb.w) && ((Fb.w) kVarS).t().contains(name);
    }

    public abstract void M0(C1008n c1008n);
}
