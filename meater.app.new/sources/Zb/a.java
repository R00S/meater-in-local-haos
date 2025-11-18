package Zb;

import Xb.C1846k0;
import Xb.G;
import Xb.InterfaceC1867v0;
import Xb.M;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LZb/a;", "E", "LZb/h;", "LZb/c;", "Lta/g;", "parentContext", "LZb/g;", "channel", "", "active", "<init>", "(Lta/g;LZb/g;Z)V", "", "cause", "Loa/F;", "K0", "(Ljava/lang/Throwable;)V", "exception", "u0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
class a<E> extends h<E> implements c<E> {
    public a(ta.g gVar, g<E> gVar2, boolean z10) {
        super(gVar, gVar2, false, z10);
        w0((InterfaceC1867v0) gVar.b(InterfaceC1867v0.INSTANCE));
    }

    @Override // Xb.C0
    protected void K0(Throwable cause) {
        g<E> gVarF1 = f1();
        if (cause != null) {
            cancellationExceptionA = cause instanceof CancellationException ? (CancellationException) cause : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = C1846k0.a(M.a(this) + " was cancelled", cause);
            }
        }
        gVarF1.e(cancellationExceptionA);
    }

    @Override // Xb.C0
    protected boolean u0(Throwable exception) {
        G.a(getContext(), exception);
        return true;
    }
}
