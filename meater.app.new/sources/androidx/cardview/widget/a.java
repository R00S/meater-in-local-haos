package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
class a implements c {
    a() {
    }

    private d p(b bVar) {
        return (d) bVar.e();
    }

    @Override // androidx.cardview.widget.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        bVar.b(new d(colorStateList, f10));
        View viewF = bVar.f();
        viewF.setClipToOutline(true);
        viewF.setElevation(f11);
        o(bVar, f12);
    }

    @Override // androidx.cardview.widget.c
    public void b(b bVar, float f10) {
        p(bVar).h(f10);
    }

    @Override // androidx.cardview.widget.c
    public float c(b bVar) {
        return bVar.f().getElevation();
    }

    @Override // androidx.cardview.widget.c
    public float d(b bVar) {
        return p(bVar).d();
    }

    @Override // androidx.cardview.widget.c
    public void e(b bVar) {
        o(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void f(b bVar, float f10) {
        bVar.f().setElevation(f10);
    }

    @Override // androidx.cardview.widget.c
    public float g(b bVar) {
        return p(bVar).c();
    }

    @Override // androidx.cardview.widget.c
    public ColorStateList h(b bVar) {
        return p(bVar).b();
    }

    @Override // androidx.cardview.widget.c
    public void i(b bVar) {
        if (!bVar.d()) {
            bVar.a(0, 0, 0, 0);
            return;
        }
        float fG = g(bVar);
        float fD = d(bVar);
        int iCeil = (int) Math.ceil(e.a(fG, fD, bVar.c()));
        int iCeil2 = (int) Math.ceil(e.b(fG, fD, bVar.c()));
        bVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.c
    public float k(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public float l(b bVar) {
        return d(bVar) * 2.0f;
    }

    @Override // androidx.cardview.widget.c
    public void m(b bVar) {
        o(bVar, g(bVar));
    }

    @Override // androidx.cardview.widget.c
    public void n(b bVar, ColorStateList colorStateList) {
        p(bVar).f(colorStateList);
    }

    @Override // androidx.cardview.widget.c
    public void o(b bVar, float f10) {
        p(bVar).g(f10, bVar.d(), bVar.c());
        i(bVar);
    }

    @Override // androidx.cardview.widget.c
    public void j() {
    }
}
