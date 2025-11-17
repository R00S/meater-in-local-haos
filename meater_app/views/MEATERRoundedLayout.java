package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERRoundedLayout extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    View f10323q;

    /* renamed from: r, reason: collision with root package name */
    int f10324r;

    public MEATERRoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        View.inflate(context, 2131558724, this);
        this.f10323q = findViewById(2131363426);
    }

    public int getColor() {
        return this.f10324r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.f10323q != null) {
            int min = (int) (Math.min(((View) getParent()).getMeasuredWidth(), ((View) getParent()).getMeasuredHeight()) * 0.72d);
            this.f10323q.getLayoutParams().height = min;
            this.f10323q.getLayoutParams().width = min;
            this.f10323q.requestLayout();
        }
    }

    public void setColor(String str) {
        if (str != null) {
            this.f10324r = Color.parseColor(str);
            f8.q0.d(this.f10323q.getBackground(), this.f10324r, true);
        }
    }

    public void setDarkerColor(String str) {
        if (str != null) {
            this.f10324r = Color.parseColor(str);
            f8.q0.d(this.f10323q.getBackground(), this.f10324r, false);
        }
    }

    public void setColor(int i10) {
        f8.q0.d(this.f10323q.getBackground(), i10, false);
    }
}
