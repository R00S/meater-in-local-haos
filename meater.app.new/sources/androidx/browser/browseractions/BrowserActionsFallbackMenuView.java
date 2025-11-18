package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p024c.p038c.C0856a;

/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f */
    private final int f1345f;

    /* renamed from: g */
    private final int f1346g;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1345f = getResources().getDimensionPixelOffset(C0856a.f5652b);
        this.f1346g = getResources().getDimensionPixelOffset(C0856a.f5651a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1345f * 2), this.f1346g), 1073741824), i3);
    }
}
