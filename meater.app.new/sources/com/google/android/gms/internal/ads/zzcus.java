package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzcus implements zzcva<zzcur> {

    /* renamed from: a */
    private final zzavg f25108a;

    /* renamed from: b */
    private final zzbbl f25109b;

    /* renamed from: c */
    private final Context f25110c;

    public zzcus(zzavg zzavgVar, zzbbl zzbblVar, Context context) {
        this.f25108a = zzavgVar;
        this.f25109b = zzbblVar;
        this.f25110c = context;
    }

    /* renamed from: a */
    final /* synthetic */ zzcur m18993a() throws Exception {
        if (!this.f25108a.m17002D(this.f25110c)) {
            return new zzcur(null, null, null, null, null);
        }
        String strM17007l = this.f25108a.m17007l(this.f25110c);
        String str = strM17007l == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM17007l;
        String strM17008m = this.f25108a.m17008m(this.f25110c);
        String str2 = strM17008m == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM17008m;
        String strM17009n = this.f25108a.m17009n(this.f25110c);
        String str3 = strM17009n == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM17009n;
        String strM17010o = this.f25108a.m17010o(this.f25110c);
        return new zzcur(str, str2, str3, strM17010o == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM17010o, "TIME_OUT".equals(str2) ? (Long) zzyt.m20848e().m16421c(zzacu.f21617E0) : null);
    }

    @Override // com.google.android.gms.internal.ads.zzcva
    /* renamed from: b */
    public final zzbbh<zzcur> mo14982b() {
        return this.f25109b.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.xo

            /* renamed from: f */
            private final zzcus f20980f;

            {
                this.f20980f = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20980f.m18993a();
            }
        });
    }
}
