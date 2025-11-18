package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: Exceptions.kt */
@Metadata(m32266d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m32267d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", HttpUrl.FRAGMENT_ENCODE_SET, "cause", HttpUrl.FRAGMENT_ENCODE_SET, "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "fillInStackTrace", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes3.dex */
public final class JobCancellationException extends CancellationException implements CopyableThrowable<JobCancellationException> {

    /* renamed from: f */
    public final transient Job f41557f;

    public JobCancellationException(String str, Throwable th, Job job) {
        super(str);
        this.f41557f = job;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // kotlinx.coroutines.CopyableThrowable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JobCancellationException mo39074a() {
        if (!C11045s0.m39683c()) {
            return null;
        }
        String message = getMessage();
        C9801m.m32343c(message);
        return new JobCancellationException(message, this, this.f41557f);
    }

    public boolean equals(Object other) {
        if (other != this) {
            if (other instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) other;
                if (!C9801m.m32341a(jobCancellationException.getMessage(), getMessage()) || !C9801m.m32341a(jobCancellationException.f41557f, this.f41557f) || !C9801m.m32341a(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C11045s0.m39683c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C9801m.m32343c(message);
        int iHashCode = ((message.hashCode() * 31) + this.f41557f.hashCode()) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f41557f;
    }
}
