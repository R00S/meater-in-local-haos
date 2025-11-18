package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.InterfaceC0153a0;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0153a0 {

    /* renamed from: f */
    private InterfaceC0153a0.a f848f;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0153a0.a aVar = this.f848f;
        if (aVar != null) {
            aVar.mo364a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0153a0
    public void setOnFitSystemWindowsListener(InterfaceC0153a0.a aVar) {
        this.f848f = aVar;
    }
}
