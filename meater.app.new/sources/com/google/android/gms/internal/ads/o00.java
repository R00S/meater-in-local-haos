package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class o00 extends Handler {

    /* renamed from: a */
    private final /* synthetic */ n00 f20119a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o00(n00 n00Var, Looper looper) {
        super(looper);
        this.f20119a = n00Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f20119a.m15590n(message);
    }
}
