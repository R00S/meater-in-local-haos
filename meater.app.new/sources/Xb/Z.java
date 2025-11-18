package Xb;

import cc.C2390u;
import ec.C3296c;
import ec.ExecutorC3295b;
import kotlin.Metadata;

/* compiled from: Dispatchers.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0005\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0016"}, d2 = {"LXb/Z;", "", "<init>", "()V", "LXb/E;", "b", "LXb/E;", "a", "()LXb/E;", "getDefault$annotations", "Default", "c", "getUnconfined", "getUnconfined$annotations", "Unconfined", "d", "getIO$annotations", "IO", "LXb/G0;", "()LXb/G0;", "getMain$annotations", "Main", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f19059a = new Z();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final E Default = C3296c.f40984J;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final E Unconfined = W0.f19055D;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final E IO = ExecutorC3295b.f40982E;

    private Z() {
    }

    public static final E a() {
        return Default;
    }

    public static final E b() {
        return IO;
    }

    public static final G0 c() {
        return C2390u.dispatcher;
    }
}
