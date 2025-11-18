package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zzf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zze {

    /* renamed from: a */
    private static zze f17186a;

    /* renamed from: b */
    private final Context f17187b;

    /* renamed from: c */
    private final ScheduledExecutorService f17188c;

    /* renamed from: d */
    private ServiceConnectionC6329c f17189d = new ServiceConnectionC6329c(this);

    /* renamed from: e */
    private int f17190e = 1;

    private zze(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17188c = scheduledExecutorService;
        this.f17187b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m13781a() {
        int i2;
        i2 = this.f17190e;
        this.f17190e = i2 + 1;
        return i2;
    }

    /* renamed from: c */
    public static synchronized zze m13783c(Context context) {
        if (f17186a == null) {
            f17186a = new zze(context, com.google.android.gms.internal.cloudmessaging.zza.m20901a().mo20899a(1, new NamedThreadFactory("MessengerIpcClient"), zzf.f27593b));
        }
        return f17186a;
    }

    /* renamed from: e */
    private final synchronized <T> Task<T> m13784e(AbstractC6339m<T> abstractC6339m) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(abstractC6339m);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(strValueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f17189d.m13769e(abstractC6339m)) {
            ServiceConnectionC6329c serviceConnectionC6329c = new ServiceConnectionC6329c(this);
            this.f17189d = serviceConnectionC6329c;
            serviceConnectionC6329c.m13769e(abstractC6339m);
        }
        return abstractC6339m.f17171b.m23654a();
    }

    /* renamed from: d */
    public final Task<Void> m13786d(int i2, Bundle bundle) {
        return m13784e(new C6337k(m13781a(), 2, bundle));
    }

    /* renamed from: f */
    public final Task<Bundle> m13787f(int i2, Bundle bundle) {
        return m13784e(new C6340n(m13781a(), 1, bundle));
    }
}
