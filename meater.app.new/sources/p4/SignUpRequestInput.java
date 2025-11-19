package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SignUpRequestInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0015\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lp4/l;", "", "", "firstName", "lastName", "email", "password", "", "agreeToTerms", "emailOptIn", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "e", "c", "g", "Z", "()Z", "f", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.l, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class SignUpRequestInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreeToTerms;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean emailOptIn;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String locale;

    public SignUpRequestInput(String firstName, String lastName, String email, String password, boolean z10, boolean z11, String locale) {
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

    /* renamed from: a, reason: from getter */
    public final boolean getAgreeToTerms() {
        return this.agreeToTerms;
    }

    /* renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getEmailOptIn() {
        return this.emailOptIn;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: e, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpRequestInput)) {
            return false;
        }
        SignUpRequestInput signUpRequestInput = (SignUpRequestInput) other;
        return C3862t.b(this.firstName, signUpRequestInput.firstName) && C3862t.b(this.lastName, signUpRequestInput.lastName) && C3862t.b(this.email, signUpRequestInput.email) && C3862t.b(this.password, signUpRequestInput.password) && this.agreeToTerms == signUpRequestInput.agreeToTerms && this.emailOptIn == signUpRequestInput.emailOptIn && C3862t.b(this.locale, signUpRequestInput.locale);
    }

    /* renamed from: f, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: g, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public int hashCode() {
        return (((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + Boolean.hashCode(this.agreeToTerms)) * 31) + Boolean.hashCode(this.emailOptIn)) * 31) + this.locale.hashCode();
    }

    public String toString() {
        return "SignUpRequestInput(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", password=" + this.password + ", agreeToTerms=" + this.agreeToTerms + ", emailOptIn=" + this.emailOptIn + ", locale=" + this.locale + ")";
    }
}
