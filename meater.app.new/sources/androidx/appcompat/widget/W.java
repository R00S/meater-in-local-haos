package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.SpinnerAdapter;

/* compiled from: ThemedSpinnerAdapter.java */
/* loaded from: classes.dex */
public interface W extends SpinnerAdapter {
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(Resources.Theme theme);
}
