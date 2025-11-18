package ec;

import Xb.M;
import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lec/k;", "Lec/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "submissionTime", "Lec/i;", "taskContext", "<init>", "(Ljava/lang/Runnable;JLec/i;)V", "Loa/F;", "run", "()V", "", "toString", "()Ljava/lang/String;", "D", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k extends h {

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final Runnable block;

    public k(Runnable runnable, long j10, i iVar) {
        super(j10, iVar);
        this.block = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.block.run();
        } finally {
            this.taskContext.a();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.block) + '@' + M.b(this.block) + ", " + this.submissionTime + ", " + this.taskContext + ']';
    }
}
