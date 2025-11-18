package kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10384r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10351g1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10399j;

/* compiled from: CapturedTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.q.a.c */
/* loaded from: classes3.dex */
public final class C10202c implements InterfaceC10201b {

    /* renamed from: a */
    private final InterfaceC10351g1 f39552a;

    /* renamed from: b */
    private C10399j f39553b;

    public C10202c(InterfaceC10351g1 interfaceC10351g1) {
        C9801m.m32346f(interfaceC10351g1, "projection");
        this.f39552a = interfaceC10351g1;
        mo35997f().mo36708a();
        EnumC10384r1 enumC10384r1 = EnumC10384r1.INVARIANT;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: a */
    public Collection<AbstractC10344e0> mo35998a() {
        AbstractC10344e0 type = mo35997f().mo36708a() == EnumC10384r1.OUT_VARIANCE ? mo35997f().getType() : mo36004o().m32774I();
        C9801m.m32345e(type, "if (projection.projectio… builtIns.nullableAnyType");
        return C10815t.m38883e(type);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC10594h mo32891w() {
        return (InterfaceC10594h) m36000g();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p401q.p402a.InterfaceC10201b
    /* renamed from: f */
    public InterfaceC10351g1 mo35997f() {
        return this.f39552a;
    }

    /* renamed from: g */
    public Void m36000g() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    /* renamed from: h */
    public final C10399j m36001h() {
        return this.f39553b;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C10202c mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        InterfaceC10351g1 interfaceC10351g1Mo36709b = mo35997f().mo36709b(abstractC10396g);
        C9801m.m32345e(interfaceC10351g1Mo36709b, "projection.refine(kotlinTypeRefiner)");
        return new C10202c(interfaceC10351g1Mo36709b);
    }

    /* renamed from: j */
    public final void m36003j(C10399j c10399j) {
        this.f39553b = c10399j;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        AbstractC9914h abstractC9914hMo36004o = mo35997f().getType().mo35993O0().mo36004o();
        C9801m.m32345e(abstractC9914hMo36004o, "projection.type.constructor.builtIns");
        return abstractC9914hMo36004o;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo35997f() + ')';
    }
}
