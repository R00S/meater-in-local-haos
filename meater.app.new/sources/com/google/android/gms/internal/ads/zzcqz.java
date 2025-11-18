package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzcqz implements zzbal<zzarx, zzcrc> {

    /* renamed from: a */
    private Executor f24951a;

    /* renamed from: b */
    private zzchz f24952b;

    public zzcqz(Executor executor, zzchz zzchzVar) {
        this.f24951a = executor;
        this.f24952b = zzchzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final /* synthetic */ zzbbh<zzcrc> zzf(zzarx zzarxVar) throws Exception {
        final zzarx zzarxVar2 = zzarxVar;
        return zzbar.m17366c(this.f24952b.m18802b(zzarxVar2), new zzbal(zzarxVar2) { // from class: com.google.android.gms.internal.ads.nn

            /* renamed from: a */
            private final zzarx f20099a;

            {
                this.f20099a = zzarxVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzbal
            public final zzbbh zzf(Object obj) {
                return zzbar.m17378o(new zzcrc(new JsonReader(new InputStreamReader((InputStream) obj))).m18954a(this.f20099a.f22411f));
            }
        }, this.f24951a);
    }
}
