package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import okhttp3.HttpUrl;
import p024c.p067m.C0986c;

/* compiled from: FragmentContainerView.java */
/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public final class C0471g extends FrameLayout {

    /* renamed from: f */
    private ArrayList<View> f3282f;

    /* renamed from: g */
    private ArrayList<View> f3283g;

    /* renamed from: h */
    private boolean f3284h;

    C0471g(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        String str;
        super(context, attributeSet);
        this.f3284h = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0986c.f6516h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C0986c.f6517i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C0986c.f6518j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM3485i0 = fragmentManager.m3485i0(id);
        if (classAttribute == null || fragmentM3485i0 != null) {
            return;
        }
        if (id > 0) {
            Fragment fragmentMo3524a = fragmentManager.m3506t0().mo3524a(context.getClassLoader(), classAttribute);
            fragmentMo3524a.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.m3493m().m3745u(true).m3736d(this, fragmentMo3524a, string).mo3551l();
            return;
        }
        if (string != null) {
            str = " with tag " + string;
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
    }

    /* renamed from: a */
    private void m3625a(View view) {
        ArrayList<View> arrayList = this.f3283g;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3282f == null) {
            this.f3282f = new ArrayList<>();
        }
        this.f3282f.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (FragmentManager.m3391C0(view) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (FragmentManager.m3391C0(view) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f3284h && this.f3282f != null) {
            for (int i2 = 0; i2 < this.f3282f.size(); i2++) {
                super.drawChild(canvas, this.f3282f.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f3284h || (arrayList = this.f3282f) == null || arrayList.size() <= 0 || !this.f3282f.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3283g;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3282f;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3284h = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3625a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            m3625a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m3625a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        m3625a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m3625a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m3625a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            m3625a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    void setDrawDisappearingViewsLast(boolean z) {
        this.f3284h = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3283g == null) {
                this.f3283g = new ArrayList<>();
            }
            this.f3283g.add(view);
        }
        super.startViewTransition(view);
    }
}
