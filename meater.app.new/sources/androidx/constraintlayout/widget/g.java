package androidx.constraintlayout.widget;

import a1.e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public class g extends View {

    /* renamed from: B, reason: collision with root package name */
    private int f24221B;

    /* renamed from: C, reason: collision with root package name */
    private View f24222C;

    /* renamed from: D, reason: collision with root package name */
    private int f24223D;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f24222C == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f24222C.getLayoutParams();
        bVar2.f24015v0.k1(0);
        e.b bVarA = bVar.f24015v0.A();
        e.b bVar3 = e.b.FIXED;
        if (bVarA != bVar3) {
            bVar.f24015v0.l1(bVar2.f24015v0.W());
        }
        if (bVar.f24015v0.T() != bVar3) {
            bVar.f24015v0.M0(bVar2.f24015v0.x());
        }
        bVar2.f24015v0.k1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f24221B == -1 && !isInEditMode()) {
            setVisibility(this.f24223D);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f24221B);
        this.f24222C = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f23991j0 = true;
            this.f24222C.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f24222C;
    }

    public int getEmptyVisibility() {
        return this.f24223D;
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

    public void setContentId(int i10) {
        View viewFindViewById;
        if (this.f24221B == i10) {
            return;
        }
        View view = this.f24222C;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f24222C.getLayoutParams()).f23991j0 = false;
            this.f24222C = null;
        }
        this.f24221B = i10;
        if (i10 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i10)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i10) {
        this.f24223D = i10;
    }
}
