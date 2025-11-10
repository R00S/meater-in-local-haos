package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ArrowView extends View {

    /* renamed from: q, reason: collision with root package name */
    private int f10187q;

    /* renamed from: r, reason: collision with root package name */
    private int f10188r;

    /* renamed from: s, reason: collision with root package name */
    private int f10189s;

    /* renamed from: t, reason: collision with root package name */
    private int f10190t;

    /* renamed from: u, reason: collision with root package name */
    private b f10191u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f10192v;

    /* loaded from: /tmp/meat/meat/classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10193a;

        static {
            int[] iArr = new int[b.values().length];
            f10193a = iArr;
            try {
                iArr[b.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10193a[b.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    enum b {
        HORIZONTAL,
        VERTICAL
    }

    public ArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10187q = 36;
        this.f10188r = 30;
        this.f10189s = -1;
        this.f10190t = 0;
        this.f10191u = b.VERTICAL;
    }

    private void a() {
        if (this.f10192v == null) {
            this.f10192v = getResources().getDrawable(2131231336, null);
        }
    }

    public void b(int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (com.apptionlabs.meater_app.app.a.f()) {
            i13 = 34;
        } else {
            i13 = 64;
        }
        this.f10187q = i13;
        if (com.apptionlabs.meater_app.app.a.f()) {
            i14 = 28;
        } else {
            i14 = 54;
        }
        this.f10188r = i14;
        this.f10191u = b.HORIZONTAL;
        this.f10190t = i12 - i11;
        if (i10 >= i11 && i10 <= i12) {
            i15 = i10 - i11;
        } else {
            i15 = -1;
        }
        this.f10189s = i15;
        this.f10192v = getResources().getDrawable(2131231337, null);
    }

    public void c(int i10, int i11, int i12) {
        int i13;
        this.f10187q = 36;
        this.f10188r = 30;
        this.f10191u = b.VERTICAL;
        this.f10190t = i12 - i11;
        if (i10 >= i11 && i10 <= i12) {
            i13 = i10 - i11;
        } else {
            i13 = -1;
        }
        this.f10189s = i13;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        int i11;
        super.onDraw(canvas);
        int i12 = this.f10189s;
        if (i12 >= 0 && i12 <= this.f10190t) {
            a();
            int height = getHeight() - this.f10188r;
            int width = getWidth() - this.f10187q;
            int width2 = (getWidth() - this.f10187q) / 2;
            int height2 = (getHeight() - this.f10188r) / 2;
            int i13 = a.f10193a[this.f10191u.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = this.f10190t;
                    if (i14 > 0) {
                        i11 = (width * this.f10189s) / i14;
                    } else {
                        i11 = width / 2;
                    }
                    width2 = i11;
                }
            } else {
                int i15 = this.f10190t;
                if (i15 > 0) {
                    i10 = (height * this.f10189s) / i15;
                } else {
                    i10 = height / 2;
                }
                height2 = i10;
            }
            this.f10192v.setBounds(width2, height2, this.f10187q + width2, this.f10188r + height2);
            this.f10192v.draw(canvas);
        }
    }
}
