package androidx.core.os;

import p024c.p052i.p059j.C0954d;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(C0954d.m6058c(str, "The operation has been canceled."));
    }
}
