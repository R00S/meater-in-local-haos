package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: f */
    boolean f17196f = false;

    /* renamed from: g */
    private final BlockingQueue f17197g = new LinkedBlockingQueue();

    @KeepForSdk
    /* renamed from: a */
    public IBinder m13791a(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.m14371j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f17196f) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f17196f = true;
        IBinder iBinder = (IBinder) this.f17197g.poll(j2, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f17197g.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
