package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: B, reason: collision with root package name */
    private int f21589B;

    /* renamed from: C, reason: collision with root package name */
    private int f21590C;

    /* renamed from: D, reason: collision with root package name */
    private WeakReference<View> f21591D;

    /* renamed from: E, reason: collision with root package name */
    private LayoutInflater f21592E;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f21589B == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f21592E;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f21589B, viewGroup, false);
        int i10 = this.f21590C;
        if (i10 != -1) {
            viewInflate.setId(i10);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f21591D = new WeakReference<>(viewInflate);
        return viewInflate;
    }

    public int getInflatedId() {
        return this.f21590C;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f21592E;
    }

    public int getLayoutResource() {
        return this.f21589B;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f21590C = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f21592E = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f21589B = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f21591D;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21589B = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42636O3, i10, 0);
        this.f21590C = typedArrayObtainStyledAttributes.getResourceId(i.j.f42651R3, -1);
        this.f21589B = typedArrayObtainStyledAttributes.getResourceId(i.j.f42646Q3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(i.j.f42641P3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
