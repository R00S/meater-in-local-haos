package Hb;

import Ra.InterfaceC1695h;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class O extends H0 {

    /* renamed from: c, reason: collision with root package name */
    private final Ra.m0[] f5688c;

    /* renamed from: d, reason: collision with root package name */
    private final E0[] f5689d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5690e;

    public /* synthetic */ O(Ra.m0[] m0VarArr, E0[] e0Arr, boolean z10, int i10, C3854k c3854k) {
        this(m0VarArr, e0Arr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // Hb.H0
    public boolean b() {
        return this.f5690e;
    }

    @Override // Hb.H0
    public E0 e(U key) {
        C3862t.g(key, "key");
        InterfaceC1695h interfaceC1695hT = key.O0().t();
        Ra.m0 m0Var = interfaceC1695hT instanceof Ra.m0 ? (Ra.m0) interfaceC1695hT : null;
        if (m0Var == null) {
            return null;
        }
        int index = m0Var.getIndex();
        Ra.m0[] m0VarArr = this.f5688c;
        if (index >= m0VarArr.length || !C3862t.b(m0VarArr[index].l(), m0Var.l())) {
            return null;
        }
        return this.f5689d[index];
    }

    @Override // Hb.H0
    public boolean f() {
        return this.f5689d.length == 0;
    }

    public final E0[] i() {
        return this.f5689d;
    }

    public final Ra.m0[] j() {
        return this.f5688c;
    }

    public O(Ra.m0[] parameters, E0[] arguments, boolean z10) {
        C3862t.g(parameters, "parameters");
        C3862t.g(arguments, "arguments");
        this.f5688c = parameters;
        this.f5689d = arguments;
        this.f5690e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(List<? extends Ra.m0> parameters, List<? extends E0> argumentsList) {
        this((Ra.m0[]) parameters.toArray(new Ra.m0[0]), (E0[]) argumentsList.toArray(new E0[0]), false, 4, null);
        C3862t.g(parameters, "parameters");
        C3862t.g(argumentsList, "argumentsList");
    }
}
