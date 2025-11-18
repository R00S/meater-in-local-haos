package yc;

import Cc.C0982e;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.EnumC4177A;
import oc.z;
import zc.C5230e;

/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J-\u0010&\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u001e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00012\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010-J!\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u0002052\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002082\u0006\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0006¨\u0006="}, d2 = {"Lyc/j;", "", "<init>", "()V", "", "g", "()Ljava/lang/String;", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Loc/A;", "protocols", "Loa/F;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "message", "level", "", "t", "k", "(Ljava/lang/String;ILjava/lang/Throwable;)V", "", "j", "(Ljava/lang/String;)Z", "closer", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "trustManager", "LBc/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)LBc/c;", "LBc/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)LBc/e;", "Ljavax/net/ssl/SSLSocketFactory;", "o", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "toString", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f53313b;

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f53314c;

    /* compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lyc/j$a;", "", "<init>", "()V", "Lyc/j;", "f", "()Lyc/j;", "d", "e", "g", "", "Loc/A;", "protocols", "", "b", "(Ljava/util/List;)Ljava/util/List;", "", "c", "(Ljava/util/List;)[B", "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", "h", "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lyc/j;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: yc.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final j d() {
            C5230e.f53934a.b();
            j jVarA = C5151a.INSTANCE.a();
            if (jVarA != null) {
                return jVarA;
            }
            j jVarA2 = b.f53285f.a();
            C3862t.d(jVarA2);
            return jVarA2;
        }

        private final j e() {
            i iVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.INSTANCE.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.INSTANCE.a()) != null) {
                return cVarA;
            }
            if (k() && (iVarA = i.INSTANCE.a()) != null) {
                return iVarA;
            }
            h hVarA = h.INSTANCE.a();
            if (hVarA != null) {
                return hVarA;
            }
            j jVarA = e.INSTANCE.a();
            return jVarA != null ? jVarA : new j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return C3862t.b("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return C3862t.b("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return C3862t.b("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends EnumC4177A> protocols) {
            C3862t.g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC4177A) obj) != EnumC4177A.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(r.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC4177A) it.next()).getProtocol());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends EnumC4177A> protocols) {
            C3862t.g(protocols, "protocols");
            C0982e c0982e = new C0982e();
            for (String str : b(protocols)) {
                c0982e.d0(str.length());
                c0982e.A0(str);
            }
            return c0982e.Z();
        }

        public final j g() {
            return j.f53313b;
        }

        public final boolean h() {
            return C3862t.b("Dalvik", System.getProperty("java.vm.name"));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f53313b = companion.f();
        f53314c = Logger.getLogger(z.class.getName());
    }

    public static /* synthetic */ void l(j jVar, String str, int i10, Throwable th, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th = null;
        }
        jVar.k(str, i10, th);
    }

    public void b(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
    }

    public Bc.c c(X509TrustManager trustManager) {
        C3862t.g(trustManager, "trustManager");
        return new Bc.a(d(trustManager));
    }

    public Bc.e d(X509TrustManager trustManager) {
        C3862t.g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        C3862t.f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new Bc.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String hostname, List<EnumC4177A> protocols) {
        C3862t.g(sslSocket, "sslSocket");
        C3862t.g(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int connectTimeout) throws IOException {
        C3862t.g(socket, "socket");
        C3862t.g(address, "address");
        socket.connect(address, connectTimeout);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        C3862t.g(closer, "closer");
        if (f53314c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        C3862t.g(hostname, "hostname");
        return true;
    }

    public void k(String message, int level, Throwable t10) {
        C3862t.g(message, "message");
        f53314c.log(level == 5 ? Level.WARNING : Level.INFO, message, t10);
    }

    public void m(String message, Object stackTrace) {
        C3862t.g(message, "message");
        if (stackTrace == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) stackTrace);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C3862t.f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) throws KeyManagementException {
        C3862t.g(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            C3862t.f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS: " + e10, e10);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C3862t.d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                C3862t.e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        C3862t.f(string, "toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C3862t.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
