package ca;

import android.content.res.Resources;
import android.util.TypedValue;

/* compiled from: DensityUtils.java */
/* renamed from: ca.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2353b {
    public static int a(int i10) {
        return (int) TypedValue.applyDimension(1, i10, Resources.getSystem().getDisplayMetrics());
    }
}
