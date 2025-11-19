package c7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import g7.C3445p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class ServiceConnectionC2332a implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    boolean f31065B = false;

    /* renamed from: C, reason: collision with root package name */
    private final BlockingQueue f31066C = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) throws TimeoutException {
        C3445p.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f31065B) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f31065B = true;
        IBinder iBinder = (IBinder) this.f31066C.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f31066C.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
