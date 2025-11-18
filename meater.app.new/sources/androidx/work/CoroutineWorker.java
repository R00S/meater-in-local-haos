package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.p017o.C0798c;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10931d2;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* compiled from: CoroutineWorker.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u0005J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0013\u001a\u00020\u000e8\u0016@\u0017X\u0097\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00148\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u00020\u001a8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, m32267d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Le/e/c/a/a/a;", "Landroidx/work/ListenableWorker$a;", "startWork", "()Le/e/c/a/a/a;", "a", "(Lkotlin/y/d;)Ljava/lang/Object;", "Landroidx/work/h;", "d", "getForegroundInfoAsync", "Lkotlin/u;", "onStopped", "()V", "Lkotlinx/coroutines/i0;", "c", "Lkotlinx/coroutines/i0;", "()Lkotlinx/coroutines/i0;", "getCoroutineContext$annotations", "coroutineContext", "Landroidx/work/impl/utils/o/c;", "b", "Landroidx/work/impl/utils/o/c;", "g", "()Landroidx/work/impl/utils/o/c;", "future", "Lkotlinx/coroutines/z;", "Lkotlinx/coroutines/z;", "h", "()Lkotlinx/coroutines/z;", "job", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: a, reason: from kotlin metadata */
    private final CompletableJob job;

    /* renamed from: b, reason: from kotlin metadata */
    private final C0798c<ListenableWorker.AbstractC0698a> future;

    /* renamed from: c, reason: from kotlin metadata */
    private final CoroutineDispatcher coroutineContext;

    /* compiled from: CoroutineWorker.kt */
    /* renamed from: androidx.work.CoroutineWorker$a */
    static final class RunnableC0695a implements Runnable {
        RunnableC0695a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.m4762g().isCancelled()) {
                Job.a.m39712a(CoroutineWorker.this.getJob(), null, 1, null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @DebugMetadata(m39049c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", m39050f = "CoroutineWorker.kt", m39051l = {134}, m39052m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$b */
    static final class C0696b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        Object f4438f;

        /* renamed from: g */
        int f4439g;

        /* renamed from: h */
        final /* synthetic */ C0806m<C0709h> f4440h;

        /* renamed from: i */
        final /* synthetic */ CoroutineWorker f4441i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0696b(C0806m<C0709h> c0806m, CoroutineWorker coroutineWorker, Continuation<? super C0696b> continuation) {
            super(2, continuation);
            this.f4440h = c0806m;
            this.f4441i = coroutineWorker;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return new C0696b(this.f4440h, this.f4441i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((C0696b) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C0806m c0806m;
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f4439g;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                C0806m<C0709h> c0806m2 = this.f4440h;
                CoroutineWorker coroutineWorker = this.f4441i;
                this.f4438f = c0806m2;
                this.f4439g = 1;
                Object objM4761d = coroutineWorker.m4761d(this);
                if (objM4761d == objM39045c) {
                    return objM39045c;
                }
                c0806m = c0806m2;
                obj = objM4761d;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0806m = (C0806m) this.f4438f;
                C10568o.m37655b(obj);
            }
            c0806m.m5220b(obj);
            return C10775u.f41439a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @DebugMetadata(m39049c = "androidx.work.CoroutineWorker$startWork$1", m39050f = "CoroutineWorker.kt", m39051l = {68}, m39052m = "invokeSuspend")
    /* renamed from: androidx.work.CoroutineWorker$c */
    static final class C0697c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f4442f;

        C0697c(Continuation<? super C0697c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return CoroutineWorker.this.new C0697c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((C0697c) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f4442f;
            try {
                if (i2 == 0) {
                    C10568o.m37655b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f4442f = 1;
                    obj = coroutineWorker.m4759a(this);
                    if (obj == objM39045c) {
                        return objM39045c;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C10568o.m37655b(obj);
                }
                CoroutineWorker.this.m4762g().mo5193q((ListenableWorker.AbstractC0698a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.m4762g().mo5194r(th);
            }
            return C10775u.f41439a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C9801m.m32346f(context, "appContext");
        C9801m.m32346f(workerParameters, "params");
        this.job = C10931d2.m39272b(null, 1, null);
        C0798c<ListenableWorker.AbstractC0698a> c0798cM5203u = C0798c.m5203u();
        C9801m.m32345e(c0798cM5203u, "create()");
        this.future = c0798cM5203u;
        c0798cM5203u.mo5190g(new RunnableC0695a(), getTaskExecutor().mo5206c());
        this.coroutineContext = Dispatchers.m39300a();
    }

    /* renamed from: f */
    static /* synthetic */ Object m4758f(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: a */
    public abstract Object m4759a(Continuation<? super ListenableWorker.AbstractC0698a> continuation);

    /* renamed from: c, reason: from getter */
    public CoroutineDispatcher getCoroutineContext() {
        return this.coroutineContext;
    }

    /* renamed from: d */
    public Object m4761d(Continuation<? super C0709h> continuation) {
        return m4758f(this, continuation);
    }

    /* renamed from: g */
    public final C0798c<ListenableWorker.AbstractC0698a> m4762g() {
        return this.future;
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC8955a<C0709h> getForegroundInfoAsync() {
        CompletableJob completableJobM39272b = C10931d2.m39272b(null, 1, null);
        CoroutineScope coroutineScopeM39668a = C11033p0.m39668a(getCoroutineContext().plus(completableJobM39272b));
        C0806m c0806m = new C0806m(completableJobM39272b, null, 2, null);
        C11008j.m39597b(coroutineScopeM39668a, null, null, new C0696b(c0806m, this, null), 3, null);
        return c0806m;
    }

    /* renamed from: h, reason: from getter */
    public final CompletableJob getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC8955a<ListenableWorker.AbstractC0698a> startWork() {
        C11008j.m39597b(C11033p0.m39668a(getCoroutineContext().plus(this.job)), null, null, new C0697c(null), 3, null);
        return this.future;
    }
}
