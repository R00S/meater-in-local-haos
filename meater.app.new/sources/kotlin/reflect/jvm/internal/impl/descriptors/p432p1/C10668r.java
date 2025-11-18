package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.C9819y;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.C10613n0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10245b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10250g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10251h;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10329m;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10325i;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: LazyPackageViewDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r */
/* loaded from: classes2.dex */
public class C10668r extends AbstractC10655j implements InterfaceC10636p0 {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f41086h = {C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10668r.class), "fragments", "getFragments()Ljava/util/List;")), C9790g0.m32304h(new C9819y(C9790g0.m32298b(C10668r.class), "empty", "getEmpty()Z"))};

    /* renamed from: i */
    private final C10674x f41087i;

    /* renamed from: j */
    private final C10160c f41088j;

    /* renamed from: k */
    private final InterfaceC10325i f41089k;

    /* renamed from: l */
    private final InterfaceC10325i f41090l;

    /* renamed from: m */
    private final InterfaceC10251h f41091m;

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$a */
    static final class a extends Lambda implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C10613n0.m37724b(C10668r.this.mo37752v0().m37992R0(), C10668r.this.mo37750d()));
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$b */
    static final class b extends Lambda implements Function0<List<? extends InterfaceC10604k0>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10604k0> invoke() {
            return C10613n0.m37725c(C10668r.this.mo37752v0().m37992R0(), C10668r.this.mo37750d());
        }
    }

    /* compiled from: LazyPackageViewDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.r$c */
    static final class c extends Lambda implements Function0<InterfaceC10251h> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10251h invoke() {
            if (C10668r.this.isEmpty()) {
                return InterfaceC10251h.b.f39671b;
            }
            List<InterfaceC10604k0> listMo37749I = C10668r.this.mo37749I();
            ArrayList arrayList = new ArrayList(C10819v.m38911u(listMo37749I, 10));
            Iterator<T> it = listMo37749I.iterator();
            while (it.hasNext()) {
                arrayList.add(((InterfaceC10604k0) it.next()).mo32988q());
            }
            List listM38610p0 = C10782c0.m38610p0(arrayList, new C10652h0(C10668r.this.mo37752v0(), C10668r.this.mo37750d()));
            return C10245b.f39624b.m36124a("package view scope for " + C10668r.this.mo37750d() + " in " + C10668r.this.mo37752v0().getName(), listM38610p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10668r(C10674x c10674x, C10160c c10160c, InterfaceC10330n interfaceC10330n) {
        super(InterfaceC10620g.f40808c.m37735b(), c10160c.m35426h());
        C9801m.m32346f(c10674x, "module");
        C9801m.m32346f(c10160c, "fqName");
        C9801m.m32346f(interfaceC10330n, "storageManager");
        this.f41087i = c10674x;
        this.f41088j = c10160c;
        this.f41089k = interfaceC10330n.mo36516d(new b());
        this.f41090l = interfaceC10330n.mo36516d(new a());
        this.f41091m = new C10250g(interfaceC10330n, new c());
    }

    /* renamed from: A0 */
    protected final boolean m37963A0() {
        return ((Boolean) C10329m.m36555a(this.f41090l, this, f41086h[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0
    /* renamed from: I */
    public List<InterfaceC10604k0> mo37749I() {
        return (List) C10329m.m36555a(this.f41089k, this, f41086h[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10636p0 mo32876b() {
        if (mo37750d().m35422d()) {
            return null;
        }
        C10674x c10674xMo37752v0 = mo37752v0();
        C10160c c10160cM35423e = mo37750d().m35423e();
        C9801m.m32345e(c10160cM35423e, "fqName.parent()");
        return c10674xMo37752v0.mo37018N(c10160cM35423e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        C9801m.m32346f(interfaceC10628o, "visitor");
        return interfaceC10628o.mo35676c(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C10674x mo37752v0() {
        return this.f41087i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0
    /* renamed from: d */
    public C10160c mo37750d() {
        return this.f41088j;
    }

    public boolean equals(Object obj) {
        InterfaceC10636p0 interfaceC10636p0 = obj instanceof InterfaceC10636p0 ? (InterfaceC10636p0) obj : null;
        return interfaceC10636p0 != null && C9801m.m32341a(mo37750d(), interfaceC10636p0.mo37750d()) && C9801m.m32341a(mo37752v0(), interfaceC10636p0.mo37752v0());
    }

    public int hashCode() {
        return (mo37752v0().hashCode() * 31) + mo37750d().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0
    public boolean isEmpty() {
        return m37963A0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10636p0
    /* renamed from: q */
    public InterfaceC10251h mo37751q() {
        return this.f41091m;
    }
}
