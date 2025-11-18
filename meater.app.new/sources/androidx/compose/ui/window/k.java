package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.C2098e0;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.ui.platform.n1;
import d.AbstractC2994F;
import d.I;
import java.util.UUID;
import kotlin.AbstractC1564q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s1.C4442k0;
import t3.C4550g;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0004H\u0016¢\u0006\u0004\b&\u0010 R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\u0002018\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00067"}, d2 = {"Landroidx/compose/ui/window/k;", "Ld/r;", "Landroidx/compose/ui/platform/n1;", "Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Landroidx/compose/ui/window/j;", "properties", "Landroid/view/View;", "composeView", "LU0/t;", "layoutDirection", "LU0/d;", "density", "Ljava/util/UUID;", "dialogId", "<init>", "(LBa/a;Landroidx/compose/ui/window/j;Landroid/view/View;LU0/t;LU0/d;Ljava/util/UUID;)V", "m", "(LU0/t;)V", "Landroidx/compose/ui/window/t;", "securePolicy", "n", "(Landroidx/compose/ui/window/t;)V", "LO/q;", "parentComposition", "children", "l", "(LO/q;LBa/p;)V", "o", "(LBa/a;Landroidx/compose/ui/window/j;LU0/t;)V", "k", "()V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "cancel", "E", "LBa/a;", "F", "Landroidx/compose/ui/window/j;", "G", "Landroid/view/View;", "Landroidx/compose/ui/window/i;", "H", "Landroidx/compose/ui/window/i;", "dialogLayout", "LU0/h;", "I", "maxSupportedElevation", "", "J", "defaultSoftInputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class k extends d.r implements n1 {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onDismissRequest;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private j properties;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final View composeView;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final i dialogLayout;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private final float maxSupportedElevation;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final int defaultSoftInputMode;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/window/k$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "result", "Loa/F;", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline result) {
            result.setRect(0, 0, view.getWidth(), view.getHeight());
            result.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld/F;", "Loa/F;", "a", "(Ld/F;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<AbstractC2994F, C4153F> {
        b() {
            super(1);
        }

        public final void a(AbstractC2994F abstractC2994F) {
            if (k.this.properties.getDismissOnBackPress()) {
                k.this.onDismissRequest.invoke();
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(AbstractC2994F abstractC2994F) {
            a(abstractC2994F);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23713a;

        static {
            int[] iArr = new int[U0.t.values().length];
            try {
                iArr[U0.t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U0.t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23713a = iArr;
        }
    }

    public k(Ba.a<C4153F> aVar, j jVar, View view, U0.t tVar, U0.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || jVar.getDecorFitsSystemWindows()) ? b0.n.f29991a : b0.n.f29992b), 0, 2, null);
        this.onDismissRequest = aVar;
        this.properties = jVar;
        this.composeView = view;
        float fU = U0.h.u(8);
        this.maxSupportedElevation = fU;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        this.defaultSoftInputMode = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        C4442k0.b(window, this.properties.getDecorFitsSystemWindows());
        i iVar = new i(getContext(), window);
        iVar.setTag(b0.l.f29942H, "Dialog:" + uuid);
        iVar.setClipChildren(false);
        iVar.setElevation(dVar.X0(fU));
        iVar.setOutlineProvider(new a());
        this.dialogLayout = iVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            f(viewGroup);
        }
        setContentView(iVar);
        android.view.View.b(iVar, android.view.View.a(view));
        C2098e0.b(iVar, C2098e0.a(view));
        C4550g.b(iVar, C4550g.a(view));
        o(this.onDismissRequest, this.properties, tVar);
        I.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void f(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof i) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                f(viewGroup2);
            }
        }
    }

    private final void m(U0.t layoutDirection) {
        i iVar = this.dialogLayout;
        int i10 = c.f23713a[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        iVar.setLayoutDirection(i11);
    }

    private final void n(t securePolicy) {
        boolean zA = u.a(securePolicy, androidx.compose.ui.window.c.j(this.composeView));
        Window window = getWindow();
        C3862t.d(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    public final void k() {
        this.dialogLayout.e();
    }

    public final void l(AbstractC1564q parentComposition, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> children) {
        this.dialogLayout.m(parentComposition, children);
    }

    public final void o(Ba.a<C4153F> onDismissRequest, j properties, U0.t layoutDirection) {
        Window window;
        this.onDismissRequest = onDismissRequest;
        this.properties = properties;
        n(properties.getSecurePolicy());
        m(layoutDirection);
        if (properties.getUsePlatformDefaultWidth() && !this.dialogLayout.getUsePlatformDefaultWidth() && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        this.dialogLayout.n(properties.getUsePlatformDefaultWidth());
        if (Build.VERSION.SDK_INT < 31) {
            if (properties.getDecorFitsSystemWindows()) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.defaultSoftInputMode);
                    return;
                }
                return;
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent event) {
        boolean zOnTouchEvent = super.onTouchEvent(event);
        if (zOnTouchEvent && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
