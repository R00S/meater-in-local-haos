package io.uniflow.core.flow.error;

import Ia.d;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: BadOrWrongStateException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/uniflow/core/flow/error/BadOrWrongStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lja/a;", "state", "LIa/d;", "requiredState", "<init>", "(Lja/a;LIa/d;)V", "uniflow-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BadOrWrongStateException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadOrWrongStateException(C3756a state, d<? extends C3756a> requiredState) {
        super("BadOrWrongStateException: was in state:" + state + " but required state:" + requiredState);
        C3862t.g(state, "state");
        C3862t.g(requiredState, "requiredState");
    }
}
