package okhttp3.internal.p454ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.p429io.C10556a;
import okhttp3.HttpUrl;
import p353j.C9703f;
import p353j.C9710i;
import p353j.C9711j;
import p353j.InterfaceC9696b0;

/* compiled from: MessageDeflater.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m32267d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lj/f;", "Lj/i;", "suffix", HttpUrl.FRAGMENT_ENCODE_SET, "endsWith", "(Lj/f;Lj/i;)Z", "buffer", "Lkotlin/u;", "deflate", "(Lj/f;)V", "close", "()V", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "noContextTakeover", "Z", "Lj/j;", "deflaterSink", "Lj/j;", "deflatedBytes", "Lj/f;", "<init>", "(Z)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable {
    private final C9703f deflatedBytes;
    private final Deflater deflater;
    private final C9711j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        C9703f c9703f = new C9703f();
        this.deflatedBytes = c9703f;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new C9711j((InterfaceC9696b0) c9703f, deflater);
    }

    private final boolean endsWith(C9703f c9703f, C9710i c9710i) {
        return c9703f.mo32059v0(c9703f.size() - c9710i.m32093P(), c9710i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.deflaterSink.close();
    }

    public final void deflate(C9703f buffer) throws IOException {
        C9801m.m32346f(buffer, "buffer");
        if (!(this.deflatedBytes.size() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(buffer, buffer.size());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long size = this.deflatedBytes.size() - 4;
            C9703f.a aVarM31995J = C9703f.m31995J(this.deflatedBytes, null, 1, null);
            try {
                aVarM31995J.m32065c(size);
                C10556a.m37638a(aVarM31995J, null);
            } finally {
            }
        } else {
            this.deflatedBytes.writeByte(0);
        }
        C9703f c9703f = this.deflatedBytes;
        buffer.write(c9703f, c9703f.size());
    }
}
