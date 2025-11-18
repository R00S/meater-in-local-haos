package Hb;

import Ra.InterfaceC1695h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.C3862t;
import ra.C4370a;

/* compiled from: IntersectionTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class T implements y0, Lb.h {

    /* renamed from: a, reason: collision with root package name */
    private U f5703a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<U> f5704b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5705c;

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l f5706B;

        public a(Ba.l lVar) {
            this.f5706B = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            U u10 = (U) t10;
            Ba.l lVar = this.f5706B;
            C3862t.d(u10);
            String string = lVar.invoke(u10).toString();
            U u11 = (U) t11;
            Ba.l lVar2 = this.f5706B;
            C3862t.d(u11);
            return C4370a.d(string, lVar2.invoke(u11).toString());
        }
    }

    public T(Collection<? extends U> typesToIntersect) {
        C3862t.g(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<U> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f5704b = linkedHashSet;
        this.f5705c = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC1082f0 h(T t10, Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return t10.r(kotlinTypeRefiner).g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String k(T t10, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = Q.f5692B;
        }
        return t10.j(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(U it) {
        C3862t.g(it, "it");
        return it.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Ba.l lVar, U u10) {
        C3862t.d(u10);
        return lVar.invoke(u10).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T) {
            return C3862t.b(this.f5704b, ((T) obj).f5704b);
        }
        return false;
    }

    public final Ab.k f() {
        return Ab.x.f1168d.a("member scope for intersection type", this.f5704b);
    }

    public final AbstractC1082f0 g() {
        return X.n(u0.f5791C.j(), this, kotlin.collections.r.m(), false, f(), new S(this));
    }

    @Override // Hb.y0
    public List<Ra.m0> getParameters() {
        return kotlin.collections.r.m();
    }

    public int hashCode() {
        return this.f5705c;
    }

    public final U i() {
        return this.f5703a;
    }

    public final String j(Ba.l<? super U, ? extends Object> getProperTypeRelatedToStringify) {
        C3862t.g(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return kotlin.collections.r.s0(kotlin.collections.r.O0(this.f5704b, new a(getProperTypeRelatedToStringify)), " & ", "{", "}", 0, null, new P(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // Hb.y0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public T r(Ib.g kotlinTypeRefiner) {
        C3862t.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<U> collectionS = s();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collectionS, 10));
        Iterator<T> it = collectionS.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((U) it.next()).Y0(kotlinTypeRefiner));
            z10 = true;
        }
        T tO = null;
        if (z10) {
            U uI = i();
            tO = new T(arrayList).o(uI != null ? uI.Y0(kotlinTypeRefiner) : null);
        }
        return tO == null ? this : tO;
    }

    public final T o(U u10) {
        return new T(this.f5704b, u10);
    }

    @Override // Hb.y0
    public Oa.j q() {
        Oa.j jVarQ = this.f5704b.iterator().next().O0().q();
        C3862t.f(jVarQ, "getBuiltIns(...)");
        return jVarQ;
    }

    @Override // Hb.y0
    public Collection<U> s() {
        return this.f5704b;
    }

    @Override // Hb.y0
    public InterfaceC1695h t() {
        return null;
    }

    public String toString() {
        return k(this, null, 1, null);
    }

    @Override // Hb.y0
    public boolean u() {
        return false;
    }

    private T(Collection<? extends U> collection, U u10) {
        this(collection);
        this.f5703a = u10;
    }
}
