package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* loaded from: classes3.dex */
public class C10750i {

    /* renamed from: a */
    public static final byte[] f41314a;

    /* renamed from: b */
    public static final ByteBuffer f41315b;

    /* compiled from: Internal.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$a */
    public interface a {
        /* renamed from: f */
        int mo34235f();
    }

    /* compiled from: Internal.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b */
    public interface b<T extends a> {
        /* renamed from: a */
        T mo34236a(int i2);
    }

    static {
        byte[] bArr = new byte[0];
        f41314a = bArr;
        f41315b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m38415a(byte[] bArr) {
        return C10763v.m38489e(bArr);
    }

    /* renamed from: b */
    public static String m38416b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }
}
