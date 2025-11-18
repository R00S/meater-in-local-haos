package com.google.android.gms.safetynet;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.internal.safetynet.zzy;

/* loaded from: classes2.dex */
public final class SafetyNet {

    /* renamed from: a */
    private static final Api.ClientKey<zzx> f29450a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> f29451b;

    /* renamed from: c */
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> f29452c;

    /* renamed from: d */
    @Deprecated
    public static final SafetyNetApi f29453d;

    /* renamed from: e */
    private static final zzo f29454e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.safetynet.zzy, com.google.android.gms.safetynet.zzo] */
    static {
        Api.ClientKey<zzx> clientKey = new Api.ClientKey<>();
        f29450a = clientKey;
        C7888a c7888a = new C7888a();
        f29451b = c7888a;
        f29452c = new Api<>("SafetyNet.API", c7888a, clientKey);
        f29453d = new zzk();
        f29454e = new zzy();
    }

    private SafetyNet() {
    }

    /* renamed from: a */
    public static SafetyNetClient m23601a(Context context) {
        return new SafetyNetClient(context);
    }
}
