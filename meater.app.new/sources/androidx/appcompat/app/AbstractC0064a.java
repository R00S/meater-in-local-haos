package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p024c.p025a.C0832j;
import p024c.p025a.p032o.AbstractC0842b;

/* compiled from: ActionBar.java */
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public abstract class AbstractC0064a {

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$b */
    public interface b {
        /* renamed from: a */
        void m234a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* renamed from: androidx.appcompat.app.a$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract CharSequence m235a();

        /* renamed from: b */
        public abstract View m236b();

        /* renamed from: c */
        public abstract Drawable m237c();

        /* renamed from: d */
        public abstract CharSequence m238d();

        /* renamed from: e */
        public abstract void m239e();
    }

    /* renamed from: f */
    public boolean mo215f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo216g();

    /* renamed from: h */
    public abstract void mo217h(boolean z);

    /* renamed from: i */
    public abstract int mo218i();

    /* renamed from: j */
    public abstract Context mo219j();

    /* renamed from: k */
    public boolean mo220k() {
        return false;
    }

    /* renamed from: l */
    public void mo221l(Configuration configuration) {
    }

    /* renamed from: m */
    void mo222m() {
    }

    /* renamed from: n */
    public abstract boolean mo223n(int i2, KeyEvent keyEvent);

    /* renamed from: o */
    public boolean mo224o(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo225p() {
        return false;
    }

    /* renamed from: q */
    public abstract void mo226q(boolean z);

    /* renamed from: r */
    public abstract void mo227r(boolean z);

    /* renamed from: s */
    public abstract void mo228s(boolean z);

    /* renamed from: t */
    public abstract void mo229t(boolean z);

    /* renamed from: u */
    public abstract void mo230u(boolean z);

    /* renamed from: v */
    public abstract void mo231v(CharSequence charSequence);

    /* renamed from: w */
    public abstract void mo232w(CharSequence charSequence);

    /* renamed from: x */
    public AbstractC0842b mo233x(AbstractC0842b.a aVar) {
        return null;
    }

    /* compiled from: ActionBar.java */
    /* renamed from: androidx.appcompat.app.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f264a;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f264a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5423t);
            this.f264a = typedArrayObtainStyledAttributes.getInt(C0832j.f5428u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f264a = 0;
            this.f264a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f264a = 0;
            this.f264a = aVar.f264a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f264a = 0;
        }
    }
}
