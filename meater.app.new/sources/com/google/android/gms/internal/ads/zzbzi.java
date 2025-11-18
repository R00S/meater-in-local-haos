package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbzi extends zzaes implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcab {

    /* renamed from: f */
    private final WeakReference<View> f23870f;

    /* renamed from: g */
    private final Map<String, WeakReference<View>> f23871g = new HashMap();

    /* renamed from: h */
    private final Map<String, WeakReference<View>> f23872h = new HashMap();

    /* renamed from: i */
    private final Map<String, WeakReference<View>> f23873i = new HashMap();

    /* renamed from: j */
    private zzbyn f23874j;

    /* renamed from: k */
    private zzua f23875k;

    public zzbzi(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzk.zzmd();
        zzbbz.m17392a(view, this);
        zzk.zzmd();
        zzbbz.m17393b(view, this);
        this.f23870f = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : map.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.f23871g.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.f23873i.putAll(this.f23871g);
        for (Map.Entry<String, View> entry2 : map2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.f23872h.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.f23873i.putAll(this.f23872h);
        this.f23875k = new zzua(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: A5 */
    public final synchronized String mo18582A5() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: E0 */
    public final FrameLayout mo18583E0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: E3 */
    public final zzua mo18584E3() {
        return this.f23875k;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: H */
    public final synchronized void mo18585H(String str, View view, boolean z) {
        if (view == null) {
            this.f23873i.remove(str);
            this.f23871g.remove(str);
            this.f23872h.remove(str);
            return;
        }
        this.f23873i.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.f23871g.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: S4 */
    public final synchronized Map<String, WeakReference<View>> mo18586S4() {
        return this.f23872h;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* renamed from: V */
    public final synchronized void mo16372V(IObjectWrapper iObjectWrapper) {
        Object objM14709k0 = ObjectWrapper.m14709k0(iObjectWrapper);
        if (!(objM14709k0 instanceof zzbyn)) {
            zzbad.m17353i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18499v(this);
        }
        if (!((zzbyn) objM14709k0).m18494q()) {
            zzbad.m17351g("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        zzbyn zzbynVar2 = (zzbyn) objM14709k0;
        this.f23874j = zzbynVar2;
        zzbynVar2.m18492o(this);
        this.f23874j.m18483E(mo18589k0());
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: V3 */
    public final synchronized Map<String, WeakReference<View>> mo18587V3() {
        return this.f23871g;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: Y4 */
    public final synchronized View mo18588Y4(String str) {
        WeakReference<View> weakReference = this.f23873i.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: k0 */
    public final View mo18589k0() {
        return this.f23870f.get();
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18488k(view, mo18589k0(), mo18590y4(), mo18587V3(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18498u(mo18589k0(), mo18590y4(), mo18587V3(), zzbyn.m18478D(mo18589k0()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18498u(mo18589k0(), mo18590y4(), mo18587V3(), zzbyn.m18478D(mo18589k0()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18487j(view, motionEvent, mo18589k0());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* renamed from: x0 */
    public final synchronized void mo16373x0(IObjectWrapper iObjectWrapper) {
        if (this.f23874j != null) {
            Object objM14709k0 = ObjectWrapper.m14709k0(iObjectWrapper);
            if (!(objM14709k0 instanceof View)) {
                zzbad.m17353i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.f23874j.m18486i((View) objM14709k0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    /* renamed from: y4 */
    public final synchronized Map<String, WeakReference<View>> mo18590y4() {
        return this.f23873i;
    }

    @Override // com.google.android.gms.internal.ads.zzaer
    /* renamed from: z5 */
    public final synchronized void mo16374z5() {
        zzbyn zzbynVar = this.f23874j;
        if (zzbynVar != null) {
            zzbynVar.m18499v(this);
            this.f23874j = null;
        }
    }
}
