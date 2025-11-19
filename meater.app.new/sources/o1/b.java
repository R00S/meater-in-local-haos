package o1;

import android.os.Handler;
import android.os.Looper;

/* compiled from: CalleeHandler.java */
/* loaded from: classes.dex */
class b {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
