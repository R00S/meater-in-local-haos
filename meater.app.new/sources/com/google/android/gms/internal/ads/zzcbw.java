package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class zzcbw extends zzajb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadv {

    /* renamed from: f */
    private View f24020f;

    /* renamed from: g */
    private zzaar f24021g;

    /* renamed from: h */
    private zzbyn f24022h;

    /* renamed from: i */
    private boolean f24023i = false;

    /* renamed from: j */
    private boolean f24024j = false;

    public zzcbw(zzbyn zzbynVar, zzbyt zzbytVar) {
        this.f24020f = zzbytVar.m18555z();
        this.f24021g = zzbytVar.m18545m();
        this.f24022h = zzbynVar;
        if (zzbytVar.m18513A() != null) {
            zzbytVar.m18513A().mo14877D(this);
        }
    }

    /* renamed from: h7 */
    private static void m18649h7(zzajc zzajcVar, int i2) {
        try {
            zzajcVar.mo16596i2(i2);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: i7 */
    private final void m18650i7() {
        View view = this.f24020f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f24020f);
        }
    }

    /* renamed from: j7 */
    private final void m18651j7() {
        View view;
        zzbyn zzbynVar = this.f24022h;
        if (zzbynVar == null || (view = this.f24020f) == null) {
            return;
        }
        zzbynVar.m18498u(view, Collections.emptyMap(), Collections.emptyMap(), zzbyn.m18478D(this.f24020f));
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void destroy() throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        m18650i7();
        zzbyn zzbynVar = this.f24022h;
        if (zzbynVar != null) {
            zzbynVar.mo18226a();
        }
        this.f24022h = null;
        this.f24020f = null;
        this.f24021g = null;
        this.f24023i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final zzaar getVideoController() throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        if (!this.f24023i) {
            return this.f24021g;
        }
        zzbad.m17351g("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    /* renamed from: k7 */
    final /* synthetic */ void m18652k7() {
        try {
            destroy();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    /* renamed from: m6 */
    public final void mo16594m6(IObjectWrapper iObjectWrapper, zzajc zzajcVar) throws RemoteException {
        Preconditions.m14367f("#008 Must be called on the main UI thread.");
        if (this.f24023i) {
            zzbad.m17351g("Instream ad is destroyed already.");
            m18649h7(zzajcVar, 2);
            return;
        }
        View view = this.f24020f;
        if (view == null || this.f24021g == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            zzbad.m17351g(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            m18649h7(zzajcVar, 0);
            return;
        }
        if (this.f24024j) {
            zzbad.m17351g("Instream ad should not be used again.");
            m18649h7(zzajcVar, 1);
            return;
        }
        this.f24024j = true;
        m18650i7();
        ((ViewGroup) ObjectWrapper.m14709k0(iObjectWrapper)).addView(this.f24020f, new ViewGroup.LayoutParams(-1, -1));
        zzk.zzmd();
        zzbbz.m17392a(this.f24020f, this);
        zzk.zzmd();
        zzbbz.m17393b(this.f24020f, this);
        m18651j7();
        try {
            zzajcVar.mo16595c7();
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m18651j7();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m18651j7();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    /* renamed from: p5 */
    public final void mo16467p5() {
        zzaxi.f22654a.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hh

            /* renamed from: f */
            private final zzcbw f19231f;

            {
                this.f19231f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f19231f.m18652k7();
            }
        });
    }
}
