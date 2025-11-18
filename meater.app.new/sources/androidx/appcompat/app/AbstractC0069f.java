package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p024c.p025a.p032o.AbstractC0842b;
import p024c.p041e.C0868b;

/* compiled from: AppCompatDelegate.java */
/* renamed from: androidx.appcompat.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0069f {

    /* renamed from: f */
    private static int f268f = -100;

    /* renamed from: g */
    private static final C0868b<WeakReference<AbstractC0069f>> f269g = new C0868b<>();

    /* renamed from: h */
    private static final Object f270h = new Object();

    AbstractC0069f() {
    }

    /* renamed from: A */
    static void m267A(AbstractC0069f abstractC0069f) {
        synchronized (f270h) {
            m268B(abstractC0069f);
        }
    }

    /* renamed from: B */
    private static void m268B(AbstractC0069f abstractC0069f) {
        synchronized (f270h) {
            Iterator<WeakReference<AbstractC0069f>> it = f269g.iterator();
            while (it.hasNext()) {
                AbstractC0069f abstractC0069f2 = it.next().get();
                if (abstractC0069f2 == abstractC0069f || abstractC0069f2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: G */
    public static void m269G(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f268f != i2) {
            f268f = i2;
            m271f();
        }
    }

    /* renamed from: c */
    static void m270c(AbstractC0069f abstractC0069f) {
        synchronized (f270h) {
            m268B(abstractC0069f);
            f269g.add(new WeakReference<>(abstractC0069f));
        }
    }

    /* renamed from: f */
    private static void m271f() {
        synchronized (f270h) {
            Iterator<WeakReference<AbstractC0069f>> it = f269g.iterator();
            while (it.hasNext()) {
                AbstractC0069f abstractC0069f = it.next().get();
                if (abstractC0069f != null) {
                    abstractC0069f.mo284e();
                }
            }
        }
    }

    /* renamed from: i */
    public static AbstractC0069f m272i(Activity activity, InterfaceC0068e interfaceC0068e) {
        return new LayoutInflaterFactory2C0070g(activity, interfaceC0068e);
    }

    /* renamed from: j */
    public static AbstractC0069f m273j(Dialog dialog, InterfaceC0068e interfaceC0068e) {
        return new LayoutInflaterFactory2C0070g(dialog, interfaceC0068e);
    }

    /* renamed from: l */
    public static int m274l() {
        return f268f;
    }

    /* renamed from: C */
    public abstract boolean mo275C(int i2);

    /* renamed from: D */
    public abstract void mo276D(int i2);

    /* renamed from: E */
    public abstract void mo277E(View view);

    /* renamed from: F */
    public abstract void mo278F(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: H */
    public abstract void mo279H(Toolbar toolbar);

    /* renamed from: I */
    public void mo280I(int i2) {
    }

    /* renamed from: J */
    public abstract void mo281J(CharSequence charSequence);

    /* renamed from: K */
    public abstract AbstractC0842b mo282K(AbstractC0842b.a aVar);

    /* renamed from: d */
    public abstract void mo283d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public abstract boolean mo284e();

    @Deprecated
    /* renamed from: g */
    public void m285g(Context context) {
    }

    /* renamed from: h */
    public Context mo286h(Context context) {
        m285g(context);
        return context;
    }

    /* renamed from: k */
    public abstract <T extends View> T mo287k(int i2);

    /* renamed from: m */
    public abstract InterfaceC0065b mo288m();

    /* renamed from: n */
    public int mo289n() {
        return -100;
    }

    /* renamed from: o */
    public abstract MenuInflater mo290o();

    /* renamed from: p */
    public abstract AbstractC0064a mo291p();

    /* renamed from: q */
    public abstract void mo292q();

    /* renamed from: r */
    public abstract void mo293r();

    /* renamed from: s */
    public abstract void mo294s(Configuration configuration);

    /* renamed from: t */
    public abstract void mo295t(Bundle bundle);

    /* renamed from: u */
    public abstract void mo296u();

    /* renamed from: v */
    public abstract void mo297v(Bundle bundle);

    /* renamed from: w */
    public abstract void mo298w();

    /* renamed from: x */
    public abstract void mo299x(Bundle bundle);

    /* renamed from: y */
    public abstract void mo300y();

    /* renamed from: z */
    public abstract void mo301z();
}
