package j5;

import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ForgotState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H×\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lj5/a;", "Lja/a;", "", "loading", "", "error", "response", "", "emailValidation", "serverNotReachable", "<init>", "(ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "B", "Z", "c", "()Z", "C", "Ljava/lang/String;", "b", "D", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "E", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "F", "e", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j5.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class ForgotState extends C3756a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean loading;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean response;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer emailValidation;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer serverNotReachable;

    public ForgotState() {
        this(false, null, null, null, null, 31, null);
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
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getResponse() {
        return this.response;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getServerNotReachable() {
        return this.serverNotReachable;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForgotState)) {
            return false;
        }
        ForgotState forgotState = (ForgotState) other;
        return this.loading == forgotState.loading && C3862t.b(this.error, forgotState.error) && C3862t.b(this.response, forgotState.response) && C3862t.b(this.emailValidation, forgotState.emailValidation) && C3862t.b(this.serverNotReachable, forgotState.serverNotReachable);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        String str = this.error;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.response;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.emailValidation;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.serverNotReachable;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "ForgotState(loading=" + this.loading + ", error=" + this.error + ", response=" + this.response + ", emailValidation=" + this.emailValidation + ", serverNotReachable=" + this.serverNotReachable + ")";
    }

    public /* synthetic */ ForgotState(boolean z10, String str, Boolean bool, Integer num, Integer num2, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : num, (i10 & 16) == 0 ? num2 : null);
    }

    public ForgotState(boolean z10, String str, Boolean bool, Integer num, Integer num2) {
        this.loading = z10;
        this.error = str;
        this.response = bool;
        this.emailValidation = num;
        this.serverNotReachable = num2;
    }
}
