package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.C9848l;
import kotlin.ranges.IntRange;
import okhttp3.HttpUrl;

/* compiled from: Regex.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0082\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, m32267d2 = {"fromInt", HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlin/text/FlagEnum;", HttpUrl.FRAGMENT_ENCODE_SET, "value", HttpUrl.FRAGMENT_ENCODE_SET, "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", HttpUrl.FRAGMENT_ENCODE_SET, "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, m32268k = 2, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.h0.k */
/* loaded from: classes3.dex */
public final class C10536k {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final MatchResult m37443c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final IntRange m37444d(MatchResult matchResult, int i2) {
        return C9848l.m32428k(matchResult.start(i2), matchResult.end(i2));
    }
}
