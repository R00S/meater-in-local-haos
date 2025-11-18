package kotlin.reflect.p371y.internal.p374j0.p392e.p396z;

import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10131j;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10132k;
import kotlin.reflect.p371y.internal.p374j0.p392e.EnumC10145x;

/* compiled from: Flags.java */
/* renamed from: kotlin.f0.y.e.j0.e.z.b */
/* loaded from: classes3.dex */
public class C10150b {

    /* renamed from: A */
    public static final b f39189A;

    /* renamed from: B */
    public static final b f39190B;

    /* renamed from: C */
    public static final b f39191C;

    /* renamed from: D */
    public static final b f39192D;

    /* renamed from: E */
    public static final b f39193E;

    /* renamed from: F */
    public static final b f39194F;

    /* renamed from: G */
    public static final b f39195G;

    /* renamed from: H */
    public static final b f39196H;

    /* renamed from: I */
    public static final b f39197I;

    /* renamed from: J */
    public static final b f39198J;

    /* renamed from: K */
    public static final b f39199K;

    /* renamed from: L */
    public static final b f39200L;

    /* renamed from: M */
    public static final b f39201M;

    /* renamed from: N */
    public static final b f39202N;

    /* renamed from: O */
    public static final b f39203O;

    /* renamed from: a */
    public static final b f39204a;

    /* renamed from: b */
    public static final b f39205b;

    /* renamed from: c */
    public static final b f39206c;

    /* renamed from: d */
    public static final d<EnumC10145x> f39207d;

    /* renamed from: e */
    public static final d<EnumC10132k> f39208e;

    /* renamed from: f */
    public static final d<C10124c.c> f39209f;

    /* renamed from: g */
    public static final b f39210g;

    /* renamed from: h */
    public static final b f39211h;

    /* renamed from: i */
    public static final b f39212i;

    /* renamed from: j */
    public static final b f39213j;

    /* renamed from: k */
    public static final b f39214k;

    /* renamed from: l */
    public static final b f39215l;

    /* renamed from: m */
    public static final b f39216m;

    /* renamed from: n */
    public static final b f39217n;

    /* renamed from: o */
    public static final d<EnumC10131j> f39218o;

    /* renamed from: p */
    public static final b f39219p;

    /* renamed from: q */
    public static final b f39220q;

    /* renamed from: r */
    public static final b f39221r;

    /* renamed from: s */
    public static final b f39222s;

    /* renamed from: t */
    public static final b f39223t;

    /* renamed from: u */
    public static final b f39224u;

    /* renamed from: v */
    public static final b f39225v;

    /* renamed from: w */
    public static final b f39226w;

    /* renamed from: x */
    public static final b f39227x;

    /* renamed from: y */
    public static final b f39228y;

    /* renamed from: z */
    public static final b f39229z;

    /* compiled from: Flags.java */
    /* renamed from: kotlin.f0.y.e.j0.e.z.b$b */
    public static class b extends d<Boolean> {
        public b(int i2) {
            super(i2, 1);
        }

        /* renamed from: f */
        private static /* synthetic */ void m35367f(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b.d
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Boolean mo35368d(int i2) {
            Boolean boolValueOf = Boolean.valueOf((i2 & (1 << this.f39231a)) != 0);
            if (boolValueOf == null) {
                m35367f(0);
            }
            return boolValueOf;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int mo35369e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f39231a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: kotlin.f0.y.e.j0.e.z.b$c */
    private static class c<E extends C10750i.a> extends d<E> {

        /* renamed from: c */
        private final E[] f39230c;

        public c(int i2, E[] eArr) {
            super(i2, m35373g(eArr));
            this.f39230c = eArr;
        }

        /* renamed from: f */
        private static /* synthetic */ void m35372f(int i2) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        /* renamed from: g */
        private static <E> int m35373g(E[] eArr) {
            if (eArr == null) {
                m35372f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i2 = 31; i2 >= 0; i2--) {
                if (((1 << i2) & length) != 0) {
                    return i2 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b.d
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E mo35368d(int i2) {
            int i3 = (1 << this.f39232b) - 1;
            int i4 = this.f39231a;
            int i5 = (i2 & (i3 << i4)) >> i4;
            for (E e2 : this.f39230c) {
                if (e2.mo34235f() == i5) {
                    return e2;
                }
            }
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b.d
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int mo35369e(E e2) {
            return e2.mo34235f() << this.f39231a;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: kotlin.f0.y.e.j0.e.z.b$d */
    public static abstract class d<E> {

        /* renamed from: a */
        public final int f39231a;

        /* renamed from: b */
        public final int f39232b;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/i$a;>(Lkotlin/f0/y/e/j0/e/z/b$d<*>;[TE;)Lkotlin/f0/y/e/j0/e/z/b$d<TE;>; */
        /* renamed from: a */
        public static d m35376a(d dVar, C10750i.a[] aVarArr) {
            return new c(dVar.f39231a + dVar.f39232b, aVarArr);
        }

        /* renamed from: b */
        public static b m35377b(d<?> dVar) {
            return new b(dVar.f39231a + dVar.f39232b);
        }

        /* renamed from: c */
        public static b m35378c() {
            return new b(0);
        }

        /* renamed from: d */
        public abstract E mo35368d(int i2);

        /* renamed from: e */
        public abstract int mo35369e(E e2);

        private d(int i2, int i3) {
            this.f39231a = i2;
            this.f39232b = i3;
        }
    }

    static {
        b bVarM35378c = d.m35378c();
        f39204a = bVarM35378c;
        f39205b = d.m35377b(bVarM35378c);
        b bVarM35378c2 = d.m35378c();
        f39206c = bVarM35378c2;
        d<EnumC10145x> dVarM35376a = d.m35376a(bVarM35378c2, EnumC10145x.values());
        f39207d = dVarM35376a;
        d<EnumC10132k> dVarM35376a2 = d.m35376a(dVarM35376a, EnumC10132k.values());
        f39208e = dVarM35376a2;
        d<C10124c.c> dVarM35376a3 = d.m35376a(dVarM35376a2, C10124c.c.values());
        f39209f = dVarM35376a3;
        b bVarM35377b = d.m35377b(dVarM35376a3);
        f39210g = bVarM35377b;
        b bVarM35377b2 = d.m35377b(bVarM35377b);
        f39211h = bVarM35377b2;
        b bVarM35377b3 = d.m35377b(bVarM35377b2);
        f39212i = bVarM35377b3;
        b bVarM35377b4 = d.m35377b(bVarM35377b3);
        f39213j = bVarM35377b4;
        b bVarM35377b5 = d.m35377b(bVarM35377b4);
        f39214k = bVarM35377b5;
        f39215l = d.m35377b(bVarM35377b5);
        b bVarM35377b6 = d.m35377b(dVarM35376a);
        f39216m = bVarM35377b6;
        f39217n = d.m35377b(bVarM35377b6);
        d<EnumC10131j> dVarM35376a4 = d.m35376a(dVarM35376a2, EnumC10131j.values());
        f39218o = dVarM35376a4;
        b bVarM35377b7 = d.m35377b(dVarM35376a4);
        f39219p = bVarM35377b7;
        b bVarM35377b8 = d.m35377b(bVarM35377b7);
        f39220q = bVarM35377b8;
        b bVarM35377b9 = d.m35377b(bVarM35377b8);
        f39221r = bVarM35377b9;
        b bVarM35377b10 = d.m35377b(bVarM35377b9);
        f39222s = bVarM35377b10;
        b bVarM35377b11 = d.m35377b(bVarM35377b10);
        f39223t = bVarM35377b11;
        b bVarM35377b12 = d.m35377b(bVarM35377b11);
        f39224u = bVarM35377b12;
        b bVarM35377b13 = d.m35377b(bVarM35377b12);
        f39225v = bVarM35377b13;
        f39226w = d.m35377b(bVarM35377b13);
        b bVarM35377b14 = d.m35377b(dVarM35376a4);
        f39227x = bVarM35377b14;
        b bVarM35377b15 = d.m35377b(bVarM35377b14);
        f39228y = bVarM35377b15;
        b bVarM35377b16 = d.m35377b(bVarM35377b15);
        f39229z = bVarM35377b16;
        b bVarM35377b17 = d.m35377b(bVarM35377b16);
        f39189A = bVarM35377b17;
        b bVarM35377b18 = d.m35377b(bVarM35377b17);
        f39190B = bVarM35377b18;
        b bVarM35377b19 = d.m35377b(bVarM35377b18);
        f39191C = bVarM35377b19;
        b bVarM35377b20 = d.m35377b(bVarM35377b19);
        f39192D = bVarM35377b20;
        b bVarM35377b21 = d.m35377b(bVarM35377b20);
        f39193E = bVarM35377b21;
        f39194F = d.m35377b(bVarM35377b21);
        b bVarM35377b22 = d.m35377b(bVarM35378c2);
        f39195G = bVarM35377b22;
        b bVarM35377b23 = d.m35377b(bVarM35377b22);
        f39196H = bVarM35377b23;
        f39197I = d.m35377b(bVarM35377b23);
        b bVarM35377b24 = d.m35377b(dVarM35376a2);
        f39198J = bVarM35377b24;
        b bVarM35377b25 = d.m35377b(bVarM35377b24);
        f39199K = bVarM35377b25;
        f39200L = d.m35377b(bVarM35377b25);
        b bVarM35378c3 = d.m35378c();
        f39201M = bVarM35378c3;
        f39202N = d.m35377b(bVarM35378c3);
        f39203O = d.m35378c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m35365a(int r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10150b.m35365a(int):void");
    }

    /* renamed from: b */
    public static int m35366b(boolean z, EnumC10145x enumC10145x, EnumC10132k enumC10132k, boolean z2, boolean z3, boolean z4) {
        if (enumC10145x == null) {
            m35365a(10);
        }
        if (enumC10132k == null) {
            m35365a(11);
        }
        return f39206c.mo35369e(Boolean.valueOf(z)) | f39208e.mo35369e(enumC10132k) | f39207d.mo35369e(enumC10145x) | f39198J.mo35369e(Boolean.valueOf(z2)) | f39199K.mo35369e(Boolean.valueOf(z3)) | f39200L.mo35369e(Boolean.valueOf(z4));
    }
}
