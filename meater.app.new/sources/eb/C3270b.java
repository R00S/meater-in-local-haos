package eb;

import hb.C3523p;
import hb.InterfaceC3514g;
import hb.InterfaceC3521n;
import hb.InterfaceC3524q;
import hb.InterfaceC3525r;
import hb.InterfaceC3530w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C3862t;

/* compiled from: DeclaredMemberIndex.kt */
/* renamed from: eb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3270b implements InterfaceC3271c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3514g f40880a;

    /* renamed from: b, reason: collision with root package name */
    private final Ba.l<InterfaceC3524q, Boolean> f40881b;

    /* renamed from: c, reason: collision with root package name */
    private final Ba.l<InterfaceC3525r, Boolean> f40882c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<qb.f, List<InterfaceC3525r>> f40883d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<qb.f, InterfaceC3521n> f40884e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<qb.f, InterfaceC3530w> f40885f;

    /* JADX WARN: Multi-variable type inference failed */
    public C3270b(InterfaceC3514g jClass, Ba.l<? super InterfaceC3524q, Boolean> memberFilter) {
        C3862t.g(jClass, "jClass");
        C3862t.g(memberFilter, "memberFilter");
        this.f40880a = jClass;
        this.f40881b = memberFilter;
        C3269a c3269a = new C3269a(this);
        this.f40882c = c3269a;
        Tb.h hVarQ = Tb.k.q(kotlin.collections.r.Z(jClass.M()), c3269a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : hVarQ) {
            qb.f name = ((InterfaceC3525r) obj).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f40883d = linkedHashMap;
        Tb.h hVarQ2 = Tb.k.q(kotlin.collections.r.Z(this.f40880a.getFields()), this.f40881b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : hVarQ2) {
            linkedHashMap2.put(((InterfaceC3521n) obj2).getName(), obj2);
        }
        this.f40884e = linkedHashMap2;
        Collection<InterfaceC3530w> collectionI = this.f40880a.i();
        Ba.l<InterfaceC3524q, Boolean> lVar = this.f40881b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionI) {
            if (((Boolean) lVar.invoke(obj3)).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(arrayList2, 10)), 16));
        for (Object obj4 : arrayList2) {
            linkedHashMap3.put(((InterfaceC3530w) obj4).getName(), obj4);
        }
        this.f40885f = linkedHashMap3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(C3270b c3270b, InterfaceC3525r m10) {
        C3862t.g(m10, "m");
        return c3270b.f40881b.invoke(m10).booleanValue() && !C3523p.c(m10);
    }

    @Override // eb.InterfaceC3271c
    public Set<qb.f> a() {
        Tb.h hVarQ = Tb.k.q(kotlin.collections.r.Z(this.f40880a.M()), this.f40882c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarQ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC3525r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // eb.InterfaceC3271c
    public InterfaceC3530w b(qb.f name) {
        C3862t.g(name, "name");
        return this.f40885f.get(name);
    }

    @Override // eb.InterfaceC3271c
    public Collection<InterfaceC3525r> c(qb.f name) {
        C3862t.g(name, "name");
        List<InterfaceC3525r> listM = this.f40883d.get(name);
        if (listM == null) {
            listM = kotlin.collections.r.m();
        }
        return listM;
    }

    @Override // eb.InterfaceC3271c
    public InterfaceC3521n d(qb.f name) {
        C3862t.g(name, "name");
        return this.f40884e.get(name);
    }

    @Override // eb.InterfaceC3271c
    public Set<qb.f> e() {
        return this.f40885f.keySet();
    }

    @Override // eb.InterfaceC3271c
    public Set<qb.f> f() {
        Tb.h hVarQ = Tb.k.q(kotlin.collections.r.Z(this.f40880a.getFields()), this.f40881b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = hVarQ.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC3521n) it.next()).getName());
        }
        return linkedHashSet;
    }
}
