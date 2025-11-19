package tb;

import Hb.C1085h;
import Hb.N;
import Hb.U;
import Hb.x0;
import Hb.y0;
import Ib.e;
import Ib.f;
import Ib.g;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.D;
import Ra.E;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1704q;
import Ra.InterfaceC1712z;
import Ra.Y;
import Ra.Z;
import Ra.c0;
import Ra.m0;
import Ra.t0;
import Ua.AbstractC1779s;
import Ua.J;
import Ua.K;
import com.apptionlabs.meater_app.data.Temperature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import oa.C4153F;
import oa.C4170o;
import tb.InterfaceC4598j;
import xb.C5087e;

/* compiled from: OverridingUtil.java */
/* renamed from: tb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4603o {

    /* renamed from: e, reason: collision with root package name */
    private static final List<InterfaceC4598j> f50026e = kotlin.collections.r.W0(ServiceLoader.load(InterfaceC4598j.class, InterfaceC4598j.class.getClassLoader()));

    /* renamed from: f, reason: collision with root package name */
    public static final C4603o f50027f;

    /* renamed from: g, reason: collision with root package name */
    private static final e.a f50028g;

    /* renamed from: a, reason: collision with root package name */
    private final Ib.g f50029a;

    /* renamed from: b, reason: collision with root package name */
    private final Ib.f f50030b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a f50031c;

    /* renamed from: d, reason: collision with root package name */
    private final Ba.p<U, U, Boolean> f50032d;

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$a */
    static class a implements e.a {
        a() {
        }

        private static /* synthetic */ void b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ib.e.a
        public boolean a(y0 y0Var, y0 y0Var2) {
            if (y0Var == null) {
                b(0);
            }
            if (y0Var2 == null) {
                b(1);
            }
            return y0Var.equals(y0Var2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$b */
    static class b<D> implements Ba.p<D, D, C4170o<InterfaceC1688a, InterfaceC1688a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Loa/o<LRa/a;LRa/a;>; */
        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4170o invoke(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
            return new C4170o(interfaceC1688a, interfaceC1688a2);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$c */
    static class c implements Ba.l<InterfaceC1689b, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1700m f50033B;

        c(InterfaceC1700m interfaceC1700m) {
            this.f50033B = interfaceC1700m;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1689b interfaceC1689b) {
            return Boolean.valueOf(interfaceC1689b.c() == this.f50033B);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$e */
    static class e implements Ba.l<InterfaceC1689b, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1692e f50034B;

        e(InterfaceC1692e interfaceC1692e) {
            this.f50034B = interfaceC1692e;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(InterfaceC1689b interfaceC1689b) {
            boolean z10 = false;
            if (!C1706t.g(interfaceC1689b.getVisibility()) && C1706t.h(interfaceC1689b, this.f50034B, false)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$g */
    static class g implements Ba.l<InterfaceC1689b, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC4602n f50035B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC1689b f50036C;

        g(AbstractC4602n abstractC4602n, InterfaceC1689b interfaceC1689b) {
            this.f50035B = abstractC4602n;
            this.f50036C = interfaceC1689b;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4153F invoke(InterfaceC1689b interfaceC1689b) {
            this.f50035B.b(this.f50036C, interfaceC1689b);
            return C4153F.f46609a;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$h */
    static /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f50037a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f50038b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f50039c;

        static {
            int[] iArr = new int[E.values().length];
            f50039c = iArr;
            try {
                iArr[E.f15106C.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50039c[E.f15107D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50039c[E.f15108E.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f50039c[E.f15109F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f50038b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f50038b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f50038b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[InterfaceC4598j.b.values().length];
            f50037a = iArr3;
            try {
                iArr3[InterfaceC4598j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f50037a[InterfaceC4598j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f50037a[InterfaceC4598j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$i */
    public static class i {

        /* renamed from: c, reason: collision with root package name */
        private static final i f50040c = new i(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        private final a f50041a;

        /* renamed from: b, reason: collision with root package name */
        private final String f50042b;

        /* compiled from: OverridingUtil.java */
        /* renamed from: tb.o$i$a */
        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f50041a = aVar;
            this.f50042b = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.C4603o.i.a(int):void");
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f50040c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f50041a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f50041a + ": " + this.f50042b;
        }
    }

    static {
        a aVar = new a();
        f50028g = aVar;
        f50027f = new C4603o(aVar, g.a.f6982a, f.a.f6981a, null);
    }

    private C4603o(e.a aVar, Ib.g gVar, Ib.f fVar, Ba.p<U, U, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f50031c = aVar;
        this.f50029a = gVar;
        this.f50030b = fVar;
        this.f50032d = pVar;
    }

    private static boolean A(Y y10, Y y11) {
        if (y10 == null || y11 == null) {
            return true;
        }
        return H(y10, y11);
    }

    public static boolean B(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        if (interfaceC1688a == null) {
            a(65);
        }
        if (interfaceC1688a2 == null) {
            a(66);
        }
        U returnType = interfaceC1688a.getReturnType();
        U returnType2 = interfaceC1688a2.getReturnType();
        if (!H(interfaceC1688a, interfaceC1688a2)) {
            return false;
        }
        x0 x0VarL = f50027f.l(interfaceC1688a.getTypeParameters(), interfaceC1688a2.getTypeParameters());
        if (interfaceC1688a instanceof InterfaceC1712z) {
            return G(interfaceC1688a, returnType, interfaceC1688a2, returnType2, x0VarL);
        }
        if (!(interfaceC1688a instanceof Z)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC1688a.getClass());
        }
        Z z10 = (Z) interfaceC1688a;
        Z z11 = (Z) interfaceC1688a2;
        if (A(z10.h(), z11.h())) {
            return (z10.h0() && z11.h0()) ? C1085h.f5748a.m(x0VarL, returnType.R0(), returnType2.R0()) : (z10.h0() || !z11.h0()) && G(interfaceC1688a, returnType, interfaceC1688a2, returnType2, x0VarL);
        }
        return false;
    }

    private static boolean C(InterfaceC1688a interfaceC1688a, Collection<InterfaceC1688a> collection) {
        if (interfaceC1688a == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator<InterfaceC1688a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(interfaceC1688a, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(InterfaceC1688a interfaceC1688a, U u10, InterfaceC1688a interfaceC1688a2, U u11, x0 x0Var) {
        if (interfaceC1688a == null) {
            a(71);
        }
        if (u10 == null) {
            a(72);
        }
        if (interfaceC1688a2 == null) {
            a(73);
        }
        if (u11 == null) {
            a(74);
        }
        if (x0Var == null) {
            a(75);
        }
        return C1085h.f5748a.t(x0Var, u10.R0(), u11.R0());
    }

    private static boolean H(InterfaceC1704q interfaceC1704q, InterfaceC1704q interfaceC1704q2) {
        if (interfaceC1704q == null) {
            a(67);
        }
        if (interfaceC1704q2 == null) {
            a(68);
        }
        Integer numD = C1706t.d(interfaceC1704q.getVisibility(), interfaceC1704q2.getVisibility());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(D d10, D d11, boolean z10) {
        if (d10 == null) {
            a(55);
        }
        if (d11 == null) {
            a(56);
        }
        return !C1706t.g(d11.getVisibility()) && C1706t.h(d11, d10, z10);
    }

    public static <D extends InterfaceC1688a> boolean J(D d10, D d11, boolean z10, boolean z11) {
        if (d10 == null) {
            a(13);
        }
        if (d11 == null) {
            a(14);
        }
        if (!d10.equals(d11) && C4595g.f50013a.k(d10.L0(), d11.L0(), z10, z11)) {
            return true;
        }
        InterfaceC1688a interfaceC1688aB = d11.L0();
        Iterator it = C4597i.d(d10).iterator();
        while (it.hasNext()) {
            if (C4595g.f50013a.k(interfaceC1688aB, (InterfaceC1688a) it.next(), z10, z11)) {
                return true;
            }
        }
        return false;
    }

    public static void K(InterfaceC1689b interfaceC1689b, Ba.l<InterfaceC1689b, C4153F> lVar) {
        AbstractC1707u abstractC1707u;
        if (interfaceC1689b == null) {
            a(Temperature.MAX_INTERNAL_SECOND_GEN_PROBE);
        }
        for (InterfaceC1689b interfaceC1689b2 : interfaceC1689b.g()) {
            if (interfaceC1689b2.getVisibility() == C1706t.f15172g) {
                K(interfaceC1689b2, lVar);
            }
        }
        if (interfaceC1689b.getVisibility() != C1706t.f15172g) {
            return;
        }
        AbstractC1707u abstractC1707uH = h(interfaceC1689b);
        if (abstractC1707uH == null) {
            if (lVar != null) {
                lVar.invoke(interfaceC1689b);
            }
            abstractC1707u = C1706t.f15170e;
        } else {
            abstractC1707u = abstractC1707uH;
        }
        if (interfaceC1689b instanceof K) {
            ((K) interfaceC1689b).d1(abstractC1707u);
            Iterator<Y> it = ((Z) interfaceC1689b).x().iterator();
            while (it.hasNext()) {
                K(it.next(), abstractC1707uH == null ? null : lVar);
            }
            return;
        }
        if (interfaceC1689b instanceof AbstractC1779s) {
            ((AbstractC1779s) interfaceC1689b).k1(abstractC1707u);
            return;
        }
        J j10 = (J) interfaceC1689b;
        j10.P0(abstractC1707u);
        if (abstractC1707u != j10.A0().getVisibility()) {
            j10.N0(false);
        }
    }

    public static <H> H L(Collection<H> collection, Ba.l<H, InterfaceC1688a> lVar) {
        H h10;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            H h11 = (H) kotlin.collections.r.i0(collection);
            if (h11 == null) {
                a(78);
            }
            return h11;
        }
        ArrayList arrayList = new ArrayList(2);
        List listX0 = kotlin.collections.r.x0(collection, lVar);
        H h12 = (H) kotlin.collections.r.i0(collection);
        InterfaceC1688a interfaceC1688aInvoke = lVar.invoke(h12);
        for (H h13 : collection) {
            InterfaceC1688a interfaceC1688aInvoke2 = lVar.invoke(h13);
            if (C(interfaceC1688aInvoke2, listX0)) {
                arrayList.add(h13);
            }
            if (B(interfaceC1688aInvoke2, interfaceC1688aInvoke) && !B(interfaceC1688aInvoke, interfaceC1688aInvoke2)) {
                h12 = h13;
            }
        }
        if (arrayList.isEmpty()) {
            if (h12 == null) {
                a(79);
            }
            return h12;
        }
        if (arrayList.size() == 1) {
            H h14 = (H) kotlin.collections.r.i0(arrayList);
            if (h14 == null) {
                a(80);
            }
            return h14;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                h10 = null;
                break;
            }
            h10 = (H) it.next();
            if (!N.b(lVar.invoke(h10).getReturnType())) {
                break;
            }
        }
        if (h10 != null) {
            return h10;
        }
        H h15 = (H) kotlin.collections.r.i0(arrayList);
        if (h15 == null) {
            a(82);
        }
        return h15;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C4603o.a(int):void");
    }

    private static boolean b(Collection<InterfaceC1689b> collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return kotlin.collections.r.Y(collection, new c(collection.iterator().next().c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(Ra.m0 r4, Ra.m0 r5, Hb.x0 r6) {
        /*
            if (r4 != 0) goto L7
            r0 = 47
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 48
            a(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 49
            a(r0)
        L15:
            java.util.List r4 = r4.getUpperBounds()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r5 = r5.getUpperBounds()
            r0.<init>(r5)
            int r5 = r4.size()
            int r1 = r0.size()
            r2 = 0
            if (r5 == r1) goto L2e
            return r2
        L2e:
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            Hb.U r5 = (Hb.U) r5
            java.util.ListIterator r1 = r0.listIterator()
        L42:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r1.next()
            Hb.U r3 = (Hb.U) r3
            boolean r3 = d(r5, r3, r6)
            if (r3 == 0) goto L42
            r1.remove()
            goto L32
        L58:
            return r2
        L59:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.C4603o.c(Ra.m0, Ra.m0, Hb.x0):boolean");
    }

    private static boolean d(U u10, U u11, x0 x0Var) {
        if (u10 == null) {
            a(44);
        }
        if (u11 == null) {
            a(45);
        }
        if (x0Var == null) {
            a(46);
        }
        if (Hb.Y.a(u10) && Hb.Y.a(u11)) {
            return true;
        }
        return C1085h.f5748a.m(x0Var, u10.R0(), u11.R0());
    }

    private static i e(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        if ((interfaceC1688a.j0() == null) != (interfaceC1688a2.j0() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (interfaceC1688a.k().size() != interfaceC1688a2.k().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(InterfaceC1689b interfaceC1689b, Set<InterfaceC1689b> set) {
        if (interfaceC1689b == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (interfaceC1689b.i().c()) {
            set.add(interfaceC1689b);
            return;
        }
        if (interfaceC1689b.g().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC1689b);
        }
        Iterator<? extends InterfaceC1689b> it = interfaceC1689b.g().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static List<U> g(InterfaceC1688a interfaceC1688a) {
        c0 c0VarJ0 = interfaceC1688a.j0();
        ArrayList arrayList = new ArrayList();
        if (c0VarJ0 != null) {
            arrayList.add(c0VarJ0.a());
        }
        Iterator<t0> it = interfaceC1688a.k().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private static AbstractC1707u h(InterfaceC1689b interfaceC1689b) {
        if (interfaceC1689b == null) {
            a(106);
        }
        Collection<? extends InterfaceC1689b> collectionG = interfaceC1689b.g();
        AbstractC1707u abstractC1707uU = u(collectionG);
        if (abstractC1707uU == null) {
            return null;
        }
        if (interfaceC1689b.i() != InterfaceC1689b.a.FAKE_OVERRIDE) {
            return abstractC1707uU.f();
        }
        for (InterfaceC1689b interfaceC1689b2 : collectionG) {
            if (interfaceC1689b2.m() != E.f15109F && !interfaceC1689b2.getVisibility().equals(abstractC1707uU)) {
                return null;
            }
        }
        return abstractC1707uU;
    }

    public static C4603o i(Ib.g gVar, e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new C4603o(aVar, gVar, f.a.f6981a, null);
    }

    private static void j(Collection<InterfaceC1689b> collection, InterfaceC1692e interfaceC1692e, AbstractC4602n abstractC4602n) {
        if (collection == null) {
            a(83);
        }
        if (interfaceC1692e == null) {
            a(84);
        }
        if (abstractC4602n == null) {
            a(85);
        }
        Collection<InterfaceC1689b> collectionT = t(interfaceC1692e, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        InterfaceC1689b interfaceC1689bA0 = ((InterfaceC1689b) L(collection, new d())).a0(interfaceC1692e, n(collection, interfaceC1692e), zIsEmpty ? C1706t.f15173h : C1706t.f15172g, InterfaceC1689b.a.FAKE_OVERRIDE, false);
        abstractC4602n.d(interfaceC1689bA0, collection);
        abstractC4602n.a(interfaceC1689bA0);
    }

    private static void k(InterfaceC1692e interfaceC1692e, Collection<InterfaceC1689b> collection, AbstractC4602n abstractC4602n) {
        if (interfaceC1692e == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (abstractC4602n == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator<InterfaceC1689b> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), interfaceC1692e, abstractC4602n);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(p(x.a(linkedList), linkedList, abstractC4602n), interfaceC1692e, abstractC4602n);
            }
        }
    }

    private x0 l(List<m0> list, List<m0> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            x0 x0VarL0 = new C4604p(null, this.f50031c, this.f50029a, this.f50030b, this.f50032d).L0(true, true);
            if (x0VarL0 == null) {
                a(42);
            }
            return x0VarL0;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(list.get(i10).l(), list2.get(i10).l());
        }
        x0 x0VarL02 = new C4604p(map, this.f50031c, this.f50029a, this.f50030b, this.f50032d).L0(true, true);
        if (x0VarL02 == null) {
            a(43);
        }
        return x0VarL02;
    }

    public static C4603o m(Ib.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new C4603o(f50028g, gVar, f.a.f6981a, null);
    }

    private static E n(Collection<InterfaceC1689b> collection, InterfaceC1692e interfaceC1692e) {
        if (collection == null) {
            a(86);
        }
        if (interfaceC1692e == null) {
            a(87);
        }
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        for (InterfaceC1689b interfaceC1689b : collection) {
            int i10 = h.f50039c[interfaceC1689b.m().ordinal()];
            if (i10 == 1) {
                E e10 = E.f15106C;
                if (e10 == null) {
                    a(88);
                }
                return e10;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + interfaceC1689b);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        if (interfaceC1692e.K() && interfaceC1692e.m() != E.f15109F && interfaceC1692e.m() != E.f15107D) {
            z10 = true;
        }
        if (z11 && !z12) {
            E e11 = E.f15108E;
            if (e11 == null) {
                a(89);
            }
            return e11;
        }
        if (!z11 && z12) {
            E eM = z10 ? interfaceC1692e.m() : E.f15109F;
            if (eM == null) {
                a(90);
            }
            return eM;
        }
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC1689b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z10, interfaceC1692e.m());
    }

    private Collection<InterfaceC1689b> o(InterfaceC1689b interfaceC1689b, Collection<? extends InterfaceC1689b> collection, InterfaceC1692e interfaceC1692e, AbstractC4602n abstractC4602n) {
        if (interfaceC1689b == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (interfaceC1692e == null) {
            a(59);
        }
        if (abstractC4602n == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Rb.l lVarH = Rb.l.h();
        for (InterfaceC1689b interfaceC1689b2 : collection) {
            i.a aVarC = D(interfaceC1689b2, interfaceC1689b, interfaceC1692e).c();
            boolean zI = I(interfaceC1689b, interfaceC1689b2, false);
            int i10 = h.f50038b[aVarC.ordinal()];
            if (i10 == 1) {
                if (zI) {
                    lVarH.add(interfaceC1689b2);
                }
                arrayList.add(interfaceC1689b2);
            } else if (i10 == 2) {
                if (zI) {
                    abstractC4602n.c(interfaceC1689b2, interfaceC1689b);
                }
                arrayList.add(interfaceC1689b2);
            }
        }
        abstractC4602n.d(interfaceC1689b, lVarH);
        return arrayList;
    }

    private static Collection<InterfaceC1689b> p(InterfaceC1689b interfaceC1689b, Queue<InterfaceC1689b> queue, AbstractC4602n abstractC4602n) {
        if (interfaceC1689b == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (abstractC4602n == null) {
            a(104);
        }
        return q(interfaceC1689b, queue, new f(), new g(abstractC4602n, interfaceC1689b));
    }

    public static <H> Collection<H> q(H h10, Collection<H> collection, Ba.l<H, InterfaceC1688a> lVar, Ba.l<H, C4153F> lVar2) {
        if (h10 == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h10);
        InterfaceC1688a interfaceC1688aInvoke = lVar.invoke(h10);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            InterfaceC1688a interfaceC1688aInvoke2 = lVar.invoke(next);
            if (h10 == next) {
                it.remove();
            } else {
                i.a aVarX = x(interfaceC1688aInvoke, interfaceC1688aInvoke2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends InterfaceC1688a> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && C5087e.y(C5087e.s(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z10, Ba.a<?> aVar, Ba.p<? super D, ? super D, C4170o<InterfaceC1688a, InterfaceC1688a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                C4170o<InterfaceC1688a, InterfaceC1688a> c4170oInvoke = pVar.invoke(obj, (Object) it.next());
                InterfaceC1688a interfaceC1688aA = c4170oInvoke.a();
                InterfaceC1688a interfaceC1688aB = c4170oInvoke.b();
                if (!J(interfaceC1688aA, interfaceC1688aB, z10, true)) {
                    if (J(interfaceC1688aB, interfaceC1688aA, z10, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<InterfaceC1689b> t(InterfaceC1692e interfaceC1692e, Collection<InterfaceC1689b> collection) {
        if (interfaceC1692e == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listF0 = kotlin.collections.r.f0(collection, new e(interfaceC1692e));
        if (listF0 == null) {
            a(96);
        }
        return listF0;
    }

    public static AbstractC1707u u(Collection<? extends InterfaceC1689b> collection) {
        AbstractC1707u abstractC1707u;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return C1706t.f15177l;
        }
        Iterator<? extends InterfaceC1689b> it = collection.iterator();
        loop0: while (true) {
            abstractC1707u = null;
            while (it.hasNext()) {
                AbstractC1707u visibility = it.next().getVisibility();
                if (abstractC1707u != null) {
                    Integer numD = C1706t.d(visibility, abstractC1707u);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                abstractC1707u = visibility;
            }
        }
        if (abstractC1707u == null) {
            return null;
        }
        Iterator<? extends InterfaceC1689b> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer numD2 = C1706t.d(abstractC1707u, it2.next().getVisibility());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return abstractC1707u;
    }

    public static i w(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        boolean z10;
        if (interfaceC1688a == null) {
            a(38);
        }
        if (interfaceC1688a2 == null) {
            a(39);
        }
        boolean z11 = interfaceC1688a instanceof InterfaceC1712z;
        if ((z11 && !(interfaceC1688a2 instanceof InterfaceC1712z)) || (((z10 = interfaceC1688a instanceof Z)) && !(interfaceC1688a2 instanceof Z))) {
            return i.d("Member kind mismatch");
        }
        if (!z11 && !z10) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC1688a);
        }
        if (!interfaceC1688a.getName().equals(interfaceC1688a2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(interfaceC1688a, interfaceC1688a2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2) {
        C4603o c4603o = f50027f;
        i.a aVarC = c4603o.D(interfaceC1688a2, interfaceC1688a, null).c();
        i.a aVarC2 = c4603o.D(interfaceC1688a, interfaceC1688a2, null).c();
        i.a aVar = i.a.OVERRIDABLE;
        if (aVarC == aVar && aVarC2 == aVar) {
            return aVar;
        }
        i.a aVar2 = i.a.CONFLICT;
        return (aVarC == aVar2 || aVarC2 == aVar2) ? aVar2 : i.a.INCOMPATIBLE;
    }

    private static E y(Collection<InterfaceC1689b> collection, boolean z10, E e10) {
        if (collection == null) {
            a(91);
        }
        if (e10 == null) {
            a(92);
        }
        E e11 = E.f15109F;
        for (InterfaceC1689b interfaceC1689b : collection) {
            E eM = (z10 && interfaceC1689b.m() == E.f15109F) ? e10 : interfaceC1689b.m();
            if (eM.compareTo(e11) < 0) {
                e11 = eM;
            }
        }
        if (e11 == null) {
            a(93);
        }
        return e11;
    }

    public static Set<InterfaceC1689b> z(InterfaceC1689b interfaceC1689b) {
        if (interfaceC1689b == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(interfaceC1689b, linkedHashSet);
        return linkedHashSet;
    }

    public i D(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, InterfaceC1692e interfaceC1692e) {
        if (interfaceC1688a == null) {
            a(19);
        }
        if (interfaceC1688a2 == null) {
            a(20);
        }
        i iVarE = E(interfaceC1688a, interfaceC1688a2, interfaceC1692e, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, InterfaceC1692e interfaceC1692e, boolean z10) {
        if (interfaceC1688a == null) {
            a(22);
        }
        if (interfaceC1688a2 == null) {
            a(23);
        }
        i iVarF = F(interfaceC1688a, interfaceC1688a2, z10);
        boolean z11 = iVarF.c() == i.a.OVERRIDABLE;
        for (InterfaceC4598j interfaceC4598j : f50026e) {
            if (interfaceC4598j.b() != InterfaceC4598j.a.CONFLICTS_ONLY && (!z11 || interfaceC4598j.b() != InterfaceC4598j.a.SUCCESS_ONLY)) {
                int i10 = h.f50037a[interfaceC4598j.a(interfaceC1688a, interfaceC1688a2, interfaceC1692e).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else if (i10 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z11) {
            return iVarF;
        }
        for (InterfaceC4598j interfaceC4598j2 : f50026e) {
            if (interfaceC4598j2.b() == InterfaceC4598j.a.CONFLICTS_ONLY) {
                int i11 = h.f50037a[interfaceC4598j2.a(interfaceC1688a, interfaceC1688a2, interfaceC1692e).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + interfaceC4598j2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(InterfaceC1688a interfaceC1688a, InterfaceC1688a interfaceC1688a2, boolean z10) {
        if (interfaceC1688a == null) {
            a(28);
        }
        if (interfaceC1688a2 == null) {
            a(29);
        }
        i iVarW = w(interfaceC1688a, interfaceC1688a2);
        if (iVarW != null) {
            return iVarW;
        }
        List<U> listG = g(interfaceC1688a);
        List<U> listG2 = g(interfaceC1688a2);
        List<m0> typeParameters = interfaceC1688a.getTypeParameters();
        List<m0> typeParameters2 = interfaceC1688a2.getTypeParameters();
        int i10 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i10 < listG.size()) {
                if (!Ib.e.f6980a.c(listG.get(i10), listG2.get(i10))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i10++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        x0 x0VarL = l(typeParameters, typeParameters2);
        for (int i11 = 0; i11 < typeParameters.size(); i11++) {
            if (!c(typeParameters.get(i11), typeParameters2.get(i11), x0VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i10 < listG.size()) {
            if (!d(listG.get(i10), listG2.get(i10), x0VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i10++;
        }
        if ((interfaceC1688a instanceof InterfaceC1712z) && (interfaceC1688a2 instanceof InterfaceC1712z) && ((InterfaceC1712z) interfaceC1688a).isSuspend() != ((InterfaceC1712z) interfaceC1688a2).isSuspend()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z10) {
            U returnType = interfaceC1688a.getReturnType();
            U returnType2 = interfaceC1688a2.getReturnType();
            if (returnType != null && returnType2 != null && ((!Hb.Y.a(returnType2) || !Hb.Y.a(returnType)) && !C1085h.f5748a.t(x0VarL, returnType2.R0(), returnType.R0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(qb.f fVar, Collection<? extends InterfaceC1689b> collection, Collection<? extends InterfaceC1689b> collection2, InterfaceC1692e interfaceC1692e, AbstractC4602n abstractC4602n) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (interfaceC1692e == null) {
            a(53);
        }
        if (abstractC4602n == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends InterfaceC1689b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, interfaceC1692e, abstractC4602n));
        }
        k(interfaceC1692e, linkedHashSet, abstractC4602n);
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$d */
    static class d implements Ba.l<InterfaceC1689b, InterfaceC1688a> {
        d() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1689b invoke(InterfaceC1689b interfaceC1689b) {
            return interfaceC1689b;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* renamed from: tb.o$f */
    static class f implements Ba.l<InterfaceC1689b, InterfaceC1688a> {
        f() {
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC1688a invoke(InterfaceC1689b interfaceC1689b) {
            return interfaceC1689b;
        }
    }
}
