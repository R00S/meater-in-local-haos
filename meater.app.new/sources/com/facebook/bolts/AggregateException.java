package com.facebook.bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: AggregateException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0006\u0010\tR\u001e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m32267d2 = {"Lcom/facebook/bolts/AggregateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Ljava/io/PrintStream;", "err", "Lkotlin/u;", "printStackTrace", "(Ljava/io/PrintStream;)V", "Ljava/io/PrintWriter;", "(Ljava/io/PrintWriter;)V", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "g", "Ljava/util/List;", "innerThrowables", "f", "a", "facebook-bolts_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class AggregateException extends Exception {

    /* renamed from: g, reason: from kotlin metadata */
    private final List<Throwable> innerThrowables;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream err) {
        C9801m.m32346f(err, "err");
        super.printStackTrace(err);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i2++;
            err.append((CharSequence) String.valueOf(i2));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter err) {
        C9801m.m32346f(err, "err");
        super.printStackTrace(err);
        int i2 = -1;
        for (Throwable th : this.innerThrowables) {
            err.append("\n");
            err.append("  Inner throwable #");
            i2++;
            err.append((CharSequence) String.valueOf(i2));
            err.append(": ");
            if (th != null) {
                th.printStackTrace(err);
            }
            err.append("\n");
        }
    }
}
