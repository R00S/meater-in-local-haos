package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zap;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes2.dex */
final class HandlerC6402x extends zap {

    /* renamed from: a */
    private final /* synthetic */ zabe f17469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC6402x(zabe zabeVar, Looper looper) {
        super(looper);
        this.f17469a = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ((AbstractC6400w) message.obj).m14105b(this.f17469a);
        } else {
            if (i2 == 2) {
                throw ((RuntimeException) message.obj);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown message id: ");
            sb.append(i2);
            Log.w("GACStateManager", sb.toString());
        }
    }
}
