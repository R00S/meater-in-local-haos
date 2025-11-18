package androidx.media3.common;

import java.io.IOException;

/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: B, reason: collision with root package name */
    public final boolean f26023B;

    /* renamed from: C, reason: collision with root package name */
    public final int f26024C;

    protected ParserException(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f26023B = z10;
        this.f26024C = i10;
    }

    public static ParserException a(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException b(String str, Throwable th) {
        return new ParserException(str, th, true, 0);
    }

    public static ParserException c(String str, Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public static ParserException d(String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f26023B + ", dataType=" + this.f26024C + "}";
    }
}
