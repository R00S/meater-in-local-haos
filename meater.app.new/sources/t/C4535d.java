package t;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: RuntimeHelpers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"", "message", "Loa/F;", "b", "(Ljava/lang/String;)V", "a", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4535d {
    public static final void a(String message) {
        C3862t.g(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        C3862t.g(message, "message");
        throw new IllegalStateException(message);
    }
}
