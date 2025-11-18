package Ub;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001\u0013B\u0011\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LUb/k;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "", "pattern", "(Ljava/lang/String;)V", "LUb/m;", "option", "(Ljava/lang/String;LUb/m;)V", "", "input", "", "b", "(Ljava/lang/CharSequence;)Z", "LUb/i;", "a", "(Ljava/lang/CharSequence;)LUb/i;", "replacement", "c", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "", "limit", "", "d", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "B", "Ljava/util/regex/Pattern;", "C", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements Serializable {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Pattern nativePattern;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LUb/k$a;", "", "<init>", "()V", "", "flags", "b", "(I)I", "", "literal", "LUb/k;", "c", "(Ljava/lang/String;)LUb/k;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ub.k$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int flags) {
            return (flags & 2) != 0 ? flags | 64 : flags;
        }

        public final k c(String literal) {
            C3862t.g(literal, "literal");
            return new k(literal, m.f17964F);
        }

        private Companion() {
        }
    }

    public k(Pattern nativePattern) {
        C3862t.g(nativePattern, "nativePattern");
        this.nativePattern = nativePattern;
    }

    public final i a(CharSequence input) {
        C3862t.g(input, "input");
        Matcher matcher = this.nativePattern.matcher(input);
        C3862t.f(matcher, "matcher(...)");
        return l.c(matcher, input);
    }

    public final boolean b(CharSequence input) {
        C3862t.g(input, "input");
        return this.nativePattern.matcher(input).matches();
    }

    public final String c(CharSequence input, String replacement) {
        C3862t.g(input, "input");
        C3862t.g(replacement, "replacement");
        String strReplaceAll = this.nativePattern.matcher(input).replaceAll(replacement);
        C3862t.f(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List<String> d(CharSequence input, int limit) {
        C3862t.g(input, "input");
        x.s0(limit);
        Matcher matcher = this.nativePattern.matcher(input);
        if (limit == 1 || !matcher.find()) {
            return kotlin.collections.r.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(limit > 0 ? Ha.g.g(limit, 10) : 10);
        int i10 = limit - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i10 >= 0 && arrayList.size() == i10) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.nativePattern.toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String pattern) {
        C3862t.g(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        C3862t.f(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(String pattern, m option) {
        C3862t.g(pattern, "pattern");
        C3862t.g(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, INSTANCE.b(option.getValue()));
        C3862t.f(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
