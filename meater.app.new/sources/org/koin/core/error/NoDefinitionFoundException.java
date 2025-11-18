package org.koin.core.error;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: NoDefinitionFoundException.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/koin/core/error/NoDefinitionFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "<init>", "(Ljava/lang/String;)V", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoDefinitionFoundException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoDefinitionFoundException(String msg) {
        super(msg);
        C3862t.g(msg, "msg");
    }
}
