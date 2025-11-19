package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;
import ta.g;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/a;", "Lta/d;", "", "completion", "Lta/g;", "_context", "<init>", "(Lta/d;Lta/g;)V", "(Lta/d;)V", "intercepted", "()Lta/d;", "Loa/F;", "releaseIntercepted", "()V", "Lta/g;", "Lta/d;", "getContext", "()Lta/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class d extends a {
    private final ta.g _context;
    private transient InterfaceC4588d<Object> intercepted;

    public d(InterfaceC4588d<Object> interfaceC4588d, ta.g gVar) {
        super(interfaceC4588d);
        this._context = gVar;
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        ta.g gVar = this._context;
        C3862t.d(gVar);
        return gVar;
    }

    public final InterfaceC4588d<Object> intercepted() {
        InterfaceC4588d<Object> interfaceC4588dM = this.intercepted;
        if (interfaceC4588dM == null) {
            ta.e eVar = (ta.e) getContext().b(ta.e.INSTANCE);
            if (eVar == null || (interfaceC4588dM = eVar.m(this)) == null) {
                interfaceC4588dM = this;
            }
            this.intercepted = interfaceC4588dM;
        }
        return interfaceC4588dM;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected void releaseIntercepted() {
        InterfaceC4588d<?> interfaceC4588d = this.intercepted;
        if (interfaceC4588d != null && interfaceC4588d != this) {
            g.b bVarB = getContext().b(ta.e.INSTANCE);
            C3862t.d(bVarB);
            ((ta.e) bVarB).l(interfaceC4588d);
        }
        this.intercepted = c.f43963B;
    }

    public d(InterfaceC4588d<Object> interfaceC4588d) {
        this(interfaceC4588d, interfaceC4588d != null ? interfaceC4588d.getContext() : null);
    }
}
