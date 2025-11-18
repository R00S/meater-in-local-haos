package okhttp3;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import p353j.C9703f;
import p353j.C9710i;
import p353j.InterfaceC9705g;

/* compiled from: MultipartBody.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 +2\u00020\u0001:\u0003,+-B'\b\u0000\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0004\b)\u0010*J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"R\u0013\u0010\u0016\u001a\u00020\u00138G@\u0006¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'R\u0019\u0010\u0012\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010'\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0019\u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006."}, m32267d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lj/g;", "sink", HttpUrl.FRAGMENT_ENCODE_SET, "countBytes", HttpUrl.FRAGMENT_ENCODE_SET, "writeOrCountBytes", "(Lj/g;Z)J", HttpUrl.FRAGMENT_ENCODE_SET, "index", "Lokhttp3/MultipartBody$Part;", "part", "(I)Lokhttp3/MultipartBody$Part;", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "-deprecated_type", "type", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", HttpUrl.FRAGMENT_ENCODE_SET, "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "()J", "Lkotlin/u;", "writeTo", "(Lj/g;)V", "Lj/i;", "boundaryByteString", "Lj/i;", "Ljava/util/List;", "Lokhttp3/MediaType;", "J", "<init>", "(Lj/i;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final C9710i boundaryByteString;
    private long contentLength;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* compiled from: MultipartBody.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\b\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, m32267d2 = {"Lokhttp3/MultipartBody$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/MediaType;", "type", "setType", "(Lokhttp3/MediaType;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/RequestBody;", "body", "addPart", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", HttpUrl.FRAGMENT_ENCODE_SET, "name", "value", "addFormDataPart", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Builder;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody$Part;", "part", "(Lokhttp3/MultipartBody$Part;)Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "build", "()Lokhttp3/MultipartBody;", "Lokhttp3/MediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "parts", "Ljava/util/List;", "Lj/i;", "boundary", "Lj/i;", "<init>", "(Ljava/lang/String;)V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Builder {
        private final C9710i boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Builder(String str) {
            C9801m.m32346f(str, "boundary");
            this.boundary = C9710i.f37052g.m32103d(str);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String name, String value) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(value, "value");
            addPart(Part.INSTANCE.createFormData(name, value));
            return this;
        }

        public final Builder addPart(RequestBody body) {
            C9801m.m32346f(body, "body");
            addPart(Part.INSTANCE.create(body));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType type) {
            C9801m.m32346f(type, "type");
            if (C9801m.m32341a(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public final Builder addFormDataPart(String name, String filename, RequestBody body) {
            C9801m.m32346f(name, "name");
            C9801m.m32346f(body, "body");
            addPart(Part.INSTANCE.createFormData(name, filename, body));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody body) {
            C9801m.m32346f(body, "body");
            addPart(Part.INSTANCE.create(headers, body));
            return this;
        }

        public final Builder addPart(Part part) {
            C9801m.m32346f(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i2, C9789g c9789g) {
            if ((i2 & 1) != 0) {
                str = UUID.randomUUID().toString();
                C9801m.m32345e(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, m32267d2 = {"Lokhttp3/MultipartBody$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", HttpUrl.FRAGMENT_ENCODE_SET, RoomNotification.KEY, "Lkotlin/u;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", HttpUrl.FRAGMENT_ENCODE_SET, "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            C9801m.m32346f(sb, "$this$appendQuotedString");
            C9801m.m32346f(str, RoomNotification.KEY);
            sb.append('\"');
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt == '\n') {
                    sb.append("%0A");
                } else if (cCharAt == '\r') {
                    sb.append("%0D");
                } else if (cCharAt != '\"') {
                    sb.append(cCharAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append('\"');
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: MultipartBody.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0005\u0010\u0004R\u0019\u0010\t\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\t\u0010\b¨\u0006\u000f"}, m32267d2 = {"Lokhttp3/MultipartBody$Part;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Headers;", "-deprecated_headers", "()Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "-deprecated_body", "()Lokhttp3/RequestBody;", "body", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "<init>", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
    public static final class Part {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* compiled from: MultipartBody.kt */
        @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010¨\u0006\u0013"}, m32267d2 = {"Lokhttp3/MultipartBody$Part$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/RequestBody;", "body", "Lokhttp3/MultipartBody$Part;", "create", "(Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", HttpUrl.FRAGMENT_ENCODE_SET, "name", "value", "createFormData", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;", "filename", "(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;", "<init>", "()V", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public final Part create(RequestBody body) {
                C9801m.m32346f(body, "body");
                return create(null, body);
            }

            public final Part createFormData(String name, String value) {
                C9801m.m32346f(name, "name");
                C9801m.m32346f(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.INSTANCE, value, (MediaType) null, 1, (Object) null));
            }

            public /* synthetic */ Companion(C9789g c9789g) {
                this();
            }

            public final Part create(Headers headers, RequestBody body) {
                C9801m.m32346f(body, "body");
                C9789g c9789g = null;
                if (!((headers != null ? headers.get("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get("Content-Length") : null) == null) {
                    return new Part(headers, body, c9789g);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public final Part createFormData(String name, String filename, RequestBody body) {
                C9801m.m32346f(name, "name");
                C9801m.m32346f(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.INSTANCE;
                companion.appendQuotedString$okhttp(sb, name);
                if (filename != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, filename);
                }
                String string = sb.toString();
                C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", string).build(), body);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return INSTANCE.create(headers, requestBody);
        }

        public static final Part create(RequestBody requestBody) {
            return INSTANCE.create(requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return INSTANCE.createFormData(str, str2);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return INSTANCE.createFormData(str, str2, requestBody);
        }

        /* renamed from: -deprecated_body, reason: not valid java name and from getter */
        public final RequestBody getBody() {
            return this.body;
        }

        /* renamed from: -deprecated_headers, reason: not valid java name and from getter */
        public final Headers getHeaders() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, C9789g c9789g) {
            this(headers, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.INSTANCE;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{(byte) 58, (byte) 32};
        CRLF = new byte[]{(byte) 13, (byte) 10};
        byte b2 = (byte) 45;
        DASHDASH = new byte[]{b2, b2};
    }

    public MultipartBody(C9710i c9710i, MediaType mediaType, List<Part> list) {
        C9801m.m32346f(c9710i, "boundaryByteString");
        C9801m.m32346f(mediaType, "type");
        C9801m.m32346f(list, "parts");
        this.boundaryByteString = c9710i;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.INSTANCE.get(mediaType + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(InterfaceC9705g sink, boolean countBytes) throws IOException {
        C9703f c9703f;
        if (countBytes) {
            sink = new C9703f();
            c9703f = sink;
        } else {
            c9703f = 0;
        }
        int size = this.parts.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Part part = this.parts.get(i2);
            Headers headers = part.headers();
            RequestBody requestBodyBody = part.body();
            C9801m.m32343c(sink);
            sink.write(DASHDASH);
            sink.mo32023U0(this.boundaryByteString);
            sink.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    sink.mo32055r0(headers.name(i3)).write(COLONSPACE).mo32055r0(headers.value(i3)).write(CRLF);
                }
            }
            MediaType contentType = requestBodyBody.getContentType();
            if (contentType != null) {
                sink.mo32055r0("Content-Type: ").mo32055r0(contentType.getMediaType()).write(CRLF);
            }
            long jContentLength = requestBodyBody.contentLength();
            if (jContentLength != -1) {
                sink.mo32055r0("Content-Length: ").mo32043i1(jContentLength).write(CRLF);
            } else if (countBytes) {
                C9801m.m32343c(c9703f);
                c9703f.m32030b();
                return -1L;
            }
            byte[] bArr = CRLF;
            sink.write(bArr);
            if (countBytes) {
                j2 += jContentLength;
            } else {
                requestBodyBody.writeTo(sink);
            }
            sink.write(bArr);
        }
        C9801m.m32343c(sink);
        byte[] bArr2 = DASHDASH;
        sink.write(bArr2);
        sink.mo32023U0(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(CRLF);
        if (!countBytes) {
            return j2;
        }
        C9801m.m32343c(c9703f);
        long size3 = j2 + c9703f.size();
        c9703f.m32030b();
        return size3;
    }

    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m41131deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m41132deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m41133deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type, reason: not valid java name and from getter */
    public final MediaType getType() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.m32095S();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j2 = this.contentLength;
        if (j2 != -1) {
            return j2;
        }
        long jWriteOrCountBytes = writeOrCountBytes(null, true);
        this.contentLength = jWriteOrCountBytes;
        return jWriteOrCountBytes;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.contentType;
    }

    public final Part part(int index) {
        return this.parts.get(index);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(InterfaceC9705g sink) throws IOException {
        C9801m.m32346f(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
