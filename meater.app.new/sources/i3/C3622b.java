package i3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC3389F;
import kotlin.AbstractC3391H;
import kotlin.C3407m;
import kotlin.C3414t;
import kotlin.C3420z;
import kotlin.InterfaceC3400f;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: DialogFragmentNavigator.kt */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006*\u00012\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029:B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\"\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u0014J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00104\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R \u00107\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00106¨\u0006;"}, d2 = {"Li3/b;", "Lg3/F;", "Li3/b$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/v;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;)V", "", "popUpToIndex", "Lg3/m;", "popUpTo", "", "savedState", "Loa/F;", "s", "(ILg3/m;Z)V", "entry", "q", "(Lg3/m;)V", "Landroidx/fragment/app/n;", "p", "(Lg3/m;)Landroidx/fragment/app/n;", "j", "(Lg3/m;Z)V", "o", "()Li3/b$b;", "", "entries", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "e", "(Ljava/util/List;Lg3/z;Lg3/F$a;)V", "backStackEntry", "g", "Lg3/H;", "state", "f", "(Lg3/H;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/v;", "", "", "Ljava/util/Set;", "restoredTagsAwaitingAttach", "i3/b$c", "Li3/b$c;", "observer", "", "Ljava/util/Map;", "transitioningFragments", "h", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC3389F.b("dialog")
/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3622b extends AbstractC3389F<C0545b> {

    /* renamed from: h, reason: collision with root package name */
    private static final a f43061h = new a(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v fragmentManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> restoredTagsAwaitingAttach;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final c observer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, n> transitioningFragments;

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li3/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i3.b$a */
    private static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Li3/b$b;", "Lg3/t;", "Lg3/f;", "Lg3/F;", "fragmentNavigator", "<init>", "(Lg3/F;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Loa/F;", "K", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "T", "(Ljava/lang/String;)Li3/b$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "N", "Ljava/lang/String;", "_className", "S", "()Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i3.b$b, reason: collision with other inner class name */
    public static class C0545b extends C3414t implements InterfaceC3400f {

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0545b(AbstractC3389F<? extends C0545b> fragmentNavigator) {
            super(fragmentNavigator);
            C3862t.g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // kotlin.C3414t
        public void K(Context context, AttributeSet attrs) {
            C3862t.g(context, "context");
            C3862t.g(attrs, "attrs");
            super.K(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, f.f43074a);
            C3862t.f(typedArrayObtainAttributes, "context.resources.obtain….DialogFragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(f.f43075b);
            if (string != null) {
                T(string);
            }
            typedArrayObtainAttributes.recycle();
        }

        public final String S() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set");
            }
            C3862t.e(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final C0545b T(String className) {
            C3862t.g(className, "className");
            this._className = className;
            return this;
        }

        @Override // kotlin.C3414t
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof C0545b)) {
                return false;
            }
            return super.equals(other) && C3862t.b(this._className, ((C0545b) other)._className);
        }

        @Override // kotlin.C3414t
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"i3/b$c", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i3.b$c */
    public static final class c implements InterfaceC2111s {

        /* compiled from: DialogFragmentNavigator.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: i3.b$c$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f43069a;

            static {
                int[] iArr = new int[AbstractC2106m.a.values().length];
                try {
                    iArr[AbstractC2106m.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC2106m.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f43069a = iArr;
            }
        }

        c() {
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v source, AbstractC2106m.a event) {
            int iNextIndex;
            C3862t.g(source, "source");
            C3862t.g(event, "event");
            int i10 = a.f43069a[event.ordinal()];
            if (i10 == 1) {
                n nVar = (n) source;
                List<C3407m> value = C3622b.this.b().b().getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (C3862t.b(((C3407m) it.next()).getId(), nVar.C0())) {
                            return;
                        }
                    }
                }
                nVar.A2();
                return;
            }
            Object obj = null;
            if (i10 == 2) {
                n nVar2 = (n) source;
                for (Object obj2 : C3622b.this.b().c().getValue()) {
                    if (C3862t.b(((C3407m) obj2).getId(), nVar2.C0())) {
                        obj = obj2;
                    }
                }
                C3407m c3407m = (C3407m) obj;
                if (c3407m != null) {
                    C3622b.this.b().e(c3407m);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                n nVar3 = (n) source;
                for (Object obj3 : C3622b.this.b().c().getValue()) {
                    if (C3862t.b(((C3407m) obj3).getId(), nVar3.C0())) {
                        obj = obj3;
                    }
                }
                C3407m c3407m2 = (C3407m) obj;
                if (c3407m2 != null) {
                    C3622b.this.b().e(c3407m2);
                }
                nVar3.getLifecycle().d(this);
                return;
            }
            n nVar4 = (n) source;
            if (nVar4.J2().isShowing()) {
                return;
            }
            List<C3407m> value2 = C3622b.this.b().b().getValue();
            ListIterator<C3407m> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C3862t.b(listIterator.previous().getId(), nVar4.C0())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            C3407m c3407m3 = (C3407m) r.m0(value2, iNextIndex);
            if (!C3862t.b(r.w0(value2), c3407m3)) {
                Log.i("DialogFragmentNavigator", "Dialog " + nVar4 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
            }
            if (c3407m3 != null) {
                C3622b.this.s(iNextIndex, c3407m3, false);
            }
        }
    }

    public C3622b(Context context, v fragmentManager) {
        C3862t.g(context, "context");
        C3862t.g(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.restoredTagsAwaitingAttach = new LinkedHashSet();
        this.observer = new c();
        this.transitioningFragments = new LinkedHashMap();
    }

    private final n p(C3407m entry) {
        C3414t destination = entry.getDestination();
        C3862t.e(destination, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0545b c0545b = (C0545b) destination;
        String strS = c0545b.S();
        if (strS.charAt(0) == '.') {
            strS = this.context.getPackageName() + strS;
        }
        Fragment fragmentC = this.fragmentManager.A0().c(this.context.getClassLoader(), strS);
        C3862t.f(fragmentC, "fragmentManager.fragment…t.classLoader, className)");
        if (n.class.isAssignableFrom(fragmentC.getClass())) {
            n nVar = (n) fragmentC;
            nVar.k2(entry.d());
            nVar.getLifecycle().a(this.observer);
            this.transitioningFragments.put(entry.getId(), nVar);
            return nVar;
        }
        throw new IllegalArgumentException(("Dialog destination " + c0545b.S() + " is not an instance of DialogFragment").toString());
    }

    private final void q(C3407m entry) {
        p(entry).N2(this.fragmentManager, entry.getId());
        C3407m c3407m = (C3407m) r.w0(b().b().getValue());
        boolean zA0 = r.a0(b().c().getValue(), c3407m);
        b().l(entry);
        if (c3407m == null || zA0) {
            return;
        }
        b().e(c3407m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(C3622b this$0, v vVar, Fragment childFragment) {
        C3862t.g(this$0, "this$0");
        C3862t.g(vVar, "<anonymous parameter 0>");
        C3862t.g(childFragment, "childFragment");
        Set<String> set = this$0.restoredTagsAwaitingAttach;
        if (W.a(set).remove(childFragment.C0())) {
            childFragment.getLifecycle().a(this$0.observer);
        }
        Map<String, n> map = this$0.transitioningFragments;
        W.d(map).remove(childFragment.C0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int popUpToIndex, C3407m popUpTo, boolean savedState) {
        C3407m c3407m = (C3407m) r.m0(b().b().getValue(), popUpToIndex - 1);
        boolean zA0 = r.a0(b().c().getValue(), c3407m);
        b().i(popUpTo, savedState);
        if (c3407m == null || zA0) {
            return;
        }
        b().e(c3407m);
    }

    @Override // kotlin.AbstractC3389F
    public void e(List<C3407m> entries, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        C3862t.g(entries, "entries");
        if (this.fragmentManager.X0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<C3407m> it = entries.iterator();
        while (it.hasNext()) {
            q(it.next());
        }
    }

    @Override // kotlin.AbstractC3389F
    public void f(AbstractC3391H state) {
        AbstractC2106m lifecycle;
        C3862t.g(state, "state");
        super.f(state);
        for (C3407m c3407m : state.b().getValue()) {
            n nVar = (n) this.fragmentManager.n0(c3407m.getId());
            if (nVar == null || (lifecycle = nVar.getLifecycle()) == null) {
                this.restoredTagsAwaitingAttach.add(c3407m.getId());
            } else {
                lifecycle.a(this.observer);
            }
        }
        this.fragmentManager.m(new J1.n() { // from class: i3.a
            @Override // J1.n
            public final void a(v vVar, Fragment fragment) {
                C3622b.r(this.f43060B, vVar, fragment);
            }
        });
    }

    @Override // kotlin.AbstractC3389F
    public void g(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        if (this.fragmentManager.X0()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        n nVar = this.transitioningFragments.get(backStackEntry.getId());
        if (nVar == null) {
            Fragment fragmentN0 = this.fragmentManager.n0(backStackEntry.getId());
            nVar = fragmentN0 instanceof n ? (n) fragmentN0 : null;
        }
        if (nVar != null) {
            nVar.getLifecycle().d(this.observer);
            nVar.A2();
        }
        p(backStackEntry).N2(this.fragmentManager, backStackEntry.getId());
        b().g(backStackEntry);
    }

    @Override // kotlin.AbstractC3389F
    public void j(C3407m popUpTo, boolean savedState) {
        C3862t.g(popUpTo, "popUpTo");
        if (this.fragmentManager.X0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<C3407m> value = b().b().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        Iterator it = r.H0(value.subList(iIndexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentN0 = this.fragmentManager.n0(((C3407m) it.next()).getId());
            if (fragmentN0 != null) {
                ((n) fragmentN0).A2();
            }
        }
        s(iIndexOf, popUpTo, savedState);
    }

    @Override // kotlin.AbstractC3389F
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C0545b a() {
        return new C0545b(this);
    }
}
