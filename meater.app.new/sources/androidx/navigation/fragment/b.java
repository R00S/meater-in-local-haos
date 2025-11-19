package androidx.navigation.fragment;

import J1.n;
import Q1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbstractC2106m;
import android.view.E;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2113u;
import android.view.InterfaceC2114v;
import android.view.View;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.navigation.fragment.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
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
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import kotlin.jvm.internal.P;
import oa.C4153F;
import oa.C4170o;
import oa.InterfaceC4160e;

/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004QR=?B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0000¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\fH\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100J1\u00103\u001a\u00020\u00132\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010,\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001f0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010CR,\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\f0F0E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010G\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010LR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020K0N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010O¨\u0006S"}, d2 = {"Landroidx/navigation/fragment/b;", "Lg3/F;", "Landroidx/navigation/fragment/b$c;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/v;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/v;I)V", "level", "", "y", "(I)Z", "Lg3/m;", "entry", "Landroidx/fragment/app/Fragment;", "fragment", "Loa/F;", "t", "(Lg3/m;Landroidx/fragment/app/Fragment;)V", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "z", "(Lg3/m;Lg3/z;Lg3/F$a;)V", "Landroidx/fragment/app/C;", "v", "(Lg3/m;Lg3/z;)Landroidx/fragment/app/C;", "", "id", "isPop", "deduplicate", "q", "(Ljava/lang/String;ZZ)V", "Lg3/H;", "state", "f", "(Lg3/H;)V", "s", "(Landroidx/fragment/app/Fragment;Lg3/m;Lg3/H;)V", "popUpTo", "savedState", "j", "(Lg3/m;Z)V", "u", "()Landroidx/navigation/fragment/b$c;", "", "entries", "e", "(Ljava/util/List;Lg3/z;Lg3/F$a;)V", "backStackEntry", "g", "(Lg3/m;)V", "Landroid/os/Bundle;", "i", "()Landroid/os/Bundle;", "h", "(Landroid/os/Bundle;)V", "c", "Landroid/content/Context;", "d", "Landroidx/fragment/app/v;", "I", "", "Ljava/util/Set;", "savedIds", "", "Loa/o;", "Ljava/util/List;", "x", "()Ljava/util/List;", "pendingOps", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/s;", "fragmentObserver", "Lkotlin/Function1;", "LBa/l;", "fragmentViewObserver", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC3389F.b("fragment")
/* loaded from: classes.dex */
public class b extends AbstractC3389F<c> {

    /* renamed from: j, reason: collision with root package name */
    private static final C0386b f28411j = new C0386b(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v fragmentManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int containerId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<String> savedIds;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<C4170o<String, Boolean>> pendingOps;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2111s fragmentObserver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C3407m, InterfaceC2111s> fragmentViewObserver;

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R.\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00070\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/navigation/fragment/b$a;", "Landroidx/lifecycle/Y;", "<init>", "()V", "Loa/F;", "g", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "b", "Ljava/lang/ref/WeakReference;", "h", "()Ljava/lang/ref/WeakReference;", "i", "(Ljava/lang/ref/WeakReference;)V", "completeTransition", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Y {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public WeakReference<Ba.a<C4153F>> completeTransition;

        @Override // android.view.Y
        protected void g() {
            super.g();
            Ba.a<C4153F> aVar = h().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final WeakReference<Ba.a<C4153F>> h() {
            WeakReference<Ba.a<C4153F>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            C3862t.u("completeTransition");
            return null;
        }

        public final void i(WeakReference<Ba.a<C4153F>> weakReference) {
            C3862t.g(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/b$b;", "", "<init>", "()V", "", "KEY_SAVED_IDS", "Ljava/lang/String;", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.fragment.b$b, reason: collision with other inner class name */
    private static final class C0386b {
        public /* synthetic */ C0386b(C3854k c3854k) {
            this();
        }

        private C0386b() {
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Landroidx/navigation/fragment/b$c;", "Lg3/t;", "Lg3/F;", "fragmentNavigator", "<init>", "(Lg3/F;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Loa/F;", "K", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "T", "(Ljava/lang/String;)Landroidx/navigation/fragment/b$c;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "N", "Ljava/lang/String;", "_className", "S", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c extends C3414t {

        /* renamed from: N, reason: collision with root package name and from kotlin metadata */
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC3389F<? extends c> fragmentNavigator) {
            super(fragmentNavigator);
            C3862t.g(fragmentNavigator, "fragmentNavigator");
        }

        @Override // kotlin.C3414t
        public void K(Context context, AttributeSet attrs) {
            C3862t.g(context, "context");
            C3862t.g(attrs, "attrs");
            super.K(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, i3.f.f43076c);
            C3862t.f(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(i3.f.f43077d);
            if (string != null) {
                T(string);
            }
            C4153F c4153f = C4153F.f46609a;
            typedArrayObtainAttributes.recycle();
        }

        public final String S() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            C3862t.e(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        public final c T(String className) {
            C3862t.g(className, "className");
            this._className = className;
            return this;
        }

        @Override // kotlin.C3414t
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof c)) {
                return false;
            }
            return super.equals(other) && C3862t.b(this._className, ((c) other)._className);
        }

        @Override // kotlin.C3414t
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this._className;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // kotlin.C3414t
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this._className;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            C3862t.f(string, "sb.toString()");
            return string;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001R0\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\t8F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/b$d;", "Lg3/F$a;", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "a", "Ljava/util/LinkedHashMap;", "_sharedElements", "", "()Ljava/util/Map;", "sharedElements", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements AbstractC3389F.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final LinkedHashMap<View, String> _sharedElements;

        public final Map<View, String> a() {
            return M.r(this._sharedElements);
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loa/o;", "", "", "it", "a", "(Loa/o;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.l<C4170o<? extends String, ? extends Boolean>, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f28422B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f28422B = str;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C4170o<String, Boolean> it) {
            C3862t.g(it, "it");
            return Boolean.valueOf(C3862t.b(it.c(), this.f28422B));
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3407m f28423B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ AbstractC3391H f28424C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ b f28425D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Fragment f28426E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3407m c3407m, AbstractC3391H abstractC3391H, b bVar, Fragment fragment) {
            super(0);
            this.f28423B = c3407m;
            this.f28424C = abstractC3391H;
            this.f28425D = bVar;
            this.f28426E = fragment;
        }

        public final void a() {
            AbstractC3391H abstractC3391H = this.f28424C;
            b bVar = this.f28425D;
            Fragment fragment = this.f28426E;
            for (C3407m c3407m : abstractC3391H.c().getValue()) {
                if (bVar.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + c3407m + " due to fragment " + fragment + " viewmodel being cleared");
                }
                abstractC3391H.e(c3407m);
            }
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQ1/a;", "Landroidx/navigation/fragment/b$a;", "a", "(LQ1/a;)Landroidx/navigation/fragment/b$a;"}, k = 3, mv = {1, 8, 0})
    static final class g extends AbstractC3864v implements Ba.l<Q1.a, a> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f28427B = new g();

        g() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke(Q1.a initializer) {
            C3862t.g(initializer, "$this$initializer");
            return new a();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/v;", "kotlin.jvm.PlatformType", "owner", "Loa/F;", "a", "(Landroidx/lifecycle/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<InterfaceC2114v, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Fragment f28429C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3407m f28430D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Fragment fragment, C3407m c3407m) {
            super(1);
            this.f28429C = fragment;
            this.f28430D = c3407m;
        }

        public final void a(InterfaceC2114v interfaceC2114v) {
            List<C4170o<String, Boolean>> listX = b.this.x();
            Fragment fragment = this.f28429C;
            boolean z10 = false;
            if (!(listX instanceof Collection) || !listX.isEmpty()) {
                Iterator<T> it = listX.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (C3862t.b(((C4170o) it.next()).c(), fragment.C0())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (interfaceC2114v == null || z10) {
                return;
            }
            AbstractC2106m lifecycle = this.f28429C.F0().getLifecycle();
            if (lifecycle.getState().j(AbstractC2106m.b.CREATED)) {
                lifecycle.a((InterfaceC2113u) b.this.fragmentViewObserver.invoke(this.f28430D));
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC2114v interfaceC2114v) {
            a(interfaceC2114v);
            return C4153F.f46609a;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg3/m;", "entry", "Landroidx/lifecycle/s;", "b", "(Lg3/m;)Landroidx/lifecycle/s;"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.l<C3407m, InterfaceC2111s> {
        i() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(b this$0, C3407m entry, InterfaceC2114v owner, AbstractC2106m.a event) {
            C3862t.g(this$0, "this$0");
            C3862t.g(entry, "$entry");
            C3862t.g(owner, "owner");
            C3862t.g(event, "event");
            if (event == AbstractC2106m.a.ON_RESUME && this$0.b().b().getValue().contains(entry)) {
                if (this$0.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                }
                this$0.b().e(entry);
            }
            if (event == AbstractC2106m.a.ON_DESTROY) {
                if (this$0.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                }
                this$0.b().e(entry);
            }
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC2111s invoke(final C3407m entry) {
            C3862t.g(entry, "entry");
            final b bVar = b.this;
            return new InterfaceC2111s() { // from class: androidx.navigation.fragment.c
                @Override // android.view.InterfaceC2111s
                public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                    b.i.c(bVar, entry, interfaceC2114v, aVar);
                }
            };
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loa/o;", "", "", "it", "a", "(Loa/o;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements Ba.l<C4170o<? extends String, ? extends Boolean>, String> {

        /* renamed from: B, reason: collision with root package name */
        public static final k f28434B = new k();

        k() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(C4170o<String, Boolean> it) {
            C3862t.g(it, "it");
            return it.c();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class l implements E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f28435a;

        l(Ba.l function) {
            C3862t.g(function, "function");
            this.f28435a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f28435a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f28435a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof E) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public b(Context context, v fragmentManager, int i10) {
        C3862t.g(context, "context");
        C3862t.g(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i10;
        this.savedIds = new LinkedHashSet();
        this.pendingOps = new ArrayList();
        this.fragmentObserver = new InterfaceC2111s() { // from class: i3.c
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                androidx.navigation.fragment.b.w(this.f43070B, interfaceC2114v, aVar);
            }
        };
        this.fragmentViewObserver = new i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(AbstractC3391H state, b this$0, v vVar, Fragment fragment) {
        C3407m c3407mPrevious;
        C3862t.g(state, "$state");
        C3862t.g(this$0, "this$0");
        C3862t.g(vVar, "<anonymous parameter 0>");
        C3862t.g(fragment, "fragment");
        List<C3407m> value = state.b().getValue();
        ListIterator<C3407m> listIterator = value.listIterator(value.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c3407mPrevious = null;
                break;
            } else {
                c3407mPrevious = listIterator.previous();
                if (C3862t.b(c3407mPrevious.getId(), fragment.C0())) {
                    break;
                }
            }
        }
        C3407m c3407m = c3407mPrevious;
        if (this$0.y(2)) {
            Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + c3407m + " to FragmentManager " + this$0.fragmentManager);
        }
        if (c3407m != null) {
            this$0.t(c3407m, fragment);
            this$0.s(fragment, c3407m, state);
        }
    }

    private final void q(String id2, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            r.J(this.pendingOps, new e(id2));
        }
        this.pendingOps.add(oa.v.a(id2, Boolean.valueOf(isPop)));
    }

    static /* synthetic */ void r(b bVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        bVar.q(str, z10, z11);
    }

    private final void t(C3407m entry, Fragment fragment) {
        fragment.G0().h(fragment, new l(new h(fragment, entry)));
        fragment.getLifecycle().a(this.fragmentObserver);
    }

    private final C v(C3407m entry, C3420z navOptions) {
        C3414t destination = entry.getDestination();
        C3862t.e(destination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleD = entry.d();
        String strS = ((c) destination).S();
        if (strS.charAt(0) == '.') {
            strS = this.context.getPackageName() + strS;
        }
        Fragment fragmentC = this.fragmentManager.A0().c(this.context.getClassLoader(), strS);
        C3862t.f(fragmentC, "fragmentManager.fragment…t.classLoader, className)");
        fragmentC.k2(bundleD);
        C cR = this.fragmentManager.r();
        C3862t.f(cR, "fragmentManager.beginTransaction()");
        int enterAnim = navOptions != null ? navOptions.getEnterAnim() : -1;
        int exitAnim = navOptions != null ? navOptions.getExitAnim() : -1;
        int popEnterAnim = navOptions != null ? navOptions.getPopEnterAnim() : -1;
        int popExitAnim = navOptions != null ? navOptions.getPopExitAnim() : -1;
        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim == -1) {
                exitAnim = 0;
            }
            if (popEnterAnim == -1) {
                popEnterAnim = 0;
            }
            cR.x(enterAnim, exitAnim, popEnterAnim, popExitAnim != -1 ? popExitAnim : 0);
        }
        cR.u(this.containerId, fragmentC, entry.getId());
        cR.z(fragmentC);
        cR.A(true);
        return cR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(b this$0, InterfaceC2114v source, AbstractC2106m.a event) {
        C3862t.g(this$0, "this$0");
        C3862t.g(source, "source");
        C3862t.g(event, "event");
        if (event == AbstractC2106m.a.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : this$0.b().c().getValue()) {
                if (C3862t.b(((C3407m) obj2).getId(), fragment.C0())) {
                    obj = obj2;
                }
            }
            C3407m c3407m = (C3407m) obj;
            if (c3407m != null) {
                if (this$0.y(2)) {
                    Log.v("FragmentNavigator", "Marking transition complete for entry " + c3407m + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.b().e(c3407m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(int level) {
        return Log.isLoggable("FragmentManager", level) || Log.isLoggable("FragmentNavigator", level);
    }

    private final void z(C3407m entry, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        boolean zIsEmpty = b().b().getValue().isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.getRestoreState() && this.savedIds.remove(entry.getId())) {
            this.fragmentManager.x1(entry.getId());
            b().l(entry);
            return;
        }
        C cV = v(entry, navOptions);
        if (!zIsEmpty) {
            C3407m c3407m = (C3407m) r.w0(b().b().getValue());
            if (c3407m != null) {
                r(this, c3407m.getId(), false, false, 6, null);
            }
            r(this, entry.getId(), false, false, 6, null);
            cV.h(entry.getId());
        }
        if (navigatorExtras instanceof d) {
            for (Map.Entry<View, String> entry2 : ((d) navigatorExtras).a().entrySet()) {
                cV.g(entry2.getKey(), entry2.getValue());
            }
        }
        cV.j();
        if (y(2)) {
            Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + entry);
        }
        b().l(entry);
    }

    @Override // kotlin.AbstractC3389F
    public void e(List<C3407m> entries, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        C3862t.g(entries, "entries");
        if (this.fragmentManager.X0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<C3407m> it = entries.iterator();
        while (it.hasNext()) {
            z(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // kotlin.AbstractC3389F
    public void f(final AbstractC3391H state) {
        C3862t.g(state, "state");
        super.f(state);
        if (y(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        this.fragmentManager.m(new n() { // from class: i3.d
            @Override // J1.n
            public final void a(v vVar, Fragment fragment) {
                androidx.navigation.fragment.b.A(state, this, vVar, fragment);
            }
        });
        this.fragmentManager.n(new j(state, this));
    }

    @Override // kotlin.AbstractC3389F
    public void g(C3407m backStackEntry) {
        C3862t.g(backStackEntry, "backStackEntry");
        if (this.fragmentManager.X0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C cV = v(backStackEntry, null);
        List<C3407m> value = b().b().getValue();
        if (value.size() > 1) {
            C3407m c3407m = (C3407m) r.m0(value, r.o(value) - 1);
            if (c3407m != null) {
                r(this, c3407m.getId(), false, false, 6, null);
            }
            r(this, backStackEntry.getId(), true, false, 4, null);
            this.fragmentManager.l1(backStackEntry.getId(), 1);
            r(this, backStackEntry.getId(), false, false, 2, null);
            cV.h(backStackEntry.getId());
        }
        cV.j();
        b().f(backStackEntry);
    }

    @Override // kotlin.AbstractC3389F
    public void h(Bundle savedState) {
        C3862t.g(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.savedIds.clear();
            r.D(this.savedIds, stringArrayList);
        }
    }

    @Override // kotlin.AbstractC3389F
    public Bundle i() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return n1.d.a(oa.v.a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.savedIds)));
    }

    @Override // kotlin.AbstractC3389F
    public void j(C3407m popUpTo, boolean savedState) {
        C3862t.g(popUpTo, "popUpTo");
        if (this.fragmentManager.X0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<C3407m> value = b().b().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        List<C3407m> listSubList = value.subList(iIndexOf, value.size());
        C3407m c3407m = (C3407m) r.j0(value);
        C3407m c3407m2 = (C3407m) r.m0(value, iIndexOf - 1);
        if (c3407m2 != null) {
            r(this, c3407m2.getId(), false, false, 6, null);
        }
        List<C3407m> list = listSubList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3407m c3407m3 = (C3407m) obj;
            if (Tb.k.l(Tb.k.A(r.Z(this.pendingOps), k.f28434B), c3407m3.getId()) || !C3862t.b(c3407m3.getId(), c3407m.getId())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r(this, ((C3407m) it.next()).getId(), true, false, 4, null);
        }
        if (savedState) {
            for (C3407m c3407m4 : r.H0(list)) {
                if (C3862t.b(c3407m4, c3407m)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + c3407m4);
                } else {
                    this.fragmentManager.C1(c3407m4.getId());
                    this.savedIds.add(c3407m4.getId());
                }
            }
        } else {
            this.fragmentManager.l1(popUpTo.getId(), 1);
        }
        if (y(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + savedState);
        }
        b().i(popUpTo, savedState);
    }

    public final void s(Fragment fragment, C3407m entry, AbstractC3391H state) {
        C3862t.g(fragment, "fragment");
        C3862t.g(entry, "entry");
        C3862t.g(state, "state");
        b0 b0VarV = fragment.v();
        C3862t.f(b0VarV, "fragment.viewModelStore");
        Q1.c cVar = new Q1.c();
        cVar.a(P.b(a.class), g.f28427B);
        ((a) new a0(b0VarV, cVar.b(), a.C0211a.f14206b).b(a.class)).i(new WeakReference<>(new f(entry, state, this, fragment)));
    }

    @Override // kotlin.AbstractC3389F
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final List<C4170o<String, Boolean>> x() {
        return this.pendingOps;
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"androidx/navigation/fragment/b$j", "Landroidx/fragment/app/v$o;", "Loa/F;", "d", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "", "pop", "b", "(Landroidx/fragment/app/Fragment;Z)V", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class j implements v.o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3391H f28432a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f28433b;

        j(AbstractC3391H abstractC3391H, b bVar) {
            this.f28432a = abstractC3391H;
            this.f28433b = bVar;
        }

        @Override // androidx.fragment.app.v.o
        public void a(Fragment fragment, boolean pop) {
            Object obj;
            Object objPrevious;
            C3862t.g(fragment, "fragment");
            List listF0 = r.F0(this.f28432a.b().getValue(), this.f28432a.c().getValue());
            ListIterator listIterator = listF0.listIterator(listF0.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (C3862t.b(((C3407m) objPrevious).getId(), fragment.C0())) {
                        break;
                    }
                }
            }
            C3407m c3407m = (C3407m) objPrevious;
            boolean z10 = pop && this.f28433b.x().isEmpty() && fragment.P0();
            Iterator<T> it = this.f28433b.x().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C3862t.b(((C4170o) next).c(), fragment.C0())) {
                    obj = next;
                    break;
                }
            }
            C4170o c4170o = (C4170o) obj;
            if (c4170o != null) {
                this.f28433b.x().remove(c4170o);
            }
            if (!z10 && this.f28433b.y(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + c3407m);
            }
            boolean z11 = c4170o != null && ((Boolean) c4170o.d()).booleanValue();
            if (!pop && !z11 && c3407m == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (c3407m != null) {
                this.f28433b.s(fragment, c3407m, this.f28432a);
                if (z10) {
                    if (this.f28433b.y(2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + c3407m + " via system back");
                    }
                    this.f28432a.i(c3407m, false);
                }
            }
        }

        @Override // androidx.fragment.app.v.o
        public void b(Fragment fragment, boolean pop) {
            C3407m c3407mPrevious;
            C3862t.g(fragment, "fragment");
            if (pop) {
                List<C3407m> value = this.f28432a.b().getValue();
                ListIterator<C3407m> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        c3407mPrevious = null;
                        break;
                    } else {
                        c3407mPrevious = listIterator.previous();
                        if (C3862t.b(c3407mPrevious.getId(), fragment.C0())) {
                            break;
                        }
                    }
                }
                C3407m c3407m = c3407mPrevious;
                if (this.f28433b.y(2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + c3407m);
                }
                if (c3407m != null) {
                    this.f28432a.j(c3407m);
                }
            }
        }

        @Override // androidx.fragment.app.v.o
        public void d() {
        }
    }
}
