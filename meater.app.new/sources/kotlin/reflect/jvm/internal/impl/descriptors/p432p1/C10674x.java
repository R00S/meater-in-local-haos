package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.collections.C10782c0;
import kotlin.collections.C10803n;
import kotlin.collections.C10810q0;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10822w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C10574a0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10589f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10607l0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10638a0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p398g.C10169a;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10323g;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: ModuleDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x */
/* loaded from: classes2.dex */
public final class C10674x extends AbstractC10655j implements InterfaceC10592g0 {

    /* renamed from: h */
    private final InterfaceC10330n f41108h;

    /* renamed from: i */
    private final AbstractC9914h f41109i;

    /* renamed from: j */
    private final C10163f f41110j;

    /* renamed from: k */
    private final Map<C10589f0<?>, Object> f41111k;

    /* renamed from: l */
    private final InterfaceC10638a0 f41112l;

    /* renamed from: m */
    private InterfaceC10672v f41113m;

    /* renamed from: n */
    private InterfaceC10607l0 f41114n;

    /* renamed from: o */
    private boolean f41115o;

    /* renamed from: p */
    private final InterfaceC10323g<C10160c, InterfaceC10636p0> f41116p;

    /* renamed from: q */
    private final Lazy f41117q;

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x$a */
    static final class a extends Lambda implements Function0<C10653i> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C10653i invoke() {
            InterfaceC10672v interfaceC10672v = C10674x.this.f41113m;
            C10674x c10674x = C10674x.this;
            if (interfaceC10672v == null) {
                throw new AssertionError("Dependencies of module " + c10674x.m37988Q0() + " were not set before querying module content");
            }
            List<C10674x> listMo37979a = interfaceC10672v.mo37979a();
            C10674x.this.m37991P0();
            listMo37979a.contains(C10674x.this);
            Iterator<T> it = listMo37979a.iterator();
            while (it.hasNext()) {
                ((C10674x) it.next()).m37990U0();
            }
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37979a, 10));
            Iterator<T> it2 = listMo37979a.iterator();
            while (it2.hasNext()) {
                InterfaceC10607l0 interfaceC10607l0 = ((C10674x) it2.next()).f41114n;
                C9801m.m32343c(interfaceC10607l0);
                arrayList.add(interfaceC10607l0);
            }
            return new C10653i(arrayList, "CompositeProvider@ModuleDescriptor for " + C10674x.this.getName());
        }
    }

    /* compiled from: ModuleDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.x$b */
    static final class b extends Lambda implements Function1<C10160c, InterfaceC10636p0> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10636p0 invoke(C10160c c10160c) {
            C9801m.m32346f(c10160c, "fqName");
            InterfaceC10638a0 interfaceC10638a0 = C10674x.this.f41112l;
            C10674x c10674x = C10674x.this;
            return interfaceC10638a0.mo37758a(c10674x, c10160c, c10674x.f41108h);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10674x(C10163f c10163f, InterfaceC10330n interfaceC10330n, AbstractC9914h abstractC9914h, C10169a c10169a) {
        this(c10163f, interfaceC10330n, abstractC9914h, c10169a, null, null, 48, null);
        C9801m.m32346f(c10163f, "moduleName");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(abstractC9914h, "builtIns");
    }

    public /* synthetic */ C10674x(C10163f c10163f, InterfaceC10330n interfaceC10330n, AbstractC9914h abstractC9914h, C10169a c10169a, Map map, C10163f c10163f2, int i2, C9789g c9789g) {
        this(c10163f, interfaceC10330n, abstractC9914h, (i2 & 8) != 0 ? null : c10169a, (i2 & 16) != 0 ? C10810q0.m38797i() : map, (i2 & 32) != 0 ? null : c10163f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public final String m37988Q0() {
        String string = getName().toString();
        C9801m.m32345e(string, "name.toString()");
        return string;
    }

    /* renamed from: S0 */
    private final C10653i m37989S0() {
        return (C10653i) this.f41117q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public final boolean m37990U0() {
        return this.f41114n != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: I0 */
    public <T> T mo37016I0(C10589f0<T> c10589f0) {
        C9801m.m32346f(c10589f0, "capability");
        T t = (T) this.f41111k.get(c10589f0);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return (R) InterfaceC10592g0.a.m37689a(this, interfaceC10628o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: N */
    public InterfaceC10636p0 mo37018N(C10160c c10160c) {
        C9801m.m32346f(c10160c, "fqName");
        m37991P0();
        return this.f41116p.invoke(c10160c);
    }

    /* renamed from: P0 */
    public void m37991P0() {
        if (m37994V0()) {
            return;
        }
        C10574a0.m37666a(this);
    }

    /* renamed from: R0 */
    public final InterfaceC10607l0 m37992R0() {
        m37991P0();
        return m37989S0();
    }

    /* renamed from: T0 */
    public final void m37993T0(InterfaceC10607l0 interfaceC10607l0) {
        C9801m.m32346f(interfaceC10607l0, "providerForModuleContent");
        m37990U0();
        this.f41114n = interfaceC10607l0;
    }

    /* renamed from: V0 */
    public boolean m37994V0() {
        return this.f41115o;
    }

    /* renamed from: W0 */
    public final void m37995W0(List<C10674x> list) {
        C9801m.m32346f(list, "descriptors");
        m37996X0(list, C10822w0.m38917d());
    }

    /* renamed from: X0 */
    public final void m37996X0(List<C10674x> list, Set<C10674x> set) {
        C9801m.m32346f(list, "descriptors");
        C9801m.m32346f(set, "friends");
        m37997Y0(new C10673w(list, set, C10817u.m38888j(), C10822w0.m38917d()));
    }

    /* renamed from: Y0 */
    public final void m37997Y0(InterfaceC10672v interfaceC10672v) {
        C9801m.m32346f(interfaceC10672v, "dependencies");
        InterfaceC10672v interfaceC10672v2 = this.f41113m;
        this.f41113m = interfaceC10672v;
    }

    /* renamed from: Z0 */
    public final void m37998Z0(C10674x... c10674xArr) {
        C9801m.m32346f(c10674xArr, "descriptors");
        m37995W0(C10803n.m38746Z(c10674xArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        return InterfaceC10592g0.a.m37690b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: e0 */
    public boolean mo37020e0(InterfaceC10592g0 interfaceC10592g0) {
        C9801m.m32346f(interfaceC10592g0, "targetModule");
        if (C9801m.m32341a(this, interfaceC10592g0)) {
            return true;
        }
        InterfaceC10672v interfaceC10672v = this.f41113m;
        C9801m.m32343c(interfaceC10672v);
        return C10782c0.m38577K(interfaceC10672v.mo37980b(), interfaceC10592g0) || mo37023t0().contains(interfaceC10592g0) || interfaceC10592g0.mo37023t0().contains(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: o */
    public AbstractC9914h mo37021o() {
        return this.f41109i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: p */
    public Collection<C10160c> mo37022p(C10160c c10160c, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(function1, "nameFilter");
        m37991P0();
        return m37992R0().mo33280p(c10160c, function1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0
    /* renamed from: t0 */
    public List<InterfaceC10592g0> mo37023t0() {
        InterfaceC10672v interfaceC10672v = this.f41113m;
        if (interfaceC10672v != null) {
            return interfaceC10672v.mo37981c();
        }
        throw new AssertionError("Dependencies of module " + m37988Q0() + " were not set");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10674x(C10163f c10163f, InterfaceC10330n interfaceC10330n, AbstractC9914h abstractC9914h, C10169a c10169a, Map<C10589f0<?>, ? extends Object> map, C10163f c10163f2) {
        super(InterfaceC10620g.f40808c.m37735b(), c10163f);
        C9801m.m32346f(c10163f, "moduleName");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(abstractC9914h, "builtIns");
        C9801m.m32346f(map, "capabilities");
        this.f41108h = interfaceC10330n;
        this.f41109i = abstractC9914h;
        this.f41110j = c10163f2;
        if (c10163f.m35458y()) {
            this.f41111k = map;
            InterfaceC10638a0 interfaceC10638a0 = (InterfaceC10638a0) mo37016I0(InterfaceC10638a0.f40902a.m37759a());
            this.f41112l = interfaceC10638a0 == null ? InterfaceC10638a0.b.f40905b : interfaceC10638a0;
            this.f41115o = true;
            this.f41116p = interfaceC10330n.mo36520h(new b());
            this.f41117q = C10550i.m37594b(new a());
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + c10163f);
    }
}
