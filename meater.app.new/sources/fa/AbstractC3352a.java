package fa;

import Ba.p;
import Ba.q;
import Xb.I;
import android.view.O;
import android.view.Y;
import android.view.Z;
import ia.C3637b;
import ia.C3638c;
import ia.InterfaceC3639d;
import ia.InterfaceC3640e;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: AndroidDataFlow.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010&\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0015R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010/\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lfa/a;", "Landroidx/lifecycle/Y;", "Lia/d;", "Lia/e;", "Lja/a;", "defaultState", "Landroidx/lifecycle/O;", "savedStateHandle", "Lfa/b;", "config", "<init>", "(Lja/a;Landroidx/lifecycle/O;Lfa/b;)V", "state", "", "pushStateUpdate", "Loa/F;", "b", "(Lja/a;ZLta/d;)Ljava/lang/Object;", "getState", "()Lja/a;", "i", "()Lia/e;", "g", "()V", "", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "LXb/I;", "c", "LXb/I;", "getCoroutineScope", "()LXb/I;", "coroutineScope", "d", "Lia/e;", "j", "defaultDataPublisher", "Lia/c;", "e", "Lia/c;", "actionReducer", "Lia/b;", "f", "Lia/b;", "()Lia/b;", "actionDispatcher", "uniflow-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: fa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3352a extends Y implements InterfaceC3639d, InterfaceC3640e {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final I coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3640e defaultDataPublisher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C3638c actionReducer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C3637b actionDispatcher;

    /* compiled from: AndroidDataFlow.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: fa.a$a, reason: collision with other inner class name */
    /* synthetic */ class C0520a extends C3860q implements q {
        C0520a(Object obj) {
            super(3, obj, AbstractC3352a.class, "onError", "onError(Ljava/lang/Exception;Lio/uniflow/core/flow/data/UIState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // Ba.q
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object g(Exception exc, C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((AbstractC3352a) this.receiver).k(exc, c3756a, interfaceC4588d);
        }
    }

    /* compiled from: AndroidDataFlow.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: fa.a$b */
    /* synthetic */ class b extends C3860q implements Ba.a<InterfaceC3640e> {
        b(Object obj) {
            super(0, obj, AbstractC3352a.class, "defaultPublisher", "defaultPublisher()Lio/uniflow/core/flow/DataPublisher;", 0);
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3640e invoke() {
            return ((AbstractC3352a) this.receiver).getDefaultDataPublisher();
        }
    }

    public AbstractC3352a() {
        this(null, null, null, 7, null);
    }

    static /* synthetic */ Object l(AbstractC3352a abstractC3352a, C3756a c3756a, boolean z10, InterfaceC4588d interfaceC4588d) {
        Object objB = abstractC3352a.getDefaultDataPublisher().b(c3756a, z10, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    @Override // ia.InterfaceC3641f
    public Object b(C3756a c3756a, boolean z10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return l(this, c3756a, z10, interfaceC4588d);
    }

    @Override // ia.InterfaceC3639d
    /* renamed from: c, reason: from getter */
    public C3637b getActionDispatcher() {
        return this.actionDispatcher;
    }

    @Override // android.view.Y
    protected void g() {
        this.actionReducer.e();
        super.g();
    }

    @Override // ia.InterfaceC3641f
    /* renamed from: getState */
    public C3756a get_currentState() {
        return getDefaultDataPublisher().get_currentState();
    }

    public void h(p<? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        InterfaceC3639d.a.a(this, pVar);
    }

    /* renamed from: i, reason: from getter */
    public InterfaceC3640e getDefaultDataPublisher() {
        return this.defaultDataPublisher;
    }

    public final InterfaceC3640e j() {
        return this.defaultDataPublisher;
    }

    public Object k(Exception exc, C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return InterfaceC3639d.a.b(this, exc, c3756a, interfaceC4588d);
    }

    public Object m(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return InterfaceC3640e.a.a(this, c3756a, interfaceC4588d);
    }

    public /* synthetic */ AbstractC3352a(C3756a c3756a, O o10, AndroidDataFlowConfig androidDataFlowConfig, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? C3756a.C0559a.f43568B : c3756a, (i10 & 2) != 0 ? null : o10, (i10 & 4) != 0 ? new AndroidDataFlowConfig(0, null, null, 7, null) : androidDataFlowConfig);
    }

    public AbstractC3352a(C3756a defaultState, O o10, AndroidDataFlowConfig config) {
        C3862t.g(defaultState, "defaultState");
        C3862t.g(config, "config");
        String simpleName = getClass().getSimpleName();
        C3862t.f(simpleName, "this::class.java.simpleName");
        this.tag = simpleName;
        I iA = Z.a(this);
        this.coroutineScope = iA;
        this.defaultDataPublisher = config.c(defaultState, o10, simpleName);
        C3638c c3638c = new C3638c(new b(this), iA, config.getDefaultDispatcher(), config.getDefaultCapacity(), simpleName);
        this.actionReducer = c3638c;
        this.actionDispatcher = new C3637b(c3638c, new C0520a(this), simpleName);
    }
}
