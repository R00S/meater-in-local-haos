package f6;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import p4.CalibrationData;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u001d\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007R\u001a\u0010 \u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0007¨\u0006!"}, d2 = {"Lf6/b;", "", "Lp4/a;", "a", "()Lp4/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/ArrayList;", "Lf6/a;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getData", "()Ljava/util/ArrayList;", "data", "b", "I", "getStatusCode", "statusCode", "c", "Ljava/lang/String;", "getError", "error", "d", "getMessage", "message", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class CertificateResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("data")
    private final ArrayList<Certificate> data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("statusCode")
    private final int statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("error")
    private final String error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("message")
    private final String message;

    public final CalibrationData a() {
        ArrayList<Certificate> arrayList = this.data;
        ArrayList arrayList2 = new ArrayList(r.x(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Certificate) it.next()).a());
        }
        return new CalibrationData(arrayList2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateResponse)) {
            return false;
        }
        CertificateResponse certificateResponse = (CertificateResponse) other;
        return C3862t.b(this.data, certificateResponse.data) && this.statusCode == certificateResponse.statusCode && C3862t.b(this.error, certificateResponse.error) && C3862t.b(this.message, certificateResponse.message);
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.error.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "CertificateResponse(data=" + this.data + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
