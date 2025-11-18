package Eb;

import Ba.l;
import Db.B;
import Db.C1000f;
import Db.C1008n;
import Db.C1011q;
import Db.InterfaceC1007m;
import Db.InterfaceC1009o;
import Db.InterfaceC1016w;
import Db.InterfaceC1017x;
import Gb.n;
import Ia.g;
import Oa.p;
import Ra.H;
import Ra.M;
import Ra.O;
import Ra.S;
import Za.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.r;
import kotlin.jvm.internal.C3859p;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import zb.C5225b;

/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes3.dex */
public final class b implements Oa.b {

    /* renamed from: b, reason: collision with root package name */
    private final d f4155b = new d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* synthetic */ class a extends C3859p implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(String p02) {
            C3862t.g(p02, "p0");
            return ((d) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f, Ia.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final g getOwner() {
            return P.b(d.class);
        }

        @Override // kotlin.jvm.internal.AbstractC3849f
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // Oa.b
    public O a(n storageManager, H builtInsModule, Iterable<? extends Ta.b> classDescriptorFactories, Ta.c platformDependentDeclarationFilter, Ta.a additionalClassPartsProvider, boolean z10) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(builtInsModule, "builtInsModule");
        C3862t.g(classDescriptorFactories, "classDescriptorFactories");
        C3862t.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C3862t.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, p.f13373H, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z10, new a(this.f4155b));
    }

    public final O b(n storageManager, H module, Set<qb.c> packageFqNames, Iterable<? extends Ta.b> classDescriptorFactories, Ta.c platformDependentDeclarationFilter, Ta.a additionalClassPartsProvider, boolean z10, l<? super String, ? extends InputStream> loadResource) {
        C3862t.g(storageManager, "storageManager");
        C3862t.g(module, "module");
        C3862t.g(packageFqNames, "packageFqNames");
        C3862t.g(classDescriptorFactories, "classDescriptorFactories");
        C3862t.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        C3862t.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        C3862t.g(loadResource, "loadResource");
        Set<qb.c> set = packageFqNames;
        ArrayList arrayList = new ArrayList(r.x(set, 10));
        for (qb.c cVar : set) {
            String strR = Eb.a.f4154r.r(cVar);
            InputStream inputStreamInvoke = loadResource.invoke(strR);
            if (inputStreamInvoke == null) {
                throw new IllegalStateException("Resource not found in classpath: " + strR);
            }
            arrayList.add(c.f4156P.a(cVar, storageManager, module, inputStreamInvoke, z10));
        }
        S s10 = new S(arrayList);
        M m10 = new M(storageManager, module);
        InterfaceC1009o.a aVar = InterfaceC1009o.a.f3713a;
        C1011q c1011q = new C1011q(s10);
        Eb.a aVar2 = Eb.a.f4154r;
        C1000f c1000f = new C1000f(module, m10, aVar2);
        B.a aVar3 = B.a.f3588a;
        InterfaceC1016w DO_NOTHING = InterfaceC1016w.f3734a;
        C3862t.f(DO_NOTHING, "DO_NOTHING");
        C1008n c1008n = new C1008n(storageManager, module, aVar, c1011q, c1000f, s10, aVar3, DO_NOTHING, c.a.f19624a, InterfaceC1017x.a.f3735a, classDescriptorFactories, m10, InterfaceC1007m.f3689a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, aVar2.e(), null, new C5225b(storageManager, r.m()), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).M0(c1008n);
        }
        return s10;
    }
}
