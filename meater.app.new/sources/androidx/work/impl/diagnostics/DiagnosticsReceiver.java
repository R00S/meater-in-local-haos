package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC0807n;
import androidx.work.AbstractC0818y;
import androidx.work.C0809p;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4612a = AbstractC0807n.m5223f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC0807n.m5221c().mo5224a(f4612a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC0818y.m5238h(context).m5240c(C0809p.m5229d(DiagnosticsWorker.class));
        } catch (IllegalStateException e2) {
            AbstractC0807n.m5221c().mo5225b(f4612a, "WorkManager is not initialized", e2);
        }
    }
}
