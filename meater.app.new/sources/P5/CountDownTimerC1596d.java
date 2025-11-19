package P5;

import android.os.CountDownTimer;

/* compiled from: ConnectionImageCountDownTimer.java */
/* renamed from: P5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class CountDownTimerC1596d extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public a f14028a;

    /* compiled from: ConnectionImageCountDownTimer.java */
    /* renamed from: P5.d$a */
    public enum a {
        ConnectionMethod,
        LowBattery,
        LowSignal
    }

    public CountDownTimerC1596d(long j10, long j11) {
        super(j10, j11);
        this.f14028a = a.ConnectionMethod;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
        a aVar = this.f14028a;
        a aVar2 = a.ConnectionMethod;
        if (aVar == aVar2) {
            this.f14028a = a.LowBattery;
        } else if (aVar == a.LowBattery) {
            this.f14028a = a.LowSignal;
        } else {
            this.f14028a = aVar2;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
    }
}
