package com.bumptech.glide.load.p131o.p134e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0255a;
import androidx.core.content.p003d.C0263f;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p025a.p032o.C0844d;

/* compiled from: DrawableDecoderCompat.java */
/* renamed from: com.bumptech.glide.load.o.e.a */
/* loaded from: classes.dex */
public final class C5507a {

    /* renamed from: a */
    private static volatile boolean f13791a = true;

    /* renamed from: a */
    public static Drawable m10704a(Context context, int i2, Resources.Theme theme) {
        return m10706c(context, context, i2, theme);
    }

    /* renamed from: b */
    public static Drawable m10705b(Context context, Context context2, int i2) {
        return m10706c(context, context2, i2, null);
    }

    /* renamed from: c */
    private static Drawable m10706c(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (f13791a) {
                return m10708e(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return C0255a.m1677f(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            f13791a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m10707d(context2, i2, theme);
    }

    /* renamed from: d */
    private static Drawable m10707d(Context context, int i2, Resources.Theme theme) {
        return C0263f.m1751d(context.getResources(), i2, theme);
    }

    /* renamed from: e */
    private static Drawable m10708e(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            context = new C0844d(context, theme);
        }
        return C0833a.m5262d(context, i2);
    }
}
