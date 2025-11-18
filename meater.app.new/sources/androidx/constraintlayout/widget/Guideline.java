package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) getLayoutParams();
        c0211b.f1443a = i2;
        setLayoutParams(c0211b);
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) getLayoutParams();
        c0211b.f1445b = i2;
        setLayoutParams(c0211b);
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) getLayoutParams();
        c0211b.f1447c = f2;
        setLayoutParams(c0211b);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
