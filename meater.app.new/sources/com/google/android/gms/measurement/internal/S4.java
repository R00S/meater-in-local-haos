package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c7.C2333b;
import g7.AbstractC3433d;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class S4 implements ServiceConnection, AbstractC3433d.a, AbstractC3433d.b {

    /* renamed from: B, reason: collision with root package name */
    private volatile boolean f35169B;

    /* renamed from: C, reason: collision with root package name */
    private volatile C2752g2 f35170C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ C2837s4 f35171D;

    protected S4(C2837s4 c2837s4) {
        this.f35171D = c2837s4;
    }

    public final void a() {
        this.f35171D.n();
        Context contextA = this.f35171D.a();
        synchronized (this) {
            try {
                if (this.f35169B) {
                    this.f35171D.k().L().a("Connection attempt already in progress");
                    return;
                }
                if (this.f35170C != null && (this.f35170C.d() || this.f35170C.h())) {
                    this.f35171D.k().L().a("Already awaiting connection attempt");
                    return;
                }
                this.f35170C = new C2752g2(contextA, Looper.getMainLooper(), this, this);
                this.f35171D.k().L().a("Connecting to remote service");
                this.f35169B = true;
                C3445p.k(this.f35170C);
                this.f35170C.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        this.f35171D.n();
        Context contextA = this.f35171D.a();
        j7.b bVarB = j7.b.b();
        synchronized (this) {
            try {
                if (this.f35169B) {
                    this.f35171D.k().L().a("Connection attempt already in progress");
                    return;
                }
                this.f35171D.k().L().a("Using local app measurement service");
                this.f35169B = true;
                bVarB.a(contextA, intent, this.f35171D.f35631c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g7.AbstractC3433d.b
    public final void c(C2333b c2333b) {
        C3445p.d("MeasurementServiceConnection.onConnectionFailed");
        C2759h2 c2759h2G = this.f35171D.f35457a.G();
        if (c2759h2G != null) {
            c2759h2G.M().b("Service connection failed", c2333b);
        }
        synchronized (this) {
            this.f35169B = false;
            this.f35170C = null;
        }
        this.f35171D.o().E(new V4(this));
    }

    public final void e() {
        if (this.f35170C != null && (this.f35170C.h() || this.f35170C.d())) {
            this.f35170C.g();
        }
        this.f35170C = null;
    }

    @Override // g7.AbstractC3433d.a
    public final void g(int i10) {
        C3445p.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f35171D.k().G().a("Service connection suspended");
        this.f35171D.o().E(new W4(this));
    }

    @Override // g7.AbstractC3433d.a
    public final void k(Bundle bundle) {
        C3445p.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C3445p.k(this.f35170C);
                this.f35171D.o().E(new T4(this, this.f35170C.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f35170C = null;
                this.f35169B = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3445p.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f35169B = false;
                this.f35171D.k().H().a("Service connected with null binder");
                return;
            }
            InterfaceC4906h c2710a2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c2710a2 = iInterfaceQueryLocalInterface instanceof InterfaceC4906h ? (InterfaceC4906h) iInterfaceQueryLocalInterface : new C2710a2(iBinder);
                    this.f35171D.k().L().a("Bound to IMeasurementService interface");
                } else {
                    this.f35171D.k().H().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f35171D.k().H().a("Service connect failed to get IMeasurementService");
            }
            if (c2710a2 == null) {
                this.f35169B = false;
                try {
                    j7.b.b().c(this.f35171D.a(), this.f35171D.f35631c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f35171D.o().E(new R4(this, c2710a2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3445p.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f35171D.k().G().a("Service disconnected");
        this.f35171D.o().E(new U4(this, componentName));
    }
}
