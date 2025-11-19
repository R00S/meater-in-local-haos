package androidx.media3.ui;

import X1.L;
import android.graphics.Color;

/* compiled from: HtmlUtils.java */
/* renamed from: androidx.media3.ui.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2158c {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return L.G("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }
}
