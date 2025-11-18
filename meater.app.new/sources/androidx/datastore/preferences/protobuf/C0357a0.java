package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* renamed from: androidx.datastore.preferences.protobuf.a0 */
/* loaded from: classes.dex */
public final class C0357a0 {

    /* renamed from: a */
    static final Charset f2673a = Charset.forName("UTF-8");

    /* renamed from: b */
    static final Charset f2674b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final byte[] f2675c;

    /* renamed from: d */
    public static final ByteBuffer f2676d;

    /* renamed from: e */
    public static final AbstractC0383j f2677e;

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$a */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$b */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$c */
    public interface c {
        /* renamed from: f */
        int m2566f();
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$d */
    public interface d<T extends c> {
        /* renamed from: a */
        T m2567a(int i2);
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$e */
    public interface e {
        /* renamed from: a */
        boolean m2568a(int i2);
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$f */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$g */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$h */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.a0$i */
    public interface i<E> extends List<E>, RandomAccess {
        /* renamed from: B */
        void mo2569B();

        /* renamed from: J */
        i<E> mo2570J(int i2);

        /* renamed from: l1 */
        boolean mo2571l1();
    }

    static {
        byte[] bArr = new byte[0];
        f2675c = bArr;
        f2676d = ByteBuffer.wrap(bArr);
        f2677e = AbstractC0383j.m2851h(bArr);
    }

    /* renamed from: a */
    static <T> T m2556a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: b */
    static <T> T m2557b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m2558c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: d */
    public static int m2559d(byte[] bArr) {
        return m2560e(bArr, 0, bArr.length);
    }

    /* renamed from: e */
    static int m2560e(byte[] bArr, int i2, int i3) {
        int iM2564i = m2564i(i3, bArr, i2, i3);
        if (iM2564i == 0) {
            return 1;
        }
        return iM2564i;
    }

    /* renamed from: f */
    public static int m2561f(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    /* renamed from: g */
    public static boolean m2562g(byte[] bArr) {
        return C0406q1.m3171m(bArr);
    }

    /* renamed from: h */
    static Object m2563h(Object obj, Object obj2) {
        return ((InterfaceC0405q0) obj).mo3152d().mo2555z((InterfaceC0405q0) obj2).mo3157J0();
    }

    /* renamed from: i */
    static int m2564i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* renamed from: j */
    public static String m2565j(byte[] bArr) {
        return new String(bArr, f2673a);
    }
}
