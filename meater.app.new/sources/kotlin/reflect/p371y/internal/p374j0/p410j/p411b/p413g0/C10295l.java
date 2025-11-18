package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10590f1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643d;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.InterfaceC10654i0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10139r;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10350g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10363k1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;

/* compiled from: DeserializedMemberDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.l */
/* loaded from: classes3.dex */
public final class C10295l extends AbstractC10643d implements InterfaceC10290g {

    /* renamed from: m */
    private final InterfaceC10330n f39886m;

    /* renamed from: n */
    private final C10139r f39887n;

    /* renamed from: o */
    private final InterfaceC10151c f39888o;

    /* renamed from: p */
    private final C10155g f39889p;

    /* renamed from: q */
    private final C10156h f39890q;

    /* renamed from: r */
    private final InterfaceC10289f f39891r;

    /* renamed from: s */
    private Collection<? extends InterfaceC10654i0> f39892s;

    /* renamed from: t */
    private AbstractC10368m0 f39893t;

    /* renamed from: u */
    private AbstractC10368m0 f39894u;

    /* renamed from: v */
    private List<? extends InterfaceC10587e1> f39895v;

    /* renamed from: w */
    private AbstractC10368m0 f39896w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10295l(InterfaceC10330n interfaceC10330n, InterfaceC10609m interfaceC10609m, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10730u abstractC10730u, C10139r c10139r, InterfaceC10151c interfaceC10151c, C10155g c10155g, C10156h c10156h, InterfaceC10289f interfaceC10289f) {
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10609m, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(abstractC10730u, "visibility");
        C9801m.m32346f(c10139r, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(c10155g, "typeTable");
        C9801m.m32346f(c10156h, "versionRequirementTable");
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
        super(interfaceC10609m, interfaceC10620g, c10163f, interfaceC10741z0, abstractC10730u);
        this.f39886m = interfaceC10330n;
        this.f39887n = c10139r;
        this.f39888o = interfaceC10151c;
        this.f39889p = c10155g;
        this.f39890q = c10156h;
        this.f39891r = interfaceC10289f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643d
    /* renamed from: N0 */
    protected List<InterfaceC10587e1> mo36390N0() {
        List list = this.f39895v;
        if (list != null) {
            return list;
        }
        C9801m.m32363w("typeConstructorParameters");
        return null;
    }

    /* renamed from: P0 */
    public C10139r m36391P0() {
        return this.f39887n;
    }

    /* renamed from: Q0 */
    public C10156h m36392Q0() {
        return this.f39890q;
    }

    /* renamed from: R0 */
    public final void m36393R0(List<? extends InterfaceC10587e1> list, AbstractC10368m0 abstractC10368m0, AbstractC10368m0 abstractC10368m02) {
        C9801m.m32346f(list, "declaredTypeParameters");
        C9801m.m32346f(abstractC10368m0, "underlyingType");
        C9801m.m32346f(abstractC10368m02, "expandedType");
        m37822O0(list);
        this.f39893t = abstractC10368m0;
        this.f39894u = abstractC10368m02;
        this.f39895v = C10590f1.m37685d(this);
        this.f39896w = m37819A0();
        this.f39892s = m37821M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10584d1 mo36396c(C10366l1 c10366l1) {
        C9801m.m32346f(c10366l1, "substitutor");
        if (c10366l1.m36756k()) {
            return this;
        }
        InterfaceC10330n interfaceC10330nMo36398h0 = mo36398h0();
        InterfaceC10609m interfaceC10609mMo32876b = mo32876b();
        C9801m.m32345e(interfaceC10609mMo32876b, "containingDeclaration");
        InterfaceC10620g annotations = getAnnotations();
        C9801m.m32345e(annotations, "annotations");
        C10163f name = getName();
        C9801m.m32345e(name, "name");
        C10295l c10295l = new C10295l(interfaceC10330nMo36398h0, interfaceC10609mMo32876b, annotations, name, getVisibility(), m36391P0(), mo36259Z(), mo36258T(), m36392Q0(), mo36260c0());
        List<InterfaceC10587e1> listMo32884w = mo32884w();
        AbstractC10368m0 abstractC10368m0Mo36397g0 = mo36397g0();
        EnumC10384r1 enumC10384r1 = EnumC10384r1.INVARIANT;
        AbstractC10344e0 abstractC10344e0M36758n = c10366l1.m36758n(abstractC10368m0Mo36397g0, enumC10384r1);
        C9801m.m32345e(abstractC10344e0M36758n, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        AbstractC10368m0 abstractC10368m0M36734a = C10363k1.m36734a(abstractC10344e0M36758n);
        AbstractC10344e0 abstractC10344e0M36758n2 = c10366l1.m36758n(mo36395W(), enumC10384r1);
        C9801m.m32345e(abstractC10344e0M36758n2, "substitutor.safeSubstitu…Type, Variance.INVARIANT)");
        c10295l.m36393R0(listMo32884w, abstractC10368m0M36734a, C10363k1.m36734a(abstractC10344e0M36758n2));
        return c10295l;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: T */
    public C10155g mo36258T() {
        return this.f39889p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1
    /* renamed from: W */
    public AbstractC10368m0 mo36395W() {
        AbstractC10368m0 abstractC10368m0 = this.f39894u;
        if (abstractC10368m0 != null) {
            return abstractC10368m0;
        }
        C9801m.m32363w("expandedType");
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: Z */
    public InterfaceC10151c mo36259Z() {
        return this.f39888o;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10290g
    /* renamed from: c0 */
    public InterfaceC10289f mo36260c0() {
        return this.f39891r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1
    /* renamed from: g0 */
    public AbstractC10368m0 mo36397g0() {
        AbstractC10368m0 abstractC10368m0 = this.f39893t;
        if (abstractC10368m0 != null) {
            return abstractC10368m0;
        }
        C9801m.m32363w("underlyingType");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643d
    /* renamed from: h0 */
    protected InterfaceC10330n mo36398h0() {
        return this.f39886m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10584d1
    /* renamed from: r */
    public InterfaceC10585e mo36399r() {
        if (C10350g0.m36706a(mo36395W())) {
            return null;
        }
        InterfaceC10594h interfaceC10594hMo32891w = mo36395W().mo35993O0().mo32891w();
        if (interfaceC10594hMo32891w instanceof InterfaceC10585e) {
            return (InterfaceC10585e) interfaceC10594hMo32891w;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h
    /* renamed from: s */
    public AbstractC10368m0 mo36400s() {
        AbstractC10368m0 abstractC10368m0 = this.f39896w;
        if (abstractC10368m0 != null) {
            return abstractC10368m0;
        }
        C9801m.m32363w("defaultTypeImpl");
        return null;
    }
}
