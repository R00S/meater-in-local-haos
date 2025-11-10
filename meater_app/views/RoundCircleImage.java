package com.apptionlabs.meater_app.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import b6.j9;

/* loaded from: /tmp/meat/meat/classes.dex */
public class RoundCircleImage extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private b f10400q;

    /* renamed from: r, reason: collision with root package name */
    j9 f10401r;

    /* renamed from: s, reason: collision with root package name */
    int f10402s;

    /* renamed from: t, reason: collision with root package name */
    private int f10403t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class a implements View.OnTouchListener {
        a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        
            if (r2 != 3) goto L13;
         */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
            /*
                r1 = this;
                int r2 = r3.getAction()
                r3 = 1
                if (r2 == 0) goto L2e
                if (r2 == r3) goto Ld
                r0 = 3
                if (r2 == r0) goto L24
                goto L3b
            Ld:
                com.apptionlabs.meater_app.views.RoundCircleImage r2 = com.apptionlabs.meater_app.views.RoundCircleImage.this
                com.apptionlabs.meater_app.views.RoundCircleImage$b r2 = com.apptionlabs.meater_app.views.RoundCircleImage.a(r2)
                if (r2 == 0) goto L24
                com.apptionlabs.meater_app.views.RoundCircleImage r2 = com.apptionlabs.meater_app.views.RoundCircleImage.this
                com.apptionlabs.meater_app.views.RoundCircleImage$b r2 = com.apptionlabs.meater_app.views.RoundCircleImage.a(r2)
                com.apptionlabs.meater_app.views.RoundCircleImage r0 = com.apptionlabs.meater_app.views.RoundCircleImage.this
                int r0 = r0.getItemIndex()
                r2.c(r0)
            L24:
                com.apptionlabs.meater_app.views.RoundCircleImage r2 = com.apptionlabs.meater_app.views.RoundCircleImage.this
                int r0 = r2.getColor()
                com.apptionlabs.meater_app.views.RoundCircleImage.b(r2, r0)
                goto L3b
            L2e:
                com.apptionlabs.meater_app.views.RoundCircleImage r2 = com.apptionlabs.meater_app.views.RoundCircleImage.this
                int r0 = r2.getColor()
                int r0 = r2.c(r0)
                com.apptionlabs.meater_app.views.RoundCircleImage.b(r2, r0)
            L3b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.views.RoundCircleImage.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface b {
        void c(int i10);
    }

    public RoundCircleImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void d(Context context) {
        j9 j9Var = (j9) androidx.databinding.g.h(LayoutInflater.from(context), 2131558721, this, true);
        this.f10401r = j9Var;
        j9Var.Q.setOnTouchListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibleColor(int i10) {
        BlendMode blendMode;
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable background = this.f10401r.Q.getBackground();
            f8.p0.a();
            blendMode = BlendMode.SRC_ATOP;
            background.setColorFilter(f8.o0.a(i10, blendMode));
            return;
        }
        this.f10401r.Q.getBackground().setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
    }

    public int c(int i10) {
        return Color.argb(Color.alpha(i10), Math.min(Math.round(Color.red(i10) * 0.8f), 255), Math.min(Math.round(Color.green(i10) * 0.8f), 255), Math.min(Math.round(Color.blue(i10) * 0.8f), 255));
    }

    public int getColor() {
        return this.f10402s;
    }

    public int getItemIndex() {
        return this.f10403t;
    }

    public void setColor(String str) {
        if (str != null) {
            int parseColor = Color.parseColor(str);
            this.f10402s = parseColor;
            setColor(parseColor);
        }
    }

    public void setIcon(int i10) {
        this.f10401r.R.setImageResource(i10);
    }

    public void setItemIndex(int i10) {
        this.f10403t = i10;
    }

    public void setListener(b bVar) {
        this.f10400q = bVar;
    }

    public void setSize(int i10) {
        this.f10401r.R.getLayoutParams().width = i10;
        this.f10401r.R.getLayoutParams().height = i10;
        this.f10401r.R.requestLayout();
    }

    public void setIcon(String str) {
        f8.q0.f(this.f10401r.R, str);
    }

    public void setColor(int i10) {
        this.f10402s = i10;
        setVisibleColor(i10);
    }
}
