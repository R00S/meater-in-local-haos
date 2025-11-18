package f6;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lf6/g;", "", "", "email", "password", "checkTerms", "Lf6/f;", "device", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf6/f;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", "getPassword", "c", "getCheckTerms", "d", "Lf6/f;", "getDevice", "()Lf6/f;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.g, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class LoginRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("email")
    private final String email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("password")
    private final String password;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("check_terms")
    private final String checkTerms;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("device")
    private final LoginDeviceRemote device;

    public LoginRequest(String email, String password, String str, LoginDeviceRemote loginDeviceRemote) {
        C3862t.g(email, "email");
        C3862t.g(password, "password");
        this.email = email;
        this.password = password;
        this.checkTerms = str;
        this.device = loginDeviceRemote;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) other;
        return C3862t.b(this.email, loginRequest.email) && C3862t.b(this.password, loginRequest.password) && C3862t.b(this.checkTerms, loginRequest.checkTerms) && C3862t.b(this.device, loginRequest.device);
    }

    public int hashCode() {
        int iHashCode = ((this.email.hashCode() * 31) + this.password.hashCode()) * 31;
        String str = this.checkTerms;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LoginDeviceRemote loginDeviceRemote = this.device;
        return iHashCode2 + (loginDeviceRemote != null ? loginDeviceRemote.hashCode() : 0);
    }

    public String toString() {
        return "LoginRequest(email=" + this.email + ", password=" + this.password + ", checkTerms=" + this.checkTerms + ", device=" + this.device + ")";
    }
}
