package ac;

import kotlin.AbstractC2288d;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lac/c;", "T", "Lbc/d;", "Lkotlin/Function2;", "LZb/t;", "Lta/d;", "Loa/F;", "", "block", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(LBa/p;Lta/g;ILZb/d;)V", "scope", "h", "(LZb/t;Lta/d;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "E", "LBa/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ac.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1968c<T> extends AbstractC2288d<T> {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<Zb.t<? super T>, InterfaceC4588d<? super C4153F>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public C1968c(Ba.p<? super Zb.t<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, ta.g gVar, int i10, Zb.d dVar) {
        super(gVar, i10, dVar);
        this.block = pVar;
    }

    static /* synthetic */ <T> Object p(C1968c<T> c1968c, Zb.t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objInvoke = ((C1968c) c1968c).block.invoke(tVar, interfaceC4588d);
        return objInvoke == C4696b.e() ? objInvoke : C4153F.f46609a;
    }

    @Override // kotlin.AbstractC2288d
    protected Object h(Zb.t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return p(this, tVar, interfaceC4588d);
    }

    @Override // kotlin.AbstractC2288d
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }
}
