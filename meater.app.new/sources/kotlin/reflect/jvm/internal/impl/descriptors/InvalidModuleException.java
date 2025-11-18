package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9801m;

/* compiled from: InvalidModuleException.kt */
/* loaded from: classes2.dex */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        C9801m.m32346f(str, "message");
    }
}
