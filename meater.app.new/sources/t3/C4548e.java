package t3;

import android.os.Bundle;
import android.view.AbstractC2106m;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: SavedStateRegistryController.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0019"}, d2 = {"Lt3/e;", "", "Lt3/f;", "owner", "<init>", "(Lt3/f;)V", "Loa/F;", "c", "()V", "Landroid/os/Bundle;", "savedState", "d", "(Landroid/os/Bundle;)V", "outBundle", "e", "a", "Lt3/f;", "Lt3/d;", "b", "Lt3/d;", "()Lt3/d;", "savedStateRegistry", "", "Z", "attached", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4548e {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4549f owner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4547d savedStateRegistry;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lt3/e$a;", "", "<init>", "()V", "Lt3/f;", "owner", "Lt3/e;", "a", "(Lt3/f;)Lt3/e;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C4548e a(InterfaceC4549f owner) {
            C3862t.g(owner, "owner");
            return new C4548e(owner, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ C4548e(InterfaceC4549f interfaceC4549f, C3854k c3854k) {
        this(interfaceC4549f);
    }

    public static final C4548e a(InterfaceC4549f interfaceC4549f) {
        return INSTANCE.a(interfaceC4549f);
    }

    /* renamed from: b, reason: from getter */
    public final C4547d getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void c() {
        AbstractC2106m lifecycle = this.owner.getLifecycle();
        if (lifecycle.getState() != AbstractC2106m.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C4545b(this.owner));
        this.savedStateRegistry.e(lifecycle);
        this.attached = true;
    }

    public final void d(Bundle savedState) {
        if (!this.attached) {
            c();
        }
        AbstractC2106m lifecycle = this.owner.getLifecycle();
        if (!lifecycle.getState().j(AbstractC2106m.b.STARTED)) {
            this.savedStateRegistry.f(savedState);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getState()).toString());
    }

    public final void e(Bundle outBundle) {
        C3862t.g(outBundle, "outBundle");
        this.savedStateRegistry.g(outBundle);
    }

    private C4548e(InterfaceC4549f interfaceC4549f) {
        this.owner = interfaceC4549f;
        this.savedStateRegistry = new C4547d();
    }
}
