package kotlin;

import Ba.l;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3389F;
import kotlin.C3414t;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;

/* compiled from: NavGraphNavigator.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lg3/w;", "Lg3/F;", "Lg3/v;", "Lg3/G;", "navigatorProvider", "<init>", "(Lg3/G;)V", "Lg3/m;", "entry", "Lg3/z;", "navOptions", "Lg3/F$a;", "navigatorExtras", "Loa/F;", "m", "(Lg3/m;Lg3/z;Lg3/F$a;)V", "l", "()Lg3/v;", "", "entries", "e", "(Ljava/util/List;Lg3/z;Lg3/F$a;)V", "c", "Lg3/G;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC3389F.b("navigation")
/* renamed from: g3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3417w extends AbstractC3389F<C3416v> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C3390G navigatorProvider;

    /* compiled from: NavGraphNavigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.w$a */
    static final class a extends AbstractC3864v implements l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ O<Bundle> f41815B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<Bundle> o10) {
            super(1);
            this.f41815B = o10;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            C3862t.g(key, "key");
            Bundle bundle = this.f41815B.f43978B;
            boolean z10 = true;
            if (bundle != null && bundle.containsKey(key)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public C3417w(C3390G navigatorProvider) {
        C3862t.g(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.Bundle] */
    private final void m(C3407m entry, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        C3414t destination = entry.getDestination();
        C3862t.e(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        C3416v c3416v = (C3416v) destination;
        O o10 = new O();
        o10.f43978B = entry.d();
        int startDestId = c3416v.getStartDestId();
        String startDestinationRoute = c3416v.getStartDestinationRoute();
        if (startDestId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + c3416v.A()).toString());
        }
        C3414t c3414tV = startDestinationRoute != null ? c3416v.V(startDestinationRoute, false) : c3416v.a0().g(startDestId);
        if (c3414tV == null) {
            throw new IllegalArgumentException("navigation destination " + c3416v.b0() + " is not a direct child of this NavGraph");
        }
        if (startDestinationRoute != null) {
            if (!C3862t.b(startDestinationRoute, c3414tV.getRoute())) {
                C3414t.b bVarJ = c3414tV.J(startDestinationRoute);
                Bundle matchingArgs = bVarJ != null ? bVarJ.getMatchingArgs() : null;
                if (matchingArgs != null && !matchingArgs.isEmpty()) {
                    ?? bundle = new Bundle();
                    bundle.putAll(matchingArgs);
                    T t10 = o10.f43978B;
                    if (((Bundle) t10) != null) {
                        bundle.putAll((Bundle) t10);
                    }
                    o10.f43978B = bundle;
                }
            }
            if (!c3414tV.z().isEmpty()) {
                List<String> listA = C3406l.a(c3414tV.z(), new a(o10));
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + c3414tV + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.navigatorProvider.d(c3414tV.getNavigatorName()).e(r.e(b().a(c3414tV, c3414tV.j((Bundle) o10.f43978B))), navOptions, navigatorExtras);
    }

    @Override // kotlin.AbstractC3389F
    public void e(List<C3407m> entries, C3420z navOptions, AbstractC3389F.a navigatorExtras) {
        C3862t.g(entries, "entries");
        Iterator<C3407m> it = entries.iterator();
        while (it.hasNext()) {
            m(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // kotlin.AbstractC3389F
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C3416v a() {
        return new C3416v(this);
    }
}
