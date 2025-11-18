package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p353j.InterfaceC9709h;

/* compiled from: RealResponseBody.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0012"}, m32267d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", HttpUrl.FRAGMENT_ENCODE_SET, "contentLength", "()J", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "Lj/h;", "source", "()Lj/h;", HttpUrl.FRAGMENT_ENCODE_SET, "contentTypeString", "Ljava/lang/String;", "J", "Lj/h;", "<init>", "(Ljava/lang/String;JLj/h;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final InterfaceC9709h source;

    public RealResponseBody(String str, long j2, InterfaceC9709h interfaceC9709h) {
        C9801m.m32346f(interfaceC9709h, "source");
        this.contentTypeString = str;
        this.contentLength = j2;
        this.source = interfaceC9709h;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public MediaType get$contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.INSTANCE.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source, reason: from getter */
    public InterfaceC9709h getSource() {
        return this.source;
    }
}
