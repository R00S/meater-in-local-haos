package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.xy */
/* loaded from: classes2.dex */
final class HandlerC7356xy extends Handler {

    /* renamed from: a */
    private final /* synthetic */ C7319wy f20987a;

    HandlerC7356xy(C7319wy c7319wy) {
        this.f20987a = c7319wy;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f20987a.m15998m(message);
    }
}
