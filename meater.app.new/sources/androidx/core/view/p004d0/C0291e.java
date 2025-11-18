package androidx.core.view.p004d0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat.java */
/* renamed from: androidx.core.view.d0.e */
/* loaded from: classes.dex */
public class C0291e {
    /* renamed from: a */
    public static void m2029a(AccessibilityRecord accessibilityRecord, int i2) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i2);
        }
    }

    /* renamed from: b */
    public static void m2030b(AccessibilityRecord accessibilityRecord, int i2) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i2);
        }
    }

    /* renamed from: c */
    public static void m2031c(AccessibilityRecord accessibilityRecord, View view, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i2);
        }
    }
}
