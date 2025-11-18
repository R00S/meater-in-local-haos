package cc;

import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import oa.C4158c;

/* compiled from: CoroutineExceptionHandlerImpl.common.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta/g;", "context", "", "exception", "Loa/F;", "a", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2378i {
    public static final void a(ta.g gVar, Throwable th) {
        Iterator<Xb.F> it = C2377h.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().y(gVar, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                C2377h.b(Xb.G.b(th, th2));
            }
        }
        try {
            C4158c.a(th, new DiagnosticCoroutineContextException(gVar));
        } catch (Throwable unused2) {
        }
        C2377h.b(th);
    }
}
