package d;

import android.view.InterfaceC2114v;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ld/G;", "Landroidx/lifecycle/v;", "owner", "", "enabled", "Lkotlin/Function1;", "Ld/F;", "Loa/F;", "onBackPressed", "a", "(Ld/G;Landroidx/lifecycle/v;ZLBa/l;)Ld/F;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I {

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"d/I$a", "Ld/F;", "Loa/F;", "d", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends AbstractC2994F {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ba.l<AbstractC2994F, C4153F> f39545d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z10, Ba.l<? super AbstractC2994F, C4153F> lVar) {
            super(z10);
            this.f39545d = lVar;
        }

        @Override // d.AbstractC2994F
        public void d() {
            this.f39545d.invoke(this);
        }
    }

    public static final AbstractC2994F a(C2995G c2995g, InterfaceC2114v interfaceC2114v, boolean z10, Ba.l<? super AbstractC2994F, C4153F> onBackPressed) {
        C3862t.g(c2995g, "<this>");
        C3862t.g(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (interfaceC2114v != null) {
            c2995g.h(interfaceC2114v, aVar);
        } else {
            c2995g.i(aVar);
        }
        return aVar;
    }

    public static /* synthetic */ AbstractC2994F b(C2995G c2995g, InterfaceC2114v interfaceC2114v, boolean z10, Ba.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2114v = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(c2995g, interfaceC2114v, z10, lVar);
    }
}
