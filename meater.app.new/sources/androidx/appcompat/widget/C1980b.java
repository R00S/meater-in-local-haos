package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1980b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    final ActionBarContainer f21616a;

    /* compiled from: ActionBarBackgroundDrawable.java */
    /* renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1980b(ActionBarContainer actionBarContainer) {
        this.f21616a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f21616a;
        if (actionBarContainer.f21122I) {
            Drawable drawable = actionBarContainer.f21121H;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f21119F;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f21616a;
        Drawable drawable3 = actionBarContainer2.f21120G;
        if (drawable3 == null || !actionBarContainer2.f21123J) {
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
        ActionBarContainer actionBarContainer = this.f21616a;
        if (actionBarContainer.f21122I) {
            if (actionBarContainer.f21121H != null) {
                a.a(actionBarContainer.f21119F, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f21119F;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
