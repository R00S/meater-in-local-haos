package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eb */
/* loaded from: classes2.dex */
final class RunnableC6630eb implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC6519bb f18744f;

    RunnableC6630eb(ViewTreeObserverOnGlobalLayoutListenerC6519bb viewTreeObserverOnGlobalLayoutListenerC6519bb) {
        this.f18744f = viewTreeObserverOnGlobalLayoutListenerC6519bb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
