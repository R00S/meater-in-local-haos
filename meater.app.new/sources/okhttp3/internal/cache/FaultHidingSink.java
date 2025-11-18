package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p353j.AbstractC9712k;
import p353j.C9703f;
import p353j.InterfaceC9696b0;

/* compiled from: FaultHidingSink.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m32267d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lj/k;", "Lj/f;", "source", HttpUrl.FRAGMENT_ENCODE_SET, "byteCount", "Lkotlin/u;", "write", "(Lj/f;J)V", "flush", "()V", "close", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lkotlin/a0/c/l;", "getOnException", "()Lkotlin/a0/c/l;", HttpUrl.FRAGMENT_ENCODE_SET, "hasErrors", "Z", "Lj/b0;", "delegate", "<init>", "(Lj/b0;Lkotlin/a0/c/l;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public class FaultHidingSink extends AbstractC9712k {
    private boolean hasErrors;
    private final Function1<IOException, C10775u> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(InterfaceC9696b0 interfaceC9696b0, Function1<? super IOException, C10775u> function1) {
        super(interfaceC9696b0);
        C9801m.m32346f(interfaceC9696b0, "delegate");
        C9801m.m32346f(function1, "onException");
        this.onException = function1;
    }

    @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }

    public final Function1<IOException, C10775u> getOnException() {
        return this.onException;
    }

    @Override // p353j.AbstractC9712k, p353j.InterfaceC9696b0
    public void write(C9703f source, long byteCount) throws EOFException {
        C9801m.m32346f(source, "source");
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e2) {
            this.hasErrors = true;
            this.onException.invoke(e2);
        }
    }
}
