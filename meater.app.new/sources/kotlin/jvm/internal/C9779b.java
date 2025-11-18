package kotlin.jvm.internal;

import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: ArrayIterator.kt */
@Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m32267d2 = {"iterator", HttpUrl.FRAGMENT_ENCODE_SET, "T", "array", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/util/Iterator;", "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.a0.d.b */
/* loaded from: classes2.dex */
public final class C9779b {
    /* renamed from: a */
    public static final <T> Iterator<T> m32281a(T[] tArr) {
        C9801m.m32346f(tArr, "array");
        return new ArrayIterator(tArr);
    }
}
