package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3950b;

/* compiled from: LoginRequestInput.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lp4/g;", "Lm4/b;", "", "email", "password", "checkTerms", "Lp4/e;", "device", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp4/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Lp4/e;", "()Lp4/e;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.g, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class LoginRequestInput extends AbstractC3950b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String checkTerms;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeviceInput device;

    public /* synthetic */ LoginRequestInput(String str, String str2, String str3, DeviceInput deviceInput, int i10, C3854k c3854k) {
        this(str, str2, (i10 & 4) != 0 ? "agree_to_terms_and_conditions" : str3, deviceInput);
    }

    /* renamed from: a, reason: from getter */
    public final String getCheckTerms() {
        return this.checkTerms;
    }

    /* renamed from: b, reason: from getter */
    public DeviceInput getDevice() {
        return this.device;
    }

    /* renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: d, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginRequestInput)) {
            return false;
        }
        LoginRequestInput loginRequestInput = (LoginRequestInput) other;
        return C3862t.b(this.email, loginRequestInput.email) && C3862t.b(this.password, loginRequestInput.password) && C3862t.b(this.checkTerms, loginRequestInput.checkTerms) && C3862t.b(this.device, loginRequestInput.device);
    }

    public int hashCode() {
        return (((((this.email.hashCode() * 31) + this.password.hashCode()) * 31) + this.checkTerms.hashCode()) * 31) + this.device.hashCode();
    }

    public String toString() {
        return "LoginRequestInput(email=" + this.email + ", password=" + this.password + ", checkTerms=" + this.checkTerms + ", device=" + this.device + ")";
    }

    public LoginRequestInput(String email, String password, String checkTerms, DeviceInput device) {
        C3862t.g(email, "email");
        C3862t.g(password, "password");
        C3862t.g(checkTerms, "checkTerms");
        C3862t.g(device, "device");
        this.email = email;
        this.password = password;
        this.checkTerms = checkTerms;
        this.device = device;
    }
}
