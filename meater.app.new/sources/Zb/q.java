package Zb;

import dc.C3102a;
import kotlin.Metadata;
import oa.C4153F;
import oa.InterfaceC4156a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\u0006\u0010\u0011\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"LZb/q;", "E", "LZb/a;", "Lta/g;", "parentContext", "LZb/g;", "channel", "Lkotlin/Function2;", "LZb/c;", "Lta/d;", "Loa/F;", "", "block", "<init>", "(Lta/g;LZb/g;LBa/p;)V", "M0", "()V", "element", "v", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "", "h", "(Ljava/lang/Object;)Z", "LZb/k;", "w", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "j", "(Ljava/lang/Throwable;)Z", "F", "Lta/d;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class q<E> extends a<E> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4588d<? super C4153F> continuation;

    public q(ta.g gVar, g<E> gVar2, Ba.p<? super c<E>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        super(gVar, gVar2, false);
        this.continuation = C4696b.a(pVar, this, this);
    }

    @Override // Xb.C0
    protected void M0() throws Throwable {
        C3102a.c(this.continuation, this);
    }

    @Override // Zb.h, Zb.w
    @InterfaceC4156a
    public boolean h(E element) {
        start();
        return super.h(element);
    }

    @Override // Zb.h, Zb.w
    public boolean j(Throwable cause) {
        boolean zJ = super.j(cause);
        start();
        return zJ;
    }

    @Override // Zb.h, Zb.w
    public Object v(E e10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        start();
        Object objV = super.v(e10, interfaceC4588d);
        return objV == C4696b.e() ? objV : C4153F.f46609a;
    }

    @Override // Zb.h, Zb.w
    public Object w(E element) {
        start();
        return super.w(element);
    }
}
