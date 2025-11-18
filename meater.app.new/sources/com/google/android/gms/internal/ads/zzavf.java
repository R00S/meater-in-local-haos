package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzavf implements zzue {

    /* renamed from: f */
    private final Context f22553f;

    /* renamed from: g */
    private final Object f22554g;

    /* renamed from: h */
    private String f22555h;

    /* renamed from: i */
    private boolean f22556i;

    public zzavf(Context context, String str) {
        this.f22553f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f22555h = str;
        this.f22556i = false;
        this.f22554g = new Object();
    }

    /* renamed from: j */
    public final String m16985j() {
        return this.f22555h;
    }

    /* renamed from: k */
    public final void m16986k(boolean z) {
        if (zzk.zzme().m17002D(this.f22553f)) {
            synchronized (this.f22554g) {
                if (this.f22556i == z) {
                    return;
                }
                this.f22556i = z;
                if (TextUtils.isEmpty(this.f22555h)) {
                    return;
                }
                if (this.f22556i) {
                    zzk.zzme().m17012r(this.f22553f, this.f22555h);
                } else {
                    zzk.zzme().m17013s(this.f22553f, this.f22555h);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    /* renamed from: r0 */
    public final void mo14929r0(zzud zzudVar) {
        m16986k(zzudVar.f27144m);
    }
}
