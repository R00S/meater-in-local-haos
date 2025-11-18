package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* renamed from: androidx.appcompat.widget.b */
/* loaded from: classes.dex */
class C0154b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f1032a;

    public C0154b(ActionBarContainer actionBarContainer) {
        this.f1032a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1032a;
        if (actionBarContainer.f698m) {
            Drawable drawable = actionBarContainer.f697l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f695j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1032a;
        Drawable drawable3 = actionBarContainer2.f696k;
        if (drawable3 == null || !actionBarContainer2.f699n) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1032a;
        if (actionBarContainer.f698m) {
            Drawable drawable = actionBarContainer.f697l;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f695j;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
