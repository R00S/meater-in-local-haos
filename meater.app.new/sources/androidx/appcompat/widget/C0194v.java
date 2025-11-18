package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* renamed from: androidx.appcompat.widget.v */
/* loaded from: classes.dex */
public class C0194v extends ToggleButton {

    /* renamed from: f */
    private final C0188s f1321f;

    public C0194v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C0194v(Context context, AttributeSet attributeSet, int i2) throws Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i2);
        C0175l0.m1068a(this, getContext());
        C0188s c0188s = new C0188s(this);
        this.f1321f = c0188s;
        c0188s.m1165m(attributeSet, i2);
    }
}
