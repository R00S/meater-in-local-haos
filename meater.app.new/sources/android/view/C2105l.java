package android.view;

import android.os.Bundle;
import android.view.AbstractC2106m;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import t3.C4547d;
import t3.InterfaceC4549f;

/* compiled from: LegacySavedStateHandleController.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/l;", "", "<init>", "()V", "Lt3/d;", "registry", "Landroidx/lifecycle/m;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/Q;", "b", "(Lt3/d;Landroidx/lifecycle/m;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/Q;", "Landroidx/lifecycle/Y;", "viewModel", "Loa/F;", "a", "(Landroidx/lifecycle/Y;Lt3/d;Landroidx/lifecycle/m;)V", "c", "(Lt3/d;Landroidx/lifecycle/m;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2105l {

    /* renamed from: a, reason: collision with root package name */
    public static final C2105l f25961a = new C2105l();

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/l$a;", "Lt3/d$a;", "<init>", "()V", "Lt3/f;", "owner", "Loa/F;", "a", "(Lt3/f;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.l$a */
    public static final class a implements C4547d.a {
        @Override // t3.C4547d.a
        public void a(InterfaceC4549f owner) throws NoSuchMethodException, SecurityException {
            C3862t.g(owner, "owner");
            if (!(owner instanceof c0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            b0 b0VarV = ((c0) owner).v();
            C4547d c4547dB = owner.B();
            Iterator<String> it = b0VarV.c().iterator();
            while (it.hasNext()) {
                Y yB = b0VarV.b(it.next());
                C3862t.d(yB);
                C2105l.a(yB, c4547dB, owner.getLifecycle());
            }
            if (b0VarV.c().isEmpty()) {
                return;
            }
            c4547dB.i(a.class);
        }
    }

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/l$b", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/v;", "source", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "f", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.l$b */
    public static final class b implements InterfaceC2111s {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f25962B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4547d f25963C;

        b(AbstractC2106m abstractC2106m, C4547d c4547d) {
            this.f25962B = abstractC2106m;
            this.f25963C = c4547d;
        }

        @Override // android.view.InterfaceC2111s
        public void f(InterfaceC2114v source, AbstractC2106m.a event) throws NoSuchMethodException, SecurityException {
            C3862t.g(source, "source");
            C3862t.g(event, "event");
            if (event == AbstractC2106m.a.ON_START) {
                this.f25962B.d(this);
                this.f25963C.i(a.class);
            }
        }
    }

    private C2105l() {
    }

    public static final void a(Y viewModel, C4547d registry, AbstractC2106m lifecycle) {
        C3862t.g(viewModel, "viewModel");
        C3862t.g(registry, "registry");
        C3862t.g(lifecycle, "lifecycle");
        Q q10 = (Q) viewModel.f("androidx.lifecycle.savedstate.vm.tag");
        if (q10 == null || q10.getIsAttached()) {
            return;
        }
        q10.a(registry, lifecycle);
        f25961a.c(registry, lifecycle);
    }

    public static final Q b(C4547d registry, AbstractC2106m lifecycle, String key, Bundle defaultArgs) {
        C3862t.g(registry, "registry");
        C3862t.g(lifecycle, "lifecycle");
        C3862t.d(key);
        Q q10 = new Q(key, O.INSTANCE.a(registry.b(key), defaultArgs));
        q10.a(registry, lifecycle);
        f25961a.c(registry, lifecycle);
        return q10;
    }

    private final void c(C4547d registry, AbstractC2106m lifecycle) throws NoSuchMethodException, SecurityException {
        AbstractC2106m.b state = lifecycle.getState();
        if (state == AbstractC2106m.b.INITIALIZED || state.j(AbstractC2106m.b.STARTED)) {
            registry.i(a.class);
        } else {
            lifecycle.a(new b(lifecycle, registry));
        }
    }
}
