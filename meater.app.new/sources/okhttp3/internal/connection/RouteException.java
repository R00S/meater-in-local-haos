package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4158c;

/* compiled from: RouteException.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "e", "Loa/F;", "a", "B", "Ljava/io/IOException;", "b", "()Ljava/io/IOException;", "<set-?>", "C", "c", "lastConnectException", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final IOException firstConnectException;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private IOException lastConnectException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        C3862t.g(firstConnectException, "firstConnectException");
        this.firstConnectException = firstConnectException;
        this.lastConnectException = firstConnectException;
    }

    public final void a(IOException e10) {
        C3862t.g(e10, "e");
        C4158c.a(this.firstConnectException, e10);
        this.lastConnectException = e10;
    }

    /* renamed from: b, reason: from getter */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* renamed from: c, reason: from getter */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
