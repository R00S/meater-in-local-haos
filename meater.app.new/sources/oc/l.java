package oc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.InterfaceC4156a;
import ra.C4370a;

/* compiled from: ConnectionSpec.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u001e\"B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b%\u0010(R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Loc/l;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "g", "(Ljavax/net/ssl/SSLSocket;Z)Loc/l;", "Loa/F;", "c", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "f", "()Z", "b", "h", "[Ljava/lang/String;", "d", "", "Loc/i;", "()Ljava/util/List;", "cipherSuites", "Loc/G;", "i", "tlsVersions", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: f, reason: collision with root package name */
    private static final i[] f47030f;

    /* renamed from: g, reason: collision with root package name */
    private static final i[] f47031g;

    /* renamed from: h, reason: collision with root package name */
    public static final l f47032h;

    /* renamed from: i, reason: collision with root package name */
    public static final l f47033i;

    /* renamed from: j, reason: collision with root package name */
    public static final l f47034j;

    /* renamed from: k, reason: collision with root package name */
    public static final l f47035k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isTls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsTlsExtensions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String[] cipherSuitesAsString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] tlsVersionsAsString;

    static {
        i iVar = i.f47000o1;
        i iVar2 = i.f47003p1;
        i iVar3 = i.f47006q1;
        i iVar4 = i.f46958a1;
        i iVar5 = i.f46970e1;
        i iVar6 = i.f46961b1;
        i iVar7 = i.f46973f1;
        i iVar8 = i.f46991l1;
        i iVar9 = i.f46988k1;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9};
        f47030f = iVarArr;
        i[] iVarArr2 = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, i.f46928L0, i.f46930M0, i.f46984j0, i.f46987k0, i.f46919H, i.f46927L, i.f46989l};
        f47031g = iVarArr2;
        a aVarC = new a(true).c((i[]) Arrays.copyOf(iVarArr, iVarArr.length));
        G g10 = G.TLS_1_3;
        G g11 = G.TLS_1_2;
        f47032h = aVarC.f(g10, g11).d(true).a();
        f47033i = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g10, g11).d(true).a();
        f47034j = new a(true).c((i[]) Arrays.copyOf(iVarArr2, iVarArr2.length)).f(g10, g11, G.TLS_1_1, G.TLS_1_0).d(true).a();
        f47035k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.isTls = z10;
        this.supportsTlsExtensions = z11;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    private final l g(SSLSocket sslSocket, boolean isFallback) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            C3862t.f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = pc.d.E(enabledCipherSuites, this.cipherSuitesAsString, i.INSTANCE.c());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            C3862t.f(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = pc.d.E(enabledProtocols, this.tlsVersionsAsString, C4370a.f());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        C3862t.f(supportedCipherSuites, "supportedCipherSuites");
        int iX = pc.d.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", i.INSTANCE.c());
        if (isFallback && iX != -1) {
            C3862t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            C3862t.f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = pc.d.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        C3862t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarB = aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        C3862t.f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarB.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean isFallback) {
        C3862t.g(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, isFallback);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.tlsVersionsAsString);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.cipherSuitesAsString);
        }
    }

    public final List<i> d() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(i.INSTANCE.b(str));
        }
        return kotlin.collections.r.W0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        C3862t.g(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !pc.d.u(strArr, socket.getEnabledProtocols(), C4370a.f())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || pc.d.u(strArr2, socket.getEnabledCipherSuites(), i.INSTANCE.c());
    }

    public boolean equals(Object other) {
        if (!(other instanceof l)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z10 = this.isTls;
        l lVar = (l) other;
        if (z10 != lVar.isTls) {
            return false;
        }
        return !z10 || (Arrays.equals(this.cipherSuitesAsString, lVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, lVar.tlsVersionsAsString) && this.supportsTlsExtensions == lVar.supportsTlsExtensions);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    public final List<G> i() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(G.INSTANCE.a(str));
        }
        return kotlin.collections.r.W0(arrayList);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    /* compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\t\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u0005¨\u0006("}, d2 = {"Loc/l$a;", "", "", "tls", "<init>", "(Z)V", "Loc/l;", "connectionSpec", "(Loc/l;)V", "", "Loc/i;", "cipherSuites", "c", "([Loc/i;)Loc/l$a;", "", "b", "([Ljava/lang/String;)Loc/l$a;", "Loc/G;", "tlsVersions", "f", "([Loc/G;)Loc/l$a;", "e", "supportsTlsExtensions", "d", "(Z)Loc/l$a;", "a", "()Loc/l;", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean tls;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String[] cipherSuites;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String[] tlsVersions;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean supportsTlsExtensions;

        public a(boolean z10) {
            this.tls = z10;
        }

        public final l a() {
            return new l(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final a b(String... cipherSuites) {
            C3862t.g(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.cipherSuites = (String[]) cipherSuites.clone();
            return this;
        }

        public final a c(i... cipherSuites) {
            C3862t.g(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (i iVar : cipherSuites) {
                arrayList.add(iVar.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @InterfaceC4156a
        public final a d(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        public final a e(String... tlsVersions) {
            C3862t.g(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.tlsVersions = (String[]) tlsVersions.clone();
            return this;
        }

        public final a f(G... tlsVersions) {
            C3862t.g(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (G g10 : tlsVersions) {
                arrayList.add(g10.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(l connectionSpec) {
            C3862t.g(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.getSupportsTlsExtensions();
        }
    }
}
