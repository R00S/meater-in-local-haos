package nb;

import kotlin.jvm.internal.C3862t;

/* compiled from: versionSpecificBehavior.kt */
/* loaded from: classes3.dex */
public final class i {
    public static final boolean a(AbstractC4075a version) {
        C3862t.g(version, "version");
        return (version.a() == 1 && version.b() >= 4) || version.a() > 1;
    }

    public static final boolean b(AbstractC4075a version) {
        C3862t.g(version, "version");
        return a(version);
    }
}
