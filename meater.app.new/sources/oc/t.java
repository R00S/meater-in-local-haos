package oc;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;

/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \u00192\u00020\u0001:\u0001\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010 R\u0018\u0010%\u001a\u00020\u0014*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$¨\u0006&"}, d2 = {"Loc/t;", "", "Loc/G;", "tlsVersion", "Loc/i;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Loc/G;Loc/i;Ljava/util/List;LBa/a;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Loc/G;", "e", "()Loc/G;", "b", "Loc/i;", "()Loc/i;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "Loa/i;", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final G tlsVersion;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i cipherSuite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Certificate> localCertificates;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i peerCertificates;

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006*\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Loc/t$a;", "", "<init>", "()V", "", "Ljava/security/cert/Certificate;", "", "c", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Loc/t;", "a", "(Ljavax/net/ssl/SSLSession;)Loc/t;", "Loc/G;", "tlsVersion", "Loc/i;", "cipherSuite", "peerCertificates", "localCertificates", "b", "(Loc/G;Loc/i;Ljava/util/List;Ljava/util/List;)Loc/t;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.t$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: oc.t$a$a, reason: collision with other inner class name */
        static final class C0652a extends AbstractC3864v implements Ba.a<List<? extends Certificate>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f47086B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0652a(List<? extends Certificate> list) {
                super(0);
                this.f47086B = list;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f47086B;
            }
        }

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: oc.t$a$b */
        static final class b extends AbstractC3864v implements Ba.a<List<? extends Certificate>> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f47087B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(List<? extends Certificate> list) {
                super(0);
                this.f47087B = list;
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f47087B;
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            return certificateArr != null ? pc.d.w(Arrays.copyOf(certificateArr, certificateArr.length)) : kotlin.collections.r.m();
        }

        public final t a(SSLSession sSLSession) throws IOException {
            List<Certificate> listM;
            C3862t.g(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (C3862t.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C3862t.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            i iVarB = i.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (C3862t.b("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            G gA = G.INSTANCE.a(protocol);
            try {
                listM = c(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listM = kotlin.collections.r.m();
            }
            return new t(gA, iVarB, c(sSLSession.getLocalCertificates()), new b(listM));
        }

        public final t b(G tlsVersion, i cipherSuite, List<? extends Certificate> peerCertificates, List<? extends Certificate> localCertificates) {
            C3862t.g(tlsVersion, "tlsVersion");
            C3862t.g(cipherSuite, "cipherSuite");
            C3862t.g(peerCertificates, "peerCertificates");
            C3862t.g(localCertificates, "localCertificates");
            return new t(tlsVersion, cipherSuite, pc.d.T(localCertificates), new C0652a(pc.d.T(peerCertificates)));
        }

        private Companion() {
        }
    }

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<List<? extends Certificate>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<List<Certificate>> f47088B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Ba.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f47088B = aVar;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            try {
                return this.f47088B.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return kotlin.collections.r.m();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(G tlsVersion, i cipherSuite, List<? extends Certificate> localCertificates, Ba.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        C3862t.g(tlsVersion, "tlsVersion");
        C3862t.g(cipherSuite, "cipherSuite");
        C3862t.g(localCertificates, "localCertificates");
        C3862t.g(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = C4165j.a(new b(peerCertificatesFn));
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C3862t.f(type, "type");
        return type;
    }

    /* renamed from: a, reason: from getter */
    public final i getCipherSuite() {
        return this.cipherSuite;
    }

    public final List<Certificate> c() {
        return this.localCertificates;
    }

    public final List<Certificate> d() {
        return (List) this.peerCertificates.getValue();
    }

    /* renamed from: e, reason: from getter */
    public final G getTlsVersion() {
        return this.tlsVersion;
    }

    public boolean equals(Object other) {
        if (other instanceof t) {
            t tVar = (t) other;
            if (tVar.tlsVersion == this.tlsVersion && C3862t.b(tVar.cipherSuite, this.cipherSuite) && C3862t.b(tVar.d(), d()) && C3862t.b(tVar.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + d().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    public String toString() {
        List<Certificate> listD = d();
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.r.x(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
