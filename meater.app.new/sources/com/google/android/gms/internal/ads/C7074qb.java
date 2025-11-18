package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb */
/* loaded from: classes2.dex */
final class C7074qb implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC7000ob f20385a;

    C7074qb(ViewTreeObserverOnGlobalLayoutListenerC7000ob viewTreeObserverOnGlobalLayoutListenerC7000ob) {
        this.f20385a = viewTreeObserverOnGlobalLayoutListenerC7000ob;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final /* synthetic */ void mo14739a(zzbgz zzbgzVar, Map map) throws NumberFormatException {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i2 = Integer.parseInt(str);
                synchronized (this.f20385a) {
                    if (this.f20385a.f20153G != i2) {
                        this.f20385a.f20153G = i2;
                        this.f20385a.requestLayout();
                    }
                }
            } catch (Exception e2) {
                zzbad.m17348d("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
