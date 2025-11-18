package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10727s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10729t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9914h;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p383k0.InterfaceC9977c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10368m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.C10410u;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.g0 */
/* loaded from: classes2.dex */
public final class C9957g0 {

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$a */
    static final class a extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final a f37862f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(C9960i.f37892a.m33142b(C10235a.m36081o(interfaceC10576b)));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$b */
    static final class b extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final b f37863f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(C9952e.f37846n.m33076j((InterfaceC10739y0) interfaceC10576b));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.g0$c */
    static final class c extends Lambda implements Function1<InterfaceC10576b, Boolean> {

        /* renamed from: f */
        public static final c f37864f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10576b interfaceC10576b) {
            C9801m.m32346f(interfaceC10576b, "it");
            return Boolean.valueOf(AbstractC9914h.m32743f0(interfaceC10576b) && C9954f.m33088m(interfaceC10576b) != null);
        }
    }

    /* renamed from: a */
    public static final boolean m33100a(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "<this>");
        return m33103d(interfaceC10576b) != null;
    }

    /* renamed from: b */
    public static final String m33101b(InterfaceC10576b interfaceC10576b) {
        InterfaceC10576b interfaceC10576bM36081o;
        C10163f c10163fM33075i;
        C9801m.m32346f(interfaceC10576b, "callableMemberDescriptor");
        InterfaceC10576b interfaceC10576bM33102c = m33102c(interfaceC10576b);
        if (interfaceC10576bM33102c == null || (interfaceC10576bM36081o = C10235a.m36081o(interfaceC10576bM33102c)) == null) {
            return null;
        }
        if (interfaceC10576bM36081o instanceof InterfaceC10729t0) {
            return C9960i.f37892a.m33141a(interfaceC10576bM36081o);
        }
        if (!(interfaceC10576bM36081o instanceof InterfaceC10739y0) || (c10163fM33075i = C9952e.f37846n.m33075i((InterfaceC10739y0) interfaceC10576bM36081o)) == null) {
            return null;
        }
        return c10163fM33075i.m35455k();
    }

    /* renamed from: c */
    private static final InterfaceC10576b m33102c(InterfaceC10576b interfaceC10576b) {
        if (AbstractC9914h.m32743f0(interfaceC10576b)) {
            return m33103d(interfaceC10576b);
        }
        return null;
    }

    /* renamed from: d */
    public static final <T extends InterfaceC10576b> T m33103d(T t) {
        C9801m.m32346f(t, "<this>");
        if (!C9959h0.f37865a.m33130g().contains(t.getName()) && !C9956g.f37857a.m33099d().contains(C10235a.m36081o(t).getName())) {
            return null;
        }
        if (t instanceof InterfaceC10729t0 ? true : t instanceof InterfaceC10727s0) {
            return (T) C10235a.m36069c(t, false, a.f37862f, 1, null);
        }
        if (t instanceof InterfaceC10739y0) {
            return (T) C10235a.m36069c(t, false, b.f37863f, 1, null);
        }
        return null;
    }

    /* renamed from: e */
    public static final <T extends InterfaceC10576b> T m33104e(T t) {
        C9801m.m32346f(t, "<this>");
        T t2 = (T) m33103d(t);
        if (t2 != null) {
            return t2;
        }
        C9954f c9954f = C9954f.f37848n;
        C10163f name = t.getName();
        C9801m.m32345e(name, "name");
        if (c9954f.m33089l(name)) {
            return (T) C10235a.m36069c(t, false, c.f37864f, 1, null);
        }
        return null;
    }

    /* renamed from: f */
    public static final boolean m33105f(InterfaceC10585e interfaceC10585e, InterfaceC10573a interfaceC10573a) {
        C9801m.m32346f(interfaceC10585e, "<this>");
        C9801m.m32346f(interfaceC10573a, "specialCallableDescriptor");
        InterfaceC10609m interfaceC10609mMo32876b = interfaceC10573a.mo32876b();
        C9801m.m32344d(interfaceC10609mMo32876b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        AbstractC10368m0 abstractC10368m0Mo36400s = ((InterfaceC10585e) interfaceC10609mMo32876b).mo36400s();
        C9801m.m32345e(abstractC10368m0Mo36400s, "specialCallableDescripto…ssDescriptor).defaultType");
        InterfaceC10585e interfaceC10585eM35831s = C10187d.m35831s(interfaceC10585e);
        while (true) {
            if (interfaceC10585eM35831s == null) {
                return false;
            }
            if (!(interfaceC10585eM35831s instanceof InterfaceC9977c)) {
                if (C10410u.m36964b(interfaceC10585eM35831s.mo36400s(), abstractC10368m0Mo36400s) != null) {
                    return !AbstractC9914h.m32743f0(interfaceC10585eM35831s);
                }
            }
            interfaceC10585eM35831s = C10187d.m35831s(interfaceC10585eM35831s);
        }
    }

    /* renamed from: g */
    public static final boolean m33106g(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "<this>");
        return C10235a.m36081o(interfaceC10576b).mo32876b() instanceof InterfaceC9977c;
    }

    /* renamed from: h */
    public static final boolean m33107h(InterfaceC10576b interfaceC10576b) {
        C9801m.m32346f(interfaceC10576b, "<this>");
        return m33106g(interfaceC10576b) || AbstractC9914h.m32743f0(interfaceC10576b);
    }
}
