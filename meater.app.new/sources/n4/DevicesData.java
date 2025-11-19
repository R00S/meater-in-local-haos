package n4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import m4.AbstractC3952d;

/* compiled from: DevicesData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\r¨\u0006!"}, d2 = {"Ln4/b;", "Lm4/d;", "", "Ln4/a;", "pairedDevices", "", "statusCode", "", "error", "message", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "getError", "d", "getMessage", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n4.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class DevicesData extends AbstractC3952d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Device> pairedDevices;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer statusCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String error;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    public DevicesData(List<Device> list, Integer num, String str, String str2) {
        this.pairedDevices = list;
        this.statusCode = num;
        this.error = str;
        this.message = str2;
    }

    public final List<Device> a() {
        return this.pairedDevices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicesData)) {
            return false;
        }
        DevicesData devicesData = (DevicesData) other;
        return C3862t.b(this.pairedDevices, devicesData.pairedDevices) && C3862t.b(this.statusCode, devicesData.statusCode) && C3862t.b(this.error, devicesData.error) && C3862t.b(this.message, devicesData.message);
    }

    public int hashCode() {
        List<Device> list = this.pairedDevices;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.statusCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.error;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DevicesData(pairedDevices=" + this.pairedDevices + ", statusCode=" + this.statusCode + ", error=" + this.error + ", message=" + this.message + ")";
    }
}
