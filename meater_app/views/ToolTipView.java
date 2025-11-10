package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import b6.y8;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ToolTipView extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public y8 f10442q;

    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10443a;

        static {
            int[] iArr = new int[b.values().length];
            f10443a = iArr;
            try {
                iArr[b.ACTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10443a[b.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum b {
        ACTION,
        INFO
    }

    public ToolTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, context);
    }

    private void a(AttributeSet attributeSet, Context context) {
        int i10;
        if (isInEditMode()) {
            return;
        }
        if (attributeSet != null) {
            this.f10442q = (y8) androidx.databinding.g.h(LayoutInflater.from(context), 2131558403, this, true);
            boolean z10 = context.getTheme().obtainStyledAttributes(attributeSet, o5.c0.f15914j, 0, 0).getBoolean(0, false);
            try {
                LinearLayout linearLayout = this.f10442q.X;
                if (z10) {
                    i10 = 2131231373;
                } else {
                    i10 = 2131231372;
                }
                linearLayout.setBackgroundResource(i10);
                return;
            } catch (Exception e10) {
                Toast.makeText(context, "Sorry! Rendering failed. " + e10.getLocalizedMessage(), 1).show();
                return;
            }
        }
        throw new IllegalArgumentException("Attributes should be provided to this view,");
    }

    public void b(String str, String str2, b bVar, View.OnClickListener onClickListener) {
        this.f10442q.Y.setText(str);
        this.f10442q.V.setVisibility(8);
        this.f10442q.W.setVisibility(8);
        if (str2 != null) {
            int i10 = a.f10443a[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f10442q.U.setText(str2);
                    this.f10442q.V.setOnClickListener(onClickListener);
                    this.f10442q.V.setVisibility(0);
                    return;
                }
                return;
            }
            this.f10442q.W.setText(str2);
            this.f10442q.W.setOnClickListener(onClickListener);
            this.f10442q.W.setVisibility(0);
        }
    }
}
