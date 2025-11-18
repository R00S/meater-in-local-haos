package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

@TargetApi(19)
/* loaded from: classes2.dex */
public final class zzced {

    /* renamed from: a */
    private Context f24162a;

    /* renamed from: b */
    private PopupWindow f24163b;

    /* renamed from: c */
    private static PopupWindow m18695c(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        zzbad.m17349e("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void m18696a(Context context, View view) {
        if (!PlatformVersion.m14642f() || PlatformVersion.m14644h()) {
            return;
        }
        PopupWindow popupWindowM18695c = m18695c(context, view);
        this.f24163b = popupWindowM18695c;
        if (popupWindowM18695c == null) {
            context = null;
        }
        this.f24162a = context;
    }

    /* renamed from: b */
    public final void m18697b() {
        Context context = this.f24162a;
        if (context == null || this.f24163b == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            this.f24162a = null;
            this.f24163b = null;
        } else {
            if (this.f24163b.isShowing()) {
                this.f24163b.dismiss();
            }
            this.f24162a = null;
            this.f24163b = null;
        }
    }
}
