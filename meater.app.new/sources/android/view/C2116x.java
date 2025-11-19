package android.view;

import ac.J;
import ac.t;
import android.view.AbstractC2106m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import p.C4188a;
import p.C4189b;

/* compiled from: LifecycleRegistry.jvm.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002\"%B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t04j\b\u0012\u0004\u0012\u00020\t`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010<R$\u0010@\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010>\"\u0004\b?\u0010\r¨\u0006A"}, d2 = {"Landroidx/lifecycle/x;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/v;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/v;Z)V", "(Landroidx/lifecycle/v;)V", "Landroidx/lifecycle/m$b;", "next", "Loa/F;", "k", "(Landroidx/lifecycle/m$b;)V", "Landroidx/lifecycle/u;", "observer", "f", "(Landroidx/lifecycle/u;)Landroidx/lifecycle/m$b;", "l", "()V", "state", "m", "lifecycleOwner", "h", "e", "o", "", "methodName", "g", "(Ljava/lang/String;)V", "Landroidx/lifecycle/m$a;", "event", "i", "(Landroidx/lifecycle/m$a;)V", "a", "(Landroidx/lifecycle/u;)V", "d", "b", "Z", "Lp/a;", "Landroidx/lifecycle/x$b;", "c", "Lp/a;", "observerMap", "Landroidx/lifecycle/m$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Lac/t;", "j", "Lac/t;", "_currentStateFlow", "()Z", "isSynced", "()Landroidx/lifecycle/m$b;", "n", "currentState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2116x extends AbstractC2106m {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceMainThread;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C4188a<InterfaceC2113u, b> observerMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m.b state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<InterfaceC2114v> lifecycleOwner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int addingObserverCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean handlingEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean newEventOccurred;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList<AbstractC2106m.b> parentStates;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<AbstractC2106m.b> _currentStateFlow;

    /* compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/x$a;", "", "<init>", "()V", "Landroidx/lifecycle/m$b;", "state1", "state2", "a", "(Landroidx/lifecycle/m$b;Landroidx/lifecycle/m$b;)Landroidx/lifecycle/m$b;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.x$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final AbstractC2106m.b a(AbstractC2106m.b state1, AbstractC2106m.b state2) {
            C3862t.g(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }

        private Companion() {
        }
    }

    /* compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/x$b;", "", "Landroidx/lifecycle/u;", "observer", "Landroidx/lifecycle/m$b;", "initialState", "<init>", "(Landroidx/lifecycle/u;Landroidx/lifecycle/m$b;)V", "Landroidx/lifecycle/v;", "owner", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "a", "(Landroidx/lifecycle/v;Landroidx/lifecycle/m$a;)V", "Landroidx/lifecycle/m$b;", "b", "()Landroidx/lifecycle/m$b;", "setState", "(Landroidx/lifecycle/m$b;)V", "state", "Landroidx/lifecycle/s;", "Landroidx/lifecycle/s;", "getLifecycleObserver", "()Landroidx/lifecycle/s;", "setLifecycleObserver", "(Landroidx/lifecycle/s;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.x$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private AbstractC2106m.b state;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private InterfaceC2111s lifecycleObserver;

        public b(InterfaceC2113u interfaceC2113u, AbstractC2106m.b initialState) {
            C3862t.g(initialState, "initialState");
            C3862t.d(interfaceC2113u);
            this.lifecycleObserver = A.f(interfaceC2113u);
            this.state = initialState;
        }

        public final void a(InterfaceC2114v owner, AbstractC2106m.a event) {
            C3862t.g(event, "event");
            AbstractC2106m.b bVarN = event.n();
            this.state = C2116x.INSTANCE.a(this.state, bVarN);
            InterfaceC2111s interfaceC2111s = this.lifecycleObserver;
            C3862t.d(owner);
            interfaceC2111s.f(owner, event);
            this.state = bVarN;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC2106m.b getState() {
            return this.state;
        }
    }

    private C2116x(InterfaceC2114v interfaceC2114v, boolean z10) {
        this.enforceMainThread = z10;
        this.observerMap = new C4188a<>();
        AbstractC2106m.b bVar = AbstractC2106m.b.INITIALIZED;
        this.state = bVar;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(interfaceC2114v);
        this._currentStateFlow = J.a(bVar);
    }

    private final void e(InterfaceC2114v lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC2113u, b>> itDescendingIterator = this.observerMap.descendingIterator();
        C3862t.f(itDescendingIterator, "observerMap.descendingIterator()");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<InterfaceC2113u, b> next = itDescendingIterator.next();
            C3862t.f(next, "next()");
            InterfaceC2113u key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                AbstractC2106m.a aVarA = AbstractC2106m.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                m(aVarA.n());
                value.a(lifecycleOwner, aVarA);
                l();
            }
        }
    }

    private final AbstractC2106m.b f(InterfaceC2113u observer) {
        b value;
        Map.Entry<InterfaceC2113u, b> entryW = this.observerMap.w(observer);
        AbstractC2106m.b bVar = null;
        AbstractC2106m.b state = (entryW == null || (value = entryW.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            bVar = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.a(companion.a(this.state, state), bVar);
    }

    private final void g(String methodName) {
        if (!this.enforceMainThread || C2118z.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void h(InterfaceC2114v lifecycleOwner) {
        C4189b<InterfaceC2113u, b>.d dVarH = this.observerMap.h();
        C3862t.f(dVarH, "observerMap.iteratorWithAdditions()");
        while (dVarH.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarH.next();
            InterfaceC2113u interfaceC2113u = (InterfaceC2113u) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(interfaceC2113u)) {
                m(bVar.getState());
                AbstractC2106m.a aVarB = AbstractC2106m.a.INSTANCE.b(bVar.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC2113u, b> entryC = this.observerMap.c();
        C3862t.d(entryC);
        AbstractC2106m.b state = entryC.getValue().getState();
        Map.Entry<InterfaceC2113u, b> entryI = this.observerMap.i();
        C3862t.d(entryI);
        AbstractC2106m.b state2 = entryI.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void k(AbstractC2106m.b next) {
        AbstractC2106m.b bVar = this.state;
        if (bVar == next) {
            return;
        }
        if (bVar == AbstractC2106m.b.INITIALIZED && next == AbstractC2106m.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + next + ", but was " + this.state + " in component " + this.lifecycleOwner.get()).toString());
        }
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        o();
        this.handlingEvent = false;
        if (this.state == AbstractC2106m.b.DESTROYED) {
            this.observerMap = new C4188a<>();
        }
    }

    private final void l() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void m(AbstractC2106m.b state) {
        this.parentStates.add(state);
    }

    private final void o() {
        InterfaceC2114v interfaceC2114v = this.lifecycleOwner.get();
        if (interfaceC2114v == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.newEventOccurred = false;
            AbstractC2106m.b bVar = this.state;
            Map.Entry<InterfaceC2113u, b> entryC = this.observerMap.c();
            C3862t.d(entryC);
            if (bVar.compareTo(entryC.getValue().getState()) < 0) {
                e(interfaceC2114v);
            }
            Map.Entry<InterfaceC2113u, b> entryI = this.observerMap.i();
            if (!this.newEventOccurred && entryI != null && this.state.compareTo(entryI.getValue().getState()) > 0) {
                h(interfaceC2114v);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    @Override // android.view.AbstractC2106m
    public void a(InterfaceC2113u observer) {
        InterfaceC2114v interfaceC2114v;
        C3862t.g(observer, "observer");
        g("addObserver");
        AbstractC2106m.b bVar = this.state;
        AbstractC2106m.b bVar2 = AbstractC2106m.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC2106m.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.r(observer, bVar3) == null && (interfaceC2114v = this.lifecycleOwner.get()) != null) {
            boolean z10 = this.addingObserverCounter != 0 || this.handlingEvent;
            AbstractC2106m.b bVarF = f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarF) < 0 && this.observerMap.contains(observer)) {
                m(bVar3.getState());
                AbstractC2106m.a aVarB = AbstractC2106m.a.INSTANCE.b(bVar3.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(interfaceC2114v, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z10) {
                o();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // android.view.AbstractC2106m
    /* renamed from: b, reason: from getter */
    public AbstractC2106m.b getState() {
        return this.state;
    }

    @Override // android.view.AbstractC2106m
    public void d(InterfaceC2113u observer) {
        C3862t.g(observer, "observer");
        g("removeObserver");
        this.observerMap.v(observer);
    }

    public void i(AbstractC2106m.a event) {
        C3862t.g(event, "event");
        g("handleLifecycleEvent");
        k(event.n());
    }

    public void n(AbstractC2106m.b state) {
        C3862t.g(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2116x(InterfaceC2114v provider) {
        this(provider, true);
        C3862t.g(provider, "provider");
    }
}
