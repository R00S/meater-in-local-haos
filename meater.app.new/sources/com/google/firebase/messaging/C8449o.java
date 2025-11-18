package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@KeepForSdk
/* renamed from: com.google.firebase.messaging.o */
/* loaded from: classes2.dex */
public class C8449o {

    /* renamed from: a */
    private static final Object f32023a = new Object();

    /* renamed from: b */
    private static ServiceConnectionC8424b1 f32024b;

    /* renamed from: c */
    private final Context f32025c;

    /* renamed from: d */
    private final Executor f32026d = ExecutorC8435h.f31997f;

    public C8449o(Context context) {
        this.f32025c = context;
    }

    /* renamed from: a */
    private static Task<Integer> m26595a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m26596b(context, "com.google.firebase.MESSAGING_EVENT").m26495c(intent).mo23644g(ExecutorC8441k.f32005f, C8443l.f32008a);
    }

    /* renamed from: b */
    private static ServiceConnectionC8424b1 m26596b(Context context, String str) {
        ServiceConnectionC8424b1 serviceConnectionC8424b1;
        synchronized (f32023a) {
            if (f32024b == null) {
                f32024b = new ServiceConnectionC8424b1(context, "com.google.firebase.MESSAGING_EVENT");
            }
            serviceConnectionC8424b1 = f32024b;
        }
        return serviceConnectionC8424b1;
    }

    /* renamed from: c */
    static final /* synthetic */ Integer m26597c(Task task) throws Exception {
        return -1;
    }

    /* renamed from: e */
    static final /* synthetic */ Integer m26599e(Task task) throws Exception {
        return 403;
    }

    /* renamed from: f */
    static final /* synthetic */ Task m26600f(Context context, Intent intent, Task task) throws Exception {
        return (PlatformVersion.m14647k() && ((Integer) task.mo23647j()).intValue() == 402) ? m26595a(context, intent).mo23644g(ExecutorC8445m.f32014f, C8447n.f32016a) : task;
    }

    @KeepForSdk
    /* renamed from: g */
    public Task<Integer> m26601g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m26602h(this.f32025c, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: h */
    public Task<Integer> m26602h(final Context context, final Intent intent) {
        boolean z = false;
        if (PlatformVersion.m14647k() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        return (z && (intent.getFlags() & 268435456) == 0) ? m26595a(context, intent) : Tasks.m23661c(this.f32026d, new Callable(context, intent) { // from class: com.google.firebase.messaging.i

            /* renamed from: f */
            private final Context f31999f;

            /* renamed from: g */
            private final Intent f32000g;

            {
                this.f31999f = context;
                this.f32000g = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Integer.valueOf(C8444l0.m26580b().m26585g(this.f31999f, this.f32000g));
            }
        }).mo23645h(this.f32026d, new Continuation(context, intent) { // from class: com.google.firebase.messaging.j

            /* renamed from: a */
            private final Context f32001a;

            /* renamed from: b */
            private final Intent f32002b;

            {
                this.f32001a = context;
                this.f32002b = intent;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task) {
                return C8449o.m26600f(this.f32001a, this.f32002b, task);
            }
        });
    }
}
