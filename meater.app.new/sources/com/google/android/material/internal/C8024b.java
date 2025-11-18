package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: DescendantOffsetUtils.java */
/* renamed from: com.google.android.material.internal.b */
/* loaded from: classes2.dex */
public class C8024b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f30380a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f30381b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m24656a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m24658c(viewGroup, view, rect);
    }

    /* renamed from: b */
    private static void m24657b(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m24657b(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: c */
    public static void m24658c(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f30380a;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m24657b(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f30381b;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
