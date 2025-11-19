package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: Internal.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f44076a;

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f44077b;

    /* compiled from: Internal.java */
    public interface a {
        int e();
    }

    /* compiled from: Internal.java */
    public interface b<T extends a> {
        T a(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f44076a = bArr;
        f44077b = ByteBuffer.wrap(bArr);
    }

    public static boolean a(byte[] bArr) {
        return v.e(bArr);
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }
}
