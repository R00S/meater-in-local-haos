package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: JvmActuals.jvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0000\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"", "obj", "", "name", "a", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicInteger;", "AtomicInt", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2046v0 {
    public static final String a(Object obj, String str) {
        if (str == null) {
            str = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('@');
        kotlin.jvm.internal.V v10 = kotlin.jvm.internal.V.f43983a;
        String str2 = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        C3862t.f(str2, "format(format, *args)");
        sb2.append(str2);
        return sb2.toString();
    }
}
