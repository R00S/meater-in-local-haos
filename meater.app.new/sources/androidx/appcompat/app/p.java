package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import d.N;
import s1.C4458t;
import t3.C4550g;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class p extends d.r implements d {

    /* renamed from: E, reason: collision with root package name */
    private f f20763E;

    /* renamed from: F, reason: collision with root package name */
    private final C4458t.a f20764F;

    public p(Context context, int i10) {
        super(context, g(context, i10));
        this.f20764F = new C4458t.a() { // from class: androidx.appcompat.app.o
            @Override // s1.C4458t.a
            public final boolean F(KeyEvent keyEvent) {
                return this.f20762B.k(keyEvent);
            }
        };
        f fVarF = f();
        fVarF.P(g(context, i10));
        fVarF.z(null);
    }

    private static int g(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.f42378A, typedValue, true);
        return typedValue.resourceId;
    }

    private void j() {
        View.b(getWindow().getDecorView(), this);
        C4550g.b(getWindow().getDecorView(), this);
        N.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b A(b.a aVar) {
        return null;
    }

    @Override // d.r, android.app.Dialog
    public void addContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        f().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f().A();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C4458t.e(this.f20764F, getWindow().getDecorView(), this, keyEvent);
    }

    public f f() {
        if (this.f20763E == null) {
            this.f20763E = f.k(this, this);
        }
        return this.f20763E;
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int i10) {
        return (T) f().l(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        f().v();
    }

    boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean l(int i10) {
        return f().I(i10);
    }

    @Override // d.r, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        f().u();
        super.onCreate(bundle);
        f().z(bundle);
    }

    @Override // d.r, android.app.Dialog
    protected void onStop() {
        super.onStop();
        f().F();
    }

    @Override // d.r, android.app.Dialog
    public void setContentView(int i10) {
        j();
        f().J(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().Q(charSequence);
    }

    @Override // d.r, android.app.Dialog
    public void setContentView(android.view.View view) {
        j();
        f().K(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        f().Q(getContext().getString(i10));
    }

    @Override // d.r, android.app.Dialog
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        j();
        f().L(view, layoutParams);
    }

    @Override // androidx.appcompat.app.d
    public void h(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void i(androidx.appcompat.view.b bVar) {
    }
}
