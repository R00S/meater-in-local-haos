package zc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oc.EnumC4177A;
import zc.l;

/* compiled from: AndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\u000bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006!"}, d2 = {"Lzc/h;", "Lzc/m;", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "", "b", "()Z", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Loc/A;", "protocols", "Loa/F;", "d", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "c", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "e", "setAlpnProtocols", "f", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: g, reason: collision with root package name */
    private static final l.a f53939g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<? super SSLSocket> sslSocketClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Method setUseSessionTickets;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Method setHostname;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Method getAlpnSelectedProtocol;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Method setAlpnProtocols;

    /* compiled from: AndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzc/h$a;", "", "<init>", "()V", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lzc/h;", "b", "(Ljava/lang/Class;)Lzc/h;", "", "packageName", "Lzc/l$a;", "c", "(Ljava/lang/String;)Lzc/l$a;", "playProviderFactory", "Lzc/l$a;", "d", "()Lzc/l$a;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: zc.h$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: AndroidSocketAdapter.kt */
        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"zc/h$a$a", "Lzc/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "(Ljavax/net/ssl/SSLSocket;)Z", "Lzc/m;", "b", "(Ljavax/net/ssl/SSLSocket;)Lzc/m;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: zc.h$a$a, reason: collision with other inner class name */
        public static final class C0792a implements l.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f53945a;

            C0792a(String str) {
                this.f53945a = str;
            }

            @Override // zc.l.a
            public boolean a(SSLSocket sslSocket) {
                C3862t.g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                C3862t.f(name, "sslSocket.javaClass.name");
                return Ub.n.G(name, this.f53945a + '.', false, 2, null);
            }

            @Override // zc.l.a
            public m b(SSLSocket sslSocket) {
                C3862t.g(sslSocket, "sslSocket");
                return h.INSTANCE.b(sslSocket.getClass());
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final h b(Class<? super SSLSocket> actualSSLSocketClass) {
            Class<? super SSLSocket> superclass = actualSSLSocketClass;
            while (superclass != null && !C3862t.b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + actualSSLSocketClass);
                }
            }
            C3862t.d(superclass);
            return new h(superclass);
        }

        public final l.a c(String packageName) {
            C3862t.g(packageName, "packageName");
            return new C0792a(packageName);
        }

        public final l.a d() {
            return h.f53939g;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f53939g = companion.c("com.google.android.gms.org.conscrypt");
    }

    public h(Class<? super SSLSocket> sslSocketClass) throws NoSuchMethodException, SecurityException {
        C3862t.g(sslSocketClass, "sslSocketClass");
        this.sslSocketClass = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C3862t.f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.setUseSessionTickets = declaredMethod;
        this.setHostname = sslSocketClass.getMethod("setHostname", String.class);
        this.getAlpnSelectedProtocol = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.setAlpnProtocols = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // zc.m
    public boolean a(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        return this.sslSocketClass.isInstance(sslSocket);
    }

    @Override // zc.m
    public boolean b() {
        return yc.b.INSTANCE.b();
    }

    @Override // zc.m
    public String c(SSLSocket sslSocket) {
        C3862t.g(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.getAlpnSelectedProtocol.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Ub.d.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && C3862t.b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // zc.m
    public void d(SSLSocket sslSocket, String hostname, List<? extends EnumC4177A> protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C3862t.g(sslSocket, "sslSocket");
        C3862t.g(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.setUseSessionTickets.invoke(sslSocket, Boolean.TRUE);
                if (hostname != null) {
                    this.setHostname.invoke(sslSocket, hostname);
                }
                this.setAlpnProtocols.invoke(sslSocket, yc.j.INSTANCE.c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
