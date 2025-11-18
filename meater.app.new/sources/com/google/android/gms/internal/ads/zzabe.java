package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzabe {

    /* renamed from: a */
    private static zzabe f21560a;

    /* renamed from: b */
    private static final Object f21561b = new Object();

    /* renamed from: c */
    private zzaab f21562c;

    /* renamed from: d */
    private RewardedVideoAd f21563d;

    /* renamed from: e */
    private zztw f21564e;

    private zzabe() {
    }

    /* renamed from: j */
    public static zzabe m16315j() {
        zzabe zzabeVar;
        synchronized (f21561b) {
            if (f21560a == null) {
                f21560a = new zzabe();
            }
            zzabeVar = f21560a;
        }
        return zzabeVar;
    }

    /* renamed from: a */
    public final RewardedVideoAd m16316a(Context context) {
        synchronized (f21561b) {
            RewardedVideoAd rewardedVideoAd = this.f21563d;
            if (rewardedVideoAd != null) {
                return rewardedVideoAd;
            }
            zzatj zzatjVar = new zzatj(context, new f60(zzyt.m20845b(), context, new zzamo()).m15264b(context, false));
            this.f21563d = zzatjVar;
            return zzatjVar;
        }
    }

    /* renamed from: b */
    public final String m16317b() {
        Preconditions.m14376o(this.f21562c != null, "MobileAds.initialize() must be called prior to getting version string.");
        try {
            return this.f21562c.mo16173H3();
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to get version string.", e2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: c */
    public final void m16318c(Context context, String str) {
        Preconditions.m14376o(this.f21562c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f21562c.mo16182t6(ObjectWrapper.m14708E0(context), str);
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to open debug menu.", e2);
        }
    }

    /* renamed from: d */
    public final void m16319d(Class<? extends RtbAdapter> cls) {
        try {
            this.f21562c.mo16175N2(cls.getCanonicalName());
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to register RtbAdapter", e2);
        }
    }

    /* renamed from: e */
    public final void m16320e(boolean z) {
        Preconditions.m14376o(this.f21562c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f21562c.mo16180c2(z);
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to set app mute state.", e2);
        }
    }

    /* renamed from: f */
    public final void m16321f(float f2) {
        Preconditions.m14363b(0.0f <= f2 && f2 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        Preconditions.m14376o(this.f21562c != null, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f21562c.mo16183v5(f2);
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to set app volume.", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.android.gms.internal.ads.c, com.google.android.gms.internal.ads.zztw] */
    /* renamed from: g */
    public final void m16322g(final Context context, String str, zzabi zzabiVar, zztx zztxVar) {
        synchronized (f21561b) {
            if (this.f21562c != null) {
                return;
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            try {
                zzami.m16670h7(context, str);
                boolean z = false;
                zzaab zzaabVarM15264b = new c60(zzyt.m20845b(), context).m15264b(context, false);
                this.f21562c = zzaabVarM15264b;
                zzaabVarM15264b.mo16176O0(new zzamo());
                this.f21562c.mo16179a();
                this.f21562c.mo16171B2(str, ObjectWrapper.m14708E0(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.b

                    /* renamed from: f */
                    private final zzabe f18207f;

                    /* renamed from: g */
                    private final Context f18208g;

                    {
                        this.f18207f = this;
                        this.f18208g = context;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18207f.m16316a(this.f18208g);
                    }
                }));
                zzacu.m16423a(context);
                if (!((Boolean) zzyt.m20848e().m16421c(zzacu.f21774d4)).booleanValue()) {
                    if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21813j4)).booleanValue()) {
                        z = true;
                    }
                }
                if (!z) {
                    zzbad.m17351g("Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.");
                    this.f21564e = new Object(this) { // from class: com.google.android.gms.internal.ads.c

                        /* renamed from: a */
                        private final zzabe f18373a;

                        {
                            this.f18373a = this;
                        }
                    };
                }
            } catch (RemoteException e2) {
                zzbad.m17348d("MobileAdsSettingManager initialization failed", e2);
            }
        }
    }

    /* renamed from: h */
    public final float m16323h() {
        zzaab zzaabVar = this.f21562c;
        if (zzaabVar == null) {
            return 1.0f;
        }
        try {
            return zzaabVar.mo16172C4();
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to get app volume.", e2);
            return 1.0f;
        }
    }

    /* renamed from: i */
    public final boolean m16324i() {
        zzaab zzaabVar = this.f21562c;
        if (zzaabVar == null) {
            return false;
        }
        try {
            return zzaabVar.mo16174J3();
        } catch (RemoteException e2) {
            zzbad.m17347c("Unable to get app mute state.", e2);
            return false;
        }
    }
}
