package Ab;

import Hb.U;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1700m;
import Ra.Z;
import Ra.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import tb.C4606r;

/* compiled from: TypeIntersectionScope.kt */
/* loaded from: classes3.dex */
public final class x extends Ab.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f1168d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f1169b;

    /* renamed from: c, reason: collision with root package name */
    private final k f1170c;

    /* compiled from: TypeIntersectionScope.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final k a(String message, Collection<? extends U> types) {
            C3862t.g(message, "message");
            C3862t.g(types, "types");
            Collection<? extends U> collection = types;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((U) it.next()).s());
            }
            Rb.k<k> kVarB = Qb.a.b(arrayList);
            k kVarB2 = b.f1103d.b(message, kVarB);
            return kVarB.size() <= 1 ? kVarB2 : new x(message, kVarB2, null);
        }

        private a() {
        }
    }

    public /* synthetic */ x(String str, k kVar, C3854k c3854k) {
        this(str, kVar);
    }

    public static final k m(String str, Collection<? extends U> collection) {
        return f1168d.a(str, collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1688a n(InterfaceC1688a selectMostSpecificInEachOverridableGroup) {
        C3862t.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1688a o(g0 selectMostSpecificInEachOverridableGroup) {
        C3862t.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC1688a p(Z selectMostSpecificInEachOverridableGroup) {
        C3862t.g(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // Ab.a, Ab.k
    public Collection<g0> b(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return C4606r.b(super.b(name, location), u.f1165B);
    }

    @Override // Ab.a, Ab.k
    public Collection<Z> d(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        return C4606r.b(super.d(name, location), v.f1166B);
    }

    @Override // Ab.a, Ab.n
    public Collection<InterfaceC1700m> f(d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        Collection<InterfaceC1700m> collectionF = super.f(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionF) {
            if (((InterfaceC1700m) obj) instanceof InterfaceC1688a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C4170o c4170o = new C4170o(arrayList, arrayList2);
        List list = (List) c4170o.a();
        List list2 = (List) c4170o.b();
        C3862t.e(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return kotlin.collections.r.F0(C4606r.b(list, w.f1167B), list2);
    }

    @Override // Ab.a
    protected k i() {
        return this.f1170c;
    }

    private x(String str, k kVar) {
        this.f1169b = str;
        this.f1170c = kVar;
    }
}
