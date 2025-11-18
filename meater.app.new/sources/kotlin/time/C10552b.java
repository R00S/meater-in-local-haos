package kotlin.time;

import java.text.DecimalFormat;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: DurationJvm.kt */
@Metadata(m32266d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0011"}, m32267d2 = {"durationAssertionsEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "getDurationAssertionsEnabled", "()Z", "precisionFormats", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "createFormatForDecimals", "decimals", HttpUrl.FRAGMENT_ENCODE_SET, "formatToExactDecimals", HttpUrl.FRAGMENT_ENCODE_SET, "value", HttpUrl.FRAGMENT_ENCODE_SET, "formatUpToDecimals", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.i0.b */
/* loaded from: classes3.dex */
public final class C10552b {

    /* renamed from: a */
    private static final boolean f40697a = false;

    /* renamed from: b */
    private static final ThreadLocal<DecimalFormat>[] f40698b;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i2 = 0; i2 < 4; i2++) {
            threadLocalArr[i2] = new ThreadLocal<>();
        }
        f40698b = threadLocalArr;
    }

    /* renamed from: a */
    public static final boolean m37624a() {
        return f40697a;
    }
}
