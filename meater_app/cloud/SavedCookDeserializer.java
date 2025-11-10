package com.apptionlabs.meater_app.cloud;

import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import com.apptionlabs.meater_app.v3protobuf.AlarmState;
import com.apptionlabs.meater_app.v3protobuf.AlarmType;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.n;
import f8.l0;
import g6.a;
import g6.b;
import java.lang.reflect.Type;
import java.util.Iterator;
import jh.d0;
import jh.o;
import kotlin.Metadata;
import wh.m;

/* compiled from: SavedCookDeserializer.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/SavedCookDeserializer;", "Lcom/google/gson/i;", "Lcom/apptionlabs/meater_app/model/SavedCook;", "Lcom/google/gson/j;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/h;", "context", "b", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class SavedCookDeserializer implements i<SavedCook> {
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SavedCook a(j json, Type typeOfT, h context) {
        l lVar;
        l lVar2;
        l lVar3;
        Integer num;
        Integer num2;
        g E;
        Iterator it;
        String str;
        int i10;
        int i11;
        int i12;
        Integer c10;
        Integer c11;
        Integer c12;
        g d10;
        Iterator it2;
        Iterator x10;
        int i13;
        int i14;
        Integer c13;
        Integer c14;
        Integer c15;
        g d11;
        n f10;
        Double b10;
        Integer c16;
        String g10;
        Integer c17;
        String g11;
        Integer c18;
        SavedCook savedCook = new SavedCook();
        if (json != null) {
            lVar = a.e(json);
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar2 = b.e(lVar, "setup");
        } else {
            lVar2 = null;
        }
        if (lVar != null) {
            lVar3 = b.e(lVar, "history");
        } else {
            lVar3 = null;
        }
        if (lVar != null && (c18 = b.c(lVar, "peak")) != null) {
            savedCook.setPeakTemperature(c18.intValue());
        }
        if (lVar2 != null && (g11 = b.g(lVar2, "cookID")) != null) {
            savedCook.setCookID(l0.s(g11));
        }
        if (lVar2 != null && (c17 = b.c(lVar2, "targetTemperature")) != null) {
            savedCook.setTargetTemperature(c17.intValue());
        }
        if (lVar2 != null && (g10 = b.g(lVar2, "cookName")) != null) {
            savedCook.setCookName(g10);
        }
        if (lVar2 != null && (c16 = b.c(lVar2, "cutID")) != null) {
            savedCook.setCutId(c16.intValue());
        }
        if (lVar3 != null && (f10 = b.f(lVar3, "startTime")) != null && (b10 = a.b(f10)) != null) {
            savedCook.setCookStartTime((long) b10.doubleValue());
        }
        if (lVar3 != null) {
            num = b.c(lVar3, "interval");
        } else {
            num = null;
        }
        if (lVar3 != null && (d11 = b.d(lVar3, "values")) != null) {
            num2 = Integer.valueOf(o.W(d11));
        } else {
            num2 = null;
        }
        if (num != null && num2 != null) {
            savedCook.setCookTime(num.intValue() * num2.intValue());
        }
        TemperatureLog temperatureLog = new TemperatureLog();
        if (lVar3 != null && (c15 = b.c(lVar3, "interval")) != null) {
            temperatureLog.setInterval(c15.intValue());
        }
        if (lVar3 != null && (d10 = b.d(lVar3, "values")) != null && (it2 = d10.iterator()) != null && (x10 = o.x(it2)) != null) {
            while (x10.hasNext()) {
                d0 d0Var = (d0) x10.next();
                Object d12 = d0Var.d();
                m.e(d12, "<get-value>(...)");
                l e10 = a.e((j) d12);
                if (e10 != null && (c14 = b.c(e10, "internal")) != null) {
                    i13 = c14.intValue();
                } else {
                    i13 = 0;
                }
                if (e10 != null && (c13 = b.c(e10, "ambient")) != null) {
                    i14 = c13.intValue();
                } else {
                    i14 = 0;
                }
                temperatureLog.recordings[d0Var.c()] = new TemperatureLogRecording(i13, i14);
                temperatureLog.setCount(temperatureLog.getCount() + 1);
            }
        }
        savedCook.setTemperatureLog(HighResTemperatureLog.logWithTemperatureLog(temperatureLog));
        if (savedCook.getCookState() > DeviceCookState.COOK_STATE_RESTING.getValue()) {
            savedCook.getTemperatureLog().turnOnCroppingEndOfCookFromGraphData();
        }
        savedCook.setCookTime(yh.a.a(savedCook.getTemperatureLog().graphDuration()));
        if (lVar2 != null && (E = lVar2.E("probeAlarms")) != null && (it = E.iterator()) != null) {
            while (it.hasNext()) {
                j jVar = (j) it.next();
                m.c(jVar);
                l e11 = a.e(jVar);
                Alert alert = new Alert();
                if (e11 != null) {
                    str = b.g(e11, "name");
                } else {
                    str = null;
                }
                alert.setName(str);
                if (e11 != null && (c12 = b.c(e11, "type")) != null) {
                    i10 = c12.intValue();
                } else {
                    i10 = 0;
                }
                alert.setType(AlarmType.fromValue(i10));
                if (e11 != null && (c11 = b.c(e11, "limit")) != null) {
                    i11 = c11.intValue();
                } else {
                    i11 = 0;
                }
                alert.setLimit(i11);
                if (e11 != null && (c10 = b.c(e11, "state")) != null) {
                    i12 = c10.intValue();
                } else {
                    i12 = 0;
                }
                alert.setState(AlarmState.fromValue(i12));
                savedCook.getAlerts().add(alert);
            }
        }
        return savedCook;
    }
}
