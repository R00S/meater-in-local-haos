package i0;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import l0.C3870c;
import l0.C3873f;
import l0.InterfaceC3871d;
import m0.C3944a;
import m0.C3945b;
import oa.C4153F;

/* compiled from: AndroidGraphicsContext.android.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0013\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Li0/K;", "Li0/F0;", "Landroid/view/ViewGroup;", "ownerView", "<init>", "(Landroid/view/ViewGroup;)V", "Lm0/a;", "d", "(Landroid/view/ViewGroup;)Lm0/a;", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)J", "Ll0/c;", "b", "()Ll0/c;", "layer", "Loa/F;", "a", "(Ll0/c;)V", "Landroid/view/ViewGroup;", "", "Ljava/lang/Object;", "lock", "Lm0/a;", "viewLayerContainer", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;", "componentCallback", "e", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3548K implements F0 {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f42850f = true;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C3944a viewLayerContainer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2 componentCallback = null;

    /* compiled from: AndroidGraphicsContext.android.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li0/K$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i0.K$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f42855a = new b();

        private b() {
        }

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public C3548K(ViewGroup viewGroup) {
        this.ownerView = viewGroup;
    }

    private final long c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.a(view);
        }
        return -1L;
    }

    private final C3944a d(ViewGroup ownerView) {
        C3944a c3944a = this.viewLayerContainer;
        if (c3944a != null) {
            return c3944a;
        }
        C3945b c3945b = new C3945b(ownerView.getContext());
        ownerView.addView(c3945b);
        this.viewLayerContainer = c3945b;
        return c3945b;
    }

    @Override // i0.F0
    public void a(C3870c layer) {
        synchronized (this.lock) {
            layer.H();
            C4153F c4153f = C4153F.f46609a;
        }
    }

    @Override // i0.F0
    public C3870c b() {
        InterfaceC3871d e10;
        C3870c c3870c;
        synchronized (this.lock) {
            try {
                long jC = c(this.ownerView);
                if (Build.VERSION.SDK_INT >= 29) {
                    e10 = new l0.D(jC, null, null, 6, null);
                } else if (f42850f) {
                    try {
                        e10 = new C3873f(this.ownerView, jC, null, null, 12, null);
                    } catch (Throwable unused) {
                        f42850f = false;
                        e10 = new l0.E(d(this.ownerView), jC, null, null, 12, null);
                    }
                } else {
                    e10 = new l0.E(d(this.ownerView), jC, null, null, 12, null);
                }
                c3870c = new C3870c(e10, null);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3870c;
    }
}
