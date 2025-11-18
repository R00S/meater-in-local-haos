package Zb;

import kotlin.Metadata;
import oa.C4153F;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"E", "", "capacity", "LZb/d;", "onBufferOverflow", "Lkotlin/Function1;", "Loa/F;", "onUndeliveredElement", "LZb/g;", "a", "(ILZb/d;LBa/l;)LZb/g;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    public static final <E> g<E> a(int i10, d dVar, Ba.l<? super E, C4153F> lVar) {
        g<E> eVar;
        if (i10 == -2) {
            eVar = dVar == d.f19650B ? new e<>(g.INSTANCE.a(), lVar) : new p<>(1, dVar, lVar);
        } else {
            if (i10 == -1) {
                if (dVar == d.f19650B) {
                    return new p(1, d.f19651C, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i10 != 0) {
                return i10 != Integer.MAX_VALUE ? dVar == d.f19650B ? new e(i10, lVar) : new p(i10, dVar, lVar) : new e(Integer.MAX_VALUE, lVar);
            }
            eVar = dVar == d.f19650B ? new e<>(0, lVar) : new p<>(1, dVar, lVar);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i10, d dVar, Ba.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            dVar = d.f19650B;
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        return a(i10, dVar, lVar);
    }
}
