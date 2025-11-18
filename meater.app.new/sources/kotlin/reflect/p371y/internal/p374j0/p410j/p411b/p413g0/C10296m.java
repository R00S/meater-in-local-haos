package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10815t;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10581c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10616c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10639b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10154f;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10269a0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10275d0;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10303m;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10314x;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: DeserializedTypeParameterDescriptor.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.m */
/* loaded from: classes3.dex */
public final class C10296m extends AbstractC10639b {

    /* renamed from: p */
    private final C10303m f39897p;

    /* renamed from: q */
    private final C10140s f39898q;

    /* renamed from: r */
    private final C10284a f39899r;

    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.g0.m$a */
    static final class a extends Lambda implements Function0<List<? extends InterfaceC10616c>> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC10616c> invoke() {
            return C10782c0.m38569E0(C10296m.this.f39897p.m36452c().m36419d().mo33870a(C10296m.this.m36403P0(), C10296m.this.f39897p.m36456g()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10296m(C10303m c10303m, C10140s c10140s, int i2) {
        C9801m.m32346f(c10303m, "c");
        C9801m.m32346f(c10140s, "proto");
        InterfaceC10330n interfaceC10330nM36457h = c10303m.m36457h();
        InterfaceC10609m interfaceC10609mM36454e = c10303m.m36454e();
        InterfaceC10620g interfaceC10620gM37735b = InterfaceC10620g.f40808c.m37735b();
        C10163f c10163fM36495b = C10314x.m36495b(c10303m.m36456g(), c10140s.m35187N());
        C10269a0 c10269a0 = C10269a0.f39714a;
        C10140s.c cVarM35193T = c10140s.m35193T();
        C9801m.m32345e(cVarM35193T, "proto.variance");
        super(interfaceC10330nM36457h, interfaceC10609mM36454e, interfaceC10620gM37735b, c10163fM36495b, c10269a0.m36207d(cVarM35193T), c10140s.m35188O(), i2, InterfaceC10741z0.f41247a, InterfaceC10581c1.a.f40737a);
        this.f39897p = c10303m;
        this.f39898q = c10140s;
        this.f39899r = new C10284a(c10303m.m36457h(), new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: M0 */
    protected List<AbstractC10344e0> mo33498M0() {
        List<C10138q> listM35397p = C10154f.m35397p(this.f39898q, this.f39897p.m36459j());
        if (listM35397p.isEmpty()) {
            return C10815t.m38883e(C10235a.m36072f(this).m32805y());
        }
        C10275d0 c10275d0M36458i = this.f39897p.m36458i();
        ArrayList arrayList = new ArrayList(C10819v.m38911u(listM35397p, 10));
        Iterator<T> it = listM35397p.iterator();
        while (it.hasNext()) {
            arrayList.add(c10275d0M36458i.m36231q((C10138q) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10615b, kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public C10284a getAnnotations() {
        return this.f39899r;
    }

    /* renamed from: P0 */
    public final C10140s m36403P0() {
        return this.f39898q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10645e
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public Void mo33497L0(AbstractC10344e0 abstractC10344e0) {
        C9801m.m32346f(abstractC10344e0, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
