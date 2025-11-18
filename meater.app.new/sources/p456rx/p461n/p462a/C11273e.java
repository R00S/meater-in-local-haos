package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Queue;
import p456rx.C11231b;
import p456rx.exceptions.CompositeException;

/* compiled from: CompletableOnSubscribeMerge.java */
/* renamed from: rx.n.a.e */
/* loaded from: classes3.dex */
public final class C11273e implements C11231b.w {
    /* renamed from: a */
    public static Throwable m40197a(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable thPoll = queue.poll();
            if (thPoll == null) {
                break;
            }
            arrayList.add(thPoll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new CompositeException(arrayList);
    }
}
