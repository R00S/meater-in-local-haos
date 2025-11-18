package A4;

import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.TemperatureLogRecording;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BLETemperatureLog.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public short f727a;

    /* renamed from: b, reason: collision with root package name */
    public short f728b;

    /* renamed from: c, reason: collision with root package name */
    public TemperatureLogRecording[] f729c;

    /* renamed from: d, reason: collision with root package name */
    public short f730d;

    /* renamed from: e, reason: collision with root package name */
    public int f731e;

    public static a a(byte[] bArr, Temperature.DeviceTemperatureResolution deviceTemperatureResolution) {
        short s10;
        a aVar = new a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        aVar.f727a = byteBufferWrap.getShort();
        short s11 = byteBufferWrap.getShort();
        aVar.f728b = s11;
        if (s11 >= 0 && s11 <= 120 && (s10 = aVar.f727a) != 0 && s10 % 5 == 0) {
            aVar.f729c = new TemperatureLogRecording[TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES];
            for (int i10 = 0; i10 < aVar.f728b; i10++) {
                int iConvertSixteenthResolutionToThirtyTwo = byteBufferWrap.getShort();
                int iConvertSixteenthResolutionToThirtyTwo2 = byteBufferWrap.getShort();
                if (deviceTemperatureResolution == Temperature.DeviceTemperatureResolution.SIXTEEN) {
                    iConvertSixteenthResolutionToThirtyTwo = Temperature.convertSixteenthResolutionToThirtyTwo(iConvertSixteenthResolutionToThirtyTwo);
                    iConvertSixteenthResolutionToThirtyTwo2 = Temperature.convertSixteenthResolutionToThirtyTwo(iConvertSixteenthResolutionToThirtyTwo2);
                }
                aVar.f729c[i10] = new TemperatureLogRecording(iConvertSixteenthResolutionToThirtyTwo, iConvertSixteenthResolutionToThirtyTwo2);
            }
        }
        return aVar;
    }

    public static a b(byte[] bArr, Temperature.DeviceTemperatureResolution deviceTemperatureResolution) {
        short s10;
        a aVar = new a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        aVar.f727a = byteBufferWrap.getShort();
        short s11 = byteBufferWrap.getShort();
        aVar.f728b = s11;
        if (s11 >= 0 && s11 <= 120 && (s10 = aVar.f727a) != 0 && s10 % 5 == 0) {
            aVar.f729c = new TemperatureLogRecording[TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES];
            for (int i10 = 0; i10 < aVar.f728b; i10++) {
                int iConvertSixteenthResolutionToThirtyTwo = byteBufferWrap.getShort();
                int iConvertSixteenthResolutionToThirtyTwo2 = byteBufferWrap.getShort();
                if (deviceTemperatureResolution == Temperature.DeviceTemperatureResolution.SIXTEEN) {
                    iConvertSixteenthResolutionToThirtyTwo = Temperature.convertSixteenthResolutionToThirtyTwo(iConvertSixteenthResolutionToThirtyTwo);
                    iConvertSixteenthResolutionToThirtyTwo2 = Temperature.convertSixteenthResolutionToThirtyTwo(iConvertSixteenthResolutionToThirtyTwo2);
                }
                aVar.f729c[i10] = new TemperatureLogRecording(iConvertSixteenthResolutionToThirtyTwo, iConvertSixteenthResolutionToThirtyTwo2);
            }
            for (int i11 = 0; i11 < 120 - aVar.f728b; i11++) {
                byteBufferWrap.getShort();
                byteBufferWrap.getShort();
            }
            aVar.f730d = byteBufferWrap.get();
            aVar.f731e = byteBufferWrap.getInt();
        }
        return aVar;
    }

    public static a c(byte[] bArr, Temperature.DeviceTemperatureResolution deviceTemperatureResolution) {
        short s10;
        a aVar = new a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferWrap.getInt();
        aVar.f727a = byteBufferWrap.getShort();
        short s11 = byteBufferWrap.getShort();
        aVar.f728b = s11;
        if (s11 >= 0 && s11 <= 120 && (s10 = aVar.f727a) != 0 && s10 % 5 == 0) {
            short signedInternalTemp = (short) Temperature.getSignedInternalTemp(byteBufferWrap.get(), byteBufferWrap.get());
            Temperature.getSignedInternalTemp(byteBufferWrap.get(), byteBufferWrap.get());
            aVar.f729c = new TemperatureLogRecording[TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES];
            for (int i10 = 0; i10 < aVar.f728b; i10++) {
                int signedInternalTemp2 = Temperature.getSignedInternalTemp(byteBufferWrap.get(), byteBufferWrap.get());
                int iAmbientFromTemperatureReading = Temperature.AmbientFromTemperatureReading(signedInternalTemp2, Temperature.getSignedInternalTemp(byteBufferWrap.get(), byteBufferWrap.get()), signedInternalTemp);
                if (deviceTemperatureResolution == Temperature.DeviceTemperatureResolution.SIXTEEN) {
                    signedInternalTemp2 = Temperature.convertSixteenthResolutionToThirtyTwo(signedInternalTemp2);
                    iAmbientFromTemperatureReading = Temperature.convertSixteenthResolutionToThirtyTwo(iAmbientFromTemperatureReading);
                }
                aVar.f729c[i10] = new TemperatureLogRecording(signedInternalTemp2, iAmbientFromTemperatureReading);
            }
        }
        return aVar;
    }

    public static a d(a aVar) {
        for (int i10 = 0; i10 < aVar.f728b; i10++) {
            aVar.f729c[i10].ambient = Temperature.applyAmbientCompensation(r1.ambient, r1.internal);
        }
        return aVar;
    }
}
