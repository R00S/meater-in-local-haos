package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p024c.p025a.C0823a;

/* loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* renamed from: f */
    private final C0180o f806f;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0823a.f5019H);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmapM1081b = this.f806f.m1081b();
        if (bitmapM1081b != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapM1081b.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0180o c0180o = new C0180o(this);
        this.f806f = c0180o;
        c0180o.mo1082c(attributeSet, i2);
    }
}
