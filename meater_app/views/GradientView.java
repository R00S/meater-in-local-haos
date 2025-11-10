package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: /tmp/meat/meat/classes.dex */
public class GradientView extends View {

    /* renamed from: q, reason: collision with root package name */
    private a f10307q;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum a {
        RECTANGLE,
        OVAL,
        LINE,
        RING
    }

    public GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10307q = a.RECTANGLE;
    }

    public void a(int i10, int i11, boolean z10) {
        GradientDrawable.Orientation orientation;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{i10, i11});
        gradientDrawable.setShape(this.f10307q.ordinal());
        if (z10) {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        gradientDrawable.setOrientation(orientation);
        androidx.core.view.p0.u0(this, gradientDrawable);
    }

    public void b(String str, String str2, boolean z10) {
        a(-1, -1, z10);
        if (str != null && str2 != null) {
            try {
                a(Color.parseColor(str.trim()), Color.parseColor(str2.trim()), z10);
            } catch (Exception unused) {
            }
        }
    }

    public void setShape(a aVar) {
        if (aVar != null) {
            this.f10307q = aVar;
        }
    }
}
