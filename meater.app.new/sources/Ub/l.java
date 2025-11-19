package Ub;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ljava/util/regex/Matcher;", "", "input", "LUb/i;", "c", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)LUb/i;", "Ljava/util/regex/MatchResult;", "", "groupIndex", "LHa/f;", "d", "(Ljava/util/regex/MatchResult;I)LHa/f;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i c(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ha.f d(MatchResult matchResult, int i10) {
        return Ha.g.p(matchResult.start(i10), matchResult.end(i10));
    }
}
