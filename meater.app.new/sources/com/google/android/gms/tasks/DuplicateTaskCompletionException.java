package com.google.android.gms.tasks;

import z7.AbstractC5208j;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(AbstractC5208j<?> abstractC5208j) {
        if (!abstractC5208j.n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excJ = abstractC5208j.j();
        return new DuplicateTaskCompletionException("Complete with: ".concat(excJ != null ? "failure" : abstractC5208j.o() ? "result ".concat(String.valueOf(abstractC5208j.k())) : abstractC5208j.m() ? "cancellation" : "unknown issue"), excJ);
    }
}
