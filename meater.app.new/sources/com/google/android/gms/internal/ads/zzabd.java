package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.common.util.VisibleForTesting;

@zzard
/* loaded from: classes2.dex */
public final class zzabd {

    /* renamed from: a */
    private final zzamo f21546a;

    /* renamed from: b */
    private final Context f21547b;

    /* renamed from: c */
    private final zzyc f21548c;

    /* renamed from: d */
    private AdListener f21549d;

    /* renamed from: e */
    private zzxr f21550e;

    /* renamed from: f */
    private zzzk f21551f;

    /* renamed from: g */
    private String f21552g;

    /* renamed from: h */
    private AdMetadataListener f21553h;

    /* renamed from: i */
    private AppEventListener f21554i;

    /* renamed from: j */
    private OnCustomRenderedAdLoadedListener f21555j;

    /* renamed from: k */
    private Correlator f21556k;

    /* renamed from: l */
    private RewardedVideoAdListener f21557l;

    /* renamed from: m */
    private boolean f21558m;

    /* renamed from: n */
    private boolean f21559n;

    public zzabd(Context context) {
        this(context, zzyc.f27446a, null);
    }

    /* renamed from: u */
    private final void m16294u(String str) {
        if (this.f21551f != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63);
        sb.append("The ad unit ID must be set on InterstitialAd before ");
        sb.append(str);
        sb.append(" is called.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final AdListener m16295a() {
        return this.f21549d;
    }

    /* renamed from: b */
    public final Bundle m16296b() {
        try {
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                return zzzkVar.getAdMetadata();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
        return new Bundle();
    }

    /* renamed from: c */
    public final String m16297c() {
        return this.f21552g;
    }

    /* renamed from: d */
    public final AppEventListener m16298d() {
        return this.f21554i;
    }

    /* renamed from: e */
    public final String m16299e() {
        try {
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                return zzzkVar.mo16354c0();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
            return null;
        }
    }

    /* renamed from: f */
    public final OnCustomRenderedAdLoadedListener m16300f() {
        return this.f21555j;
    }

    /* renamed from: g */
    public final boolean m16301g() {
        try {
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar == null) {
                return false;
            }
            return zzzkVar.mo16341B();
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    /* renamed from: h */
    public final boolean m16302h() {
        try {
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar == null) {
                return false;
            }
            return zzzkVar.mo16359p0();
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
            return false;
        }
    }

    /* renamed from: i */
    public final void m16303i(AdListener adListener) {
        try {
            this.f21549d = adListener;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16348L0(adListener != null ? new zzxv(adListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: j */
    public final void m16304j(AdMetadataListener adMetadataListener) {
        try {
            this.f21553h = adMetadataListener;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16365z0(adMetadataListener != null ? new zzxy(adMetadataListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: k */
    public final void m16305k(String str) {
        if (this.f21552g != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
        }
        this.f21552g = str;
    }

    /* renamed from: l */
    public final void m16306l(AppEventListener appEventListener) {
        try {
            this.f21554i = appEventListener;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16349P5(appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: m */
    public final void m16307m(Correlator correlator) {
        this.f21556k = correlator;
        try {
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16361v4(correlator == null ? null : correlator.zzdf());
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: n */
    public final void m16308n(boolean z) {
        try {
            this.f21559n = z;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.setImmersiveMode(z);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: o */
    public final void m16309o(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        try {
            this.f21555j = onCustomRenderedAdLoadedListener;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16345H6(onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: p */
    public final void m16310p(RewardedVideoAdListener rewardedVideoAdListener) {
        try {
            this.f21557l = rewardedVideoAdListener;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16356h0(rewardedVideoAdListener != null ? new zzatg(rewardedVideoAdListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: q */
    public final void m16311q() {
        try {
            m16294u("show");
            this.f21551f.showInterstitial();
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: r */
    public final void m16312r(zzaaz zzaazVar) {
        try {
            if (this.f21551f == null) {
                if (this.f21552g == null) {
                    m16294u("loadAd");
                }
                zzyd zzydVarM20823e0 = this.f21558m ? zzyd.m20823e0() : new zzyd();
                zzyh zzyhVarM20845b = zzyt.m20845b();
                Context context = this.f21547b;
                zzzk zzzkVarM15264b = new a60(zzyhVarM20845b, context, zzydVarM20823e0, this.f21552g, this.f21546a).m15264b(context, false);
                this.f21551f = zzzkVarM15264b;
                if (this.f21549d != null) {
                    zzzkVarM15264b.mo16348L0(new zzxv(this.f21549d));
                }
                if (this.f21550e != null) {
                    this.f21551f.mo16362w4(new zzxs(this.f21550e));
                }
                if (this.f21553h != null) {
                    this.f21551f.mo16365z0(new zzxy(this.f21553h));
                }
                if (this.f21554i != null) {
                    this.f21551f.mo16349P5(new zzyf(this.f21554i));
                }
                if (this.f21555j != null) {
                    this.f21551f.mo16345H6(new zzadr(this.f21555j));
                }
                Correlator correlator = this.f21556k;
                if (correlator != null) {
                    this.f21551f.mo16361v4(correlator.zzdf());
                }
                if (this.f21557l != null) {
                    this.f21551f.mo16356h0(new zzatg(this.f21557l));
                }
                this.f21551f.setImmersiveMode(this.f21559n);
            }
            if (this.f21551f.mo16347J4(zzyc.m20820a(this.f21547b, zzaazVar))) {
                this.f21546a.m16694k7(zzaazVar.m16220q());
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: s */
    public final void m16313s(zzxr zzxrVar) {
        try {
            this.f21550e = zzxrVar;
            zzzk zzzkVar = this.f21551f;
            if (zzzkVar != null) {
                zzzkVar.mo16362w4(zzxrVar != null ? new zzxs(zzxrVar) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#008 Must be called on the main UI thread.", e2);
        }
    }

    /* renamed from: t */
    public final void m16314t(boolean z) {
        this.f21558m = true;
    }

    public zzabd(Context context, PublisherInterstitialAd publisherInterstitialAd) {
        this(context, zzyc.f27446a, publisherInterstitialAd);
    }

    @VisibleForTesting
    private zzabd(Context context, zzyc zzycVar, PublisherInterstitialAd publisherInterstitialAd) {
        this.f21546a = new zzamo();
        this.f21547b = context;
        this.f21548c = zzycVar;
    }
}
