package okhttp3.internal.http1;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import p353j.InterfaceC9709h;

/* compiled from: HeadersReader.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m32267d2 = {"Lokhttp3/internal/http1/HeadersReader;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "readLine", "()Ljava/lang/String;", "Lokhttp3/Headers;", "readHeaders", "()Lokhttp3/Headers;", "Lj/h;", "source", "Lj/h;", "getSource", "()Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "headerLimit", "J", "<init>", "(Lj/h;)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final InterfaceC9709h source;

    public HeadersReader(InterfaceC9709h interfaceC9709h) {
        C9801m.m32346f(interfaceC9709h, "source");
        this.source = interfaceC9709h;
        this.headerLimit = HEADER_LIMIT;
    }

    public final InterfaceC9709h getSource() {
        return this.source;
    }

    public final Headers readHeaders() throws IOException {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(line);
        }
    }

    public final String readLine() throws IOException {
        String strMo32040g0 = this.source.mo32040g0(this.headerLimit);
        this.headerLimit -= strMo32040g0.length();
        return strMo32040g0;
    }
}
