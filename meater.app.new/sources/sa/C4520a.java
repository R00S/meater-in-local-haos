package sa;

import java.util.Timer;
import kotlin.Metadata;

/* compiled from: Timer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "name", "", "daemon", "Ljava/util/Timer;", "a", "(Ljava/lang/String;Z)Ljava/util/Timer;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4520a {
    public static final Timer a(String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }
}
