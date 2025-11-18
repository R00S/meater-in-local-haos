package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

@zzard
/* loaded from: classes2.dex */
public class zzyv extends AdListener {

    /* renamed from: a */
    private final Object f27481a = new Object();

    /* renamed from: b */
    private AdListener f27482b;

    /* renamed from: a */
    public final void m20853a(AdListener adListener) {
        synchronized (this.f27481a) {
            this.f27482b = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        synchronized (this.f27481a) {
            AdListener adListener = this.f27482b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i2) {
        synchronized (this.f27481a) {
            AdListener adListener = this.f27482b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(i2);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
        synchronized (this.f27481a) {
            AdListener adListener = this.f27482b;
            if (adListener != null) {
                adListener.onAdLeftApplication();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.f27481a) {
            AdListener adListener = this.f27482b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        synchronized (this.f27481a) {
            AdListener adListener = this.f27482b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}
