package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent.java */
/* renamed from: androidx.core.view.n */
/* loaded from: classes.dex */
public interface InterfaceC0304n {
    boolean onNestedFling(View view, float f2, float f3, boolean z);

    boolean onNestedPreFling(View view, float f2, float f3);

    void onNestedPreScroll(View view, int i2, int i3, int[] iArr);

    void onNestedScroll(View view, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(View view, View view2, int i2);

    boolean onStartNestedScroll(View view, View view2, int i2);

    void onStopNestedScroll(View view);
}
