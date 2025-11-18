package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes2.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m23635a(Task<?> task) {
        if (!task.mo23650m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excMo23646i = task.mo23646i();
        return new DuplicateTaskCompletionException("Complete with: ".concat(excMo23646i != null ? "failure" : task.mo23651n() ? "result ".concat(String.valueOf(task.mo23647j())) : task.mo23649l() ? "cancellation" : "unknown issue"), excMo23646i);
    }
}
