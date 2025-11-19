package Yc;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ExtensionManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR<\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001`\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"LYc/a;", "", "LUc/a;", "_koin", "<init>", "(LUc/a;)V", "a", "LUc/a;", "get_koin$koin_core", "()LUc/a;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "getExtensions", "()Ljava/util/HashMap;", "getExtensions$annotations", "()V", "extensions", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Uc.a _koin;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> extensions;

    public a(Uc.a _koin) {
        C3862t.g(_koin, "_koin");
        this._koin = _koin;
        this.extensions = new HashMap<>();
    }
}
