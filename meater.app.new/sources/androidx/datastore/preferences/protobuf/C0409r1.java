package androidx.datastore.preferences.protobuf;

import okhttp3.HttpUrl;

/* compiled from: WireFormat.java */
/* renamed from: androidx.datastore.preferences.protobuf.r1 */
/* loaded from: classes.dex */
public final class C0409r1 {

    /* renamed from: a */
    static final int f2874a = m3204c(1, 3);

    /* renamed from: b */
    static final int f2875b = m3204c(1, 4);

    /* renamed from: c */
    static final int f2876c = m3204c(2, 0);

    /* renamed from: d */
    static final int f2877d = m3204c(3, 2);

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
    /* renamed from: androidx.datastore.preferences.protobuf.r1$b */
    public static class b {

        /* renamed from: f */
        public static final b f2878f;

        /* renamed from: g */
        public static final b f2879g;

        /* renamed from: h */
        public static final b f2880h;

        /* renamed from: i */
        public static final b f2881i;

        /* renamed from: j */
        public static final b f2882j;

        /* renamed from: k */
        public static final b f2883k;

        /* renamed from: l */
        public static final b f2884l;

        /* renamed from: m */
        public static final b f2885m;

        /* renamed from: n */
        public static final b f2886n;

        /* renamed from: o */
        public static final b f2887o;

        /* renamed from: p */
        public static final b f2888p;

        /* renamed from: q */
        public static final b f2889q;

        /* renamed from: r */
        public static final b f2890r;

        /* renamed from: s */
        public static final b f2891s;

        /* renamed from: t */
        public static final b f2892t;

        /* renamed from: u */
        public static final b f2893u;

        /* renamed from: v */
        public static final b f2894v;

        /* renamed from: w */
        public static final b f2895w;

        /* renamed from: x */
        private static final /* synthetic */ b[] f2896x;

        /* renamed from: y */
        private final c f2897y;

        /* renamed from: z */
        private final int f2898z;

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.r1$b$a */
        enum a extends b {
            a(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.r1$b$b, reason: collision with other inner class name */
        enum C11438b extends b {
            C11438b(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.r1$b$c */
        enum c extends b {
            c(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: androidx.datastore.preferences.protobuf.r1$b$d */
        enum d extends b {
            d(String str, int i2, c cVar, int i3) {
                super(str, i2, cVar, i3);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f2878f = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2879g = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2880h = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2881i = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2882j = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2883k = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2884l = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2885m = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2886n = aVar;
            c cVar3 = c.MESSAGE;
            C11438b c11438b = new C11438b("GROUP", 9, cVar3, 3);
            f2887o = c11438b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2888p = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2889q = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2890r = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2891s = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2892t = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2893u = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2894v = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2895w = bVar14;
            f2896x = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c11438b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2896x.clone();
        }

        /* renamed from: g */
        public c m3205g() {
            return this.f2897y;
        }

        /* renamed from: k */
        public int m3206k() {
            return this.f2898z;
        }

        private b(String str, int i2, c cVar, int i3) {
            this.f2897y = cVar;
            this.f2898z = i3;
        }
    }

    /* compiled from: WireFormat.java */
    /* renamed from: androidx.datastore.preferences.protobuf.r1$c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(HttpUrl.FRAGMENT_ENCODE_SET),
        BYTE_STRING(AbstractC0377h.f2734f),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: p */
        private final Object f2909p;

        c(Object obj) {
            this.f2909p = obj;
        }
    }

    /* renamed from: a */
    public static int m3202a(int i2) {
        return i2 >>> 3;
    }

    /* renamed from: b */
    public static int m3203b(int i2) {
        return i2 & 7;
    }

    /* renamed from: c */
    static int m3204c(int i2, int i3) {
        return (i2 << 3) | i3;
    }
}
