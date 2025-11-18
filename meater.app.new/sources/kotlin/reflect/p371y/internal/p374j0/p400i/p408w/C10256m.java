package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.jvm.internal.impl.utils.C10767a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.C10203d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10360j1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;

/* compiled from: SubstitutingScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.m */
/* loaded from: classes3.dex */
public final class C10256m implements InterfaceC10251h {

    /* renamed from: b */
    private final InterfaceC10251h f39676b;

    /* renamed from: c */
    private final C10366l1 f39677c;

    /* renamed from: d */
    private Map<InterfaceC10609m, InterfaceC10609m> f39678d;

    /* renamed from: e */
    private final Lazy f39679e;

    /* compiled from: SubstitutingScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.m$a */
    static final class a extends Lambda implements Function0<Collection<? extends InterfaceC10609m>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Collection<InterfaceC10609m> invoke() {
            C10256m c10256m = C10256m.this;
            return c10256m.m36171k(InterfaceC10254k.a.m36162a(c10256m.f39676b, null, null, 3, null));
        }
    }

    public C10256m(InterfaceC10251h interfaceC10251h, C10366l1 c10366l1) {
        C9801m.m32346f(interfaceC10251h, "workerScope");
        C9801m.m32346f(c10366l1, "givenSubstitutor");
        this.f39676b = interfaceC10251h;
        AbstractC10360j1 abstractC10360j1M36755j = c10366l1.m36755j();
        C9801m.m32345e(abstractC10360j1M36755j, "givenSubstitutor.substitution");
        this.f39677c = C10203d.m36010f(abstractC10360j1M36755j, false, 1, null).m36726c();
        this.f39679e = C10550i.m37594b(new a());
    }

    /* renamed from: j */
    private final Collection<InterfaceC10609m> m36170j() {
        return (Collection) this.f39679e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public final <D extends InterfaceC10609m> Collection<D> m36171k(Collection<? extends D> collection) {
        if (this.f39677c.m36756k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetM38514g = C10767a.m38514g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetM38514g.add(m36172l((InterfaceC10609m) it.next()));
        }
        return linkedHashSetM38514g;
    }

    /* renamed from: l */
    private final <D extends InterfaceC10609m> D m36172l(D d2) {
        if (this.f39677c.m36756k()) {
            return d2;
        }
        if (this.f39678d == null) {
            this.f39678d = new HashMap();
        }
        Map<InterfaceC10609m, InterfaceC10609m> map = this.f39678d;
        C9801m.m32343c(map);
        InterfaceC10609m interfaceC10609mMo36396c = map.get(d2);
        if (interfaceC10609mMo36396c == null) {
            if (!(d2 instanceof InterfaceC10578b1)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d2).toString());
            }
            interfaceC10609mMo36396c = ((InterfaceC10578b1) d2).mo36396c(this.f39677c);
            if (interfaceC10609mMo36396c == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d2 + " substitution fails");
            }
            map.put(d2, interfaceC10609mMo36396c);
        }
        D d3 = (D) interfaceC10609mMo36396c;
        C9801m.m32344d(d3, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: a */
    public Collection<? extends InterfaceC10739y0> mo33311a(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return m36171k(this.f39676b.mo33311a(c10163f, interfaceC9939b));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: b */
    public Set<C10163f> mo33312b() {
        return this.f39676b.mo33312b();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: c */
    public Collection<? extends InterfaceC10729t0> mo33313c(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        return m36171k(this.f39676b.mo33313c(c10163f, interfaceC9939b));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: d */
    public Set<C10163f> mo33314d() {
        return this.f39676b.mo33314d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h
    /* renamed from: e */
    public Set<C10163f> mo33315e() {
        return this.f39676b.mo33315e();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        InterfaceC10594h interfaceC10594hMo33316f = this.f39676b.mo33316f(c10163f, interfaceC9939b);
        if (interfaceC10594hMo33316f != null) {
            return (InterfaceC10594h) m36172l(interfaceC10594hMo33316f);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: g */
    public Collection<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        return m36170j();
    }
}
