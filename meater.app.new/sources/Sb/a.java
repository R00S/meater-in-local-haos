package Sb;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C3862t;

/* compiled from: addToStdlib.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap<Ba.a<?>, Object> f15715a = new ConcurrentHashMap<>();

    public static final Void a(String message) {
        C3862t.g(message, "message");
        throw new IllegalStateException(message.toString());
    }

    public static /* synthetic */ Void b(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "should not be called";
        }
        return a(str);
    }
}
