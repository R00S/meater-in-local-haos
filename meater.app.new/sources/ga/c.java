package ga;

import Ba.p;
import Xb.I;
import android.view.B;
import android.view.D;
import ia.InterfaceC3640e;
import ja.C3756a;
import ka.C3815c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import la.C3920a;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: LiveDataPublisher.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0!0\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\"\u0010\u001bR#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0!0\u001d8\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u001fR\u0016\u0010(\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lga/c;", "Lia/e;", "Lja/a;", "defaultState", "", "_tag", "<init>", "(Lja/a;Ljava/lang/String;)V", "getState", "()Lja/a;", "state", "", "pushStateUpdate", "Loa/F;", "b", "(Lja/a;ZLta/d;)Ljava/lang/Object;", "a", "Lja/a;", "getDefaultState", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "tag", "Landroidx/lifecycle/D;", "c", "Landroidx/lifecycle/D;", "e", "()Landroidx/lifecycle/D;", "_states", "Landroidx/lifecycle/B;", "Landroidx/lifecycle/B;", "()Landroidx/lifecycle/B;", "states", "", "get_events$uniflow_android_release", "_events", "f", "getEvents", "events", "g", "_currentState", "uniflow-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public class c implements InterfaceC3640e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3756a defaultState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D<C3756a> _states;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final B<C3756a> states;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D<Object> _events;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final B<Object> events;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C3756a _currentState;

    /* compiled from: LiveDataPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "io.uniflow.android.livedata.LiveDataPublisher$publishState$2", f = "LiveDataPublisher.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f42132B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C3756a f42133C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ c f42134D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f42135E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3756a c3756a, c cVar, boolean z10, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f42133C = c3756a;
            this.f42134D = cVar;
            this.f42135E = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f42133C, this.f42134D, this.f42135E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f42132B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            C3815c c3815c = C3815c.f43834a;
            c3815c.b(this.f42133C);
            c3815c.a(this.f42134D.getTag() + " new state " + this.f42133C);
            this.f42134D._currentState = this.f42133C;
            if (this.f42135E) {
                c3815c.a(this.f42134D.getTag() + " --> " + this.f42133C);
                this.f42134D.e().o(this.f42133C);
            }
            return C4153F.f46609a;
        }
    }

    public c(C3756a defaultState, String str) {
        C3862t.g(defaultState, "defaultState");
        this.defaultState = defaultState;
        this.tag = str == null ? toString() : str;
        D<C3756a> d10 = new D<>(defaultState);
        this._states = d10;
        this.states = d10;
        D<Object> d11 = new D<>();
        this._events = d11;
        this.events = d11;
        this._currentState = defaultState;
    }

    static /* synthetic */ Object f(c cVar, C3756a c3756a, boolean z10, InterfaceC4588d interfaceC4588d) {
        Object objC = C3920a.c(true, new a(c3756a, cVar, z10, null), interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    @Override // ia.InterfaceC3641f
    public Object b(C3756a c3756a, boolean z10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return f(this, c3756a, z10, interfaceC4588d);
    }

    public final B<C3756a> c() {
        return this.states;
    }

    /* renamed from: d, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final D<C3756a> e() {
        return this._states;
    }

    @Override // ia.InterfaceC3641f
    /* renamed from: getState, reason: from getter */
    public C3756a get_currentState() {
        return this._currentState;
    }
}
