package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okhttp3.HttpUrl;

/* compiled from: MainDispatchers.kt */
@Metadata(m32266d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a \u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\b\u0010\u000b\u001a\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0007\u001a\u001a\u0010\u000f\u001a\u00020\u000e*\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0003X\u0082D¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, m32267d2 = {"FAST_SERVICE_LOADER_PROPERTY_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "SUPPORT_MISSING", HttpUrl.FRAGMENT_ENCODE_SET, "getSUPPORT_MISSING$annotations", "()V", "createMissingDispatcher", "Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "cause", HttpUrl.FRAGMENT_ENCODE_SET, "errorHint", "throwMissingMainDispatcherException", HttpUrl.FRAGMENT_ENCODE_SET, "isMissing", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "tryCreateDispatcher", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "factories", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes3.dex */
public final class C11004w {

    /* renamed from: a */
    private static final boolean f41833a = true;

    /* renamed from: a */
    private static final MissingMainCoroutineDispatcher m39583a(Throwable th, String str) throws Throwable {
        if (f41833a) {
            return new MissingMainCoroutineDispatcher(th, str);
        }
        if (th != null) {
            throw th;
        }
        m39586d();
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    static /* synthetic */ MissingMainCoroutineDispatcher m39584b(Throwable th, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return m39583a(th, str);
    }

    /* renamed from: c */
    public static final boolean m39585c(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.mo39108T() instanceof MissingMainCoroutineDispatcher;
    }

    /* renamed from: d */
    public static final Void m39586d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final MainCoroutineDispatcher m39587e(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return m39583a(th, mainDispatcherFactory.hintOnError());
        }
    }
}
