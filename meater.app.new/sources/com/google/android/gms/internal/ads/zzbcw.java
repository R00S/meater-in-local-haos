package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzbcw {

    /* renamed from: a */
    private final Context f22805a;

    /* renamed from: b */
    private final zzbdf f22806b;

    /* renamed from: c */
    private final ViewGroup f22807c;

    /* renamed from: d */
    private zzbcq f22808d;

    public zzbcw(Context context, ViewGroup viewGroup, zzbgz zzbgzVar) {
        this(context, viewGroup, zzbgzVar, null);
    }

    /* renamed from: a */
    public final void m17459a() {
        Preconditions.m14367f("onDestroy must be called from the UI thread.");
        zzbcq zzbcqVar = this.f22808d;
        if (zzbcqVar != null) {
            zzbcqVar.m17447j();
            this.f22807c.removeView(this.f22808d);
            this.f22808d = null;
        }
    }

    /* renamed from: b */
    public final void m17460b() {
        Preconditions.m14367f("onPause must be called from the UI thread.");
        zzbcq zzbcqVar = this.f22808d;
        if (zzbcqVar != null) {
            zzbcqVar.m17448k();
        }
    }

    /* renamed from: c */
    public final void m17461c(int i2, int i3, int i4, int i5, int i6, boolean z, zzbde zzbdeVar) {
        if (this.f22808d != null) {
            return;
        }
        zzadb.m16440a(this.f22806b.mo14923n().m16447c(), this.f22806b.mo14888P(), "vpr2");
        Context context = this.f22805a;
        zzbdf zzbdfVar = this.f22806b;
        zzbcq zzbcqVar = new zzbcq(context, zzbdfVar, i6, z, zzbdfVar.mo14923n().m16447c(), zzbdeVar);
        this.f22808d = zzbcqVar;
        this.f22807c.addView(zzbcqVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f22808d.m17456w(i2, i3, i4, i5);
        this.f22806b.mo14935v0(false);
    }

    /* renamed from: d */
    public final void m17462d(int i2, int i3, int i4, int i5) {
        Preconditions.m14367f("The underlay may only be modified from the UI thread.");
        zzbcq zzbcqVar = this.f22808d;
        if (zzbcqVar != null) {
            zzbcqVar.m17456w(i2, i3, i4, i5);
        }
    }

    /* renamed from: e */
    public final zzbcq m17463e() {
        Preconditions.m14367f("getAdVideoUnderlay must be called from the UI thread.");
        return this.f22808d;
    }

    @VisibleForTesting
    private zzbcw(Context context, ViewGroup viewGroup, zzbdf zzbdfVar, zzbcq zzbcqVar) {
        this.f22805a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22807c = viewGroup;
        this.f22806b = zzbdfVar;
        this.f22808d = null;
    }
}
