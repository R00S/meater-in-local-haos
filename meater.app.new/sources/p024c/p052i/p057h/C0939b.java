package p024c.p052i.p057h;

import android.os.Handler;
import android.os.Looper;

/* compiled from: CalleeHandler.java */
/* renamed from: c.i.h.b */
/* loaded from: classes.dex */
class C0939b {
    /* renamed from: a */
    static Handler m5970a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
