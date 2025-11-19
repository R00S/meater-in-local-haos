package androidx.recyclerview.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public class i extends RecyclerView.p {

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f28928d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    private Drawable f28929a;

    /* renamed from: b, reason: collision with root package name */
    private int f28930b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f28931c = new Rect();

    @SuppressLint({"UnknownNullness"})
    public i(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f28928d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f28929a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        l(i10);
    }

    private void j(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().U(childAt, this.f28931c);
            int iRound = this.f28931c.right + Math.round(childAt.getTranslationX());
            this.f28929a.setBounds(iRound - this.f28929a.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f28929a.draw(canvas);
        }
        canvas.restore();
    }

    private void k(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.p0(childAt, this.f28931c);
            int iRound = this.f28931c.bottom + Math.round(childAt.getTranslationY());
            this.f28929a.setBounds(paddingLeft, iRound - this.f28929a.getIntrinsicHeight(), width, iRound);
            this.f28929a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C c10) {
        Drawable drawable = this.f28929a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f28930b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.C c10) {
        if (recyclerView.getLayoutManager() == null || this.f28929a == null) {
            return;
        }
        if (this.f28930b == 1) {
            k(canvas, recyclerView);
        } else {
            j(canvas, recyclerView);
        }
    }

    public void l(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f28930b = i10;
    }
}
