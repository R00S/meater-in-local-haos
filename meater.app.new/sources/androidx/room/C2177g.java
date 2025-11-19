package androidx.room;

import Xb.C1852n0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/room/w;", "LXb/E;", "a", "(Landroidx/room/w;)LXb/E;", "b", "transactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177g {
    public static final Xb.E a(w wVar) {
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object objA = backingFieldMap.get("QueryDispatcher");
        if (objA == null) {
            objA = C1852n0.a(wVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", objA);
        }
        C3862t.e(objA, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (Xb.E) objA;
    }

    public static final Xb.E b(w wVar) {
        Map<String, Object> backingFieldMap = wVar.getBackingFieldMap();
        Object objA = backingFieldMap.get("TransactionDispatcher");
        if (objA == null) {
            objA = C1852n0.a(wVar.getTransactionExecutor());
            backingFieldMap.put("TransactionDispatcher", objA);
        }
        C3862t.e(objA, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
        return (Xb.E) objA;
    }
}
