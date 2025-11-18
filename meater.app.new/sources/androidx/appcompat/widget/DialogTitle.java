package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import java.lang.reflect.InvocationTargetException;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
public class DialogTitle extends C0190t {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.C0190t, android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int lineCount;
        super.onMeasure(i2, i3);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0832j.f5317X2, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0832j.f5322Y2, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i2, i3);
    }
}
