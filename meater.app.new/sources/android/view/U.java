package android.view;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/lifecycle/U;", "Landroidx/lifecycle/Y;", "<init>", "()V", "", "", "Landroidx/lifecycle/O;", "b", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "handles", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, O> handles = new LinkedHashMap();

    public final Map<String, O> h() {
        return this.handles;
    }
}
