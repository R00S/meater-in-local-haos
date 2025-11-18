package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.k4 */
/* loaded from: classes2.dex */
final class C7538k4 {

    /* renamed from: a */
    private static final Logger f27791a = Logger.getLogger(C7538k4.class.getName());

    /* renamed from: b */
    private static final Unsafe f27792b;

    /* renamed from: c */
    private static final Class<?> f27793c;

    /* renamed from: d */
    private static final boolean f27794d;

    /* renamed from: e */
    private static final boolean f27795e;

    /* renamed from: f */
    private static final d f27796f;

    /* renamed from: g */
    private static final boolean f27797g;

    /* renamed from: h */
    private static final boolean f27798h;

    /* renamed from: i */
    private static final long f27799i;

    /* renamed from: j */
    private static final long f27800j;

    /* renamed from: k */
    private static final long f27801k;

    /* renamed from: l */
    private static final long f27802l;

    /* renamed from: m */
    private static final long f27803m;

    /* renamed from: n */
    private static final long f27804n;

    /* renamed from: o */
    private static final long f27805o;

    /* renamed from: p */
    private static final long f27806p;

    /* renamed from: q */
    private static final long f27807q;

    /* renamed from: r */
    private static final long f27808r;

    /* renamed from: s */
    private static final long f27809s;

    /* renamed from: t */
    private static final long f27810t;

    /* renamed from: u */
    private static final long f27811u;

    /* renamed from: v */
    private static final long f27812v;

    /* renamed from: w */
    private static final int f27813w;

    /* renamed from: x */
    static final boolean f27814x;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.k4$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: a */
        public final byte mo21215a(Object obj, long j2) {
            return C7538k4.f27814x ? C7538k4.m21185L(obj, j2) : C7538k4.m21186M(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: b */
        public final void mo21216b(Object obj, long j2, byte b2) {
            if (C7538k4.f27814x) {
                C7538k4.m21209u(obj, j2, b2);
            } else {
                C7538k4.m21213y(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: c */
        public final void mo21217c(Object obj, long j2, double d2) {
            m21224f(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: d */
        public final void mo21218d(Object obj, long j2, float f2) {
            m21223e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: g */
        public final void mo21219g(Object obj, long j2, boolean z) {
            if (C7538k4.f27814x) {
                C7538k4.m21214z(obj, j2, z);
            } else {
                C7538k4.m21177D(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: h */
        public final boolean mo21220h(Object obj, long j2) {
            return C7538k4.f27814x ? C7538k4.m21187N(obj, j2) : C7538k4.m21188O(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: i */
        public final float mo21221i(Object obj, long j2) {
            return Float.intBitsToFloat(m21225k(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: j */
        public final double mo21222j(Object obj, long j2) {
            return Double.longBitsToDouble(m21226l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.k4$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: a */
        public final byte mo21215a(Object obj, long j2) {
            return this.f27815a.getByte(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: b */
        public final void mo21216b(Object obj, long j2, byte b2) {
            this.f27815a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: c */
        public final void mo21217c(Object obj, long j2, double d2) {
            this.f27815a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: d */
        public final void mo21218d(Object obj, long j2, float f2) {
            this.f27815a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: g */
        public final void mo21219g(Object obj, long j2, boolean z) {
            this.f27815a.putBoolean(obj, j2, z);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: h */
        public final boolean mo21220h(Object obj, long j2) {
            return this.f27815a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: i */
        public final float mo21221i(Object obj, long j2) {
            return this.f27815a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: j */
        public final double mo21222j(Object obj, long j2) {
            return this.f27815a.getDouble(obj, j2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.k4$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: a */
        public final byte mo21215a(Object obj, long j2) {
            return C7538k4.f27814x ? C7538k4.m21185L(obj, j2) : C7538k4.m21186M(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: b */
        public final void mo21216b(Object obj, long j2, byte b2) {
            if (C7538k4.f27814x) {
                C7538k4.m21209u(obj, j2, b2);
            } else {
                C7538k4.m21213y(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: c */
        public final void mo21217c(Object obj, long j2, double d2) {
            m21224f(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: d */
        public final void mo21218d(Object obj, long j2, float f2) {
            m21223e(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: g */
        public final void mo21219g(Object obj, long j2, boolean z) {
            if (C7538k4.f27814x) {
                C7538k4.m21214z(obj, j2, z);
            } else {
                C7538k4.m21177D(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: h */
        public final boolean mo21220h(Object obj, long j2) {
            return C7538k4.f27814x ? C7538k4.m21187N(obj, j2) : C7538k4.m21188O(obj, j2);
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: i */
        public final float mo21221i(Object obj, long j2) {
            return Float.intBitsToFloat(m21225k(obj, j2));
        }

        @Override // com.google.android.gms.internal.measurement.C7538k4.d
        /* renamed from: j */
        public final double mo21222j(Object obj, long j2) {
            return Double.longBitsToDouble(m21226l(obj, j2));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
    /* renamed from: com.google.android.gms.internal.measurement.k4$d */
    static abstract class d {

        /* renamed from: a */
        Unsafe f27815a;

        d(Unsafe unsafe) {
            this.f27815a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo21215a(Object obj, long j2);

        /* renamed from: b */
        public abstract void mo21216b(Object obj, long j2, byte b2);

        /* renamed from: c */
        public abstract void mo21217c(Object obj, long j2, double d2);

        /* renamed from: d */
        public abstract void mo21218d(Object obj, long j2, float f2);

        /* renamed from: e */
        public final void m21223e(Object obj, long j2, int i2) {
            this.f27815a.putInt(obj, j2, i2);
        }

        /* renamed from: f */
        public final void m21224f(Object obj, long j2, long j3) {
            this.f27815a.putLong(obj, j2, j3);
        }

        /* renamed from: g */
        public abstract void mo21219g(Object obj, long j2, boolean z);

        /* renamed from: h */
        public abstract boolean mo21220h(Object obj, long j2);

        /* renamed from: i */
        public abstract float mo21221i(Object obj, long j2);

        /* renamed from: j */
        public abstract double mo21222j(Object obj, long j2);

        /* renamed from: k */
        public final int m21225k(Object obj, long j2) {
            return this.f27815a.getInt(obj, j2);
        }

        /* renamed from: l */
        public final long m21226l(Object obj, long j2) {
            return this.f27815a.getLong(obj, j2);
        }
    }

    static {
        Unsafe unsafeM21208t = m21208t();
        f27792b = unsafeM21208t;
        f27793c = C7535k1.m21168c();
        boolean zM21175B = m21175B(Long.TYPE);
        f27794d = zM21175B;
        boolean zM21175B2 = m21175B(Integer.TYPE);
        f27795e = zM21175B2;
        d bVar = null;
        if (unsafeM21208t != null) {
            if (!C7535k1.m21167b()) {
                bVar = new b(unsafeM21208t);
            } else if (zM21175B) {
                bVar = new c(unsafeM21208t);
            } else if (zM21175B2) {
                bVar = new a(unsafeM21208t);
            }
        }
        f27796f = bVar;
        f27797g = m21178E();
        f27798h = m21174A();
        long jM21202n = m21202n(byte[].class);
        f27799i = jM21202n;
        f27800j = m21202n(boolean[].class);
        f27801k = m21207s(boolean[].class);
        f27802l = m21202n(int[].class);
        f27803m = m21207s(int[].class);
        f27804n = m21202n(long[].class);
        f27805o = m21207s(long[].class);
        f27806p = m21202n(float[].class);
        f27807q = m21207s(float[].class);
        f27808r = m21202n(double[].class);
        f27809s = m21207s(double[].class);
        f27810t = m21202n(Object[].class);
        f27811u = m21207s(Object[].class);
        Field fieldM21180G = m21180G();
        f27812v = (fieldM21180G == null || bVar == null) ? -1L : bVar.f27815a.objectFieldOffset(fieldM21180G);
        f27813w = (int) (7 & jM21202n);
        f27814x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C7538k4() {
    }

    /* renamed from: A */
    private static boolean m21174A() {
        Unsafe unsafe = f27792b;
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
            if (C7535k1.m21167b()) {
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
            Logger logger = f27791a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: B */
    private static boolean m21175B(Class<?> cls) {
        if (!C7535k1.m21167b()) {
            return false;
        }
        try {
            Class<?> cls2 = f27793c;
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

    /* renamed from: C */
    static double m21176C(Object obj, long j2) {
        return f27796f.mo21222j(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static void m21177D(Object obj, long j2, boolean z) {
        m21213y(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: E */
    private static boolean m21178E() {
        Unsafe unsafe = f27792b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m21180G() == null) {
                return false;
            }
            if (C7535k1.m21167b()) {
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
            Logger logger = f27791a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: F */
    static Object m21179F(Object obj, long j2) {
        return f27796f.f27815a.getObject(obj, j2);
    }

    /* renamed from: G */
    private static Field m21180G() {
        Field fieldM21192d;
        if (C7535k1.m21167b() && (fieldM21192d = m21192d(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM21192d;
        }
        Field fieldM21192d2 = m21192d(Buffer.class, "address");
        if (fieldM21192d2 == null || fieldM21192d2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM21192d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static byte m21185L(Object obj, long j2) {
        return (byte) (m21190b(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static byte m21186M(Object obj, long j2) {
        return (byte) (m21190b(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static boolean m21187N(Object obj, long j2) {
        return m21185L(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static boolean m21188O(Object obj, long j2) {
        return m21186M(obj, j2) != 0;
    }

    /* renamed from: a */
    static byte m21189a(byte[] bArr, long j2) {
        return f27796f.mo21215a(bArr, f27799i + j2);
    }

    /* renamed from: b */
    static int m21190b(Object obj, long j2) {
        return f27796f.m21225k(obj, j2);
    }

    /* renamed from: c */
    static <T> T m21191c(Class<T> cls) {
        try {
            return (T) f27792b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: d */
    private static Field m21192d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    static void m21194f(Object obj, long j2, double d2) {
        f27796f.mo21217c(obj, j2, d2);
    }

    /* renamed from: g */
    static void m21195g(Object obj, long j2, float f2) {
        f27796f.mo21218d(obj, j2, f2);
    }

    /* renamed from: h */
    static void m21196h(Object obj, long j2, int i2) {
        f27796f.m21223e(obj, j2, i2);
    }

    /* renamed from: i */
    static void m21197i(Object obj, long j2, long j3) {
        f27796f.m21224f(obj, j2, j3);
    }

    /* renamed from: j */
    static void m21198j(Object obj, long j2, Object obj2) {
        f27796f.f27815a.putObject(obj, j2, obj2);
    }

    /* renamed from: k */
    static void m21199k(Object obj, long j2, boolean z) {
        f27796f.mo21219g(obj, j2, z);
    }

    /* renamed from: l */
    static void m21200l(byte[] bArr, long j2, byte b2) {
        f27796f.mo21216b(bArr, f27799i + j2, b2);
    }

    /* renamed from: m */
    static boolean m21201m() {
        return f27798h;
    }

    /* renamed from: n */
    private static int m21202n(Class<?> cls) {
        if (f27798h) {
            return f27796f.f27815a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: o */
    static long m21203o(Object obj, long j2) {
        return f27796f.m21226l(obj, j2);
    }

    /* renamed from: r */
    static boolean m21206r() {
        return f27797g;
    }

    /* renamed from: s */
    private static int m21207s(Class<?> cls) {
        if (f27798h) {
            return f27796f.f27815a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: t */
    static Unsafe m21208t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C7550m4());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static void m21209u(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        m21196h(obj, j3, ((255 & b2) << i2) | (m21190b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* renamed from: w */
    static boolean m21211w(Object obj, long j2) {
        return f27796f.mo21220h(obj, j2);
    }

    /* renamed from: x */
    static float m21212x(Object obj, long j2) {
        return f27796f.mo21221i(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static void m21213y(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m21196h(obj, j3, ((255 & b2) << i2) | (m21190b(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static void m21214z(Object obj, long j2, boolean z) {
        m21209u(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
