package d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: OnBackPressedCallback.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00028G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b\u001c\u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Ld/F;", "", "", "enabled", "<init>", "(Z)V", "Loa/F;", "h", "()V", "Ld/b;", "backEvent", "f", "(Ld/b;)V", "e", "d", "c", "Ld/c;", "cancellable", "a", "(Ld/c;)V", "i", "value", "Z", "g", "()Z", "j", "isEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "b", "Ljava/util/concurrent/CopyOnWriteArrayList;", "cancellables", "Lkotlin/Function0;", "LBa/a;", "()LBa/a;", "k", "(LBa/a;)V", "enabledChangedCallback", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: d.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2994F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<InterfaceC2999c> cancellables = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> enabledChangedCallback;

    public AbstractC2994F(boolean z10) {
        this.isEnabled = z10;
    }

    public final void a(InterfaceC2999c cancellable) {
        C3862t.g(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final Ba.a<C4153F> b() {
        return this.enabledChangedCallback;
    }

    public abstract void d();

    public void e(C2998b backEvent) {
        C3862t.g(backEvent, "backEvent");
    }

    public void f(C2998b backEvent) {
        C3862t.g(backEvent, "backEvent");
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void h() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((InterfaceC2999c) it.next()).cancel();
        }
    }

    public final void i(InterfaceC2999c cancellable) {
        C3862t.g(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void j(boolean z10) {
        this.isEnabled = z10;
        Ba.a<C4153F> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void k(Ba.a<C4153F> aVar) {
        this.enabledChangedCallback = aVar;
    }

    public void c() {
    }
}
