package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p024c.p044g.p048b.p049k.C0892e;

/* compiled from: Placeholder.java */
/* renamed from: androidx.constraintlayout.widget.g */
/* loaded from: classes.dex */
public class C0219g extends View {

    /* renamed from: f */
    private int f1648f;

    /* renamed from: g */
    private View f1649g;

    /* renamed from: h */
    private int f1650h;

    /* renamed from: a */
    public void m1393a(ConstraintLayout constraintLayout) {
        if (this.f1649g == null) {
            return;
        }
        ConstraintLayout.C0211b c0211b = (ConstraintLayout.C0211b) getLayoutParams();
        ConstraintLayout.C0211b c0211b2 = (ConstraintLayout.C0211b) this.f1649g.getLayoutParams();
        c0211b2.f1470n0.m5691T0(0);
        C0892e.b bVarM5742y = c0211b.f1470n0.m5742y();
        C0892e.b bVar = C0892e.b.FIXED;
        if (bVarM5742y != bVar) {
            c0211b.f1470n0.m5693U0(c0211b2.f1470n0.m5686R());
        }
        if (c0211b.f1470n0.m5680O() != bVar) {
            c0211b.f1470n0.m5737v0(c0211b2.f1470n0.m5736v());
        }
        c0211b2.f1470n0.m5691T0(8);
    }

    /* renamed from: b */
    public void m1394b(ConstraintLayout constraintLayout) {
        if (this.f1648f == -1 && !isInEditMode()) {
            setVisibility(this.f1650h);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1648f);
        this.f1649g = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.C0211b) viewFindViewById.getLayoutParams()).f1446b0 = true;
            this.f1649g.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1649g;
    }

    public int getEmptyVisibility() {
        return this.f1650h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i2) {
        View viewFindViewById;
        if (this.f1648f == i2) {
            return;
        }
        View view = this.f1649g;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0211b) this.f1649g.getLayoutParams()).f1446b0 = false;
            this.f1649g = null;
        }
        this.f1648f = i2;
        if (i2 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i2)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i2) {
        this.f1650h = i2;
    }
}
