package R0;

import i0.C3602t0;
import kotlin.Metadata;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"Li0/t0;", "", "alpha", "b", "(JF)J", "Lkotlin/Function0;", "block", "c", "(FLBa/a;)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    public static final long b(long j10, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j10 : C3602t0.k(j10, C3602t0.n(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f10, Ba.a<Float> aVar) {
        return Float.isNaN(f10) ? aVar.invoke().floatValue() : f10;
    }
}
