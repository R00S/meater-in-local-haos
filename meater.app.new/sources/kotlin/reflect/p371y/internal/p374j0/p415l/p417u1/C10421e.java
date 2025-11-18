package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10731u0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10733v0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10734w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10735w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10642c0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;

/* compiled from: ErrorPropertyDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.e */
/* loaded from: classes3.dex */
public final class C10421e implements InterfaceC10729t0 {

    /* renamed from: f */
    private final /* synthetic */ C10642c0 f40243f;

    public C10421e() {
        C10427k c10427k = C10427k.f40355a;
        C10642c0 c10642c0M37779P0 = C10642c0.m37779P0(c10427k.m37061h(), InterfaceC10620g.f40808c.m37735b(), EnumC10583d0.OPEN, C10728t.f41220e, true, C10163f.m35451D(EnumC10418b.ERROR_PROPERTY.m36988k()), InterfaceC10576b.a.DECLARATION, InterfaceC10741z0.f41247a, false, false, false, false, false, false);
        c10642c0M37779P0.m37794c1(c10427k.m37064k(), C10817u.m38888j(), null, null, C10817u.m38888j());
        this.f40243f = c10642c0M37779P0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: E0 */
    public boolean mo32859E0() {
        return this.f40243f.mo32859E0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: G */
    public boolean mo33204G() {
        return this.f40243f.mo33204G();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        return (R) this.f40243f.mo37017L(interfaceC10628o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: M */
    public boolean mo32863M() {
        return this.f40243f.mo32863M();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10605k1
    /* renamed from: O */
    public boolean mo37025O() {
        return this.f40243f.mo37025O();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: X */
    public AbstractC10211g<?> mo37026X() {
        return this.f40243f.mo37026X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10729t0 mo37019a() {
        return this.f40243f.mo37019a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10612n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10609m mo32876b() {
        return this.f40243f.mo32876b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: c */
    public InterfaceC10729t0 mo36396c(C10366l1 c10366l1) {
        C9801m.m32346f(c10366l1, "substitutor");
        return this.f40243f.mo36396c(c10366l1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<? extends InterfaceC10729t0> mo37027e() {
        return this.f40243f.mo37027e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f */
    public List<InterfaceC10599i1> mo37028f() {
        return this.f40243f.mo37028f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: f0 */
    public InterfaceC10735w0 mo37029f0() {
        return this.f40243f.mo37029f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        InterfaceC10620g annotations = this.f40243f.getAnnotations();
        C9801m.m32345e(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    public InterfaceC10731u0 getGetter() {
        return this.f40243f.getGetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10598i0
    public C10163f getName() {
        return this.f40243f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public AbstractC10344e0 getReturnType() {
        return this.f40243f.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    public InterfaceC10733v0 getSetter() {
        return this.f40243f.getSetter();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10596h1
    public AbstractC10344e0 getType() {
        return this.f40243f.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    public List<InterfaceC10587e1> getTypeParameters() {
        return this.f40243f.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        return this.f40243f.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: i */
    public InterfaceC10576b.a mo37030i() {
        return this.f40243f.mo37030i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: i0 */
    public <V> V mo33224i0(InterfaceC10573a.a<V> aVar) {
        return (V) this.f40243f.mo33224i0(aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    public boolean isConst() {
        return this.f40243f.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: j */
    public EnumC10583d0 mo32879j() {
        return this.f40243f.mo32879j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: j0 */
    public boolean mo37031j0() {
        return this.f40243f.mo37031j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: k0 */
    public InterfaceC10576b mo36990k0(InterfaceC10609m interfaceC10609m, EnumC10583d0 enumC10583d0, AbstractC10730u abstractC10730u, InterfaceC10576b.a aVar, boolean z) {
        return this.f40243f.mo36990k0(interfaceC10609m, enumC10583d0, abstractC10730u, aVar, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: m0 */
    public InterfaceC10735w0 mo37032m0() {
        return this.f40243f.mo37032m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: n0 */
    public InterfaceC10734w mo37033n0() {
        return this.f40243f.mo37033n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: q0 */
    public InterfaceC10734w mo37034q0() {
        return this.f40243f.mo37034q0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: r0 */
    public List<InterfaceC10735w0> mo37035r0() {
        return this.f40243f.mo37035r0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: s0 */
    public boolean mo37036s0() {
        return this.f40243f.mo37036s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10635p
    /* renamed from: t */
    public InterfaceC10741z0 mo32883t() {
        return this.f40243f.mo32883t();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0
    /* renamed from: x */
    public List<InterfaceC10727s0> mo37037x() {
        return this.f40243f.mo37037x();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b
    /* renamed from: x0 */
    public void mo36993x0(Collection<? extends InterfaceC10576b> collection) {
        C9801m.m32346f(collection, "overriddenDescriptors");
        this.f40243f.mo36993x0(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    /* renamed from: z */
    public boolean mo32885z() {
        return this.f40243f.mo32885z();
    }
}
