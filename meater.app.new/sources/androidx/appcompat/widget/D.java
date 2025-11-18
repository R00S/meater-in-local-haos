package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import s1.C4434g0;

/* compiled from: DecorToolbar.java */
/* loaded from: classes.dex */
public interface D {
    void a(Menu menu, j.a aVar);

    boolean b();

    void c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    void h();

    View i();

    void j(T t10);

    boolean k();

    void l(int i10);

    Menu m();

    void n(int i10);

    int o();

    C4434g0 p(int i10, long j10);

    void q(j.a aVar, e.a aVar2);

    void r(int i10);

    ViewGroup s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t(boolean z10);

    int u();

    void v(View view);

    void w();

    void x();

    void y(boolean z10);
}
