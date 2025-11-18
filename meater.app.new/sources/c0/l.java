package c0;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.V;

/* compiled from: ContentType.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lc0/l;", "", "", "", "contentHints", "<init>", "(Ljava/util/Set;)V", "contentHint", "(Ljava/lang/String;)V", "a", "Ljava/util/Set;", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<String> contentHints;

    /* renamed from: c, reason: collision with root package name */
    public static final int f30890c = 8;

    /* renamed from: d, reason: collision with root package name */
    private static final l f30891d = new l("username");

    /* renamed from: e, reason: collision with root package name */
    private static final l f30892e = new l("password");

    /* renamed from: f, reason: collision with root package name */
    private static final l f30893f = new l("emailAddress");

    /* renamed from: g, reason: collision with root package name */
    private static final l f30894g = new l("newUsername");

    /* renamed from: h, reason: collision with root package name */
    private static final l f30895h = new l("newPassword");

    /* renamed from: i, reason: collision with root package name */
    private static final l f30896i = new l("postalAddress");

    /* renamed from: j, reason: collision with root package name */
    private static final l f30897j = new l("postalCode");

    /* renamed from: k, reason: collision with root package name */
    private static final l f30898k = new l("creditCardNumber");

    /* renamed from: l, reason: collision with root package name */
    private static final l f30899l = new l("creditCardSecurityCode");

    /* renamed from: m, reason: collision with root package name */
    private static final l f30900m = new l("creditCardExpirationDate");

    /* renamed from: n, reason: collision with root package name */
    private static final l f30901n = new l("creditCardExpirationMonth");

    /* renamed from: o, reason: collision with root package name */
    private static final l f30902o = new l("creditCardExpirationYear");

    /* renamed from: p, reason: collision with root package name */
    private static final l f30903p = new l("creditCardExpirationDay");

    /* renamed from: q, reason: collision with root package name */
    private static final l f30904q = new l("addressCountry");

    /* renamed from: r, reason: collision with root package name */
    private static final l f30905r = new l("addressRegion");

    /* renamed from: s, reason: collision with root package name */
    private static final l f30906s = new l("addressLocality");

    /* renamed from: t, reason: collision with root package name */
    private static final l f30907t = new l("streetAddress");

    /* renamed from: u, reason: collision with root package name */
    private static final l f30908u = new l("extendedAddress");

    /* renamed from: v, reason: collision with root package name */
    private static final l f30909v = new l("extendedPostalCode");

    /* renamed from: w, reason: collision with root package name */
    private static final l f30910w = new l("personName");

    /* renamed from: x, reason: collision with root package name */
    private static final l f30911x = new l("personGivenName");

    /* renamed from: y, reason: collision with root package name */
    private static final l f30912y = new l("personFamilyName");

    /* renamed from: z, reason: collision with root package name */
    private static final l f30913z = new l("personMiddleName");

    /* renamed from: A, reason: collision with root package name */
    private static final l f30876A = new l("personMiddleInitial");

    /* renamed from: B, reason: collision with root package name */
    private static final l f30877B = new l("personNamePrefix");

    /* renamed from: C, reason: collision with root package name */
    private static final l f30878C = new l("personNameSuffix");

    /* renamed from: D, reason: collision with root package name */
    private static final l f30879D = new l("phoneNumber");

    /* renamed from: E, reason: collision with root package name */
    private static final l f30880E = new l("phoneNumberDevice");

    /* renamed from: F, reason: collision with root package name */
    private static final l f30881F = new l("phoneCountryCode");

    /* renamed from: G, reason: collision with root package name */
    private static final l f30882G = new l("phoneNational");

    /* renamed from: H, reason: collision with root package name */
    private static final l f30883H = new l("gender");

    /* renamed from: I, reason: collision with root package name */
    private static final l f30884I = new l("birthDateFull");

    /* renamed from: J, reason: collision with root package name */
    private static final l f30885J = new l("birthDateDay");

    /* renamed from: K, reason: collision with root package name */
    private static final l f30886K = new l("birthDateMonth");

    /* renamed from: L, reason: collision with root package name */
    private static final l f30887L = new l("birthDateYear");

    /* renamed from: M, reason: collision with root package name */
    private static final l f30888M = new l("smsOTPCode");

    private l(Set<String> set) {
        this.contentHints = set;
    }

    public l(String str) {
        this((Set<String>) V.c(str));
    }
}
