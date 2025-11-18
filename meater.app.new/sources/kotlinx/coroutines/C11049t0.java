package kotlinx.coroutines;

import kotlin.C10568o;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import okhttp3.HttpUrl;

/* compiled from: DebugStrings.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\bH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m32267d2 = {"classSimpleName", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "getClassSimpleName", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "getHexAddress", "toDebugString", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.t0 */
/* loaded from: classes3.dex */
public final class C11049t0 {
    /* renamed from: a */
    public static final String m39687a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m39688b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m39689c(Continuation<?> continuation) {
        Object objM37650a;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            Result.a aVar = Result.f40714f;
            objM37650a = Result.m37650a(continuation + '@' + m39688b(continuation));
        } catch (Throwable th) {
            Result.a aVar2 = Result.f40714f;
            objM37650a = Result.m37650a(C10568o.m37654a(th));
        }
        if (Result.m37651b(objM37650a) != null) {
            objM37650a = continuation.getClass().getName() + '@' + m39688b(continuation);
        }
        return (String) objM37650a;
    }
}
