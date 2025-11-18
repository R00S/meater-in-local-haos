package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.Locale;
import okhttp3.HttpUrl;

@TargetApi(28)
/* loaded from: classes2.dex */
public final class zzaxy extends zzaxx {
    /* renamed from: x */
    static /* synthetic */ WindowInsets m17209x(Activity activity, View view, WindowInsets windowInsets) {
        if (zzk.zzlk().m17061r().mo17106t() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
            if (displayCutout != null) {
                zzaxb zzaxbVarM17061r = zzk.zzlk().m17061r();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = String.valueOf(strConcat).concat("|");
                    }
                    String strValueOf = String.valueOf(strConcat);
                    String strValueOf2 = String.valueOf(str);
                    strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                }
                zzaxbVarM17061r.mo17092f(strConcat);
            } else {
                zzk.zzlk().m17061r().mo17092f(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        }
        m17210y(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: y */
    private static void m17210y(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i2 = attributes.layoutInDisplayCutoutMode;
        int i3 = z ? 1 : 2;
        if (i3 != i2) {
            attributes.layoutInDisplayCutoutMode = i3;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxo
    /* renamed from: r */
    public final void mo17204r(final Activity activity) {
        if (((Boolean) zzyt.m20848e().m16421c(zzacu.f21840o1)).booleanValue() && zzk.zzlk().m17061r().mo17106t() == null && !activity.isInMultiWindowMode()) {
            m17210y(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: com.google.android.gms.internal.ads.l5

                /* renamed from: a */
                private final zzaxy f19749a;

                /* renamed from: b */
                private final Activity f19750b;

                {
                    this.f19749a = this;
                    this.f19750b = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzaxy.m17209x(this.f19750b, view, windowInsets);
                }
            });
        }
    }
}
