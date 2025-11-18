package cm.aptoide.aptoideviews.common;

import android.text.SpannableStringBuilder;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: NonbreakingSpan.kt */
@Metadata(m32266d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006"}, m32267d2 = {"nonBreakingSpan", "Landroid/text/SpannableStringBuilder;", "builderAction", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "aptoide-views_prodRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class NonbreakingSpanKt {
    public static final SpannableStringBuilder nonBreakingSpan(SpannableStringBuilder spannableStringBuilder, Function1<? super SpannableStringBuilder, C10775u> function1) {
        C9801m.m32346f(spannableStringBuilder, "<this>");
        C9801m.m32346f(function1, "builderAction");
        NonbreakingSpan nonbreakingSpan = new NonbreakingSpan();
        int length = spannableStringBuilder.length();
        function1.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(nonbreakingSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
