package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzg;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzfl implements ServiceConnection {

    /* renamed from: f */
    private final String f29249f;

    /* renamed from: g */
    final /* synthetic */ zzfm f29250g;

    zzfl(zzfm zzfmVar, String str) {
        this.f29250g = zzfmVar;
        this.f29249f = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f29250g.f29251a.mo22836h().m23140K().m23147a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzd zzdVarM22315P = zzg.m22315P(iBinder);
            if (zzdVarM22315P == null) {
                this.f29250g.f29251a.mo22836h().m23140K().m23147a("Install Referrer Service implementation was not found");
            } else {
                this.f29250g.f29251a.mo22836h().m23143N().m23147a("Install Referrer Service connected");
                this.f29250g.f29251a.mo22835g().m23201z(new RunnableC7816s3(this, zzdVarM22315P, this));
            }
        } catch (Exception e2) {
            this.f29250g.f29251a.mo22836h().m23140K().m23148b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f29250g.f29251a.mo22836h().m23143N().m23147a("Install Referrer Service disconnected");
    }
}
