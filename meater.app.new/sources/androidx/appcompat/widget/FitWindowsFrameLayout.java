package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.InterfaceC0153a0;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0153a0 {

    /* renamed from: f */
    private InterfaceC0153a0.a f847f;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0153a0.a aVar = this.f847f;
        if (aVar != null) {
            aVar.mo364a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.InterfaceC0153a0
    public void setOnFitSystemWindowsListener(InterfaceC0153a0.a aVar) {
        this.f847f = aVar;
    }
}
