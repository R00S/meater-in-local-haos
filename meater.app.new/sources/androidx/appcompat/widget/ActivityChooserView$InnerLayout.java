package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f21196B = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0 a0VarU = a0.u(context, attributeSet, f21196B);
        setBackgroundDrawable(a0VarU.g(0));
        a0VarU.x();
    }
}
