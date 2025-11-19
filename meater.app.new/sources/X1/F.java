package X1;

import android.os.Trace;

/* compiled from: TraceUtil.java */
/* loaded from: classes.dex */
public final class F {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
