package Xb;

import cc.C2365J;
import cc.C2379j;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4158c;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;

/* compiled from: DispatchedTask.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LXb/W;", "T", "Lec/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "g", "()Ljava/lang/Object;", "takenState", "", "cause", "Loa/F;", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "finallyException", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "D", "I", "Lta/d;", "b", "()Lta/d;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class W<T> extends ec.h {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public int resumeMode;

    public W(int i10) {
        this.resumeMode = i10;
    }

    public abstract InterfaceC4588d<T> b();

    public Throwable d(Object state) {
        C1874z c1874z = state instanceof C1874z ? (C1874z) state : null;
        if (c1874z != null) {
            return c1874z.cause;
        }
        return null;
    }

    public final void f(Throwable exception, Throwable finallyException) {
        if (exception == null && finallyException == null) {
            return;
        }
        if (exception != null && finallyException != null) {
            C4158c.a(exception, finallyException);
        }
        if (exception == null) {
            exception = finallyException;
        }
        C3862t.d(exception);
        G.a(b().getContext(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", exception));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        Object objA;
        Object objA2;
        ec.i iVar = this.taskContext;
        try {
            InterfaceC4588d<T> interfaceC4588dB = b();
            C3862t.e(interfaceC4588dB, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2379j c2379j = (C2379j) interfaceC4588dB;
            InterfaceC4588d<T> interfaceC4588d = c2379j.continuation;
            Object obj = c2379j.countOrElement;
            ta.g context = interfaceC4588d.getContext();
            Object objC = C2365J.c(context, obj);
            X0<?> x0G = objC != C2365J.f31152a ? D.g(interfaceC4588d, context, objC) : null;
            try {
                ta.g context2 = interfaceC4588d.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                InterfaceC1867v0 interfaceC1867v0 = (thD == null && X.b(this.resumeMode)) ? (InterfaceC1867v0) context2.b(InterfaceC1867v0.INSTANCE) : null;
                if (interfaceC1867v0 != null && !interfaceC1867v0.a()) {
                    CancellationException cancellationExceptionU = interfaceC1867v0.u();
                    a(objG, cancellationExceptionU);
                    C4172q.Companion companion = C4172q.INSTANCE;
                    interfaceC4588d.resumeWith(C4172q.a(C4173r.a(cancellationExceptionU)));
                } else if (thD != null) {
                    C4172q.Companion companion2 = C4172q.INSTANCE;
                    interfaceC4588d.resumeWith(C4172q.a(C4173r.a(thD)));
                } else {
                    C4172q.Companion companion3 = C4172q.INSTANCE;
                    interfaceC4588d.resumeWith(C4172q.a(e(objG)));
                }
                C4153F c4153f = C4153F.f46609a;
                if (x0G == null || x0G.f1()) {
                    C2365J.a(context, objC);
                }
                try {
                    iVar.a();
                    objA2 = C4172q.a(C4153F.f46609a);
                } catch (Throwable th) {
                    C4172q.Companion companion4 = C4172q.INSTANCE;
                    objA2 = C4172q.a(C4173r.a(th));
                }
                f(null, C4172q.b(objA2));
            } catch (Throwable th2) {
                if (x0G == null || x0G.f1()) {
                    C2365J.a(context, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C4172q.Companion companion5 = C4172q.INSTANCE;
                iVar.a();
                objA = C4172q.a(C4153F.f46609a);
            } catch (Throwable th4) {
                C4172q.Companion companion6 = C4172q.INSTANCE;
                objA = C4172q.a(C4173r.a(th4));
            }
            f(th3, C4172q.b(objA));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object state) {
        return state;
    }

    public void a(Object takenState, Throwable cause) {
    }
}
