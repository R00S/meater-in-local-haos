package Fb;

import Db.C1008n;
import Db.C1010p;
import Ra.InterfaceC1695h;
import Ra.InterfaceC1700m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import lb.C3929i;
import lb.C3932l;
import lb.C3934n;
import lb.C3938r;
import lb.C3940t;
import nb.AbstractC4075a;
import nb.InterfaceC4077c;
import nb.h;

/* compiled from: DeserializedPackageMemberScope.kt */
/* loaded from: classes3.dex */
public class M extends w {

    /* renamed from: g, reason: collision with root package name */
    private final Ra.N f4596g;

    /* renamed from: h, reason: collision with root package name */
    private final String f4597h;

    /* renamed from: i, reason: collision with root package name */
    private final qb.c f4598i;

    public M(Ra.N packageDescriptor, C3932l proto, InterfaceC4077c nameResolver, AbstractC4075a metadataVersion, InterfaceC1037s interfaceC1037s, C1008n components, String debugName, Ba.a<? extends Collection<qb.f>> classNames) {
        C3862t.g(packageDescriptor, "packageDescriptor");
        C3862t.g(proto, "proto");
        C3862t.g(nameResolver, "nameResolver");
        C3862t.g(metadataVersion, "metadataVersion");
        C3862t.g(components, "components");
        C3862t.g(debugName, "debugName");
        C3862t.g(classNames, "classNames");
        C3940t c3940tW = proto.W();
        C3862t.f(c3940tW, "getTypeTable(...)");
        nb.g gVar = new nb.g(c3940tW);
        h.a aVar = nb.h.f45846b;
        lb.w wVarX = proto.X();
        C3862t.f(wVarX, "getVersionRequirementTable(...)");
        C1010p c1010pA = components.a(packageDescriptor, nameResolver, gVar, aVar.a(wVarX), metadataVersion, interfaceC1037s);
        List<C3929i> listP = proto.P();
        C3862t.f(listP, "getFunctionList(...)");
        List<C3934n> listS = proto.S();
        C3862t.f(listS, "getPropertyList(...)");
        List<C3938r> listV = proto.V();
        C3862t.f(listV, "getTypeAliasList(...)");
        super(c1010pA, listP, listS, listV, classNames);
        this.f4596g = packageDescriptor;
        this.f4597h = debugName;
        this.f4598i = packageDescriptor.f();
    }

    @Override // Ab.l, Ab.n
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC1700m> f(Ab.d kindFilter, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(kindFilter, "kindFilter");
        C3862t.g(nameFilter, "nameFilter");
        Collection<InterfaceC1700m> collectionM = m(kindFilter, nameFilter, Za.d.f19637N);
        Iterable<Ta.b> iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator<Ta.b> it = iterableL.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList, it.next().b(this.f4598i));
        }
        return kotlin.collections.r.F0(collectionM, arrayList);
    }

    public void C(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        Ya.a.b(s().c().p(), location, this.f4596g, name);
    }

    @Override // Fb.w, Ab.l, Ab.n
    public InterfaceC1695h g(qb.f name, Za.b location) {
        C3862t.g(name, "name");
        C3862t.g(location, "location");
        C(name, location);
        return super.g(name, location);
    }

    @Override // Fb.w
    protected void j(Collection<InterfaceC1700m> result, Ba.l<? super qb.f, Boolean> nameFilter) {
        C3862t.g(result, "result");
        C3862t.g(nameFilter, "nameFilter");
    }

    @Override // Fb.w
    protected qb.b p(qb.f name) {
        C3862t.g(name, "name");
        return new qb.b(this.f4598i, name);
    }

    public String toString() {
        return this.f4597h;
    }

    @Override // Fb.w
    protected Set<qb.f> v() {
        return V.d();
    }

    @Override // Fb.w
    protected Set<qb.f> w() {
        return V.d();
    }

    @Override // Fb.w
    protected Set<qb.f> x() {
        return V.d();
    }

    @Override // Fb.w
    protected boolean z(qb.f name) {
        C3862t.g(name, "name");
        if (!super.z(name)) {
            Iterable<Ta.b> iterableL = s().c().l();
            if (!(iterableL instanceof Collection) || !((Collection) iterableL).isEmpty()) {
                Iterator<Ta.b> it = iterableL.iterator();
                while (it.hasNext()) {
                    if (it.next().c(this.f4598i, name)) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
