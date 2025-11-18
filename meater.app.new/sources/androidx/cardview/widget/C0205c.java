package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0209g;

/* compiled from: CardViewBaseImpl.java */
/* renamed from: androidx.cardview.widget.c */
/* loaded from: classes.dex */
class C0205c implements InterfaceC0207e {

    /* renamed from: a */
    final RectF f1359a = new RectF();

    /* compiled from: CardViewBaseImpl.java */
    /* renamed from: androidx.cardview.widget.c$a */
    class a implements C0209g.a {
        a() {
        }

        @Override // androidx.cardview.widget.C0209g.a
        /* renamed from: a */
        public void mo1263a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float fWidth = (rectF.width() - f3) - 1.0f;
            float fHeight = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                C0205c.this.f1359a.set(f5, f5, f4, f4);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(C0205c.this.f1359a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0205c.this.f1359a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0205c.this.f1359a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0205c.this.f1359a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f6 = (rectF.left + f4) - 1.0f;
                float f7 = rectF.top;
                canvas.drawRect(f6, f7, (rectF.right - f4) + 1.0f, f7 + f4, paint);
                float f8 = (rectF.left + f4) - 1.0f;
                float f9 = rectF.bottom;
                canvas.drawRect(f8, f9 - f4, (rectF.right - f4) + 1.0f, f9, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    C0205c() {
    }

    /* renamed from: p */
    private C0209g m1279p(Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        return new C0209g(context.getResources(), colorStateList, f2, f3, f4);
    }

    /* renamed from: q */
    private C0209g m1280q(InterfaceC0206d interfaceC0206d) {
        return (C0209g) interfaceC0206d.mo1260f();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: a */
    public void mo1265a(InterfaceC0206d interfaceC0206d, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        C0209g c0209gM1279p = m1279p(context, colorStateList, f2, f3, f4);
        c0209gM1279p.m1305m(interfaceC0206d.mo1258d());
        interfaceC0206d.mo1257c(c0209gM1279p);
        mo1273i(interfaceC0206d);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: b */
    public void mo1266b(InterfaceC0206d interfaceC0206d, float f2) {
        m1280q(interfaceC0206d).m1307p(f2);
        mo1273i(interfaceC0206d);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: c */
    public float mo1267c(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1304l();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: d */
    public float mo1268d(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1299g();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: e */
    public void mo1269e(InterfaceC0206d interfaceC0206d) {
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: f */
    public void mo1270f(InterfaceC0206d interfaceC0206d, float f2) {
        m1280q(interfaceC0206d).m1309r(f2);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: g */
    public float mo1271g(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1301i();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: h */
    public ColorStateList mo1272h(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1298f();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: i */
    public void mo1273i(InterfaceC0206d interfaceC0206d) {
        Rect rect = new Rect();
        m1280q(interfaceC0206d).m1300h(rect);
        interfaceC0206d.mo1256b((int) Math.ceil(mo1275l(interfaceC0206d)), (int) Math.ceil(mo1274k(interfaceC0206d)));
        interfaceC0206d.mo1255a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: j */
    public void mo1262j() {
        C0209g.f1373b = new a();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: k */
    public float mo1274k(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1302j();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: l */
    public float mo1275l(InterfaceC0206d interfaceC0206d) {
        return m1280q(interfaceC0206d).m1303k();
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: m */
    public void mo1276m(InterfaceC0206d interfaceC0206d) {
        m1280q(interfaceC0206d).m1305m(interfaceC0206d.mo1258d());
        mo1273i(interfaceC0206d);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: n */
    public void mo1277n(InterfaceC0206d interfaceC0206d, ColorStateList colorStateList) {
        m1280q(interfaceC0206d).m1306o(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0207e
    /* renamed from: o */
    public void mo1278o(InterfaceC0206d interfaceC0206d, float f2) {
        m1280q(interfaceC0206d).m1308q(f2);
        mo1273i(interfaceC0206d);
    }
}
