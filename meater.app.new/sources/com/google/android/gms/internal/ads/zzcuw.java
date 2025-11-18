package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcuw implements zzcva<zzcuv> {

    /* renamed from: a */
    private final zzbbl f25120a;

    /* renamed from: b */
    private final Context f25121b;

    /* renamed from: c */
    private final zzbai f25122c;

    public zzcuw(zzbbl zzbblVar, Context context, zzbai zzbaiVar) {
        this.f25120a = zzbblVar;
        this.f25121b = context;
        this.f25122c = zzbaiVar;
    }

    /* renamed from: a */
    final /* synthetic */ zzcuv m18995a() throws Exception {
        boolean zM14672f = Wrappers.m14674a(this.f25121b).m14672f();
        zzk.zzlg();
        boolean zM17125E = zzaxi.m17125E(this.f25121b);
        String str = this.f25122c.f22750f;
        zzk.zzli();
        boolean zM17189u = zzaxo.m17189u();
        zzk.zzlg();
        return new zzcuv(zM14672f, zM17125E, str, zM17189u, zzaxi.m17122B(this.f25121b), DynamiteModule.m14713c(this.f25121b, ModuleDescriptor.MODULE_ID));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcuv> mo14982b() {
        return this.f25120a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.yo

            /* renamed from: f */
            private final zzcuw f21315f;

            {
                this.f21315f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f21315f.m18995a();
            }
        });
    }
}
