package Zb;

import cc.C2360E;
import kotlin.Metadata;
import oa.C4153F;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00028\u0000H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00040\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"LZb/w;", "E", "", "element", "Loa/F;", "v", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "LZb/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "", "j", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "handler", "c", "(LBa/l;)V", "h", "(Ljava/lang/Object;)Z", "A", "()Z", "isClosedForSend$annotations", "()V", "isClosedForSend", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface w<E> {

    /* compiled from: Channel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ boolean a(w wVar, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return wVar.j(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC4156a
        public static <E> boolean b(w<? super E> wVar, E e10) throws Throwable {
            Object objW = wVar.w(e10);
            if (k.i(objW)) {
                return true;
            }
            Throwable thE = k.e(objW);
            if (thE == null) {
                return false;
            }
            throw C2360E.a(thE);
        }
    }

    boolean A();

    void c(Ba.l<? super Throwable, C4153F> handler);

    @InterfaceC4156a
    boolean h(E element);

    boolean j(Throwable cause);

    Object v(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d);

    Object w(E element);
}
