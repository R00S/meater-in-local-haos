package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Collection;
import kotlin.collections.C10813s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10580c0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10587e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10193j;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10345e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10396g;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* renamed from: kotlin.f0.y.e.j0.i.b */
/* loaded from: classes3.dex */
public final class C10185b {

    /* renamed from: a */
    public static final C10185b f39498a = new C10185b();

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$a */
    static final class a extends Lambda implements Function2<InterfaceC10609m, InterfaceC10609m, Boolean> {

        /* renamed from: f */
        public static final a f39499f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
            return Boolean.FALSE;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$b */
    static final class b implements InterfaceC10394e.a {

        /* renamed from: a */
        final /* synthetic */ boolean f39500a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC10573a f39501b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC10573a f39502c;

        /* compiled from: DescriptorEquivalenceForOverrides.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.b$b$a */
        static final class a extends Lambda implements Function2<InterfaceC10609m, InterfaceC10609m, Boolean> {

            /* renamed from: f */
            final /* synthetic */ InterfaceC10573a f39503f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10573a f39504g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
                super(2);
                this.f39503f = interfaceC10573a;
                this.f39504g = interfaceC10573a2;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
                return Boolean.valueOf(C9801m.m32341a(interfaceC10609m, this.f39503f) && C9801m.m32341a(interfaceC10609m2, this.f39504g));
            }
        }

        b(boolean z, InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2) {
            this.f39500a = z;
            this.f39501b = interfaceC10573a;
            this.f39502c = interfaceC10573a2;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10394e.a
        /* renamed from: a */
        public final boolean mo35780a(InterfaceC10345e1 interfaceC10345e1, InterfaceC10345e1 interfaceC10345e12) {
            C9801m.m32346f(interfaceC10345e1, "c1");
            C9801m.m32346f(interfaceC10345e12, "c2");
            if (C9801m.m32341a(interfaceC10345e1, interfaceC10345e12)) {
                return true;
            }
            InterfaceC10594h interfaceC10594hMo32887c = interfaceC10345e1.mo32891w();
            InterfaceC10594h interfaceC10594hMo32887c2 = interfaceC10345e12.mo32891w();
            if ((interfaceC10594hMo32887c instanceof InterfaceC10587e1) && (interfaceC10594hMo32887c2 instanceof InterfaceC10587e1)) {
                return C10185b.f39498a.m35778g((InterfaceC10587e1) interfaceC10594hMo32887c, (InterfaceC10587e1) interfaceC10594hMo32887c2, this.f39500a, new a(this.f39501b, this.f39502c));
            }
            return false;
        }
    }

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.b$c */
    static final class c extends Lambda implements Function2<InterfaceC10609m, InterfaceC10609m, Boolean> {

        /* renamed from: f */
        public static final c f39505f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2) {
            return Boolean.FALSE;
        }
    }

    private C10185b() {
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m35769b(C10185b c10185b, InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, boolean z, boolean z2, boolean z3, AbstractC10396g abstractC10396g, int i2, Object obj) {
        return c10185b.m35775a(interfaceC10573a, interfaceC10573a2, z, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? false : z3, abstractC10396g);
    }

    /* renamed from: c */
    private final boolean m35770c(InterfaceC10585e interfaceC10585e, InterfaceC10585e interfaceC10585e2) {
        return C9801m.m32341a(interfaceC10585e.mo32877h(), interfaceC10585e2.mo32877h());
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m35771e(C10185b c10185b, InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        return c10185b.m35776d(interfaceC10609m, interfaceC10609m2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public static /* synthetic */ boolean m35772h(C10185b c10185b, InterfaceC10587e1 interfaceC10587e1, InterfaceC10587e1 interfaceC10587e12, boolean z, Function2 function2, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function2 = c.f39505f;
        }
        return c10185b.m35778g(interfaceC10587e1, interfaceC10587e12, z, function2);
    }

    /* renamed from: i */
    private final boolean m35773i(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2, Function2<? super InterfaceC10609m, ? super InterfaceC10609m, Boolean> function2, boolean z) {
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10609m.mo32876b();
        InterfaceC10609m interfaceC10609mMo32876b2 = interfaceC10609m2.mo32876b();
        return ((interfaceC10609mMo32876b instanceof InterfaceC10576b) || (interfaceC10609mMo32876b2 instanceof InterfaceC10576b)) ? function2.invoke(interfaceC10609mMo32876b, interfaceC10609mMo32876b2).booleanValue() : m35771e(this, interfaceC10609mMo32876b, interfaceC10609mMo32876b2, z, false, 8, null);
    }

    /* renamed from: j */
    private final InterfaceC10741z0 m35774j(InterfaceC10573a interfaceC10573a) {
        while (interfaceC10573a instanceof InterfaceC10576b) {
            InterfaceC10576b interfaceC10576b = (InterfaceC10576b) interfaceC10573a;
            if (interfaceC10576b.mo37030i() != InterfaceC10576b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends InterfaceC10576b> collectionMo37027e = interfaceC10576b.mo37027e();
            C9801m.m32345e(collectionMo37027e, "overriddenDescriptors");
            interfaceC10573a = (InterfaceC10576b) C10813s.m38868t0(collectionMo37027e);
            if (interfaceC10573a == null) {
                return null;
            }
        }
        return interfaceC10573a.mo32883t();
    }

    /* renamed from: a */
    public final boolean m35775a(InterfaceC10573a interfaceC10573a, InterfaceC10573a interfaceC10573a2, boolean z, boolean z2, boolean z3, AbstractC10396g abstractC10396g) {
        C9801m.m32346f(interfaceC10573a, "a");
        C9801m.m32346f(interfaceC10573a2, "b");
        C9801m.m32346f(abstractC10396g, "kotlinTypeRefiner");
        if (C9801m.m32341a(interfaceC10573a, interfaceC10573a2)) {
            return true;
        }
        if (!C9801m.m32341a(interfaceC10573a.getName(), interfaceC10573a2.getName())) {
            return false;
        }
        if (z2 && (interfaceC10573a instanceof InterfaceC10580c0) && (interfaceC10573a2 instanceof InterfaceC10580c0) && ((InterfaceC10580c0) interfaceC10573a).mo32863M() != ((InterfaceC10580c0) interfaceC10573a2).mo32863M()) {
            return false;
        }
        if ((C9801m.m32341a(interfaceC10573a.mo32876b(), interfaceC10573a2.mo32876b()) && (!z || !C9801m.m32341a(m35774j(interfaceC10573a), m35774j(interfaceC10573a2)))) || C10187d.m35804E(interfaceC10573a) || C10187d.m35804E(interfaceC10573a2) || !m35773i(interfaceC10573a, interfaceC10573a2, a.f39499f, z)) {
            return false;
        }
        C10193j c10193jM35866i = C10193j.m35866i(abstractC10396g, new b(z, interfaceC10573a, interfaceC10573a2));
        C9801m.m32345e(c10193jM35866i, "a: CallableDescriptor,\n …= a && y == b }\n        }");
        C10193j.i.a aVarM35898c = c10193jM35866i.m35884E(interfaceC10573a, interfaceC10573a2, null, !z3).m35898c();
        C10193j.i.a aVar = C10193j.i.a.OVERRIDABLE;
        return aVarM35898c == aVar && c10193jM35866i.m35884E(interfaceC10573a2, interfaceC10573a, null, z3 ^ true).m35898c() == aVar;
    }

    /* renamed from: d */
    public final boolean m35776d(InterfaceC10609m interfaceC10609m, InterfaceC10609m interfaceC10609m2, boolean z, boolean z2) {
        return ((interfaceC10609m instanceof InterfaceC10585e) && (interfaceC10609m2 instanceof InterfaceC10585e)) ? m35770c((InterfaceC10585e) interfaceC10609m, (InterfaceC10585e) interfaceC10609m2) : ((interfaceC10609m instanceof InterfaceC10587e1) && (interfaceC10609m2 instanceof InterfaceC10587e1)) ? m35772h(this, (InterfaceC10587e1) interfaceC10609m, (InterfaceC10587e1) interfaceC10609m2, z, null, 8, null) : ((interfaceC10609m instanceof InterfaceC10573a) && (interfaceC10609m2 instanceof InterfaceC10573a)) ? m35769b(this, (InterfaceC10573a) interfaceC10609m, (InterfaceC10573a) interfaceC10609m2, z, z2, false, AbstractC10396g.a.f40183a, 16, null) : ((interfaceC10609m instanceof InterfaceC10604k0) && (interfaceC10609m2 instanceof InterfaceC10604k0)) ? C9801m.m32341a(((InterfaceC10604k0) interfaceC10609m).mo37712d(), ((InterfaceC10604k0) interfaceC10609m2).mo37712d()) : C9801m.m32341a(interfaceC10609m, interfaceC10609m2);
    }

    /* renamed from: f */
    public final boolean m35777f(InterfaceC10587e1 interfaceC10587e1, InterfaceC10587e1 interfaceC10587e12, boolean z) {
        C9801m.m32346f(interfaceC10587e1, "a");
        C9801m.m32346f(interfaceC10587e12, "b");
        return m35772h(this, interfaceC10587e1, interfaceC10587e12, z, null, 8, null);
    }

    /* renamed from: g */
    public final boolean m35778g(InterfaceC10587e1 interfaceC10587e1, InterfaceC10587e1 interfaceC10587e12, boolean z, Function2<? super InterfaceC10609m, ? super InterfaceC10609m, Boolean> function2) {
        C9801m.m32346f(interfaceC10587e1, "a");
        C9801m.m32346f(interfaceC10587e12, "b");
        C9801m.m32346f(function2, "equivalentCallables");
        if (C9801m.m32341a(interfaceC10587e1, interfaceC10587e12)) {
            return true;
        }
        return !C9801m.m32341a(interfaceC10587e1.mo32876b(), interfaceC10587e12.mo32876b()) && m35773i(interfaceC10587e1, interfaceC10587e12, function2, z) && interfaceC10587e1.mo37670g() == interfaceC10587e12.mo37670g();
    }
}
