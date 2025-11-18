package Ab;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: LazyScopeAdapter.kt */
/* loaded from: classes3.dex */
public final class i extends a {

    /* renamed from: b, reason: collision with root package name */
    private final Gb.i<k> f1145b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Ba.a<? extends k> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        C3862t.g(getScope, "getScope");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k k(Ba.a aVar) {
        k kVar = (k) aVar.invoke();
        return kVar instanceof a ? ((a) kVar).h() : kVar;
    }

    @Override // Ab.a
    protected k i() {
        return this.f1145b.invoke();
    }

    public /* synthetic */ i(Gb.n nVar, Ba.a aVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? Gb.f.f4998e : nVar, aVar);
    }

    public i(Gb.n storageManager, Ba.a<? extends k> getScope) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(getScope, "getScope");
        this.f1145b = storageManager.g(new h(getScope));
    }
}
