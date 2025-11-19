package oc;

import Cc.h;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: CertificatePinner.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0003\u000f\u0014\u0016B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Loc/g;", "", "", "Loc/g$c;", "pins", "LBc/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;LBc/c;)V", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Loa/F;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;LBa/a;)V", "c", "(Ljava/lang/String;)Ljava/util/List;", "e", "(LBc/c;)Loc/g;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "LBc/c;", "d", "()LBc/c;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: oc.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4187g {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final C4187g f46893d = new a().a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<c> pins;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bc.c certificateChainCleaner;

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Loc/g$a;", "", "<init>", "()V", "Loc/g;", "a", "()Loc/g;", "", "Loc/g$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.g$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<c> pins = new ArrayList();

        public final C4187g a() {
            return new C4187g(kotlin.collections.r.b1(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loc/g$b;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "LCc/h;", "b", "(Ljava/security/cert/X509Certificate;)LCc/h;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Loc/g;", "DEFAULT", "Loc/g;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a(Certificate certificate) {
            C3862t.g(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).c();
        }

        public final Cc.h b(X509Certificate x509Certificate) {
            C3862t.g(x509Certificate, "<this>");
            h.Companion companion = Cc.h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C3862t.f(encoded, "publicKey.encoded");
            return h.Companion.g(companion, encoded, 0, 0, 3, null).H();
        }

        public final Cc.h c(X509Certificate x509Certificate) {
            C3862t.g(x509Certificate, "<this>");
            h.Companion companion = Cc.h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C3862t.f(encoded, "publicKey.encoded");
            return h.Companion.g(companion, encoded, 0, 0, 3, null).I();
        }

        private Companion() {
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"Loc/g$c;", "", "", "hostname", "", "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "pattern", "b", "hashAlgorithm", "LCc/h;", "LCc/h;", "()LCc/h;", "hash", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: oc.g$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String pattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String hashAlgorithm;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Cc.h hash;

        /* renamed from: a, reason: from getter */
        public final Cc.h getHash() {
            return this.hash;
        }

        /* renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final boolean c(String hostname) {
            C3862t.g(hostname, "hostname");
            if (Ub.n.G(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (!Ub.n.x(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null)) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                if (!Ub.n.G(this.pattern, "*.", false, 2, null)) {
                    return C3862t.b(hostname, this.pattern);
                }
                int length3 = this.pattern.length() - 1;
                int length4 = hostname.length() - length3;
                if (!Ub.n.x(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) || Ub.n.d0(hostname, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return C3862t.b(this.pattern, cVar.pattern) && C3862t.b(this.hashAlgorithm, cVar.hashAlgorithm) && C3862t.b(this.hash, cVar.hash);
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.c();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: oc.g$d */
    static final class d extends AbstractC3864v implements Ba.a<List<? extends X509Certificate>> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f46901C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f46902D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f46901C = list;
            this.f46902D = str;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            List<Certificate> listA;
            Bc.c certificateChainCleaner = C4187g.this.getCertificateChainCleaner();
            if (certificateChainCleaner == null || (listA = certificateChainCleaner.a(this.f46901C, this.f46902D)) == null) {
                listA = this.f46901C;
            }
            List<Certificate> list = listA;
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(list, 10));
            for (Certificate certificate : list) {
                C3862t.e(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public C4187g(Set<c> pins, Bc.c cVar) {
        C3862t.g(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = cVar;
    }

    public final void a(String hostname, List<? extends Certificate> peerCertificates) {
        C3862t.g(hostname, "hostname");
        C3862t.g(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, Ba.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        C3862t.g(hostname, "hostname");
        C3862t.g(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listC = c(hostname);
        if (listC.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            Cc.h hVarC = null;
            Cc.h hVarB = null;
            for (c cVar : listC) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                if (C3862t.b(hashAlgorithm, "sha256")) {
                    if (hVarC == null) {
                        hVarC = INSTANCE.c(x509Certificate);
                    }
                    if (C3862t.b(cVar.getHash(), hVarC)) {
                        return;
                    }
                } else {
                    if (!C3862t.b(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (hVarB == null) {
                        hVarB = INSTANCE.b(x509Certificate);
                    }
                    if (C3862t.b(cVar.getHash(), hVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : listC) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String string = sb2.toString();
        C3862t.f(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public final List<c> c(String hostname) {
        C3862t.g(hostname, "hostname");
        Set<c> set = this.pins;
        List<c> listM = kotlin.collections.r.m();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listM.isEmpty()) {
                    listM = new ArrayList<>();
                }
                C3862t.e(listM, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                W.c(listM).add(obj);
            }
        }
        return listM;
    }

    /* renamed from: d, reason: from getter */
    public final Bc.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final C4187g e(Bc.c certificateChainCleaner) {
        C3862t.g(certificateChainCleaner, "certificateChainCleaner");
        return C3862t.b(this.certificateChainCleaner, certificateChainCleaner) ? this : new C4187g(this.pins, certificateChainCleaner);
    }

    public boolean equals(Object other) {
        if (other instanceof C4187g) {
            C4187g c4187g = (C4187g) other;
            if (C3862t.b(c4187g.pins, this.pins) && C3862t.b(c4187g.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        Bc.c cVar = this.certificateChainCleaner;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ C4187g(Set set, Bc.c cVar, int i10, C3854k c3854k) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
