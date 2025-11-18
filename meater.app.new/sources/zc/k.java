package zc;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.EnumC4177A;
import org.conscrypt.Conscrypt;
import zc.l;

/* compiled from: ConscryptSocketAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzc/k;", "Lzc/m;", "<init>", "()V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "b", "()Z", "", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Loc/A;", "protocols", "Loa/F;", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final l.a f53953b = new a();

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"zc/k$a", "Lzc/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lzc/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lzc/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements l.a {
        a() {
        }

        @Override // zc.l.a
        public boolean a(SSLSocket sslSocket) {
            C3862t.g(sslSocket, "sslSocket");
            return yc.d.INSTANCE.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // zc.l.a
        public m b(SSLSocket sslSocket) {
            C3862t.g(sslSocket, "sslSocket");
            return new k();
        }
    }

    /* compiled from: ConscryptSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzc/k$b;", "", "<init>", "()V", "Lzc/l$a;", "factory", "Lzc/l$a;", "a", "()Lzc/l$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zc.k$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final l.a a() {
            return k.f53953b;
        }

        private Companion() {
        }
    }

    @Override // zc.m
    public boolean a(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // zc.m
    public boolean b() {
        return yc.d.INSTANCE.c();
    }

    @Override // zc.m
    public String c(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // zc.m
    public void d(SSLSocket sslSocket, String hostname, List<? extends EnumC4177A> protocols) {
        C3862t.g(sslSocket, "sslSocket");
        C3862t.g(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) yc.j.INSTANCE.b(protocols).toArray(new String[0]));
        }
    }
}
