package retrofit2;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;

/* compiled from: KotlinExtensions.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "T", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lkotlin/u;", "invoke", "(Ljava/lang/Throwable;)V", "retrofit2/KotlinExtensions$await$2$1", "<anonymous>"}, m32268k = 3, m32269mv = {1, 4, 0})
/* renamed from: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1 */
/* loaded from: classes3.dex */
final class C11206x19835f10 extends Lambda implements Function1<Throwable, C10775u> {
    final /* synthetic */ Call $this_await$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11206x19835f10(Call call) {
        super(1);
        this.$this_await$inlined = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C10775u invoke(Throwable th) {
        invoke2(th);
        return C10775u.f41439a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$this_await$inlined.cancel();
    }
}
