package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.b0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.n;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.b;
import i3.C3622b;
import i3.f;
import kotlin.AbstractC3389F;
import kotlin.C3388E;
import kotlin.C3390G;
import kotlin.C3394K;
import kotlin.C3410p;
import kotlin.C3418x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.InterfaceC4156a;
import oa.InterfaceC4164i;
import oa.v;
import t3.C4547d;

/* compiled from: NavHostFragment.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001@B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001b\u0010\u000f\u001a\u00020\u000e8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010\u0013\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Loa/F;", "X0", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "a1", "(Landroid/os/Bundle;)V", "Lg3/x;", "navHostController", "E2", "(Lg3/x;)V", "Lg3/p;", "navController", "D2", "(Lg3/p;)V", "Lg3/F;", "Landroidx/navigation/fragment/b$c;", "z2", "()Lg3/F;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "e1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "z1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "m1", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "w1", "h1", "G0", "Loa/i;", "C2", "()Lg3/x;", "H0", "Landroid/view/View;", "viewParent", "", "I0", "I", "graphId", "", "J0", "Z", "defaultNavHost", "A2", "()I", "containerId", "B2", "()Lg3/p;", "K0", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class NavHostFragment extends Fragment {

    /* renamed from: K0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G0, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i navHostController = C4165j.a(new b());

    /* renamed from: H0, reason: collision with root package name and from kotlin metadata */
    private View viewParent;

    /* renamed from: I0, reason: collision with root package name and from kotlin metadata */
    private int graphId;

    /* renamed from: J0, reason: collision with root package name and from kotlin metadata */
    private boolean defaultNavHost;

    /* compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$a;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Lg3/p;", "a", "(Landroidx/fragment/app/Fragment;)Lg3/p;", "", "KEY_DEFAULT_NAV_HOST", "Ljava/lang/String;", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.fragment.NavHostFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C3410p a(Fragment fragment) {
            Dialog dialogD2;
            Window window;
            C3862t.g(fragment, "fragment");
            for (Fragment fragmentN0 = fragment; fragmentN0 != null; fragmentN0 = fragmentN0.n0()) {
                if (fragmentN0 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragmentN0).C2();
                }
                Fragment fragmentH0 = fragmentN0.o0().H0();
                if (fragmentH0 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragmentH0).C2();
                }
            }
            View viewE0 = fragment.E0();
            if (viewE0 != null) {
                return C3388E.c(viewE0);
            }
            View decorView = null;
            n nVar = fragment instanceof n ? (n) fragment : null;
            if (nVar != null && (dialogD2 = nVar.D2()) != null && (window = dialogD2.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return C3388E.c(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        private Companion() {
        }
    }

    /* compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg3/x;", "c", "()Lg3/x;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<C3418x> {
        b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle d(C3418x this_apply) {
            C3862t.g(this_apply, "$this_apply");
            Bundle bundleP0 = this_apply.p0();
            if (bundleP0 != null) {
                return bundleP0;
            }
            Bundle EMPTY = Bundle.EMPTY;
            C3862t.f(EMPTY, "EMPTY");
            return EMPTY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bundle i(NavHostFragment this$0) {
            C3862t.g(this$0, "this$0");
            if (this$0.graphId != 0) {
                return n1.d.a(v.a("android-support-nav:fragment:graphId", Integer.valueOf(this$0.graphId)));
            }
            Bundle bundle = Bundle.EMPTY;
            C3862t.f(bundle, "{\n                    Bu…e.EMPTY\n                }");
            return bundle;
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C3418x invoke() {
            Context contextZ = NavHostFragment.this.Z();
            if (contextZ == null) {
                throw new IllegalStateException("NavController cannot be created before the fragment is attached");
            }
            C3862t.f(contextZ, "checkNotNull(context) {\n…s attached\"\n            }");
            final C3418x c3418x = new C3418x(contextZ);
            final NavHostFragment navHostFragment = NavHostFragment.this;
            c3418x.t0(navHostFragment);
            b0 viewModelStore = navHostFragment.v();
            C3862t.f(viewModelStore, "viewModelStore");
            c3418x.u0(viewModelStore);
            navHostFragment.E2(c3418x);
            Bundle bundleB = navHostFragment.B().b("android-support-nav:fragment:navControllerState");
            if (bundleB != null) {
                c3418x.n0(bundleB);
            }
            navHostFragment.B().h("android-support-nav:fragment:navControllerState", new C4547d.c() { // from class: androidx.navigation.fragment.d
                @Override // t3.C4547d.c
                public final Bundle a() {
                    return NavHostFragment.b.d(c3418x);
                }
            });
            Bundle bundleB2 = navHostFragment.B().b("android-support-nav:fragment:graphId");
            if (bundleB2 != null) {
                navHostFragment.graphId = bundleB2.getInt("android-support-nav:fragment:graphId");
            }
            navHostFragment.B().h("android-support-nav:fragment:graphId", new C4547d.c() { // from class: androidx.navigation.fragment.e
                @Override // t3.C4547d.c
                public final Bundle a() {
                    return NavHostFragment.b.i(navHostFragment);
                }
            });
            if (navHostFragment.graphId != 0) {
                c3418x.q0(navHostFragment.graphId);
            } else {
                Bundle bundleX = navHostFragment.X();
                int i10 = bundleX != null ? bundleX.getInt("android-support-nav:fragment:graphId") : 0;
                Bundle bundle = bundleX != null ? bundleX.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                if (i10 != 0) {
                    c3418x.r0(i10, bundle);
                }
            }
            return c3418x;
        }
    }

    private final int A2() {
        int iI0 = i0();
        return (iI0 == 0 || iI0 == -1) ? i3.e.f43073a : iI0;
    }

    public final C3410p B2() {
        return C2();
    }

    public final C3418x C2() {
        return (C3418x) this.navHostController.getValue();
    }

    @InterfaceC4156a
    protected void D2(C3410p navController) {
        C3862t.g(navController, "navController");
        C3390G c3390g = navController.get_navigatorProvider();
        Context contextE2 = e2();
        C3862t.f(contextE2, "requireContext()");
        androidx.fragment.app.v childFragmentManager = Y();
        C3862t.f(childFragmentManager, "childFragmentManager");
        c3390g.b(new C3622b(contextE2, childFragmentManager));
        navController.get_navigatorProvider().b(z2());
    }

    protected void E2(C3418x navHostController) {
        C3862t.g(navHostController, "navHostController");
        D2(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public void X0(Context context) {
        C3862t.g(context, "context");
        super.X0(context);
        if (this.defaultNavHost) {
            o0().r().z(this).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle savedInstanceState) {
        C2();
        if (savedInstanceState != null && savedInstanceState.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.defaultNavHost = true;
            o0().r().z(this).j();
        }
        super.a1(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C3862t.g(inflater, "inflater");
        Context context = inflater.getContext();
        C3862t.f(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(A2());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void h1() {
        super.h1();
        View view = this.viewParent;
        if (view != null && C3388E.c(view) == C2()) {
            C3388E.f(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        C3862t.g(context, "context");
        C3862t.g(attrs, "attrs");
        super.m1(context, attrs, savedInstanceState);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C3394K.f41613g);
        C3862t.f(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3394K.f41614h, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, f.f43078e);
        C3862t.f(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(f.f43079f, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public void w1(Bundle outState) {
        C3862t.g(outState, "outState");
        super.w1(outState);
        if (this.defaultNavHost) {
            outState.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z1(View view, Bundle savedInstanceState) {
        C3862t.g(view, "view");
        super.z1(view, savedInstanceState);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        C3388E.f(view, C2());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            C3862t.e(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.viewParent = view2;
            C3862t.d(view2);
            if (view2.getId() == i0()) {
                View view3 = this.viewParent;
                C3862t.d(view3);
                C3388E.f(view3, C2());
            }
        }
    }

    @InterfaceC4156a
    protected AbstractC3389F<? extends b.c> z2() {
        Context contextE2 = e2();
        C3862t.f(contextE2, "requireContext()");
        androidx.fragment.app.v childFragmentManager = Y();
        C3862t.f(childFragmentManager, "childFragmentManager");
        return new androidx.navigation.fragment.b(contextE2, childFragmentManager, A2());
    }
}
