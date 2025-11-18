package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.r1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2690r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f34654a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f34655b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f34656c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2688q1 f34657d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f34658e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f34659f;

    /* renamed from: g, reason: collision with root package name */
    static final long f34660g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f34661h;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    static {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.C2690r1.<clinit>():void");
    }

    private C2690r1() {
    }

    static boolean A(Class cls) {
        int i10 = F.f34483a;
        try {
            Class cls2 = f34655b;
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

    static boolean B(Object obj, long j10) {
        return f34657d.g(obj, j10);
    }

    static boolean C() {
        return f34659f;
    }

    static boolean D() {
        return f34658e;
    }

    private static int E(Class cls) {
        if (f34659f) {
            return f34657d.f34651a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f34659f) {
            return f34657d.f34651a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i10 = F.f34483a;
        Field fieldC = c(Buffer.class, "effectiveDirectAddress");
        if (fieldC != null) {
            return fieldC;
        }
        Field fieldC2 = c(Buffer.class, "address");
        if (fieldC2 == null || fieldC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldC2;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j10, byte b10) {
        AbstractC2688q1 abstractC2688q1 = f34657d;
        long j11 = (-4) & j10;
        int i10 = abstractC2688q1.f34651a.getInt(obj, j11);
        int i11 = ((~((int) j10)) & 3) << 3;
        abstractC2688q1.f34651a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j10, byte b10) {
        AbstractC2688q1 abstractC2688q1 = f34657d;
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        abstractC2688q1.f34651a.putInt(obj, j11, ((255 & b10) << i10) | (abstractC2688q1.f34651a.getInt(obj, j11) & (~(255 << i10))));
    }

    static double f(Object obj, long j10) {
        return f34657d.a(obj, j10);
    }

    static float g(Object obj, long j10) {
        return f34657d.b(obj, j10);
    }

    static int h(Object obj, long j10) {
        return f34657d.f34651a.getInt(obj, j10);
    }

    static long i(Object obj, long j10) {
        return f34657d.f34651a.getLong(obj, j10);
    }

    static Object j(Class cls) {
        try {
            return f34654a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    static Object k(Object obj, long j10) {
        return f34657d.f34651a.getObject(obj, j10);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2679n1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(C2690r1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j10, boolean z10) {
        f34657d.c(obj, j10, z10);
    }

    static void s(byte[] bArr, long j10, byte b10) {
        f34657d.d(bArr, f34660g + j10, b10);
    }

    static void t(Object obj, long j10, double d10) {
        f34657d.e(obj, j10, d10);
    }

    static void u(Object obj, long j10, float f10) {
        f34657d.f(obj, j10, f10);
    }

    static void v(Object obj, long j10, int i10) {
        f34657d.f34651a.putInt(obj, j10, i10);
    }

    static void w(Object obj, long j10, long j11) {
        f34657d.f34651a.putLong(obj, j10, j11);
    }

    static void x(Object obj, long j10, Object obj2) {
        f34657d.f34651a.putObject(obj, j10, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j10) {
        return ((byte) ((f34657d.f34651a.getInt(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j10) {
        return ((byte) ((f34657d.f34651a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
