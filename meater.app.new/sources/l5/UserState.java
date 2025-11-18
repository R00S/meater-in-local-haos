package l5;

import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import p4.UserData;

/* compiled from: UserState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%¨\u0006,"}, d2 = {"Ll5/a;", "Lja/a;", "", "loading", "", "error", "Lp4/m;", "user", "", "emailValidation", "passwordValidation", "serverNotReachable", "invalidTermsAndCondition", "<init>", "(ZLjava/lang/String;Lp4/m;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "B", "Z", "d", "()Z", "C", "Ljava/lang/String;", "b", "D", "Lp4/m;", "g", "()Lp4/m;", "E", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "F", "e", "G", "f", "H", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class UserState extends C3756a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loading;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserData user;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer emailValidation;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer passwordValidation;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serverNotReachable;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer invalidTermsAndCondition;

    public UserState() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    /* renamed from: a, reason: from getter */
    public final Integer getEmailValidation() {
        return this.emailValidation;
    }

    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getInvalidTermsAndCondition() {
        return this.invalidTermsAndCondition;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getPasswordValidation() {
        return this.passwordValidation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserState)) {
            return false;
        }
        UserState userState = (UserState) other;
        return this.loading == userState.loading && C3862t.b(this.error, userState.error) && C3862t.b(this.user, userState.user) && C3862t.b(this.emailValidation, userState.emailValidation) && C3862t.b(this.passwordValidation, userState.passwordValidation) && C3862t.b(this.serverNotReachable, userState.serverNotReachable) && C3862t.b(this.invalidTermsAndCondition, userState.invalidTermsAndCondition);
    }

    /* renamed from: f, reason: from getter */
    public final String getServerNotReachable() {
        return this.serverNotReachable;
    }

    /* renamed from: g, reason: from getter */
    public final UserData getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserData userData = this.user;
        int iHashCode3 = (iHashCode2 + (userData == null ? 0 : userData.hashCode())) * 31;
        Integer num = this.emailValidation;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.passwordValidation;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.serverNotReachable;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.invalidTermsAndCondition;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "UserState(loading=" + this.loading + ", error=" + this.error + ", user=" + this.user + ", emailValidation=" + this.emailValidation + ", passwordValidation=" + this.passwordValidation + ", serverNotReachable=" + this.serverNotReachable + ", invalidTermsAndCondition=" + this.invalidTermsAndCondition + ")";
    }

    public /* synthetic */ UserState(boolean z10, String str, UserData userData, Integer num, Integer num2, String str2, Integer num3, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : userData, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str2, (i10 & 64) == 0 ? num3 : null);
    }

    public UserState(boolean z10, String str, UserData userData, Integer num, Integer num2, String str2, Integer num3) {
        this.loading = z10;
        this.error = str;
        this.user = userData;
        this.emailValidation = num;
        this.passwordValidation = num2;
        this.serverNotReachable = str2;
        this.invalidTermsAndCondition = num3;
    }
}
