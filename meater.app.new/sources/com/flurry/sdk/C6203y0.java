package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.y0 */
/* loaded from: classes2.dex */
public final class C6203y0 extends C6012c1<C6085k1> {

    /* renamed from: e */
    private static C6203y0 f16525e;

    protected C6203y0() {
        super("HttpRequestManager", TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C5994a1()));
    }

    /* renamed from: f */
    public static synchronized C6203y0 m13378f() {
        if (f16525e == null) {
            f16525e = new C6203y0();
        }
        return f16525e;
    }
}
