package B9;

import com.google.firebase.perf.metrics.Trace;
import v9.C4925a;
import w9.f;

/* compiled from: ScreenTraceUtil.java */
/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final C4925a f1941a = C4925a.e();

    public static Trace a(Trace trace, f.a aVar) {
        if (aVar.d() > 0) {
            trace.putMetric(b.FRAMES_TOTAL.toString(), aVar.d());
        }
        if (aVar.c() > 0) {
            trace.putMetric(b.FRAMES_SLOW.toString(), aVar.c());
        }
        if (aVar.b() > 0) {
            trace.putMetric(b.FRAMES_FROZEN.toString(), aVar.b());
        }
        f1941a.a("Screen trace: " + trace.e() + " _fr_tot:" + aVar.d() + " _fr_slo:" + aVar.c() + " _fr_fzn:" + aVar.b());
        return trace;
    }
}
