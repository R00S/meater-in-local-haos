package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import java.util.ArrayList;
import l1.InterfaceMenuC3893a;
import n.MenuC4049d;
import n.MenuItemC4048c;
import s.X;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f20859a;

    /* renamed from: b, reason: collision with root package name */
    final b f20860b;

    /* compiled from: SupportActionModeWrapper.java */
    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f20861a;

        /* renamed from: b, reason: collision with root package name */
        final Context f20862b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f20863c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final X<Menu, Menu> f20864d = new X<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f20862b = context;
            this.f20861a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f20864d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC4049d menuC4049d = new MenuC4049d(this.f20862b, (InterfaceMenuC3893a) menu);
            this.f20864d.put(menu, menuC4049d);
            return menuC4049d;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f20861a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f20861a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f20861a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, MenuItem menuItem) {
            return this.f20861a.onActionItemClicked(e(bVar), new MenuItemC4048c(this.f20862b, (l1.b) menuItem));
        }

        public ActionMode e(b bVar) {
            int size = this.f20863c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f20863c.get(i10);
                if (fVar != null && fVar.f20860b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f20862b, bVar);
            this.f20863c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f20859a = context;
        this.f20860b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f20860b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f20860b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC4049d(this.f20859a, (InterfaceMenuC3893a) this.f20860b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f20860b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f20860b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f20860b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f20860b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f20860b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f20860b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f20860b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f20860b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f20860b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f20860b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f20860b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f20860b.s(z10);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f20860b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f20860b.q(i10);
    }
}
