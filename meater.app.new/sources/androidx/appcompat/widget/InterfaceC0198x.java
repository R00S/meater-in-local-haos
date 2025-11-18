package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.core.view.C0315y;

/* compiled from: DecorToolbar.java */
/* renamed from: androidx.appcompat.widget.x */
/* loaded from: classes.dex */
public interface InterfaceC0198x {
    /* renamed from: a */
    void mo1124a(Menu menu, InterfaceC0093m.a aVar);

    /* renamed from: b */
    boolean mo1125b();

    /* renamed from: c */
    void mo1126c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo1127d();

    /* renamed from: e */
    boolean mo1128e();

    /* renamed from: f */
    boolean mo1129f();

    /* renamed from: g */
    boolean mo1130g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo1131h();

    /* renamed from: i */
    void mo1132i(C0171j0 c0171j0);

    /* renamed from: j */
    boolean mo1133j();

    /* renamed from: k */
    void mo1134k(int i2);

    /* renamed from: l */
    Menu mo1135l();

    /* renamed from: m */
    void mo1136m(int i2);

    /* renamed from: n */
    int mo1137n();

    /* renamed from: o */
    C0315y mo1138o(int i2, long j2);

    /* renamed from: p */
    void mo1139p(InterfaceC0093m.a aVar, C0087g.a aVar2);

    /* renamed from: q */
    void mo1140q(int i2);

    /* renamed from: r */
    ViewGroup mo1141r();

    /* renamed from: s */
    void mo1142s(boolean z);

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    int mo1143t();

    /* renamed from: u */
    void mo1144u();

    /* renamed from: v */
    void mo1145v();

    /* renamed from: w */
    void mo1146w(boolean z);
}
