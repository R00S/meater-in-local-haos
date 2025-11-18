package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* compiled from: ConnectionPool.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, m32267d2 = {"Lokhttp3/ConnectionPool;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "idleConnectionCount", "()I", "connectionCount", "Lkotlin/u;", "evictAll", "()V", "Lokhttp3/internal/connection/RealConnectionPool;", "delegate", "Lokhttp3/internal/connection/RealConnectionPool;", "getDelegate$okhttp", "()Lokhttp3/internal/connection/RealConnectionPool;", "<init>", "(Lokhttp3/internal/connection/RealConnectionPool;)V", "maxIdleConnections", HttpUrl.FRAGMENT_ENCODE_SET, "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(IJLjava/util/concurrent/TimeUnit;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ConnectionPool {
    private final RealConnectionPool delegate;

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        C9801m.m32346f(realConnectionPool, "delegate");
        this.delegate = realConnectionPool;
    }

    public final int connectionCount() {
        return this.delegate.connectionCount();
    }

    public final void evictAll() {
        this.delegate.evictAll();
    }

    /* renamed from: getDelegate$okhttp, reason: from getter */
    public final RealConnectionPool getDelegate() {
        return this.delegate;
    }

    public final int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i2, long j2, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.INSTANCE, i2, j2, timeUnit));
        C9801m.m32346f(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
