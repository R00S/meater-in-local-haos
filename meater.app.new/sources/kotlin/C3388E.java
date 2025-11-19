package kotlin;

import Ba.l;
import Tb.k;
import android.app.Activity;
import android.view.View;
import f1.C3309b;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Navigation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000e¨\u0006\u0015"}, d2 = {"Lg3/E;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "viewId", "Lg3/p;", "b", "(Landroid/app/Activity;I)Lg3/p;", "Landroid/view/View;", "view", "c", "(Landroid/view/View;)Lg3/p;", "controller", "Loa/F;", "f", "(Landroid/view/View;Lg3/p;)V", "d", "e", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3388E {

    /* renamed from: a, reason: collision with root package name */
    public static final C3388E f41586a = new C3388E();

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "it", "a", "(Landroid/view/View;)Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.E$a */
    static final class a extends AbstractC3864v implements l<View, View> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f41587B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            C3862t.g(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* compiled from: Navigation.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lg3/p;", "a", "(Landroid/view/View;)Lg3/p;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.E$b */
    static final class b extends AbstractC3864v implements l<View, C3410p> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f41588B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3410p invoke(View it) {
            C3862t.g(it, "it");
            return C3388E.f41586a.e(it);
        }
    }

    private C3388E() {
    }

    public static final C3410p b(Activity activity, int viewId) {
        C3862t.g(activity, "activity");
        View viewU = C3309b.u(activity, viewId);
        C3862t.f(viewU, "requireViewById<View>(activity, viewId)");
        C3410p c3410pD = f41586a.d(viewU);
        if (c3410pD != null) {
            return c3410pD;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + viewId);
    }

    public static final C3410p c(View view) {
        C3862t.g(view, "view");
        C3410p c3410pD = f41586a.d(view);
        if (c3410pD != null) {
            return c3410pD;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final C3410p d(View view) {
        return (C3410p) k.t(k.B(k.i(view, a.f41587B), b.f41588B));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3410p e(View view) {
        Object tag = view.getTag(C3393J.f41606a);
        if (tag instanceof WeakReference) {
            return (C3410p) ((WeakReference) tag).get();
        }
        if (tag instanceof C3410p) {
            return (C3410p) tag;
        }
        return null;
    }

    public static final void f(View view, C3410p controller) {
        C3862t.g(view, "view");
        view.setTag(C3393J.f41606a, controller);
    }
}
