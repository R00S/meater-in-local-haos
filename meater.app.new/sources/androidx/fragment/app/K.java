package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.C2998b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SpecialEffectsController.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0011\b \u0018\u0000 \u00132\u00020\u0001:\u0004=A25B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010&J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b(\u0010&J\u0015\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0017¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012¢\u0006\u0004\b,\u0010\u001cJ\r\u0010-\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0012¢\u0006\u0004\b/\u0010\u001cJ\r\u00100\u001a\u00020\u0012¢\u0006\u0004\b0\u0010\u001cJ\u0017\u00102\u001a\u00020\u00122\u0006\u00101\u001a\u00020\bH\u0000¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0012¢\u0006\u0004\b4\u0010\u001cJ%\u00105\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001d2\u0006\u0010)\u001a\u00020\u0017H&¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u001dH\u0010¢\u0006\u0004\b7\u0010 J\u0015\u0010:\u001a\u00020\u00122\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0012¢\u0006\u0004\b<\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010F\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010ER\u0016\u0010G\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010ER\u0016\u0010H\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010E¨\u0006I"}, d2 = {"Landroidx/fragment/app/K;", "", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/K$d;", "o", "(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/K$d;", "p", "Landroidx/fragment/app/K$d$b;", "finalState", "Landroidx/fragment/app/K$d$a;", "lifecycleImpact", "Landroidx/fragment/app/A;", "fragmentStateManager", "Loa/F;", "g", "(Landroidx/fragment/app/K$d$b;Landroidx/fragment/app/K$d$a;Landroidx/fragment/app/A;)V", "", "newPendingOperations", "", "x", "(Ljava/util/List;)Z", "w", "C", "()V", "", "operations", "B", "(Ljava/util/List;)V", "s", "(Landroidx/fragment/app/A;)Landroidx/fragment/app/K$d$a;", "j", "(Landroidx/fragment/app/K$d$b;Landroidx/fragment/app/A;)V", "m", "(Landroidx/fragment/app/A;)V", "k", "l", "isPop", "D", "(Z)V", "z", "y", "()Z", "r", "n", "operation", "c", "(Landroidx/fragment/app/K$d;)V", "q", "d", "(Ljava/util/List;Z)V", "e", "Ld/b;", "backEvent", "A", "(Ld/b;)V", "f", "a", "Landroid/view/ViewGroup;", "t", "()Landroid/view/ViewGroup;", "b", "Ljava/util/List;", "pendingOperations", "runningOperations", "Z", "runningNonSeekableTransition", "operationDirectionIsPop", "isContainerPostponed", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup container;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<d> pendingOperations;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<d> runningOperations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean runningNonSeekableTransition;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean operationDirectionIsPop;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isContainerPostponed;

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/K$a;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Landroidx/fragment/app/v;", "fragmentManager", "Landroidx/fragment/app/K;", "a", "(Landroid/view/ViewGroup;Landroidx/fragment/app/v;)Landroidx/fragment/app/K;", "Landroidx/fragment/app/L;", "factory", "b", "(Landroid/view/ViewGroup;Landroidx/fragment/app/L;)Landroidx/fragment/app/K;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.K$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final K a(ViewGroup container, v fragmentManager) {
            C3862t.g(container, "container");
            C3862t.g(fragmentManager, "fragmentManager");
            L lI0 = fragmentManager.I0();
            C3862t.f(lI0, "fragmentManager.specialEffectsControllerFactory");
            return b(container, lI0);
        }

        public final K b(ViewGroup container, L factory) {
            C3862t.g(container, "container");
            C3862t.g(factory, "factory");
            int i10 = I1.b.f6646b;
            Object tag = container.getTag(i10);
            if (tag instanceof K) {
                return (K) tag;
            }
            K kA = factory.a(container);
            C3862t.f(kA, "factory.createController(container)");
            container.setTag(i10, kA);
            return kA;
        }

        private Companion() {
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0018"}, d2 = {"Landroidx/fragment/app/K$b;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "container", "Loa/F;", "g", "(Landroid/view/ViewGroup;)V", "f", "Ld/b;", "backEvent", "e", "(Ld/b;Landroid/view/ViewGroup;)V", "d", "a", "c", "", "Z", "b", "()Z", "isSeekingSupported", "isStarted", "isCancelled", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isSeekingSupported;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean isCancelled;

        public final void a(ViewGroup container) {
            C3862t.g(container, "container");
            if (!this.isCancelled) {
                c(container);
            }
            this.isCancelled = true;
        }

        /* renamed from: b, reason: from getter */
        public boolean getIsSeekingSupported() {
            return this.isSeekingSupported;
        }

        public void c(ViewGroup container) {
            C3862t.g(container, "container");
        }

        public void d(ViewGroup container) {
            C3862t.g(container, "container");
        }

        public void e(C2998b backEvent, ViewGroup container) {
            C3862t.g(backEvent, "backEvent");
            C3862t.g(container, "container");
        }

        public void f(ViewGroup container) {
            C3862t.g(container, "container");
        }

        public final void g(ViewGroup container) {
            C3862t.g(container, "container");
            if (!this.isStarted) {
                f(container);
            }
            this.isStarted = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/K$c;", "Landroidx/fragment/app/K$d;", "Landroidx/fragment/app/K$d$b;", "finalState", "Landroidx/fragment/app/K$d$a;", "lifecycleImpact", "Landroidx/fragment/app/A;", "fragmentStateManager", "<init>", "(Landroidx/fragment/app/K$d$b;Landroidx/fragment/app/K$d$a;Landroidx/fragment/app/A;)V", "Loa/F;", "p", "()V", "d", "l", "Landroidx/fragment/app/A;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class c extends d {

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final A fragmentStateManager;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b finalState, d.a lifecycleImpact, A fragmentStateManager) {
            C3862t.g(finalState, "finalState");
            C3862t.g(lifecycleImpact, "lifecycleImpact");
            C3862t.g(fragmentStateManager, "fragmentStateManager");
            Fragment fragmentK = fragmentStateManager.k();
            C3862t.f(fragmentK, "fragmentStateManager.fragment");
            super(finalState, lifecycleImpact, fragmentK);
            this.fragmentStateManager = fragmentStateManager;
        }

        @Override // androidx.fragment.app.K.d
        public void d() {
            super.d();
            getFragment().f25466O = false;
            this.fragmentStateManager.m();
        }

        @Override // androidx.fragment.app.K.d
        public void p() {
            if (getIsStarted()) {
                return;
            }
            super.p();
            if (getLifecycleImpact() != d.a.ADDING) {
                if (getLifecycleImpact() == d.a.REMOVING) {
                    Fragment fragmentK = this.fragmentStateManager.k();
                    C3862t.f(fragmentK, "fragmentStateManager.fragment");
                    View viewF2 = fragmentK.f2();
                    C3862t.f(viewF2, "fragment.requireView()");
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewF2.findFocus() + " on view " + viewF2 + " for Fragment " + fragmentK);
                    }
                    viewF2.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentK2 = this.fragmentStateManager.k();
            C3862t.f(fragmentK2, "fragmentStateManager.fragment");
            View viewFindFocus = fragmentK2.f25489l0.findFocus();
            if (viewFindFocus != null) {
                fragmentK2.l2(viewFindFocus);
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK2);
                }
            }
            View viewF22 = getFragment().f2();
            C3862t.f(viewF22, "this.fragment.requireView()");
            if (viewF22.getParent() == null) {
                this.fragmentStateManager.b();
                viewF22.setAlpha(0.0f);
            }
            if (viewF22.getAlpha() == 0.0f && viewF22.getVisibility() == 0) {
                viewF22.setVisibility(4);
            }
            viewF22.setAlpha(fragmentK2.s0());
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0016\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0011¢\u0006\u0004\b\u001f\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010.R$\u00105\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b3\u00104R$\u00108\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104R*\u0010<\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u0010;R$\u0010>\u001a\u0002002\u0006\u00101\u001a\u0002008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b=\u00104R\"\u0010A\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\b?\u00104\"\u0004\b@\u0010;R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010.R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00180C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b6\u0010D¨\u0006F"}, d2 = {"Landroidx/fragment/app/K$d;", "", "Landroidx/fragment/app/K$d$b;", "finalState", "Landroidx/fragment/app/K$d$a;", "lifecycleImpact", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/K$d$b;Landroidx/fragment/app/K$d$a;Landroidx/fragment/app/Fragment;)V", "", "toString", "()Ljava/lang/String;", "Landroid/view/ViewGroup;", "container", "Loa/F;", "c", "(Landroid/view/ViewGroup;)V", "o", "(Landroidx/fragment/app/K$d$b;Landroidx/fragment/app/K$d$a;)V", "Ljava/lang/Runnable;", "listener", "a", "(Ljava/lang/Runnable;)V", "Landroidx/fragment/app/K$b;", "effect", "b", "(Landroidx/fragment/app/K$b;)V", "e", "p", "()V", "d", "Landroidx/fragment/app/K$d$b;", "g", "()Landroidx/fragment/app/K$d$b;", "setFinalState", "(Landroidx/fragment/app/K$d$b;)V", "Landroidx/fragment/app/K$d$a;", "i", "()Landroidx/fragment/app/K$d$a;", "setLifecycleImpact", "(Landroidx/fragment/app/K$d$a;)V", "Landroidx/fragment/app/Fragment;", "h", "()Landroidx/fragment/app/Fragment;", "", "Ljava/util/List;", "completionListeners", "", "<set-?>", "Z", "k", "()Z", "isCanceled", "f", "l", "isComplete", "m", "r", "(Z)V", "isSeeking", "n", "isStarted", "j", "q", "isAwaitingContainerChanges", "_effects", "", "()Ljava/util/List;", "effects", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b finalState;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private a lifecycleImpact;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Fragment fragment;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<Runnable> completionListeners;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean isCanceled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean isComplete;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean isSeeking;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean isStarted;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isAwaitingContainerChanges;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final List<b> _effects;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final List<b> effects;

        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/K$d$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/K$d$b;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/view/View;", "view", "Landroid/view/ViewGroup;", "container", "Loa/F;", "j", "(Landroid/view/View;Landroid/view/ViewGroup;)V", "B", "a", "C", "D", "E", "F", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: B, reason: collision with root package name and from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* compiled from: SpecialEffectsController.kt */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/fragment/app/K$d$b$a;", "", "<init>", "()V", "Landroid/view/View;", "Landroidx/fragment/app/K$d$b;", "a", "(Landroid/view/View;)Landroidx/fragment/app/K$d$b;", "", "visibility", "b", "(I)Landroidx/fragment/app/K$d$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.K$d$b$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(C3854k c3854k) {
                    this();
                }

                public final b a(View view) {
                    C3862t.g(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int visibility) {
                    if (visibility == 0) {
                        return b.VISIBLE;
                    }
                    if (visibility == 4) {
                        return b.INVISIBLE;
                    }
                    if (visibility == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                }

                private Companion() {
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.fragment.app.K$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0358b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f25592a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f25592a = iArr;
                }
            }

            public static final b n(int i10) {
                return INSTANCE.b(i10);
            }

            public final void j(View view, ViewGroup container) {
                C3862t.g(view, "view");
                C3862t.g(container, "container");
                int i10 = C0358b.f25592a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                        }
                        container.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f25593a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f25593a = iArr;
            }
        }

        public d(b finalState, a lifecycleImpact, Fragment fragment) {
            C3862t.g(finalState, "finalState");
            C3862t.g(lifecycleImpact, "lifecycleImpact");
            C3862t.g(fragment, "fragment");
            this.finalState = finalState;
            this.lifecycleImpact = lifecycleImpact;
            this.fragment = fragment;
            this.completionListeners = new ArrayList();
            this.isAwaitingContainerChanges = true;
            ArrayList arrayList = new ArrayList();
            this._effects = arrayList;
            this.effects = arrayList;
        }

        public final void a(Runnable listener) {
            C3862t.g(listener, "listener");
            this.completionListeners.add(listener);
        }

        public final void b(b effect) {
            C3862t.g(effect, "effect");
            this._effects.add(effect);
        }

        public final void c(ViewGroup container) {
            C3862t.g(container, "container");
            this.isStarted = false;
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            if (this._effects.isEmpty()) {
                d();
                return;
            }
            Iterator it = kotlin.collections.r.W0(this.effects).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(container);
            }
        }

        public void d() {
            this.isStarted = false;
            if (this.isComplete) {
                return;
            }
            if (v.Q0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.isComplete = true;
            Iterator<T> it = this.completionListeners.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b effect) {
            C3862t.g(effect, "effect");
            if (this._effects.remove(effect) && this._effects.isEmpty()) {
                d();
            }
        }

        public final List<b> f() {
            return this.effects;
        }

        /* renamed from: g, reason: from getter */
        public final b getFinalState() {
            return this.finalState;
        }

        /* renamed from: h, reason: from getter */
        public final Fragment getFragment() {
            return this.fragment;
        }

        /* renamed from: i, reason: from getter */
        public final a getLifecycleImpact() {
            return this.lifecycleImpact;
        }

        /* renamed from: j, reason: from getter */
        public final boolean getIsAwaitingContainerChanges() {
            return this.isAwaitingContainerChanges;
        }

        /* renamed from: k, reason: from getter */
        public final boolean getIsCanceled() {
            return this.isCanceled;
        }

        /* renamed from: l, reason: from getter */
        public final boolean getIsComplete() {
            return this.isComplete;
        }

        /* renamed from: m, reason: from getter */
        public final boolean getIsSeeking() {
            return this.isSeeking;
        }

        /* renamed from: n, reason: from getter */
        public final boolean getIsStarted() {
            return this.isStarted;
        }

        public final void o(b finalState, a lifecycleImpact) {
            C3862t.g(finalState, "finalState");
            C3862t.g(lifecycleImpact, "lifecycleImpact");
            int i10 = c.f25593a[lifecycleImpact.ordinal()];
            if (i10 == 1) {
                if (this.finalState == b.REMOVED) {
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.lifecycleImpact + " to ADDING.");
                    }
                    this.finalState = b.VISIBLE;
                    this.lifecycleImpact = a.ADDING;
                    this.isAwaitingContainerChanges = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> REMOVED. mLifecycleImpact  = " + this.lifecycleImpact + " to REMOVING.");
                }
                this.finalState = b.REMOVED;
                this.lifecycleImpact = a.REMOVING;
                this.isAwaitingContainerChanges = true;
                return;
            }
            if (i10 == 3 && this.finalState != b.REMOVED) {
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.fragment + " mFinalState = " + this.finalState + " -> " + finalState + '.');
                }
                this.finalState = finalState;
            }
        }

        public void p() {
            this.isStarted = true;
        }

        public final void q(boolean z10) {
            this.isAwaitingContainerChanges = z10;
        }

        public final void r(boolean z10) {
            this.isSeeking = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.finalState + " lifecycleImpact = " + this.lifecycleImpact + " fragment = " + this.fragment + '}';
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25594a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25594a = iArr;
        }
    }

    public K(ViewGroup container) {
        C3862t.g(container, "container");
        this.container = container;
        this.pendingOperations = new ArrayList();
        this.runningOperations = new ArrayList();
    }

    private final void B(List<d> operations) {
        int size = operations.size();
        for (int i10 = 0; i10 < size; i10++) {
            operations.get(i10).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList, ((d) it.next()).f());
        }
        List listW0 = kotlin.collections.r.W0(kotlin.collections.r.b1(arrayList));
        int size2 = listW0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listW0.get(i11)).g(this.container);
        }
    }

    private final void C() {
        for (d dVar : this.pendingOperations) {
            if (dVar.getLifecycleImpact() == d.a.ADDING) {
                View viewF2 = dVar.getFragment().f2();
                C3862t.f(viewF2, "fragment.requireView()");
                dVar.o(d.b.INSTANCE.b(viewF2.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b finalState, d.a lifecycleImpact, A fragmentStateManager) {
        synchronized (this.pendingOperations) {
            try {
                Fragment fragmentK = fragmentStateManager.k();
                C3862t.f(fragmentK, "fragmentStateManager.fragment");
                d dVarO = o(fragmentK);
                if (dVarO == null) {
                    if (fragmentStateManager.k().f25466O) {
                        Fragment fragmentK2 = fragmentStateManager.k();
                        C3862t.f(fragmentK2, "fragmentStateManager.fragment");
                        dVarO = p(fragmentK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(finalState, lifecycleImpact);
                    return;
                }
                final c cVar = new c(finalState, lifecycleImpact, fragmentStateManager);
                this.pendingOperations.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.h(this.f25556B, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.J
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.i(this.f25558B, cVar);
                    }
                });
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(K this$0, c operation) {
        C3862t.g(this$0, "this$0");
        C3862t.g(operation, "$operation");
        if (this$0.pendingOperations.contains(operation)) {
            d.b finalState = operation.getFinalState();
            View view = operation.getFragment().f25489l0;
            C3862t.f(view, "operation.fragment.mView");
            finalState.j(view, this$0.container);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(K this$0, c operation) {
        C3862t.g(this$0, "this$0");
        C3862t.g(operation, "$operation");
        this$0.pendingOperations.remove(operation);
        this$0.runningOperations.remove(operation);
    }

    private final d o(Fragment fragment) {
        Object next;
        Iterator<T> it = this.pendingOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (C3862t.b(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) next;
    }

    private final d p(Fragment fragment) {
        Object next;
        Iterator<T> it = this.runningOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (C3862t.b(dVar.getFragment(), fragment) && !dVar.getIsCanceled()) {
                break;
            }
        }
        return (d) next;
    }

    public static final K u(ViewGroup viewGroup, v vVar) {
        return INSTANCE.a(viewGroup, vVar);
    }

    public static final K v(ViewGroup viewGroup, L l10) {
        return INSTANCE.b(viewGroup, l10);
    }

    private final boolean w(List<d> newPendingOperations) {
        boolean z10;
        List<d> list = newPendingOperations;
        loop0: while (true) {
            z10 = true;
            for (d dVar : list) {
                if (!dVar.f().isEmpty()) {
                    List<b> listF = dVar.f();
                    if (!(listF instanceof Collection) || !listF.isEmpty()) {
                        Iterator<T> it = listF.iterator();
                        while (it.hasNext()) {
                            if (!((b) it.next()).getIsSeekingSupported()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlin.collections.r.D(arrayList, ((d) it2.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List<d> newPendingOperations) {
        Iterator<T> it = newPendingOperations.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).getFragment().f25466O) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(C2998b backEvent) {
        C3862t.g(backEvent, "backEvent");
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + backEvent.getProgress());
        }
        List<d> list = this.runningOperations;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList, ((d) it.next()).f());
        }
        List listW0 = kotlin.collections.r.W0(kotlin.collections.r.b1(arrayList));
        int size = listW0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listW0.get(i10)).e(backEvent, this.container);
        }
    }

    public final void D(boolean isPop) {
        this.operationDirectionIsPop = isPop;
    }

    public final void c(d operation) {
        C3862t.g(operation, "operation");
        if (operation.getIsAwaitingContainerChanges()) {
            d.b finalState = operation.getFinalState();
            View viewF2 = operation.getFragment().f2();
            C3862t.f(viewF2, "operation.fragment.requireView()");
            finalState.j(viewF2, this.container);
            operation.q(false);
        }
    }

    public abstract void d(List<d> operations, boolean isPop);

    public void e(List<d> operations) {
        C3862t.g(operations, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = operations.iterator();
        while (it.hasNext()) {
            kotlin.collections.r.D(arrayList, ((d) it.next()).f());
        }
        List listW0 = kotlin.collections.r.W0(kotlin.collections.r.b1(arrayList));
        int size = listW0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listW0.get(i10)).d(this.container);
        }
        int size2 = operations.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c(operations.get(i11));
        }
        List listW02 = kotlin.collections.r.W0(operations);
        int size3 = listW02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listW02.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.runningOperations);
        e(this.runningOperations);
    }

    public final void j(d.b finalState, A fragmentStateManager) {
        C3862t.g(finalState, "finalState");
        C3862t.g(fragmentStateManager, "fragmentStateManager");
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragmentStateManager.k());
        }
        g(finalState, d.a.ADDING, fragmentStateManager);
    }

    public final void k(A fragmentStateManager) {
        C3862t.g(fragmentStateManager, "fragmentStateManager");
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.GONE, d.a.NONE, fragmentStateManager);
    }

    public final void l(A fragmentStateManager) {
        C3862t.g(fragmentStateManager, "fragmentStateManager");
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, fragmentStateManager);
    }

    public final void m(A fragmentStateManager) {
        C3862t.g(fragmentStateManager, "fragmentStateManager");
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragmentStateManager.k());
        }
        g(d.b.VISIBLE, d.a.NONE, fragmentStateManager);
    }

    public final void n() {
        if (this.isContainerPostponed) {
            return;
        }
        if (!this.container.isAttachedToWindow()) {
            q();
            this.operationDirectionIsPop = false;
            return;
        }
        synchronized (this.pendingOperations) {
            try {
                List<d> listZ0 = kotlin.collections.r.Z0(this.runningOperations);
                this.runningOperations.clear();
                for (d dVar : listZ0) {
                    dVar.r(!this.pendingOperations.isEmpty() && dVar.getFragment().f25466O);
                }
                for (d dVar2 : listZ0) {
                    if (this.runningNonSeekableTransition) {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (v.Q0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.container);
                    }
                    this.runningNonSeekableTransition = false;
                    if (!dVar2.getIsComplete()) {
                        this.runningOperations.add(dVar2);
                    }
                }
                if (!this.pendingOperations.isEmpty()) {
                    C();
                    List<d> listZ02 = kotlin.collections.r.Z0(this.pendingOperations);
                    if (listZ02.isEmpty()) {
                        return;
                    }
                    this.pendingOperations.clear();
                    this.runningOperations.addAll(listZ02);
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listZ02, this.operationDirectionIsPop);
                    boolean zW = w(listZ02);
                    boolean zX = x(listZ02);
                    this.runningNonSeekableTransition = zX && !zW;
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listZ02);
                        e(listZ02);
                    } else if (zW) {
                        B(listZ02);
                        int size = listZ02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c(listZ02.get(i10));
                        }
                    }
                    this.operationDirectionIsPop = false;
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void q() {
        if (v.Q0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.container.isAttachedToWindow();
        synchronized (this.pendingOperations) {
            try {
                C();
                B(this.pendingOperations);
                List<d> listZ0 = kotlin.collections.r.Z0(this.runningOperations);
                Iterator it = listZ0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listZ0) {
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.container);
                }
                List<d> listZ02 = kotlin.collections.r.Z0(this.pendingOperations);
                Iterator it2 = listZ02.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listZ02) {
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.container + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.container);
                }
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.isContainerPostponed) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.isContainerPostponed = false;
            n();
        }
    }

    public final d.a s(A fragmentStateManager) {
        C3862t.g(fragmentStateManager, "fragmentStateManager");
        Fragment fragmentK = fragmentStateManager.k();
        C3862t.f(fragmentK, "fragmentStateManager.fragment");
        d dVarO = o(fragmentK);
        d.a lifecycleImpact = dVarO != null ? dVarO.getLifecycleImpact() : null;
        d dVarP = p(fragmentK);
        d.a lifecycleImpact2 = dVarP != null ? dVarP.getLifecycleImpact() : null;
        int i10 = lifecycleImpact == null ? -1 : e.f25594a[lifecycleImpact.ordinal()];
        return (i10 == -1 || i10 == 1) ? lifecycleImpact2 : lifecycleImpact;
    }

    /* renamed from: t, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    public final boolean y() {
        return !this.pendingOperations.isEmpty();
    }

    public final void z() {
        d dVarPrevious;
        synchronized (this.pendingOperations) {
            try {
                C();
                List<d> list = this.pendingOperations;
                ListIterator<d> listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        dVarPrevious = null;
                        break;
                    }
                    dVarPrevious = listIterator.previous();
                    d dVar = dVarPrevious;
                    d.b.Companion companion = d.b.INSTANCE;
                    View view = dVar.getFragment().f25489l0;
                    C3862t.f(view, "operation.fragment.mView");
                    d.b bVarA = companion.a(view);
                    d.b finalState = dVar.getFinalState();
                    d.b bVar = d.b.VISIBLE;
                    if (finalState == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = dVarPrevious;
                Fragment fragment = dVar2 != null ? dVar2.getFragment() : null;
                this.isContainerPostponed = fragment != null ? fragment.O0() : false;
                C4153F c4153f = C4153F.f46609a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
