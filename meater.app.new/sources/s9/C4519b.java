package s9;

import android.content.Context;
import com.google.firebase.n;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* compiled from: FirebasePerfEarly.java */
/* renamed from: s9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4519b {
    public C4519b(com.google.firebase.f fVar, n nVar, Executor executor) {
        Context contextK = fVar.k();
        com.google.firebase.perf.config.a.g().O(contextK);
        com.google.firebase.perf.application.a aVarB = com.google.firebase.perf.application.a.b();
        aVarB.i(contextK);
        aVarB.j(new f());
        if (nVar != null) {
            AppStartTrace appStartTraceN = AppStartTrace.n();
            appStartTraceN.x(contextK);
            executor.execute(new AppStartTrace.c(appStartTraceN));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
