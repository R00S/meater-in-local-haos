package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: ContinuationImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/c;", "Lta/d;", "", "<init>", "()V", "Loa/q;", "result", "Loa/F;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lta/g;", "getContext", "()Lta/g;", "context", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c implements InterfaceC4588d<Object> {

    /* renamed from: B, reason: collision with root package name */
    public static final c f43963B = new c();

    private c() {
    }

    @Override // ta.InterfaceC4588d
    public ta.g getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // ta.InterfaceC4588d
    public void resumeWith(Object result) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
