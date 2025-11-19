package K1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.fragment.app.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.V;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: FragmentStrictMode.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00031\u0007%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ7\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00062\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u001f2\u000e\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*R\"\u00100\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"LK1/b;", "", "<init>", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "LK1/b$c;", "b", "(Landroidx/fragment/app/Fragment;)LK1/b$c;", "", "previousFragmentId", "Loa/F;", "f", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "g", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "j", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "h", "(Landroidx/fragment/app/Fragment;)V", "i", "Landroidx/fragment/app/strictmode/Violation;", "violation", "e", "(Landroidx/fragment/app/strictmode/Violation;)V", "policy", "Ljava/lang/Class;", "fragmentClass", "violationClass", "", "l", "(LK1/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z", "c", "(LK1/b$c;Landroidx/fragment/app/strictmode/Violation;)V", "Ljava/lang/Runnable;", "runnable", "k", "(Landroidx/fragment/app/Fragment;Ljava/lang/Runnable;)V", "LK1/b$c;", "getDefaultPolicy", "()LK1/b$c;", "setDefaultPolicy", "(LK1/b$c;)V", "defaultPolicy", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f8649a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static c defaultPolicy = c.f8662d;

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LK1/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "G", "H", "I", "J", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"LK1/b$b;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0167b {
    }

    /* compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00142\u00020\u0001:\u0001\u000fBC\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R4\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LK1/b$c;", "", "", "LK1/b$a;", "flags", "LK1/b$b;", "listener", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;LK1/b$b;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "mAllowedViolations", "LK1/b$b;", "()LK1/b$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: d, reason: collision with root package name */
        public static final c f8662d = new c(V.d(), null, M.h());

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<a> flags;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> flags, InterfaceC0167b interfaceC0167b, Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            C3862t.g(flags, "flags");
            C3862t.g(allowedViolations, "allowedViolations");
            this.flags = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<a> a() {
            return this.flags;
        }

        public final InterfaceC0167b b() {
            return null;
        }

        public final Map<String, Set<Class<? extends Violation>>> c() {
            return this.mAllowedViolations;
        }
    }

    private b() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.K0()) {
                v vVarO0 = fragment.o0();
                C3862t.f(vVarO0, "declaringFragment.parentFragmentManager");
                if (vVarO0.J0() != null) {
                    c cVarJ0 = vVarO0.J0();
                    C3862t.d(cVarJ0);
                    return cVarJ0;
                }
            }
            fragment = fragment.n0();
        }
        return defaultPolicy;
    }

    private final void c(c policy, final Violation violation) {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (policy.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        policy.b();
        if (policy.a().contains(a.PENALTY_DEATH)) {
            k(fragment, new Runnable() { // from class: K1.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        C3862t.g(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.getFragment().getClass().getName(), violation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(Fragment fragment, String previousFragmentId) {
        C3862t.g(fragment, "fragment");
        C3862t.g(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        b bVar = f8649a;
        bVar.e(fragmentReuseViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.l(cVarB, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(cVarB, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(Fragment fragment, ViewGroup container) {
        C3862t.g(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, container);
        b bVar = f8649a;
        bVar.e(fragmentTagUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.l(cVarB, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(cVarB, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(Fragment fragment) {
        C3862t.g(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f8649a;
        bVar.e(getTargetFragmentUsageViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.l(cVarB, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(cVarB, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(Fragment fragment, ViewGroup container) {
        C3862t.g(fragment, "fragment");
        C3862t.g(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        b bVar = f8649a;
        bVar.e(wrongFragmentContainerViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.l(cVarB, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(cVarB, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(Fragment fragment, Fragment expectedParentFragment, int containerId) {
        C3862t.g(fragment, "fragment");
        C3862t.g(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, containerId);
        b bVar = f8649a;
        bVar.e(wrongNestedHierarchyViolation);
        c cVarB = bVar.b(fragment);
        if (cVarB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && bVar.l(cVarB, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            bVar.c(cVarB, wrongNestedHierarchyViolation);
        }
    }

    private final void k(Fragment fragment, Runnable runnable) {
        if (!fragment.K0()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.o0().D0().getHandler();
        if (C3862t.b(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final boolean l(c policy, Class<? extends Fragment> fragmentClass, Class<? extends Violation> violationClass) {
        Set<Class<? extends Violation>> set = policy.c().get(fragmentClass.getName());
        if (set == null) {
            return true;
        }
        if (C3862t.b(violationClass.getSuperclass(), Violation.class) || !r.a0(set, violationClass.getSuperclass())) {
            return !set.contains(violationClass);
        }
        return false;
    }
}
