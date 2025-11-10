package com.apptionlabs.meater_app.data;

import f6.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Temperature {
    public static final int COOK_STARTED_TEMPERATURE = 40;
    private static final int INTERNAL_SENSOR_COUNT = 5;
    public static final int INVALID_READING = -1024;
    public static final int MAX_AMBIENT_BLOCK = 60;
    public static final int MAX_AMBIENT_PROBE = 275;
    public static final int MAX_AMBIENT_SECOND_GEN_PROBE = 500;
    public static final int MAX_INTERNAL_PROBE = 99;
    public static final int MAX_INTERNAL_SECOND_GEN_PROBE = 105;
    public static final int MAX_TEMPERATURE_FOR_ESTIMATE = 90;
    public static final String TEMPERATURE_FORMAT = " %d°";
    public static final String TEMPERATURE_FORMAT_FLOAT = "%.2f°";
    public static final String TEMPERATURE_FORMAT_FLOAT_ONE_DECIMAL = "%.1f°";

    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum DeviceTemperatureResolution {
        UNKNOWN,
        SIXTEEN,
        THIRTYTWO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class ProbeTemperature_t {

        /* renamed from: v1, reason: collision with root package name */
        V1 f9608v1;

        /* renamed from: v2, reason: collision with root package name */
        V2 f9609v2;

        ProbeTemperature_t() {
        }
    }

    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class Temperatures_t {
        public int ambientTemperature;
        public int internalSensorCount;
        public int[] internalTemperatures;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class V1 {
        int ambient;
        int initialAmbientOffset;
        int internal;
        int lowestAmbientOffset;

        V1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class V2 {
        int ambientTemp;
        int[] internalTemps = new int[5];

        V2() {
        }
    }

    public static int AmbientFromTemperatureReading(int i10, int i11, int i12) {
        return i10 + ((int) Math.max(0.0f, ((i11 - Math.min(48, i12)) * 9424) / 1487.0f));
    }

    public static int ConvertThirtyTwoResolutionToSixteenth(int i10) {
        return i10 / 2;
    }

    public static Temperatures_t ConvertV1Temperatures(ProbeTemperature_t probeTemperature_t) {
        Temperatures_t temperatures_t = new Temperatures_t();
        temperatures_t.internalTemperatures = new int[1];
        temperatures_t.internalSensorCount = 1;
        int convertSixteenthResolutionToThirtyTwo = convertSixteenthResolutionToThirtyTwo(probeTemperature_t.f9608v1.internal);
        V1 v12 = probeTemperature_t.f9608v1;
        int convertSixteenthResolutionToThirtyTwo2 = convertSixteenthResolutionToThirtyTwo(Math.max(0, AmbientFromTemperatureReading(v12.internal, v12.ambient, v12.initialAmbientOffset)));
        temperatures_t.internalTemperatures[0] = convertSixteenthResolutionToThirtyTwo;
        temperatures_t.ambientTemperature = convertSixteenthResolutionToThirtyTwo2;
        return temperatures_t;
    }

    public static Temperatures_t ConvertV2Temperatures(ProbeTemperature_t probeTemperature_t) {
        Temperatures_t temperatures_t = new Temperatures_t();
        int[] iArr = probeTemperature_t.f9609v2.internalTemps;
        int length = iArr.length;
        temperatures_t.internalSensorCount = length;
        int[] iArr2 = new int[iArr.length];
        temperatures_t.internalTemperatures = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, length);
        temperatures_t.ambientTemperature = probeTemperature_t.f9609v2.ambientTemp;
        return temperatures_t;
    }

    public static b EstimatorRecordingFromTemperatures(Temperatures_t temperatures_t) {
        if (temperatures_t == null) {
            return emptyTemperatureReading();
        }
        b bVar = new b();
        bVar.f12395a = new int[5];
        bVar.f12396b = temperatures_t.ambientTemperature;
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 < temperatures_t.internalSensorCount) {
                bVar.f12395a[i10] = temperatures_t.internalTemperatures[i10];
            } else {
                bVar.f12395a[i10] = -1024;
            }
        }
        return bVar;
    }

    public static Temperatures_t TemperaturesFromBLETemperatureReading(ProbeTemperature_t probeTemperature_t, DeviceTemperatureResolution deviceTemperatureResolution) {
        if (deviceTemperatureResolution == DeviceTemperatureResolution.THIRTYTWO) {
            return ConvertV2Temperatures(probeTemperature_t);
        }
        return ConvertV1Temperatures(probeTemperature_t);
    }

    public static Temperatures_t TemperaturesFromData(byte[] bArr, DeviceTemperatureResolution deviceTemperatureResolution) {
        return TemperaturesFromBLETemperatureReading(probeTemperatureFromData(bArr, deviceTemperatureResolution), deviceTemperatureResolution);
    }

    public static int applyAmbientCompensation(double d10, double d11) {
        return (int) (d11 + ((d10 - d11) * 1.2d));
    }

    public static int convertSixteenthResolutionToThirtyTwo(int i10) {
        return i10 * 2;
    }

    public static int convertToUserScale(int i10) {
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            return toFahrenheit(i10);
        }
        return toCelsius(i10);
    }

    public static float convertToUserScaleFloat(float f10) {
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            return toFahrenheitFloat(f10);
        }
        return toCelsiusFloat(f10);
    }

    public static String displayTemperature(int i10) {
        if (i10 == -1024) {
            return "-";
        }
        return String.format(Locale.ENGLISH, TEMPERATURE_FORMAT, Integer.valueOf(convertToUserScale(i10)));
    }

    public static String displayTemperatureFloat(float f10) {
        return String.format(Locale.ENGLISH, TEMPERATURE_FORMAT_FLOAT, Float.valueOf(convertToUserScaleFloat(f10)));
    }

    public static String displayTemperatureFloatValues(float f10) {
        if (f10 == -1024.0f) {
            return "-";
        }
        return String.format(Locale.ENGLISH, TEMPERATURE_FORMAT_FLOAT_ONE_DECIMAL, Float.valueOf(convertToUserScaleFloat(f10)));
    }

    public static b emptyTemperatureReading() {
        b bVar = new b();
        bVar.f12395a = new int[5];
        bVar.f12396b = INVALID_READING;
        for (int i10 = 0; i10 < 5; i10++) {
            bVar.f12395a[i10] = -1024;
        }
        return bVar;
    }

    public static int fromCelsius(int i10) {
        return i10 * 32;
    }

    public static int fromFahrenheit(int i10) {
        return ((((i10 - 32) * 5) + 1) * 32) / 9;
    }

    public static int getSignedInternalTemp(byte b10, byte b11) {
        int a10 = (f8.b.a(b10) * 256) + f8.b.a(b11);
        if (a10 >= 2048) {
            return a10 | (-4096);
        }
        return a10;
    }

    public static String getUserUnitString() {
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            return "F";
        }
        return "C";
    }

    public static int interpolate(int i10, int i11, int i12, int i13, int i14) {
        if (i14 > i12) {
            return (((int) ((i11 - i10) / (i14 - i12))) * (i13 - i12)) + i10;
        }
        throw new Error("Invalid input to interpolation");
    }

    public static int maxInternalTemperatureUserCanSelect() {
        return convertToUserScale(3136);
    }

    public static ProbeTemperature_t probeTemperatureFromData(byte[] bArr, DeviceTemperatureResolution deviceTemperatureResolution) {
        ProbeTemperature_t probeTemperature_t = new ProbeTemperature_t();
        if (deviceTemperatureResolution == DeviceTemperatureResolution.SIXTEEN) {
            probeTemperature_t.f9608v1 = v1FromData(bArr);
        } else {
            probeTemperature_t.f9609v2 = v2FromData(bArr);
        }
        return probeTemperature_t;
    }

    public static int toCelsius(int i10) {
        if (i10 > 0) {
            return (i10 + 8) / 32;
        }
        if (i10 < 0) {
            return (i10 - 8) / 32;
        }
        return 0;
    }

    public static float toCelsiusFloat(float f10) {
        return f10 / 32.0f;
    }

    public static int toFahrenheit(int i10) {
        return ((((i10 * 9) + 3) / 5) / 32) + 32;
    }

    public static float toFahrenheitFloat(float f10) {
        return ((f10 / 32.0f) * 1.8f) + 32.0f;
    }

    public static V1 v1FromData(byte[] bArr) {
        V1 v12 = new V1();
        ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        v12.internal = getSignedInternalTemp(bArr[1], bArr[0]);
        v12.ambient = getSignedInternalTemp(bArr[3], bArr[2]);
        v12.initialAmbientOffset = getSignedInternalTemp(bArr[5], bArr[4]);
        v12.lowestAmbientOffset = getSignedInternalTemp(bArr[5], bArr[4]);
        return v12;
    }

    public static V2 v2FromData(byte[] bArr) {
        V2 v22 = new V2();
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        v22.internalTemps[0] = wrap.getShort();
        v22.internalTemps[1] = wrap.getShort();
        v22.internalTemps[2] = wrap.getShort();
        v22.internalTemps[3] = wrap.getShort();
        v22.internalTemps[4] = wrap.getShort();
        short s10 = wrap.getShort();
        v22.ambientTemp = s10;
        v22.ambientTemp = applyAmbientCompensation(s10, v22.internalTemps[4]);
        return v22;
    }
}
