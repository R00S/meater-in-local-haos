package androidx.compose.ui.platform;

import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/platform/a;", "view", "Landroidx/lifecycle/m;", "lifecycle", "Lkotlin/Function0;", "Loa/F;", "c", "(Landroidx/compose/ui/platform/a;Landroidx/lifecycle/m;)LBa/a;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h1 {

    /* compiled from: ViewCompositionStrategy.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f23142B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC2111s f23143C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2106m abstractC2106m, InterfaceC2111s interfaceC2111s) {
            super(0);
            this.f23142B = abstractC2106m;
            this.f23143C = interfaceC2111s;
        }

        public final void a() {
            this.f23142B.d(this.f23143C);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ba.a<C4153F> c(final AbstractC2004a abstractC2004a, AbstractC2106m abstractC2106m) {
        if (abstractC2106m.getState().compareTo(AbstractC2106m.b.DESTROYED) > 0) {
            InterfaceC2111s interfaceC2111s = new InterfaceC2111s() { // from class: androidx.compose.ui.platform.g1
                @Override // android.view.InterfaceC2111s
                public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                    h1.d(abstractC2004a, interfaceC2114v, aVar);
                }
            };
            abstractC2106m.a(interfaceC2111s);
            return new a(abstractC2106m, interfaceC2111s);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC2004a + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC2106m + "is already destroyed").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC2004a abstractC2004a, InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
        if (aVar == AbstractC2106m.a.ON_DESTROY) {
            abstractC2004a.e();
        }
    }
}
