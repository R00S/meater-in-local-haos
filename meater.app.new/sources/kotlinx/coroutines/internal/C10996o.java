package kotlinx.coroutines.internal;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: LimitedDispatcher.kt */
@Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m32267d2 = {"checkParallelism", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes3.dex */
public final class C10996o {
    /* renamed from: a */
    public static final void m39539a(int i2) {
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i2).toString());
    }
}
