package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import g7.C3445p;
import java.util.ArrayList;
import v7.InterfaceC4906h;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class Q4 implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    private final /* synthetic */ String f35139B;

    /* renamed from: C, reason: collision with root package name */
    private final /* synthetic */ String f35140C;

    /* renamed from: D, reason: collision with root package name */
    private final /* synthetic */ E5 f35141D;

    /* renamed from: E, reason: collision with root package name */
    private final /* synthetic */ com.google.android.gms.internal.measurement.U0 f35142E;

    /* renamed from: F, reason: collision with root package name */
    private final /* synthetic */ C2837s4 f35143F;

    Q4(C2837s4 c2837s4, String str, String str2, E5 e52, com.google.android.gms.internal.measurement.U0 u02) {
        this.f35139B = str;
        this.f35140C = str2;
        this.f35141D = e52;
        this.f35142E = u02;
        this.f35143F = c2837s4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            InterfaceC4906h interfaceC4906h = this.f35143F.f35632d;
            if (interfaceC4906h == null) {
                this.f35143F.k().H().c("Failed to get conditional properties; not connected to service", this.f35139B, this.f35140C);
                return;
            }
            C3445p.k(this.f35141D);
            ArrayList<Bundle> arrayListU0 = Q5.u0(interfaceC4906h.y(this.f35139B, this.f35140C, this.f35141D));
            this.f35143F.r0();
            this.f35143F.j().U(this.f35142E, arrayListU0);
        } catch (RemoteException e10) {
            this.f35143F.k().H().d("Failed to get conditional properties; remote exception", this.f35139B, this.f35140C, e10);
        } finally {
            this.f35143F.j().U(this.f35142E, arrayList);
        }
    }
}
