package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Internal.java */
/* renamed from: com.google.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2964y {

    /* renamed from: a, reason: collision with root package name */
    static final Charset f39490a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    static final Charset f39491b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    static final Charset f39492c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f39493d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f39494e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC2948h f39495f;

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$a */
    public interface a extends i<Boolean> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$b */
    public interface b extends i<Double> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$c */
    public interface c {
        int e();
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$d */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$e */
    public interface e {
        boolean a(int i10);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$f */
    public interface f extends i<Float> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$g */
    public interface g extends i<Integer> {
        void X(int i10);

        int getInt(int i10);

        @Override // com.google.protobuf.C2964y.i
        i<Integer> k(int i10);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$h */
    public interface h extends i<Long> {
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.y$i */
    public interface i<E> extends List<E>, RandomAccess {
        i<E> k(int i10);

        void n();

        boolean q();
    }

    static {
        byte[] bArr = new byte[0];
        f39493d = bArr;
        f39494e = ByteBuffer.wrap(bArr);
        f39495f = AbstractC2948h.g(bArr);
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
        return ((P) obj).d().O0((P) obj2).j();
    }

    static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f39491b);
    }
}
