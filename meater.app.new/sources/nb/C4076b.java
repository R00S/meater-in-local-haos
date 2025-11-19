package nb;

import kotlin.reflect.jvm.internal.impl.protobuf.i;
import lb.C3923c;
import lb.EnumC3930j;
import lb.EnumC3931k;
import lb.x;

/* compiled from: Flags.java */
/* renamed from: nb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4076b {

    /* renamed from: A, reason: collision with root package name */
    public static final C0626b f45797A;

    /* renamed from: B, reason: collision with root package name */
    public static final C0626b f45798B;

    /* renamed from: C, reason: collision with root package name */
    public static final C0626b f45799C;

    /* renamed from: D, reason: collision with root package name */
    public static final C0626b f45800D;

    /* renamed from: E, reason: collision with root package name */
    public static final C0626b f45801E;

    /* renamed from: F, reason: collision with root package name */
    public static final C0626b f45802F;

    /* renamed from: G, reason: collision with root package name */
    public static final C0626b f45803G;

    /* renamed from: H, reason: collision with root package name */
    public static final C0626b f45804H;

    /* renamed from: I, reason: collision with root package name */
    public static final C0626b f45805I;

    /* renamed from: J, reason: collision with root package name */
    public static final C0626b f45806J;

    /* renamed from: K, reason: collision with root package name */
    public static final C0626b f45807K;

    /* renamed from: L, reason: collision with root package name */
    public static final C0626b f45808L;

    /* renamed from: M, reason: collision with root package name */
    public static final C0626b f45809M;

    /* renamed from: N, reason: collision with root package name */
    public static final C0626b f45810N;

    /* renamed from: O, reason: collision with root package name */
    public static final C0626b f45811O;

    /* renamed from: P, reason: collision with root package name */
    public static final C0626b f45812P;

    /* renamed from: a, reason: collision with root package name */
    public static final C0626b f45813a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0626b f45814b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0626b f45815c;

    /* renamed from: d, reason: collision with root package name */
    public static final d<x> f45816d;

    /* renamed from: e, reason: collision with root package name */
    public static final d<EnumC3931k> f45817e;

    /* renamed from: f, reason: collision with root package name */
    public static final d<C3923c.EnumC0599c> f45818f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0626b f45819g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0626b f45820h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0626b f45821i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0626b f45822j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0626b f45823k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0626b f45824l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0626b f45825m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0626b f45826n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0626b f45827o;

    /* renamed from: p, reason: collision with root package name */
    public static final d<EnumC3930j> f45828p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0626b f45829q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0626b f45830r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0626b f45831s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0626b f45832t;

    /* renamed from: u, reason: collision with root package name */
    public static final C0626b f45833u;

    /* renamed from: v, reason: collision with root package name */
    public static final C0626b f45834v;

    /* renamed from: w, reason: collision with root package name */
    public static final C0626b f45835w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0626b f45836x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0626b f45837y;

    /* renamed from: z, reason: collision with root package name */
    public static final C0626b f45838z;

    /* compiled from: Flags.java */
    /* renamed from: nb.b$b, reason: collision with other inner class name */
    public static class C0626b extends d<Boolean> {
        public C0626b(int i10) {
            super(i10, 1);
        }

        @Override // nb.C4076b.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f45840a)) != 0);
        }

        @Override // nb.C4076b.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f45840a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: nb.b$c */
    private static class c<E extends i.a> extends d<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f45839c;

        public c(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f45839c = eArr;
        }

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // nb.C4076b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i10) {
            int i11 = (1 << this.f45841b) - 1;
            int i12 = this.f45840a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (E e10 : this.f45839c) {
                if (e10.e() == i13) {
                    return e10;
                }
            }
            return null;
        }

        @Override // nb.C4076b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e10) {
            return e10.e() << this.f45840a;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: nb.b$d */
    public static abstract class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f45840a;

        /* renamed from: b, reason: collision with root package name */
        public final int f45841b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lnb/b$d<*>;[TE;)Lnb/b$d<TE;>; */
        public static d a(d dVar, i.a[] aVarArr) {
            return new c(dVar.f45840a + dVar.f45841b, aVarArr);
        }

        public static C0626b b(d<?> dVar) {
            return new C0626b(dVar.f45840a + dVar.f45841b);
        }

        public static C0626b c() {
            return new C0626b(0);
        }

        public abstract E d(int i10);

        public abstract int e(E e10);

        private d(int i10, int i11) {
            this.f45840a = i10;
            this.f45841b = i11;
        }
    }

    static {
        C0626b c0626bC = d.c();
        f45813a = c0626bC;
        f45814b = d.b(c0626bC);
        C0626b c0626bC2 = d.c();
        f45815c = c0626bC2;
        d<x> dVarA = d.a(c0626bC2, x.values());
        f45816d = dVarA;
        d<EnumC3931k> dVarA2 = d.a(dVarA, EnumC3931k.values());
        f45817e = dVarA2;
        d<C3923c.EnumC0599c> dVarA3 = d.a(dVarA2, C3923c.EnumC0599c.values());
        f45818f = dVarA3;
        C0626b c0626bB = d.b(dVarA3);
        f45819g = c0626bB;
        C0626b c0626bB2 = d.b(c0626bB);
        f45820h = c0626bB2;
        C0626b c0626bB3 = d.b(c0626bB2);
        f45821i = c0626bB3;
        C0626b c0626bB4 = d.b(c0626bB3);
        f45822j = c0626bB4;
        C0626b c0626bB5 = d.b(c0626bB4);
        f45823k = c0626bB5;
        C0626b c0626bB6 = d.b(c0626bB5);
        f45824l = c0626bB6;
        f45825m = d.b(c0626bB6);
        C0626b c0626bB7 = d.b(dVarA);
        f45826n = c0626bB7;
        f45827o = d.b(c0626bB7);
        d<EnumC3930j> dVarA4 = d.a(dVarA2, EnumC3930j.values());
        f45828p = dVarA4;
        C0626b c0626bB8 = d.b(dVarA4);
        f45829q = c0626bB8;
        C0626b c0626bB9 = d.b(c0626bB8);
        f45830r = c0626bB9;
        C0626b c0626bB10 = d.b(c0626bB9);
        f45831s = c0626bB10;
        C0626b c0626bB11 = d.b(c0626bB10);
        f45832t = c0626bB11;
        C0626b c0626bB12 = d.b(c0626bB11);
        f45833u = c0626bB12;
        C0626b c0626bB13 = d.b(c0626bB12);
        f45834v = c0626bB13;
        C0626b c0626bB14 = d.b(c0626bB13);
        f45835w = c0626bB14;
        f45836x = d.b(c0626bB14);
        C0626b c0626bB15 = d.b(dVarA4);
        f45837y = c0626bB15;
        C0626b c0626bB16 = d.b(c0626bB15);
        f45838z = c0626bB16;
        C0626b c0626bB17 = d.b(c0626bB16);
        f45797A = c0626bB17;
        C0626b c0626bB18 = d.b(c0626bB17);
        f45798B = c0626bB18;
        C0626b c0626bB19 = d.b(c0626bB18);
        f45799C = c0626bB19;
        C0626b c0626bB20 = d.b(c0626bB19);
        f45800D = c0626bB20;
        C0626b c0626bB21 = d.b(c0626bB20);
        f45801E = c0626bB21;
        C0626b c0626bB22 = d.b(c0626bB21);
        f45802F = c0626bB22;
        f45803G = d.b(c0626bB22);
        C0626b c0626bB23 = d.b(c0626bC2);
        f45804H = c0626bB23;
        C0626b c0626bB24 = d.b(c0626bB23);
        f45805I = c0626bB24;
        f45806J = d.b(c0626bB24);
        C0626b c0626bB25 = d.b(dVarA2);
        f45807K = c0626bB25;
        C0626b c0626bB26 = d.b(c0626bB25);
        f45808L = c0626bB26;
        f45809M = d.b(c0626bB26);
        C0626b c0626bC3 = d.c();
        f45810N = c0626bC3;
        f45811O = d.b(c0626bC3);
        f45812P = d.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L2b
            if (r5 == r3) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L2f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.C4076b.a(int):void");
    }

    public static int b(boolean z10, x xVar, EnumC3931k enumC3931k, boolean z11, boolean z12, boolean z13) {
        if (xVar == null) {
            a(10);
        }
        if (enumC3931k == null) {
            a(11);
        }
        return f45815c.e(Boolean.valueOf(z10)) | f45817e.e(enumC3931k) | f45816d.e(xVar) | f45807K.e(Boolean.valueOf(z11)) | f45808L.e(Boolean.valueOf(z12)) | f45809M.e(Boolean.valueOf(z13));
    }
}
