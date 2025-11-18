package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p353j.C9710i;

/* compiled from: Header.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\r8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m32267d2 = {"Lokhttp3/internal/http2/Header;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lj/i;", "component1", "()Lj/i;", "component2", "name", "value", "copy", "(Lj/i;Lj/i;)Lokhttp3/internal/http2/Header;", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "other", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "Lj/i;", "hpackSize", "I", "<init>", "(Lj/i;Lj/i;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Lj/i;Ljava/lang/String;)V", "Companion", "okhttp"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class Header {
    public static final C9710i PSEUDO_PREFIX;
    public static final C9710i RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C9710i TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C9710i TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C9710i TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C9710i TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C9710i name;
    public final C9710i value;

    static {
        C9710i.a aVar = C9710i.f37052g;
        PSEUDO_PREFIX = aVar.m32103d(":");
        RESPONSE_STATUS = aVar.m32103d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.m32103d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.m32103d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.m32103d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.m32103d(TARGET_AUTHORITY_UTF8);
    }

    public Header(C9710i c9710i, C9710i c9710i2) {
        C9801m.m32346f(c9710i, "name");
        C9801m.m32346f(c9710i2, "value");
        this.name = c9710i;
        this.value = c9710i2;
        this.hpackSize = c9710i.m32093P() + 32 + c9710i2.m32093P();
    }

    public static /* synthetic */ Header copy$default(Header header, C9710i c9710i, C9710i c9710i2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            c9710i = header.name;
        }
        if ((i2 & 2) != 0) {
            c9710i2 = header.value;
        }
        return header.copy(c9710i, c9710i2);
    }

    /* renamed from: component1, reason: from getter */
    public final C9710i getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final C9710i getValue() {
        return this.value;
    }

    public final Header copy(C9710i name, C9710i value) {
        C9801m.m32346f(name, "name");
        C9801m.m32346f(value, "value");
        return new Header(name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return C9801m.m32341a(this.name, header.name) && C9801m.m32341a(this.value, header.value);
    }

    public int hashCode() {
        C9710i c9710i = this.name;
        int iHashCode = (c9710i != null ? c9710i.hashCode() : 0) * 31;
        C9710i c9710i2 = this.value;
        return iHashCode + (c9710i2 != null ? c9710i2.hashCode() : 0);
    }

    public String toString() {
        return this.name.m32095S() + ": " + this.value.m32095S();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String str, String str2) {
        C9801m.m32346f(str, "name");
        C9801m.m32346f(str2, "value");
        C9710i.a aVar = C9710i.f37052g;
        this(aVar.m32103d(str), aVar.m32103d(str2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(C9710i c9710i, String str) {
        this(c9710i, C9710i.f37052g.m32103d(str));
        C9801m.m32346f(c9710i, "name");
        C9801m.m32346f(str, "value");
    }
}
