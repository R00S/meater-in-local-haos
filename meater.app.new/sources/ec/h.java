package ec;

import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lec/h;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "submissionTime", "Lec/i;", "taskContext", "<init>", "(JLec/i;)V", "()V", "B", "J", "C", "Lec/i;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class h implements Runnable {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public long submissionTime;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public i taskContext;

    public h(long j10, i iVar) {
        this.submissionTime = j10;
        this.taskContext = iVar;
    }

    public h() {
        this(0L, l.f41001g);
    }
}
