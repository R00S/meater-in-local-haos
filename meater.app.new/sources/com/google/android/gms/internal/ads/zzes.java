package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.zzbp;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class zzes extends zzfk {
    public zzes(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 24);
    }

    /* renamed from: c */
    private final void m19935c() throws ExecutionException, InterruptedException, TimeoutException {
        AdvertisingIdClient advertisingIdClientM19900D = this.f26089g.m19900D();
        if (advertisingIdClientM19900D == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientM19900D.getInfo();
            String strM19921e = zzef.m19921e(info.getId());
            if (strM19921e != null) {
                synchronized (this.f26092j) {
                    this.f26092j.m18055C(strM19921e);
                    this.f26092j.m18076X(info.isLimitAdTrackingEnabled());
                    this.f26092j.m18073T(zzbp.zza.zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws ExecutionException, IllegalAccessException, InterruptedException, TimeoutException, InvocationTargetException {
        if (this.f26089g.m19912v()) {
            m19935c();
            return;
        }
        synchronized (this.f26092j) {
            this.f26092j.m18055C((String) this.f26093k.invoke(null, this.f26089g.m19901a()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: b */
    public final Void call() throws Exception {
        if (this.f26089g.m19902b()) {
            return super.call();
        }
        if (!this.f26089g.m19912v()) {
            return null;
        }
        m19935c();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfk, java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
