package Xb;

import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: AbstractCoroutine.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001b\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JG\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00028\u00012\"\u0010)\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190(¢\u0006\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00107\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LXb/a;", "T", "LXb/C0;", "LXb/v0;", "Lta/d;", "LXb/I;", "Lta/g;", "parentContext", "", "initParentJob", "active", "<init>", "(Lta/g;ZZ)V", "value", "Loa/F;", "d1", "(Ljava/lang/Object;)V", "", "cause", "handled", "c1", "(Ljava/lang/Throwable;Z)V", "", "b0", "()Ljava/lang/String;", "", "state", "L0", "Loa/q;", "result", "resumeWith", "b1", "exception", "v0", "(Ljava/lang/Throwable;)V", "G0", "R", "LXb/K;", "start", "receiver", "Lkotlin/Function2;", "block", "e1", "(LXb/K;Ljava/lang/Object;LBa/p;)V", "D", "Lta/g;", "getContext", "()Lta/g;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "a", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1825a<T> extends C0 implements InterfaceC1867v0, InterfaceC4588d<T>, I {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final ta.g context;

    public AbstractC1825a(ta.g gVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            w0((InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE));
        }
        this.context = gVar.s(this);
    }

    @Override // Xb.C0
    public String G0() {
        String strB = D.b(this.context);
        if (strB == null) {
            return super.G0();
        }
        return '\"' + strB + "\":" + super.G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Xb.C0
    protected final void L0(Object state) {
        if (!(state instanceof C1874z)) {
            d1(state);
        } else {
            C1874z c1874z = (C1874z) state;
            c1(c1874z.cause, c1874z.a());
        }
    }

    @Override // Xb.C0, Xb.InterfaceC1867v0
    public boolean a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Xb.C0
    public String b0() {
        return M.a(this) + " was cancelled";
    }

    protected void b1(Object state) {
        H(state);
    }

    public final <R> void e1(K start, R receiver, Ba.p<? super R, ? super InterfaceC4588d<? super T>, ? extends Object> block) {
        start.j(block, receiver, this);
    }

    @Override // ta.InterfaceC4588d
    public final ta.g getContext() {
        return this.context;
    }

    @Override // Xb.I
    public ta.g getCoroutineContext() {
        return this.context;
    }

    @Override // ta.InterfaceC4588d
    public final void resumeWith(Object result) {
        Object objE0 = E0(B.d(result, null, 1, null));
        if (objE0 == D0.f19014b) {
            return;
        }
        b1(objE0);
    }

    @Override // Xb.C0
    public final void v0(Throwable exception) {
        G.a(this.context, exception);
    }

    protected void d1(T value) {
    }

    protected void c1(Throwable cause, boolean handled) {
    }
}
