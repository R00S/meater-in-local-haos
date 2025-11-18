package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C10550i;
import kotlin.Lazy;
import kotlin.collections.C10819v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10730u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10628o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10211g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10366l1;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0 */
/* loaded from: classes2.dex */
public class C10660l0 extends AbstractC10662m0 implements InterfaceC10599i1 {

    /* renamed from: k */
    public static final a f41001k = new a(null);

    /* renamed from: l */
    private final int f41002l;

    /* renamed from: m */
    private final boolean f41003m;

    /* renamed from: n */
    private final boolean f41004n;

    /* renamed from: o */
    private final boolean f41005o;

    /* renamed from: p */
    private final AbstractC10344e0 f41006p;

    /* renamed from: q */
    private final InterfaceC10599i1 f41007q;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10660l0 m37887a(InterfaceC10573a interfaceC10573a, InterfaceC10599i1 interfaceC10599i1, int i2, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, boolean z, boolean z2, boolean z3, AbstractC10344e0 abstractC10344e02, InterfaceC10741z0 interfaceC10741z0, Function0<? extends List<? extends InterfaceC10602j1>> function0) {
            C9801m.m32346f(interfaceC10573a, "containingDeclaration");
            C9801m.m32346f(interfaceC10620g, "annotations");
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(abstractC10344e0, "outType");
            C9801m.m32346f(interfaceC10741z0, "source");
            return function0 == null ? new C10660l0(interfaceC10573a, interfaceC10599i1, i2, interfaceC10620g, c10163f, abstractC10344e0, z, z2, z3, abstractC10344e02, interfaceC10741z0) : new b(interfaceC10573a, interfaceC10599i1, i2, interfaceC10620g, c10163f, abstractC10344e0, z, z2, z3, abstractC10344e02, interfaceC10741z0, function0);
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$b */
    public static final class b extends C10660l0 {

        /* renamed from: r */
        private final Lazy f41008r;

        /* compiled from: ValueParameterDescriptorImpl.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.l0$b$a */
        static final class a extends Lambda implements Function0<List<? extends InterfaceC10602j1>> {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends InterfaceC10602j1> invoke() {
                return b.this.m37888O0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC10573a interfaceC10573a, InterfaceC10599i1 interfaceC10599i1, int i2, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, boolean z, boolean z2, boolean z3, AbstractC10344e0 abstractC10344e02, InterfaceC10741z0 interfaceC10741z0, Function0<? extends List<? extends InterfaceC10602j1>> function0) {
            super(interfaceC10573a, interfaceC10599i1, i2, interfaceC10620g, c10163f, abstractC10344e0, z, z2, z3, abstractC10344e02, interfaceC10741z0);
            C9801m.m32346f(interfaceC10573a, "containingDeclaration");
            C9801m.m32346f(interfaceC10620g, "annotations");
            C9801m.m32346f(c10163f, "name");
            C9801m.m32346f(abstractC10344e0, "outType");
            C9801m.m32346f(interfaceC10741z0, "source");
            C9801m.m32346f(function0, "destructuringVariables");
            this.f41008r = C10550i.m37594b(function0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10660l0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
        /* renamed from: G0 */
        public InterfaceC10599i1 mo37693G0(InterfaceC10573a interfaceC10573a, C10163f c10163f, int i2) {
            C9801m.m32346f(interfaceC10573a, "newOwner");
            C9801m.m32346f(c10163f, "newName");
            InterfaceC10620g annotations = getAnnotations();
            C9801m.m32345e(annotations, "annotations");
            AbstractC10344e0 type = getType();
            C9801m.m32345e(type, "type");
            boolean zMo37698u0 = mo37698u0();
            boolean zMo37695b0 = mo37695b0();
            boolean zMo37694Y = mo37694Y();
            AbstractC10344e0 abstractC10344e0Mo37697l0 = mo37697l0();
            InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
            C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
            return new b(interfaceC10573a, null, i2, annotations, c10163f, type, zMo37698u0, zMo37695b0, zMo37694Y, abstractC10344e0Mo37697l0, interfaceC10741z0, new a());
        }

        /* renamed from: O0 */
        public final List<InterfaceC10602j1> m37888O0() {
            return (List) this.f41008r.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10660l0(InterfaceC10573a interfaceC10573a, InterfaceC10599i1 interfaceC10599i1, int i2, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, boolean z, boolean z2, boolean z3, AbstractC10344e0 abstractC10344e02, InterfaceC10741z0 interfaceC10741z0) {
        super(interfaceC10573a, interfaceC10620g, c10163f, abstractC10344e0, interfaceC10741z0);
        C9801m.m32346f(interfaceC10573a, "containingDeclaration");
        C9801m.m32346f(interfaceC10620g, "annotations");
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(abstractC10344e0, "outType");
        C9801m.m32346f(interfaceC10741z0, "source");
        this.f41002l = i2;
        this.f41003m = z;
        this.f41004n = z2;
        this.f41005o = z3;
        this.f41006p = abstractC10344e02;
        this.f41007q = interfaceC10599i1 == null ? this : interfaceC10599i1;
    }

    /* renamed from: L0 */
    public static final C10660l0 m37884L0(InterfaceC10573a interfaceC10573a, InterfaceC10599i1 interfaceC10599i1, int i2, InterfaceC10620g interfaceC10620g, C10163f c10163f, AbstractC10344e0 abstractC10344e0, boolean z, boolean z2, boolean z3, AbstractC10344e0 abstractC10344e02, InterfaceC10741z0 interfaceC10741z0, Function0<? extends List<? extends InterfaceC10602j1>> function0) {
        return f41001k.m37887a(interfaceC10573a, interfaceC10599i1, i2, interfaceC10620g, c10163f, abstractC10344e0, z, z2, z3, abstractC10344e02, interfaceC10741z0, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: G0 */
    public InterfaceC10599i1 mo37693G0(InterfaceC10573a interfaceC10573a, C10163f c10163f, int i2) {
        C9801m.m32346f(interfaceC10573a, "newOwner");
        C9801m.m32346f(c10163f, "newName");
        InterfaceC10620g annotations = getAnnotations();
        C9801m.m32345e(annotations, "annotations");
        AbstractC10344e0 type = getType();
        C9801m.m32345e(type, "type");
        boolean zMo37698u0 = mo37698u0();
        boolean zMo37695b0 = mo37695b0();
        boolean zMo37694Y = mo37694Y();
        AbstractC10344e0 abstractC10344e0Mo37697l0 = mo37697l0();
        InterfaceC10741z0 interfaceC10741z0 = InterfaceC10741z0.f41247a;
        C9801m.m32345e(interfaceC10741z0, "NO_SOURCE");
        return new C10660l0(interfaceC10573a, null, i2, annotations, c10163f, type, zMo37698u0, zMo37695b0, zMo37694Y, abstractC10344e0Mo37697l0, interfaceC10741z0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10628o<R, D> interfaceC10628o, D d2) {
        C9801m.m32346f(interfaceC10628o, "visitor");
        return interfaceC10628o.mo35681k(this, d2);
    }

    /* renamed from: M0 */
    public Void m37885M0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10578b1
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public InterfaceC10599i1 mo36396c(C10366l1 c10366l1) {
        C9801m.m32346f(c10366l1, "substitutor");
        if (c10366l1.m36756k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: X */
    public /* bridge */ /* synthetic */ AbstractC10211g mo37026X() {
        return (AbstractC10211g) m37885M0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: Y */
    public boolean mo37694Y() {
        return this.f41005o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: b0 */
    public boolean mo37695b0() {
        return this.f41004n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a
    /* renamed from: e */
    public Collection<InterfaceC10599i1> mo37027e() {
        Collection<? extends InterfaceC10573a> collectionMo37027e = mo32876b().mo37027e();
        C9801m.m32345e(collectionMo37027e, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C10819v.m38911u(collectionMo37027e, 10));
        Iterator<T> it = collectionMo37027e.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC10573a) it.next()).mo37028f().get(mo37696g()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: g */
    public int mo37696g() {
        return this.f41002l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10677q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0
    public AbstractC10730u getVisibility() {
        AbstractC10730u abstractC10730u = C10728t.f41221f;
        C9801m.m32345e(abstractC10730u, "LOCAL");
        return abstractC10730u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602j1
    /* renamed from: j0 */
    public boolean mo37031j0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: l0 */
    public AbstractC10344e0 mo37697l0() {
        return this.f41006p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1
    /* renamed from: u0 */
    public boolean mo37698u0() {
        if (this.f41003m) {
            InterfaceC10573a interfaceC10573aMo32876b = mo32876b();
            C9801m.m32344d(interfaceC10573aMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((InterfaceC10576b) interfaceC10573aMo32876b).mo37030i().m37667g()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: b */
    public InterfaceC10573a mo32876b() {
        InterfaceC10609m interfaceC10609mMo32876b = super.mo32876b();
        C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (InterfaceC10573a) interfaceC10609mMo32876b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10657k, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10655j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m
    /* renamed from: a */
    public InterfaceC10599i1 mo37019a() {
        InterfaceC10599i1 interfaceC10599i1 = this.f41007q;
        return interfaceC10599i1 == this ? this : interfaceC10599i1.mo37019a();
    }
}
