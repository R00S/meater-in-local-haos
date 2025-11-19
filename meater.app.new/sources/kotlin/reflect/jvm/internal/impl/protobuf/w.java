package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: WireFormat.java */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    static final int f44134a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f44135b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f44136c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f44137d = c(3, 2);

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
        public static final b f44138D;

        /* renamed from: E, reason: collision with root package name */
        public static final b f44139E;

        /* renamed from: F, reason: collision with root package name */
        public static final b f44140F;

        /* renamed from: G, reason: collision with root package name */
        public static final b f44141G;

        /* renamed from: H, reason: collision with root package name */
        public static final b f44142H;

        /* renamed from: I, reason: collision with root package name */
        public static final b f44143I;

        /* renamed from: J, reason: collision with root package name */
        public static final b f44144J;

        /* renamed from: K, reason: collision with root package name */
        public static final b f44145K;

        /* renamed from: L, reason: collision with root package name */
        public static final b f44146L;

        /* renamed from: M, reason: collision with root package name */
        public static final b f44147M;

        /* renamed from: N, reason: collision with root package name */
        public static final b f44148N;

        /* renamed from: O, reason: collision with root package name */
        public static final b f44149O;

        /* renamed from: P, reason: collision with root package name */
        public static final b f44150P;

        /* renamed from: Q, reason: collision with root package name */
        public static final b f44151Q;

        /* renamed from: R, reason: collision with root package name */
        public static final b f44152R;

        /* renamed from: S, reason: collision with root package name */
        public static final b f44153S;

        /* renamed from: T, reason: collision with root package name */
        public static final b f44154T;

        /* renamed from: U, reason: collision with root package name */
        public static final b f44155U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ b[] f44156V;

        /* renamed from: B, reason: collision with root package name */
        private final c f44157B;

        /* renamed from: C, reason: collision with root package name */
        private final int f44158C;

        /* compiled from: WireFormat.java */
        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean n() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$b, reason: collision with other inner class name */
        enum C0585b extends b {
            C0585b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean n() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean n() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.w.b
            public boolean n() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f44138D = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f44139E = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f44140F = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f44141G = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f44142H = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f44143I = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f44144J = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f44145K = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f44146L = aVar;
            c cVar3 = c.MESSAGE;
            C0585b c0585b = new C0585b("GROUP", 9, cVar3, 3);
            f44147M = c0585b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f44148N = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f44149O = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f44150P = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f44151Q = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f44152R = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f44153S = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f44154T = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f44155U = bVar14;
            f44156V = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0585b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f44156V.clone();
        }

        public c c() {
            return this.f44157B;
        }

        public int j() {
            return this.f44158C;
        }

        public boolean n() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f44157B = cVar;
            this.f44158C = i11;
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
        BYTE_STRING(d.f44026B),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: B, reason: collision with root package name */
        private final Object f44169B;

        c(Object obj) {
            this.f44169B = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
