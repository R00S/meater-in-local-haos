package androidx.compose.ui.platform;

import java.util.Comparator;
import kotlin.Metadata;
import ra.C4370a;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2051y<T> implements Comparator {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ Comparator f23487B;

    public C2051y(Comparator comparator) {
        this.f23487B = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f23487B.compare(t10, t11);
        return iCompare != 0 ? iCompare : C4370a.d(Integer.valueOf(((F0.p) t10).getId()), Integer.valueOf(((F0.p) t11).getId()));
    }
}
