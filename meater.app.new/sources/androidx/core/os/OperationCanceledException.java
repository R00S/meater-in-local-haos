package androidx.core.os;

import r1.C4337d;

/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(C4337d.e(str, "The operation has been canceled."));
    }
}
