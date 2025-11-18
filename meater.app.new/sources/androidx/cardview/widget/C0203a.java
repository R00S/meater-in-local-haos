package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0209g;

/* compiled from: CardViewApi17Impl.java */
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
class C0203a extends C0205c {

    /* compiled from: CardViewApi17Impl.java */
    /* renamed from: androidx.cardview.widget.a$a */
    class a implements C0209g.a {
        a() {
        }

        @Override // androidx.cardview.widget.C0209g.a
        /* renamed from: a */
        public void mo1263a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    C0203a() {
    }

    @Override // androidx.cardview.widget.C0205c, androidx.cardview.widget.InterfaceC0207e
    /* renamed from: j */
    public void mo1262j() {
        C0209g.f1373b = new a();
    }
}
