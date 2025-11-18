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
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
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
import androidx.appcompat.view.menu.C0085e;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.InterfaceC0093m;
import androidx.appcompat.view.menu.InterfaceC0094n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0166h;
import androidx.appcompat.widget.C0185q0;
import androidx.appcompat.widget.C0195v0;
import androidx.appcompat.widget.C0197w0;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0153a0;
import androidx.appcompat.widget.InterfaceC0196w;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.C0243g;
import androidx.core.content.C0255a;
import androidx.core.content.p003d.C0263f;
import androidx.core.view.C0281a0;
import androidx.core.view.C0285c0;
import androidx.core.view.C0293e;
import androidx.core.view.C0296f;
import androidx.core.view.C0311u;
import androidx.core.view.C0315y;
import androidx.core.view.InterfaceC0306p;
import androidx.core.widget.C0329j;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0515k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p024c.p025a.C0823a;
import p024c.p025a.C0825c;
import p024c.p025a.C0828f;
import p024c.p025a.C0829g;
import p024c.p025a.C0831i;
import p024c.p025a.C0832j;
import p024c.p025a.p026k.p027a.C0833a;
import p024c.p025a.p032o.AbstractC0842b;
import p024c.p025a.p032o.C0844d;
import p024c.p025a.p032o.C0845e;
import p024c.p025a.p032o.C0846f;
import p024c.p025a.p032o.C0847g;
import p024c.p025a.p032o.WindowCallbackC0849i;
import p024c.p041e.C0873g;
import p024c.p052i.p059j.C0954d;

/* compiled from: AppCompatDelegateImpl.java */
/* renamed from: androidx.appcompat.app.g */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C0070g extends AbstractC0069f implements C0087g.a, LayoutInflater.Factory2 {

    /* renamed from: i */
    private static final C0873g<String, Integer> f271i = new C0873g<>();

    /* renamed from: j */
    private static final boolean f272j;

    /* renamed from: k */
    private static final int[] f273k;

    /* renamed from: l */
    private static final boolean f274l;

    /* renamed from: m */
    private static final boolean f275m;

    /* renamed from: n */
    private static boolean f276n;

    /* renamed from: A */
    ActionBarContextView f277A;

    /* renamed from: B */
    PopupWindow f278B;

    /* renamed from: C */
    Runnable f279C;

    /* renamed from: D */
    C0315y f280D;

    /* renamed from: E */
    private boolean f281E;

    /* renamed from: F */
    private boolean f282F;

    /* renamed from: G */
    ViewGroup f283G;

    /* renamed from: H */
    private TextView f284H;

    /* renamed from: I */
    private View f285I;

    /* renamed from: J */
    private boolean f286J;

    /* renamed from: K */
    private boolean f287K;

    /* renamed from: L */
    boolean f288L;

    /* renamed from: M */
    boolean f289M;

    /* renamed from: N */
    boolean f290N;

    /* renamed from: O */
    boolean f291O;

    /* renamed from: P */
    boolean f292P;

    /* renamed from: Q */
    private boolean f293Q;

    /* renamed from: R */
    private t[] f294R;

    /* renamed from: S */
    private t f295S;

    /* renamed from: T */
    private boolean f296T;

    /* renamed from: U */
    private boolean f297U;

    /* renamed from: V */
    private boolean f298V;

    /* renamed from: W */
    private boolean f299W;

    /* renamed from: X */
    boolean f300X;

    /* renamed from: Y */
    private int f301Y;

    /* renamed from: Z */
    private int f302Z;

    /* renamed from: a0 */
    private boolean f303a0;

    /* renamed from: b0 */
    private boolean f304b0;

    /* renamed from: c0 */
    private m f305c0;

    /* renamed from: d0 */
    private m f306d0;

    /* renamed from: e0 */
    boolean f307e0;

    /* renamed from: f0 */
    int f308f0;

    /* renamed from: g0 */
    private final Runnable f309g0;

    /* renamed from: h0 */
    private boolean f310h0;

    /* renamed from: i0 */
    private Rect f311i0;

    /* renamed from: j0 */
    private Rect f312j0;

    /* renamed from: k0 */
    private C0073j f313k0;

    /* renamed from: o */
    final Object f314o;

    /* renamed from: p */
    final Context f315p;

    /* renamed from: q */
    Window f316q;

    /* renamed from: r */
    private k f317r;

    /* renamed from: s */
    final InterfaceC0068e f318s;

    /* renamed from: t */
    AbstractC0064a f319t;

    /* renamed from: u */
    MenuInflater f320u;

    /* renamed from: v */
    private CharSequence f321v;

    /* renamed from: w */
    private InterfaceC0196w f322w;

    /* renamed from: x */
    private i f323x;

    /* renamed from: y */
    private u f324y;

    /* renamed from: z */
    AbstractC0842b f325z;

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$a */
    class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: f */
        final /* synthetic */ Thread.UncaughtExceptionHandler f326f;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f326f = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m362a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!m362a(th)) {
                this.f326f.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f326f.uncaughtException(thread, notFoundException);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
            if ((layoutInflaterFactory2C0070g.f308f0 & 1) != 0) {
                layoutInflaterFactory2C0070g.m346Z(0);
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g2 = LayoutInflaterFactory2C0070g.this;
            if ((layoutInflaterFactory2C0070g2.f308f0 & RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                layoutInflaterFactory2C0070g2.m346Z(108);
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g3 = LayoutInflaterFactory2C0070g.this;
            layoutInflaterFactory2C0070g3.f307e0 = false;
            layoutInflaterFactory2C0070g3.f308f0 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$c */
    class c implements InterfaceC0306p {
        c() {
        }

        @Override // androidx.core.view.InterfaceC0306p
        /* renamed from: a */
        public C0285c0 mo363a(View view, C0285c0 c0285c0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            int iM1884k = c0285c0.m1884k();
            int iM339P0 = LayoutInflaterFactory2C0070g.this.m339P0(c0285c0, null);
            if (iM1884k != iM339P0) {
                c0285c0 = c0285c0.m1887o(c0285c0.m1882i(), iM339P0, c0285c0.m1883j(), c0285c0.m1881h());
            }
            return C0311u.m2109V(view, c0285c0);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$d */
    class d implements InterfaceC0153a0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0153a0.a
        /* renamed from: a */
        public void mo364a(Rect rect) {
            rect.top = LayoutInflaterFactory2C0070g.this.m339P0(null, rect);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$e */
    class e implements ContentFrameLayout.InterfaceC0125a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0125a
        /* renamed from: a */
        public void mo365a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0125a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0070g.this.m344X();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$f */
    class f implements Runnable {

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.g$f$a */
        class a extends C0281a0 {
            a() {
            }

            @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
            public void onAnimationEnd(View view) {
                LayoutInflaterFactory2C0070g.this.f277A.setAlpha(1.0f);
                LayoutInflaterFactory2C0070g.this.f280D.m2222f(null);
                LayoutInflaterFactory2C0070g.this.f280D = null;
            }

            @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
            public void onAnimationStart(View view) {
                LayoutInflaterFactory2C0070g.this.f277A.setVisibility(0);
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
            layoutInflaterFactory2C0070g.f278B.showAtLocation(layoutInflaterFactory2C0070g.f277A, 55, 0, 0);
            LayoutInflaterFactory2C0070g.this.m348a0();
            if (!LayoutInflaterFactory2C0070g.this.m336I0()) {
                LayoutInflaterFactory2C0070g.this.f277A.setAlpha(1.0f);
                LayoutInflaterFactory2C0070g.this.f277A.setVisibility(0);
            } else {
                LayoutInflaterFactory2C0070g.this.f277A.setAlpha(0.0f);
                LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g2 = LayoutInflaterFactory2C0070g.this;
                layoutInflaterFactory2C0070g2.f280D = C0311u.m2118c(layoutInflaterFactory2C0070g2.f277A).m2217a(1.0f);
                LayoutInflaterFactory2C0070g.this.f280D.m2222f(new a());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$g */
    class g extends C0281a0 {
        g() {
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationEnd(View view) {
            LayoutInflaterFactory2C0070g.this.f277A.setAlpha(1.0f);
            LayoutInflaterFactory2C0070g.this.f280D.m2222f(null);
            LayoutInflaterFactory2C0070g.this.f280D = null;
        }

        @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
        public void onAnimationStart(View view) {
            LayoutInflaterFactory2C0070g.this.f277A.setVisibility(0);
            LayoutInflaterFactory2C0070g.this.f277A.sendAccessibilityEvent(32);
            if (LayoutInflaterFactory2C0070g.this.f277A.getParent() instanceof View) {
                C0311u.m2125f0((View) LayoutInflaterFactory2C0070g.this.f277A.getParent());
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$h */
    private class h implements InterfaceC0065b {
        h() {
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$i */
    private final class i implements InterfaceC0093m.a {
        i() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: b */
        public void mo366b(C0087g c0087g, boolean z) {
            LayoutInflaterFactory2C0070g.this.m340Q(c0087g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: c */
        public boolean mo367c(C0087g c0087g) {
            Window.Callback callbackM354k0 = LayoutInflaterFactory2C0070g.this.m354k0();
            if (callbackM354k0 == null) {
                return true;
            }
            callbackM354k0.onMenuOpened(108, c0087g);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$j */
    class j implements AbstractC0842b.a {

        /* renamed from: a */
        private AbstractC0842b.a f336a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.g$j$a */
        class a extends C0281a0 {
            a() {
            }

            @Override // androidx.core.view.C0281a0, androidx.core.view.InterfaceC0316z
            public void onAnimationEnd(View view) {
                LayoutInflaterFactory2C0070g.this.f277A.setVisibility(8);
                LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0070g.f278B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0070g.f277A.getParent() instanceof View) {
                    C0311u.m2125f0((View) LayoutInflaterFactory2C0070g.this.f277A.getParent());
                }
                LayoutInflaterFactory2C0070g.this.f277A.removeAllViews();
                LayoutInflaterFactory2C0070g.this.f280D.m2222f(null);
                LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g2 = LayoutInflaterFactory2C0070g.this;
                layoutInflaterFactory2C0070g2.f280D = null;
                C0311u.m2125f0(layoutInflaterFactory2C0070g2.f283G);
            }
        }

        public j(AbstractC0842b.a aVar) {
            this.f336a = aVar;
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: a */
        public void mo368a(AbstractC0842b abstractC0842b) {
            this.f336a.mo368a(abstractC0842b);
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
            if (layoutInflaterFactory2C0070g.f278B != null) {
                layoutInflaterFactory2C0070g.f316q.getDecorView().removeCallbacks(LayoutInflaterFactory2C0070g.this.f279C);
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g2 = LayoutInflaterFactory2C0070g.this;
            if (layoutInflaterFactory2C0070g2.f277A != null) {
                layoutInflaterFactory2C0070g2.m348a0();
                LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g3 = LayoutInflaterFactory2C0070g.this;
                layoutInflaterFactory2C0070g3.f280D = C0311u.m2118c(layoutInflaterFactory2C0070g3.f277A).m2217a(0.0f);
                LayoutInflaterFactory2C0070g.this.f280D.m2222f(new a());
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g4 = LayoutInflaterFactory2C0070g.this;
            InterfaceC0068e interfaceC0068e = layoutInflaterFactory2C0070g4.f318s;
            if (interfaceC0068e != null) {
                interfaceC0068e.onSupportActionModeFinished(layoutInflaterFactory2C0070g4.f325z);
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g5 = LayoutInflaterFactory2C0070g.this;
            layoutInflaterFactory2C0070g5.f325z = null;
            C0311u.m2125f0(layoutInflaterFactory2C0070g5.f283G);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: b */
        public boolean mo369b(AbstractC0842b abstractC0842b, Menu menu) {
            return this.f336a.mo369b(abstractC0842b, menu);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: c */
        public boolean mo370c(AbstractC0842b abstractC0842b, Menu menu) {
            C0311u.m2125f0(LayoutInflaterFactory2C0070g.this.f283G);
            return this.f336a.mo370c(abstractC0842b, menu);
        }

        @Override // p024c.p025a.p032o.AbstractC0842b.a
        /* renamed from: d */
        public boolean mo371d(AbstractC0842b abstractC0842b, MenuItem menuItem) {
            return this.f336a.mo371d(abstractC0842b, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$l */
    private class l extends m {

        /* renamed from: c */
        private final PowerManager f340c;

        l(Context context) {
            super();
            this.f340c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: b */
        IntentFilter mo373b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: c */
        public int mo374c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f340c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: d */
        public void mo375d() {
            LayoutInflaterFactory2C0070g.this.mo284e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$m */
    abstract class m {

        /* renamed from: a */
        private BroadcastReceiver f342a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* renamed from: androidx.appcompat.app.g$m$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                m.this.mo375d();
            }
        }

        m() {
        }

        /* renamed from: a */
        void m376a() {
            BroadcastReceiver broadcastReceiver = this.f342a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0070g.this.f315p.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f342a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo373b();

        /* renamed from: c */
        abstract int mo374c();

        /* renamed from: d */
        abstract void mo375d();

        /* renamed from: e */
        void m377e() {
            m376a();
            IntentFilter intentFilterMo373b = mo373b();
            if (intentFilterMo373b == null || intentFilterMo373b.countActions() == 0) {
                return;
            }
            if (this.f342a == null) {
                this.f342a = new a();
            }
            LayoutInflaterFactory2C0070g.this.f315p.registerReceiver(this.f342a, intentFilterMo373b);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$n */
    private class n extends m {

        /* renamed from: c */
        private final C0077n f345c;

        n(C0077n c0077n) {
            super();
            this.f345c = c0077n;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: b */
        IntentFilter mo373b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: c */
        public int mo374c() {
            return this.f345c.m429d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0070g.m
        /* renamed from: d */
        public void mo375d() {
            LayoutInflaterFactory2C0070g.this.mo284e();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$o */
    static class o {
        /* renamed from: a */
        static void m378a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.densityDpi;
            int i3 = configuration2.densityDpi;
            if (i2 != i3) {
                configuration3.densityDpi = i3;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$p */
    static class p {
        /* renamed from: a */
        static void m379a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$q */
    static class q {
        /* renamed from: a */
        static void m380a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i2 = configuration.colorMode & 3;
            int i3 = configuration2.colorMode;
            if (i2 != (i3 & 3)) {
                configuration3.colorMode |= i3 & 3;
            }
            int i4 = configuration.colorMode & 12;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 12)) {
                configuration3.colorMode |= i5 & 12;
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$r */
    private static class r {
        /* renamed from: a */
        static void m381a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$s */
    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m382c(int i2, int i3) {
            return i2 < -5 || i3 < -5 || i2 > getWidth() + 5 || i3 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0070g.this.m345Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m382c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0070g.this.m341S(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(C0833a.m5262d(getContext(), i2));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$t */
    protected static final class t {

        /* renamed from: a */
        int f348a;

        /* renamed from: b */
        int f349b;

        /* renamed from: c */
        int f350c;

        /* renamed from: d */
        int f351d;

        /* renamed from: e */
        int f352e;

        /* renamed from: f */
        int f353f;

        /* renamed from: g */
        ViewGroup f354g;

        /* renamed from: h */
        View f355h;

        /* renamed from: i */
        View f356i;

        /* renamed from: j */
        C0087g f357j;

        /* renamed from: k */
        C0085e f358k;

        /* renamed from: l */
        Context f359l;

        /* renamed from: m */
        boolean f360m;

        /* renamed from: n */
        boolean f361n;

        /* renamed from: o */
        boolean f362o;

        /* renamed from: p */
        public boolean f363p;

        /* renamed from: q */
        boolean f364q = false;

        /* renamed from: r */
        boolean f365r;

        /* renamed from: s */
        Bundle f366s;

        t(int i2) {
            this.f348a = i2;
        }

        /* renamed from: a */
        InterfaceC0094n m383a(InterfaceC0093m.a aVar) {
            if (this.f357j == null) {
                return null;
            }
            if (this.f358k == null) {
                C0085e c0085e = new C0085e(this.f359l, C0829g.f5171j);
                this.f358k = c0085e;
                c0085e.mo496g(aVar);
                this.f357j.m581b(this.f358k);
            }
            return this.f358k.m537j(this.f354g);
        }

        /* renamed from: b */
        public boolean m384b() {
            if (this.f355h == null) {
                return false;
            }
            return this.f356i != null || this.f358k.m536a().getCount() > 0;
        }

        /* renamed from: c */
        void m385c(C0087g c0087g) {
            C0085e c0085e;
            C0087g c0087g2 = this.f357j;
            if (c0087g == c0087g2) {
                return;
            }
            if (c0087g2 != null) {
                c0087g2.m570Q(this.f358k);
            }
            this.f357j = c0087g;
            if (c0087g == null || (c0085e = this.f358k) == null) {
                return;
            }
            c0087g.m581b(c0085e);
        }

        /* renamed from: d */
        void m386d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(C0823a.f5027a, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                themeNewTheme.applyStyle(i2, true);
            }
            themeNewTheme.resolveAttribute(C0823a.f5017F, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            } else {
                themeNewTheme.applyStyle(C0831i.f5196c, true);
            }
            C0844d c0844d = new C0844d(context, 0);
            c0844d.getTheme().setTo(themeNewTheme);
            this.f359l = c0844d;
            TypedArray typedArrayObtainStyledAttributes = c0844d.obtainStyledAttributes(C0832j.f5454z0);
            this.f349b = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5210C0, 0);
            this.f353f = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5205B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$u */
    private final class u implements InterfaceC0093m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: b */
        public void mo366b(C0087g c0087g, boolean z) {
            C0087g c0087gMo560F = c0087g.mo560F();
            boolean z2 = c0087gMo560F != c0087g;
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
            if (z2) {
                c0087g = c0087gMo560F;
            }
            t tVarM350d0 = layoutInflaterFactory2C0070g.m350d0(c0087g);
            if (tVarM350d0 != null) {
                if (!z2) {
                    LayoutInflaterFactory2C0070g.this.m342T(tVarM350d0, z);
                } else {
                    LayoutInflaterFactory2C0070g.this.m338P(tVarM350d0.f348a, tVarM350d0, c0087gMo560F);
                    LayoutInflaterFactory2C0070g.this.m342T(tVarM350d0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
        /* renamed from: c */
        public boolean mo367c(C0087g c0087g) {
            Window.Callback callbackM354k0;
            if (c0087g != c0087g.mo560F()) {
                return true;
            }
            LayoutInflaterFactory2C0070g layoutInflaterFactory2C0070g = LayoutInflaterFactory2C0070g.this;
            if (!layoutInflaterFactory2C0070g.f288L || (callbackM354k0 = layoutInflaterFactory2C0070g.m354k0()) == null || LayoutInflaterFactory2C0070g.this.f300X) {
                return true;
            }
            callbackM354k0.onMenuOpened(108, c0087g);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        f272j = z;
        f273k = new int[]{R.attr.windowBackground};
        f274l = !"robolectric".equals(Build.FINGERPRINT);
        f275m = i2 >= 17;
        if (!z || f276n) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        f276n = true;
    }

    LayoutInflaterFactory2C0070g(Activity activity, InterfaceC0068e interfaceC0068e) {
        this(activity, null, interfaceC0068e, activity);
    }

    /* renamed from: C0 */
    private void m302C0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.f362o || this.f300X) {
            return;
        }
        if (tVar.f348a == 0) {
            if ((this.f315p.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackM354k0 = m354k0();
        if (callbackM354k0 != null && !callbackM354k0.onMenuOpened(tVar.f348a, tVar.f357j)) {
            m342T(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f315p.getSystemService("window");
        if (windowManager != null && m304F0(tVar, keyEvent)) {
            ViewGroup viewGroup = tVar.f354g;
            if (viewGroup != null && !tVar.f364q) {
                View view = tVar.f356i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                tVar.f361n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, tVar.f351d, tVar.f352e, 1002, 8519680, -3);
                layoutParams2.gravity = tVar.f350c;
                layoutParams2.windowAnimations = tVar.f353f;
                windowManager.addView(tVar.f354g, layoutParams2);
                tVar.f362o = true;
            }
            if (viewGroup == null) {
                if (!m327n0(tVar) || tVar.f354g == null) {
                    return;
                }
            } else if (tVar.f364q && viewGroup.getChildCount() > 0) {
                tVar.f354g.removeAllViews();
            }
            if (!m326m0(tVar) || !tVar.m384b()) {
                tVar.f364q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = tVar.f355h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            tVar.f354g.setBackgroundResource(tVar.f349b);
            ViewParent parent = tVar.f355h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tVar.f355h);
            }
            tVar.f354g.addView(tVar.f355h, layoutParams3);
            if (!tVar.f355h.hasFocus()) {
                tVar.f355h.requestFocus();
            }
            i2 = -2;
            tVar.f361n = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, tVar.f351d, tVar.f352e, 1002, 8519680, -3);
            layoutParams22.gravity = tVar.f350c;
            layoutParams22.windowAnimations = tVar.f353f;
            windowManager.addView(tVar.f354g, layoutParams22);
            tVar.f362o = true;
        }
    }

    /* renamed from: E0 */
    private boolean m303E0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        C0087g c0087g;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f360m || m304F0(tVar, keyEvent)) && (c0087g = tVar.f357j) != null) {
            zPerformShortcut = c0087g.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f322w == null) {
            m342T(tVar, true);
        }
        return zPerformShortcut;
    }

    /* renamed from: F0 */
    private boolean m304F0(t tVar, KeyEvent keyEvent) {
        InterfaceC0196w interfaceC0196w;
        InterfaceC0196w interfaceC0196w2;
        InterfaceC0196w interfaceC0196w3;
        if (this.f300X) {
            return false;
        }
        if (tVar.f360m) {
            return true;
        }
        t tVar2 = this.f295S;
        if (tVar2 != null && tVar2 != tVar) {
            m342T(tVar2, false);
        }
        Window.Callback callbackM354k0 = m354k0();
        if (callbackM354k0 != null) {
            tVar.f356i = callbackM354k0.onCreatePanelView(tVar.f348a);
        }
        int i2 = tVar.f348a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (interfaceC0196w3 = this.f322w) != null) {
            interfaceC0196w3.mo686c();
        }
        if (tVar.f356i == null && (!z || !(m335D0() instanceof C0075l))) {
            C0087g c0087g = tVar.f357j;
            if (c0087g == null || tVar.f365r) {
                if (c0087g == null && (!m328o0(tVar) || tVar.f357j == null)) {
                    return false;
                }
                if (z && this.f322w != null) {
                    if (this.f323x == null) {
                        this.f323x = new i();
                    }
                    this.f322w.mo684a(tVar.f357j, this.f323x);
                }
                tVar.f357j.m592h0();
                if (!callbackM354k0.onCreatePanelMenu(tVar.f348a, tVar.f357j)) {
                    tVar.m385c(null);
                    if (z && (interfaceC0196w = this.f322w) != null) {
                        interfaceC0196w.mo684a(null, this.f323x);
                    }
                    return false;
                }
                tVar.f365r = false;
            }
            tVar.f357j.m592h0();
            Bundle bundle = tVar.f366s;
            if (bundle != null) {
                tVar.f357j.m571R(bundle);
                tVar.f366s = null;
            }
            if (!callbackM354k0.onPreparePanel(0, tVar.f356i, tVar.f357j)) {
                if (z && (interfaceC0196w2 = this.f322w) != null) {
                    interfaceC0196w2.mo684a(null, this.f323x);
                }
                tVar.f357j.m590g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f363p = z2;
            tVar.f357j.setQwertyMode(z2);
            tVar.f357j.m590g0();
        }
        tVar.f360m = true;
        tVar.f361n = false;
        this.f295S = tVar;
        return true;
    }

    /* renamed from: G0 */
    private void m305G0(boolean z) {
        InterfaceC0196w interfaceC0196w = this.f322w;
        if (interfaceC0196w == null || !interfaceC0196w.mo687d() || (ViewConfiguration.get(this.f315p).hasPermanentMenuKey() && !this.f322w.mo688e())) {
            t tVarM352i0 = m352i0(0, true);
            tVarM352i0.f364q = true;
            m342T(tVarM352i0, false);
            m302C0(tVarM352i0, null);
            return;
        }
        Window.Callback callbackM354k0 = m354k0();
        if (this.f322w.mo685b() && z) {
            this.f322w.mo689f();
            if (this.f300X) {
                return;
            }
            callbackM354k0.onPanelClosed(108, m352i0(0, true).f357j);
            return;
        }
        if (callbackM354k0 == null || this.f300X) {
            return;
        }
        if (this.f307e0 && (this.f308f0 & 1) != 0) {
            this.f316q.getDecorView().removeCallbacks(this.f309g0);
            this.f309g0.run();
        }
        t tVarM352i02 = m352i0(0, true);
        C0087g c0087g = tVarM352i02.f357j;
        if (c0087g == null || tVarM352i02.f365r || !callbackM354k0.onPreparePanel(0, tVarM352i02.f356i, c0087g)) {
            return;
        }
        callbackM354k0.onMenuOpened(108, tVarM352i02.f357j);
        this.f322w.mo690g();
    }

    /* renamed from: H0 */
    private int m306H0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    /* renamed from: J0 */
    private boolean m307J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f316q.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C0311u.m2101N((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: L */
    private boolean m308L(boolean z) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        if (this.f300X) {
            return false;
        }
        int iM314O = m314O();
        boolean zM313N0 = m313N0(m356s0(this.f315p, iM314O), z);
        if (iM314O == 0) {
            m324h0(this.f315p).m377e();
        } else {
            m mVar = this.f305c0;
            if (mVar != null) {
                mVar.m376a();
            }
        }
        if (iM314O == 3) {
            m323g0(this.f315p).m377e();
        } else {
            m mVar2 = this.f306d0;
            if (mVar2 != null) {
                mVar2.m376a();
            }
        }
        return zM313N0;
    }

    /* renamed from: L0 */
    private void m309L0() {
        if (this.f282F) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: M */
    private void m310M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f283G.findViewById(R.id.content);
        View decorView = this.f316q.getDecorView();
        contentFrameLayout.m772b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f315p.obtainStyledAttributes(C0832j.f5454z0);
        typedArrayObtainStyledAttributes.getValue(C0832j.f5255L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(C0832j.f5260M0, contentFrameLayout.getMinWidthMinor());
        int i2 = C0832j.f5245J0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = C0832j.f5250K0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = C0832j.f5235H0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = C0832j.f5240I0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: M0 */
    private ActivityC0067d m311M0() {
        for (Context baseContext = this.f315p; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof ActivityC0067d) {
                return (ActivityC0067d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: N */
    private void m312N(Window window) {
        if (this.f316q != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof k) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        k kVar = new k(callback);
        this.f317r = kVar;
        window.setCallback(kVar);
        C0185q0 c0185q0M1090u = C0185q0.m1090u(this.f315p, null, f273k);
        Drawable drawableM1099h = c0185q0M1090u.m1099h(0);
        if (drawableM1099h != null) {
            window.setBackgroundDrawable(drawableM1099h);
        }
        c0185q0M1090u.m1111w();
        this.f316q = window;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m313N0(int r7, boolean r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            android.content.Context r0 = r6.f315p
            r1 = 0
            android.content.res.Configuration r0 = r6.m318U(r0, r7, r1)
            boolean r2 = r6.m330q0()
            android.content.Context r3 = r6.f315p
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L47
            if (r8 == 0) goto L47
            if (r2 != 0) goto L47
            boolean r8 = r6.f297U
            if (r8 == 0) goto L47
            boolean r8 = androidx.appcompat.app.LayoutInflaterFactory2C0070g.f274l
            if (r8 != 0) goto L30
            boolean r8 = r6.f298V
            if (r8 == 0) goto L47
        L30:
            java.lang.Object r8 = r6.f314o
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L47
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L47
            java.lang.Object r8 = r6.f314o
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0237a.m1524p(r8)
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            if (r8 != 0) goto L50
            if (r3 == r0) goto L50
            r6.m315O0(r0, r2, r1)
            goto L51
        L50:
            r4 = r8
        L51:
            if (r4 == 0) goto L5e
            java.lang.Object r8 = r6.f314o
            boolean r0 = r8 instanceof androidx.appcompat.app.ActivityC0067d
            if (r0 == 0) goto L5e
            androidx.appcompat.app.d r8 = (androidx.appcompat.app.ActivityC0067d) r8
            r8.onNightModeChanged(r7)
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0070g.m313N0(int, boolean):boolean");
    }

    /* renamed from: O */
    private int m314O() {
        int i2 = this.f301Y;
        return i2 != -100 ? i2 : AbstractC0069f.m274l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O0 */
    private void m315O0(int i2, boolean z, Configuration configuration) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Resources resources = this.f315p.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            C0074k.m413a(resources);
        }
        int i4 = this.f302Z;
        if (i4 != 0) {
            this.f315p.setTheme(i4);
            if (i3 >= 23) {
                this.f315p.getTheme().applyStyle(this.f302Z, true);
            }
        }
        if (z) {
            Object obj = this.f314o;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof InterfaceC0515k) {
                    if (((InterfaceC0515k) activity).getLifecycle().mo3862b().m3867g(AbstractC0511g.c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f299W) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: Q0 */
    private void m316Q0(View view) {
        view.setBackgroundColor((C0311u.m2095H(view) & 8192) != 0 ? C0255a.m1675d(this.f315p, C0825c.f5055b) : C0255a.m1675d(this.f315p, C0825c.f5054a));
    }

    /* renamed from: R */
    private void m317R() {
        m mVar = this.f305c0;
        if (mVar != null) {
            mVar.m376a();
        }
        m mVar2 = this.f306d0;
        if (mVar2 != null) {
            mVar2.m376a();
        }
    }

    /* renamed from: U */
    private Configuration m318U(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* renamed from: V */
    private ViewGroup m319V() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f315p.obtainStyledAttributes(C0832j.f5454z0);
        int i2 = C0832j.f5220E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0832j.f5265N0, false)) {
            mo275C(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            mo275C(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0832j.f5225F0, false)) {
            mo275C(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(C0832j.f5230G0, false)) {
            mo275C(10);
        }
        this.f291O = typedArrayObtainStyledAttributes.getBoolean(C0832j.f5200A0, false);
        typedArrayObtainStyledAttributes.recycle();
        m321c0();
        this.f316q.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f315p);
        if (this.f292P) {
            viewGroup = this.f290N ? (ViewGroup) layoutInflaterFrom.inflate(C0829g.f5176o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(C0829g.f5175n, (ViewGroup) null);
        } else if (this.f291O) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(C0829g.f5167f, (ViewGroup) null);
            this.f289M = false;
            this.f288L = false;
        } else if (this.f288L) {
            TypedValue typedValue = new TypedValue();
            this.f315p.getTheme().resolveAttribute(C0823a.f5032f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0844d(this.f315p, typedValue.resourceId) : this.f315p).inflate(C0829g.f5177p, (ViewGroup) null);
            InterfaceC0196w interfaceC0196w = (InterfaceC0196w) viewGroup.findViewById(C0828f.f5151p);
            this.f322w = interfaceC0196w;
            interfaceC0196w.setWindowCallback(m354k0());
            if (this.f289M) {
                this.f322w.mo691h(109);
            }
            if (this.f286J) {
                this.f322w.mo691h(2);
            }
            if (this.f287K) {
                this.f322w.mo691h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f288L + ", windowActionBarOverlay: " + this.f289M + ", android:windowIsFloating: " + this.f291O + ", windowActionModeOverlay: " + this.f290N + ", windowNoTitle: " + this.f292P + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            C0311u.m2157v0(viewGroup, new c());
        } else if (viewGroup instanceof InterfaceC0153a0) {
            ((InterfaceC0153a0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.f322w == null) {
            this.f284H = (TextView) viewGroup.findViewById(C0828f.f5132M);
        }
        C0197w0.m1232c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C0828f.f5137b);
        ViewGroup viewGroup2 = (ViewGroup) this.f316q.findViewById(R.id.content);
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
        this.f316q.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    /* renamed from: b0 */
    private void m320b0() {
        if (this.f282F) {
            return;
        }
        this.f283G = m319V();
        CharSequence charSequenceM353j0 = m353j0();
        if (!TextUtils.isEmpty(charSequenceM353j0)) {
            InterfaceC0196w interfaceC0196w = this.f322w;
            if (interfaceC0196w != null) {
                interfaceC0196w.setWindowTitle(charSequenceM353j0);
            } else if (m335D0() != null) {
                m335D0().mo232w(charSequenceM353j0);
            } else {
                TextView textView = this.f284H;
                if (textView != null) {
                    textView.setText(charSequenceM353j0);
                }
            }
        }
        m310M();
        m334B0(this.f283G);
        this.f282F = true;
        t tVarM352i0 = m352i0(0, false);
        if (this.f300X) {
            return;
        }
        if (tVarM352i0 == null || tVarM352i0.f357j == null) {
            m329p0(108);
        }
    }

    /* renamed from: c0 */
    private void m321c0() {
        if (this.f316q == null) {
            Object obj = this.f314o;
            if (obj instanceof Activity) {
                m312N(((Activity) obj).getWindow());
            }
        }
        if (this.f316q == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: e0 */
    private static Configuration m322e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                p.m379a(configuration, configuration2, configuration3);
            } else if (!C0954d.m6056a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                q.m380a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                o.m378a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: g0 */
    private m m323g0(Context context) {
        if (this.f306d0 == null) {
            this.f306d0 = new l(context);
        }
        return this.f306d0;
    }

    /* renamed from: h0 */
    private m m324h0(Context context) {
        if (this.f305c0 == null) {
            this.f305c0 = new n(C0077n.m424a(context));
        }
        return this.f305c0;
    }

    /* renamed from: l0 */
    private void m325l0() {
        m320b0();
        if (this.f288L && this.f319t == null) {
            Object obj = this.f314o;
            if (obj instanceof Activity) {
                this.f319t = new C0078o((Activity) this.f314o, this.f289M);
            } else if (obj instanceof Dialog) {
                this.f319t = new C0078o((Dialog) this.f314o);
            }
            AbstractC0064a abstractC0064a = this.f319t;
            if (abstractC0064a != null) {
                abstractC0064a.mo226q(this.f310h0);
            }
        }
    }

    /* renamed from: m0 */
    private boolean m326m0(t tVar) {
        View view = tVar.f356i;
        if (view != null) {
            tVar.f355h = view;
            return true;
        }
        if (tVar.f357j == null) {
            return false;
        }
        if (this.f324y == null) {
            this.f324y = new u();
        }
        View view2 = (View) tVar.m383a(this.f324y);
        tVar.f355h = view2;
        return view2 != null;
    }

    /* renamed from: n0 */
    private boolean m327n0(t tVar) {
        tVar.m386d(m351f0());
        tVar.f354g = new s(tVar.f359l);
        tVar.f350c = 81;
        return true;
    }

    /* renamed from: o0 */
    private boolean m328o0(t tVar) {
        Context context = this.f315p;
        int i2 = tVar.f348a;
        if ((i2 == 0 || i2 == 108) && this.f322w != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C0823a.f5032f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(C0823a.f5033g, typedValue, true);
            } else {
                theme.resolveAttribute(C0823a.f5033g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                C0844d c0844d = new C0844d(context, 0);
                c0844d.getTheme().setTo(themeNewTheme);
                context = c0844d;
            }
        }
        C0087g c0087g = new C0087g(context);
        c0087g.mo575V(this);
        tVar.m385c(c0087g);
        return true;
    }

    /* renamed from: p0 */
    private void m329p0(int i2) {
        this.f308f0 = (1 << i2) | this.f308f0;
        if (this.f307e0) {
            return;
        }
        C0311u.m2115a0(this.f316q.getDecorView(), this.f309g0);
        this.f307e0 = true;
    }

    /* renamed from: q0 */
    private boolean m330q0() throws PackageManager.NameNotFoundException {
        if (!this.f304b0 && (this.f314o instanceof Activity)) {
            PackageManager packageManager = this.f315p.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f315p, this.f314o.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                this.f303a0 = (activityInfo == null || (activityInfo.configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.f303a0 = false;
            }
        }
        this.f304b0 = true;
        return this.f303a0;
    }

    /* renamed from: v0 */
    private boolean m331v0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarM352i0 = m352i0(i2, true);
        if (tVarM352i0.f362o) {
            return false;
        }
        return m304F0(tVarM352i0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m332y0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            c.a.o.b r0 = r4.f325z
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.g$t r2 = r4.m352i0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.w r5 = r4.f322w
            if (r5 == 0) goto L43
            boolean r5 = r5.mo687d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f315p
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.w r5 = r4.f322w
            boolean r5 = r5.mo685b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f300X
            if (r5 != 0) goto L62
            boolean r5 = r4.m304F0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.w r5 = r4.f322w
            boolean r0 = r5.mo690g()
            goto L68
        L3c:
            androidx.appcompat.widget.w r5 = r4.f322w
            boolean r0 = r5.mo689f()
            goto L68
        L43:
            boolean r5 = r2.f362o
            if (r5 != 0) goto L64
            boolean r3 = r2.f361n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f360m
            if (r5 == 0) goto L62
            boolean r5 = r2.f365r
            if (r5 == 0) goto L5b
            r2.f360m = r1
            boolean r5 = r4.m304F0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.m302C0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.m342T(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f315p
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0070g.m332y0(int, android.view.KeyEvent):boolean");
    }

    /* renamed from: A0 */
    void m333A0(int i2) {
        if (i2 == 108) {
            AbstractC0064a abstractC0064aMo291p = mo291p();
            if (abstractC0064aMo291p != null) {
                abstractC0064aMo291p.mo217h(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            t tVarM352i0 = m352i0(i2, true);
            if (tVarM352i0.f362o) {
                m342T(tVarM352i0, false);
            }
        }
    }

    /* renamed from: B0 */
    void m334B0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: C */
    public boolean mo275C(int i2) {
        int iM306H0 = m306H0(i2);
        if (this.f292P && iM306H0 == 108) {
            return false;
        }
        if (this.f288L && iM306H0 == 1) {
            this.f288L = false;
        }
        if (iM306H0 == 1) {
            m309L0();
            this.f292P = true;
            return true;
        }
        if (iM306H0 == 2) {
            m309L0();
            this.f286J = true;
            return true;
        }
        if (iM306H0 == 5) {
            m309L0();
            this.f287K = true;
            return true;
        }
        if (iM306H0 == 10) {
            m309L0();
            this.f290N = true;
            return true;
        }
        if (iM306H0 == 108) {
            m309L0();
            this.f288L = true;
            return true;
        }
        if (iM306H0 != 109) {
            return this.f316q.requestFeature(iM306H0);
        }
        m309L0();
        this.f289M = true;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: D */
    public void mo276D(int i2) {
        m320b0();
        ViewGroup viewGroup = (ViewGroup) this.f283G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f315p).inflate(i2, viewGroup);
        this.f317r.m5370a().onContentChanged();
    }

    /* renamed from: D0 */
    final AbstractC0064a m335D0() {
        return this.f319t;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: E */
    public void mo277E(View view) {
        m320b0();
        ViewGroup viewGroup = (ViewGroup) this.f283G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f317r.m5370a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: F */
    public void mo278F(View view, ViewGroup.LayoutParams layoutParams) {
        m320b0();
        ViewGroup viewGroup = (ViewGroup) this.f283G.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f317r.m5370a().onContentChanged();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: H */
    public void mo279H(Toolbar toolbar) {
        if (this.f314o instanceof Activity) {
            AbstractC0064a abstractC0064aMo291p = mo291p();
            if (abstractC0064aMo291p instanceof C0078o) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f320u = null;
            if (abstractC0064aMo291p != null) {
                abstractC0064aMo291p.mo222m();
            }
            if (toolbar != null) {
                C0075l c0075l = new C0075l(toolbar, m353j0(), this.f317r);
                this.f319t = c0075l;
                this.f316q.setCallback(c0075l.m421z());
            } else {
                this.f319t = null;
                this.f316q.setCallback(this.f317r);
            }
            mo293r();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: I */
    public void mo280I(int i2) {
        this.f302Z = i2;
    }

    /* renamed from: I0 */
    final boolean m336I0() {
        ViewGroup viewGroup;
        return this.f282F && (viewGroup = this.f283G) != null && C0311u.m2102O(viewGroup);
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: J */
    public final void mo281J(CharSequence charSequence) {
        this.f321v = charSequence;
        InterfaceC0196w interfaceC0196w = this.f322w;
        if (interfaceC0196w != null) {
            interfaceC0196w.setWindowTitle(charSequence);
            return;
        }
        if (m335D0() != null) {
            m335D0().mo232w(charSequence);
            return;
        }
        TextView textView = this.f284H;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: K */
    public AbstractC0842b mo282K(AbstractC0842b.a aVar) {
        InterfaceC0068e interfaceC0068e;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0842b abstractC0842b = this.f325z;
        if (abstractC0842b != null) {
            abstractC0842b.mo452c();
        }
        j jVar = new j(aVar);
        AbstractC0064a abstractC0064aMo291p = mo291p();
        if (abstractC0064aMo291p != null) {
            AbstractC0842b abstractC0842bMo233x = abstractC0064aMo291p.mo233x(jVar);
            this.f325z = abstractC0842bMo233x;
            if (abstractC0842bMo233x != null && (interfaceC0068e = this.f318s) != null) {
                interfaceC0068e.onSupportActionModeStarted(abstractC0842bMo233x);
            }
        }
        if (this.f325z == null) {
            this.f325z = m337K0(jVar);
        }
        return this.f325z;
    }

    /* renamed from: K0 */
    AbstractC0842b m337K0(AbstractC0842b.a aVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0842b abstractC0842bOnWindowStartingSupportActionMode;
        Context c0844d;
        InterfaceC0068e interfaceC0068e;
        m348a0();
        AbstractC0842b abstractC0842b = this.f325z;
        if (abstractC0842b != null) {
            abstractC0842b.mo452c();
        }
        if (!(aVar instanceof j)) {
            aVar = new j(aVar);
        }
        InterfaceC0068e interfaceC0068e2 = this.f318s;
        if (interfaceC0068e2 == null || this.f300X) {
            abstractC0842bOnWindowStartingSupportActionMode = null;
        } else {
            try {
                abstractC0842bOnWindowStartingSupportActionMode = interfaceC0068e2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (abstractC0842bOnWindowStartingSupportActionMode != null) {
            this.f325z = abstractC0842bOnWindowStartingSupportActionMode;
        } else {
            if (this.f277A == null) {
                if (this.f291O) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f315p.getTheme();
                    theme.resolveAttribute(C0823a.f5032f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f315p.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        c0844d = new C0844d(this.f315p, 0);
                        c0844d.getTheme().setTo(themeNewTheme);
                    } else {
                        c0844d = this.f315p;
                    }
                    this.f277A = new ActionBarContextView(c0844d);
                    PopupWindow popupWindow = new PopupWindow(c0844d, (AttributeSet) null, C0823a.f5035i);
                    this.f278B = popupWindow;
                    C0329j.m2318b(popupWindow, 2);
                    this.f278B.setContentView(this.f277A);
                    this.f278B.setWidth(-1);
                    c0844d.getTheme().resolveAttribute(C0823a.f5028b, typedValue, true);
                    this.f277A.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, c0844d.getResources().getDisplayMetrics()));
                    this.f278B.setHeight(-2);
                    this.f279C = new f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f283G.findViewById(C0828f.f5143h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m351f0()));
                        this.f277A = (ActionBarContextView) viewStubCompat.m883a();
                    }
                }
            }
            if (this.f277A != null) {
                m348a0();
                this.f277A.m674k();
                C0845e c0845e = new C0845e(this.f277A.getContext(), this.f277A, aVar, this.f278B == null);
                if (aVar.mo369b(c0845e, c0845e.mo454e())) {
                    c0845e.mo458k();
                    this.f277A.m672h(c0845e);
                    this.f325z = c0845e;
                    if (m336I0()) {
                        this.f277A.setAlpha(0.0f);
                        C0315y c0315yM2217a = C0311u.m2118c(this.f277A).m2217a(1.0f);
                        this.f280D = c0315yM2217a;
                        c0315yM2217a.m2222f(new g());
                    } else {
                        this.f277A.setAlpha(1.0f);
                        this.f277A.setVisibility(0);
                        this.f277A.sendAccessibilityEvent(32);
                        if (this.f277A.getParent() instanceof View) {
                            C0311u.m2125f0((View) this.f277A.getParent());
                        }
                    }
                    if (this.f278B != null) {
                        this.f316q.getDecorView().post(this.f279C);
                    }
                } else {
                    this.f325z = null;
                }
            }
        }
        AbstractC0842b abstractC0842b2 = this.f325z;
        if (abstractC0842b2 != null && (interfaceC0068e = this.f318s) != null) {
            interfaceC0068e.onSupportActionModeStarted(abstractC0842b2);
        }
        return this.f325z;
    }

    /* renamed from: P */
    void m338P(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.f294R;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.f357j;
            }
        }
        if ((tVar == null || tVar.f362o) && !this.f300X) {
            this.f317r.m5370a().onPanelClosed(i2, menu);
        }
    }

    /* renamed from: P0 */
    final int m339P0(C0285c0 c0285c0, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        boolean z2;
        int iM1884k = c0285c0 != null ? c0285c0.m1884k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f277A;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f277A.getLayoutParams();
            if (this.f277A.isShown()) {
                if (this.f311i0 == null) {
                    this.f311i0 = new Rect();
                    this.f312j0 = new Rect();
                }
                Rect rect2 = this.f311i0;
                Rect rect3 = this.f312j0;
                if (c0285c0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0285c0.m1882i(), c0285c0.m1884k(), c0285c0.m1883j(), c0285c0.m1881h());
                }
                C0197w0.m1230a(this.f283G, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C0285c0 c0285c0M2092E = C0311u.m2092E(this.f283G);
                int iM1882i = c0285c0M2092E == null ? 0 : c0285c0M2092E.m1882i();
                int iM1883j = c0285c0M2092E == null ? 0 : c0285c0M2092E.m1883j();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f285I != null) {
                    View view = this.f285I;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iM1882i || marginLayoutParams2.rightMargin != iM1883j) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iM1882i;
                            marginLayoutParams2.rightMargin = iM1883j;
                            this.f285I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f315p);
                    this.f285I = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM1882i;
                    layoutParams.rightMargin = iM1883j;
                    this.f283G.addView(this.f285I, -1, layoutParams);
                }
                View view3 = this.f285I;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    m316Q0(this.f285I);
                }
                if (!this.f290N && z) {
                    iM1884k = 0;
                }
                z = z;
                z = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                this.f277A.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f285I;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return iM1884k;
    }

    /* renamed from: Q */
    void m340Q(C0087g c0087g) {
        if (this.f293Q) {
            return;
        }
        this.f293Q = true;
        this.f322w.mo692i();
        Window.Callback callbackM354k0 = m354k0();
        if (callbackM354k0 != null && !this.f300X) {
            callbackM354k0.onPanelClosed(108, c0087g);
        }
        this.f293Q = false;
    }

    /* renamed from: S */
    void m341S(int i2) {
        m342T(m352i0(i2, true), true);
    }

    /* renamed from: T */
    void m342T(t tVar, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0196w interfaceC0196w;
        if (z && tVar.f348a == 0 && (interfaceC0196w = this.f322w) != null && interfaceC0196w.mo685b()) {
            m340Q(tVar.f357j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f315p.getSystemService("window");
        if (windowManager != null && tVar.f362o && (viewGroup = tVar.f354g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m338P(tVar.f348a, tVar, null);
            }
        }
        tVar.f360m = false;
        tVar.f361n = false;
        tVar.f362o = false;
        tVar.f355h = null;
        tVar.f364q = true;
        if (this.f295S == tVar) {
            this.f295S = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: W */
    public View m343W(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean zM307J0 = false;
        if (this.f313k0 == null) {
            String string = this.f315p.obtainStyledAttributes(C0832j.f5454z0).getString(C0832j.f5215D0);
            if (string == null) {
                this.f313k0 = new C0073j();
            } else {
                try {
                    this.f313k0 = (C0073j) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f313k0 = new C0073j();
                }
            }
        }
        boolean z2 = f272j;
        if (z2) {
            if (!(attributeSet instanceof XmlPullParser)) {
                zM307J0 = m307J0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                zM307J0 = true;
            }
            z = zM307J0;
        } else {
            z = false;
        }
        return this.f313k0.m411q(view, str, context, attributeSet, z, z2, true, C0195v0.m1228b());
    }

    /* renamed from: X */
    void m344X() {
        C0087g c0087g;
        InterfaceC0196w interfaceC0196w = this.f322w;
        if (interfaceC0196w != null) {
            interfaceC0196w.mo692i();
        }
        if (this.f278B != null) {
            this.f316q.getDecorView().removeCallbacks(this.f279C);
            if (this.f278B.isShowing()) {
                try {
                    this.f278B.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f278B = null;
        }
        m348a0();
        t tVarM352i0 = m352i0(0, false);
        if (tVarM352i0 == null || (c0087g = tVarM352i0.f357j) == null) {
            return;
        }
        c0087g.close();
    }

    /* renamed from: Y */
    boolean m345Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f314o;
        if (((obj instanceof C0293e.a) || (obj instanceof DialogC0071h)) && (decorView = this.f316q.getDecorView()) != null && C0293e.m2037d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f317r.m5370a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? m358u0(keyCode, keyEvent) : m360x0(keyCode, keyEvent);
    }

    /* renamed from: Z */
    void m346Z(int i2) {
        t tVarM352i0;
        t tVarM352i02 = m352i0(i2, true);
        if (tVarM352i02.f357j != null) {
            Bundle bundle = new Bundle();
            tVarM352i02.f357j.m573T(bundle);
            if (bundle.size() > 0) {
                tVarM352i02.f366s = bundle;
            }
            tVarM352i02.f357j.m592h0();
            tVarM352i02.f357j.clear();
        }
        tVarM352i02.f365r = true;
        tVarM352i02.f364q = true;
        if ((i2 != 108 && i2 != 0) || this.f322w == null || (tVarM352i0 = m352i0(0, false)) == null) {
            return;
        }
        tVarM352i0.f360m = false;
        m304F0(tVarM352i0, null);
    }

    @Override // androidx.appcompat.view.menu.C0087g.a
    /* renamed from: a */
    public boolean mo347a(C0087g c0087g, MenuItem menuItem) {
        t tVarM350d0;
        Window.Callback callbackM354k0 = m354k0();
        if (callbackM354k0 == null || this.f300X || (tVarM350d0 = m350d0(c0087g.mo560F())) == null) {
            return false;
        }
        return callbackM354k0.onMenuItemSelected(tVarM350d0.f348a, menuItem);
    }

    /* renamed from: a0 */
    void m348a0() {
        C0315y c0315y = this.f280D;
        if (c0315y != null) {
            c0315y.m2218b();
        }
    }

    @Override // androidx.appcompat.view.menu.C0087g.a
    /* renamed from: b */
    public void mo349b(C0087g c0087g) {
        m305G0(true);
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: d */
    public void mo283d(View view, ViewGroup.LayoutParams layoutParams) {
        m320b0();
        ((ViewGroup) this.f283G.findViewById(R.id.content)).addView(view, layoutParams);
        this.f317r.m5370a().onContentChanged();
    }

    /* renamed from: d0 */
    t m350d0(Menu menu) {
        t[] tVarArr = this.f294R;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.f357j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: e */
    public boolean mo284e() {
        return m308L(true);
    }

    /* renamed from: f0 */
    final Context m351f0() {
        AbstractC0064a abstractC0064aMo291p = mo291p();
        Context contextMo219j = abstractC0064aMo291p != null ? abstractC0064aMo291p.mo219j() : null;
        return contextMo219j == null ? this.f315p : contextMo219j;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: h */
    public Context mo286h(Context context) {
        this.f297U = true;
        int iM356s0 = m356s0(context, m314O());
        if (f275m && (context instanceof ContextThemeWrapper)) {
            try {
                r.m381a((ContextThemeWrapper) context, m318U(context, iM356s0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0844d) {
            try {
                ((C0844d) context).m5344a(m318U(context, iM356s0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f274l) {
            return super.mo286h(context);
        }
        try {
            Configuration configuration = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration2 = context.getResources().getConfiguration();
            Configuration configurationM318U = m318U(context, iM356s0, configuration.equals(configuration2) ? null : m322e0(configuration, configuration2));
            C0844d c0844d = new C0844d(context, C0831i.f5197d);
            c0844d.m5344a(configurationM318U);
            boolean z = false;
            try {
                z = context.getTheme() != null;
            } catch (NullPointerException unused3) {
            }
            if (z) {
                C0263f.d.m1763a(c0844d.getTheme());
            }
            return super.mo286h(c0844d);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException("Application failed to obtain resources from itself", e2);
        }
    }

    /* renamed from: i0 */
    protected t m352i0(int i2, boolean z) {
        t[] tVarArr = this.f294R;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f294R = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    /* renamed from: j0 */
    final CharSequence m353j0() {
        Object obj = this.f314o;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f321v;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: k */
    public <T extends View> T mo287k(int i2) {
        m320b0();
        return (T) this.f316q.findViewById(i2);
    }

    /* renamed from: k0 */
    final Window.Callback m354k0() {
        return this.f316q.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: m */
    public final InterfaceC0065b mo288m() {
        return new h();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: n */
    public int mo289n() {
        return this.f301Y;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: o */
    public MenuInflater mo290o() {
        if (this.f320u == null) {
            m325l0();
            AbstractC0064a abstractC0064a = this.f319t;
            this.f320u = new C0847g(abstractC0064a != null ? abstractC0064a.mo219j() : this.f315p);
        }
        return this.f320u;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m343W(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: p */
    public AbstractC0064a mo291p() {
        m325l0();
        return this.f319t;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: q */
    public void mo292q() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f315p);
        if (layoutInflaterFrom.getFactory() == null) {
            C0296f.m2043b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0070g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: r */
    public void mo293r() {
        AbstractC0064a abstractC0064aMo291p = mo291p();
        if (abstractC0064aMo291p == null || !abstractC0064aMo291p.mo220k()) {
            m329p0(0);
        }
    }

    /* renamed from: r0 */
    public boolean m355r0() {
        return this.f281E;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: s */
    public void mo294s(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        AbstractC0064a abstractC0064aMo291p;
        if (this.f288L && this.f282F && (abstractC0064aMo291p = mo291p()) != null) {
            abstractC0064aMo291p.mo221l(configuration);
        }
        C0166h.m1008b().m1015g(this.f315p);
        m308L(false);
    }

    /* renamed from: s0 */
    int m356s0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                    return m324h0(context).mo374c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return m323g0(context).mo374c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: t */
    public void mo295t(Bundle bundle) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, IllegalArgumentException {
        this.f297U = true;
        m308L(false);
        m321c0();
        Object obj = this.f314o;
        if (obj instanceof Activity) {
            String strM1552c = null;
            try {
                strM1552c = C0243g.m1552c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strM1552c != null) {
                AbstractC0064a abstractC0064aM335D0 = m335D0();
                if (abstractC0064aM335D0 == null) {
                    this.f310h0 = true;
                } else {
                    abstractC0064aM335D0.mo226q(true);
                }
            }
            AbstractC0069f.m270c(this);
        }
        this.f298V = true;
    }

    /* renamed from: t0 */
    boolean m357t0() {
        AbstractC0842b abstractC0842b = this.f325z;
        if (abstractC0842b != null) {
            abstractC0842b.mo452c();
            return true;
        }
        AbstractC0064a abstractC0064aMo291p = mo291p();
        return abstractC0064aMo291p != null && abstractC0064aMo291p.mo216g();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo296u() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f314o
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0069f.m267A(r3)
        L9:
            boolean r0 = r3.f307e0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f316q
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f309g0
            r0.removeCallbacks(r1)
        L18:
            r0 = 0
            r3.f299W = r0
            r0 = 1
            r3.f300X = r0
            int r0 = r3.f301Y
            r1 = -100
            if (r0 == r1) goto L48
            java.lang.Object r0 = r3.f314o
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L48
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L48
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0070g.f271i
            java.lang.Object r1 = r3.f314o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f301Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L57
        L48:
            c.e.g<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflaterFactory2C0070g.f271i
            java.lang.Object r1 = r3.f314o
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L57:
            androidx.appcompat.app.a r0 = r3.f319t
            if (r0 == 0) goto L5e
            r0.mo222m()
        L5e:
            r3.m317R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0070g.mo296u():void");
    }

    /* renamed from: u0 */
    boolean m358u0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.f296T = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            m331v0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: v */
    public void mo297v(Bundle bundle) {
        m320b0();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: w */
    public void mo298w() {
        AbstractC0064a abstractC0064aMo291p = mo291p();
        if (abstractC0064aMo291p != null) {
            abstractC0064aMo291p.mo230u(true);
        }
    }

    /* renamed from: w0 */
    boolean m359w0(int i2, KeyEvent keyEvent) {
        AbstractC0064a abstractC0064aMo291p = mo291p();
        if (abstractC0064aMo291p != null && abstractC0064aMo291p.mo223n(i2, keyEvent)) {
            return true;
        }
        t tVar = this.f295S;
        if (tVar != null && m303E0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.f295S;
            if (tVar2 != null) {
                tVar2.f361n = true;
            }
            return true;
        }
        if (this.f295S == null) {
            t tVarM352i0 = m352i0(0, true);
            m304F0(tVarM352i0, keyEvent);
            boolean zM303E0 = m303E0(tVarM352i0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarM352i0.f360m = false;
            if (zM303E0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: x */
    public void mo299x(Bundle bundle) {
    }

    /* renamed from: x0 */
    boolean m360x0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.f296T;
            this.f296T = false;
            t tVarM352i0 = m352i0(0, false);
            if (tVarM352i0 != null && tVarM352i0.f362o) {
                if (!z) {
                    m342T(tVarM352i0, true);
                }
                return true;
            }
            if (m357t0()) {
                return true;
            }
        } else if (i2 == 82) {
            m332y0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: y */
    public void mo300y() {
        this.f299W = true;
        mo284e();
    }

    @Override // androidx.appcompat.app.AbstractC0069f
    /* renamed from: z */
    public void mo301z() {
        this.f299W = false;
        AbstractC0064a abstractC0064aMo291p = mo291p();
        if (abstractC0064aMo291p != null) {
            abstractC0064aMo291p.mo230u(false);
        }
    }

    /* renamed from: z0 */
    void m361z0(int i2) {
        AbstractC0064a abstractC0064aMo291p;
        if (i2 != 108 || (abstractC0064aMo291p = mo291p()) == null) {
            return;
        }
        abstractC0064aMo291p.mo217h(true);
    }

    LayoutInflaterFactory2C0070g(Dialog dialog, InterfaceC0068e interfaceC0068e) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0068e, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C0070g(Context context, Window window, InterfaceC0068e interfaceC0068e, Object obj) {
        C0873g<String, Integer> c0873g;
        Integer num;
        ActivityC0067d activityC0067dM311M0;
        this.f280D = null;
        this.f281E = true;
        this.f301Y = -100;
        this.f309g0 = new b();
        this.f315p = context;
        this.f318s = interfaceC0068e;
        this.f314o = obj;
        if (this.f301Y == -100 && (obj instanceof Dialog) && (activityC0067dM311M0 = m311M0()) != null) {
            this.f301Y = activityC0067dM311M0.getDelegate().mo289n();
        }
        if (this.f301Y == -100 && (num = (c0873g = f271i).get(obj.getClass().getName())) != null) {
            this.f301Y = num.intValue();
            c0873g.remove(obj.getClass().getName());
        }
        if (window != null) {
            m312N(window);
        }
        C0166h.m1010h();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: androidx.appcompat.app.g$k */
    class k extends WindowCallbackC0849i {
        k(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        final ActionMode m372b(ActionMode.Callback callback) {
            C0846f.a aVar = new C0846f.a(LayoutInflaterFactory2C0070g.this.f315p, callback);
            AbstractC0842b abstractC0842bMo282K = LayoutInflaterFactory2C0070g.this.mo282K(aVar);
            if (abstractC0842bMo282K != null) {
                return aVar.m5348e(abstractC0842bMo282K);
            }
            return null;
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0070g.this.m345Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0070g.this.m359w0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof C0087g)) {
                return super.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            super.onMenuOpened(i2, menu);
            LayoutInflaterFactory2C0070g.this.m361z0(i2);
            return true;
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            super.onPanelClosed(i2, menu);
            LayoutInflaterFactory2C0070g.this.m333A0(i2);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            C0087g c0087g = menu instanceof C0087g ? (C0087g) menu : null;
            if (i2 == 0 && c0087g == null) {
                return false;
            }
            if (c0087g != null) {
                c0087g.m588e0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i2, view, menu);
            if (c0087g != null) {
                c0087g.m588e0(false);
            }
            return zOnPreparePanel;
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            C0087g c0087g;
            t tVarM352i0 = LayoutInflaterFactory2C0070g.this.m352i0(0, true);
            if (tVarM352i0 == null || (c0087g = tVarM352i0.f357j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i2);
            } else {
                super.onProvideKeyboardShortcuts(list, c0087g, i2);
            }
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C0070g.this.m355r0() ? m372b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // p024c.p025a.p032o.WindowCallbackC0849i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            if (LayoutInflaterFactory2C0070g.this.m355r0() && i2 == 0) {
                return m372b(callback);
            }
            return super.onWindowStartingActionMode(callback, i2);
        }
    }
}
