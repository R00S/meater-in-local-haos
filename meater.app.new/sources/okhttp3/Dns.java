package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10803n;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: Dns.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m32267d2 = {"Lokhttp3/Dns;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Dns {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* compiled from: Dns.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, m32267d2 = {"Lokhttp3/Dns$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns;", "SYSTEM", "Lokhttp3/Dns;", "<init>", "()V", "DnsSystem", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* compiled from: Dns.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m32267d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", HttpUrl.FRAGMENT_ENCODE_SET, "hostname", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        private static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                C9801m.m32346f(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    C9801m.m32345e(allByName, "InetAddress.getAllByName(hostname)");
                    return C10803n.m38746Z(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    List<InetAddress> lookup(String hostname) throws UnknownHostException;
}
