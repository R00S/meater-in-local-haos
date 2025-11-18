package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f17550a;

    /* renamed from: b */
    private final zabr f17551b;

    public zabq(zabr zabrVar) {
        this.f17551b = zabrVar;
    }

    /* renamed from: a */
    public final synchronized void m14183a() {
        Context context = this.f17550a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f17550a = null;
    }

    /* renamed from: b */
    public final void m14184b(Context context) {
        this.f17550a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f17551b.mo14072a();
            m14183a();
        }
    }
}
