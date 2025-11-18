package Sa;

import kotlin.jvm.internal.C3862t;

/* compiled from: Annotations.kt */
/* loaded from: classes3.dex */
public final class j {
    public static final h a(h first, h second) {
        C3862t.g(first, "first");
        C3862t.g(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new o(first, second);
    }
}
