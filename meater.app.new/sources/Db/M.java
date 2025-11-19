package Db;

import Ra.h0;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C3862t;
import lb.C3923c;
import lb.C3933m;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* loaded from: classes3.dex */
public final class M implements InterfaceC1004j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4077c f3618a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC4075a f3619b;

    /* renamed from: c, reason: collision with root package name */
    private final Ba.l<qb.b, h0> f3620c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<qb.b, C3923c> f3621d;

    /* JADX WARN: Multi-variable type inference failed */
    public M(C3933m proto, InterfaceC4077c nameResolver, AbstractC4075a metadataVersion, Ba.l<? super qb.b, ? extends h0> classSource) {
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(classSource, "classSource");
        this.f3618a = nameResolver;
        this.f3619b = metadataVersion;
        this.f3620c = classSource;
        List<C3923c> listK = proto.K();
        C3862t.f(listK, "getClass_List(...)");
        List<C3923c> list = listK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Ha.g.d(kotlin.collections.M.d(kotlin.collections.r.x(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(L.a(this.f3618a, ((C3923c) obj).G0()), obj);
        }
        this.f3621d = linkedHashMap;
    }

    @Override // Db.InterfaceC1004j
    public C1003i a(qb.b classId) {
        C3862t.g(classId, "classId");
        C3923c c3923c = this.f3621d.get(classId);
        if (c3923c == null) {
            return null;
        }
        return new C1003i(this.f3618a, c3923c, this.f3619b, this.f3620c.invoke(classId));
    }

    public final Collection<qb.b> b() {
        return this.f3621d.keySet();
    }
}
