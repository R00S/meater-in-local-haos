package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil.java */
/* renamed from: androidx.datastore.preferences.protobuf.p1 */
/* loaded from: classes.dex */
final class C0403p1 {

    /* renamed from: a */
    private static final Logger f2847a = Logger.getLogger(C0403p1.class.getName());

    /* renamed from: b */
    private static final Unsafe f2848b = m3082B();

    /* renamed from: c */
    private static final Class<?> f2849c = C0365d.m2593b();

    /* renamed from: d */
    private static final boolean f2850d = m3110m(Long.TYPE);

    /* renamed from: e */
    private static final boolean f2851e = m3110m(Integer.TYPE);

    /* renamed from: f */
    private static final e f2852f = m3123z();

    /* renamed from: g */
    private static final boolean f2853g = m3097Q();

    /* renamed from: h */
    private static final boolean f2854h = m3096P();

    /* renamed from: i */
    static final long f2855i;

    /* renamed from: j */
    private static final long f2856j;

    /* renamed from: k */
    private static final long f2857k;

    /* renamed from: l */
    private static final long f2858l;

    /* renamed from: m */
    private static final long f2859m;

    /* renamed from: n */
    private static final long f2860n;

    /* renamed from: o */
    private static final long f2861o;

    /* renamed from: p */
    private static final long f2862p;

    /* renamed from: q */
    private static final long f2863q;

    /* renamed from: r */
    private static final long f2864r;

    /* renamed from: s */
    private static final long f2865s;

    /* renamed from: t */
    private static final long f2866t;

    /* renamed from: u */
    private static final long f2867u;

    /* renamed from: v */
    private static final long f2868v;

    /* renamed from: w */
    private static final int f2869w;

    /* renamed from: x */
    static final boolean f2870x;

    /* compiled from: UnsafeUtil.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p1$a */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p1$b */
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: c */
        public boolean mo3125c(Object obj, long j2) {
            return C0403p1.f2870x ? C0403p1.m3114q(obj, j2) : C0403p1.m3115r(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: d */
        public byte mo3126d(Object obj, long j2) {
            return C0403p1.f2870x ? C0403p1.m3117t(obj, j2) : C0403p1.m3118u(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: e */
        public double mo3127e(Object obj, long j2) {
            return Double.longBitsToDouble(m3136h(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: f */
        public float mo3128f(Object obj, long j2) {
            return Float.intBitsToFloat(m3135g(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: k */
        public void mo3129k(Object obj, long j2, boolean z) {
            if (C0403p1.f2870x) {
                C0403p1.m3086F(obj, j2, z);
            } else {
                C0403p1.m3087G(obj, j2, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: l */
        public void mo3130l(Object obj, long j2, byte b2) {
            if (C0403p1.f2870x) {
                C0403p1.m3089I(obj, j2, b2);
            } else {
                C0403p1.m3090J(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: m */
        public void mo3131m(Object obj, long j2, double d2) {
            m3140p(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: n */
        public void mo3132n(Object obj, long j2, float f2) {
            m3139o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p1$c */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: c */
        public boolean mo3125c(Object obj, long j2) {
            return C0403p1.f2870x ? C0403p1.m3114q(obj, j2) : C0403p1.m3115r(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: d */
        public byte mo3126d(Object obj, long j2) {
            return C0403p1.f2870x ? C0403p1.m3117t(obj, j2) : C0403p1.m3118u(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: e */
        public double mo3127e(Object obj, long j2) {
            return Double.longBitsToDouble(m3136h(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: f */
        public float mo3128f(Object obj, long j2) {
            return Float.intBitsToFloat(m3135g(obj, j2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: k */
        public void mo3129k(Object obj, long j2, boolean z) {
            if (C0403p1.f2870x) {
                C0403p1.m3086F(obj, j2, z);
            } else {
                C0403p1.m3087G(obj, j2, z);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: l */
        public void mo3130l(Object obj, long j2, byte b2) {
            if (C0403p1.f2870x) {
                C0403p1.m3089I(obj, j2, b2);
            } else {
                C0403p1.m3090J(obj, j2, b2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: m */
        public void mo3131m(Object obj, long j2, double d2) {
            m3140p(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: n */
        public void mo3132n(Object obj, long j2, float f2) {
            m3139o(obj, j2, Float.floatToIntBits(f2));
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p1$d */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: c */
        public boolean mo3125c(Object obj, long j2) {
            return this.f2871a.getBoolean(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: d */
        public byte mo3126d(Object obj, long j2) {
            return this.f2871a.getByte(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: e */
        public double mo3127e(Object obj, long j2) {
            return this.f2871a.getDouble(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: f */
        public float mo3128f(Object obj, long j2) {
            return this.f2871a.getFloat(obj, j2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: k */
        public void mo3129k(Object obj, long j2, boolean z) {
            this.f2871a.putBoolean(obj, j2, z);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: l */
        public void mo3130l(Object obj, long j2, byte b2) {
            this.f2871a.putByte(obj, j2, b2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: m */
        public void mo3131m(Object obj, long j2, double d2) {
            this.f2871a.putDouble(obj, j2, d2);
        }

        @Override // androidx.datastore.preferences.protobuf.C0403p1.e
        /* renamed from: n */
        public void mo3132n(Object obj, long j2, float f2) {
            this.f2871a.putFloat(obj, j2, f2);
        }
    }

    /* compiled from: UnsafeUtil.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p1$e */
    private static abstract class e {

        /* renamed from: a */
        Unsafe f2871a;

        e(Unsafe unsafe) {
            this.f2871a = unsafe;
        }

        /* renamed from: a */
        public final int m3133a(Class<?> cls) {
            return this.f2871a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m3134b(Class<?> cls) {
            return this.f2871a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo3125c(Object obj, long j2);

        /* renamed from: d */
        public abstract byte mo3126d(Object obj, long j2);

        /* renamed from: e */
        public abstract double mo3127e(Object obj, long j2);

        /* renamed from: f */
        public abstract float mo3128f(Object obj, long j2);

        /* renamed from: g */
        public final int m3135g(Object obj, long j2) {
            return this.f2871a.getInt(obj, j2);
        }

        /* renamed from: h */
        public final long m3136h(Object obj, long j2) {
            return this.f2871a.getLong(obj, j2);
        }

        /* renamed from: i */
        public final Object m3137i(Object obj, long j2) {
            return this.f2871a.getObject(obj, j2);
        }

        /* renamed from: j */
        public final long m3138j(Field field) {
            return this.f2871a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo3129k(Object obj, long j2, boolean z);

        /* renamed from: l */
        public abstract void mo3130l(Object obj, long j2, byte b2);

        /* renamed from: m */
        public abstract void mo3131m(Object obj, long j2, double d2);

        /* renamed from: n */
        public abstract void mo3132n(Object obj, long j2, float f2);

        /* renamed from: o */
        public final void m3139o(Object obj, long j2, int i2) {
            this.f2871a.putInt(obj, j2, i2);
        }

        /* renamed from: p */
        public final void m3140p(Object obj, long j2, long j3) {
            this.f2871a.putLong(obj, j2, j3);
        }

        /* renamed from: q */
        public final void m3141q(Object obj, long j2, Object obj2) {
            this.f2871a.putObject(obj, j2, obj2);
        }
    }

    static {
        long jM3107j = m3107j(byte[].class);
        f2855i = jM3107j;
        f2856j = m3107j(boolean[].class);
        f2857k = m3108k(boolean[].class);
        f2858l = m3107j(int[].class);
        f2859m = m3108k(int[].class);
        f2860n = m3107j(long[].class);
        f2861o = m3108k(long[].class);
        f2862p = m3107j(float[].class);
        f2863q = m3108k(float[].class);
        f2864r = m3107j(double[].class);
        f2865s = m3108k(double[].class);
        f2866t = m3107j(Object[].class);
        f2867u = m3108k(Object[].class);
        f2868v = m3112o(m3109l());
        f2869w = (int) (7 & jM3107j);
        f2870x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C0403p1() {
    }

    /* renamed from: A */
    static Object m3081A(Object obj, long j2) {
        return f2852f.m3137i(obj, j2);
    }

    /* renamed from: B */
    static Unsafe m3082B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    static boolean m3083C() {
        return f2854h;
    }

    /* renamed from: D */
    static boolean m3084D() {
        return f2853g;
    }

    /* renamed from: E */
    static void m3085E(Object obj, long j2, boolean z) {
        f2852f.mo3129k(obj, j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static void m3086F(Object obj, long j2, boolean z) {
        m3089I(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static void m3087G(Object obj, long j2, boolean z) {
        m3090J(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: H */
    static void m3088H(byte[] bArr, long j2, byte b2) {
        f2852f.mo3130l(bArr, f2855i + j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static void m3089I(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        m3093M(obj, j3, ((255 & b2) << i2) | (m3121x(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static void m3090J(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m3093M(obj, j3, ((255 & b2) << i2) | (m3121x(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* renamed from: K */
    static void m3091K(Object obj, long j2, double d2) {
        f2852f.mo3131m(obj, j2, d2);
    }

    /* renamed from: L */
    static void m3092L(Object obj, long j2, float f2) {
        f2852f.mo3132n(obj, j2, f2);
    }

    /* renamed from: M */
    static void m3093M(Object obj, long j2, int i2) {
        f2852f.m3139o(obj, j2, i2);
    }

    /* renamed from: N */
    static void m3094N(Object obj, long j2, long j3) {
        f2852f.m3140p(obj, j2, j3);
    }

    /* renamed from: O */
    static void m3095O(Object obj, long j2, Object obj2) {
        f2852f.m3141q(obj, j2, obj2);
    }

    /* renamed from: P */
    private static boolean m3096P() {
        Unsafe unsafe = f2848b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (C0365d.m2594c()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            f2847a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: Q */
    private static boolean m3097Q() {
        Unsafe unsafe = f2848b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m3109l() == null) {
                return false;
            }
            if (C0365d.m2594c()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            f2847a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    static <T> T m3106i(Class<T> cls) {
        try {
            return (T) f2848b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: j */
    private static int m3107j(Class<?> cls) {
        if (f2854h) {
            return f2852f.m3133a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    private static int m3108k(Class<?> cls) {
        if (f2854h) {
            return f2852f.m3134b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    private static Field m3109l() {
        Field fieldM3111n;
        if (C0365d.m2594c() && (fieldM3111n = m3111n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM3111n;
        }
        Field fieldM3111n2 = m3111n(Buffer.class, "address");
        if (fieldM3111n2 == null || fieldM3111n2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM3111n2;
    }

    /* renamed from: m */
    private static boolean m3110m(Class<?> cls) {
        if (!C0365d.m2594c()) {
            return false;
        }
        try {
            Class<?> cls2 = f2849c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    private static Field m3111n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    private static long m3112o(Field field) {
        e eVar;
        if (field == null || (eVar = f2852f) == null) {
            return -1L;
        }
        return eVar.m3138j(field);
    }

    /* renamed from: p */
    static boolean m3113p(Object obj, long j2) {
        return f2852f.mo3125c(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static boolean m3114q(Object obj, long j2) {
        return m3117t(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static boolean m3115r(Object obj, long j2) {
        return m3118u(obj, j2) != 0;
    }

    /* renamed from: s */
    static byte m3116s(byte[] bArr, long j2) {
        return f2852f.mo3126d(bArr, f2855i + j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static byte m3117t(Object obj, long j2) {
        return (byte) ((m3121x(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static byte m3118u(Object obj, long j2) {
        return (byte) ((m3121x(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255);
    }

    /* renamed from: v */
    static double m3119v(Object obj, long j2) {
        return f2852f.mo3127e(obj, j2);
    }

    /* renamed from: w */
    static float m3120w(Object obj, long j2) {
        return f2852f.mo3128f(obj, j2);
    }

    /* renamed from: x */
    static int m3121x(Object obj, long j2) {
        return f2852f.m3135g(obj, j2);
    }

    /* renamed from: y */
    static long m3122y(Object obj, long j2) {
        return f2852f.m3136h(obj, j2);
    }

    /* renamed from: z */
    private static e m3123z() {
        Unsafe unsafe = f2848b;
        if (unsafe == null) {
            return null;
        }
        if (!C0365d.m2594c()) {
            return new d(unsafe);
        }
        if (f2850d) {
            return new c(unsafe);
        }
        if (f2851e) {
            return new b(unsafe);
        }
        return null;
    }
}
