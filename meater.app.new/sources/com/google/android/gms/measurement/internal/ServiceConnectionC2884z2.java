package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2446c0;
import com.google.android.gms.internal.measurement.InterfaceC2455d0;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ServiceConnectionC2884z2 implements ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    private final String f35780B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ A2 f35781C;

    ServiceConnectionC2884z2(A2 a22, String str) {
        this.f35781C = a22;
        this.f35780B = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f35781C.f34737a.k().M().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC2455d0 interfaceC2455d0G = AbstractBinderC2446c0.g(iBinder);
            if (interfaceC2455d0G == null) {
                this.f35781C.f34737a.k().M().a("Install Referrer Service implementation was not found");
            } else {
                this.f35781C.f34737a.k().L().a("Install Referrer Service connected");
                this.f35781C.f34737a.o().E(new B2(this, interfaceC2455d0G, this));
            }
        } catch (RuntimeException e10) {
            this.f35781C.f34737a.k().M().b("Exception occurred while calling Install Referrer API", e10);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f35781C.f34737a.k().L().a("Install Referrer Service disconnected");
    }
}
