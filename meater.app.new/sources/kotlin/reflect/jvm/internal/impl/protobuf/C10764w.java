package kotlin.reflect.jvm.internal.impl.protobuf;

import okhttp3.HttpUrl;

/* compiled from: WireFormat.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w */
/* loaded from: classes3.dex */
public final class C10764w {

    /* renamed from: a */
    static final int f41372a = m38496c(1, 3);

    /* renamed from: b */
    static final int f41373b = m38496c(1, 4);

    /* renamed from: c */
    static final int f41374c = m38496c(2, 0);

    /* renamed from: d */
    static final int f41375d = m38496c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: WireFormat.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b */
    public static class b {

        /* renamed from: f */
        public static final b f41376f;

        /* renamed from: g */
        public static final b f41377g;

        /* renamed from: h */
        public static final b f41378h;

        /* renamed from: i */
        public static final b f41379i;

        /* renamed from: j */
        public static final b f41380j;

        /* renamed from: k */
        public static final b f41381k;

        /* renamed from: l */
        public static final b f41382l;

        /* renamed from: m */
        public static final b f41383m;

        /* renamed from: n */
        public static final b f41384n;

        /* renamed from: o */
        public static final b f41385o;

        /* renamed from: p */
        public static final b f41386p;

        /* renamed from: q */
        public static final b f41387q;

        /* renamed from: r */
        public static final b f41388r;

        /* renamed from: s */
        public static final b f41389s;

        /* renamed from: t */
        public static final b f41390t;

        /* renamed from: u */
        public static final b f41391u;

        /* renamed from: v */
        public static final b f41392v;

        /* renamed from: w */
        public static final b f41393w;

        /* renamed from: x */
        private static final /* synthetic */ b[] f41394x;

        /* renamed from: y */
        private final c f41395y;

        /* renamed from: z */
        private final int f41396z;

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$a */
        enum a extends b {
            a(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10764w.b
            /* renamed from: q */
            public boolean mo38499q() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$b, reason: collision with other inner class name */
        enum C11583b extends b {
            C11583b(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10764w.b
            /* renamed from: q */
            public boolean mo38499q() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$c */
        enum c extends b {
            c(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10764w.b
            /* renamed from: q */
            public boolean mo38499q() {
                return false;
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b$d */
        enum d extends b {
            d(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10764w.b
            /* renamed from: q */
            public boolean mo38499q() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f41376f = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f41377g = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f41378h = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f41379i = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f41380j = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f41381k = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f41382l = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f41383m = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f41384n = aVar;
            c cVar3 = c.MESSAGE;
            C11583b c11583b = new C11583b("GROUP", 9, cVar3, 3);
            f41385o = c11583b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f41386p = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f41387q = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f41388r = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f41389s = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f41390t = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f41391u = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f41392v = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f41393w = bVar14;
            f41394x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c11583b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f41394x.clone();
        }

        /* renamed from: g */
        public c m38497g() {
            return this.f41395y;
        }

        /* renamed from: k */
        public int m38498k() {
            return this.f41396z;
        }

        /* renamed from: q */
        public boolean mo38499q() {
            return true;
        }

        private b(String str, int i2, c cVar, int i3) {
            this.f41395y = cVar;
            this.f41396z = i3;
        }
    }

    /* compiled from: WireFormat.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(HttpUrl.FRAGMENT_ENCODE_SET),
        BYTE_STRING(AbstractC10745d.f41263f),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: p */
        private final Object f41407p;

        c(Object obj) {
            this.f41407p = obj;
        }
    }

    /* renamed from: a */
    public static int m38494a(int i2) {
        return i2 >>> 3;
    }

    /* renamed from: b */
    static int m38495b(int i2) {
        return i2 & 7;
    }

    /* renamed from: c */
    static int m38496c(int i2, int i3) {
        return (i2 << 3) | i3;
    }
}
