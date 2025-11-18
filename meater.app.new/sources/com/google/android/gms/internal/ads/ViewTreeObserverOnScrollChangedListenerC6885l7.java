package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

@zzard
/* renamed from: com.google.android.gms.internal.ads.l7 */
/* loaded from: classes2.dex */
final class ViewTreeObserverOnScrollChangedListenerC6885l7 extends AbstractC6922m7 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: g */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f19752g;

    public ViewTreeObserverOnScrollChangedListenerC6885l7(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f19752g = new WeakReference<>(onScrollChangedListener);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6922m7
    /* renamed from: d */
    protected final void mo15391d(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6922m7
    /* renamed from: e */
    protected final void mo15392e(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f19752g.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            m15542b();
        }
    }
}
