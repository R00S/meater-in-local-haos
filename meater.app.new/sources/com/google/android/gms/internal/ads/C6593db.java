package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.db */
/* loaded from: classes2.dex */
final class C6593db implements zzaho<zzbgz> {

    /* renamed from: a */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC6519bb f18512a;

    C6593db(ViewTreeObserverOnGlobalLayoutListenerC6519bb viewTreeObserverOnGlobalLayoutListenerC6519bb) {
        this.f18512a = viewTreeObserverOnGlobalLayoutListenerC6519bb;
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
                synchronized (this.f18512a) {
                    if (this.f18512a.f18275I != i2) {
                        this.f18512a.f18275I = i2;
                        this.f18512a.requestLayout();
                    }
                }
            } catch (Exception e2) {
                zzbad.m17348d("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
