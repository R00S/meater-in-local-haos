package Tb;

import java.util.Iterator;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SequenceBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000f\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LTb/j;", "T", "", "<init>", "()V", "value", "Loa/F;", "b", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "", "iterator", "g", "(Ljava/util/Iterator;Lta/d;)Ljava/lang/Object;", "LTb/h;", "sequence", "d", "(LTb/h;Lta/d;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class j<T> {
    public abstract Object b(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d);

    public final Object d(h<? extends T> hVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objG = g(hVar.iterator(), interfaceC4588d);
        return objG == C4696b.e() ? objG : C4153F.f46609a;
    }

    public abstract Object g(Iterator<? extends T> it, InterfaceC4588d<? super C4153F> interfaceC4588d);
}
