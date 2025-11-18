package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbtp extends zzbts<AppEventListener> implements zzagx {
    public zzbtp(Set<zzbuz<AppEventListener>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final synchronized void onAppEvent(final String str, final String str2) {
        m18330T(new zzbtu(str, str2) { // from class: com.google.android.gms.internal.ads.se

            /* renamed from: a */
            private final String f20519a;

            /* renamed from: b */
            private final String f20520b;

            {
                this.f20519a = str;
                this.f20520b = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbtu
            /* renamed from: a */
            public final void mo14761a(Object obj) {
                ((AppEventListener) obj).onAppEvent(this.f20519a, this.f20520b);
            }
        });
    }
}
