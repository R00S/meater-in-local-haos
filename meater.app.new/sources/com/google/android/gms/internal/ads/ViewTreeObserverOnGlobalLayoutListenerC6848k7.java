package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.zzk;
import java.lang.ref.WeakReference;

@zzard
/* renamed from: com.google.android.gms.internal.ads.k7 */
/* loaded from: classes2.dex */
final class ViewTreeObserverOnGlobalLayoutListenerC6848k7 extends AbstractC6922m7 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: g */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f19523g;

    public ViewTreeObserverOnGlobalLayoutListenerC6848k7(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f19523g = new WeakReference<>(onGlobalLayoutListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6922m7
    /* renamed from: d */
    protected final void mo15391d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6922m7
    /* renamed from: e */
    protected final void mo15392e(ViewTreeObserver viewTreeObserver) {
        zzk.zzli().mo17198i(viewTreeObserver, this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f19523g.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            m15542b();
        }
    }
}
