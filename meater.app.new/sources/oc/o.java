package oc;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Credentials.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Loc/o;", "", "<init>", "()V", "", "username", "password", "Ljava/nio/charset/Charset;", "charset", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f47061a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        C3862t.g(username, "username");
        C3862t.g(password, "password");
        C3862t.g(charset, "charset");
        return "Basic " + Cc.h.INSTANCE.c(username + ':' + password, charset).c();
    }
}
