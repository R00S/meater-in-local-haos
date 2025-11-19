package f6;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import p4.CalibrationData;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR*\u0010+\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lf6/a;", "", "Lp4/a$a;", "a", "()Lp4/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMacAddress", "macAddress", "b", "getSecureID", "secureID", "c", "getTestDateTime", "testDateTime", "", "d", "F", "getBath0C", "()F", "bath0C", "e", "getBath50C", "bath50C", "f", "getBath100C", "bath100C", "Ljava/util/ArrayList;", "Lf6/m;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "getSensorResistances", "()Ljava/util/ArrayList;", "sensorResistances", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes2.dex */
public final /* data */ class Certificate {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("macAddress")
    private final String macAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("secureID")
    private final String secureID;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("testDateTime")
    private final String testDateTime;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("bath0C")
    private final float bath0C;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("bath50C")
    private final float bath50C;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("bath100C")
    private final float bath100C;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("sensorResistances")
    private final ArrayList<Sensor> sensorResistances;

    public final CalibrationData.Data a() {
        String str = this.macAddress;
        String str2 = this.secureID;
        String str3 = this.testDateTime;
        float f10 = this.bath0C;
        float f11 = this.bath50C;
        float f12 = this.bath100C;
        ArrayList<Sensor> arrayList = this.sensorResistances;
        ArrayList arrayList2 = new ArrayList(r.x(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Sensor) it.next()).a());
        }
        return new CalibrationData.Data(f10, f12, f11, str, str2, arrayList2, str3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Certificate)) {
            return false;
        }
        Certificate certificate = (Certificate) other;
        return C3862t.b(this.macAddress, certificate.macAddress) && C3862t.b(this.secureID, certificate.secureID) && C3862t.b(this.testDateTime, certificate.testDateTime) && Float.compare(this.bath0C, certificate.bath0C) == 0 && Float.compare(this.bath50C, certificate.bath50C) == 0 && Float.compare(this.bath100C, certificate.bath100C) == 0 && C3862t.b(this.sensorResistances, certificate.sensorResistances);
    }

    public int hashCode() {
        return (((((((((((this.macAddress.hashCode() * 31) + this.secureID.hashCode()) * 31) + this.testDateTime.hashCode()) * 31) + Float.hashCode(this.bath0C)) * 31) + Float.hashCode(this.bath50C)) * 31) + Float.hashCode(this.bath100C)) * 31) + this.sensorResistances.hashCode();
    }

    public String toString() {
        return "Certificate(macAddress=" + this.macAddress + ", secureID=" + this.secureID + ", testDateTime=" + this.testDateTime + ", bath0C=" + this.bath0C + ", bath50C=" + this.bath50C + ", bath100C=" + this.bath100C + ", sensorResistances=" + this.sensorResistances + ")";
    }
}
