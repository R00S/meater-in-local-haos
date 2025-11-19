package Fb;

import Db.C1010p;
import Db.X;
import Hb.U;
import Ra.InterfaceC1700m;
import Ra.h0;
import Ra.k0;
import Ua.AbstractC1763b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import lb.C3937q;
import lb.C3939s;
import xb.C5087e;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* loaded from: classes3.dex */
public final class S extends AbstractC1763b {

    /* renamed from: L, reason: collision with root package name */
    private final C1010p f4619L;

    /* renamed from: M, reason: collision with root package name */
    private final C3939s f4620M;

    /* renamed from: N, reason: collision with root package name */
    private final C1020a f4621N;

    /* JADX WARN: Illegal instructions before constructor call */
    public S(C1010p c10, C3939s proto, int i10) {
        C3862t.g(c10, "c");
        C3862t.g(proto, "proto");
        Gb.n nVarH = c10.h();
        InterfaceC1700m interfaceC1700mE = c10.e();
        Sa.h hVarB = Sa.h.f15630e.b();
        qb.f fVarB = Db.L.b(c10.g(), proto.O());
        Db.O o10 = Db.O.f3632a;
        C3939s.c cVarU = proto.U();
        C3862t.f(cVarU, "getVariance(...)");
        super(nVarH, interfaceC1700mE, hVarB, fVarB, o10.d(cVarU), proto.P(), i10, h0.f15158a, k0.a.f15161a);
        this.f4619L = c10;
        this.f4620M = proto;
        this.f4621N = new C1020a(c10.h(), new Q(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List O0(S s10) {
        return kotlin.collections.r.W0(s10.f4619L.c().d().j(s10.f4620M, s10.f4619L.g()));
    }

    @Override // Ua.AbstractC1769h
    protected List<U> M0() {
        List<C3937q> listS = nb.f.s(this.f4620M, this.f4619L.j());
        if (listS.isEmpty()) {
            return kotlin.collections.r.e(C5087e.m(this).y());
        }
        List<C3937q> list = listS;
        X xI = this.f4619L.i();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(xI.u((C3937q) it.next()));
        }
        return arrayList;
    }

    @Override // Sa.b, Sa.a
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public C1020a getAnnotations() {
        return this.f4621N;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ua.AbstractC1769h
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void L0(U type) {
        C3862t.g(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
