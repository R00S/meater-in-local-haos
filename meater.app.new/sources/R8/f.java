package R8;

import N8.g;
import Ub.n;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;

/* compiled from: CrashlyticsWorkers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"LR8/f;", "", "Ljava/util/concurrent/ExecutorService;", "backgroundExecutorService", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "LR8/e;", "a", "LR8/e;", "common", "b", "diskWrite", "c", "dataCollect", "d", "network", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f15093f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final e common;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final e diskWrite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final e dataCollect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final e network;

    /* compiled from: CrashlyticsWorkers.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LR8/f$a;", "", "<init>", "()V", "", "m", "()Z", "l", "k", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "Loa/F;", "h", "(LBa/a;LBa/a;)V", "g", "f", "e", "kotlin.jvm.PlatformType", "j", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "i", "n", "(Z)V", "getEnforcement$annotations", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R8.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R8.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0220a extends C3860q implements Ba.a<Boolean> {
            C0220a(Object obj) {
                super(0, obj, Companion.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // Ba.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).k());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: R8.f$a$b */
        static final class b extends AbstractC3864v implements Ba.a<String> {

            /* renamed from: B, reason: collision with root package name */
            public static final b f15098B = new b();

            b() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a background thread, was called on " + f.INSTANCE.j() + '.';
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R8.f$a$c */
        /* synthetic */ class c extends C3860q implements Ba.a<Boolean> {
            c(Object obj) {
                super(0, obj, Companion.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // Ba.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).l());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: R8.f$a$d */
        static final class d extends AbstractC3864v implements Ba.a<String> {

            /* renamed from: B, reason: collision with root package name */
            public static final d f15099B = new d();

            d() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + f.INSTANCE.j() + '.';
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: R8.f$a$e */
        /* synthetic */ class e extends C3860q implements Ba.a<Boolean> {
            e(Object obj) {
                super(0, obj, Companion.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // Ba.a
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).m());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: R8.f$a$f, reason: collision with other inner class name */
        static final class C0221f extends AbstractC3864v implements Ba.a<String> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0221f f15100B = new C0221f();

            C0221f() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + f.INSTANCE.j() + '.';
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final void h(Ba.a<Boolean> isCorrectThread, Ba.a<String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            g.f().b(failureMessage.invoke());
            i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            String threadName = j();
            C3862t.f(threadName, "threadName");
            return n.L(threadName, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String threadName = j();
            C3862t.f(threadName, "threadName");
            return n.L(threadName, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new C0220a(this), b.f15098B);
        }

        public final void f() {
            h(new c(this), d.f15099B);
        }

        public final void g() {
            h(new e(this), C0221f.f15100B);
        }

        public final boolean i() {
            return f.f15093f;
        }

        public final void n(boolean z10) {
            f.f15093f = z10;
        }

        private Companion() {
        }
    }

    public f(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        C3862t.g(backgroundExecutorService, "backgroundExecutorService");
        C3862t.g(blockingExecutorService, "blockingExecutorService");
        this.common = new e(backgroundExecutorService);
        this.diskWrite = new e(backgroundExecutorService);
        this.dataCollect = new e(backgroundExecutorService);
        this.network = new e(blockingExecutorService);
    }

    public static final void c() {
        INSTANCE.e();
    }

    public static final void d() {
        INSTANCE.f();
    }

    public static final void e() {
        INSTANCE.g();
    }

    public static final void f(boolean z10) {
        INSTANCE.n(z10);
    }
}
