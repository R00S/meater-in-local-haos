package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzazs {

    /* renamed from: a */
    private final View f22728a;

    /* renamed from: b */
    private Activity f22729b;

    /* renamed from: c */
    private boolean f22730c;

    /* renamed from: d */
    private boolean f22731d;

    /* renamed from: e */
    private boolean f22732e;

    /* renamed from: f */
    private ViewTreeObserver.OnGlobalLayoutListener f22733f;

    /* renamed from: g */
    private ViewTreeObserver.OnScrollChangedListener f22734g = null;

    public zzazs(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f22729b = activity;
        this.f22728a = view;
        this.f22733f = onGlobalLayoutListener;
    }

    /* renamed from: d */
    private static ViewTreeObserver m17292d(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    /* renamed from: g */
    private final void m17293g() {
        ViewTreeObserver viewTreeObserverM17292d;
        if (this.f22730c) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22733f;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.f22729b;
            if (activity != null && (viewTreeObserverM17292d = m17292d(activity)) != null) {
                viewTreeObserverM17292d.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            zzk.zzmd();
            zzbbz.m17392a(this.f22728a, this.f22733f);
        }
        this.f22730c = true;
    }

    /* renamed from: h */
    private final void m17294h() {
        ViewTreeObserver viewTreeObserverM17292d;
        Activity activity = this.f22729b;
        if (activity != null && this.f22730c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f22733f;
            if (onGlobalLayoutListener != null && (viewTreeObserverM17292d = m17292d(activity)) != null) {
                zzk.zzli().mo17198i(viewTreeObserverM17292d, onGlobalLayoutListener);
            }
            this.f22730c = false;
        }
    }

    /* renamed from: a */
    public final void m17295a() {
        this.f22731d = true;
        if (this.f22732e) {
            m17293g();
        }
    }

    /* renamed from: b */
    public final void m17296b() {
        this.f22731d = false;
        m17294h();
    }

    /* renamed from: c */
    public final void m17297c(Activity activity) {
        this.f22729b = activity;
    }

    /* renamed from: e */
    public final void m17298e() {
        this.f22732e = true;
        if (this.f22731d) {
            m17293g();
        }
    }

    /* renamed from: f */
    public final void m17299f() {
        this.f22732e = false;
        m17294h();
    }
}
