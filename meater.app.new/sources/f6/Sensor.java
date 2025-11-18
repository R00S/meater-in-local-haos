package f6;

import kotlin.Metadata;
import p4.CalibrationData;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010 \u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010#\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001a\u0010&\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016¨\u0006'"}, d2 = {"Lf6/m;", "", "Lp4/a$a$a;", "a", "()Lp4/a$a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSensorNumber", "sensorNumber", "", "b", "F", "getResistance0C", "()F", "resistance0C", "c", "getResistance50C", "resistance50C", "d", "getResistance100C", "resistance100C", "e", "getTemperature0C", "temperature0C", "f", "getTemperature50C", "temperature50C", "g", "getTemperature100C", "temperature100C", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f6.m, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class Sensor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("sensorNumber")
    private final int sensorNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("resistance0C")
    private final float resistance0C;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("resistance50C")
    private final float resistance50C;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("resistance100C")
    private final float resistance100C;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("temperature0C")
    private final float temperature0C;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("temperature50C")
    private final float temperature50C;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @M9.c("temperature100C")
    private final float temperature100C;

    public final CalibrationData.Data.SensorResistance a() {
        int i10 = this.sensorNumber;
        float f10 = this.resistance0C;
        float f11 = this.resistance50C;
        return new CalibrationData.Data.SensorResistance(f10, this.resistance100C, f11, i10, this.temperature0C, this.temperature100C, this.temperature50C);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sensor)) {
            return false;
        }
        Sensor sensor = (Sensor) other;
        return this.sensorNumber == sensor.sensorNumber && Float.compare(this.resistance0C, sensor.resistance0C) == 0 && Float.compare(this.resistance50C, sensor.resistance50C) == 0 && Float.compare(this.resistance100C, sensor.resistance100C) == 0 && Float.compare(this.temperature0C, sensor.temperature0C) == 0 && Float.compare(this.temperature50C, sensor.temperature50C) == 0 && Float.compare(this.temperature100C, sensor.temperature100C) == 0;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.sensorNumber) * 31) + Float.hashCode(this.resistance0C)) * 31) + Float.hashCode(this.resistance50C)) * 31) + Float.hashCode(this.resistance100C)) * 31) + Float.hashCode(this.temperature0C)) * 31) + Float.hashCode(this.temperature50C)) * 31) + Float.hashCode(this.temperature100C);
    }

    public String toString() {
        return "Sensor(sensorNumber=" + this.sensorNumber + ", resistance0C=" + this.resistance0C + ", resistance50C=" + this.resistance50C + ", resistance100C=" + this.resistance100C + ", temperature0C=" + this.temperature0C + ", temperature50C=" + this.temperature50C + ", temperature100C=" + this.temperature100C + ")";
    }
}
