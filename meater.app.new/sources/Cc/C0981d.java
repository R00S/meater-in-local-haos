package Cc;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Okio.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"LCc/d;", "LCc/z;", "<init>", "()V", "LCc/e;", "source", "", "byteCount", "Loa/F;", "n0", "(LCc/e;J)V", "flush", "LCc/C;", "r", "()LCc/C;", "close", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C0981d implements z {
    @Override // Cc.z
    public void n0(C0982e source, long byteCount) throws EOFException {
        C3862t.g(source, "source");
        source.w(byteCount);
    }

    @Override // Cc.z
    public C r() {
        return C.f3205e;
    }

    @Override // Cc.z, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // Cc.z, java.io.Flushable
    public void flush() {
    }
}
