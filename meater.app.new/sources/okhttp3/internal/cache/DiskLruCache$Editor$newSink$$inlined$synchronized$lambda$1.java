package okhttp3.internal.cache;

import java.io.IOException;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m32267d2 = {"Ljava/io/IOException;", "it", "Lkotlin/u;", "invoke", "(Ljava/io/IOException;)V", "okhttp3/internal/cache/DiskLruCache$Editor$newSink$1$1", "<anonymous>"}, m32268k = 3, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1 extends Lambda implements Function1<IOException, C10775u> {
    final /* synthetic */ int $index$inlined;
    final /* synthetic */ DiskLruCache.Editor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskLruCache$Editor$newSink$$inlined$synchronized$lambda$1(DiskLruCache.Editor editor, int i2) {
        super(1);
        this.this$0 = editor;
        this.$index$inlined = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(IOException iOException) {
        invoke2(iOException);
        return C10775u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IOException iOException) {
        C9801m.m32346f(iOException, "it");
        synchronized (this.this$0.this$0) {
            this.this$0.detach$okhttp();
            C10775u c10775u = C10775u.f41439a;
        }
    }
}
