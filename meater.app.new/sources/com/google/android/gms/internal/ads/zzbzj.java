package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbzj extends zzaen implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: f */
    public static final String[] f23876f = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};

    /* renamed from: g */
    private final String f23877g;

    /* renamed from: i */
    private FrameLayout f23879i;

    /* renamed from: j */
    private FrameLayout f23880j;

    /* renamed from: k */
    private zzbbl f23881k;

    /* renamed from: l */
    private View f23882l;

    /* renamed from: m */
    private zzbyn f23883m;

    /* renamed from: n */
    private zzua f23884n;

    /* renamed from: h */
    private Map<String, WeakReference<View>> f23878h = new HashMap();

    /* renamed from: o */
    private boolean f23885o = false;

    public zzbzj(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        this.f23879i = frameLayout;
        this.f23880j = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.f23877g = str;
        zzk.zzmd();
        zzbbz.m17392a(frameLayout, this);
        zzk.zzmd();
        zzbbz.m17393b(frameLayout, this);
        this.f23881k = zzbbm.f22759c;
        this.f23884n = new zzua(this.f23879i.getContext(), this.f23879i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    /* renamed from: i7 */
    private final synchronized void m18591i7() {
        this.f23881k.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.yf

            /* renamed from: f */
            private final zzbzj f21299f;

            {
                this.f21299f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f21299f.m18592j7();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: A5 */
    public final synchronized String mo18582A5() {
        return this.f23877g;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: E0 */
    public final FrameLayout mo18583E0() {
        return this.f23880j;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: E3 */
    public final zzua mo18584E3() {
        return this.f23884n;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: H */
    public final synchronized void mo18585H(String str, View view, boolean z) {
        if (this.f23885o) {
            return;
        }
        if (view == null) {
            this.f23878h.remove(str);
            return;
        }
        this.f23878h.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            view.setOnTouchListener(this);
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: S4 */
    public final synchronized Map<String, WeakReference<View>> mo18586S4() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: V */
    public final synchronized void mo16367V(IObjectWrapper iObjectWrapper) {
        if (this.f23885o) {
            return;
        }
        Object objM14709k0 = ObjectWrapper.m14709k0(iObjectWrapper);
        if (!(objM14709k0 instanceof zzbyn)) {
            zzbad.m17353i("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18499v(this);
        }
        m18591i7();
        zzbyn zzbynVar2 = (zzbyn) objM14709k0;
        this.f23883m = zzbynVar2;
        zzbynVar2.m18492o(this);
        this.f23883m.m18483E(this.f23879i);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: V3 */
    public final synchronized Map<String, WeakReference<View>> mo18587V3() {
        return this.f23878h;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: X0 */
    public final synchronized void mo16368X0(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: Y4 */
    public final synchronized View mo18588Y4(String str) {
        if (this.f23885o) {
            return null;
        }
        WeakReference<View> weakReference = this.f23878h.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: d5 */
    public final synchronized void mo16369d5(String str, IObjectWrapper iObjectWrapper) {
        mo18585H(str, (View) ObjectWrapper.m14709k0(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final synchronized void destroy() {
        if (this.f23885o) {
            return;
        }
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18499v(this);
            this.f23883m = null;
        }
        this.f23878h.clear();
        this.f23879i.removeAllViews();
        this.f23880j.removeAllViews();
        this.f23878h = null;
        this.f23879i = null;
        this.f23880j = null;
        this.f23882l = null;
        this.f23884n = null;
        this.f23885o = true;
    }

    /* renamed from: j7 */
    final /* synthetic */ void m18592j7() {
        if (this.f23882l == null) {
            View view = new View(this.f23879i.getContext());
            this.f23882l = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.f23879i != this.f23882l.getParent()) {
            this.f23879i.addView(this.f23882l);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: k0 */
    public final /* synthetic */ View mo18589k0() {
        return this.f23879i;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: n4 */
    public final synchronized IObjectWrapper mo16370n4(String str) {
        return ObjectWrapper.m14708E0(mo18588Y4(str));
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18484g();
            this.f23883m.m18488k(view, this.f23879i, mo18590y4(), mo18587V3(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18498u(this.f23879i, mo18590y4(), mo18587V3(), zzbyn.m18478D(this.f23879i));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18498u(this.f23879i, mo18590y4(), mo18587V3(), zzbyn.m18478D(this.f23879i));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzbyn zzbynVar = this.f23883m;
        if (zzbynVar != null) {
            zzbynVar.m18487j(view, motionEvent, this.f23879i);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    /* renamed from: x0 */
    public final synchronized void mo16371x0(IObjectWrapper iObjectWrapper) {
        this.f23883m.m18486i((View) ObjectWrapper.m14709k0(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: y4 */
    public final synchronized Map<String, WeakReference<View>> mo18590y4() {
        return this.f23878h;
    }
}
