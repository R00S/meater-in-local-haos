package kotlinx.coroutines.internal;

import kotlin.C10568o;
import kotlin.Metadata;
import kotlin.Result;
import okhttp3.HttpUrl;

/* compiled from: FastServiceLoader.kt */
@Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m32267d2 = {"ANDROID_DETECTED", HttpUrl.FRAGMENT_ENCODE_SET, "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.l */
/* loaded from: classes3.dex */
public final class C10991l {

    /* renamed from: a */
    private static final boolean f41800a;

    static {
        Object objM37650a;
        try {
            Result.a aVar = Result.f40714f;
            objM37650a = Result.m37650a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f40714f;
            objM37650a = Result.m37650a(C10568o.m37654a(th));
        }
        f41800a = Result.m37653d(objM37650a);
    }

    /* renamed from: a */
    public static final boolean m39531a() {
        return f41800a;
    }
}
