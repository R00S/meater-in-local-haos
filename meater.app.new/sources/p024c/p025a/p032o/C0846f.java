package p024c.p025a.p032o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC0095o;
import androidx.appcompat.view.menu.MenuItemC0090j;
import java.util.ArrayList;
import p024c.p025a.p032o.AbstractC0842b;
import p024c.p041e.C0873g;
import p024c.p052i.p054f.p055a.InterfaceMenuC0934a;
import p024c.p052i.p054f.p055a.InterfaceMenuItemC0935b;

/* compiled from: SupportActionModeWrapper.java */
/* renamed from: c.a.o.f */
/* loaded from: classes.dex */
public class C0846f extends ActionMode {

    /* renamed from: a */
    final Context f5570a;

    /* renamed from: b */
    final AbstractC0842b f5571b;

    /* compiled from: SupportActionModeWrapper.java */
    /* renamed from: c.a.o.f$a */
    public static class a implements AbstractC0842b.a {

        /* renamed from: a */
        final ActionMode.Callback f5572a;

        /* renamed from: b */
        final Context f5573b;

        /* renamed from: c */
        final ArrayList<C0846f> f5574c = new ArrayList<>();

        /* renamed from: d */
        final C0873g<Menu, Menu> f5575d = new C0873g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f5573b = context;
            this.f5572a = callback;
        }

        /* renamed from: f */
        private Menu m5347f(Menu menu) {
            Menu menu2 = this.f5575d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC0095o menuC0095o = new MenuC0095o(this.f5573b, (InterfaceMenuC0934a) menu);
            this.f5575d.put(menu, menuC0095o);
            return menuC0095o;
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: a */
        public void mo368a(AbstractC0842b abstractC0842b) {
            this.f5572a.onDestroyActionMode(m5348e(abstractC0842b));
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: b */
        public boolean mo369b(AbstractC0842b abstractC0842b, Menu menu) {
            return this.f5572a.onCreateActionMode(m5348e(abstractC0842b), m5347f(menu));
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: c */
        public boolean mo370c(AbstractC0842b abstractC0842b, Menu menu) {
            return this.f5572a.onPrepareActionMode(m5348e(abstractC0842b), m5347f(menu));
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: d */
        public boolean mo371d(AbstractC0842b abstractC0842b, MenuItem menuItem) {
            return this.f5572a.onActionItemClicked(m5348e(abstractC0842b), new MenuItemC0090j(this.f5573b, (InterfaceMenuItemC0935b) menuItem));
        }

        /* renamed from: e */
        public ActionMode m5348e(AbstractC0842b abstractC0842b) {
            int size = this.f5574c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0846f c0846f = this.f5574c.get(i2);
                if (c0846f != null && c0846f.f5571b == abstractC0842b) {
                    return c0846f;
                }
            }
            C0846f c0846f2 = new C0846f(this.f5573b, abstractC0842b);
            this.f5574c.add(c0846f2);
            return c0846f2;
        }
    }

    public C0846f(Context context, AbstractC0842b abstractC0842b) {
        this.f5570a = context;
        this.f5571b = abstractC0842b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f5571b.mo452c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f5571b.mo453d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC0095o(this.f5570a, (InterfaceMenuC0934a) this.f5571b.mo454e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f5571b.mo455f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f5571b.mo456g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f5571b.m5339h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f5571b.mo457i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f5571b.m5340j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f5571b.mo458k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f5571b.mo459l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f5571b.mo460m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f5571b.mo462o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f5571b.m5341p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f5571b.mo464r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f5571b.mo465s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f5571b.mo461n(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f5571b.mo463q(i2);
    }
}
