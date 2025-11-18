package kotlinx.coroutines.tasks;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10854c;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.C10863h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.HttpUrl;

/* compiled from: Tasks.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a!\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a)\u0010\b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m32267d2 = {"asDeferred", "Lkotlinx/coroutines/Deferred;", "T", "Lcom/google/android/gms/tasks/Task;", "cancellationTokenSource", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "asDeferredImpl", "asTask", "await", "(Lcom/google/android/gms/tasks/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitImpl", "kotlinx-coroutines-play-services"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.e3.b */
/* loaded from: classes3.dex */
public final class C10941b {

    /* compiled from: Tasks.kt */
    @Metadata(m32266d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u0001H\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "it", "Lcom/google/android/gms/tasks/Task;", "kotlin.jvm.PlatformType", "onComplete"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.e3.b$a */
    static final class a<TResult> implements OnCompleteListener {

        /* renamed from: a */
        final /* synthetic */ CancellableContinuation<T> f41706a;

        /* JADX WARN: Multi-variable type inference failed */
        a(CancellableContinuation<? super T> cancellableContinuation) {
            this.f41706a = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        /* renamed from: a */
        public final void mo7019a(Task<T> task) {
            Exception excMo23646i = task.mo23646i();
            if (excMo23646i != null) {
                Continuation continuation = this.f41706a;
                Result.a aVar = Result.f40714f;
                continuation.resumeWith(Result.m37650a(C10568o.m37654a(excMo23646i)));
            } else {
                if (task.mo23649l()) {
                    CancellableContinuation.a.m39638a(this.f41706a, null, 1, null);
                    return;
                }
                Continuation continuation2 = this.f41706a;
                Result.a aVar2 = Result.f40714f;
                continuation2.resumeWith(Result.m37650a(task.mo23647j()));
            }
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "it", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.e3.b$b */
    static final class b extends Lambda implements Function1<Throwable, C10775u> {

        /* renamed from: f */
        final /* synthetic */ CancellationTokenSource f41707f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f41707f = cancellationTokenSource;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
            invoke2(th);
            return C10775u.f41439a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.f41707f.m23634a();
        }
    }

    /* renamed from: a */
    public static final <T> Object m39307a(Task<T> task, Continuation<? super T> continuation) {
        return m39308b(task, null, continuation);
    }

    /* renamed from: b */
    private static final <T> Object m39308b(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) throws Exception {
        if (!task.mo23650m()) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C10854c.m39044b(continuation), 1);
            cancellableContinuationImpl.m39666z();
            task.mo23640c(DirectExecutor.f41705f, new a(cancellableContinuationImpl));
            if (cancellationTokenSource != null) {
                cancellableContinuationImpl.mo39632e(new b(cancellationTokenSource));
            }
            Object objM39664w = cancellableContinuationImpl.m39664w();
            if (objM39664w == C10855d.m39045c()) {
                C10863h.m39060c(continuation);
            }
            return objM39664w;
        }
        Exception excMo23646i = task.mo23646i();
        if (excMo23646i != null) {
            throw excMo23646i;
        }
        if (!task.mo23649l()) {
            return task.mo23647j();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
