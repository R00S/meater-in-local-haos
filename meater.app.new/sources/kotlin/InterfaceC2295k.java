package kotlin;

import Zb.d;
import ac.InterfaceC1970e;
import kotlin.Metadata;
import ta.g;
import ta.h;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbc/k;", "T", "Lac/e;", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "e", "(Lta/g;ILZb/d;)Lac/e;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2295k<T> extends InterfaceC1970e<T> {

    /* compiled from: ChannelFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bc.k$a */
    public static final class a {
        public static /* synthetic */ InterfaceC1970e a(InterfaceC2295k interfaceC2295k, g gVar, int i10, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i11 & 1) != 0) {
                gVar = h.f50000B;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                dVar = d.f19650B;
            }
            return interfaceC2295k.e(gVar, i10, dVar);
        }
    }

    InterfaceC1970e<T> e(g context, int capacity, d onBufferOverflow);
}
