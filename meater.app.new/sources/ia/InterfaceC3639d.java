package ia;

import Ba.p;
import ja.C3756a;
import ka.C3815c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: DataFlow.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lia/d;", "", "Lia/b;", "c", "()Lia/b;", "actionDispatcher", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: ia.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3639d {

    /* compiled from: DataFlow.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: ia.d$a */
    public static final class a {
        public static void a(InterfaceC3639d interfaceC3639d, p<? super C3756a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> onAction) {
            C3862t.g(interfaceC3639d, "this");
            C3862t.g(onAction, "onAction");
            interfaceC3639d.c().b(onAction);
        }

        public static Object b(InterfaceC3639d interfaceC3639d, Exception exc, C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) throws Exception {
            C3815c.f43834a.c("Uncaught error: " + exc + " - " + exc.getStackTrace(), exc);
            throw exc;
        }
    }

    C3637b c();
}
