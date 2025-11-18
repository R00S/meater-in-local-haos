package E3;

import Ba.l;
import androidx.window.core.WindowStrictModeException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: SpecificationComputer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010*\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"LE3/f;", "", "T", "LE3/h;", "value", "", "tag", "message", "LE3/g;", "logger", "LE3/j;", "verificationMode", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;LE3/g;LE3/j;)V", "Lkotlin/Function1;", "", "condition", "c", "(Ljava/lang/String;LBa/l;)LE3/h;", "a", "()Ljava/lang/Object;", "b", "Ljava/lang/Object;", "getValue", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "d", "getMessage", "e", "LE3/g;", "getLogger", "()LE3/g;", "f", "LE3/j;", "getVerificationMode", "()LE3/j;", "Landroidx/window/core/WindowStrictModeException;", "g", "Landroidx/window/core/WindowStrictModeException;", "getException", "()Landroidx/window/core/WindowStrictModeException;", "exception", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f<T> extends h<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String message;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g logger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final j verificationMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final WindowStrictModeException exception;

    /* compiled from: SpecificationComputer.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3837a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3837a = iArr;
        }
    }

    public f(T value, String tag, String message, g logger, j verificationMode) {
        C3862t.g(value, "value");
        C3862t.g(tag, "tag");
        C3862t.g(message, "message");
        C3862t.g(logger, "logger");
        C3862t.g(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(b(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        C3862t.f(stackTrace, "stackTrace");
        windowStrictModeException.setStackTrace((StackTraceElement[]) C3831l.U(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.exception = windowStrictModeException;
    }

    @Override // E3.h
    public T a() throws WindowStrictModeException {
        int i10 = a.f3837a[this.verificationMode.ordinal()];
        if (i10 == 1) {
            throw this.exception;
        }
        if (i10 == 2) {
            this.logger.a(this.tag, b(this.value, this.message));
            return null;
        }
        if (i10 == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // E3.h
    public h<T> c(String message, l<? super T, Boolean> condition) {
        C3862t.g(message, "message");
        C3862t.g(condition, "condition");
        return this;
    }
}
