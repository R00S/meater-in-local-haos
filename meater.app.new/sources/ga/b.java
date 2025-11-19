package ga;

import Ba.l;
import android.view.E;
import android.view.InterfaceC2114v;
import androidx.fragment.app.Fragment;
import fa.AbstractC3352a;
import ia.InterfaceC3640e;
import ja.C3756a;
import ka.C3815c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: LiveDataObserver.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\u00020\u0005*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/fragment/app/Fragment;", "Lfa/a;", "vm", "Lkotlin/Function1;", "Lja/a;", "Loa/F;", "handleStates", "b", "(Landroidx/fragment/app/Fragment;Lfa/a;LBa/l;)V", "Lga/c;", "Landroidx/lifecycle/v;", "owner", "c", "(Lga/c;Landroidx/lifecycle/v;LBa/l;)V", "uniflow-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    public static final void b(Fragment fragment, AbstractC3352a vm, l<? super C3756a, C4153F> handleStates) {
        C3862t.g(fragment, "<this>");
        C3862t.g(vm, "vm");
        C3862t.g(handleStates, "handleStates");
        InterfaceC3640e interfaceC3640eJ = vm.j();
        c cVar = interfaceC3640eJ instanceof c ? (c) interfaceC3640eJ : null;
        if (cVar == null) {
            return;
        }
        InterfaceC2114v interfaceC2114vF0 = fragment.F0();
        C3862t.f(interfaceC2114vF0, "this.viewLifecycleOwner");
        c(cVar, interfaceC2114vF0, handleStates);
    }

    public static final void c(c cVar, final InterfaceC2114v owner, final l<? super C3756a, C4153F> handleStates) {
        C3862t.g(cVar, "<this>");
        C3862t.g(owner, "owner");
        C3862t.g(handleStates, "handleStates");
        cVar.c().h(owner, new E() { // from class: ga.a
            @Override // android.view.E
            public final void b(Object obj) {
                b.d(owner, handleStates, (C3756a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC2114v owner, l handleStates, C3756a c3756a) {
        C3862t.g(owner, "$owner");
        C3862t.g(handleStates, "$handleStates");
        if (c3756a == null) {
            return;
        }
        C3815c.f43834a.a("onStates - " + owner + " <- " + c3756a);
        handleStates.invoke(c3756a);
    }
}
