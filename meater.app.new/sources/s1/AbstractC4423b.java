package s1;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider.java */
/* renamed from: s1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4423b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f49113a;

    /* renamed from: b, reason: collision with root package name */
    private a f49114b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0688b f49115c;

    /* compiled from: ActionProvider.java */
    /* renamed from: s1.b$a */
    public interface a {
    }

    /* compiled from: ActionProvider.java */
    /* renamed from: s1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0688b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC4423b(Context context) {
        this.f49113a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f49115c = null;
        this.f49114b = null;
    }

    public void i(a aVar) {
        this.f49114b = aVar;
    }

    public void j(InterfaceC0688b interfaceC0688b) {
        if (this.f49115c != null && interfaceC0688b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f49115c = interfaceC0688b;
    }

    public void f(SubMenu subMenu) {
    }
}
