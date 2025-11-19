package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(boolean z10);

    public abstract void B(float f10);

    public abstract void C(boolean z10);

    public abstract void D(int i10);

    public abstract void E(boolean z10);

    public abstract void F(CharSequence charSequence);

    public abstract void G(CharSequence charSequence);

    public abstract void H();

    public androidx.appcompat.view.b I(b.a aVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z10);

    public abstract View j();

    public abstract int k();

    public abstract Context l();

    public abstract void m();

    public boolean n() {
        return false;
    }

    public abstract boolean q(int i10, KeyEvent keyEvent);

    public boolean r(KeyEvent keyEvent) {
        return false;
    }

    public boolean s() {
        return false;
    }

    public abstract void t(View view);

    public abstract void u(View view, C0299a c0299a);

    public abstract void v(boolean z10);

    public abstract void w(boolean z10);

    public abstract void x(int i10);

    public abstract void y(boolean z10);

    public abstract void z(boolean z10);

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0299a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f20638a;

        public C0299a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20638a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f42779t);
            this.f20638a = typedArrayObtainStyledAttributes.getInt(i.j.f42784u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0299a(int i10, int i11) {
            super(i10, i11);
            this.f20638a = 8388627;
        }

        public C0299a(int i10, int i11, int i12) {
            super(i10, i11);
            this.f20638a = i12;
        }

        public C0299a(C0299a c0299a) {
            super((ViewGroup.MarginLayoutParams) c0299a);
            this.f20638a = 0;
            this.f20638a = c0299a.f20638a;
        }

        public C0299a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20638a = 0;
        }
    }

    void p() {
    }

    public void o(Configuration configuration) {
    }
}
