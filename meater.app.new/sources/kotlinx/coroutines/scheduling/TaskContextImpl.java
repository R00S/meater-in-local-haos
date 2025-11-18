package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: Tasks.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m32267d2 = {"Lkotlinx/coroutines/scheduling/TaskContextImpl;", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskMode", HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "getTaskMode", "()I", "afterTask", HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.c3.j, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
final class TaskContextImpl implements TaskContext {

    /* renamed from: a */
    private final int f41629a;

    public TaskContextImpl(int i2) {
        this.f41629a = i2;
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: a */
    public void mo39188a() {
    }

    @Override // kotlinx.coroutines.scheduling.TaskContext
    /* renamed from: b, reason: from getter */
    public int getF41629a() {
        return this.f41629a;
    }
}
