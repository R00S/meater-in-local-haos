package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzxr;

/* loaded from: classes2.dex */
class BaseAdView extends ViewGroup {
    protected final zzabb zzaaq;

    public BaseAdView(Context context, int i2) {
        super(context);
        this.zzaaq = new zzabb(this, i2);
    }

    public void destroy() {
        this.zzaaq.m16270a();
    }

    public AdListener getAdListener() {
        return this.zzaaq.m16271b();
    }

    public AdSize getAdSize() {
        return this.zzaaq.m16272c();
    }

    public String getAdUnitId() {
        return this.zzaaq.m16274e();
    }

    public String getMediationAdapterClassName() {
        return this.zzaaq.m16276g();
    }

    public boolean isLoading() {
        return this.zzaaq.m16280k();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzaaq.m16292y(adRequest.zzde());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i6 = ((i4 - i2) - measuredWidth) / 2;
        int i7 = ((i5 - i3) - measuredHeight) / 2;
        childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e2) {
                zzbad.m17347c("Unable to retrieve ad size.", e2);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i2, i3);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i2), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i3));
    }

    public void pause() {
        this.zzaaq.m16281l();
    }

    public void resume() {
        this.zzaaq.m16283n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        this.zzaaq.m16284o(adListener);
        if (adListener == 0) {
            this.zzaaq.m16293z(null);
            this.zzaaq.m16287r(null);
            return;
        }
        if (adListener instanceof zzxr) {
            this.zzaaq.m16293z((zzxr) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzaaq.m16287r((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzaaq.m16285p(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzaaq.m16286q(str);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        this.zzaaq = new zzabb(this, attributeSet, false, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2);
        this.zzaaq = new zzabb(this, attributeSet, false, i3);
    }
}
