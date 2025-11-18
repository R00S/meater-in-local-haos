package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import g7.C3445p;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC2858v4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35687B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35688C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ E5 f35689D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ boolean f35690E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35691F;

    /* renamed from: G, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35692G;

    RunnableC2858v4(C2837s4 c2837s4, String str, String str2, E5 e52, boolean z10, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35687B = str;
        this.f35688C = str2;
        this.f35689D = e52;
        this.f35690E = z10;
        this.f35691F = u02;
        this.f35692G = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            InterfaceC4906h interfaceC4906h = this.f35692G.f35632d;
            if (interfaceC4906h == null) {
                this.f35692G.k().H().c("Failed to get user properties; not connected to service", this.f35687B, this.f35688C);
                return;
            }
            C3445p.k(this.f35689D);
            Bundle bundleH = Q5.H(interfaceC4906h.Y0(this.f35687B, this.f35688C, this.f35690E, this.f35689D));
            this.f35692G.r0();
            this.f35692G.j().S(this.f35691F, bundleH);
        } catch (RemoteException e10) {
            this.f35692G.k().H().c("Failed to get user properties; remote exception", this.f35687B, e10);
        } finally {
            this.f35692G.j().S(this.f35691F, bundle);
        }
    }
}
