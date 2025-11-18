package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcae implements zzbzb {

    /* renamed from: a */
    private final zzana f23934a;

    /* renamed from: b */
    private final zzand f23935b;

    /* renamed from: c */
    private final zzang f23936c;

    /* renamed from: d */
    private final zzbrt f23937d;

    /* renamed from: e */
    private final zzbri f23938e;

    /* renamed from: f */
    private final Context f23939f;

    /* renamed from: g */
    private final zzcxm f23940g;

    /* renamed from: h */
    private final zzbai f23941h;

    /* renamed from: i */
    private final zzcxv f23942i;

    /* renamed from: j */
    private boolean f23943j = false;

    /* renamed from: k */
    private boolean f23944k = false;

    public zzcae(zzana zzanaVar, zzand zzandVar, zzang zzangVar, zzbrt zzbrtVar, zzbri zzbriVar, Context context, zzcxm zzcxmVar, zzbai zzbaiVar, zzcxv zzcxvVar) {
        this.f23934a = zzanaVar;
        this.f23935b = zzandVar;
        this.f23936c = zzangVar;
        this.f23937d = zzbrtVar;
        this.f23938e = zzbriVar;
        this.f23939f = context;
        this.f23940g = zzcxmVar;
        this.f23941h = zzbaiVar;
        this.f23942i = zzcxvVar;
    }

    /* renamed from: o */
    private final void m18613o(View view) {
        try {
            zzang zzangVar = this.f23936c;
            if (zzangVar != null && !zzangVar.mo16783M()) {
                this.f23936c.mo16784N(ObjectWrapper.m14708E0(view));
                this.f23938e.onAdClicked();
                return;
            }
            zzana zzanaVar = this.f23934a;
            if (zzanaVar != null && !zzanaVar.mo16751M()) {
                this.f23934a.mo16752N(ObjectWrapper.m14708E0(view));
                this.f23938e.onAdClicked();
                return;
            }
            zzand zzandVar = this.f23935b;
            if (zzandVar == null || zzandVar.mo16769M()) {
                return;
            }
            this.f23935b.mo16770N(ObjectWrapper.m14708E0(view));
            this.f23938e.onAdClicked();
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to call handleClick", e2);
        }
    }

    /* renamed from: p */
    private static HashMap<String, View> m18614p(Map<String, WeakReference<View>> map) {
        HashMap<String, View> map2 = new HashMap<>();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    map2.put(entry.getKey(), view);
                }
            }
        }
        return map2;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: G0 */
    public final void mo18454G0(zzaag zzaagVar) {
        zzbad.m17353i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: W */
    public final void mo18455W() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: a */
    public final void mo18456a(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        try {
            IObjectWrapper iObjectWrapperM14708E0 = ObjectWrapper.m14708E0(view);
            HashMap<String, View> mapM18614p = m18614p(map);
            HashMap<String, View> mapM18614p2 = m18614p(map2);
            zzang zzangVar = this.f23936c;
            if (zzangVar != null) {
                zzangVar.mo16780D(iObjectWrapperM14708E0, ObjectWrapper.m14708E0(mapM18614p), ObjectWrapper.m14708E0(mapM18614p2));
                return;
            }
            zzana zzanaVar = this.f23934a;
            if (zzanaVar != null) {
                zzanaVar.mo16748D(iObjectWrapperM14708E0, ObjectWrapper.m14708E0(mapM18614p), ObjectWrapper.m14708E0(mapM18614p2));
                this.f23934a.mo16747C0(iObjectWrapperM14708E0);
                return;
            }
            zzand zzandVar = this.f23935b;
            if (zzandVar != null) {
                zzandVar.mo16765D(iObjectWrapperM14708E0, ObjectWrapper.m14708E0(mapM18614p), ObjectWrapper.m14708E0(mapM18614p2));
                this.f23935b.mo16764C0(iObjectWrapperM14708E0);
            }
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to call trackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: b */
    public final void mo18457b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: c */
    public final void mo18458c(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: d */
    public final void mo18459d() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: d0 */
    public final void mo18460d0(zzagd zzagdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    public final void destroy() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: e */
    public final void mo18461e(View view, Map<String, WeakReference<View>> map) {
        try {
            IObjectWrapper iObjectWrapperM14708E0 = ObjectWrapper.m14708E0(view);
            zzang zzangVar = this.f23936c;
            if (zzangVar != null) {
                zzangVar.mo16778A(iObjectWrapperM14708E0);
                return;
            }
            zzana zzanaVar = this.f23934a;
            if (zzanaVar != null) {
                zzanaVar.mo16745A(iObjectWrapperM14708E0);
                return;
            }
            zzand zzandVar = this.f23935b;
            if (zzandVar != null) {
                zzandVar.mo16762A(iObjectWrapperM14708E0);
            }
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to call untrackView", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: e0 */
    public final void mo18462e0(zzaak zzaakVar) {
        zzbad.m17353i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: f */
    public final void mo18463f(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: g */
    public final void mo18464g(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: h */
    public final void mo18465h(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f23944k && this.f23940g.f25231D) {
            return;
        }
        m18613o(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: i */
    public final void mo18466i(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: j */
    public final void mo18467j(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            boolean z = this.f23943j;
            if (!z && this.f23940g.f25268z != null) {
                this.f23943j = z | zzk.zzlq().m17240c(this.f23939f, this.f23941h.f22750f, this.f23940g.f25268z.toString(), this.f23942i.f25295f);
            }
            zzang zzangVar = this.f23936c;
            if (zzangVar != null && !zzangVar.mo16779C()) {
                this.f23936c.recordImpression();
                this.f23937d.m18301Y();
                return;
            }
            zzana zzanaVar = this.f23934a;
            if (zzanaVar != null && !zzanaVar.mo16746C()) {
                this.f23934a.recordImpression();
                this.f23937d.m18301Y();
                return;
            }
            zzand zzandVar = this.f23935b;
            if (zzandVar == null || zzandVar.mo16763C()) {
                return;
            }
            this.f23935b.recordImpression();
            this.f23937d.m18301Y();
        } catch (RemoteException e2) {
            zzbad.m17348d("Failed to call recordImpression", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: j0 */
    public final void mo18468j0() {
        this.f23944k = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: k */
    public final void mo18469k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.f23944k) {
            zzbad.m17353i("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f23940g.f25231D) {
            m18613o(view);
        } else {
            zzbad.m17353i("Custom click reporting for 3p ads failed. Ad unit id not whitelisted.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: l */
    public final void mo18470l() {
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: m */
    public final boolean mo18471m(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbzb
    /* renamed from: n */
    public final void mo18472n() {
        zzbad.m17353i("Mute This Ad is not supported for 3rd party ads");
    }
}
