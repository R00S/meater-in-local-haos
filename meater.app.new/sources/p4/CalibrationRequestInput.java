package p4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: CalibrationRequestInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lp4/b;", "", "", "secureID", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p4.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class CalibrationRequestInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String secureID;

    public CalibrationRequestInput() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final String getSecureID() {
        return this.secureID;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CalibrationRequestInput) && C3862t.b(this.secureID, ((CalibrationRequestInput) other).secureID);
    }

    public int hashCode() {
        String str = this.secureID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "CalibrationRequestInput(secureID=" + this.secureID + ")";
    }

    public CalibrationRequestInput(String str) {
        this.secureID = str;
    }

    public /* synthetic */ CalibrationRequestInput(String str, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : str);
    }
}
