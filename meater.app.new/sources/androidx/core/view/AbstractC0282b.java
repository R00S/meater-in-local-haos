package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* renamed from: androidx.core.view.b */
/* loaded from: classes.dex */
public abstract class AbstractC0282b {

    /* renamed from: a */
    private final Context f2290a;

    /* renamed from: b */
    private a f2291b;

    /* renamed from: c */
    private b f2292c;

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$a */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: androidx.core.view.b$b */
    public interface b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC0282b(Context context) {
        this.f2290a = context;
    }

    /* renamed from: a */
    public boolean mo635a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo639b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo636c();

    /* renamed from: d */
    public View mo640d(MenuItem menuItem) {
        return mo636c();
    }

    /* renamed from: e */
    public boolean mo637e() {
        return false;
    }

    /* renamed from: f */
    public void mo638f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo641g() {
        return false;
    }

    /* renamed from: h */
    public void m1864h() {
        this.f2292c = null;
        this.f2291b = null;
    }

    /* renamed from: i */
    public void m1865i(a aVar) {
        this.f2291b = aVar;
    }

    /* renamed from: j */
    public void mo642j(b bVar) {
        if (this.f2292c != null && bVar != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2292c = bVar;
    }
}
