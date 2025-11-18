package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import kotlin.ranges.C9848l;
import okhttp3.HttpUrl;
import p353j.C9703f;

/* compiled from: utf8.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m32267d2 = {"Lj/f;", HttpUrl.FRAGMENT_ENCODE_SET, "isProbablyUtf8", "(Lj/f;)Z", "okhttp-logging-interceptor"}, m32268k = 2, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(C9703f c9703f) {
        C9801m.m32346f(c9703f, "$this$isProbablyUtf8");
        try {
            C9703f c9703f2 = new C9703f();
            c9703f.m32044j(c9703f2, 0L, C9848l.m32422e(c9703f.size(), 64L));
            for (int i2 = 0; i2 < 16; i2++) {
                if (c9703f2.mo32019R()) {
                    return true;
                }
                int iM32029a0 = c9703f2.m32029a0();
                if (Character.isISOControl(iM32029a0) && !Character.isWhitespace(iM32029a0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
