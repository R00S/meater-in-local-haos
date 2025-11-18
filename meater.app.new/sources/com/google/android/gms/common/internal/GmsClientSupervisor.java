package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {

    /* renamed from: a */
    private static int f17759a = 4225;

    /* renamed from: b */
    private static final Object f17760b = new Object();

    /* renamed from: c */
    private static C6432o f17761c = null;

    /* renamed from: d */
    @VisibleForTesting
    static HandlerThread f17762d = null;

    /* renamed from: e */
    private static boolean f17763e = false;

    @KeepForSdk
    /* renamed from: a */
    public static int m14339a() {
        return f17759a;
    }

    @KeepForSdk
    /* renamed from: b */
    public static GmsClientSupervisor m14340b(Context context) {
        synchronized (f17760b) {
            if (f17761c == null) {
                f17761c = new C6432o(context.getApplicationContext(), f17763e ? m14341c().getLooper() : context.getMainLooper());
            }
        }
        return f17761c;
    }

    @KeepForSdk
    /* renamed from: c */
    public static HandlerThread m14341c() {
        synchronized (f17760b) {
            HandlerThread handlerThread = f17762d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f17762d = handlerThread2;
            handlerThread2.start();
            return f17762d;
        }
    }

    /* renamed from: d */
    protected abstract void mo14342d(zzn zznVar, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m14343e(String str, String str2, int i2, ServiceConnection serviceConnection, String str3, boolean z) {
        mo14342d(new zzn(str, str2, i2, z), serviceConnection, str3);
    }

    /* renamed from: f */
    protected abstract boolean mo14344f(zzn zznVar, ServiceConnection serviceConnection, String str, Executor executor);
}
