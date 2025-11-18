package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

@zzard
/* loaded from: classes2.dex */
public final class zzabb {

    /* renamed from: a */
    private final zzamo f21529a;

    /* renamed from: b */
    private final zzyc f21530b;

    /* renamed from: c */
    private final AtomicBoolean f21531c;

    /* renamed from: d */
    private final VideoController f21532d;

    /* renamed from: e */
    @VisibleForTesting
    private final zzyv f21533e;

    /* renamed from: f */
    private zzxr f21534f;

    /* renamed from: g */
    private AdListener f21535g;

    /* renamed from: h */
    private AdSize[] f21536h;

    /* renamed from: i */
    private AppEventListener f21537i;

    /* renamed from: j */
    private Correlator f21538j;

    /* renamed from: k */
    private zzzk f21539k;

    /* renamed from: l */
    private OnCustomRenderedAdLoadedListener f21540l;

    /* renamed from: m */
    private VideoOptions f21541m;

    /* renamed from: n */
    private String f21542n;

    /* renamed from: o */
    private ViewGroup f21543o;

    /* renamed from: p */
    private int f21544p;

    /* renamed from: q */
    private boolean f21545q;

    public zzabb(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzyc.f27446a, 0);
    }

    /* renamed from: C */
    private static boolean m16264C(int i2) {
        return i2 == 1;
    }

    /* renamed from: x */
    private static zzyd m16266x(Context context, AdSize[] adSizeArr, int i2) {
        zzyd zzydVar = new zzyd(context, adSizeArr);
        zzydVar.f27456o = m16264C(i2);
        return zzydVar;
    }

    /* renamed from: A */
    public final void m16267A(AdSize... adSizeArr) {
        this.f21536h = adSizeArr;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16342C2(m16266x(this.f21543o.getContext(), this.f21536h, this.f21544p));
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
        this.f21543o.requestLayout();
    }

    /* renamed from: B */
    public final boolean m16268B(zzzk zzzkVar) {
        if (zzzkVar == null) {
            return false;
        }
        try {
            IObjectWrapper iObjectWrapperMo16350S0 = zzzkVar.mo16350S0();
            if (iObjectWrapperMo16350S0 == null || ((View) ObjectWrapper.m14709k0(iObjectWrapperMo16350S0)).getParent() != null) {
                return false;
            }
            this.f21543o.addView((View) ObjectWrapper.m14709k0(iObjectWrapperMo16350S0));
            this.f21539k = zzzkVar;
            return true;
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return false;
        }
    }

    /* renamed from: D */
    public final zzaar m16269D() {
        zzzk zzzkVar = this.f21539k;
        if (zzzkVar == null) {
            return null;
        }
        try {
            return zzzkVar.getVideoController();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final void m16270a() {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.destroy();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: b */
    public final AdListener m16271b() {
        return this.f21535g;
    }

    /* renamed from: c */
    public final AdSize m16272c() {
        zzyd zzydVarMo16344C5;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null && (zzydVarMo16344C5 = zzzkVar.mo16344C5()) != null) {
                return com.google.android.gms.ads.zzb.zza(zzydVarMo16344C5.f27451j, zzydVarMo16344C5.f27448g, zzydVarMo16344C5.f27447f);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
        AdSize[] adSizeArr = this.f21536h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    /* renamed from: d */
    public final AdSize[] m16273d() {
        return this.f21536h;
    }

    /* renamed from: e */
    public final String m16274e() {
        zzzk zzzkVar;
        if (this.f21542n == null && (zzzkVar = this.f21539k) != null) {
            try {
                this.f21542n = zzzkVar.mo16355f6();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
        return this.f21542n;
    }

    /* renamed from: f */
    public final AppEventListener m16275f() {
        return this.f21537i;
    }

    /* renamed from: g */
    public final String m16276g() {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                return zzzkVar.mo16354c0();
            }
            return null;
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return null;
        }
    }

    /* renamed from: h */
    public final OnCustomRenderedAdLoadedListener m16277h() {
        return this.f21540l;
    }

    /* renamed from: i */
    public final VideoController m16278i() {
        return this.f21532d;
    }

    /* renamed from: j */
    public final VideoOptions m16279j() {
        return this.f21541m;
    }

    /* renamed from: k */
    public final boolean m16280k() {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                return zzzkVar.mo16359p0();
            }
            return false;
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            return false;
        }
    }

    /* renamed from: l */
    public final void m16281l() {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.pause();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: m */
    public final void m16282m() {
        if (this.f21531c.getAndSet(true)) {
            return;
        }
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16364x6();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: n */
    public final void m16283n() {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.resume();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: o */
    public final void m16284o(AdListener adListener) {
        this.f21535g = adListener;
        this.f21533e.m20853a(adListener);
    }

    /* renamed from: p */
    public final void m16285p(AdSize... adSizeArr) {
        if (this.f21536h != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        m16267A(adSizeArr);
    }

    /* renamed from: q */
    public final void m16286q(String str) {
        if (this.f21542n != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.f21542n = str;
    }

    /* renamed from: r */
    public final void m16287r(AppEventListener appEventListener) {
        try {
            this.f21537i = appEventListener;
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16349P5(appEventListener != null ? new zzyf(appEventListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: s */
    public final void m16288s(Correlator correlator) {
        this.f21538j = correlator;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16361v4(correlator == null ? null : correlator.zzdf());
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: t */
    public final void m16289t(boolean z) {
        this.f21545q = z;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16360t1(z);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: u */
    public final void m16290u(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f21540l = onCustomRenderedAdLoadedListener;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16345H6(onCustomRenderedAdLoadedListener != null ? new zzadr(onCustomRenderedAdLoadedListener) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: v */
    public final void m16291v(VideoOptions videoOptions) {
        this.f21541m = videoOptions;
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16352W6(videoOptions == null ? null : new zzacd(videoOptions));
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: y */
    public final void m16292y(zzaaz zzaazVar) {
        try {
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar == null) {
                if ((this.f21536h == null || this.f21542n == null) && zzzkVar == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f21543o.getContext();
                zzyd zzydVarM16266x = m16266x(context, this.f21536h, this.f21544p);
                zzzk zzzkVarM15264b = "search_v2".equals(zzydVarM16266x.f27447f) ? new z50(zzyt.m20845b(), context, zzydVarM16266x, this.f21542n).m15264b(context, false) : new x50(zzyt.m20845b(), context, zzydVarM16266x, this.f21542n, this.f21529a).m15264b(context, false);
                this.f21539k = zzzkVarM15264b;
                zzzkVarM15264b.mo16348L0(new zzxv(this.f21533e));
                if (this.f21534f != null) {
                    this.f21539k.mo16362w4(new zzxs(this.f21534f));
                }
                if (this.f21537i != null) {
                    this.f21539k.mo16349P5(new zzyf(this.f21537i));
                }
                if (this.f21540l != null) {
                    this.f21539k.mo16345H6(new zzadr(this.f21540l));
                }
                Correlator correlator = this.f21538j;
                if (correlator != null) {
                    this.f21539k.mo16361v4(correlator.zzdf());
                }
                if (this.f21541m != null) {
                    this.f21539k.mo16352W6(new zzacd(this.f21541m));
                }
                this.f21539k.mo16360t1(this.f21545q);
                try {
                    IObjectWrapper iObjectWrapperMo16350S0 = this.f21539k.mo16350S0();
                    if (iObjectWrapperMo16350S0 != null) {
                        this.f21543o.addView((View) ObjectWrapper.m14709k0(iObjectWrapperMo16350S0));
                    }
                } catch (RemoteException e2) {
                    zzbad.m17350f("#007 Could not call remote method.", e2);
                }
            }
            if (this.f21539k.mo16347J4(zzyc.m20820a(this.f21543o.getContext(), zzaazVar))) {
                this.f21529a.m16694k7(zzaazVar.m16220q());
            }
        } catch (RemoteException e3) {
            zzbad.m17350f("#007 Could not call remote method.", e3);
        }
    }

    /* renamed from: z */
    public final void m16293z(zzxr zzxrVar) {
        try {
            this.f21534f = zzxrVar;
            zzzk zzzkVar = this.f21539k;
            if (zzzkVar != null) {
                zzzkVar.mo16362w4(zzxrVar != null ? new zzxs(zzxrVar) : null);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    public zzabb(ViewGroup viewGroup, int i2) {
        this(viewGroup, null, false, zzyc.f27446a, i2);
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzyc.f27446a, 0);
    }

    public zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i2) {
        this(viewGroup, attributeSet, false, zzyc.f27446a, i2);
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzycVar, zzzk zzzkVar, int i2) {
        this.f21529a = new zzamo();
        this.f21532d = new VideoController();
        this.f21533e = new C6470a(this);
        this.f21543o = viewGroup;
        this.f21530b = zzycVar;
        this.f21539k = null;
        this.f21531c = new AtomicBoolean(false);
        this.f21544p = i2;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzyg zzygVar = new zzyg(context, attributeSet);
                this.f21536h = zzygVar.m20829c(z);
                this.f21542n = zzygVar.m20828a();
                if (viewGroup.isInEditMode()) {
                    zzazt zzaztVarM20844a = zzyt.m20844a();
                    AdSize adSize = this.f21536h[0];
                    int i3 = this.f21544p;
                    zzyd zzydVar = new zzyd(context, adSize);
                    zzydVar.f27456o = m16264C(i3);
                    zzaztVarM20844a.m17321f(viewGroup, zzydVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e2) {
                zzyt.m20844a().m17322h(viewGroup, new zzyd(context, AdSize.BANNER), e2.getMessage(), e2.getMessage());
            }
        }
    }

    @VisibleForTesting
    private zzabb(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzyc zzycVar, int i2) {
        this(viewGroup, attributeSet, z, zzycVar, null, i2);
    }
}
