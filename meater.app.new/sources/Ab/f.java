package Ab;

import Ab.n;
import Hb.U;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1712z;
import Ra.Z;
import Ra.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import tb.AbstractC4601m;
import tb.C4603o;

/* compiled from: GivenFunctionsMemberScope.kt */
/* loaded from: classes3.dex */
public abstract class f extends l {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ Ia.m<Object>[] f1138d = {P.h(new G(P.b(f.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1692e f1139b;

    /* renamed from: c, reason: collision with root package name */
    private final Gb.i f1140c;

    /* compiled from: GivenFunctionsMemberScope.kt */
    public static final class a extends AbstractC4601m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList<InterfaceC1700m> f1141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f1142b;

        a(ArrayList<InterfaceC1700m> arrayList, f fVar) {
            this.f1141a = arrayList;
            this.f1142b = fVar;
        }

        @Override // tb.AbstractC4602n
        public void a(InterfaceC1689b fakeOverride) {
            C3862t.g(fakeOverride, "fakeOverride");
            C4603o.K(fakeOverride, null);
            this.f1141a.add(fakeOverride);
        }

        @Override // tb.AbstractC4601m
        protected void e(InterfaceC1689b fromSuper, InterfaceC1689b fromCurrent) {
            C3862t.g(fromSuper, "fromSuper");
            C3862t.g(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f1142b.m() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public f(Gb.n storageManager, InterfaceC1692e containingClass) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(containingClass, "containingClass");
        this.f1139b = containingClass;
        this.f1140c = storageManager.g(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List i(f fVar) {
        List<InterfaceC1712z> listJ = fVar.j();
        return kotlin.collections.r.F0(listJ, fVar.k(listJ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<InterfaceC1700m> k(List<? extends InterfaceC1712z> list) {
        Collection<? extends InterfaceC1689b> collectionM;
        ArrayList arrayList = new ArrayList(3);
        Collection<U> collectionS = this.f1139b.l().s();
        C3862t.f(collectionS, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = collectionS.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList2, n.a.a(((U) it.next()).s(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof InterfaceC1689b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            qb.f name = ((InterfaceC1689b) obj2).getName();
            Object arrayList4 = linkedHashMap.get(name);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(name, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C3862t.f(key, "component1(...)");
            qb.f fVar = (qb.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((InterfaceC1689b) obj3) instanceof InterfaceC1712z);
                Object arrayList5 = linkedHashMap2.get(boolValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                C4603o c4603o = C4603o.f50027f;
                List list4 = list3;
                if (zBooleanValue) {
                    collectionM = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (C3862t.b(((InterfaceC1712z) obj4).getName(), fVar)) {
                            collectionM.add(obj4);
                        }
                    }
                } else {
                    collectionM = kotlin.collections.r.m();
                }
                c4603o.v(fVar, list4, collectionM, this.f1139b, new a(arrayList, this));
            }
        }
        return Rb.a.c(arrayList);
    }

    private final List<InterfaceC1700m> l() {
        return (List) Gb.m.a(this.f1140c, this, f1138d[0]);
    }

    @Override // Ab.l, Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        List listM;
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        List<InterfaceC1700m> listL = l();
        if (listL.isEmpty()) {
            listM = kotlin.collections.r.m();
        } else {
            Rb.k kVar = new Rb.k();
            for (Object obj : listL) {
                if ((obj instanceof g0) && C3862t.b(((g0) obj).getName(), name)) {
                    kVar.add(obj);
                }
            }
            listM = kVar;
        }
        return listM;
    }

    @Override // Ab.l, Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        List listM;
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        List<InterfaceC1700m> listL = l();
        if (listL.isEmpty()) {
            listM = kotlin.collections.r.m();
        } else {
            Rb.k kVar = new Rb.k();
            for (Object obj : listL) {
                if ((obj instanceof Z) && C3862t.b(((Z) obj).getName(), name)) {
                    kVar.add(obj);
                }
            }
            listM = kVar;
        }
        return listM;
    }

    @Override // Ab.l, Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        return !kindFilter.a(d.f1122p.m()) ? kotlin.collections.r.m() : l();
    }

    protected abstract List<InterfaceC1712z> j();

    protected final InterfaceC1692e m() {
        return this.f1139b;
    }
}
