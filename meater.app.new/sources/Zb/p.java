package Zb;

import Zb.k;
import cc.C2393x;
import kotlin.Metadata;
import kotlin.jvm.internal.P;
import kotlinx.coroutines.internal.UndeliveredElementException;
import oa.C4153F;
import oa.C4158c;
import ta.InterfaceC4588d;

/* compiled from: ConflatedBufferedChannel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"LZb/p;", "E", "LZb/e;", "", "capacity", "LZb/d;", "onBufferOverflow", "Lkotlin/Function1;", "Loa/F;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILZb/d;LBa/l;)V", "element", "", "isSendOp", "LZb/k;", "V0", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "U0", "v", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "N", "I", "O", "LZb/d;", "j0", "()Z", "isConflatedDropOldest", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class p<E> extends e<E> {

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final d onBufferOverflow;

    public p(int i10, d dVar, Ba.l<? super E, C4153F> lVar) {
        super(i10, lVar);
        this.capacity = i10;
        this.onBufferOverflow = dVar;
        if (dVar == d.f19650B) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + P.b(e.class).r() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    static /* synthetic */ <E> Object T0(p<E> pVar, E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionD;
        Object objV0 = pVar.V0(e10, true);
        if (!(objV0 instanceof k.Closed)) {
            return C4153F.f46609a;
        }
        k.e(objV0);
        Ba.l<E, C4153F> lVar = pVar.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionD = C2393x.d(lVar, e10, null, 2, null)) == null) {
            throw pVar.V();
        }
        C4158c.a(undeliveredElementExceptionD, pVar.V());
        throw undeliveredElementExceptionD;
    }

    private final Object U0(E element, boolean isSendOp) {
        Ba.l<E, C4153F> lVar;
        UndeliveredElementException undeliveredElementExceptionD;
        Object objW = super.w(element);
        if (k.i(objW) || k.h(objW)) {
            return objW;
        }
        if (!isSendOp || (lVar = this.onUndeliveredElement) == null || (undeliveredElementExceptionD = C2393x.d(lVar, element, null, 2, null)) == null) {
            return k.INSTANCE.c(C4153F.f46609a);
        }
        throw undeliveredElementExceptionD;
    }

    private final Object V0(E element, boolean isSendOp) {
        return this.onBufferOverflow == d.f19652D ? U0(element, isSendOp) : J0(element);
    }

    @Override // Zb.e
    protected boolean j0() {
        return this.onBufferOverflow == d.f19651C;
    }

    @Override // Zb.e, Zb.w
    public Object v(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return T0(this, e10, interfaceC4588d);
    }

    @Override // Zb.e, Zb.w
    public Object w(E element) {
        return V0(element, false);
    }
}
