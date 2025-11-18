package e7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class I extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f40614a;

    /* renamed from: b, reason: collision with root package name */
    private final H f40615b;

    public I(H h10) {
        this.f40615b = h10;
    }

    public final void a(Context context) {
        this.f40614a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f40614a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f40614a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f40615b.a();
            b();
        }
    }
}
