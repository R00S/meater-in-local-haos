package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzbad;

@zzard
/* loaded from: classes2.dex */
public final class SearchAdView extends ViewGroup {
    private final zzabb zzabf;

    public SearchAdView(Context context) {
        super(context);
        this.zzabf = new zzabb(this);
    }

    public final void destroy() {
        this.zzabf.m16270a();
    }

    public final AdListener getAdListener() {
        return this.zzabf.m16271b();
    }

    public final AdSize getAdSize() {
        return this.zzabf.m16272c();
    }

    public final String getAdUnitId() {
        return this.zzabf.m16274e();
    }

    public final void loadAd(SearchAdRequest searchAdRequest) {
        this.zzabf.m16292y(searchAdRequest.zzde());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
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
    protected final void onMeasure(int i2, int i3) {
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

    public final void pause() {
        this.zzabf.m16281l();
    }

    public final void resume() {
        this.zzabf.m16283n();
    }

    public final void setAdListener(AdListener adListener) {
        this.zzabf.m16284o(adListener);
    }

    public final void setAdSize(AdSize adSize) {
        this.zzabf.m16285p(adSize);
    }

    public final void setAdUnitId(String str) {
        this.zzabf.m16286q(str);
    }

    public final void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (!AdSize.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        this.zzabf.m16292y(dynamicHeightSearchAdRequest.zzde());
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzabf = new zzabb(this, attributeSet, false);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.zzabf = new zzabb(this, attributeSet, false);
    }
}
