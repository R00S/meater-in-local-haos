package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DurationUnitJvm.kt */
@Metadata(m32266d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, m32267d2 = {"convertDurationUnit", HttpUrl.FRAGMENT_ENCODE_SET, "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", HttpUrl.FRAGMENT_ENCODE_SET, "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, m32268k = 5, m32269mv = {1, 7, 1}, m32271xi = 49, m32272xs = "kotlin/time/DurationUnitKt")
/* renamed from: kotlin.i0.e */
/* loaded from: classes3.dex */
class C10555e {
    /* renamed from: a */
    public static final long m37636a(long j2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        C9801m.m32346f(durationUnit, "sourceUnit");
        C9801m.m32346f(durationUnit2, "targetUnit");
        return durationUnit2.getF40707n().convert(j2, durationUnit.getF40707n());
    }

    /* renamed from: b */
    public static final long m37637b(long j2, DurationUnit durationUnit, DurationUnit durationUnit2) {
        C9801m.m32346f(durationUnit, "sourceUnit");
        C9801m.m32346f(durationUnit2, "targetUnit");
        return durationUnit2.getF40707n().convert(j2, durationUnit.getF40707n());
    }
}
