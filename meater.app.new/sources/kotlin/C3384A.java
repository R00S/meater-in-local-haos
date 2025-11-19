package kotlin;

import Ba.l;
import Ia.d;
import Ub.n;
import kotlin.C3420z;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: NavOptionsBuilder.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010'\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00048\u0006@@X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010.\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0016\u00100\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R6\u00108\u001a\b\u0012\u0002\b\u0003\u0018\u0001012\f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u0001018F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010?\u001a\u0004\u0018\u00010\u00012\b\u0010!\u001a\u0004\u0018\u00010\u00018F@BX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lg3/A;", "", "<init>", "()V", "", "id", "Lkotlin/Function1;", "Lg3/I;", "Loa/F;", "popUpToBuilder", "c", "(ILBa/l;)V", "Lg3/d;", "animBuilder", "a", "(LBa/l;)V", "Lg3/z;", "b", "()Lg3/z;", "Lg3/z$a;", "Lg3/z$a;", "builder", "", "Z", "getLaunchSingleTop", "()Z", "d", "(Z)V", "launchSingleTop", "<set-?>", "getRestoreState", "g", "restoreState", "value", "I", "getPopUpToId", "()I", "e", "(I)V", "popUpToId", "", "Ljava/lang/String;", "getPopUpToRoute", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "popUpToRoute", "inclusive", "saveState", "LIa/d;", "h", "LIa/d;", "getPopUpToRouteClass", "()LIa/d;", "setPopUpToRouteClass", "(LIa/d;)V", "popUpToRouteClass", "i", "Ljava/lang/Object;", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "popUpToRouteObject", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3384A {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean launchSingleTop;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean restoreState;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean inclusive;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean saveState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private d<?> popUpToRouteClass;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Object popUpToRouteObject;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3420z.a builder = new C3420z.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int popUpToId = -1;

    private final void f(String str) {
        if (str != null) {
            if (n.a0(str)) {
                throw new IllegalArgumentException("Cannot pop up to an empty route");
            }
            this.popUpToRoute = str;
            this.inclusive = false;
        }
    }

    public final void a(l<? super C3398d, C4153F> animBuilder) {
        C3862t.g(animBuilder, "animBuilder");
        C3398d c3398d = new C3398d();
        animBuilder.invoke(c3398d);
        this.builder.b(c3398d.getEnter()).c(c3398d.getExit()).e(c3398d.getPopEnter()).f(c3398d.getPopExit());
    }

    public final C3420z b() {
        C3420z.a aVar = this.builder;
        aVar.d(this.launchSingleTop);
        aVar.l(this.restoreState);
        String str = this.popUpToRoute;
        if (str != null) {
            aVar.j(str, this.inclusive, this.saveState);
        } else {
            d<?> dVar = this.popUpToRouteClass;
            if (dVar != null) {
                C3862t.d(dVar);
                aVar.h(dVar, this.inclusive, this.saveState);
            } else {
                Object obj = this.popUpToRouteObject;
                if (obj != null) {
                    C3862t.d(obj);
                    aVar.i(obj, this.inclusive, this.saveState);
                } else {
                    aVar.g(this.popUpToId, this.inclusive, this.saveState);
                }
            }
        }
        return aVar.a();
    }

    public final void c(int id2, l<? super C3392I, C4153F> popUpToBuilder) {
        C3862t.g(popUpToBuilder, "popUpToBuilder");
        e(id2);
        f(null);
        C3392I c3392i = new C3392I();
        popUpToBuilder.invoke(c3392i);
        this.inclusive = c3392i.getInclusive();
        this.saveState = c3392i.getSaveState();
    }

    public final void d(boolean z10) {
        this.launchSingleTop = z10;
    }

    public final void e(int i10) {
        this.popUpToId = i10;
        this.inclusive = false;
    }

    public final void g(boolean z10) {
        this.restoreState = z10;
    }
}
