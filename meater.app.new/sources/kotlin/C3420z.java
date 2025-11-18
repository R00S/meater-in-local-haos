package kotlin;

import Ia.d;
import ic.g;
import j3.C3738c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;

/* compiled from: NavOptions.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0001#B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b&\u0010 R\u0017\u0010\f\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b*\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b+\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"Lg3/z;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "LIa/d;", "popUpToRouteClass", "(ZZLIa/d;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "j", "()Z", "l", "i", "k", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "e", "d", "f", "g", "h", "<set-?>", "Ljava/lang/String;", "LIa/d;", "()LIa/d;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3420z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean restoreState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int popUpToId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToInclusive;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int enterAnim;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exitAnim;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int popEnterAnim;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int popExitAnim;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private d<?> popUpToRouteClass;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Object popUpToRouteObject;

    /* compiled from: NavOptions.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00002\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0019\u001a\u00020\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\u001dJ\u0017\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\"\u001a\u00020\n¢\u0006\u0004\b#\u0010\u001dJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010'R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001c\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010.R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010\u001e\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010(R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010(¨\u00063"}, d2 = {"Lg3/z$a;", "", "<init>", "()V", "", "singleTop", "d", "(Z)Lg3/z$a;", "restoreState", "l", "", "destinationId", "inclusive", "saveState", "g", "(IZZ)Lg3/z$a;", "", "route", "j", "(Ljava/lang/String;ZZ)Lg3/z$a;", "LIa/d;", "klass", "h", "(LIa/d;ZZ)Lg3/z$a;", "T", "i", "(Ljava/lang/Object;ZZ)Lg3/z$a;", "enterAnim", "b", "(I)Lg3/z$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Lg3/z;", "a", "()Lg3/z;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "LIa/d;", "popUpToRouteClass", "Ljava/lang/Object;", "popUpToRouteObject", "popUpToInclusive", "popUpToSaveState", "k", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.z$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean restoreState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String popUpToRoute;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private d<?> popUpToRouteClass;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object popUpToRouteObject;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToInclusive;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToSaveState;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int popUpToId = -1;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int enterAnim = -1;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int exitAnim = -1;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private int popEnterAnim = -1;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int popExitAnim = -1;

        public static /* synthetic */ a k(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final C3420z a() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new C3420z(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                return new C3420z(this.singleTop, this.restoreState, dVar, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            if (obj == null) {
                return new C3420z(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            boolean z10 = this.singleTop;
            boolean z11 = this.restoreState;
            C3862t.d(obj);
            return new C3420z(z10, z11, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final a b(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        public final a c(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        public final a d(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        public final a e(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        public final a f(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        public final a g(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a h(d<?> klass, boolean inclusive, boolean saveState) {
            C3862t.g(klass, "klass");
            this.popUpToRouteClass = klass;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final <T> a i(T route, boolean inclusive, boolean saveState) {
            C3862t.g(route, "route");
            this.popUpToRouteObject = route;
            g(C3738c.b(g.a(P.b(route.getClass()))), inclusive, saveState);
            return this;
        }

        public final a j(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a l(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }
    }

    public C3420z(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.singleTop = z10;
        this.restoreState = z11;
        this.popUpToId = i10;
        this.popUpToInclusive = z12;
        this.popUpToSaveState = z13;
        this.enterAnim = i11;
        this.exitAnim = i12;
        this.popEnterAnim = i13;
        this.popExitAnim = i14;
    }

    /* renamed from: a, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    /* renamed from: b, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    /* renamed from: c, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    /* renamed from: d, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    /* renamed from: e, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C3420z)) {
            return false;
        }
        C3420z c3420z = (C3420z) other;
        return this.singleTop == c3420z.singleTop && this.restoreState == c3420z.restoreState && this.popUpToId == c3420z.popUpToId && C3862t.b(this.popUpToRoute, c3420z.popUpToRoute) && C3862t.b(this.popUpToRouteClass, c3420z.popUpToRouteClass) && C3862t.b(this.popUpToRouteObject, c3420z.popUpToRouteObject) && this.popUpToInclusive == c3420z.popUpToInclusive && this.popUpToSaveState == c3420z.popUpToSaveState && this.enterAnim == c3420z.enterAnim && this.exitAnim == c3420z.exitAnim && this.popEnterAnim == c3420z.popEnterAnim && this.popExitAnim == c3420z.popExitAnim;
    }

    /* renamed from: f, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final d<?> g() {
        return this.popUpToRouteClass;
    }

    /* renamed from: h, reason: from getter */
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public int hashCode() {
        int i10 = (((((getSingleTop() ? 1 : 0) * 31) + (getRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        d<?> dVar = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (getPopUpToInclusive() ? 1 : 0)) * 31) + (getPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3420z.class.getSimpleName());
        sb2.append("(");
        if (this.singleTop) {
            sb2.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb2.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb2.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                d<?> dVar = this.popUpToRouteClass;
                if (dVar != null) {
                    sb2.append(dVar);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb2.append(obj);
                    } else {
                        sb2.append("0x");
                        sb2.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb2.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb2.append(" saveState");
            }
            sb2.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(this.enterAnim));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(this.exitAnim));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(this.popEnterAnim));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(this.popExitAnim));
            sb2.append(")");
        }
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }

    public C3420z(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C3414t.INSTANCE.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.popUpToRoute = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3420z(boolean z10, boolean z11, d<?> dVar, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C3738c.b(g.a(dVar)), z12, z13, i10, i11, i12, i13);
        C3862t.d(dVar);
        this.popUpToRouteClass = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3420z(boolean z10, boolean z11, Object popUpToRouteObject, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, C3738c.b(g.a(P.b(popUpToRouteObject.getClass()))), z12, z13, i10, i11, i12, i13);
        C3862t.g(popUpToRouteObject, "popUpToRouteObject");
        this.popUpToRouteObject = popUpToRouteObject;
    }
}
