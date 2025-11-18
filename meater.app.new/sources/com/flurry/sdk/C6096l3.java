package com.flurry.sdk;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.flurry.sdk.l3 */
/* loaded from: classes2.dex */
public class C6096l3 extends C6016c5 {
    C6096l3(String str) {
        super(str, null, true);
    }

    @Override // com.flurry.sdk.C6016c5, com.flurry.sdk.AbstractC6052g4
    /* renamed from: m */
    public Future<Void> mo13007m(Runnable runnable) {
        return super.mo13007m(runnable);
    }

    @Override // com.flurry.sdk.C6016c5, com.flurry.sdk.AbstractC6052g4
    /* renamed from: n */
    public void mo13008n(Runnable runnable) throws ExecutionException, InterruptedException, CancellationException {
        super.mo13008n(runnable);
    }
}
