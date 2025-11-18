package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.gx */
/* loaded from: classes2.dex */
final class C6726gx {

    /* renamed from: a */
    private static final Logger f18998a = Logger.getLogger(C6726gx.class.getName());

    /* renamed from: b */
    private static final Unsafe f18999b;

    /* renamed from: c */
    private static final Class<?> f19000c;

    /* renamed from: d */
    private static final boolean f19001d;

    /* renamed from: e */
    private static final boolean f19002e;

    /* renamed from: f */
    private static final d f19003f;

    /* renamed from: g */
    private static final boolean f19004g;

    /* renamed from: h */
    private static final boolean f19005h;

    /* renamed from: i */
    private static final long f19006i;

    /* renamed from: j */
    private static final long f19007j;

    /* renamed from: k */
    private static final long f19008k;

    /* renamed from: l */
    private static final long f19009l;

    /* renamed from: m */
    private static final long f19010m;

    /* renamed from: n */
    private static final long f19011n;

    /* renamed from: o */
    private static final long f19012o;

    /* renamed from: p */
    private static final long f19013p;

    /* renamed from: q */
    private static final long f19014q;

    /* renamed from: r */
    private static final long f19015r;

    /* renamed from: s */
    private static final long f19016s;

    /* renamed from: t */
    private static final long f19017t;

    /* renamed from: u */
    private static final long f19018u;

    /* renamed from: v */
    private static final long f19019v;

    /* renamed from: w */
    private static final boolean f19020w;

    /* renamed from: com.google.android.gms.internal.ads.gx$a */
    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: a */
        public final void mo15225a(long j2, byte b2) {
            Memory.pokeByte((int) (j2 & (-1)), b2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: b */
        public final void mo15226b(Object obj, long j2, double d2) {
            m15235d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: c */
        public final void mo15227c(Object obj, long j2, float f2) {
            m15236g(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: e */
        public final void mo15228e(Object obj, long j2, boolean z) {
            if (C6726gx.f19020w) {
                C6726gx.m15213o(obj, j2, z);
            } else {
                C6726gx.m15222x(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: f */
        public final void mo15229f(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray((int) (j3 & (-1)), bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: h */
        public final void mo15230h(Object obj, long j2, byte b2) {
            if (C6726gx.f19020w) {
                C6726gx.m15201c(obj, j2, b2);
            } else {
                C6726gx.m15211m(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: k */
        public final boolean mo15231k(Object obj, long j2) {
            return C6726gx.f19020w ? C6726gx.m15193O(obj, j2) : C6726gx.m15194P(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: l */
        public final float mo15232l(Object obj, long j2) {
            return Float.intBitsToFloat(m15237i(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: m */
        public final double mo15233m(Object obj, long j2) {
            return Double.longBitsToDouble(m15238j(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: n */
        public final byte mo15234n(Object obj, long j2) {
            return C6726gx.f19020w ? C6726gx.m15191M(obj, j2) : C6726gx.m15192N(obj, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.gx$b */
    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: a */
        public final void mo15225a(long j2, byte b2) {
            Memory.pokeByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: b */
        public final void mo15226b(Object obj, long j2, double d2) {
            m15235d(obj, j2, Double.doubleToLongBits(d2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: c */
        public final void mo15227c(Object obj, long j2, float f2) {
            m15236g(obj, j2, Float.floatToIntBits(f2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: e */
        public final void mo15228e(Object obj, long j2, boolean z) {
            if (C6726gx.f19020w) {
                C6726gx.m15213o(obj, j2, z);
            } else {
                C6726gx.m15222x(obj, j2, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: f */
        public final void mo15229f(byte[] bArr, long j2, long j3, long j4) {
            Memory.pokeByteArray(j3, bArr, (int) j2, (int) j4);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: h */
        public final void mo15230h(Object obj, long j2, byte b2) {
            if (C6726gx.f19020w) {
                C6726gx.m15201c(obj, j2, b2);
            } else {
                C6726gx.m15211m(obj, j2, b2);
            }
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: k */
        public final boolean mo15231k(Object obj, long j2) {
            return C6726gx.f19020w ? C6726gx.m15193O(obj, j2) : C6726gx.m15194P(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: l */
        public final float mo15232l(Object obj, long j2) {
            return Float.intBitsToFloat(m15237i(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: m */
        public final double mo15233m(Object obj, long j2) {
            return Double.longBitsToDouble(m15238j(obj, j2));
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: n */
        public final byte mo15234n(Object obj, long j2) {
            return C6726gx.f19020w ? C6726gx.m15191M(obj, j2) : C6726gx.m15192N(obj, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.gx$c */
    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: a */
        public final void mo15225a(long j2, byte b2) {
            this.f19021a.putByte(j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: b */
        public final void mo15226b(Object obj, long j2, double d2) {
            this.f19021a.putDouble(obj, j2, d2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: c */
        public final void mo15227c(Object obj, long j2, float f2) {
            this.f19021a.putFloat(obj, j2, f2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: e */
        public final void mo15228e(Object obj, long j2, boolean z) {
            this.f19021a.putBoolean(obj, j2, z);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: f */
        public final void mo15229f(byte[] bArr, long j2, long j3, long j4) {
            this.f19021a.copyMemory(bArr, C6726gx.f19006i + j2, (Object) null, j3, j4);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: h */
        public final void mo15230h(Object obj, long j2, byte b2) {
            this.f19021a.putByte(obj, j2, b2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: k */
        public final boolean mo15231k(Object obj, long j2) {
            return this.f19021a.getBoolean(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: l */
        public final float mo15232l(Object obj, long j2) {
            return this.f19021a.getFloat(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: m */
        public final double mo15233m(Object obj, long j2) {
            return this.f19021a.getDouble(obj, j2);
        }

        @Override // com.google.android.gms.internal.ads.C6726gx.d
        /* renamed from: n */
        public final byte mo15234n(Object obj, long j2) {
            return this.f19021a.getByte(obj, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.gx$d */
    static abstract class d {

        /* renamed from: a */
        Unsafe f19021a;

        d(Unsafe unsafe) {
            this.f19021a = unsafe;
        }

        /* renamed from: a */
        public abstract void mo15225a(long j2, byte b2);

        /* renamed from: b */
        public abstract void mo15226b(Object obj, long j2, double d2);

        /* renamed from: c */
        public abstract void mo15227c(Object obj, long j2, float f2);

        /* renamed from: d */
        public final void m15235d(Object obj, long j2, long j3) {
            this.f19021a.putLong(obj, j2, j3);
        }

        /* renamed from: e */
        public abstract void mo15228e(Object obj, long j2, boolean z);

        /* renamed from: f */
        public abstract void mo15229f(byte[] bArr, long j2, long j3, long j4);

        /* renamed from: g */
        public final void m15236g(Object obj, long j2, int i2) {
            this.f19021a.putInt(obj, j2, i2);
        }

        /* renamed from: h */
        public abstract void mo15230h(Object obj, long j2, byte b2);

        /* renamed from: i */
        public final int m15237i(Object obj, long j2) {
            return this.f19021a.getInt(obj, j2);
        }

        /* renamed from: j */
        public final long m15238j(Object obj, long j2) {
            return this.f19021a.getLong(obj, j2);
        }

        /* renamed from: k */
        public abstract boolean mo15231k(Object obj, long j2);

        /* renamed from: l */
        public abstract float mo15232l(Object obj, long j2);

        /* renamed from: m */
        public abstract double mo15233m(Object obj, long j2);

        /* renamed from: n */
        public abstract byte mo15234n(Object obj, long j2);
    }

    static {
        Unsafe unsafeM15216r = m15216r();
        f18999b = unsafeM15216r;
        f19000c = C7425zt.m16159b();
        boolean zM15185G = m15185G(Long.TYPE);
        f19001d = zM15185G;
        boolean zM15185G2 = m15185G(Integer.TYPE);
        f19002e = zM15185G2;
        d cVar = null;
        if (unsafeM15216r != null) {
            if (!C7425zt.m16158a()) {
                cVar = new c(unsafeM15216r);
            } else if (zM15185G) {
                cVar = new b(unsafeM15216r);
            } else if (zM15185G2) {
                cVar = new a(unsafeM15216r);
            }
        }
        f19003f = cVar;
        f19004g = m15218t();
        f19005h = m15217s();
        f19006i = m15181C(byte[].class);
        f19007j = m15181C(boolean[].class);
        f19008k = m15182D(boolean[].class);
        f19009l = m15181C(int[].class);
        f19010m = m15182D(int[].class);
        f19011n = m15181C(long[].class);
        f19012o = m15182D(long[].class);
        f19013p = m15181C(float[].class);
        f19014q = m15182D(float[].class);
        f19015r = m15181C(double[].class);
        f19016s = m15182D(double[].class);
        f19017t = m15181C(Object[].class);
        f19018u = m15182D(Object[].class);
        Field fieldM15219u = m15219u();
        f19019v = (fieldM15219u == null || cVar == null) ? -1L : cVar.f19021a.objectFieldOffset(fieldM15219u);
        f19020w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private C6726gx() {
    }

    /* renamed from: B */
    static <T> T m15180B(Class<T> cls) {
        try {
            return (T) f18999b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: C */
    private static int m15181C(Class<?> cls) {
        if (f19005h) {
            return f19003f.f19021a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: D */
    private static int m15182D(Class<?> cls) {
        if (f19005h) {
            return f19003f.f19021a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: E */
    static int m15183E(Object obj, long j2) {
        return f19003f.m15237i(obj, j2);
    }

    /* renamed from: F */
    static long m15184F(Object obj, long j2) {
        return f19003f.m15238j(obj, j2);
    }

    /* renamed from: G */
    private static boolean m15185G(Class<?> cls) {
        if (!C7425zt.m16158a()) {
            return false;
        }
        try {
            Class<?> cls2 = f19000c;
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

    /* renamed from: H */
    static boolean m15186H(Object obj, long j2) {
        return f19003f.mo15231k(obj, j2);
    }

    /* renamed from: I */
    static float m15187I(Object obj, long j2) {
        return f19003f.mo15232l(obj, j2);
    }

    /* renamed from: J */
    static long m15188J(ByteBuffer byteBuffer) {
        return f19003f.m15238j(byteBuffer, f19019v);
    }

    /* renamed from: K */
    static double m15189K(Object obj, long j2) {
        return f19003f.mo15233m(obj, j2);
    }

    /* renamed from: L */
    static Object m15190L(Object obj, long j2) {
        return f19003f.f19021a.getObject(obj, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static byte m15191M(Object obj, long j2) {
        return (byte) (m15183E(obj, (-4) & j2) >>> ((int) (((j2 ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static byte m15192N(Object obj, long j2) {
        return (byte) (m15183E(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static boolean m15193O(Object obj, long j2) {
        return m15191M(obj, j2) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static boolean m15194P(Object obj, long j2) {
        return m15192N(obj, j2) != 0;
    }

    /* renamed from: a */
    static byte m15199a(byte[] bArr, long j2) {
        return f19003f.mo15234n(bArr, f19006i + j2);
    }

    /* renamed from: b */
    static void m15200b(long j2, byte b2) {
        f19003f.mo15225a(j2, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m15201c(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = ((((int) j2) ^ (-1)) & 3) << 3;
        m15212n(obj, j3, ((255 & b2) << i2) | (m15183E(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* renamed from: d */
    static void m15202d(Object obj, long j2, double d2) {
        f19003f.mo15226b(obj, j2, d2);
    }

    /* renamed from: e */
    static void m15203e(Object obj, long j2, float f2) {
        f19003f.mo15227c(obj, j2, f2);
    }

    /* renamed from: f */
    static void m15204f(Object obj, long j2, long j3) {
        f19003f.m15235d(obj, j2, j3);
    }

    /* renamed from: g */
    static void m15205g(Object obj, long j2, Object obj2) {
        f19003f.f19021a.putObject(obj, j2, obj2);
    }

    /* renamed from: h */
    static void m15206h(Object obj, long j2, boolean z) {
        f19003f.mo15228e(obj, j2, z);
    }

    /* renamed from: i */
    static void m15207i(byte[] bArr, long j2, byte b2) {
        f19003f.mo15230h(bArr, f19006i + j2, b2);
    }

    /* renamed from: j */
    static void m15208j(byte[] bArr, long j2, long j3, long j4) {
        f19003f.mo15229f(bArr, j2, j3, j4);
    }

    /* renamed from: l */
    private static Field m15210l(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static void m15211m(Object obj, long j2, byte b2) {
        long j3 = (-4) & j2;
        int i2 = (((int) j2) & 3) << 3;
        m15212n(obj, j3, ((255 & b2) << i2) | (m15183E(obj, j3) & ((255 << i2) ^ (-1))));
    }

    /* renamed from: n */
    static void m15212n(Object obj, long j2, int i2) {
        f19003f.m15236g(obj, j2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m15213o(Object obj, long j2, boolean z) {
        m15201c(obj, j2, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: p */
    static boolean m15214p() {
        return f19005h;
    }

    /* renamed from: q */
    static boolean m15215q() {
        return f19004g;
    }

    /* renamed from: r */
    static Unsafe m15216r() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C6800ix());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    private static boolean m15217s() {
        Unsafe unsafe = f18999b;
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
            if (C7425zt.m16158a()) {
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
            Logger logger = f18998a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: t */
    private static boolean m15218t() {
        Unsafe unsafe = f18999b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m15219u() == null) {
                return false;
            }
            if (C7425zt.m16158a()) {
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
            Logger logger = f18998a;
            Level level = Level.WARNING;
            String strValueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(strValueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: u */
    private static Field m15219u() {
        Field fieldM15210l;
        if (C7425zt.m16158a() && (fieldM15210l = m15210l(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM15210l;
        }
        Field fieldM15210l2 = m15210l(Buffer.class, "address");
        if (fieldM15210l2 == null || fieldM15210l2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM15210l2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static void m15222x(Object obj, long j2, boolean z) {
        m15211m(obj, j2, z ? (byte) 1 : (byte) 0);
    }
}
