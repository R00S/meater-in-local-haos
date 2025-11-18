package Xb;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00072\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010&\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b!\u0010%¨\u0006'"}, d2 = {"LXb/y;", "", "result", "LXb/k;", "cancelHandler", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;LXb/k;LBa/l;Ljava/lang/Object;Ljava/lang/Throwable;)V", "LXb/m;", "cont", "cause", "d", "(LXb/m;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;LXb/k;LBa/l;Ljava/lang/Object;Ljava/lang/Throwable;)LXb/y;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "LXb/k;", "c", "LBa/l;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.y, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
final /* data */ class CompletedContinuation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final Object result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final InterfaceC1845k cancelHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final Ba.l<Throwable, C4153F> onCancellation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final Object idempotentResume;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(Object obj, InterfaceC1845k interfaceC1845k, Ba.l<? super Throwable, C4153F> lVar, Object obj2, Throwable th) {
        this.result = obj;
        this.cancelHandler = interfaceC1845k;
        this.onCancellation = lVar;
        this.idempotentResume = obj2;
        this.cancelCause = th;
    }

    public static /* synthetic */ CompletedContinuation b(CompletedContinuation completedContinuation, Object obj, InterfaceC1845k interfaceC1845k, Ba.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            interfaceC1845k = completedContinuation.cancelHandler;
        }
        InterfaceC1845k interfaceC1845k2 = interfaceC1845k;
        if ((i10 & 4) != 0) {
            lVar = completedContinuation.onCancellation;
        }
        Ba.l lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = completedContinuation.cancelCause;
        }
        return completedContinuation.a(obj, interfaceC1845k2, lVar2, obj4, th);
    }

    public final CompletedContinuation a(Object result, InterfaceC1845k cancelHandler, Ba.l<? super Throwable, C4153F> onCancellation, Object idempotentResume, Throwable cancelCause) {
        return new CompletedContinuation(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public final boolean c() {
        return this.cancelCause != null;
    }

    public final void d(C1849m<?> cont, Throwable cause) {
        InterfaceC1845k interfaceC1845k = this.cancelHandler;
        if (interfaceC1845k != null) {
            cont.i(interfaceC1845k, cause);
        }
        Ba.l<Throwable, C4153F> lVar = this.onCancellation;
        if (lVar != null) {
            cont.j(lVar, cause);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return C3862t.b(this.result, completedContinuation.result) && C3862t.b(this.cancelHandler, completedContinuation.cancelHandler) && C3862t.b(this.onCancellation, completedContinuation.onCancellation) && C3862t.b(this.idempotentResume, completedContinuation.idempotentResume) && C3862t.b(this.cancelCause, completedContinuation.cancelCause);
    }

    public int hashCode() {
        Object obj = this.result;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        InterfaceC1845k interfaceC1845k = this.cancelHandler;
        int iHashCode2 = (iHashCode + (interfaceC1845k == null ? 0 : interfaceC1845k.hashCode())) * 31;
        Ba.l<Throwable, C4153F> lVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, InterfaceC1845k interfaceC1845k, Ba.l lVar, Object obj2, Throwable th, int i10, C3854k c3854k) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC1845k, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
