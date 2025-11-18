package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2079z {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f25184a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f25185b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f25186c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f25187d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC2063i f25188e;

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$b */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$c */
    public interface c {
        int e();
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$e */
    public interface e {
        boolean a(int i10);
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$f */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$g */
    public interface g extends i<Integer> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$h */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.z$i */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> k(int i10);

        void n();

        boolean q();
    }

    static {
        byte[] bArr = new byte[0];
        f25186c = bArr;
        f25187d = ByteBuffer.wrap(bArr);
        f25188e = AbstractC2063i.h(bArr);
    }

    static <T> T a(T t10) {
        t10.getClass();
        return t10;
    }

    static <T> T b(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return q0.m(bArr);
    }

    static Object h(Object obj, Object obj2) {
        return ((P) obj).d().K((P) obj2).j();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f25184a);
    }
}
