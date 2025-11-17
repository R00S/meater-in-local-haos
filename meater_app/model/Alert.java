package com.apptionlabs.meater_app.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import f8.c0;
import f8.l0;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import lm.b;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Alert implements Parcelable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final Parcelable.Creator<Alert> CREATOR = new Parcelable.Creator<Alert>() { // from class: com.apptionlabs.meater_app.model.Alert.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Alert createFromParcel(Parcel parcel) {
            Alert alert = new Alert();
            alert.type = AlarmType.fromValue(parcel.readInt());
            alert.state = AlarmState.fromValue(parcel.readInt());
            alert.limit = parcel.readInt();
            alert.name = parcel.readString();
            return alert;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Alert[] newArray(int i10) {
            return new Alert[i10];
        }
    };
    private static final int HYSTERESIS_AMBIENT = 64;
    private static final int HYSTERESIS_INTERNAL = 16;

    @gg.a
    protected long createdDate;
    private UUID id = UUID.randomUUID();
    protected boolean isNewAlert;

    @gg.a
    protected long lastFireDate;

    @gg.a
    private int limit;

    @gg.a
    private String name;

    @gg.a
    private AlarmState state;

    @gg.a
    private AlarmType type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.apptionlabs.meater_app.model.Alert$2, reason: invalid class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType;

        static {
            int[] iArr = new int[AlarmType.values().length];
            $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType = iArr;
            try {
                iArr[AlarmType.ALARM_TYPE_MIN_AMBIENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MAX_AMBIENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MIN_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_MAX_INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_FROM_NOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_TIME_BEFORE_READY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_REPEAT_DURATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[AlarmType.ALARM_TYPE_ESTIMATE_READY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static Alert alertWithTypeForProbe(AlarmType alarmType, Probe probe) {
        Alert alert = new Alert();
        alert.setType(alarmType);
        alert.setIsNewAlert(true);
        if (alarmType == AlarmType.ALARM_TYPE_TIME_BEFORE_READY) {
            if (probe.getTimeRemaining() == -1) {
                alert.setLimit(3600);
            } else {
                alert.setLimit(Math.max(60, Math.min(probe.getTimeRemaining(), 3600)));
            }
        } else if (alarmType == AlarmType.ALARM_TYPE_TIME_FROM_NOW) {
            alert.setLimit(3600);
        } else if (alarmType == AlarmType.ALARM_TYPE_REPEAT_DURATION) {
            alert.setLimit(1800);
            if (probe != null && probe.appearsToHaveCookInProgress()) {
                alert.setLastFireDate(System.currentTimeMillis());
            }
        } else if (alarmType == AlarmType.ALARM_TYPE_ESTIMATE_READY) {
            alert.setLimit(-1);
        } else {
            int celsius = Temperature.toCelsius(probe.getAmbientTemperature());
            int celsius2 = Temperature.toCelsius(probe.getTargetInternalTemperature());
            int celsius3 = Temperature.toCelsius(probe.getInternalTemperature());
            if (alarmType == AlarmType.ALARM_TYPE_MIN_AMBIENT) {
                alert.setLimit(Temperature.fromCelsius(Math.max(2, Math.min(celsius, celsius2) - 20)));
            } else if (alarmType == AlarmType.ALARM_TYPE_MAX_AMBIENT) {
                alert.setLimit(Temperature.fromCelsius(Math.max(0, Math.min(celsius, celsius2) + 20)));
            } else if (alarmType == AlarmType.ALARM_TYPE_MIN_INTERNAL) {
                alert.setLimit(Temperature.fromCelsius(Math.max(2, Math.min(celsius3, celsius2) - 20)));
            } else if (alarmType == AlarmType.ALARM_TYPE_MAX_INTERNAL) {
                alert.setLimit(Temperature.fromCelsius(Math.max(0, Math.min(celsius3, celsius2) + 20)));
            }
        }
        return alert;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String description(Context context) {
        String str;
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                str = context.getString(2132017249) + " " + Temperature.displayTemperature(this.limit) + "!";
                break;
            case 2:
                str = context.getString(2132017250) + " " + Temperature.displayTemperature(this.limit) + "!";
                break;
            case 3:
                str = context.getString(2132017935) + " " + Temperature.displayTemperature(this.limit) + "!";
                break;
            case 4:
                str = context.getString(2132017936) + " " + Temperature.displayTemperature(this.limit) + "!";
                break;
            case 5:
                str = c0.a(this.limit);
                break;
            case 6:
                str = c0.d(this.limit);
                break;
            default:
                str = "";
                break;
        }
        String str2 = this.name;
        if (str2 != null && str2.length() > 0) {
            return this.name + ": " + str;
        }
        return str;
    }

    public String descriptionForProbe() {
        String format;
        Context i10 = com.apptionlabs.meater_app.app.a.i();
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                format = String.format(Locale.US, "%s %s!", i10.getString(2132017249), Temperature.displayTemperature(this.limit));
                break;
            case 2:
                format = String.format(Locale.US, "%s %s!", i10.getString(2132017250), Temperature.displayTemperature(this.limit));
                break;
            case 3:
                format = String.format(Locale.US, "%s %s!", i10.getString(2132017935), Temperature.displayTemperature(this.limit));
                break;
            case 4:
                format = String.format(Locale.US, "%s %s!", i10.getString(2132017936), Temperature.displayTemperature(this.limit));
                break;
            case 5:
                format = c0.a(this.limit);
                break;
            case 6:
                format = c0.d(this.limit);
                break;
            case 7:
                format = String.format(Locale.US, "%s %s!", i10.getString(2132017232), c0.f(this.limit));
                break;
            case 8:
                format = i10.getString(2132017687);
                break;
            default:
                format = null;
                break;
        }
        String str = this.name;
        if (str != null && str.length() > 0) {
            return String.format(Locale.US, "%s: %s", this.name, format);
        }
        return format;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null || !(obj instanceof Alert)) {
            return false;
        }
        Alert alert = (Alert) obj;
        String str2 = this.name;
        String str3 = null;
        if (str2 != null && str2.length() > 0) {
            str = this.name;
        } else {
            str = null;
        }
        if (alert.getName() != null && alert.getName().length() > 0) {
            str3 = alert.getName();
        }
        if (alert.getType() != this.type || alert.getLimit() != this.limit || !Objects.equals(str, str3)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fireForProbe(com.apptionlabs.meater_app.model.Probe r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            com.apptionlabs.meater_app.v3protobuf.AlarmState r0 = com.apptionlabs.meater_app.v3protobuf.AlarmState.ALARM_STATE_FIRED
            r5.setState(r0)
            s6.d.p(r5, r6)
            com.apptionlabs.meater_app.v3protobuf.AlarmType r0 = r5.type
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_TIME_FROM_NOW
            if (r0 != r1) goto L17
            int r0 = r6.cookTimeElapsed()
        L15:
            long r0 = (long) r0
            goto L5b
        L17:
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_TIME_BEFORE_READY
            if (r0 != r1) goto L20
            int r0 = r6.getTimeRemaining()
            goto L15
        L20:
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_MIN_AMBIENT
            if (r0 == r1) goto L52
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_MAX_AMBIENT
            if (r0 != r1) goto L29
            goto L52
        L29:
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_MIN_INTERNAL
            if (r0 == r1) goto L49
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_MAX_INTERNAL
            if (r0 != r1) goto L32
            goto L49
        L32:
            com.apptionlabs.meater_app.v3protobuf.AlarmType r1 = com.apptionlabs.meater_app.v3protobuf.AlarmType.ALARM_TYPE_ESTIMATE_READY
            if (r0 != r1) goto L46
            f6.a r0 = r6.getCookEstimate()
            int r0 = r0.C()
            r5.setLimit(r0)
            int r0 = r6.getTimeRemaining()
            goto L15
        L46:
            r0 = 0
            goto L5b
        L49:
            int r0 = r6.getInternalTemperature()
            int r0 = com.apptionlabs.meater_app.data.Temperature.toCelsius(r0)
            goto L15
        L52:
            int r0 = r6.getAmbientTemperature()
            int r0 = com.apptionlabs.meater_app.data.Temperature.toCelsius(r0)
            goto L15
        L5b:
            r5.b$b r2 = lm.b.EnumC0292b.K
            java.lang.String r2 = r2.title
            java.lang.String r3 = r5.shortDescription()
            java.lang.String r4 = lm.b.b(r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            lm.b.h(r2, r3, r4, r0)
            com.apptionlabs.meater_app.model.ProbeEventLog r0 = r6.getEventLog()
            if (r0 == 0) goto L81
            com.apptionlabs.meater_app.model.ProbeEventLog r6 = r6.getEventLog()
            com.apptionlabs.meater_app.v3protobuf.AlarmType r0 = r5.type
            int r1 = r5.limit
            java.lang.String r2 = r5.name
            r6.addAlertFiredEventForAlert(r0, r1, r2)
        L81:
            long r0 = java.lang.System.currentTimeMillis()
            r5.setLastFireDate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.model.Alert.fireForProbe(com.apptionlabs.meater_app.model.Probe):void");
    }

    public long getCreatedDate() {
        return this.createdDate;
    }

    public UUID getId() {
        return this.id;
    }

    public long getLastFireDate() {
        return this.lastFireDate;
    }

    public int getLimit() {
        return this.limit;
    }

    public String getName() {
        return this.name;
    }

    public AlarmState getState() {
        return this.state;
    }

    public AlarmType getType() {
        return this.type;
    }

    public void hideIfVisible() {
        s6.d.g(this);
    }

    public boolean isNewAlert() {
        return this.isNewAlert;
    }

    public boolean isNotAValidAlert() {
        if (this.type != null && this.state != null) {
            return false;
        }
        return true;
    }

    public boolean isTemperatureAlarm() {
        int i10 = AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()];
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 8) {
            return true;
        }
        return false;
    }

    public boolean needsToFireForProbe(Probe probe) {
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                if (probe.getAmbientTemperature() < this.limit) {
                    return true;
                }
                return false;
            case 2:
                if (probe.getAmbientTemperature() > this.limit) {
                    return true;
                }
                return false;
            case 3:
                if (probe.getInternalTemperature() < this.limit) {
                    return true;
                }
                return false;
            case 4:
                if (probe.getInternalTemperature() > this.limit) {
                    return true;
                }
                return false;
            case 5:
                if (probe.cookTimeElapsed() >= this.limit) {
                    return true;
                }
                return false;
            case 6:
                if (probe.getCookState().getValue() < DeviceCookState.COOK_STATE_READY_FOR_RESTING.getValue() && probe.getTimeRemaining() != -1 && probe.getTimeRemaining() <= this.limit) {
                    return true;
                }
                return false;
            case 7:
                long j10 = this.lastFireDate;
                if (j10 <= 0) {
                    j10 = this.createdDate;
                }
                if ((System.currentTimeMillis() - j10) / 1000 >= this.limit) {
                    return true;
                }
                return false;
            case 8:
                setLimit(probe.getCookEstimate().C());
                if (this.limit != -1) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public void setCreatedDate(long j10) {
        this.createdDate = j10;
    }

    protected void setId(UUID uuid) {
        this.id = uuid;
    }

    public void setIsNewAlert(boolean z10) {
        this.isNewAlert = z10;
    }

    public void setLastFireDate(long j10) {
        this.lastFireDate = j10;
    }

    public void setLimit(int i10) {
        this.limit = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setState(AlarmState alarmState) {
        this.state = alarmState;
    }

    public void setType(AlarmType alarmType) {
        this.type = alarmType;
    }

    public String shortDescription() {
        return shortDescription(com.apptionlabs.meater_app.app.a.i());
    }

    public boolean shouldResetToReadyForProbe(Probe probe) {
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                if (Temperature.convertToUserScale(probe.getAmbientTemperature()) >= Temperature.convertToUserScale(this.limit + 64)) {
                    return true;
                }
                return false;
            case 2:
                if (Temperature.convertToUserScale(probe.getAmbientTemperature()) <= Temperature.convertToUserScale(this.limit - 64)) {
                    return true;
                }
                return false;
            case 3:
                if (probe.getMEATERDeviceType().isG2Probe()) {
                    if (probe.getInternalTemperature() >= this.limit - 16) {
                        return true;
                    }
                } else if (Temperature.convertToUserScale(probe.getInternalTemperature()) >= Temperature.convertToUserScale(this.limit + 16)) {
                    return true;
                }
                return false;
            case 4:
                if (probe.getMEATERDeviceType().isG2Probe()) {
                    if (probe.getInternalTemperature() <= this.limit - 16) {
                        return true;
                    }
                } else if (Temperature.convertToUserScale(probe.getInternalTemperature()) <= Temperature.convertToUserScale(this.limit - 16)) {
                    return true;
                }
                return false;
            case 5:
                if (this.state.getValue() < AlarmState.ALARM_STATE_FIRED.getValue() && probe.cookTimeElapsed() < this.limit) {
                    return true;
                }
                return false;
            case 6:
                if (probe.getTimeRemaining() == -1) {
                    return false;
                }
                long[] v10 = l0.v(probe.getTimeRemaining());
                long j10 = ((v10[0] * 60) + v10[1]) * 60;
                if (this.state.getValue() < AlarmState.ALARM_STATE_FIRED.getValue() && j10 > this.limit) {
                    return true;
                }
                return false;
            case 7:
                AlarmState alarmState = this.state;
                if (alarmState == AlarmState.ALARM_STATE_DISMISSED || alarmState == AlarmState.ALARM_STATE_NOT_READY) {
                    return true;
                }
                return false;
            case 8:
                if (this.limit == -1) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public void updateAnalyticsForCurrentAlert() {
        String str;
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                str = b.EnumC0292b.C0.title;
                break;
            case 2:
                str = b.EnumC0292b.D0.title;
                break;
            case 3:
                str = b.EnumC0292b.E0.title;
                break;
            case 4:
                str = b.EnumC0292b.F0.title;
                break;
            case 5:
                str = b.EnumC0292b.G0.title;
                break;
            case 6:
                str = b.EnumC0292b.H0.title;
                break;
            case 7:
                str = b.EnumC0292b.I0.title;
                break;
            case 8:
                str = b.EnumC0292b.J0.title;
                break;
            default:
                str = null;
                break;
        }
        if (str == null) {
            return;
        }
        lm.b.g(str, "", "");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AlarmType alarmType = this.type;
        if (alarmType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(alarmType.getValue());
        }
        AlarmState alarmState = this.state;
        if (alarmState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(alarmState.getValue());
        }
        parcel.writeInt(this.limit);
        parcel.writeString(this.name);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Alert m3clone() {
        Alert alert = new Alert();
        alert.setId(this.id);
        alert.setType(this.type);
        alert.setState(this.state);
        alert.setLimit(this.limit);
        alert.setName(this.name);
        alert.setLastFireDate(this.lastFireDate);
        alert.setCreatedDate(this.createdDate);
        return alert;
    }

    public String shortDescription(Context context) {
        String str = this.name;
        if (str != null && str.length() > 0) {
            return this.name;
        }
        switch (AnonymousClass2.$SwitchMap$com$apptionlabs$meater_app$v3protobuf$AlarmType[this.type.ordinal()]) {
            case 1:
                return context.getString(2132017246) + " < " + Temperature.displayTemperature(this.limit);
            case 2:
                return context.getString(2132017246) + " > " + Temperature.displayTemperature(this.limit);
            case 3:
                return context.getString(2132017933) + " < " + Temperature.displayTemperature(this.limit);
            case 4:
                return context.getString(2132017933) + " > " + Temperature.displayTemperature(this.limit);
            case 5:
                return c0.a(this.limit);
            case 6:
                return c0.f(this.limit) + " " + context.getString(2132017315);
            case 7:
                return String.format(Locale.US, context.getString(2132017693), c0.f(this.limit));
            case 8:
                return context.getString(2132017689);
            default:
                return "";
        }
    }
}
