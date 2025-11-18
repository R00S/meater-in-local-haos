package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlinx.coroutines.C11045s0;
import okhttp3.HttpUrl;

/* compiled from: Atomic.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000e\u0010\fR\u0018\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m32267d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "<init>", "()V", "affected", HttpUrl.FRAGMENT_ENCODE_SET, "failure", HttpUrl.FRAGMENT_ENCODE_SET, "complete", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decision", "decide", "(Ljava/lang/Object;)Ljava/lang/Object;", "perform", "prepare", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "atomicOp", "getConsensus", "()Ljava/lang/Object;", "consensus", HttpUrl.FRAGMENT_ENCODE_SET, "isDecided", "()Z", HttpUrl.FRAGMENT_ENCODE_SET, "getOpSequence", "()J", "opSequence", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/OpDescriptor;"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.c, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public abstract class AtomicOp<T> extends OpDescriptor {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f41767a = AtomicReferenceFieldUpdater.newUpdater(AtomicOp.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C10971b.f41765a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    /* renamed from: a */
    public AtomicOp<?> mo39447a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    /* renamed from: c */
    public final Object mo39448c(Object obj) {
        Object objM39449e = this._consensus;
        if (objM39449e == C10971b.f41765a) {
            objM39449e = m39449e(mo39223g(obj));
        }
        mo39286d(obj, objM39449e);
        return objM39449e;
    }

    /* renamed from: d */
    public abstract void mo39286d(T t, Object obj);

    /* renamed from: e */
    public final Object m39449e(Object obj) {
        if (C11045s0.m39681a()) {
            if (!(obj != C10971b.f41765a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = C10971b.f41765a;
        return obj2 != obj3 ? obj2 : f41767a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m39450f() {
        return 0L;
    }

    /* renamed from: g */
    public abstract Object mo39223g(T t);
}
