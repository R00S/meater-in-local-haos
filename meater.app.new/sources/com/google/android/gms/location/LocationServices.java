package com.google.android.gms.location;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbk;

/* loaded from: classes2.dex */
public class LocationServices {

    /* renamed from: a */
    private static final Api.ClientKey<zzaz> f28481a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f28482b;

    /* renamed from: c */
    public static final Api<Api.ApiOptions.NoOptions> f28483c;

    /* renamed from: d */
    @Deprecated
    public static final FusedLocationProviderApi f28484d;

    /* renamed from: e */
    @Deprecated
    public static final GeofencingApi f28485e;

    /* renamed from: f */
    @Deprecated
    public static final SettingsApi f28486f;

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
    }

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        f28481a = clientKey;
        C7643b c7643b = new C7643b();
        f28482b = c7643b;
        f28483c = new Api<>("LocationServices.API", c7643b, clientKey);
        f28484d = new com.google.android.gms.internal.location.zzq();
        f28485e = new com.google.android.gms.internal.location.zzaf();
        f28486f = new zzbk();
    }

    private LocationServices() {
    }
}
