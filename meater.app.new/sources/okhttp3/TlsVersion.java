package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: TlsVersion.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0005\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m32267d2 = {"Lokhttp3/TlsVersion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_javaName", "()Ljava/lang/String;", "javaName", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String javaName;

    /* compiled from: TlsVersion.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lokhttp3/TlsVersion$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "javaName", "Lokhttp3/TlsVersion;", "forJavaName", "(Ljava/lang/String;)Lokhttp3/TlsVersion;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TlsVersion forJavaName(String javaName) {
            C9801m.m32346f(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    TlsVersion(String str) {
        this.javaName = str;
    }

    public static final TlsVersion forJavaName(String str) {
        return INSTANCE.forJavaName(str);
    }

    /* renamed from: -deprecated_javaName, reason: not valid java name and from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public final String javaName() {
        return this.javaName;
    }
}
