package Xb;

import kotlin.Metadata;
import oa.C4153F;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LXb/k;", "LXb/K0;", "", "cause", "Loa/F;", "b", "(Ljava/lang/Throwable;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1845k extends K0 {

    /* compiled from: CancellableContinuationImpl.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXb/k$a;", "LXb/k;", "Lkotlin/Function1;", "", "Loa/F;", "handler", "<init>", "(LBa/l;)V", "cause", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "B", "LBa/l;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Xb.k$a */
    public static final class a implements InterfaceC1845k {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private final Ba.l<Throwable, C4153F> handler;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Ba.l<? super Throwable, C4153F> lVar) {
            this.handler = lVar;
        }

        @Override // Xb.InterfaceC1845k
        public void b(Throwable cause) {
            this.handler.invoke(cause);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + M.a(this.handler) + '@' + M.b(this) + ']';
        }
    }

    void b(Throwable cause);
}
