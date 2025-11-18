package com.flurry.sdk;

import com.flurry.sdk.AbstractC6052g4;
import java.util.Timer;
import java.util.concurrent.Executor;

/* renamed from: com.flurry.sdk.d2 */
/* loaded from: classes2.dex */
public final class C6022d2 extends C6096l3 {

    /* renamed from: m */
    private static Timer f15788m = new Timer("ExecutorQueue Global Timer", true);

    /* renamed from: n */
    Executor f15789n;

    public C6022d2(Executor executor, String str) {
        super(str);
        this.f15789n = executor;
    }

    @Override // com.flurry.sdk.C6016c5
    /* renamed from: q */
    protected final synchronized boolean mo13010q(AbstractC6052g4.b bVar) {
        try {
            if (bVar.m13081a()) {
                bVar.run();
            } else {
                this.f15789n.execute(bVar);
            }
        } catch (Exception unused) {
            return false;
        }
        return true;
    }
}
