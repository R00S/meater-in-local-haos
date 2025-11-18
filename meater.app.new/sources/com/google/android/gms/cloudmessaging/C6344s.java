package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* renamed from: com.google.android.gms.cloudmessaging.s */
/* loaded from: classes2.dex */
final /* synthetic */ class C6344s implements SuccessContinuation {

    /* renamed from: a */
    static final SuccessContinuation f17178a = new C6344s();

    private C6344s() {
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    /* renamed from: a */
    public final Task mo13778a(Object obj) {
        return Rpc.m13753c((Bundle) obj);
    }
}
