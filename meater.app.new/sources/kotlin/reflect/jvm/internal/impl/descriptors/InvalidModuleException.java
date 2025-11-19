package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C3862t;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes3.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String message) {
        super(message);
        C3862t.g(message, "message");
    }
}
