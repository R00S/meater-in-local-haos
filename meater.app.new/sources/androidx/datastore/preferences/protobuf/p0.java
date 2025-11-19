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
/* loaded from: classes.dex */
final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f25018a = Logger.getLogger(p0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f25019b = B();

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f25020c = C2058d.b();

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f25021d = m(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f25022e = m(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    private static final e f25023f = z();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f25024g = Q();

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f25025h = P();

    /* renamed from: i, reason: collision with root package name */
    static final long f25026i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f25027j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f25028k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f25029l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f25030m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f25031n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f25032o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f25033p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f25034q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f25035r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f25036s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f25037t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f25038u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f25039v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f25040w;

    /* renamed from: x, reason: collision with root package name */
    static final boolean f25041x;

    /* compiled from: UnsafeUtil.java */
    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
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
    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f25041x ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f25041x ? p0.t(obj, j10) : p0.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f25041x) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f25041x) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return p0.f25041x ? p0.q(obj, j10) : p0.r(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return p0.f25041x ? p0.t(obj, j10) : p0.u(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            if (p0.f25041x) {
                p0.F(obj, j10, z10);
            } else {
                p0.G(obj, j10, z10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            if (p0.f25041x) {
                p0.I(obj, j10, b10);
            } else {
                p0.J(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public boolean c(Object obj, long j10) {
            return this.f25042a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public byte d(Object obj, long j10) {
            return this.f25042a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public double e(Object obj, long j10) {
            return this.f25042a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public float f(Object obj, long j10) {
            return this.f25042a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void k(Object obj, long j10, boolean z10) {
            this.f25042a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void l(Object obj, long j10, byte b10) {
            this.f25042a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void m(Object obj, long j10, double d10) {
            this.f25042a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.p0.e
        public void n(Object obj, long j10, float f10) {
            this.f25042a.putFloat(obj, j10, f10);
        }
    }

    /* compiled from: UnsafeUtil.java */
    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f25042a;

        e(Unsafe unsafe) {
            this.f25042a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f25042a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f25042a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f25042a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f25042a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f25042a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f25042a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f25042a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f25042a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f25042a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = j(byte[].class);
        f25026i = j10;
        f25027j = j(boolean[].class);
        f25028k = k(boolean[].class);
        f25029l = j(int[].class);
        f25030m = k(int[].class);
        f25031n = j(long[].class);
        f25032o = k(long[].class);
        f25033p = j(float[].class);
        f25034q = k(float[].class);
        f25035r = j(double[].class);
        f25036s = k(double[].class);
        f25037t = j(Object[].class);
        f25038u = k(Object[].class);
        f25039v = o(l());
        f25040w = (int) (j10 & 7);
        f25041x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p0() {
    }

    static Object A(Object obj, long j10) {
        return f25023f.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f25025h;
    }

    static boolean D() {
        return f25024g;
    }

    static void E(Object obj, long j10, boolean z10) {
        f25023f.k(obj, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : (byte) 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f25023f.l(bArr, f25026i + j10, b10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iX = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (iX & (~(255 << i10))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f25023f.m(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f25023f.n(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f25023f.o(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f25023f.p(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f25023f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f25019b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (C2058d.c()) {
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
            f25018a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f25019b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (C2058d.c()) {
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
            f25018a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    static <T> T i(Class<T> cls) {
        try {
            return (T) f25019b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class<?> cls) {
        if (f25025h) {
            return f25023f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f25025h) {
            return f25023f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field fieldN;
        if (C2058d.c() && (fieldN = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldN;
        }
        Field fieldN2 = n(Buffer.class, "address");
        if (fieldN2 == null || fieldN2.getType() != Long.TYPE) {
            return null;
        }
        return fieldN2;
    }

    private static boolean m(Class<?> cls) {
        if (!C2058d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f25020c;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f25023f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f25023f.c(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    static byte s(byte[] bArr, long j10) {
        return f25023f.d(bArr, f25026i + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f25023f.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f25023f.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f25023f.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f25023f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f25019b;
        if (unsafe == null) {
            return null;
        }
        if (!C2058d.c()) {
            return new d(unsafe);
        }
        if (f25021d) {
            return new c(unsafe);
        }
        if (f25022e) {
            return new b(unsafe);
        }
        return null;
    }
}
