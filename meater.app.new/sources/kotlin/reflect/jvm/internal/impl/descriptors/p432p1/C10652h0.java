package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10246c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;

/* compiled from: SubpackagesScope.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.h0 */
/* loaded from: classes2.dex */
public class C10652h0 extends AbstractC10252i {

    /* renamed from: b */
    private final InterfaceC10592g0 f40983b;

    /* renamed from: c */
    private final C10160c f40984c;

    public C10652h0(InterfaceC10592g0 interfaceC10592g0, C10160c c10160c) {
        C9801m.m32346f(interfaceC10592g0, "moduleDescriptor");
        C9801m.m32346f(c10160c, "fqName");
        this.f40983b = interfaceC10592g0;
        this.f40984c = c10160c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        if (!c10247d.m36137a(C10247d.f39630a.m36147f())) {
            return C10817u.m38888j();
        }
        if (this.f40984c.m35422d() && c10247d.m36138l().contains(AbstractC10246c.b.f39629a)) {
            return C10817u.m38888j();
        }
        Collection<C10160c> collectionMo37022p = this.f40983b.mo37022p(this.f40984c, function1);
        ArrayList arrayList = new ArrayList(collectionMo37022p.size());
        Iterator<C10160c> it = collectionMo37022p.iterator();
        while (it.hasNext()) {
            C10163f c10163fM35425g = it.next().m35425g();
            C9801m.m32345e(c10163fM35425g, "subFqName.shortName()");
            if (function1.invoke(c10163fM35425g).booleanValue()) {
                C10767a.m38508a(arrayList, m37855h(c10163fM35425g));
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    protected final InterfaceC10636p0 m37855h(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        if (c10163f.m35458y()) {
            return null;
        }
        InterfaceC10592g0 interfaceC10592g0 = this.f40983b;
        C10160c c10160cM35421c = this.f40984c.m35421c(c10163f);
        C9801m.m32345e(c10160cM35421c, "fqName.child(name)");
        InterfaceC10636p0 interfaceC10636p0Mo37018N = interfaceC10592g0.mo37018N(c10160cM35421c);
        if (interfaceC10636p0Mo37018N.isEmpty()) {
            return null;
        }
        return interfaceC10636p0Mo37018N;
    }

    public String toString() {
        return "subpackages of " + this.f40984c + " from " + this.f40983b;
    }
}
