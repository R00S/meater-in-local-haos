package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import k7.ThreadFactoryC3803a;
import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    private static l f33443e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f33444a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f33445b;

    /* renamed from: c, reason: collision with root package name */
    private g f33446c = new g(this, null);

    /* renamed from: d, reason: collision with root package name */
    private int f33447d = 1;

    l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f33445b = scheduledExecutorService;
        this.f33444a = context.getApplicationContext();
    }

    public static synchronized l b(Context context) {
        try {
            if (f33443e == null) {
                q7.e.a();
                f33443e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC3803a("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f33443e;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f33447d;
        this.f33447d = i10 + 1;
        return i10;
    }

    private final synchronized AbstractC5208j g(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(jVar.toString()));
            }
            if (!this.f33446c.g(jVar)) {
                g gVar = new g(this, null);
                this.f33446c = gVar;
                gVar.g(jVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jVar.f33440b.a();
    }

    public final AbstractC5208j c(int i10, Bundle bundle) {
        return g(new i(f(), i10, bundle));
    }

    public final AbstractC5208j d(int i10, Bundle bundle) {
        return g(new k(f(), i10, bundle));
    }
}
