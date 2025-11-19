package kotlin;

import Ub.n;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4165j;
import oa.C4170o;
import oa.EnumC4168m;
import oa.InterfaceC4164i;
import oa.v;

/* compiled from: NavDeepLink.kt */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b \u0018\u0000 \u001c2\u00020\u0001:\u0004FJLNB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b \u0010!JC\u0010&\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0002¢\u0006\u0004\b&\u0010'J1\u0010+\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b+\u0010,J3\u0010-\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$01H\u0002¢\u0006\u0004\b2\u00103J#\u00105\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u000104H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00100J\u0017\u00109\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b9\u0010:J/\u0010;\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0007¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0000¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u0002082\b\u0010>\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u001b2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010ER\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010G\u001a\u0004\bK\u0010IR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010R\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010GR\u001d\u0010X\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010U\u001a\u0004\bY\u0010ZR'\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020$018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010U\u001a\u0004\b\\\u00103R\u0016\u0010_\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010^R/\u0010b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010U\u001a\u0004\ba\u00106R!\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010U\u001a\u0004\bc\u0010dR\u001d\u0010g\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bf\u0010IR\u001d\u0010i\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010U\u001a\u0004\bh\u0010WR\u0018\u0010j\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010GR\u001d\u0010l\u001a\u0004\u0018\u00010S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010U\u001a\u0004\bk\u0010WR*\u0010q\u001a\u00020\u001b2\u0006\u0010m\u001a\u00020\u001b8G@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010^\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010pR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00020\"8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010d¨\u0006s"}, d2 = {"Lg3/r;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Loa/F;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "fragment", "Landroid/os/Bundle;", "bundle", "", "Lg3/k;", "arguments", "s", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Ljava/util/regex/Matcher;", "matcher", "", "q", "(Ljava/util/regex/Matcher;Landroid/os/Bundle;Ljava/util/Map;)Z", "Landroid/net/Uri;", "deepLink", "r", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Lg3/r$d;", "storedParam", "E", "(Ljava/util/List;Lg3/r$d;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", "B", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lg3/k;)V", "C", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Lg3/k;)Z", "G", "()V", "", "H", "()Ljava/util/Map;", "Loa/o;", "D", "()Loa/o;", "F", "", "u", "(Ljava/lang/String;)I", "o", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "p", "requestedLink", "h", "(Landroid/net/Uri;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "b", "i", "c", "t", "d", "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Ljava/util/regex/Pattern;", "f", "Loa/i;", "w", "()Ljava/util/regex/Pattern;", "pathPattern", "A", "()Z", "isParameterizedQuery", "x", "queryArgsMap", "Z", "isSingleQueryParamValueOnly", "j", "l", "fragArgsAndRegex", "k", "()Ljava/util/List;", "fragArgs", "n", "fragRegex", "m", "fragPattern", "mimeTypeRegex", "v", "mimeTypePattern", "<set-?>", "z", "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "argumentsNames", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3412r {

    /* renamed from: q, reason: collision with root package name */
    private static final b f41743q = new b(null);

    /* renamed from: r, reason: collision with root package name */
    private static final Pattern f41744r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: s, reason: collision with root package name */
    private static final Pattern f41745s = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uriPattern;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String pathRegex;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i queryArgsMap;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isSingleQueryParamValueOnly;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i fragArgsAndRegex;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i fragArgs;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i fragRegex;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i fragPattern;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String mimeTypeRegex;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i mimeTypePattern;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isExactDeepLink;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathArgs = new ArrayList();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i pathPattern = C4165j.a(new l());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i isParameterizedQuery = C4165j.a(new j());

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\rB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg3/r$a;", "", "<init>", "()V", "", "uriPattern", "d", "(Ljava/lang/String;)Lg3/r$a;", "action", "b", "mimeType", "c", "Lg3/r;", "a", "()Lg3/r;", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.r$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String uriPattern;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        public final C3412r a() {
            return new C3412r(this.uriPattern, this.action, this.mimeType);
        }

        public final a b(String action) {
            C3862t.g(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        public final a c(String mimeType) {
            C3862t.g(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        public final a d(String uriPattern) {
            C3862t.g(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lg3/r$b;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "FILL_IN_PATTERN", "Ljava/util/regex/Pattern;", "SCHEME_PATTERN", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.r$b */
    private static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0005¨\u0006\u0014"}, d2 = {"Lg3/r$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "c", "(Lg3/r$c;)I", "B", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "setType", "type", "C", "j", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.r$c */
    private static final class c implements Comparable<c> {

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        private String type;

        /* renamed from: C, reason: collision with root package name and from kotlin metadata */
        private String subType;

        public c(String mimeType) {
            List listM;
            C3862t.g(mimeType, "mimeType");
            List<String> listD = new Ub.k("/").d(mimeType, 0);
            if (listD.isEmpty()) {
                listM = r.m();
            } else {
                ListIterator<String> listIterator = listD.listIterator(listD.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listM = r.P0(listD, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listM = r.m();
            }
            this.type = (String) listM.get(0);
            this.subType = (String) listM.get(1);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            C3862t.g(other, "other");
            int i10 = C3862t.b(this.type, other.type) ? 2 : 0;
            return C3862t.b(this.subType, other.subType) ? i10 + 1 : i10;
        }

        /* renamed from: j, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* renamed from: n, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lg3/r$d;", "", "<init>", "()V", "", "name", "Loa/F;", "a", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "paramRegex", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.r$d */
    private static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String paramRegex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> arguments = new ArrayList();

        public final void a(String name) {
            C3862t.g(name, "name");
            this.arguments.add(name);
        }

        public final List<String> b() {
            return this.arguments;
        }

        /* renamed from: c, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void d(String str) {
            this.paramRegex = str;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$e */
    static final class e extends AbstractC3864v implements Ba.a<List<String>> {
        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke() {
            List<String> list;
            C4170o c4170oL = C3412r.this.l();
            return (c4170oL == null || (list = (List) c4170oL.c()) == null) ? new ArrayList() : list;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loa/o;", "", "", "a", "()Loa/o;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$f */
    static final class f extends AbstractC3864v implements Ba.a<C4170o<? extends List<String>, ? extends String>> {
        f() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4170o<List<String>, String> invoke() {
            return C3412r.this.D();
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$g */
    static final class g extends AbstractC3864v implements Ba.a<Pattern> {
        g() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String strN = C3412r.this.n();
            if (strN != null) {
                return Pattern.compile(strN, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$h */
    static final class h extends AbstractC3864v implements Ba.a<String> {
        h() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            C4170o c4170oL = C3412r.this.l();
            if (c4170oL != null) {
                return (String) c4170oL.d();
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "argName", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$i */
    static final class i extends AbstractC3864v implements Ba.l<String, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Bundle f41774B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Bundle bundle) {
            super(1);
            this.f41774B = bundle;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String argName) {
            C3862t.g(argName, "argName");
            return Boolean.valueOf(!this.f41774B.containsKey(argName));
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$j */
    static final class j extends AbstractC3864v implements Ba.a<Boolean> {
        j() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((C3412r.this.getUriPattern() == null || Uri.parse(C3412r.this.getUriPattern()).getQuery() == null) ? false : true);
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$k */
    static final class k extends AbstractC3864v implements Ba.a<Pattern> {
        k() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C3412r.this.mimeTypeRegex;
            if (str != null) {
                return Pattern.compile(str);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/regex/Pattern;", "a", "()Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$l */
    static final class l extends AbstractC3864v implements Ba.a<Pattern> {
        l() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke() {
            String str = C3412r.this.pathRegex;
            if (str != null) {
                return Pattern.compile(str, 2);
            }
            return null;
        }
    }

    /* compiled from: NavDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "Lg3/r$d;", "a", "()Ljava/util/Map;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.r$m */
    static final class m extends AbstractC3864v implements Ba.a<Map<String, d>> {
        m() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, d> invoke() {
            return C3412r.this.H();
        }
    }

    public C3412r(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        EnumC4168m enumC4168m = EnumC4168m.f46628D;
        this.queryArgsMap = C4165j.b(enumC4168m, new m());
        this.fragArgsAndRegex = C4165j.b(enumC4168m, new f());
        this.fragArgs = C4165j.b(enumC4168m, new e());
        this.fragRegex = C4165j.b(enumC4168m, new h());
        this.fragPattern = C4165j.a(new g());
        this.mimeTypePattern = C4165j.a(new k());
        G();
        F();
    }

    private final boolean A() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    private final void B(Bundle bundle, String name, String value, C3405k argument) {
        if (argument != null) {
            argument.a().d(bundle, name, value);
        } else {
            bundle.putString(name, value);
        }
    }

    private final boolean C(Bundle bundle, String name, String value, C3405k argument) {
        if (!bundle.containsKey(name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        AbstractC3386C<Object> abstractC3386CA = argument.a();
        abstractC3386CA.e(bundle, name, value, abstractC3386CA.a(bundle, name));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4170o<List<String>, String> D() {
        String str = this.uriPattern;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder sb2 = new StringBuilder();
        C3862t.d(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        C3862t.f(string, "fragRegex.toString()");
        return v.a(arrayList, string);
    }

    private final boolean E(List<String> inputParams, d storedParam, Bundle bundle, Map<String, C3405k> arguments) {
        Object objValueOf;
        Bundle bundleA = n1.d.a(new C4170o[0]);
        Iterator<T> it = storedParam.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            C3405k c3405k = arguments.get(str);
            AbstractC3386C<Object> abstractC3386CA = c3405k != null ? c3405k.a() : null;
            if ((abstractC3386CA instanceof AbstractC3399e) && !c3405k.getIsDefaultValuePresent()) {
                abstractC3386CA.h(bundleA, str, ((AbstractC3399e) abstractC3386CA).k());
            }
        }
        for (String str2 : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            Matcher matcher = paramRegex != null ? Pattern.compile(paramRegex, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List<String> listB = storedParam.b();
            ArrayList arrayList = new ArrayList(r.x(listB, 10));
            int i10 = 0;
            for (Object obj : listB) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    r.w();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i11);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    C3862t.f(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                C3405k c3405k2 = arguments.get(str3);
                try {
                    if (bundleA.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(C(bundleA, str3, strGroup, c3405k2));
                    } else {
                        B(bundleA, str3, strGroup, c3405k2);
                        objValueOf = C4153F.f46609a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = C4153F.f46609a;
                }
                arrayList.add(objValueOf);
                i10 = i11;
            }
        }
        bundle.putAll(bundleA);
        return true;
    }

    private final void F() {
        if (this.mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.mimeType);
        this.mimeTypeRegex = n.C("^(" + cVar.getType() + "|[*]+)/(" + cVar.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void G() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f41744r.matcher(this.uriPattern).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z10 = false;
        String strSubstring = this.uriPattern.substring(0, matcher.start());
        C3862t.f(strSubstring, "substring(...)");
        g(strSubstring, this.pathArgs, sb2);
        if (!n.L(sb2, ".*", false, 2, null) && !n.L(sb2, "([^/]+?)", false, 2, null)) {
            z10 = true;
        }
        this.isExactDeepLink = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        C3862t.f(string, "uriRegex.toString()");
        this.pathRegex = n.C(string, ".*", "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, d> H() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.uriPattern);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            if (queryParams.size() > 1) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            C3862t.f(queryParams, "queryParams");
            String queryParam = (String) r.l0(queryParams);
            if (queryParam == null) {
                this.isSingleQueryParamValueOnly = true;
                queryParam = paramName;
            }
            Matcher matcher = f41745s.matcher(queryParam);
            d dVar = new d();
            int iEnd = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                C3862t.e(strGroup, "null cannot be cast to non-null type kotlin.String");
                dVar.a(strGroup);
                C3862t.f(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                C3862t.f(strSubstring, "substring(...)");
                sb2.append(Pattern.quote(strSubstring));
                sb2.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                C3862t.f(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                C3862t.f(strSubstring2, "substring(...)");
                sb2.append(Pattern.quote(strSubstring2));
            }
            String string = sb2.toString();
            C3862t.f(string, "argRegex.toString()");
            dVar.d(n.C(string, ".*", "\\E.*\\Q", false, 4, null));
            C3862t.f(paramName, "paramName");
            linkedHashMap.put(paramName, dVar);
        }
        return linkedHashMap;
    }

    private final void g(String uri, List<String> args, StringBuilder uriRegex) {
        Matcher matcher = f41745s.matcher(uri);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            C3862t.e(strGroup, "null cannot be cast to non-null type kotlin.String");
            args.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = uri.substring(iEnd, matcher.start());
                C3862t.f(strSubstring, "substring(...)");
                uriRegex.append(Pattern.quote(strSubstring));
            }
            uriRegex.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < uri.length()) {
            String strSubstring2 = uri.substring(iEnd);
            C3862t.f(strSubstring2, "substring(...)");
            uriRegex.append(Pattern.quote(strSubstring2));
        }
    }

    private final List<String> k() {
        return (List) this.fragArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4170o<List<String>, String> l() {
        return (C4170o) this.fragArgsAndRegex.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.fragPattern.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.fragRegex.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, C3405k> arguments) {
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(r.x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.w();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            C3405k c3405k = arguments.get(str);
            try {
                C3862t.f(value, "value");
                B(bundle, str, value, c3405k);
                arrayList.add(C4153F.f46609a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri deepLink, Bundle bundle, Map<String, C3405k> arguments) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> inputParams = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !C3862t.b(query, deepLink.toString())) {
                inputParams = r.e(query);
            }
            C3862t.f(inputParams, "inputParams");
            if (!E(inputParams, value, bundle, arguments)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String fragment, Bundle bundle, Map<String, C3405k> arguments) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(fragment)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> listK = k();
            ArrayList arrayList = new ArrayList(r.x(listK, 10));
            int i10 = 0;
            for (Object obj : listK) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    r.w();
                }
                String str = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                C3405k c3405k = arguments.get(str);
                try {
                    C3862t.f(value, "value");
                    B(bundle, str, value, c3405k);
                    arrayList.add(C4153F.f46609a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.mimeTypePattern.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.pathPattern.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.queryArgsMap.getValue();
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof C3412r)) {
            return false;
        }
        C3412r c3412r = (C3412r) other;
        return C3862t.b(this.uriPattern, c3412r.uriPattern) && C3862t.b(this.action, c3412r.action) && C3862t.b(this.mimeType, c3412r.mimeType);
    }

    public final int h(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        List<String> requestedPathSegments = requestedLink.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
        C3862t.f(requestedPathSegments, "requestedPathSegments");
        C3862t.f(uriPathSegments, "uriPathSegments");
        return r.o0(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<String> j() {
        List<String> list = this.pathArgs;
        Collection<d> collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            r.D(arrayList, ((d) it.next()).b());
        }
        return r.F0(r.F0(list, arrayList), k());
    }

    public final Bundle o(Uri deepLink, Map<String, C3405k> arguments) {
        C3862t.g(deepLink, "deepLink");
        C3862t.g(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (C3406l.a(arguments, new i(bundle)).isEmpty()) {
            return bundle;
        }
        return null;
    }

    public final Bundle p(Uri deepLink, Map<String, C3405k> arguments) {
        C3862t.g(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (deepLink == null) {
            return bundle;
        }
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, arguments);
        if (A()) {
            r(deepLink, bundle, arguments);
        }
        return bundle;
    }

    /* renamed from: t, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int u(String mimeType) {
        C3862t.g(mimeType, "mimeType");
        if (this.mimeType != null) {
            Pattern patternV = v();
            C3862t.d(patternV);
            if (patternV.matcher(mimeType).matches()) {
                return new c(this.mimeType).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    /* renamed from: y, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }
}
