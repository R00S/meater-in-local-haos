package com.facebook;

import com.facebook.internal.C5666a0;
import com.facebook.internal.p148t0.p152o.C5729e;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: FacebookException.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\t\b\u0016¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\tB\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0010"}, m32267d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "<init>", "()V", "message", "(Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "f", "a", "facebook-core_release"}, m32268k = 1, m32269mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {
    public FacebookException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m11137a(String str, boolean z) {
        if (z) {
            try {
                C5729e c5729e = C5729e.f14617a;
                C5729e.m11793g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? HttpUrl.FRAGMENT_ENCODE_SET : message;
    }

    public FacebookException(final String str) {
        super(str);
        Random random = new Random();
        if (str != null) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            if (!C5641a0.m11304w() || random.nextInt(100) <= 50) {
                return;
            }
            C5666a0 c5666a0 = C5666a0.f14313a;
            C5666a0.m11372a(C5666a0.b.ErrorReport, new C5666a0.a() { // from class: com.facebook.e
                @Override // com.facebook.internal.C5666a0.a
                /* renamed from: a */
                public final void mo11347a(boolean z) {
                    FacebookException.m11137a(str, z);
                }
            });
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
