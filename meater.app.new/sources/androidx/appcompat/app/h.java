package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbstractC2106m;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.InterfaceC2114v;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.C1987i;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.h0;
import g1.C3377a;
import i1.h;
import j.C3699a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import s.X;
import s1.C4434g0;
import s1.C4438i0;
import s1.C4458t;
import s1.C4460u;
import s1.C4469y0;
import s1.I;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
class h extends androidx.appcompat.app.f implements e.a, LayoutInflater.Factory2 {

    /* renamed from: K0, reason: collision with root package name */
    private static final X<String, Integer> f20662K0 = new X<>();

    /* renamed from: L0, reason: collision with root package name */
    private static final boolean f20663L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    private static final int[] f20664M0 = {R.attr.windowBackground};

    /* renamed from: N0, reason: collision with root package name */
    private static final boolean f20665N0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A0, reason: collision with root package name */
    boolean f20666A0;

    /* renamed from: B0, reason: collision with root package name */
    int f20667B0;

    /* renamed from: C0, reason: collision with root package name */
    private final Runnable f20668C0;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f20669D0;

    /* renamed from: E0, reason: collision with root package name */
    private Rect f20670E0;

    /* renamed from: F0, reason: collision with root package name */
    private Rect f20671F0;

    /* renamed from: G0, reason: collision with root package name */
    private androidx.appcompat.app.r f20672G0;

    /* renamed from: H0, reason: collision with root package name */
    private t f20673H0;

    /* renamed from: I0, reason: collision with root package name */
    private OnBackInvokedDispatcher f20674I0;

    /* renamed from: J0, reason: collision with root package name */
    private OnBackInvokedCallback f20675J0;

    /* renamed from: K, reason: collision with root package name */
    final Object f20676K;

    /* renamed from: L, reason: collision with root package name */
    final Context f20677L;

    /* renamed from: M, reason: collision with root package name */
    Window f20678M;

    /* renamed from: N, reason: collision with root package name */
    private m f20679N;

    /* renamed from: O, reason: collision with root package name */
    final androidx.appcompat.app.d f20680O;

    /* renamed from: P, reason: collision with root package name */
    androidx.appcompat.app.a f20681P;

    /* renamed from: Q, reason: collision with root package name */
    MenuInflater f20682Q;

    /* renamed from: R, reason: collision with root package name */
    private CharSequence f20683R;

    /* renamed from: S, reason: collision with root package name */
    private C f20684S;

    /* renamed from: T, reason: collision with root package name */
    private g f20685T;

    /* renamed from: U, reason: collision with root package name */
    private s f20686U;

    /* renamed from: V, reason: collision with root package name */
    androidx.appcompat.view.b f20687V;

    /* renamed from: W, reason: collision with root package name */
    ActionBarContextView f20688W;

    /* renamed from: X, reason: collision with root package name */
    PopupWindow f20689X;

    /* renamed from: Y, reason: collision with root package name */
    Runnable f20690Y;

    /* renamed from: Z, reason: collision with root package name */
    C4434g0 f20691Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f20692a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f20693b0;

    /* renamed from: c0, reason: collision with root package name */
    ViewGroup f20694c0;

    /* renamed from: d0, reason: collision with root package name */
    private TextView f20695d0;

    /* renamed from: e0, reason: collision with root package name */
    private View f20696e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f20697f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f20698g0;

    /* renamed from: h0, reason: collision with root package name */
    boolean f20699h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f20700i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f20701j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f20702k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f20703l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f20704m0;

    /* renamed from: n0, reason: collision with root package name */
    private r[] f20705n0;

    /* renamed from: o0, reason: collision with root package name */
    private r f20706o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f20707p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f20708q0;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f20709r0;

    /* renamed from: s0, reason: collision with root package name */
    boolean f20710s0;

    /* renamed from: t0, reason: collision with root package name */
    private Configuration f20711t0;

    /* renamed from: u0, reason: collision with root package name */
    private int f20712u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f20713v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f20714w0;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f20715x0;

    /* renamed from: y0, reason: collision with root package name */
    private o f20716y0;

    /* renamed from: z0, reason: collision with root package name */
    private o f20717z0;

    /* compiled from: AppCompatDelegateImpl.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f20667B0 & 1) != 0) {
                hVar.j0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f20667B0 & 4096) != 0) {
                hVar2.j0(108);
            }
            h hVar3 = h.this;
            hVar3.f20666A0 = false;
            hVar3.f20667B0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class b implements I {
        b() {
        }

        @Override // s1.I
        public C4469y0 a(View view, C4469y0 c4469y0) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            int iL = c4469y0.l();
            int iG1 = h.this.g1(c4469y0, null);
            if (iL != iG1) {
                c4469y0 = c4469y0.q(c4469y0.j(), iG1, c4469y0.k(), c4469y0.i());
            }
            return s1.X.Z(view, c4469y0);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class d implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends C4438i0 {
            a() {
            }

            @Override // s1.InterfaceC4436h0
            public void b(View view) {
                h.this.f20688W.setAlpha(1.0f);
                h.this.f20691Z.h(null);
                h.this.f20691Z = null;
            }

            @Override // s1.C4438i0, s1.InterfaceC4436h0
            public void c(View view) {
                h.this.f20688W.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f20689X.showAtLocation(hVar.f20688W, 55, 0, 0);
            h.this.k0();
            if (!h.this.V0()) {
                h.this.f20688W.setAlpha(1.0f);
                h.this.f20688W.setVisibility(0);
            } else {
                h.this.f20688W.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f20691Z = s1.X.e(hVar2.f20688W).b(1.0f);
                h.this.f20691Z.h(new a());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class e extends C4438i0 {
        e() {
        }

        @Override // s1.InterfaceC4436h0
        public void b(View view) {
            h.this.f20688W.setAlpha(1.0f);
            h.this.f20691Z.h(null);
            h.this.f20691Z = null;
        }

        @Override // s1.C4438i0, s1.InterfaceC4436h0
        public void c(View view) {
            h.this.f20688W.setVisibility(0);
            if (h.this.f20688W.getParent() instanceof View) {
                s1.X.k0((View) h.this.f20688W.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    interface f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class g implements j.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            h.this.a0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackW0 = h.this.w0();
            if (callbackW0 == null) {
                return true;
            }
            callbackW0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    class C0300h implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f20725a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.h$h$a */
        class a extends C4438i0 {
            a() {
            }

            @Override // s1.InterfaceC4436h0
            public void b(View view) {
                h.this.f20688W.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f20689X;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f20688W.getParent() instanceof View) {
                    s1.X.k0((View) h.this.f20688W.getParent());
                }
                h.this.f20688W.k();
                h.this.f20691Z.h(null);
                h hVar2 = h.this;
                hVar2.f20691Z = null;
                s1.X.k0(hVar2.f20694c0);
            }
        }

        public C0300h(b.a aVar) {
            this.f20725a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f20725a.a(bVar);
            h hVar = h.this;
            if (hVar.f20689X != null) {
                hVar.f20678M.getDecorView().removeCallbacks(h.this.f20690Y);
            }
            h hVar2 = h.this;
            if (hVar2.f20688W != null) {
                hVar2.k0();
                h hVar3 = h.this;
                hVar3.f20691Z = s1.X.e(hVar3.f20688W).b(0.0f);
                h.this.f20691Z.h(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f20680O;
            if (dVar != null) {
                dVar.i(hVar4.f20687V);
            }
            h hVar5 = h.this;
            hVar5.f20687V = null;
            s1.X.k0(hVar5.f20694c0);
            h.this.e1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f20725a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            s1.X.k0(h.this.f20694c0);
            return this.f20725a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f20725a.d(bVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class i {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static n1.j b(Configuration configuration) {
            return n1.j.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(n1.j jVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(jVar.g()));
        }

        static void d(Configuration configuration, n1.j jVar) {
            configuration.setLocales(LocaleList.forLanguageTags(jVar.g()));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    static class l {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.n
                public final void onBackInvoked() {
                    hVar.E0();
                }
            };
            androidx.appcompat.app.j.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.j.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.i.a(obj2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class m extends androidx.appcompat.view.i {

        /* renamed from: C, reason: collision with root package name */
        private f f20728C;

        /* renamed from: D, reason: collision with root package name */
        private boolean f20729D;

        /* renamed from: E, reason: collision with root package name */
        private boolean f20730E;

        /* renamed from: F, reason: collision with root package name */
        private boolean f20731F;

        m(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f20730E = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f20730E = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f20729D = true;
                callback.onContentChanged();
            } finally {
                this.f20729D = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f20731F = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f20731F = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f20730E ? a().dispatchKeyEvent(keyEvent) : h.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.H0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(f fVar) {
            this.f20728C = fVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f20677L, callback);
            androidx.appcompat.view.b bVarY0 = h.this.Y0(aVar);
            if (bVarY0 != null) {
                return aVar.e(bVarY0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f20729D) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            f fVar = this.f20728C;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.K0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f20731F) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.L0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            f fVar = this.f20728C;
            boolean zOnPreparePanel = fVar != null && fVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            r rVarU0 = h.this.u0(0, true);
            if (rVarU0 == null || (eVar = rVarU0.f20750j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.C0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class n extends o {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f20733c;

        n(Context context) {
            super();
            this.f20733c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return i.a(this.f20733c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.f();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    abstract class o {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f20735a;

        /* compiled from: AppCompatDelegateImpl.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f20735a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f20677L.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f20735a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f20735a == null) {
                this.f20735a = new a();
            }
            h.this.f20677L.registerReceiver(this.f20735a, intentFilterB);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class p extends o {

        /* renamed from: c, reason: collision with root package name */
        private final x f20738c;

        p(x xVar) {
            super();
            this.f20738c = xVar;
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return this.f20738c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.f();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.c0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(C3699a.b(getContext(), i10));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    protected static final class r {

        /* renamed from: a, reason: collision with root package name */
        int f20741a;

        /* renamed from: b, reason: collision with root package name */
        int f20742b;

        /* renamed from: c, reason: collision with root package name */
        int f20743c;

        /* renamed from: d, reason: collision with root package name */
        int f20744d;

        /* renamed from: e, reason: collision with root package name */
        int f20745e;

        /* renamed from: f, reason: collision with root package name */
        int f20746f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f20747g;

        /* renamed from: h, reason: collision with root package name */
        View f20748h;

        /* renamed from: i, reason: collision with root package name */
        View f20749i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f20750j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f20751k;

        /* renamed from: l, reason: collision with root package name */
        Context f20752l;

        /* renamed from: m, reason: collision with root package name */
        boolean f20753m;

        /* renamed from: n, reason: collision with root package name */
        boolean f20754n;

        /* renamed from: o, reason: collision with root package name */
        boolean f20755o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f20756p;

        /* renamed from: q, reason: collision with root package name */
        boolean f20757q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f20758r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f20759s;

        r(int i10) {
            this.f20741a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f20750j == null) {
                return null;
            }
            if (this.f20751k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f20752l, i.g.f42535j);
                this.f20751k = cVar;
                cVar.i(aVar);
                this.f20750j.b(this.f20751k);
            }
            return this.f20751k.b(this.f20747g);
        }

        public boolean b() {
            if (this.f20748h == null) {
                return false;
            }
            return this.f20749i != null || this.f20751k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f20750j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.f20751k);
            }
            this.f20750j = eVar;
            if (eVar == null || (cVar = this.f20751k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(i.a.f42394a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(i.a.f42384G, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(i.i.f42559a, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f20752l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(i.j.f42805y0);
            this.f20742b = typedArrayObtainStyledAttributes.getResourceId(i.j.f42568B0, 0);
            this.f20746f = typedArrayObtainStyledAttributes.getResourceId(i.j.f42563A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z11 = eVarF != eVar;
            h hVar = h.this;
            if (z11) {
                eVar = eVarF;
            }
            r rVarN0 = hVar.n0(eVar);
            if (rVarN0 != null) {
                if (!z11) {
                    h.this.d0(rVarN0, z10);
                } else {
                    h.this.Z(rVarN0.f20741a, rVarN0, eVarF);
                    h.this.d0(rVarN0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackW0;
            if (eVar != eVar.F()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f20699h0 || (callbackW0 = hVar.w0()) == null || h.this.f20710s0) {
                return true;
            }
            callbackW0.onMenuOpened(108, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean A0(r rVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f20677L;
        int i10 = rVar.f20741a;
        if ((i10 == 0 || i10 == 108) && this.f20684S != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(i.a.f42399f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(i.a.f42400g, typedValue, true);
            } else {
                theme.resolveAttribute(i.a.f42400g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        rVar.c(eVar);
        return true;
    }

    private void B0(int i10) {
        this.f20667B0 = (1 << i10) | this.f20667B0;
        if (this.f20666A0) {
            return;
        }
        s1.X.f0(this.f20678M.getDecorView(), this.f20668C0);
        this.f20666A0 = true;
    }

    private boolean G0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r rVarU0 = u0(i10, true);
        if (rVarU0.f20755o) {
            return false;
        }
        return Q0(rVarU0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f20687V
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$r r2 = r4.u0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.C r5 = r4.f20684S
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f20677L
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.C r5 = r4.f20684S
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f20710s0
            if (r5 != 0) goto L62
            boolean r5 = r4.Q0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.C r5 = r4.f20684S
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.C r5 = r4.f20684S
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f20755o
            if (r5 != 0) goto L64
            boolean r3 = r2.f20754n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f20753m
            if (r5 == 0) goto L62
            boolean r5 = r2.f20758r
            if (r5 == 0) goto L5b
            r2.f20753m = r1
            boolean r5 = r4.Q0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.N0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.d0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f20677L
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.J0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N0(androidx.appcompat.app.h.r r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.N0(androidx.appcompat.app.h$r, android.view.KeyEvent):void");
    }

    private boolean P0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f20753m || Q0(rVar, keyEvent)) && (eVar = rVar.f20750j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f20684S == null) {
            d0(rVar, true);
        }
        return zPerformShortcut;
    }

    private boolean Q0(r rVar, KeyEvent keyEvent) {
        C c10;
        C c11;
        C c12;
        if (this.f20710s0) {
            return false;
        }
        if (rVar.f20753m) {
            return true;
        }
        r rVar2 = this.f20706o0;
        if (rVar2 != null && rVar2 != rVar) {
            d0(rVar2, false);
        }
        Window.Callback callbackW0 = w0();
        if (callbackW0 != null) {
            rVar.f20749i = callbackW0.onCreatePanelView(rVar.f20741a);
        }
        int i10 = rVar.f20741a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (c12 = this.f20684S) != null) {
            c12.c();
        }
        if (rVar.f20749i == null && (!z10 || !(O0() instanceof v))) {
            androidx.appcompat.view.menu.e eVar = rVar.f20750j;
            if (eVar == null || rVar.f20758r) {
                if (eVar == null && (!A0(rVar) || rVar.f20750j == null)) {
                    return false;
                }
                if (z10 && this.f20684S != null) {
                    if (this.f20685T == null) {
                        this.f20685T = new g();
                    }
                    this.f20684S.a(rVar.f20750j, this.f20685T);
                }
                rVar.f20750j.i0();
                if (!callbackW0.onCreatePanelMenu(rVar.f20741a, rVar.f20750j)) {
                    rVar.c(null);
                    if (z10 && (c10 = this.f20684S) != null) {
                        c10.a(null, this.f20685T);
                    }
                    return false;
                }
                rVar.f20758r = false;
            }
            rVar.f20750j.i0();
            Bundle bundle = rVar.f20759s;
            if (bundle != null) {
                rVar.f20750j.S(bundle);
                rVar.f20759s = null;
            }
            if (!callbackW0.onPreparePanel(0, rVar.f20749i, rVar.f20750j)) {
                if (z10 && (c11 = this.f20684S) != null) {
                    c11.a(null, this.f20685T);
                }
                rVar.f20750j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f20756p = z11;
            rVar.f20750j.setQwertyMode(z11);
            rVar.f20750j.h0();
        }
        rVar.f20753m = true;
        rVar.f20754n = false;
        this.f20706o0 = rVar;
        return true;
    }

    private void R0(boolean z10) {
        C c10 = this.f20684S;
        if (c10 == null || !c10.d() || (ViewConfiguration.get(this.f20677L).hasPermanentMenuKey() && !this.f20684S.e())) {
            r rVarU0 = u0(0, true);
            rVarU0.f20757q = true;
            d0(rVarU0, false);
            N0(rVarU0, null);
            return;
        }
        Window.Callback callbackW0 = w0();
        if (this.f20684S.b() && z10) {
            this.f20684S.f();
            if (this.f20710s0) {
                return;
            }
            callbackW0.onPanelClosed(108, u0(0, true).f20750j);
            return;
        }
        if (callbackW0 == null || this.f20710s0) {
            return;
        }
        if (this.f20666A0 && (this.f20667B0 & 1) != 0) {
            this.f20678M.getDecorView().removeCallbacks(this.f20668C0);
            this.f20668C0.run();
        }
        r rVarU02 = u0(0, true);
        androidx.appcompat.view.menu.e eVar = rVarU02.f20750j;
        if (eVar == null || rVarU02.f20758r || !callbackW0.onPreparePanel(0, rVarU02.f20749i, eVar)) {
            return;
        }
        callbackW0.onMenuOpened(108, rVarU02.f20750j);
        this.f20684S.g();
    }

    private int S0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean T(boolean z10) {
        return U(z10, true);
    }

    private boolean U(boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        if (this.f20710s0) {
            return false;
        }
        int iY = Y();
        int iD0 = D0(this.f20677L, iY);
        n1.j jVarX = Build.VERSION.SDK_INT < 33 ? X(this.f20677L) : null;
        if (!z11 && jVarX != null) {
            jVarX = t0(this.f20677L.getResources().getConfiguration());
        }
        boolean zD1 = d1(iD0, jVarX, z10);
        if (iY == 0) {
            s0(this.f20677L).e();
        } else {
            o oVar = this.f20716y0;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iY == 3) {
            r0(this.f20677L).e();
        } else {
            o oVar2 = this.f20717z0;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return zD1;
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f20694c0.findViewById(R.id.content);
        View decorView = this.f20678M.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f20677L.obtainStyledAttributes(i.j.f42805y0);
        typedArrayObtainStyledAttributes.getValue(i.j.f42613K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(i.j.f42618L0, contentFrameLayout.getMinWidthMinor());
        int i10 = i.j.f42603I0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = i.j.f42608J0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = i.j.f42593G0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = i.j.f42598H0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void W(Window window) {
        if (this.f20678M != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f20679N = mVar;
        window.setCallback(mVar);
        a0 a0VarU = a0.u(this.f20677L, null, f20664M0);
        Drawable drawableH = a0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        a0VarU.x();
        this.f20678M = window;
        if (Build.VERSION.SDK_INT < 33 || this.f20674I0 != null) {
            return;
        }
        N(null);
    }

    private boolean W0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f20678M.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Y() {
        int i10 = this.f20712u0;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.o();
    }

    private void a1() {
        if (this.f20693b0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void b0() {
        o oVar = this.f20716y0;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f20717z0;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private androidx.appcompat.app.c b1() {
        for (Context baseContext = this.f20677L; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c1(Configuration configuration) {
        Activity activity = (Activity) this.f20676K;
        if (activity instanceof InterfaceC2114v) {
            if (((InterfaceC2114v) activity).getLifecycle().getState().j(AbstractC2106m.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f20709r0 || this.f20710s0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean d1(int r10, n1.j r11, boolean r12) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.Context r1 = r9.f20677L
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.e0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f20677L
            int r1 = r9.q0(r1)
            android.content.res.Configuration r2 = r9.f20711t0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.f20677L
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            n1.j r2 = r9.t0(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            n1.j r6 = r9.t0(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r7
        L3b:
            if (r6 == 0) goto L45
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8c
            if (r12 == 0) goto L8c
            boolean r12 = r9.f20708q0
            if (r12 == 0) goto L8c
            boolean r12 = androidx.appcompat.app.h.f20665N0
            if (r12 != 0) goto L58
            boolean r12 = r9.f20709r0
            if (r12 == 0) goto L8c
        L58:
            java.lang.Object r12 = r9.f20676K
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L83
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L83
            java.lang.Object r12 = r9.f20676K
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L83:
            java.lang.Object r12 = r9.f20676K
            android.app.Activity r12 = (android.app.Activity) r12
            f1.C3309b.s(r12)
            r12 = r8
            goto L8d
        L8c:
            r12 = r7
        L8d:
            if (r12 != 0) goto L9a
            if (r3 == 0) goto L9a
            r12 = r3 & r1
            if (r12 != r3) goto L96
            r7 = r8
        L96:
            r9.f1(r4, r6, r7, r5)
            goto L9b
        L9a:
            r8 = r12
        L9b:
            if (r8 == 0) goto Lb7
            java.lang.Object r12 = r9.f20676K
            boolean r0 = r12 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto Lb7
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto Lac
            androidx.appcompat.app.c r12 = (androidx.appcompat.app.c) r12
            r12.M0(r10)
        Lac:
            r10 = r3 & 4
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r9.f20676K
            androidx.appcompat.app.c r10 = (androidx.appcompat.app.c) r10
            r10.L0(r11)
        Lb7:
            if (r6 == 0) goto Lca
            android.content.Context r10 = r9.f20677L
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            n1.j r10 = r9.t0(r10)
            r9.U0(r10)
        Lca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.d1(int, n1.j, boolean):boolean");
    }

    private Configuration e0(Context context, int i10, n1.j jVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (jVar != null) {
            T0(configuration2, jVar);
        }
        return configuration2;
    }

    private ViewGroup f0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f20677L.obtainStyledAttributes(i.j.f42805y0);
        int i10 = i.j.f42578D0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f42623M0, false)) {
            I(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            I(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f42583E0, false)) {
            I(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f42588F0, false)) {
            I(10);
        }
        this.f20702k0 = typedArrayObtainStyledAttributes.getBoolean(i.j.f42810z0, false);
        typedArrayObtainStyledAttributes.recycle();
        m0();
        this.f20678M.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20677L);
        if (this.f20703l0) {
            viewGroup = this.f20701j0 ? (ViewGroup) layoutInflaterFrom.inflate(i.g.f42540o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(i.g.f42539n, (ViewGroup) null);
        } else if (this.f20702k0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i.g.f42531f, (ViewGroup) null);
            this.f20700i0 = false;
            this.f20699h0 = false;
        } else if (this.f20699h0) {
            TypedValue typedValue = new TypedValue();
            this.f20677L.getTheme().resolveAttribute(i.a.f42399f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f20677L, typedValue.resourceId) : this.f20677L).inflate(i.g.f42541p, (ViewGroup) null);
            C c10 = (C) viewGroup.findViewById(i.f.f42515p);
            this.f20684S = c10;
            c10.setWindowCallback(w0());
            if (this.f20700i0) {
                this.f20684S.h(109);
            }
            if (this.f20697f0) {
                this.f20684S.h(2);
            }
            if (this.f20698g0) {
                this.f20684S.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f20699h0 + ", windowActionBarOverlay: " + this.f20700i0 + ", android:windowIsFloating: " + this.f20702k0 + ", windowActionModeOverlay: " + this.f20701j0 + ", windowNoTitle: " + this.f20703l0 + " }");
        }
        s1.X.B0(viewGroup, new b());
        if (this.f20684S == null) {
            this.f20695d0 = (TextView) viewGroup.findViewById(i.f.f42496L);
        }
        h0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.f42501b);
        ViewGroup viewGroup2 = (ViewGroup) this.f20678M.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f20678M.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void f1(int i10, n1.j jVar, boolean z10, Configuration configuration) {
        Resources resources = this.f20677L.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (jVar != null) {
            T0(configuration2, jVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = this.f20713v0;
        if (i11 != 0) {
            this.f20677L.setTheme(i11);
            this.f20677L.getTheme().applyStyle(this.f20713v0, true);
        }
        if (z10 && (this.f20676K instanceof Activity)) {
            c1(configuration2);
        }
    }

    private void h1(View view) {
        view.setBackgroundColor((s1.X.K(view) & 8192) != 0 ? C3377a.c(this.f20677L, i.c.f42422b) : C3377a.c(this.f20677L, i.c.f42421a));
    }

    private void l0() {
        if (this.f20693b0) {
            return;
        }
        this.f20694c0 = f0();
        CharSequence charSequenceV0 = v0();
        if (!TextUtils.isEmpty(charSequenceV0)) {
            C c10 = this.f20684S;
            if (c10 != null) {
                c10.setWindowTitle(charSequenceV0);
            } else if (O0() != null) {
                O0().G(charSequenceV0);
            } else {
                TextView textView = this.f20695d0;
                if (textView != null) {
                    textView.setText(charSequenceV0);
                }
            }
        }
        V();
        M0(this.f20694c0);
        this.f20693b0 = true;
        r rVarU0 = u0(0, false);
        if (this.f20710s0) {
            return;
        }
        if (rVarU0 == null || rVarU0.f20750j == null) {
            B0(108);
        }
    }

    private void m0() {
        if (this.f20678M == null) {
            Object obj = this.f20676K;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.f20678M == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration o0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            j.a(configuration, configuration2, configuration3);
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            k.a(configuration, configuration2, configuration3);
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            int i44 = configuration.densityDpi;
            int i45 = configuration2.densityDpi;
            if (i44 != i45) {
                configuration3.densityDpi = i45;
            }
        }
        return configuration3;
    }

    private int q0(Context context) throws PackageManager.NameNotFoundException {
        if (!this.f20715x0 && (this.f20676K instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f20676K.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f20714w0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f20714w0 = 0;
            }
        }
        this.f20715x0 = true;
        return this.f20714w0;
    }

    private o r0(Context context) {
        if (this.f20717z0 == null) {
            this.f20717z0 = new n(context);
        }
        return this.f20717z0;
    }

    private o s0(Context context) {
        if (this.f20716y0 == null) {
            this.f20716y0 = new p(x.a(context));
        }
        return this.f20716y0;
    }

    private void x0() {
        l0();
        if (this.f20699h0 && this.f20681P == null) {
            Object obj = this.f20676K;
            if (obj instanceof Activity) {
                this.f20681P = new y((Activity) this.f20676K, this.f20700i0);
            } else if (obj instanceof Dialog) {
                this.f20681P = new y((Dialog) this.f20676K);
            }
            androidx.appcompat.app.a aVar = this.f20681P;
            if (aVar != null) {
                aVar.v(this.f20669D0);
            }
        }
    }

    private boolean y0(r rVar) {
        View view = rVar.f20749i;
        if (view != null) {
            rVar.f20748h = view;
            return true;
        }
        if (rVar.f20750j == null) {
            return false;
        }
        if (this.f20686U == null) {
            this.f20686U = new s();
        }
        View view2 = (View) rVar.a(this.f20686U);
        rVar.f20748h = view2;
        return view2 != null;
    }

    private boolean z0(r rVar) {
        rVar.d(p0());
        rVar.f20747g = new q(rVar.f20752l);
        rVar.f20743c = 81;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f20676K
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.G(r3)
        L9:
            boolean r0 = r3.f20666A0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f20678M
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f20668C0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f20710s0 = r0
            int r0 = r3.f20712u0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f20676K
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            s.X<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f20662K0
            java.lang.Object r1 = r3.f20676K
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f20712u0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            s.X<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.h.f20662K0
            java.lang.Object r1 = r3.f20676K
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f20681P
            if (r0 == 0) goto L5b
            r0.p()
        L5b:
            r3.b0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.A():void");
    }

    @Override // androidx.appcompat.app.f
    public void B(Bundle bundle) {
        l0();
    }

    @Override // androidx.appcompat.app.f
    public void C() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.E(true);
        }
    }

    public boolean C0() {
        return this.f20692a0;
    }

    int D0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return s0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return r0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.f
    public void E() throws PackageManager.NameNotFoundException {
        U(true, false);
    }

    boolean E0() {
        boolean z10 = this.f20707p0;
        this.f20707p0 = false;
        r rVarU0 = u0(0, false);
        if (rVarU0 != null && rVarU0.f20755o) {
            if (!z10) {
                d0(rVarU0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f20687V;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarT = t();
        return aVarT != null && aVarT.h();
    }

    @Override // androidx.appcompat.app.f
    public void F() {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            aVarT.E(false);
        }
    }

    boolean F0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f20707p0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            G0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null && aVarT.q(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f20706o0;
        if (rVar != null && P0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f20706o0;
            if (rVar2 != null) {
                rVar2.f20754n = true;
            }
            return true;
        }
        if (this.f20706o0 == null) {
            r rVarU0 = u0(0, true);
            Q0(rVarU0, keyEvent);
            boolean zP0 = P0(rVarU0, keyEvent.getKeyCode(), keyEvent, 1);
            rVarU0.f20753m = false;
            if (zP0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean I(int i10) {
        int iS0 = S0(i10);
        if (this.f20703l0 && iS0 == 108) {
            return false;
        }
        if (this.f20699h0 && iS0 == 1) {
            this.f20699h0 = false;
        }
        if (iS0 == 1) {
            a1();
            this.f20703l0 = true;
            return true;
        }
        if (iS0 == 2) {
            a1();
            this.f20697f0 = true;
            return true;
        }
        if (iS0 == 5) {
            a1();
            this.f20698g0 = true;
            return true;
        }
        if (iS0 == 10) {
            a1();
            this.f20701j0 = true;
            return true;
        }
        if (iS0 == 108) {
            a1();
            this.f20699h0 = true;
            return true;
        }
        if (iS0 != 109) {
            return this.f20678M.requestFeature(iS0);
        }
        a1();
        this.f20700i0 = true;
        return true;
    }

    boolean I0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                J0(0, keyEvent);
                return true;
            }
        } else if (E0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void J(int i10) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f20694c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f20677L).inflate(i10, viewGroup);
        this.f20679N.c(this.f20678M.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public void K(View view) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f20694c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f20679N.c(this.f20678M.getCallback());
    }

    void K0(int i10) {
        androidx.appcompat.app.a aVarT;
        if (i10 != 108 || (aVarT = t()) == null) {
            return;
        }
        aVarT.i(true);
    }

    @Override // androidx.appcompat.app.f
    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f20694c0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f20679N.c(this.f20678M.getCallback());
    }

    void L0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarT = t();
            if (aVarT != null) {
                aVarT.i(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r rVarU0 = u0(i10, true);
            if (rVarU0.f20755o) {
                d0(rVarU0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void N(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.N(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f20674I0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f20675J0
            if (r1 == 0) goto L11
            androidx.appcompat.app.h.l.c(r0, r1)
            r0 = 0
            r2.f20675J0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f20676K
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f20676K
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.h.l.a(r3)
            r2.f20674I0 = r3
            goto L2e
        L2c:
            r2.f20674I0 = r3
        L2e:
            r2.e1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.N(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.f
    public void O(Toolbar toolbar) {
        if (this.f20676K instanceof Activity) {
            androidx.appcompat.app.a aVarT = t();
            if (aVarT instanceof y) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f20682Q = null;
            if (aVarT != null) {
                aVarT.p();
            }
            this.f20681P = null;
            if (toolbar != null) {
                v vVar = new v(toolbar, v0(), this.f20679N);
                this.f20681P = vVar;
                this.f20679N.e(vVar.f20780c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f20679N.e(null);
            }
            v();
        }
    }

    final androidx.appcompat.app.a O0() {
        return this.f20681P;
    }

    @Override // androidx.appcompat.app.f
    public void P(int i10) {
        this.f20713v0 = i10;
    }

    @Override // androidx.appcompat.app.f
    public final void Q(CharSequence charSequence) {
        this.f20683R = charSequence;
        C c10 = this.f20684S;
        if (c10 != null) {
            c10.setWindowTitle(charSequence);
            return;
        }
        if (O0() != null) {
            O0().G(charSequence);
            return;
        }
        TextView textView = this.f20695d0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void T0(Configuration configuration, n1.j jVar) {
        j.d(configuration, jVar);
    }

    void U0(n1.j jVar) {
        j.c(jVar);
    }

    final boolean V0() {
        ViewGroup viewGroup;
        return this.f20693b0 && (viewGroup = this.f20694c0) != null && viewGroup.isLaidOut();
    }

    n1.j X(Context context) {
        n1.j jVarS;
        if (Build.VERSION.SDK_INT >= 33 || (jVarS = androidx.appcompat.app.f.s()) == null) {
            return null;
        }
        n1.j jVarT0 = t0(context.getApplicationContext().getResources().getConfiguration());
        n1.j jVarB = u.b(jVarS, jVarT0);
        return jVarB.e() ? jVarT0 : jVarB;
    }

    boolean X0() {
        if (this.f20674I0 == null) {
            return false;
        }
        r rVarU0 = u0(0, false);
        return (rVarU0 != null && rVarU0.f20755o) || this.f20687V != null;
    }

    public androidx.appcompat.view.b Y0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f20687V;
        if (bVar != null) {
            bVar.c();
        }
        C0300h c0300h = new C0300h(aVar);
        androidx.appcompat.app.a aVarT = t();
        if (aVarT != null) {
            androidx.appcompat.view.b bVarI = aVarT.I(c0300h);
            this.f20687V = bVarI;
            if (bVarI != null && (dVar = this.f20680O) != null) {
                dVar.h(bVarI);
            }
        }
        if (this.f20687V == null) {
            this.f20687V = Z0(c0300h);
        }
        e1();
        return this.f20687V;
    }

    void Z(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f20705n0;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f20750j;
            }
        }
        if ((rVar == null || rVar.f20755o) && !this.f20710s0) {
            this.f20679N.d(this.f20678M.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b Z0(b.a aVar) {
        androidx.appcompat.view.b bVarA;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        k0();
        androidx.appcompat.view.b bVar = this.f20687V;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof C0300h)) {
            aVar = new C0300h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f20680O;
        if (dVar3 == null || this.f20710s0) {
            bVarA = null;
        } else {
            try {
                bVarA = dVar3.A(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVarA != null) {
            this.f20687V = bVarA;
        } else {
            if (this.f20688W == null) {
                if (this.f20702k0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f20677L.getTheme();
                    theme.resolveAttribute(i.a.f42399f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f20677L.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f20677L, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f20677L;
                    }
                    this.f20688W = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, i.a.f42402i);
                    this.f20689X = popupWindow;
                    androidx.core.widget.i.b(popupWindow, 2);
                    this.f20689X.setContentView(this.f20688W);
                    this.f20689X.setWidth(-1);
                    dVar.getTheme().resolveAttribute(i.a.f42395b, typedValue, true);
                    this.f20688W.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f20689X.setHeight(-2);
                    this.f20690Y = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f20694c0.findViewById(i.f.f42507h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(p0()));
                        this.f20688W = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f20688W != null) {
                k0();
                this.f20688W.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f20688W.getContext(), this.f20688W, aVar, this.f20689X == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f20688W.h(eVar);
                    this.f20687V = eVar;
                    if (V0()) {
                        this.f20688W.setAlpha(0.0f);
                        C4434g0 c4434g0B = s1.X.e(this.f20688W).b(1.0f);
                        this.f20691Z = c4434g0B;
                        c4434g0B.h(new e());
                    } else {
                        this.f20688W.setAlpha(1.0f);
                        this.f20688W.setVisibility(0);
                        if (this.f20688W.getParent() instanceof View) {
                            s1.X.k0((View) this.f20688W.getParent());
                        }
                    }
                    if (this.f20689X != null) {
                        this.f20678M.getDecorView().post(this.f20690Y);
                    }
                } else {
                    this.f20687V = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f20687V;
        if (bVar2 != null && (dVar2 = this.f20680O) != null) {
            dVar2.h(bVar2);
        }
        e1();
        return this.f20687V;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        r rVarN0;
        Window.Callback callbackW0 = w0();
        if (callbackW0 == null || this.f20710s0 || (rVarN0 = n0(eVar.F())) == null) {
            return false;
        }
        return callbackW0.onMenuItemSelected(rVarN0.f20741a, menuItem);
    }

    void a0(androidx.appcompat.view.menu.e eVar) {
        if (this.f20704m0) {
            return;
        }
        this.f20704m0 = true;
        this.f20684S.i();
        Window.Callback callbackW0 = w0();
        if (callbackW0 != null && !this.f20710s0) {
            callbackW0.onPanelClosed(108, eVar);
        }
        this.f20704m0 = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        R0(true);
    }

    void c0(int i10) {
        d0(u0(i10, true), true);
    }

    void d0(r rVar, boolean z10) {
        ViewGroup viewGroup;
        C c10;
        if (z10 && rVar.f20741a == 0 && (c10 = this.f20684S) != null && c10.b()) {
            a0(rVar.f20750j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f20677L.getSystemService("window");
        if (windowManager != null && rVar.f20755o && (viewGroup = rVar.f20747g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Z(rVar.f20741a, rVar, null);
            }
        }
        rVar.f20753m = false;
        rVar.f20754n = false;
        rVar.f20755o = false;
        rVar.f20748h = null;
        rVar.f20757q = true;
        if (this.f20706o0 == rVar) {
            this.f20706o0 = null;
        }
        if (rVar.f20741a == 0) {
            e1();
        }
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ((ViewGroup) this.f20694c0.findViewById(R.id.content)).addView(view, layoutParams);
        this.f20679N.c(this.f20678M.getCallback());
    }

    void e1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zX0 = X0();
            if (zX0 && this.f20675J0 == null) {
                this.f20675J0 = l.b(this.f20674I0, this);
            } else {
                if (zX0 || (onBackInvokedCallback = this.f20675J0) == null) {
                    return;
                }
                l.c(this.f20674I0, onBackInvokedCallback);
                this.f20675J0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return T(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View g0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f20672G0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f20677L.obtainStyledAttributes(i.j.f42805y0);
            String string = typedArrayObtainStyledAttributes.getString(i.j.f42573C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f20672G0 = new androidx.appcompat.app.r();
            } else {
                try {
                    this.f20672G0 = (androidx.appcompat.app.r) this.f20677L.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f20672G0 = new androidx.appcompat.app.r();
                }
            }
        }
        boolean z11 = f20663L0;
        boolean zW0 = false;
        if (z11) {
            if (this.f20673H0 == null) {
                this.f20673H0 = new t();
            }
            if (this.f20673H0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zW0 = W0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zW0 = true;
                }
                z10 = zW0;
            }
        } else {
            z10 = zW0;
        }
        return this.f20672G0.r(view, str, context, attributeSet, z10, z11, true, g0.c());
    }

    final int g1(C4469y0 c4469y0, Rect rect) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z10;
        boolean z11;
        int iL = c4469y0 != null ? c4469y0.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f20688W;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20688W.getLayoutParams();
            if (this.f20688W.isShown()) {
                if (this.f20670E0 == null) {
                    this.f20670E0 = new Rect();
                    this.f20671F0 = new Rect();
                }
                Rect rect2 = this.f20670E0;
                Rect rect3 = this.f20671F0;
                if (c4469y0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c4469y0.j(), c4469y0.l(), c4469y0.k(), c4469y0.i());
                }
                h0.a(this.f20694c0, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                C4469y0 c4469y0F = s1.X.F(this.f20694c0);
                int iJ = c4469y0F == null ? 0 : c4469y0F.j();
                int iK = c4469y0F == null ? 0 : c4469y0F.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f20696e0 != null) {
                    View view = this.f20696e0;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f20696e0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f20677L);
                    this.f20696e0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f20694c0.addView(this.f20696e0, -1, layoutParams);
                }
                View view3 = this.f20696e0;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    h1(this.f20696e0);
                }
                if (!this.f20701j0 && z) {
                    iL = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f20688W.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f20696e0;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iL;
    }

    void h0() {
        androidx.appcompat.view.menu.e eVar;
        C c10 = this.f20684S;
        if (c10 != null) {
            c10.i();
        }
        if (this.f20689X != null) {
            this.f20678M.getDecorView().removeCallbacks(this.f20690Y);
            if (this.f20689X.isShowing()) {
                try {
                    this.f20689X.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f20689X = null;
        }
        k0();
        r rVarU0 = u0(0, false);
        if (rVarU0 == null || (eVar = rVarU0.f20750j) == null) {
            return;
        }
        eVar.close();
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        this.f20708q0 = true;
        int iD0 = D0(context, Y());
        if (androidx.appcompat.app.f.w(context)) {
            androidx.appcompat.app.f.S(context);
        }
        n1.j jVarX = X(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(e0(context, iD0, jVarX, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(e0(context, iD0, jVarX, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f20665N0) {
            return super.i(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationE0 = e0(context, iD0, jVarX, !configuration2.equals(configuration3) ? o0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, i.i.f42560b);
        dVar.a(configurationE0);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    boolean i0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f20676K;
        if (((obj instanceof C4458t.a) || (obj instanceof androidx.appcompat.app.p)) && (decorView = this.f20678M.getDecorView()) != null && C4458t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f20679N.b(this.f20678M.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? F0(keyCode, keyEvent) : I0(keyCode, keyEvent);
    }

    void j0(int i10) {
        r rVarU0;
        r rVarU02 = u0(i10, true);
        if (rVarU02.f20750j != null) {
            Bundle bundle = new Bundle();
            rVarU02.f20750j.U(bundle);
            if (bundle.size() > 0) {
                rVarU02.f20759s = bundle;
            }
            rVarU02.f20750j.i0();
            rVarU02.f20750j.clear();
        }
        rVarU02.f20758r = true;
        rVarU02.f20757q = true;
        if ((i10 != 108 && i10 != 0) || this.f20684S == null || (rVarU0 = u0(0, false)) == null) {
            return;
        }
        rVarU0.f20753m = false;
        Q0(rVarU0, null);
    }

    void k0() {
        C4434g0 c4434g0 = this.f20691Z;
        if (c4434g0 != null) {
            c4434g0.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public <T extends View> T l(int i10) {
        l0();
        return (T) this.f20678M.findViewById(i10);
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f20677L;
    }

    r n0(Menu menu) {
        r[] rVarArr = this.f20705n0;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f20750j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return g0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public int p() {
        return this.f20712u0;
    }

    final Context p0() {
        androidx.appcompat.app.a aVarT = t();
        Context contextL = aVarT != null ? aVarT.l() : null;
        return contextL == null ? this.f20677L : contextL;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater r() {
        if (this.f20682Q == null) {
            x0();
            androidx.appcompat.app.a aVar = this.f20681P;
            this.f20682Q = new androidx.appcompat.view.g(aVar != null ? aVar.l() : this.f20677L);
        }
        return this.f20682Q;
    }

    @Override // androidx.appcompat.app.f
    public androidx.appcompat.app.a t() {
        x0();
        return this.f20681P;
    }

    n1.j t0(Configuration configuration) {
        return j.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f20677L);
        if (layoutInflaterFrom.getFactory() == null) {
            C4460u.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    protected r u0(int i10, boolean z10) {
        r[] rVarArr = this.f20705n0;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f20705n0 = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        if (O0() == null || t().n()) {
            return;
        }
        B0(0);
    }

    final CharSequence v0() {
        Object obj = this.f20676K;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f20683R;
    }

    final Window.Callback w0() {
        return this.f20678M.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void y(Configuration configuration) throws PackageManager.NameNotFoundException {
        androidx.appcompat.app.a aVarT;
        if (this.f20699h0 && this.f20693b0 && (aVarT = t()) != null) {
            aVarT.o(configuration);
        }
        C1987i.b().g(this.f20677L);
        this.f20711t0 = new Configuration(this.f20677L.getResources().getConfiguration());
        U(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void z(Bundle bundle) {
        String strC;
        this.f20708q0 = true;
        T(false);
        m0();
        Object obj = this.f20676K;
        if (obj instanceof Activity) {
            try {
                strC = f1.k.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarO0 = O0();
                if (aVarO0 == null) {
                    this.f20669D0 = true;
                } else {
                    aVarO0.v(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f20711t0 = new Configuration(this.f20677L.getResources().getConfiguration());
        this.f20709r0 = true;
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        X<String, Integer> x10;
        Integer num;
        androidx.appcompat.app.c cVarB1;
        this.f20691Z = null;
        this.f20692a0 = true;
        this.f20712u0 = -100;
        this.f20668C0 = new a();
        this.f20677L = context;
        this.f20680O = dVar;
        this.f20676K = obj;
        if (this.f20712u0 == -100 && (obj instanceof Dialog) && (cVarB1 = b1()) != null) {
            this.f20712u0 = cVarB1.G0().p();
        }
        if (this.f20712u0 == -100 && (num = (x10 = f20662K0).get(obj.getClass().getName())) != null) {
            this.f20712u0 = num.intValue();
            x10.remove(obj.getClass().getName());
        }
        if (window != null) {
            W(window);
        }
        C1987i.h();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.h0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.f
    public void D(Bundle bundle) {
    }

    void M0(ViewGroup viewGroup) {
    }
}
