package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10728t;
import kotlin.reflect.jvm.internal.impl.descriptors.EnumC10583d0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10620g;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10650g0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10248e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: CloneableClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.a */
/* loaded from: classes2.dex */
public final class C9927a extends AbstractC10248e {

    /* renamed from: e */
    public static final a f37663e = new a(null);

    /* renamed from: f */
    private static final C10163f f37664f;

    /* compiled from: CloneableClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final C10163f m32912a() {
            return C9927a.f37664f;
        }
    }

    static {
        C10163f c10163fM35454x = C10163f.m35454x("clone");
        C9801m.m32345e(c10163fM35454x, "identifier(\"clone\")");
        f37664f = c10163fM35454x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9927a(InterfaceC10330n interfaceC10330n, InterfaceC10585e interfaceC10585e) {
        super(interfaceC10330n, interfaceC10585e);
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(interfaceC10585e, "containingClass");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10248e
    /* renamed from: i */
    protected List<InterfaceC10738y> mo32904i() {
        C10650g0 c10650g0M37848m1 = C10650g0.m37848m1(m36156l(), InterfaceC10620g.f40808c.m37735b(), f37664f, InterfaceC10576b.a.DECLARATION, InterfaceC10741z0.f41247a);
        c10650g0M37848m1.mo37850S0(null, m36156l().mo37677K0(), C10817u.m38888j(), C10817u.m38888j(), C10817u.m38888j(), C10235a.m36072f(m36156l()).m32791i(), EnumC10583d0.OPEN, C10728t.f41218c);
        return C10815t.m38883e(c10650g0M37848m1);
    }
}
