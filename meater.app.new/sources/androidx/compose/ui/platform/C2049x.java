package androidx.compose.ui.platform;

import java.util.Comparator;
import kotlin.Metadata;

/* compiled from: Comparisons.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2049x<T> implements Comparator {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ Comparator f23483B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ Comparator f23484C;

    public C2049x(Comparator comparator, Comparator comparator2) {
        this.f23483B = comparator;
        this.f23484C = comparator2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f23483B.compare(t10, t11);
        return iCompare != 0 ? iCompare : this.f23484C.compare(((F0.p) t10).getLayoutNode(), ((F0.p) t11).getLayoutNode());
    }
}
