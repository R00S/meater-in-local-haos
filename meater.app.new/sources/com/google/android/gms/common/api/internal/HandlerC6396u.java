package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* renamed from: com.google.android.gms.common.api.internal.u */
/* loaded from: classes2.dex */
final class HandlerC6396u extends zap {

    /* renamed from: a */
    private final /* synthetic */ zaaw f17464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC6396u(zaaw zaawVar, Looper looper) {
        super(looper);
        this.f17464a = zaawVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            this.f17464a.m14160D();
            return;
        }
        if (i2 == 2) {
            this.f17464a.m14165x();
            return;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Unknown message id: ");
        sb.append(i2);
        Log.w("GoogleApiClientImpl", sb.toString());
    }
}
