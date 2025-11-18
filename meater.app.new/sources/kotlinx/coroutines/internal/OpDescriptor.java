package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.C11049t0;
import okhttp3.HttpUrl;

/* compiled from: Atomic.kt */
@Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\f\u001a\u00020\rH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m32267d2 = {"Lkotlinx/coroutines/internal/OpDescriptor;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "isEarlierThan", HttpUrl.FRAGMENT_ENCODE_SET, "that", "perform", "affected", "toString", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.z, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class OpDescriptor {
    /* renamed from: a */
    public abstract AtomicOp<?> mo39447a();

    /* renamed from: b */
    public final boolean m39595b(OpDescriptor opDescriptor) {
        AtomicOp<?> atomicOpMo39447a;
        AtomicOp<?> atomicOpMo39447a2 = mo39447a();
        return (atomicOpMo39447a2 == null || (atomicOpMo39447a = opDescriptor.mo39447a()) == null || atomicOpMo39447a2.m39450f() >= atomicOpMo39447a.m39450f()) ? false : true;
    }

    /* renamed from: c */
    public abstract Object mo39448c(Object obj);

    public String toString() {
        return C11049t0.m39687a(this) + '@' + C11049t0.m39688b(this);
    }
}
