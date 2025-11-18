package Db;

import Fb.InterfaceC1037s;
import Ra.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C3862t;
import lb.C3932l;
import lb.C3933m;
import lb.C3935o;
import lb.C3936p;
import nb.AbstractC4075a;
import nb.C4078d;

/* compiled from: DeserializedPackageFragmentImpl.kt */
/* renamed from: Db.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1014u extends r {

    /* renamed from: I, reason: collision with root package name */
    private final AbstractC4075a f3727I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC1037s f3728J;

    /* renamed from: K, reason: collision with root package name */
    private final C4078d f3729K;

    /* renamed from: L, reason: collision with root package name */
    private final M f3730L;

    /* renamed from: M, reason: collision with root package name */
    private C3933m f3731M;

    /* renamed from: N, reason: collision with root package name */
    private Ab.k f3732N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1014u(qb.c fqName, Gb.n storageManager, Ra.H module, C3933m proto, AbstractC4075a metadataVersion, InterfaceC1037s interfaceC1037s) {
        super(fqName, storageManager, module);
        C3862t.g(fqName, "fqName");
        C3862t.g(storageManager, "storageManager");
        C3862t.g(module, "module");
        C3862t.g(proto, "proto");
        C3862t.g(metadataVersion, "metadataVersion");
        this.f3727I = metadataVersion;
        this.f3728J = interfaceC1037s;
        C3936p c3936pP = proto.P();
        C3862t.f(c3936pP, "getStrings(...)");
        C3935o c3935oO = proto.O();
        C3862t.f(c3935oO, "getQualifiedNames(...)");
        C4078d c4078d = new C4078d(c3936pP, c3935oO);
        this.f3729K = c4078d;
        this.f3730L = new M(proto, c4078d, metadataVersion, new C1012s(this));
        this.f3731M = proto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 P0(AbstractC1014u abstractC1014u, qb.b it) {
        C3862t.g(it, "it");
        InterfaceC1037s interfaceC1037s = abstractC1014u.f3728J;
        if (interfaceC1037s != null) {
            return interfaceC1037s;
        }
        h0 NO_SOURCE = h0.f15158a;
        C3862t.f(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection R0(AbstractC1014u abstractC1014u) {
        Collection<qb.b> collectionB = abstractC1014u.F0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            qb.b bVar = (qb.b) obj;
            if (!bVar.j() && !C1006l.f3683c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qb.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // Db.r
    public void M0(C1008n components) {
        C3862t.g(components, "components");
        C3933m c3933m = this.f3731M;
        if (c3933m == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f3731M = null;
        C3932l c3932lN = c3933m.N();
        C3862t.f(c3932lN, "getPackage(...)");
        this.f3732N = new Fb.M(this, c3932lN, this.f3729K, this.f3727I, this.f3728J, components, "scope of " + this, new C1013t(this));
    }

    @Override // Db.r
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public M F0() {
        return this.f3730L;
    }

    @Override // Ra.N
    public Ab.k s() {
        Ab.k kVar = this.f3732N;
        if (kVar != null) {
            return kVar;
        }
        C3862t.u("_memberScope");
        return null;
    }
}
