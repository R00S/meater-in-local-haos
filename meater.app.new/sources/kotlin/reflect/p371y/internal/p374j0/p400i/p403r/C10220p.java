package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10592g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;

/* compiled from: IntegerValueTypeConstructor.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.p */
/* loaded from: classes3.dex */
public final class C10220p implements InterfaceC10345e1 {

    /* renamed from: a */
    private final long f39579a;

    /* renamed from: b */
    private final InterfaceC10592g0 f39580b;

    /* renamed from: c */
    private final ArrayList<AbstractC10344e0> f39581c;

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: a */
    public Collection<AbstractC10344e0> mo35998a() {
        return this.f39581c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: b */
    public InterfaceC10345e1 mo35999b(AbstractC10396g abstractC10396g) {
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC10594h mo32891w() {
        return (InterfaceC10594h) m36051g();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: e */
    public boolean mo32888e() {
        return false;
    }

    /* renamed from: g */
    public Void m36051g() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    public List<InterfaceC10587e1> getParameters() {
        return C10817u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1
    /* renamed from: o */
    public AbstractC9914h mo36004o() {
        return this.f39580b.mo37021o();
    }

    public String toString() {
        return "IntegerValueType(" + this.f39579a + ')';
    }
}
