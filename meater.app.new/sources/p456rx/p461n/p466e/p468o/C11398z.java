package p456rx.p461n.p466e.p468o;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: UnsafeAccess.java */
/* renamed from: rx.n.e.o.z */
/* loaded from: classes3.dex */
public final class C11398z {

    /* renamed from: a */
    public static final Unsafe f42976a;

    /* renamed from: b */
    private static final boolean f42977b;

    static {
        f42977b = System.getProperty("rx.unsafe-disable") != null;
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        f42976a = unsafe;
    }

    /* renamed from: a */
    public static long m40547a(Class<?> cls, String str) throws NoSuchFieldException {
        try {
            return f42976a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            InternalError internalError = new InternalError();
            internalError.initCause(e2);
            throw internalError;
        }
    }

    /* renamed from: b */
    public static boolean m40548b() {
        return (f42976a == null || f42977b) ? false : true;
    }
}
