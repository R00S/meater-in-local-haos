package cc;

import kotlin.Metadata;

/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcc/g;", "LXb/I;", "Lta/g;", "context", "<init>", "(Lta/g;)V", "", "toString", "()Ljava/lang/String;", "B", "Lta/g;", "getCoroutineContext", "()Lta/g;", "coroutineContext", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final class CoroutineScope implements Xb.I {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final ta.g coroutineContext;

    public CoroutineScope(ta.g gVar) {
        this.coroutineContext = gVar;
    }

    @Override // Xb.I
    public ta.g getCoroutineContext() {
        return this.coroutineContext;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
