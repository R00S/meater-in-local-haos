package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10139r;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10142u;

/* compiled from: protoTypeTableUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.e.z.f */
/* loaded from: classes3.dex */
public final class C10154f {
    /* renamed from: a */
    public static final C10138q m35382a(C10138q c10138q, C10155g c10155g) {
        C9801m.m32346f(c10138q, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10138q.m35045k0()) {
            return c10138q.m35028R();
        }
        if (c10138q.m35046l0()) {
            return c10155g.m35399a(c10138q.m35029S());
        }
        return null;
    }

    /* renamed from: b */
    public static final C10138q m35383b(C10139r c10139r, C10155g c10155g) {
        C9801m.m32346f(c10139r, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10139r.m35145e0()) {
            C10138q c10138qM35135T = c10139r.m35135T();
            C9801m.m32345e(c10138qM35135T, "expandedType");
            return c10138qM35135T;
        }
        if (c10139r.m35146f0()) {
            return c10155g.m35399a(c10139r.m35136U());
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
    }

    /* renamed from: c */
    public static final C10138q m35384c(C10138q c10138q, C10155g c10155g) {
        C9801m.m32346f(c10138q, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10138q.m35050p0()) {
            return c10138q.m35037c0();
        }
        if (c10138q.m35051q0()) {
            return c10155g.m35399a(c10138q.m35038d0());
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m35385d(C10130i c10130i) {
        C9801m.m32346f(c10130i, "<this>");
        return c10130i.m34741w0() || c10130i.m34742x0();
    }

    /* renamed from: e */
    public static final boolean m35386e(C10135n c10135n) {
        C9801m.m32346f(c10135n, "<this>");
        return c10135n.m34903t0() || c10135n.m34904u0();
    }

    /* renamed from: f */
    public static final C10138q m35387f(C10124c c10124c, C10155g c10155g) {
        C9801m.m32346f(c10124c, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10124c.m34476p1()) {
            return c10124c.m34444K0();
        }
        if (c10124c.m34477q1()) {
            return c10155g.m35399a(c10124c.m34445L0());
        }
        return null;
    }

    /* renamed from: g */
    public static final C10138q m35388g(C10138q c10138q, C10155g c10155g) {
        C9801m.m32346f(c10138q, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10138q.m35053s0()) {
            return c10138q.m35040f0();
        }
        if (c10138q.m35054t0()) {
            return c10155g.m35399a(c10138q.m35041g0());
        }
        return null;
    }

    /* renamed from: h */
    public static final C10138q m35389h(C10130i c10130i, C10155g c10155g) {
        C9801m.m32346f(c10130i, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10130i.m34741w0()) {
            return c10130i.m34725g0();
        }
        if (c10130i.m34742x0()) {
            return c10155g.m35399a(c10130i.m34726h0());
        }
        return null;
    }

    /* renamed from: i */
    public static final C10138q m35390i(C10135n c10135n, C10155g c10155g) {
        C9801m.m32346f(c10135n, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10135n.m34903t0()) {
            return c10135n.m34889f0();
        }
        if (c10135n.m34904u0()) {
            return c10155g.m35399a(c10135n.m34890g0());
        }
        return null;
    }

    /* renamed from: j */
    public static final C10138q m35391j(C10130i c10130i, C10155g c10155g) {
        C9801m.m32346f(c10130i, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10130i.m34743y0()) {
            C10138q c10138qM34727i0 = c10130i.m34727i0();
            C9801m.m32345e(c10138qM34727i0, "returnType");
            return c10138qM34727i0;
        }
        if (c10130i.m34744z0()) {
            return c10155g.m35399a(c10130i.m34728j0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* renamed from: k */
    public static final C10138q m35392k(C10135n c10135n, C10155g c10155g) {
        C9801m.m32346f(c10135n, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10135n.m34905v0()) {
            C10138q c10138qM34891h0 = c10135n.m34891h0();
            C9801m.m32345e(c10138qM34891h0, "returnType");
            return c10138qM34891h0;
        }
        if (c10135n.m34906w0()) {
            return c10155g.m35399a(c10135n.m34892i0());
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* renamed from: l */
    public static final List<C10138q> m35393l(C10124c c10124c, C10155g c10155g) {
        C9801m.m32346f(c10124c, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        List<C10138q> listM34462b1 = c10124c.m34462b1();
        if (!(!listM34462b1.isEmpty())) {
            listM34462b1 = null;
        }
        if (listM34462b1 == null) {
            List<Integer> listM34460a1 = c10124c.m34460a1();
            C9801m.m32345e(listM34460a1, "supertypeIdList");
            listM34462b1 = new ArrayList<>(C10819v.m38911u(listM34460a1, 10));
            for (Integer num : listM34460a1) {
                C9801m.m32345e(num, "it");
                listM34462b1.add(c10155g.m35399a(num.intValue()));
            }
        }
        return listM34462b1;
    }

    /* renamed from: m */
    public static final C10138q m35394m(C10138q.b bVar, C10155g c10155g) {
        C9801m.m32346f(bVar, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (bVar.m35069B()) {
            return bVar.m35074y();
        }
        if (bVar.m35070C()) {
            return c10155g.m35399a(bVar.m35075z());
        }
        return null;
    }

    /* renamed from: n */
    public static final C10138q m35395n(C10142u c10142u, C10155g c10155g) {
        C9801m.m32346f(c10142u, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10142u.m35265S()) {
            C10138q c10138qM35259M = c10142u.m35259M();
            C9801m.m32345e(c10138qM35259M, "type");
            return c10138qM35259M;
        }
        if (c10142u.m35266T()) {
            return c10155g.m35399a(c10142u.m35260N());
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }

    /* renamed from: o */
    public static final C10138q m35396o(C10139r c10139r, C10155g c10155g) {
        C9801m.m32346f(c10139r, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10139r.m35149i0()) {
            C10138q c10138qM35142b0 = c10139r.m35142b0();
            C9801m.m32345e(c10138qM35142b0, "underlyingType");
            return c10138qM35142b0;
        }
        if (c10139r.m35150j0()) {
            return c10155g.m35399a(c10139r.m35143c0());
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
    }

    /* renamed from: p */
    public static final List<C10138q> m35397p(C10140s c10140s, C10155g c10155g) {
        C9801m.m32346f(c10140s, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        List<C10138q> listM35192S = c10140s.m35192S();
        if (!(!listM35192S.isEmpty())) {
            listM35192S = null;
        }
        if (listM35192S == null) {
            List<Integer> listM35191R = c10140s.m35191R();
            C9801m.m32345e(listM35191R, "upperBoundIdList");
            listM35192S = new ArrayList<>(C10819v.m38911u(listM35191R, 10));
            for (Integer num : listM35191R) {
                C9801m.m32345e(num, "it");
                listM35192S.add(c10155g.m35399a(num.intValue()));
            }
        }
        return listM35192S;
    }

    /* renamed from: q */
    public static final C10138q m35398q(C10142u c10142u, C10155g c10155g) {
        C9801m.m32346f(c10142u, "<this>");
        C9801m.m32346f(c10155g, "typeTable");
        if (c10142u.m35267U()) {
            return c10142u.m35261O();
        }
        if (c10142u.m35268V()) {
            return c10155g.m35399a(c10142u.m35262P());
        }
        return null;
    }
}
