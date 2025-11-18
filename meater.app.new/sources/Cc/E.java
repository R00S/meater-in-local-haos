package Cc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: -JvmPlatform.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b*\n\u0010\u000b\"\u00020\n2\u00020\n*\n\u0010\r\"\u00020\f2\u00020\f*\n\u0010\u000f\"\u00020\u000e2\u00020\u000e*\n\u0010\u0011\"\u00020\u00102\u00020\u0010*\n\u0010\u0013\"\u00020\u00122\u00020\u0012¨\u0006\u0014"}, d2 = {"", "", "b", "([B)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "Ljava/util/concurrent/locks/ReentrantLock;", "Lock", "Ljava/net/ProtocolException;", "ProtocolException", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class E {
    public static final byte[] a(String str) {
        C3862t.g(str, "<this>");
        byte[] bytes = str.getBytes(Ub.d.UTF_8);
        C3862t.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        C3862t.g(bArr, "<this>");
        return new String(bArr, Ub.d.UTF_8);
    }
}
