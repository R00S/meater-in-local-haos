package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class e extends b implements e.a {

    /* renamed from: D, reason: collision with root package name */
    private Context f20852D;

    /* renamed from: E, reason: collision with root package name */
    private ActionBarContextView f20853E;

    /* renamed from: F, reason: collision with root package name */
    private b.a f20854F;

    /* renamed from: G, reason: collision with root package name */
    private WeakReference<View> f20855G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f20856H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f20857I;

    /* renamed from: J, reason: collision with root package name */
    private androidx.appcompat.view.menu.e f20858J;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f20852D = context;
        this.f20853E = actionBarContextView;
        this.f20854F = aVar;
        androidx.appcompat.view.menu.e eVarX = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).X(1);
        this.f20858J = eVarX;
        eVarX.W(this);
        this.f20857I = z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f20854F.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f20853E.l();
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f20856H) {
            return;
        }
        this.f20856H = true;
        this.f20854F.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f20855G;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f20858J;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f20853E.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f20853E.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f20853E.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f20854F.c(this, this.f20858J);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f20853E.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f20853E.setCustomView(view);
        this.f20855G = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f20852D.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f20853E.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f20852D.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f20853E.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f20853E.setTitleOptional(z10);
    }
}
