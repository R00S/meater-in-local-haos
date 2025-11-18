package kotlinx.coroutines;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: MainCoroutineDispatcher.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\f"}, m32267d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "limitedParallelism", "parallelism", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "toStringInternalImpl", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.i2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    /* renamed from: T */
    public abstract MainCoroutineDispatcher mo39108T();

    /* renamed from: W */
    protected final String m39439W() {
        MainCoroutineDispatcher mainCoroutineDispatcherMo39108T;
        MainCoroutineDispatcher mainCoroutineDispatcherM39302c = Dispatchers.m39302c();
        if (this == mainCoroutineDispatcherM39302c) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcherMo39108T = mainCoroutineDispatcherM39302c.mo39108T();
        } catch (UnsupportedOperationException unused) {
            mainCoroutineDispatcherMo39108T = null;
        }
        if (this == mainCoroutineDispatcherMo39108T) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String strM39439W = m39439W();
        if (strM39439W != null) {
            return strM39439W;
        }
        return C11049t0.m39687a(this) + '@' + C11049t0.m39688b(this);
    }
}
