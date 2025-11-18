package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.C2098e0;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g0;
import d.N;
import f.InterfaceC3299b;
import f1.C3309b;
import f1.z;
import t3.C4547d;
import t3.C4550g;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.o implements d, z.a {

    /* renamed from: c0, reason: collision with root package name */
    private f f20642c0;

    /* renamed from: d0, reason: collision with root package name */
    private Resources f20643d0;

    /* compiled from: AppCompatActivity.java */
    class a implements C4547d.c {
        a() {
        }

        @Override // t3.C4547d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.G0().D(bundle);
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    class b implements InterfaceC3299b {
        b() {
        }

        @Override // f.InterfaceC3299b
        public void a(Context context) {
            f fVarG0 = c.this.G0();
            fVarG0.u();
            fVarG0.z(c.this.B().b("androidx:appcompat"));
        }
    }

    public c() {
        I0();
    }

    private void I0() {
        B().h("androidx:appcompat", new a());
        g0(new b());
    }

    private void J0() {
        View.b(getWindow().getDecorView(), this);
        C2098e0.b(getWindow().getDecorView(), this);
        C4550g.b(getWindow().getDecorView(), this);
        N.a(getWindow().getDecorView(), this);
    }

    private boolean Q0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b A(b.a aVar) {
        return null;
    }

    public f G0() {
        if (this.f20642c0 == null) {
            this.f20642c0 = f.j(this, this);
        }
        return this.f20642c0;
    }

    public androidx.appcompat.app.a H0() {
        return G0().t();
    }

    public void K0(z zVar) {
        zVar.h(this);
    }

    public boolean P0() {
        Intent intentT = t();
        if (intentT == null) {
            return false;
        }
        if (!T0(intentT)) {
            S0(intentT);
            return true;
        }
        z zVarJ = z.j(this);
        K0(zVarJ);
        N0(zVarJ);
        zVarJ.r();
        try {
            C3309b.q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void R0(Toolbar toolbar) {
        G0().O(toolbar);
    }

    public void S0(Intent intent) {
        f1.k.e(this, intent);
    }

    public boolean T0(Intent intent) {
        return f1.k.f(this, intent);
    }

    @Override // d.ActivityC3006j, android.app.Activity
    public void addContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        G0().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(G0().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarH0 = H0();
        if (getWindow().hasFeature(0)) {
            if (aVarH0 == null || !aVarH0.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // f1.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarH0 = H0();
        if (keyCode == 82 && aVarH0 != null && aVarH0.r(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int i10) {
        return (T) G0().l(i10);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return G0().r();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f20643d0 == null && g0.c()) {
            this.f20643d0 = new g0(this, super.getResources());
        }
        Resources resources = this.f20643d0;
        return resources == null ? super.getResources() : resources;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        G0().v();
    }

    @Override // d.ActivityC3006j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G0().y(configuration);
        if (this.f20643d0 != null) {
            this.f20643d0.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        O0();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        G0().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Q0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.o, d.ActivityC3006j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarH0 = H0();
        if (menuItem.getItemId() != 16908332 || aVarH0 == null || (aVarH0.k() & 4) == 0) {
            return false;
        }
        return P0();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // d.ActivityC3006j, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        G0().B(bundle);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        G0().C();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onStart() {
        super.onStart();
        G0().E();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    protected void onStop() {
        super.onStop();
        G0().F();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        G0().Q(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarH0 = H0();
        if (getWindow().hasFeature(0)) {
            if (aVarH0 == null || !aVarH0.s()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // d.ActivityC3006j, android.app.Activity
    public void setContentView(int i10) {
        J0();
        G0().J(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        G0().P(i10);
    }

    @Override // f1.z.a
    public Intent t() {
        return f1.k.a(this);
    }

    @Override // d.ActivityC3006j, android.app.Activity
    public void setContentView(android.view.View view) {
        J0();
        G0().K(view);
    }

    @Override // d.ActivityC3006j, android.app.Activity
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        J0();
        G0().L(view, layoutParams);
    }

    @Deprecated
    public void O0() {
    }

    protected void L0(n1.j jVar) {
    }

    protected void M0(int i10) {
    }

    public void N0(z zVar) {
    }

    @Override // androidx.appcompat.app.d
    public void h(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void i(androidx.appcompat.view.b bVar) {
    }
}
