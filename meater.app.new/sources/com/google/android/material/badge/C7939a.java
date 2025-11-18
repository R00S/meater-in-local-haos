package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* compiled from: BadgeUtils.java */
/* renamed from: com.google.android.material.badge.a */
/* loaded from: classes2.dex */
public class C7939a {

    /* renamed from: a */
    public static final boolean f29706a;

    static {
        f29706a = Build.VERSION.SDK_INT < 18;
    }

    /* renamed from: a */
    public static void m23852a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m23856e(badgeDrawable, view, frameLayout);
        if (f29706a) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    /* renamed from: b */
    public static SparseArray<BadgeDrawable> m23853b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i2 = 0; i2 < parcelableSparseArray.size(); i2++) {
            int iKeyAt = parcelableSparseArray.keyAt(i2);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i2);
            if (savedState == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(iKeyAt, BadgeDrawable.m23809c(context, savedState));
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m23854c(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i2);
            if (badgeDrawableValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.m23821i());
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m23855d(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (f29706a) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    /* renamed from: e */
    public static void m23856e(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        (f29706a ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.m23830u(view, frameLayout);
    }

    /* renamed from: f */
    public static void m23857f(Rect rect, float f2, float f3, float f4, float f5) {
        rect.set((int) (f2 - f4), (int) (f3 - f5), (int) (f2 + f4), (int) (f3 + f5));
    }
}
