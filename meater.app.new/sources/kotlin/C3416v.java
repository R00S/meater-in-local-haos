package kotlin;

import Ba.l;
import Ca.a;
import Tb.h;
import Tb.k;
import Ub.n;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import h3.C3487a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C3414t;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.Y;
import s.a0;

/* compiled from: NavGraph.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0016\u0018\u0000 O2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001PB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010!\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0010H\u0007¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010*H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020#H\u0016¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u000102H\u0096\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001cH\u0016¢\u0006\u0004\b6\u00107R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0001088G¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0016\u0010-\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u0017R\u0018\u0010A\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R.\u0010G\u001a\u0004\u0018\u00010#2\b\u0010B\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010@\u001a\u0004\bD\u00101\"\u0004\bE\u0010FR$\u0010J\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u00107\"\u0004\bI\u0010/R\u0014\u0010L\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u00101R\u0011\u0010N\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\bM\u00101¨\u0006Q"}, d2 = {"Lg3/v;", "Lg3/t;", "", "Lg3/F;", "navGraphNavigator", "<init>", "(Lg3/F;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Loa/F;", "K", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lg3/s;", "navDeepLinkRequest", "", "searchChildren", "searchParent", "lastVisited", "Lg3/t$b;", "e0", "(Lg3/s;ZZLg3/t;)Lg3/t$b;", "I", "(Lg3/s;)Lg3/t$b;", "node", "S", "(Lg3/t;)V", "", "resId", "T", "(I)Lg3/t;", "matchingDest", "Y", "(ILg3/t;ZLg3/t;)Lg3/t;", "", "route", "U", "(Ljava/lang/String;)Lg3/t;", "searchParents", "V", "(Ljava/lang/String;Z)Lg3/t;", "", "iterator", "()Ljava/util/Iterator;", "startDestId", "f0", "(I)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ls/Y;", "N", "Ls/Y;", "a0", "()Ls/Y;", "nodes", "O", "P", "Ljava/lang/String;", "startDestIdName", "startDestRoute", "Q", "d0", "h0", "(Ljava/lang/String;)V", "startDestinationRoute", "c0", "g0", "startDestinationId", "A", "displayName", "b0", "startDestDisplayName", "R", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3416v extends C3414t implements Iterable<C3414t>, a {

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final Y<C3414t> nodes;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private String startDestIdName;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    /* compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg3/v$a;", "", "<init>", "()V", "Lg3/v;", "Lg3/t;", "b", "(Lg3/v;)Lg3/t;", "LTb/h;", "a", "(Lg3/v;)LTb/h;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.v$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: NavGraph.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg3/t;", "it", "a", "(Lg3/t;)Lg3/t;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: g3.v$a$a, reason: collision with other inner class name */
        static final class C0529a extends AbstractC3864v implements l<C3414t, C3414t> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0529a f41810B = new C0529a();

            C0529a() {
                super(1);
            }

            @Override // Ba.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C3414t invoke(C3414t it) {
                C3862t.g(it, "it");
                if (!(it instanceof C3416v)) {
                    return null;
                }
                C3416v c3416v = (C3416v) it;
                return c3416v.T(c3416v.getStartDestId());
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final h<C3414t> a(C3416v c3416v) {
            C3862t.g(c3416v, "<this>");
            return k.i(c3416v, C0529a.f41810B);
        }

        public final C3414t b(C3416v c3416v) {
            C3862t.g(c3416v, "<this>");
            return (C3414t) k.z(a(c3416v));
        }

        private Companion() {
        }
    }

    /* compiled from: NavGraph.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"g3/v$b", "", "Lg3/t;", "", "hasNext", "()Z", "b", "()Lg3/t;", "Loa/F;", "remove", "()V", "", "B", "I", "index", "C", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.v$b */
    public static final class b implements Iterator<C3414t>, a {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C3414t next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            Y<C3414t> yA0 = C3416v.this.a0();
            int i10 = this.index + 1;
            this.index = i10;
            return yA0.r(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < C3416v.this.a0().q();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            Y<C3414t> yA0 = C3416v.this.a0();
            yA0.r(this.index).O(null);
            yA0.o(this.index);
            this.index--;
            this.wentToNext = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3416v(AbstractC3389F<? extends C3416v> navGraphNavigator) {
        super(navGraphNavigator);
        C3862t.g(navGraphNavigator, "navGraphNavigator");
        this.nodes = new Y<>(0, 1, null);
    }

    public static /* synthetic */ C3414t Z(C3416v c3416v, int i10, C3414t c3414t, boolean z10, C3414t c3414t2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i11 & 8) != 0) {
            c3414t2 = null;
        }
        return c3416v.Y(i10, c3414t, z10, c3414t2);
    }

    private final void g0(int i10) {
        if (i10 != getId()) {
            if (this.startDestinationRoute != null) {
                h0(null);
            }
            this.startDestId = i10;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void h0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (C3862t.b(str, getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (n.a0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = C3414t.INSTANCE.a(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    @Override // kotlin.C3414t
    public String A() {
        return getId() != 0 ? super.A() : "the root navigation";
    }

    @Override // kotlin.C3414t
    public C3414t.b I(C3413s navDeepLinkRequest) {
        C3862t.g(navDeepLinkRequest, "navDeepLinkRequest");
        return e0(navDeepLinkRequest, true, false, this);
    }

    @Override // kotlin.C3414t
    public void K(Context context, AttributeSet attrs) {
        C3862t.g(context, "context");
        C3862t.g(attrs, "attrs");
        super.K(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, C3487a.f42330v);
        C3862t.f(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        g0(typedArrayObtainAttributes.getResourceId(C3487a.f42331w, 0));
        this.startDestIdName = C3414t.INSTANCE.b(context, this.startDestId);
        C4153F c4153f = C4153F.f46609a;
        typedArrayObtainAttributes.recycle();
    }

    public final void S(C3414t node) {
        C3862t.g(node, "node");
        int id2 = node.getId();
        String route = node.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && C3862t.b(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id2 == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        C3414t c3414tG = this.nodes.g(id2);
        if (c3414tG == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (c3414tG != null) {
            c3414tG.O(null);
        }
        node.O(this);
        this.nodes.n(node.getId(), node);
    }

    public final C3414t T(int resId) {
        return Z(this, resId, this, false, null, 8, null);
    }

    public final C3414t U(String route) {
        if (route == null || n.a0(route)) {
            return null;
        }
        return V(route, true);
    }

    public final C3414t V(String route, boolean searchParents) {
        Object next;
        C3862t.g(route, "route");
        Iterator it = k.c(a0.b(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3414t c3414t = (C3414t) next;
            if (n.u(c3414t.getRoute(), route, false, 2, null) || c3414t.J(route) != null) {
                break;
            }
        }
        C3414t c3414t2 = (C3414t) next;
        if (c3414t2 != null) {
            return c3414t2;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        C3416v parent = getParent();
        C3862t.d(parent);
        return parent.U(route);
    }

    public final C3414t Y(int resId, C3414t lastVisited, boolean searchChildren, C3414t matchingDest) {
        C3414t c3414tG = this.nodes.g(resId);
        if (matchingDest != null) {
            if (C3862t.b(c3414tG, matchingDest) && C3862t.b(c3414tG.getParent(), matchingDest.getParent())) {
                return c3414tG;
            }
            c3414tG = null;
        } else if (c3414tG != null) {
            return c3414tG;
        }
        if (searchChildren) {
            Iterator it = k.c(a0.b(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    c3414tG = null;
                    break;
                }
                C3414t c3414t = (C3414t) it.next();
                C3414t c3414tY = (!(c3414t instanceof C3416v) || C3862t.b(c3414t, lastVisited)) ? null : ((C3416v) c3414t).Y(resId, this, true, matchingDest);
                if (c3414tY != null) {
                    c3414tG = c3414tY;
                    break;
                }
            }
        }
        if (c3414tG != null) {
            return c3414tG;
        }
        if (getParent() == null || C3862t.b(getParent(), lastVisited)) {
            return null;
        }
        C3416v parent = getParent();
        C3862t.d(parent);
        return parent.Y(resId, this, searchChildren, matchingDest);
    }

    public final Y<C3414t> a0() {
        return this.nodes;
    }

    public final String b0() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        C3862t.d(str);
        return str;
    }

    /* renamed from: c0, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    /* renamed from: d0, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final C3414t.b e0(C3413s navDeepLinkRequest, boolean searchChildren, boolean searchParent, C3414t lastVisited) {
        C3414t.b bVar;
        C3862t.g(navDeepLinkRequest, "navDeepLinkRequest");
        C3862t.g(lastVisited, "lastVisited");
        C3414t.b bVarI = super.I(navDeepLinkRequest);
        C3414t.b bVarE0 = null;
        if (searchChildren) {
            ArrayList arrayList = new ArrayList();
            for (C3414t c3414t : this) {
                C3414t.b bVarI2 = !C3862t.b(c3414t, lastVisited) ? c3414t.I(navDeepLinkRequest) : null;
                if (bVarI2 != null) {
                    arrayList.add(bVarI2);
                }
            }
            bVar = (C3414t.b) r.y0(arrayList);
        } else {
            bVar = null;
        }
        C3416v parent = getParent();
        if (parent != null && searchParent && !C3862t.b(parent, lastVisited)) {
            bVarE0 = parent.e0(navDeepLinkRequest, searchChildren, true, this);
        }
        return (C3414t.b) r.y0(r.r(bVarI, bVar, bVarE0));
    }

    @Override // kotlin.C3414t
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C3416v)) {
            return false;
        }
        if (super.equals(other)) {
            C3416v c3416v = (C3416v) other;
            if (this.nodes.q() == c3416v.nodes.q() && getStartDestId() == c3416v.getStartDestId()) {
                for (C3414t c3414t : k.c(a0.b(this.nodes))) {
                    if (!C3862t.b(c3414t, c3416v.nodes.g(c3414t.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f0(int startDestId) {
        g0(startDestId);
    }

    @Override // kotlin.C3414t
    public int hashCode() {
        int startDestId = getStartDestId();
        Y<C3414t> y10 = this.nodes;
        int iQ = y10.q();
        for (int i10 = 0; i10 < iQ; i10++) {
            startDestId = (((startDestId * 31) + y10.m(i10)) * 31) + y10.r(i10).hashCode();
        }
        return startDestId;
    }

    @Override // java.lang.Iterable
    public final Iterator<C3414t> iterator() {
        return new b();
    }

    @Override // kotlin.C3414t
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        C3414t c3414tU = U(this.startDestinationRoute);
        if (c3414tU == null) {
            c3414tU = T(getStartDestId());
        }
        sb2.append(" startDestination=");
        if (c3414tU == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(c3414tU.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }
}
