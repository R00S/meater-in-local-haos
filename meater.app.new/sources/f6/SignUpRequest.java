package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u000e¨\u0006&"}, d2 = {"Lf6/n;", "", "", "firstName", "lastName", "email", "password", "", "agreeToTerms", "emailOptIn", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "c", "getEmail", "d", "getPassword", "e", "Z", "getAgreeToTerms", "()Z", "f", "getEmailOptIn", "g", "getLocale", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.n, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class SignUpRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("first_name")
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("last_name")
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("email")
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("password")
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("agree_to_terms_and_conditions")
    private final boolean agreeToTerms;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("email_club_opt_in")
    private final boolean emailOptIn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("locale")
    private final String locale;

    public SignUpRequest(String firstName, String lastName, String email, String password, boolean z10, boolean z11, String locale) {
        C3862t.g(firstName, "firstName");
        C3862t.g(lastName, "lastName");
        C3862t.g(email, "email");
        C3862t.g(password, "password");
        C3862t.g(locale, "locale");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.agreeToTerms = z10;
        this.emailOptIn = z11;
        this.locale = locale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpRequest)) {
            return false;
        }
        SignUpRequest signUpRequest = (SignUpRequest) other;
        return C3862t.b(this.firstName, signUpRequest.firstName) && C3862t.b(this.lastName, signUpRequest.lastName) && C3862t.b(this.email, signUpRequest.email) && C3862t.b(this.password, signUpRequest.password) && this.agreeToTerms == signUpRequest.agreeToTerms && this.emailOptIn == signUpRequest.emailOptIn && C3862t.b(this.locale, signUpRequest.locale);
    }

    public int hashCode() {
        return (((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + Boolean.hashCode(this.agreeToTerms)) * 31) + Boolean.hashCode(this.emailOptIn)) * 31) + this.locale.hashCode();
    }

    public String toString() {
        return "SignUpRequest(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", password=" + this.password + ", agreeToTerms=" + this.agreeToTerms + ", emailOptIn=" + this.emailOptIn + ", locale=" + this.locale + ")";
    }
}
