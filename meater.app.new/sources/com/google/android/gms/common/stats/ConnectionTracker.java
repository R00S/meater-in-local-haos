package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzs;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class ConnectionTracker {

    /* renamed from: a */
    private static final Object f17957a = new Object();

    /* renamed from: b */
    private static volatile ConnectionTracker f17958b;

    /* renamed from: c */
    @VisibleForTesting
    public ConcurrentHashMap f17959c = new ConcurrentHashMap();

    private ConnectionTracker() {
    }

    @KeepForSdk
    /* renamed from: b */
    public static ConnectionTracker m14575b() {
        if (f17958b == null) {
            synchronized (f17957a) {
                if (f17958b == null) {
                    f17958b = new ConnectionTracker();
                }
            }
        }
        ConnectionTracker connectionTracker = f17958b;
        Preconditions.m14372k(connectionTracker);
        return connectionTracker;
    }

    /* renamed from: e */
    private static void m14576e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: f */
    private final boolean m14577f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((Wrappers.m14674a(context).m14669c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m14578g(serviceConnection)) {
            return m14579h(context, intent, serviceConnection, i2, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f17959c.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zM14579h = m14579h(context, intent, serviceConnection, i2, executor);
            if (zM14579h) {
                return zM14579h;
            }
            return false;
        } finally {
            this.f17959c.remove(serviceConnection, serviceConnection);
        }
    }

    /* renamed from: g */
    private static boolean m14578g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof zzs);
    }

    /* renamed from: h */
    private static final boolean m14579h(Context context, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        return (!PlatformVersion.m14649m() || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
    }

    @KeepForSdk
    /* renamed from: a */
    public boolean m14580a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return m14577f(context, context.getClass().getName(), intent, serviceConnection, i2, true, null);
    }

    @KeepForSdk
    /* renamed from: c */
    public void m14581c(Context context, ServiceConnection serviceConnection) {
        if (!m14578g(serviceConnection) || !this.f17959c.containsKey(serviceConnection)) {
            m14576e(context, serviceConnection);
            return;
        }
        try {
            m14576e(context, (ServiceConnection) this.f17959c.get(serviceConnection));
        } finally {
            this.f17959c.remove(serviceConnection);
        }
    }

    /* renamed from: d */
    public final boolean m14582d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        return m14577f(context, str, intent, serviceConnection, i2, true, executor);
    }
}
