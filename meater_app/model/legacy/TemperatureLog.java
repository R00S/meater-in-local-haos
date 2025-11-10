package com.apptionlabs.meater_app.model.legacy;

import java.util.Date;

/* loaded from: /tmp/meat/meat/classes.dex */
public class TemperatureLog {
    public int count;
    public Date estimatedStartTime;
    public int interval;
    public String probeId;
    public TemperatureRecordingX[] recordings = new TemperatureRecordingX[120];
}
