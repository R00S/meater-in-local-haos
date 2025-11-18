package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzchc implements zzdti<zzbbh<String>> {

    /* renamed from: a */
    private final zzdtu<zzczt> f24311a;

    /* renamed from: b */
    private final zzdtu<Context> f24312b;

    private zzchc(zzdtu<zzczt> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        this.f24311a = zzdtuVar;
        this.f24312b = zzdtuVar2;
    }

    /* renamed from: a */
    public static zzchc m18784a(zzdtu<zzczt> zzdtuVar, zzdtu<Context> zzdtuVar2) {
        return new zzchc(zzdtuVar, zzdtuVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzdtu
    public final /* synthetic */ Object get() {
        zzczt zzcztVar = this.f24311a.get();
        final Context context = this.f24312b.get();
        return (zzbbh) zzdto.m19874b(zzcztVar.m19100g(zzczs.WEBVIEW_COOKIE).m19106d(new Callable(context) { // from class: com.google.android.gms.internal.ads.wi

            /* renamed from: f */
            private final Context f20853f;

            {
                this.f20853f = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManagerMo17202n = zzk.zzli().mo17202n(this.f20853f);
                return cookieManagerMo17202n != null ? cookieManagerMo17202n.getCookie("googleads.g.doubleclick.net") : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }).m19108a(1L, TimeUnit.SECONDS).m19111e(Exception.class, C7340xi.f20974a).m19112f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
