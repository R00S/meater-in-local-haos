package androidx.datastore.preferences.protobuf;

/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f25047a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f25048b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f25049c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f25050d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'F' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: WireFormat.java */
    public static class b {

        /* renamed from: D, reason: collision with root package name */
        public static final b f25051D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f25052E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f25053F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f25054G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f25055H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f25056I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f25057J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f25058K;

        /* renamed from: L, reason: collision with root package name */
        public static final b f25059L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f25060M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f25061N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f25062O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f25063P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f25064Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f25065R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f25066S;

        /* renamed from: T, reason: collision with root package name */
        public static final b f25067T;

        /* renamed from: U, reason: collision with root package name */
        public static final b f25068U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ b[] f25069V;

        /* renamed from: B, reason: collision with root package name */
        private final c f25070B;

        /* renamed from: C, reason: collision with root package name */
        private final int f25071C;

        /* compiled from: WireFormat.java */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.r0$b$b, reason: collision with other inner class name */
        enum C0352b extends b {
            C0352b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* compiled from: WireFormat.java */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f25051D = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f25052E = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f25053F = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f25054G = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f25055H = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f25056I = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f25057J = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f25058K = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f25059L = aVar;
            c cVar3 = c.MESSAGE;
            C0352b c0352b = new C0352b("GROUP", 9, cVar3, 3);
            f25060M = c0352b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f25061N = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f25062O = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f25063P = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f25064Q = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f25065R = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f25066S = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f25067T = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f25068U = bVar14;
            f25069V = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0352b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25069V.clone();
        }

        public c c() {
            return this.f25070B;
        }

        public int j() {
            return this.f25071C;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f25070B = cVar;
            this.f25071C = i11;
        }
    }

    /* compiled from: WireFormat.java */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC2062h.f24923C),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: B, reason: collision with root package name */
        private final Object f25082B;

        c(Object obj) {
            this.f25082B = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
