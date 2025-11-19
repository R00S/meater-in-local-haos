package zc;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oc.EnumC4177A;

/* compiled from: DeferredSocketAdapter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzc/l;", "Lzc/m;", "Lzc/l$a;", "socketAdapterFactory", "<init>", "(Lzc/l$a;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "e", "(Ljavax/net/ssl/SSLSocket;)Lzc/m;", "", "b", "()Z", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Loc/A;", "protocols", "Loa/F;", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lzc/l$a;", "Lzc/m;", "delegate", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a socketAdapterFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private m delegate;

    /* compiled from: DeferredSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzc/l$a;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lzc/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lzc/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface a {
        boolean a(SSLSocket sslSocket);

        m b(SSLSocket sslSocket);
    }

    public l(a socketAdapterFactory) {
        C3862t.g(socketAdapterFactory, "socketAdapterFactory");
        this.socketAdapterFactory = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sslSocket) {
        try {
            if (this.delegate == null && this.socketAdapterFactory.a(sslSocket)) {
                this.delegate = this.socketAdapterFactory.b(sslSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.delegate;
    }

    @Override // zc.m
    public boolean a(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        return this.socketAdapterFactory.a(sslSocket);
    }

    @Override // zc.m
    public boolean b() {
        return true;
    }

    @Override // zc.m
    public String c(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            return mVarE.c(sslSocket);
        }
        return null;
    }

    @Override // zc.m
    public void d(SSLSocket sslSocket, String hostname, List<? extends EnumC4177A> protocols) {
        C3862t.g(sslSocket, "sslSocket");
        C3862t.g(protocols, "protocols");
        m mVarE = e(sslSocket);
        if (mVarE != null) {
            mVarE.d(sslSocket, hostname, protocols);
        }
    }
}
