package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10599i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9959h0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.C9979e;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9977c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10096l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10106v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p420x1.C10457a;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.s */
/* loaded from: classes2.dex */
public final class C10073s implements InterfaceC10188e {

    /* renamed from: a */
    public static final a f38306a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: b */
        private final boolean m33800b(InterfaceC10738y interfaceC10738y) {
            if (interfaceC10738y.mo37028f().size() != 1) {
                return false;
            }
            InterfaceC10609m interfaceC10609mMo32876b = interfaceC10738y.mo32876b();
            InterfaceC10585e interfaceC10585e = interfaceC10609mMo32876b instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10609mMo32876b : null;
            if (interfaceC10585e == null) {
                return false;
            }
            List<InterfaceC10599i1> listMo37028f = interfaceC10738y.mo37028f();
            C9801m.m32345e(listMo37028f, "f.valueParameters");
            InterfaceC10594h interfaceC10594hMo32891w = ((InterfaceC10599i1) C10813s.m38866s0(listMo37028f)).getType().mo35993O0().mo32891w();
            InterfaceC10585e interfaceC10585e2 = interfaceC10594hMo32891w instanceof InterfaceC10585e ? (InterfaceC10585e) interfaceC10594hMo32891w : null;
            return interfaceC10585e2 != null && AbstractC9914h.m32756q0(interfaceC10585e) && C9801m.m32341a(C10235a.m36074h(interfaceC10585e), C10235a.m36074h(interfaceC10585e2));
        }

        /* renamed from: c */
        private final AbstractC10096l m33801c(InterfaceC10738y interfaceC10738y, InterfaceC10599i1 interfaceC10599i1) {
            if (C10106v.m34041e(interfaceC10738y) || m33800b(interfaceC10738y)) {
                AbstractC10344e0 type = interfaceC10599i1.getType();
                C9801m.m32345e(type, "valueParameterDescriptor.type");
                return C10106v.m34043g(C10457a.m37154t(type));
            }
            AbstractC10344e0 type2 = interfaceC10599i1.getType();
            C9801m.m32345e(type2, "valueParameterDescriptor.type");
            return C10106v.m34043g(type2);
        }

        /* renamed from: a */
        public final boolean m33802a(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
            C9801m.m32346f(interfaceC10573a, "superDescriptor");
            C9801m.m32346f(interfaceC10573a2, "subDescriptor");
            if ((interfaceC10573a2 instanceof C9979e) && (interfaceC10573a instanceof InterfaceC10738y)) {
                C9979e c9979e = (C9979e) interfaceC10573a2;
                c9979e.mo37028f().size();
                InterfaceC10738y interfaceC10738y = (InterfaceC10738y) interfaceC10573a;
                interfaceC10738y.mo37028f().size();
                List<InterfaceC10599i1> listMo37028f = c9979e.mo37019a().mo37028f();
                C9801m.m32345e(listMo37028f, "subDescriptor.original.valueParameters");
                List<InterfaceC10599i1> listMo37028f2 = interfaceC10738y.mo37019a().mo37028f();
                C9801m.m32345e(listMo37028f2, "superDescriptor.original.valueParameters");
                for (Pair pair : C10782c0.m38580L0(listMo37028f, listMo37028f2)) {
                    InterfaceC10599i1 interfaceC10599i1 = (InterfaceC10599i1) pair.m37646a();
                    InterfaceC10599i1 interfaceC10599i12 = (InterfaceC10599i1) pair.m37647b();
                    C9801m.m32345e(interfaceC10599i1, "subParameter");
                    boolean z = m33801c((InterfaceC10738y) interfaceC10573a2, interfaceC10599i1) instanceof AbstractC10096l.d;
                    C9801m.m32345e(interfaceC10599i12, "superParameter");
                    if (z != (m33801c(interfaceC10738y, interfaceC10599i12) instanceof AbstractC10096l.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m33799c(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e) {
        if ((interfaceC10573a instanceof InterfaceC10576b) && (interfaceC10573a2 instanceof InterfaceC10738y) && !AbstractC9914h.m32743f0(interfaceC10573a2)) {
            C9954f c9954f = C9954f.f37848n;
            InterfaceC10738y interfaceC10738y = (InterfaceC10738y) interfaceC10573a2;
            C10163f name = interfaceC10738y.getName();
            C9801m.m32345e(name, "subDescriptor.name");
            if (!c9954f.m33089l(name)) {
                C9959h0.a aVar = C9959h0.f37865a;
                C10163f name2 = interfaceC10738y.getName();
                C9801m.m32345e(name2, "subDescriptor.name");
                if (!aVar.m33134k(name2)) {
                    return false;
                }
            }
            InterfaceC10576b interfaceC10576bM33104e = C9957g0.m33104e((InterfaceC10576b) interfaceC10573a);
            boolean z = interfaceC10573a instanceof InterfaceC10738y;
            InterfaceC10738y interfaceC10738y2 = z ? (InterfaceC10738y) interfaceC10573a : null;
            if ((!(interfaceC10738y2 != null && interfaceC10738y.mo37775w0() == interfaceC10738y2.mo37775w0())) && (interfaceC10576bM33104e == null || !interfaceC10738y.mo37775w0())) {
                return true;
            }
            if ((interfaceC10585e instanceof InterfaceC9977c) && interfaceC10738y.mo37774d0() == null && interfaceC10576bM33104e != null && !C9957g0.m33105f(interfaceC10585e, interfaceC10576bM33104e)) {
                if ((interfaceC10576bM33104e instanceof InterfaceC10738y) && z && C9954f.m33087k((InterfaceC10738y) interfaceC10576bM33104e) != null) {
                    String strM34039c = C10106v.m34039c(interfaceC10738y, false, false, 2, null);
                    InterfaceC10738y interfaceC10738yMo37019a = ((InterfaceC10738y) interfaceC10573a).mo37019a();
                    C9801m.m32345e(interfaceC10738yMo37019a, "superDescriptor.original");
                    if (C9801m.m32341a(strM34039c, C10106v.m34039c(interfaceC10738yMo37019a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: a */
    public InterfaceC10188e.a mo33227a() {
        return InterfaceC10188e.a.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.InterfaceC10188e
    /* renamed from: b */
    public InterfaceC10188e.b mo33228b(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(interfaceC10573a, "superDescriptor");
        C9801m.m32346f(interfaceC10573a2, "subDescriptor");
        return m33799c(interfaceC10573a, interfaceC10573a2, interfaceC10585e) ? InterfaceC10188e.b.INCOMPATIBLE : f38306a.m33802a(interfaceC10573a, interfaceC10573a2) ? InterfaceC10188e.b.INCOMPATIBLE : InterfaceC10188e.b.UNKNOWN;
    }
}
