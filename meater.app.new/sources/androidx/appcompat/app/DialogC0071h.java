package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0293e;
import p024c.p025a.C0823a;
import p024c.p025a.p032o.AbstractC0842b;

/* compiled from: AppCompatDialog.java */
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
public class DialogC0071h extends Dialog implements InterfaceC0068e {

    /* renamed from: f */
    private AbstractC0069f f368f;

    /* renamed from: g */
    private final C0293e.a f369g;

    /* compiled from: AppCompatDialog.java */
    /* renamed from: androidx.appcompat.app.h$a */
    class a implements C0293e.a {
        a() {
        }

        @Override // androidx.core.view.C0293e.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return DialogC0071h.this.m389c(keyEvent);
        }
    }

    public DialogC0071h(Context context, int i2) {
        super(context, m387b(context, i2));
        this.f369g = new a();
        AbstractC0069f abstractC0069fM388a = m388a();
        abstractC0069fM388a.mo280I(m387b(context, i2));
        abstractC0069fM388a.mo295t(null);
    }

    /* renamed from: b */
    private static int m387b(Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0823a.f5052z, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public AbstractC0069f m388a() {
        if (this.f368f == null) {
            this.f368f = AbstractC0069f.m273j(this, this);
        }
        return this.f368f;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m388a().mo283d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m389c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean m390d(int i2) {
        return m388a().mo275C(i2);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m388a().mo296u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0293e.m2038e(this.f369g, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) m388a().mo287k(i2);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m388a().mo293r();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m388a().mo292q();
        super.onCreate(bundle);
        m388a().mo295t(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m388a().mo301z();
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public void onSupportActionModeFinished(AbstractC0842b abstractC0842b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public void onSupportActionModeStarted(AbstractC0842b abstractC0842b) {
    }

    @Override // androidx.appcompat.app.InterfaceC0068e
    public AbstractC0842b onWindowStartingSupportActionMode(AbstractC0842b.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        m388a().mo276D(i2);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m388a().mo281J(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m388a().mo277E(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m388a().mo278F(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        m388a().mo281J(getContext().getString(i2));
    }
}
