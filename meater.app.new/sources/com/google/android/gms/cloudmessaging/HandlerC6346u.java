package com.google.android.gms.cloudmessaging;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.u */
/* loaded from: classes2.dex */
final class HandlerC6346u extends com.google.android.gms.internal.cloudmessaging.zze {

    /* renamed from: a */
    private final /* synthetic */ Rpc f17182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC6346u(Rpc rpc, Looper looper) {
        super(looper);
        this.f17182a = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f17182a.m13756g(message);
    }
}
