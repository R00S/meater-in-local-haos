package Oa;

import Hb.M0;
import Hb.U;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import Ra.N;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import oa.v;

/* compiled from: UnsignedType.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f13511a = new t();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<qb.f> f13512b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<qb.f> f13513c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<qb.b, qb.b> f13514d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<qb.b, qb.b> f13515e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<r, qb.f> f13516f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<qb.f> f13517g;

    static {
        s[] sVarArrValues = s.values();
        ArrayList arrayList = new ArrayList(sVarArrValues.length);
        for (s sVar : sVarArrValues) {
            arrayList.add(sVar.p());
        }
        f13512b = kotlin.collections.r.b1(arrayList);
        r[] rVarArrValues = r.values();
        ArrayList arrayList2 = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList2.add(rVar.j());
        }
        f13513c = kotlin.collections.r.b1(arrayList2);
        f13514d = new HashMap<>();
        f13515e = new HashMap<>();
        f13516f = M.j(v.a(r.f13494D, qb.f.t("ubyteArrayOf")), v.a(r.f13495E, qb.f.t("ushortArrayOf")), v.a(r.f13496F, qb.f.t("uintArrayOf")), v.a(r.f13497G, qb.f.t("ulongArrayOf")));
        s[] sVarArrValues2 = s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (s sVar2 : sVarArrValues2) {
            linkedHashSet.add(sVar2.j().h());
        }
        f13517g = linkedHashSet;
        for (s sVar3 : s.values()) {
            f13514d.put(sVar3.j(), sVar3.n());
            f13515e.put(sVar3.n(), sVar3.j());
        }
    }

    private t() {
    }

    public static final boolean d(U type) {
        InterfaceC1695h interfaceC1695hT;
        C3862t.g(type, "type");
        if (M0.w(type) || (interfaceC1695hT = type.O0().t()) == null) {
            return false;
        }
        return f13511a.c(interfaceC1695hT);
    }

    public final qb.b a(qb.b arrayClassId) {
        C3862t.g(arrayClassId, "arrayClassId");
        return f13514d.get(arrayClassId);
    }

    public final boolean b(qb.f name) {
        C3862t.g(name, "name");
        return f13517g.contains(name);
    }

    public final boolean c(InterfaceC1700m descriptor) {
        C3862t.g(descriptor, "descriptor");
        InterfaceC1700m interfaceC1700mC = descriptor.c();
        return (interfaceC1700mC instanceof N) && C3862t.b(((N) interfaceC1700mC).f(), p.f13366A) && f13512b.contains(descriptor.getName());
    }
}
