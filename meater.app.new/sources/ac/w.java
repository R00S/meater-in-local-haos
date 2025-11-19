package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Builders.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\f\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rR6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lac/w;", "T", "Lac/a;", "Lkotlin/Function2;", "Lac/f;", "Lta/d;", "Loa/F;", "", "block", "<init>", "(LBa/p;)V", "collector", "f", "(Lac/f;Lta/d;)Ljava/lang/Object;", "B", "LBa/p;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class w<T> extends AbstractC1966a<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<InterfaceC1971f<? super T>, InterfaceC4588d<? super C4153F>, Object> block;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Ba.p<? super InterfaceC1971f<? super T>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        this.block = pVar;
    }

    @Override // ac.AbstractC1966a
    public Object f(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objInvoke = this.block.invoke(interfaceC1971f, interfaceC4588d);
        return objInvoke == C4696b.e() ? objInvoke : C4153F.f46609a;
    }
}
