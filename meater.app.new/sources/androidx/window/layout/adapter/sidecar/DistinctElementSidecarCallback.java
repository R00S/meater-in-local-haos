package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    private SidecarDeviceState f29850b;

    /* renamed from: d, reason: collision with root package name */
    private final I3.a f29852d;

    /* renamed from: e, reason: collision with root package name */
    private final SidecarInterface.SidecarCallback f29853e;

    /* renamed from: a, reason: collision with root package name */
    private final Object f29849a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Map<IBinder, SidecarWindowLayoutInfo> f29851c = new WeakHashMap();

    DistinctElementSidecarCallback(I3.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f29852d = aVar;
        this.f29853e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f29849a) {
            try {
                if (this.f29852d.a(this.f29850b, sidecarDeviceState)) {
                    return;
                }
                this.f29850b = sidecarDeviceState;
                this.f29853e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f29849a) {
            try {
                if (this.f29852d.d(this.f29851c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f29851c.put(iBinder, sidecarWindowLayoutInfo);
                this.f29853e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
