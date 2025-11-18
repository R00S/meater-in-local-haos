package p241e.p254e.p256b.p271c.p278q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p024c.p052i.p053e.C0923a;
import p241e.p254e.p256b.p271c.p285x.C8946b;

/* compiled from: MaterialColors.java */
/* renamed from: e.e.b.c.q.a */
/* loaded from: classes2.dex */
public class C8937a {
    /* renamed from: a */
    public static int m28470a(Context context, int i2, int i3) {
        TypedValue typedValueM28495a = C8946b.m28495a(context, i2);
        return typedValueM28495a != null ? typedValueM28495a.data : i3;
    }

    /* renamed from: b */
    public static int m28471b(Context context, int i2, String str) {
        return C8946b.m28497c(context, i2, str);
    }

    /* renamed from: c */
    public static int m28472c(View view, int i2) {
        return C8946b.m28498d(view, i2);
    }

    /* renamed from: d */
    public static int m28473d(View view, int i2, int i3) {
        return m28470a(view.getContext(), i2, i3);
    }

    /* renamed from: e */
    public static int m28474e(int i2, int i3) {
        return C0923a.m5882j(i3, i2);
    }

    /* renamed from: f */
    public static int m28475f(int i2, int i3, float f2) {
        return m28474e(i2, C0923a.m5887o(i3, Math.round(Color.alpha(i3) * f2)));
    }

    /* renamed from: g */
    public static int m28476g(View view, int i2, int i3, float f2) {
        return m28475f(m28472c(view, i2), m28472c(view, i3), f2);
    }
}
