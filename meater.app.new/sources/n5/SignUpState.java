package n5;

import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import p4.UserData;

/* compiled from: SignUpState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH×\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010 \u001a\u0004\b?\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\bA\u0010&R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010\u0018¨\u0006D"}, d2 = {"Ln5/a;", "Lja/a;", "", "loading", "Lp4/m;", "user", "", "errorMessage", "", "firstNameValidation", "lastNameValidation", "emailValidation", "passwordValidation", "confirmPasswordValidation", "passwordMatchValidation", "termsCheckValidation", "newsLetterValidation", "privacyCheckValidation", "errorExistingUser", "loginUser", "serverNotReachable", "<init>", "(ZLp4/m;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLp4/m;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "B", "Z", "f", "()Z", "C", "Lp4/m;", "m", "()Lp4/m;", "D", "Ljava/lang/String;", "c", "E", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "F", "e", "G", "b", "H", "j", "I", "a", "J", "i", "K", "l", "L", "h", "M", "getPrivacyCheckValidation", "N", "getErrorExistingUser", "O", "g", "P", "k", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class SignUpState extends C3756a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loading;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserData user;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer firstNameValidation;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer lastNameValidation;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer emailValidation;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer passwordValidation;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer confirmPasswordValidation;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer passwordMatchValidation;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean termsCheckValidation;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean newsLetterValidation;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer privacyCheckValidation;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean errorExistingUser;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserData loginUser;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serverNotReachable;

    public SignUpState() {
        this(false, null, null, null, null, null, null, null, null, false, false, null, false, null, null, 32767, null);
    }

    /* renamed from: a, reason: from getter */
    public final Integer getConfirmPasswordValidation() {
        return this.confirmPasswordValidation;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getEmailValidation() {
        return this.emailValidation;
    }

    /* renamed from: c, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getFirstNameValidation() {
        return this.firstNameValidation;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getLastNameValidation() {
        return this.lastNameValidation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpState)) {
            return false;
        }
        SignUpState signUpState = (SignUpState) other;
        return this.loading == signUpState.loading && C3862t.b(this.user, signUpState.user) && C3862t.b(this.errorMessage, signUpState.errorMessage) && C3862t.b(this.firstNameValidation, signUpState.firstNameValidation) && C3862t.b(this.lastNameValidation, signUpState.lastNameValidation) && C3862t.b(this.emailValidation, signUpState.emailValidation) && C3862t.b(this.passwordValidation, signUpState.passwordValidation) && C3862t.b(this.confirmPasswordValidation, signUpState.confirmPasswordValidation) && C3862t.b(this.passwordMatchValidation, signUpState.passwordMatchValidation) && this.termsCheckValidation == signUpState.termsCheckValidation && this.newsLetterValidation == signUpState.newsLetterValidation && C3862t.b(this.privacyCheckValidation, signUpState.privacyCheckValidation) && this.errorExistingUser == signUpState.errorExistingUser && C3862t.b(this.loginUser, signUpState.loginUser) && C3862t.b(this.serverNotReachable, signUpState.serverNotReachable);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: g, reason: from getter */
    public final UserData getLoginUser() {
        return this.loginUser;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getNewsLetterValidation() {
        return this.newsLetterValidation;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        UserData userData = this.user;
        int iHashCode2 = (iHashCode + (userData == null ? 0 : userData.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.firstNameValidation;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastNameValidation;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.emailValidation;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.passwordValidation;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.confirmPasswordValidation;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.passwordMatchValidation;
        int iHashCode9 = (((((iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31) + Boolean.hashCode(this.termsCheckValidation)) * 31) + Boolean.hashCode(this.newsLetterValidation)) * 31;
        Integer num7 = this.privacyCheckValidation;
        int iHashCode10 = (((iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31) + Boolean.hashCode(this.errorExistingUser)) * 31;
        UserData userData2 = this.loginUser;
        int iHashCode11 = (iHashCode10 + (userData2 == null ? 0 : userData2.hashCode())) * 31;
        String str2 = this.serverNotReachable;
        return iHashCode11 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Integer getPasswordMatchValidation() {
        return this.passwordMatchValidation;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getPasswordValidation() {
        return this.passwordValidation;
    }

    /* renamed from: k, reason: from getter */
    public final String getServerNotReachable() {
        return this.serverNotReachable;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getTermsCheckValidation() {
        return this.termsCheckValidation;
    }

    /* renamed from: m, reason: from getter */
    public final UserData getUser() {
        return this.user;
    }

    public String toString() {
        return "SignUpState(loading=" + this.loading + ", user=" + this.user + ", errorMessage=" + this.errorMessage + ", firstNameValidation=" + this.firstNameValidation + ", lastNameValidation=" + this.lastNameValidation + ", emailValidation=" + this.emailValidation + ", passwordValidation=" + this.passwordValidation + ", confirmPasswordValidation=" + this.confirmPasswordValidation + ", passwordMatchValidation=" + this.passwordMatchValidation + ", termsCheckValidation=" + this.termsCheckValidation + ", newsLetterValidation=" + this.newsLetterValidation + ", privacyCheckValidation=" + this.privacyCheckValidation + ", errorExistingUser=" + this.errorExistingUser + ", loginUser=" + this.loginUser + ", serverNotReachable=" + this.serverNotReachable + ")";
    }

    public /* synthetic */ SignUpState(boolean z10, UserData userData, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z11, boolean z12, Integer num7, boolean z13, UserData userData2, String str2, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : userData, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : num3, (i10 & 64) != 0 ? null : num4, (i10 & 128) != 0 ? null : num5, (i10 & 256) != 0 ? null : num6, (i10 & 512) != 0 ? false : z11, (i10 & 1024) != 0 ? false : z12, (i10 & 2048) != 0 ? null : num7, (i10 & 4096) == 0 ? z13 : false, (i10 & 8192) != 0 ? null : userData2, (i10 & 16384) == 0 ? str2 : null);
    }

    public SignUpState(boolean z10, UserData userData, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, boolean z11, boolean z12, Integer num7, boolean z13, UserData userData2, String str2) {
        this.loading = z10;
        this.user = userData;
        this.errorMessage = str;
        this.firstNameValidation = num;
        this.lastNameValidation = num2;
        this.emailValidation = num3;
        this.passwordValidation = num4;
        this.confirmPasswordValidation = num5;
        this.passwordMatchValidation = num6;
        this.termsCheckValidation = z11;
        this.newsLetterValidation = z12;
        this.privacyCheckValidation = num7;
        this.errorExistingUser = z13;
        this.loginUser = userData2;
        this.serverNotReachable = str2;
    }
}
