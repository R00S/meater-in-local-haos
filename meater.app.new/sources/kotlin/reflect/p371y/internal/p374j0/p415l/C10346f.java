package kotlin.reflect.p371y.internal.p374j0.p415l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C10775u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.collections.C10819v;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.utils.C10771e;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.C10434a;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10435b;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.EnumC10454u;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10437d;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10438e;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10445l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10446m;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10447n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10453t;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.f */
/* loaded from: classes3.dex */
public final class C10346f {

    /* renamed from: a */
    public static final C10346f f40078a = new C10346f();

    /* renamed from: b */
    public static boolean f40079b;

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40080a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40081b;

        static {
            int[] iArr = new int[EnumC10454u.values().length];
            iArr[EnumC10454u.INV.ordinal()] = 1;
            iArr[EnumC10454u.OUT.ordinal()] = 2;
            iArr[EnumC10454u.IN.ordinal()] = 3;
            f40080a = iArr;
            int[] iArr2 = new int[C10342d1.b.values().length];
            iArr2[C10342d1.b.CHECK_ONLY_LOWER.ordinal()] = 1;
            iArr2[C10342d1.b.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            iArr2[C10342d1.b.SKIP_LOWER.ordinal()] = 3;
            f40081b = iArr2;
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.f$b */
    static final class b extends Lambda implements Function1<C10342d1.a, C10775u> {

        /* renamed from: f */
        final /* synthetic */ List<InterfaceC10444k> f40082f;

        /* renamed from: g */
        final /* synthetic */ C10342d1 f40083g;

        /* renamed from: h */
        final /* synthetic */ InterfaceC10449p f40084h;

        /* renamed from: i */
        final /* synthetic */ InterfaceC10444k f40085i;

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.f0.y.e.j0.l.f$b$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f */
            final /* synthetic */ C10342d1 f40086f;

            /* renamed from: g */
            final /* synthetic */ InterfaceC10449p f40087g;

            /* renamed from: h */
            final /* synthetic */ InterfaceC10444k f40088h;

            /* renamed from: i */
            final /* synthetic */ InterfaceC10444k f40089i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C10342d1 c10342d1, InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
                super(0);
                this.f40086f = c10342d1;
                this.f40087g = interfaceC10449p;
                this.f40088h = interfaceC10444k;
                this.f40089i = interfaceC10444k2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C10346f.f40078a.m36656q(this.f40086f, this.f40087g.mo35967r(this.f40088h), this.f40089i));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<? extends InterfaceC10444k> list, C10342d1 c10342d1, InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k) {
            super(1);
            this.f40082f = list;
            this.f40083g = c10342d1;
            this.f40084h = interfaceC10449p;
            this.f40085i = interfaceC10444k;
        }

        /* renamed from: b */
        public final void m36659b(C10342d1.a aVar) {
            C9801m.m32346f(aVar, "$this$runForkingPoint");
            Iterator<InterfaceC10444k> it = this.f40082f.iterator();
            while (it.hasNext()) {
                aVar.mo36626a(new a(this.f40083g, this.f40084h, it.next(), this.f40085i));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(C10342d1.a aVar) {
            m36659b(aVar);
            return C10775u.f41439a;
        }
    }

    private C10346f() {
    }

    /* renamed from: a */
    private final Boolean m36636a(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (!interfaceC10449pM36618j.mo35916J(interfaceC10444k) && !interfaceC10449pM36618j.mo35916J(interfaceC10444k2)) {
            return null;
        }
        if (m36639d(interfaceC10449pM36618j, interfaceC10444k) && m36639d(interfaceC10449pM36618j, interfaceC10444k2)) {
            return Boolean.TRUE;
        }
        if (interfaceC10449pM36618j.mo35916J(interfaceC10444k)) {
            if (m36640e(interfaceC10449pM36618j, c10342d1, interfaceC10444k, interfaceC10444k2, false)) {
                return Boolean.TRUE;
            }
        } else if (interfaceC10449pM36618j.mo35916J(interfaceC10444k2) && (m36638c(interfaceC10449pM36618j, interfaceC10444k) || m36640e(interfaceC10449pM36618j, c10342d1, interfaceC10444k2, interfaceC10444k, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* renamed from: b */
    private static final boolean m36637b(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k) {
        if (!(interfaceC10444k instanceof InterfaceC10437d)) {
            return false;
        }
        InterfaceC10446m interfaceC10446mMo35925S = interfaceC10449p.mo35925S(interfaceC10449p.mo35940d0((InterfaceC10437d) interfaceC10444k));
        return !interfaceC10449p.mo35918L(interfaceC10446mMo35925S) && interfaceC10449p.mo35916J(interfaceC10449p.mo35926T(interfaceC10449p.mo35980x0(interfaceC10446mMo35925S)));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m36638c(kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p r3, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k r4) {
        /*
            kotlin.f0.y.e.j0.l.w1.n r4 = r3.mo35937c(r4)
            boolean r0 = r4 instanceof kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10441h
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            java.util.Collection r4 = r3.mo35971t(r4)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L1a
        L18:
            r3 = 0
            goto L3c
        L1a:
            java.util.Iterator r4 = r4.iterator()
        L1e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r4.next()
            kotlin.f0.y.e.j0.l.w1.i r0 = (kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i) r0
            kotlin.f0.y.e.j0.l.w1.k r0 = r3.mo35933a(r0)
            if (r0 == 0) goto L38
            boolean r0 = r3.mo35916J(r0)
            if (r0 != r1) goto L38
            r0 = 1
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L1e
            r3 = 1
        L3c:
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10346f.m36638c(kotlin.f0.y.e.j0.l.w1.p, kotlin.f0.y.e.j0.l.w1.k):boolean");
    }

    /* renamed from: d */
    private static final boolean m36639d(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k) {
        return interfaceC10449p.mo35916J(interfaceC10444k) || m36637b(interfaceC10449p, interfaceC10444k);
    }

    /* renamed from: e */
    private static final boolean m36640e(InterfaceC10449p interfaceC10449p, C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2, boolean z) {
        Collection<InterfaceC10442i> collectionMo35975v = interfaceC10449p.mo35975v(interfaceC10444k);
        if (!(collectionMo35975v instanceof Collection) || !collectionMo35975v.isEmpty()) {
            for (InterfaceC10442i interfaceC10442i : collectionMo35975v) {
                if (C9801m.m32341a(interfaceC10449p.mo35977w(interfaceC10442i), interfaceC10449p.mo35937c(interfaceC10444k2)) || (z && m36649t(f40078a, c10342d1, interfaceC10444k2, interfaceC10442i, false, 8, null))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Boolean m36641f(kotlin.reflect.p371y.internal.p374j0.p415l.C10342d1 r15, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k r16, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10444k r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10346f.m36641f(kotlin.f0.y.e.j0.l.d1, kotlin.f0.y.e.j0.l.w1.k, kotlin.f0.y.e.j0.l.w1.k):java.lang.Boolean");
    }

    /* renamed from: g */
    private final List<InterfaceC10444k> m36642g(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
        C10342d1.c cVarMo35901A;
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        List<InterfaceC10444k> listMo35959n = interfaceC10449pM36618j.mo35959n(interfaceC10444k, interfaceC10447n);
        if (listMo35959n != null) {
            return listMo35959n;
        }
        if (!interfaceC10449pM36618j.mo35928V(interfaceC10447n) && interfaceC10449pM36618j.mo35976v0(interfaceC10444k)) {
            return C10817u.m38888j();
        }
        if (interfaceC10449pM36618j.mo35974u0(interfaceC10447n)) {
            if (!interfaceC10449pM36618j.mo35902A0(interfaceC10449pM36618j.mo35937c(interfaceC10444k), interfaceC10447n)) {
                return C10817u.m38888j();
            }
            InterfaceC10444k interfaceC10444kMo35968r0 = interfaceC10449pM36618j.mo35968r0(interfaceC10444k, EnumC10435b.FOR_SUBTYPING);
            if (interfaceC10444kMo35968r0 != null) {
                interfaceC10444k = interfaceC10444kMo35968r0;
            }
            return C10815t.m38883e(interfaceC10444k);
        }
        C10771e c10771e = new C10771e();
        c10342d1.m36619k();
        ArrayDeque<InterfaceC10444k> arrayDequeM36616h = c10342d1.m36616h();
        C9801m.m32343c(arrayDequeM36616h);
        Set<InterfaceC10444k> setM36617i = c10342d1.m36617i();
        C9801m.m32343c(setM36617i);
        arrayDequeM36616h.push(interfaceC10444k);
        while (!arrayDequeM36616h.isEmpty()) {
            if (setM36617i.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC10444k + ". Supertypes = " + C10782c0.m38599e0(setM36617i, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC10444k interfaceC10444kPop = arrayDequeM36616h.pop();
            C9801m.m32345e(interfaceC10444kPop, "current");
            if (setM36617i.add(interfaceC10444kPop)) {
                InterfaceC10444k interfaceC10444kMo35968r02 = interfaceC10449pM36618j.mo35968r0(interfaceC10444kPop, EnumC10435b.FOR_SUBTYPING);
                if (interfaceC10444kMo35968r02 == null) {
                    interfaceC10444kMo35968r02 = interfaceC10444kPop;
                }
                if (interfaceC10449pM36618j.mo35902A0(interfaceC10449pM36618j.mo35937c(interfaceC10444kMo35968r02), interfaceC10447n)) {
                    c10771e.add(interfaceC10444kMo35968r02);
                    cVarMo35901A = C10342d1.c.C11570c.f40071a;
                } else {
                    cVarMo35901A = interfaceC10449pM36618j.mo35951j(interfaceC10444kMo35968r02) == 0 ? C10342d1.c.b.f40070a : c10342d1.m36618j().mo35901A(interfaceC10444kMo35968r02);
                }
                if (!(!C9801m.m32341a(cVarMo35901A, C10342d1.c.C11570c.f40071a))) {
                    cVarMo35901A = null;
                }
                if (cVarMo35901A != null) {
                    InterfaceC10449p interfaceC10449pM36618j2 = c10342d1.m36618j();
                    Iterator<InterfaceC10442i> it = interfaceC10449pM36618j2.mo35971t(interfaceC10449pM36618j2.mo35937c(interfaceC10444kPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM36616h.add(cVarMo35901A.mo36629a(c10342d1, it.next()));
                    }
                }
            }
        }
        c10342d1.m36614e();
        return c10771e;
    }

    /* renamed from: h */
    private final List<InterfaceC10444k> m36643h(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
        return m36652w(c10342d1, m36642g(c10342d1, interfaceC10444k, interfaceC10447n));
    }

    /* renamed from: i */
    private final boolean m36644i(C10342d1 c10342d1, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2, boolean z) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        InterfaceC10442i interfaceC10442iM36623o = c10342d1.m36623o(c10342d1.m36624p(interfaceC10442i));
        InterfaceC10442i interfaceC10442iM36623o2 = c10342d1.m36623o(c10342d1.m36624p(interfaceC10442i2));
        C10346f c10346f = f40078a;
        Boolean boolM36641f = c10346f.m36641f(c10342d1, interfaceC10449pM36618j.mo35948h0(interfaceC10442iM36623o), interfaceC10449pM36618j.mo35926T(interfaceC10442iM36623o2));
        if (boolM36641f == null) {
            Boolean boolM36613c = c10342d1.m36613c(interfaceC10442iM36623o, interfaceC10442iM36623o2, z);
            return boolM36613c != null ? boolM36613c.booleanValue() : c10346f.m36650u(c10342d1, interfaceC10449pM36618j.mo35948h0(interfaceC10442iM36623o), interfaceC10449pM36618j.mo35926T(interfaceC10442iM36623o2));
        }
        boolean zBooleanValue = boolM36641f.booleanValue();
        c10342d1.m36613c(interfaceC10442iM36623o, interfaceC10442iM36623o2, z);
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return r8.mo35907D(r8.mo35977w(r9), r2);
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10448o m36645m(kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10449p r8, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i r9, kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10442i r10) {
        /*
            r7 = this;
            int r0 = r8.mo35951j(r9)
            r1 = 0
            r2 = 0
        L6:
            r3 = 0
            if (r2 >= r0) goto L5f
            kotlin.f0.y.e.j0.l.w1.m r4 = r8.mo35946g0(r9, r2)
            boolean r5 = r8.mo35918L(r4)
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L16
            r3 = r4
        L16:
            if (r3 == 0) goto L5c
            kotlin.f0.y.e.j0.l.w1.i r3 = r8.mo35980x0(r3)
            if (r3 != 0) goto L1f
            goto L5c
        L1f:
            kotlin.f0.y.e.j0.l.w1.k r4 = r8.mo35948h0(r3)
            boolean r4 = r8.mo35903B(r4)
            if (r4 == 0) goto L34
            kotlin.f0.y.e.j0.l.w1.k r4 = r8.mo35948h0(r10)
            boolean r4 = r8.mo35903B(r4)
            if (r4 == 0) goto L34
            goto L35
        L34:
            r6 = 0
        L35:
            boolean r4 = kotlin.jvm.internal.C9801m.m32341a(r3, r10)
            if (r4 != 0) goto L53
            if (r6 == 0) goto L4c
            kotlin.f0.y.e.j0.l.w1.n r4 = r8.mo35977w(r3)
            kotlin.f0.y.e.j0.l.w1.n r5 = r8.mo35977w(r10)
            boolean r4 = kotlin.jvm.internal.C9801m.m32341a(r4, r5)
            if (r4 == 0) goto L4c
            goto L53
        L4c:
            kotlin.f0.y.e.j0.l.w1.o r3 = r7.m36645m(r8, r3, r10)
            if (r3 == 0) goto L5c
            return r3
        L53:
            kotlin.f0.y.e.j0.l.w1.n r9 = r8.mo35977w(r9)
            kotlin.f0.y.e.j0.l.w1.o r8 = r8.mo35907D(r9, r2)
            return r8
        L5c:
            int r2 = r2 + 1
            goto L6
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10346f.m36645m(kotlin.f0.y.e.j0.l.w1.p, kotlin.f0.y.e.j0.l.w1.i, kotlin.f0.y.e.j0.l.w1.i):kotlin.f0.y.e.j0.l.w1.o");
    }

    /* renamed from: n */
    private final boolean m36646n(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        InterfaceC10447n interfaceC10447nMo35937c = interfaceC10449pM36618j.mo35937c(interfaceC10444k);
        if (interfaceC10449pM36618j.mo35928V(interfaceC10447nMo35937c)) {
            return interfaceC10449pM36618j.mo35963p(interfaceC10447nMo35937c);
        }
        if (interfaceC10449pM36618j.mo35963p(interfaceC10449pM36618j.mo35937c(interfaceC10444k))) {
            return true;
        }
        c10342d1.m36619k();
        ArrayDeque<InterfaceC10444k> arrayDequeM36616h = c10342d1.m36616h();
        C9801m.m32343c(arrayDequeM36616h);
        Set<InterfaceC10444k> setM36617i = c10342d1.m36617i();
        C9801m.m32343c(setM36617i);
        arrayDequeM36616h.push(interfaceC10444k);
        while (!arrayDequeM36616h.isEmpty()) {
            if (setM36617i.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC10444k + ". Supertypes = " + C10782c0.m38599e0(setM36617i, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC10444k interfaceC10444kPop = arrayDequeM36616h.pop();
            C9801m.m32345e(interfaceC10444kPop, "current");
            if (setM36617i.add(interfaceC10444kPop)) {
                C10342d1.c cVar = interfaceC10449pM36618j.mo35976v0(interfaceC10444kPop) ? C10342d1.c.C11570c.f40071a : C10342d1.c.b.f40070a;
                if (!(!C9801m.m32341a(cVar, C10342d1.c.C11570c.f40071a))) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    InterfaceC10449p interfaceC10449pM36618j2 = c10342d1.m36618j();
                    Iterator<InterfaceC10442i> it = interfaceC10449pM36618j2.mo35971t(interfaceC10449pM36618j2.mo35937c(interfaceC10444kPop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC10444k interfaceC10444kMo36629a = cVar.mo36629a(c10342d1, it.next());
                        if (interfaceC10449pM36618j.mo35963p(interfaceC10449pM36618j.mo35937c(interfaceC10444kMo36629a))) {
                            c10342d1.m36614e();
                            return true;
                        }
                        arrayDequeM36616h.add(interfaceC10444kMo36629a);
                    }
                }
            }
        }
        c10342d1.m36614e();
        return false;
    }

    /* renamed from: o */
    private final boolean m36647o(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i) {
        return (!interfaceC10449p.mo35979x(interfaceC10449p.mo35977w(interfaceC10442i)) || interfaceC10449p.mo35969s(interfaceC10442i) || interfaceC10449p.mo35905C(interfaceC10442i) || interfaceC10449p.mo35915I(interfaceC10442i) || !C9801m.m32341a(interfaceC10449p.mo35937c(interfaceC10449p.mo35948h0(interfaceC10442i)), interfaceC10449p.mo35937c(interfaceC10449p.mo35926T(interfaceC10442i)))) ? false : true;
    }

    /* renamed from: p */
    private final boolean m36648p(InterfaceC10449p interfaceC10449p, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        InterfaceC10444k interfaceC10444kMo35913H;
        InterfaceC10444k interfaceC10444kMo35913H2;
        InterfaceC10438e interfaceC10438eMo35970s0 = interfaceC10449p.mo35970s0(interfaceC10444k);
        if (interfaceC10438eMo35970s0 == null || (interfaceC10444kMo35913H = interfaceC10449p.mo35913H(interfaceC10438eMo35970s0)) == null) {
            interfaceC10444kMo35913H = interfaceC10444k;
        }
        InterfaceC10438e interfaceC10438eMo35970s02 = interfaceC10449p.mo35970s0(interfaceC10444k2);
        if (interfaceC10438eMo35970s02 == null || (interfaceC10444kMo35913H2 = interfaceC10449p.mo35913H(interfaceC10438eMo35970s02)) == null) {
            interfaceC10444kMo35913H2 = interfaceC10444k2;
        }
        if (interfaceC10449p.mo35937c(interfaceC10444kMo35913H) != interfaceC10449p.mo35937c(interfaceC10444kMo35913H2)) {
            return false;
        }
        if (interfaceC10449p.mo35905C(interfaceC10444k) || !interfaceC10449p.mo35905C(interfaceC10444k2)) {
            return !interfaceC10449p.mo35929W(interfaceC10444k) || interfaceC10449p.mo35929W(interfaceC10444k2);
        }
        return false;
    }

    /* renamed from: t */
    public static /* synthetic */ boolean m36649t(C10346f c10346f, C10342d1 c10342d1, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        return c10346f.m36658s(c10342d1, interfaceC10442i, interfaceC10442i2, z);
    }

    /* renamed from: u */
    private final boolean m36650u(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10444k interfaceC10444k2) {
        InterfaceC10442i interfaceC10442iMo35980x0;
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (f40079b) {
            if (!interfaceC10449pM36618j.mo35935b(interfaceC10444k) && !interfaceC10449pM36618j.mo35932Z(interfaceC10449pM36618j.mo35937c(interfaceC10444k))) {
                c10342d1.m36620l(interfaceC10444k);
            }
            if (!interfaceC10449pM36618j.mo35935b(interfaceC10444k2)) {
                c10342d1.m36620l(interfaceC10444k2);
            }
        }
        if (!C10337c.f40043a.m36592d(c10342d1, interfaceC10444k, interfaceC10444k2)) {
            return false;
        }
        C10346f c10346f = f40078a;
        Boolean boolM36636a = c10346f.m36636a(c10342d1, interfaceC10449pM36618j.mo35948h0(interfaceC10444k), interfaceC10449pM36618j.mo35926T(interfaceC10444k2));
        if (boolM36636a != null) {
            boolean zBooleanValue = boolM36636a.booleanValue();
            C10342d1.m36612d(c10342d1, interfaceC10444k, interfaceC10444k2, false, 4, null);
            return zBooleanValue;
        }
        InterfaceC10447n interfaceC10447nMo35937c = interfaceC10449pM36618j.mo35937c(interfaceC10444k2);
        if ((interfaceC10449pM36618j.mo35902A0(interfaceC10449pM36618j.mo35937c(interfaceC10444k), interfaceC10447nMo35937c) && interfaceC10449pM36618j.mo35947h(interfaceC10447nMo35937c) == 0) || interfaceC10449pM36618j.mo35954k0(interfaceC10449pM36618j.mo35937c(interfaceC10444k2))) {
            return true;
        }
        List<InterfaceC10444k> listM36655l = c10346f.m36655l(c10342d1, interfaceC10444k, interfaceC10447nMo35937c);
        int i2 = 10;
        ArrayList<InterfaceC10444k> arrayList = new ArrayList(C10819v.m38911u(listM36655l, 10));
        for (InterfaceC10444k interfaceC10444k3 : listM36655l) {
            InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449pM36618j.mo35933a(c10342d1.m36623o(interfaceC10444k3));
            if (interfaceC10444kMo35933a != null) {
                interfaceC10444k3 = interfaceC10444kMo35933a;
            }
            arrayList.add(interfaceC10444k3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f40078a.m36646n(c10342d1, interfaceC10444k);
        }
        if (size == 1) {
            return f40078a.m36656q(c10342d1, interfaceC10449pM36618j.mo35967r((InterfaceC10444k) C10813s.m38830U(arrayList)), interfaceC10444k2);
        }
        C10434a c10434a = new C10434a(interfaceC10449pM36618j.mo35947h(interfaceC10447nMo35937c));
        int iMo35947h = interfaceC10449pM36618j.mo35947h(interfaceC10447nMo35937c);
        int i3 = 0;
        boolean z = false;
        while (i3 < iMo35947h) {
            z = z || interfaceC10449pM36618j.mo35920N(interfaceC10449pM36618j.mo35907D(interfaceC10447nMo35937c, i3)) != EnumC10454u.OUT;
            if (!z) {
                ArrayList arrayList2 = new ArrayList(C10819v.m38911u(arrayList, i2));
                for (InterfaceC10444k interfaceC10444k4 : arrayList) {
                    InterfaceC10446m interfaceC10446mMo35908D0 = interfaceC10449pM36618j.mo35908D0(interfaceC10444k4, i3);
                    if (interfaceC10446mMo35908D0 != null) {
                        if (!(interfaceC10449pM36618j.mo35952j0(interfaceC10446mMo35908D0) == EnumC10454u.INV)) {
                            interfaceC10446mMo35908D0 = null;
                        }
                        if (interfaceC10446mMo35908D0 != null && (interfaceC10442iMo35980x0 = interfaceC10449pM36618j.mo35980x0(interfaceC10446mMo35908D0)) != null) {
                            arrayList2.add(interfaceC10442iMo35980x0);
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + interfaceC10444k4 + ", subType: " + interfaceC10444k + ", superType: " + interfaceC10444k2).toString());
                }
                c10434a.add(interfaceC10449pM36618j.mo35938c0(interfaceC10449pM36618j.mo35921O(arrayList2)));
            }
            i3++;
            i2 = 10;
        }
        if (z || !f40078a.m36656q(c10342d1, c10434a, interfaceC10444k2)) {
            return c10342d1.m36625q(new b(arrayList, c10342d1, interfaceC10449pM36618j, interfaceC10444k2));
        }
        return true;
    }

    /* renamed from: v */
    private final boolean m36651v(InterfaceC10449p interfaceC10449p, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2, InterfaceC10447n interfaceC10447n) {
        InterfaceC10448o interfaceC10448oMo35958m0;
        InterfaceC10444k interfaceC10444kMo35933a = interfaceC10449p.mo35933a(interfaceC10442i);
        if (!(interfaceC10444kMo35933a instanceof InterfaceC10437d)) {
            return false;
        }
        InterfaceC10437d interfaceC10437d = (InterfaceC10437d) interfaceC10444kMo35933a;
        if (interfaceC10449p.mo35965q(interfaceC10437d) || !interfaceC10449p.mo35918L(interfaceC10449p.mo35925S(interfaceC10449p.mo35940d0(interfaceC10437d))) || interfaceC10449p.mo35922P(interfaceC10437d) != EnumC10435b.FOR_SUBTYPING) {
            return false;
        }
        InterfaceC10447n interfaceC10447nMo35977w = interfaceC10449p.mo35977w(interfaceC10442i2);
        InterfaceC10453t interfaceC10453t = interfaceC10447nMo35977w instanceof InterfaceC10453t ? (InterfaceC10453t) interfaceC10447nMo35977w : null;
        return (interfaceC10453t == null || (interfaceC10448oMo35958m0 = interfaceC10449p.mo35958m0(interfaceC10453t)) == null || !interfaceC10449p.mo35961o(interfaceC10448oMo35958m0, interfaceC10447n)) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    private final List<InterfaceC10444k> m36652w(C10342d1 c10342d1, List<? extends InterfaceC10444k> list) {
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC10445l interfaceC10445lMo35967r = interfaceC10449pM36618j.mo35967r((InterfaceC10444k) next);
            int iMo35924R = interfaceC10449pM36618j.mo35924R(interfaceC10445lMo35967r);
            int i2 = 0;
            while (true) {
                if (i2 >= iMo35924R) {
                    break;
                }
                if (!(interfaceC10449pM36618j.mo35919M(interfaceC10449pM36618j.mo35980x0(interfaceC10449pM36618j.mo35973u(interfaceC10445lMo35967r, i2))) == null)) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.isEmpty() ^ true ? arrayList : list;
    }

    /* renamed from: j */
    public final EnumC10454u m36653j(EnumC10454u enumC10454u, EnumC10454u enumC10454u2) {
        C9801m.m32346f(enumC10454u, "declared");
        C9801m.m32346f(enumC10454u2, "useSite");
        EnumC10454u enumC10454u3 = EnumC10454u.INV;
        if (enumC10454u == enumC10454u3) {
            return enumC10454u2;
        }
        if (enumC10454u2 == enumC10454u3 || enumC10454u == enumC10454u2) {
            return enumC10454u;
        }
        return null;
    }

    /* renamed from: k */
    public final boolean m36654k(C10342d1 c10342d1, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2) {
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10442i, "a");
        C9801m.m32346f(interfaceC10442i2, "b");
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (interfaceC10442i == interfaceC10442i2) {
            return true;
        }
        C10346f c10346f = f40078a;
        if (c10346f.m36647o(interfaceC10449pM36618j, interfaceC10442i) && c10346f.m36647o(interfaceC10449pM36618j, interfaceC10442i2)) {
            InterfaceC10442i interfaceC10442iM36623o = c10342d1.m36623o(c10342d1.m36624p(interfaceC10442i));
            InterfaceC10442i interfaceC10442iM36623o2 = c10342d1.m36623o(c10342d1.m36624p(interfaceC10442i2));
            InterfaceC10444k interfaceC10444kMo35948h0 = interfaceC10449pM36618j.mo35948h0(interfaceC10442iM36623o);
            if (!interfaceC10449pM36618j.mo35902A0(interfaceC10449pM36618j.mo35977w(interfaceC10442iM36623o), interfaceC10449pM36618j.mo35977w(interfaceC10442iM36623o2))) {
                return false;
            }
            if (interfaceC10449pM36618j.mo35951j(interfaceC10444kMo35948h0) == 0) {
                return interfaceC10449pM36618j.mo35983z(interfaceC10442iM36623o) || interfaceC10449pM36618j.mo35983z(interfaceC10442iM36623o2) || interfaceC10449pM36618j.mo35929W(interfaceC10444kMo35948h0) == interfaceC10449pM36618j.mo35929W(interfaceC10449pM36618j.mo35948h0(interfaceC10442iM36623o2));
            }
        }
        return m36649t(c10346f, c10342d1, interfaceC10442i, interfaceC10442i2, false, 8, null) && m36649t(c10346f, c10342d1, interfaceC10442i2, interfaceC10442i, false, 8, null);
    }

    /* renamed from: l */
    public final List<InterfaceC10444k> m36655l(C10342d1 c10342d1, InterfaceC10444k interfaceC10444k, InterfaceC10447n interfaceC10447n) {
        C10342d1.c cVar;
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10444k, "subType");
        C9801m.m32346f(interfaceC10447n, "superConstructor");
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        if (interfaceC10449pM36618j.mo35976v0(interfaceC10444k)) {
            return f40078a.m36643h(c10342d1, interfaceC10444k, interfaceC10447n);
        }
        if (!interfaceC10449pM36618j.mo35928V(interfaceC10447n) && !interfaceC10449pM36618j.mo35966q0(interfaceC10447n)) {
            return f40078a.m36642g(c10342d1, interfaceC10444k, interfaceC10447n);
        }
        C10771e<InterfaceC10444k> c10771e = new C10771e();
        c10342d1.m36619k();
        ArrayDeque<InterfaceC10444k> arrayDequeM36616h = c10342d1.m36616h();
        C9801m.m32343c(arrayDequeM36616h);
        Set<InterfaceC10444k> setM36617i = c10342d1.m36617i();
        C9801m.m32343c(setM36617i);
        arrayDequeM36616h.push(interfaceC10444k);
        while (!arrayDequeM36616h.isEmpty()) {
            if (setM36617i.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + interfaceC10444k + ". Supertypes = " + C10782c0.m38599e0(setM36617i, null, null, null, 0, null, null, 63, null)).toString());
            }
            InterfaceC10444k interfaceC10444kPop = arrayDequeM36616h.pop();
            C9801m.m32345e(interfaceC10444kPop, "current");
            if (setM36617i.add(interfaceC10444kPop)) {
                if (interfaceC10449pM36618j.mo35976v0(interfaceC10444kPop)) {
                    c10771e.add(interfaceC10444kPop);
                    cVar = C10342d1.c.C11570c.f40071a;
                } else {
                    cVar = C10342d1.c.b.f40070a;
                }
                if (!(!C9801m.m32341a(cVar, C10342d1.c.C11570c.f40071a))) {
                    cVar = null;
                }
                if (cVar != null) {
                    InterfaceC10449p interfaceC10449pM36618j2 = c10342d1.m36618j();
                    Iterator<InterfaceC10442i> it = interfaceC10449pM36618j2.mo35971t(interfaceC10449pM36618j2.mo35937c(interfaceC10444kPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeM36616h.add(cVar.mo36629a(c10342d1, it.next()));
                    }
                }
            }
        }
        c10342d1.m36614e();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10444k interfaceC10444k2 : c10771e) {
            C10346f c10346f = f40078a;
            C9801m.m32345e(interfaceC10444k2, "it");
            C10827z.m38933z(arrayList, c10346f.m36643h(c10342d1, interfaceC10444k2, interfaceC10447n));
        }
        return arrayList;
    }

    /* renamed from: q */
    public final boolean m36656q(C10342d1 c10342d1, InterfaceC10445l interfaceC10445l, InterfaceC10444k interfaceC10444k) {
        boolean zM36654k;
        C9801m.m32346f(c10342d1, "<this>");
        C9801m.m32346f(interfaceC10445l, "capturedSubArguments");
        C9801m.m32346f(interfaceC10444k, "superType");
        InterfaceC10449p interfaceC10449pM36618j = c10342d1.m36618j();
        InterfaceC10447n interfaceC10447nMo35937c = interfaceC10449pM36618j.mo35937c(interfaceC10444k);
        int iMo35924R = interfaceC10449pM36618j.mo35924R(interfaceC10445l);
        int iMo35947h = interfaceC10449pM36618j.mo35947h(interfaceC10447nMo35937c);
        if (iMo35924R != iMo35947h || iMo35924R != interfaceC10449pM36618j.mo35951j(interfaceC10444k)) {
            return false;
        }
        for (int i2 = 0; i2 < iMo35947h; i2++) {
            InterfaceC10446m interfaceC10446mMo35946g0 = interfaceC10449pM36618j.mo35946g0(interfaceC10444k, i2);
            if (!interfaceC10449pM36618j.mo35918L(interfaceC10446mMo35946g0)) {
                InterfaceC10442i interfaceC10442iMo35980x0 = interfaceC10449pM36618j.mo35980x0(interfaceC10446mMo35946g0);
                InterfaceC10446m interfaceC10446mMo35973u = interfaceC10449pM36618j.mo35973u(interfaceC10445l, i2);
                interfaceC10449pM36618j.mo35952j0(interfaceC10446mMo35973u);
                EnumC10454u enumC10454u = EnumC10454u.INV;
                InterfaceC10442i interfaceC10442iMo35980x02 = interfaceC10449pM36618j.mo35980x0(interfaceC10446mMo35973u);
                C10346f c10346f = f40078a;
                EnumC10454u enumC10454uM36653j = c10346f.m36653j(interfaceC10449pM36618j.mo35920N(interfaceC10449pM36618j.mo35907D(interfaceC10447nMo35937c, i2)), interfaceC10449pM36618j.mo35952j0(interfaceC10446mMo35946g0));
                if (enumC10454uM36653j == null) {
                    return c10342d1.m36621m();
                }
                if (enumC10454uM36653j == enumC10454u && (c10346f.m36651v(interfaceC10449pM36618j, interfaceC10442iMo35980x02, interfaceC10442iMo35980x0, interfaceC10447nMo35937c) || c10346f.m36651v(interfaceC10449pM36618j, interfaceC10442iMo35980x0, interfaceC10442iMo35980x02, interfaceC10447nMo35937c))) {
                    continue;
                } else {
                    if (c10342d1.f40061g > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + interfaceC10442iMo35980x02).toString());
                    }
                    c10342d1.f40061g++;
                    int i3 = a.f40080a[enumC10454uM36653j.ordinal()];
                    if (i3 == 1) {
                        zM36654k = c10346f.m36654k(c10342d1, interfaceC10442iMo35980x02, interfaceC10442iMo35980x0);
                    } else if (i3 == 2) {
                        zM36654k = m36649t(c10346f, c10342d1, interfaceC10442iMo35980x02, interfaceC10442iMo35980x0, false, 8, null);
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM36654k = m36649t(c10346f, c10342d1, interfaceC10442iMo35980x0, interfaceC10442iMo35980x02, false, 8, null);
                    }
                    c10342d1.f40061g--;
                    if (!zM36654k) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m36657r(C10342d1 c10342d1, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2) {
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10442i, "subType");
        C9801m.m32346f(interfaceC10442i2, "superType");
        return m36649t(this, c10342d1, interfaceC10442i, interfaceC10442i2, false, 8, null);
    }

    /* renamed from: s */
    public final boolean m36658s(C10342d1 c10342d1, InterfaceC10442i interfaceC10442i, InterfaceC10442i interfaceC10442i2, boolean z) {
        C9801m.m32346f(c10342d1, "state");
        C9801m.m32346f(interfaceC10442i, "subType");
        C9801m.m32346f(interfaceC10442i2, "superType");
        if (interfaceC10442i == interfaceC10442i2) {
            return true;
        }
        if (c10342d1.mo35985f(interfaceC10442i, interfaceC10442i2)) {
            return m36644i(c10342d1, interfaceC10442i, interfaceC10442i2, z);
        }
        return false;
    }
}
