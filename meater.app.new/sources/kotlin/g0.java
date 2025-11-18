package kotlin;

import gc.C3462c;
import gc.InterfaceC3460a;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.r1;

/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R/\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LI/g0;", "", "<init>", "()V", "Lgc/a;", "a", "Lgc/a;", "mutex", "LI/c0;", "<set-?>", "b", "LO/p0;", "()LI/c0;", "setCurrentSnackbarData", "(LI/c0;)V", "currentSnackbarData", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3460a mutex = C3462c.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 currentSnackbarData = r1.c(null, null, 2, null);

    public final c0 a() {
        return (c0) this.currentSnackbarData.getValue();
    }
}
