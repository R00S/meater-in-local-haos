package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcsp implements zzcva<C6606do> {

    /* renamed from: a */
    private final Context f25033a;

    /* renamed from: b */
    private final zzbbl f25034b;

    zzcsp(Context context, zzbbl zzbblVar) {
        this.f25033a = context;
        this.f25034b = zzbblVar;
    }

    /* renamed from: a */
    final /* synthetic */ C6606do m18967a() throws Exception {
        zzk.zzlg();
        String strM17126F = zzaxi.m17126F(this.f25033a);
        zzk.zzlg();
        return new C6606do(strM17126F, zzaxi.m17127G(this.f25033a));
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<C6606do> mo14982b() {
        return this.f25034b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.bo

            /* renamed from: f */
            private final zzcsp f18349f;

            {
                this.f18349f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18349f.m18967a();
            }
        });
    }
}
