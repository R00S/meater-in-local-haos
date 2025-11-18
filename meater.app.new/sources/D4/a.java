package D4;

import com.apptionlabs.meater_app.app.MeaterLinkService;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import sa.C4520a;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: DeviceServiceScanner.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003R$\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"LD4/a;", "", "<init>", "()V", "Loa/F;", "c", "b", "d", "LD4/a$a;", "value", "a", "LD4/a$a;", "getState", "()LD4/a$a;", "state", "Ljava/util/Timer;", "Ljava/util/Timer;", "timer", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private EnumC0055a state = EnumC0055a.f3376B;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Timer timer = new Timer();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeviceServiceScanner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LD4/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: D4.a$a, reason: collision with other inner class name */
    public static final class EnumC0055a {

        /* renamed from: B, reason: collision with root package name */
        public static final EnumC0055a f3376B = new EnumC0055a("Stopped", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final EnumC0055a f3377C = new EnumC0055a("ReadyToScan", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final EnumC0055a f3378D = new EnumC0055a("Scanning", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ EnumC0055a[] f3379E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f3380F;

        static {
            EnumC0055a[] enumC0055aArrC = c();
            f3379E = enumC0055aArrC;
            f3380F = C4929b.a(enumC0055aArrC);
        }

        private EnumC0055a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0055a[] c() {
            return new EnumC0055a[]{f3376B, f3377C, f3378D};
        }

        public static EnumC0055a valueOf(String str) {
            return (EnumC0055a) Enum.valueOf(EnumC0055a.class, str);
        }

        public static EnumC0055a[] values() {
            return (EnumC0055a[]) f3379E.clone();
        }
    }

    /* compiled from: Timer.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"D4/a$b", "Ljava/util/TimerTask;", "Loa/F;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        MeaterLinkService meaterLinkServiceE = MeaterLinkService.e();
        if (meaterLinkServiceE == null) {
            if (this.state == EnumC0055a.f3378D) {
                this.state = EnumC0055a.f3377C;
            }
        } else if (this.state == EnumC0055a.f3377C) {
            this.state = EnumC0055a.f3378D;
            this.timer.cancel();
            meaterLinkServiceE.i(true);
        }
    }

    public final void b() {
        this.state = EnumC0055a.f3377C;
        Timer timerA = C4520a.a(null, false);
        timerA.scheduleAtFixedRate(new b(), 0L, 1000L);
        this.timer = timerA;
    }

    public final void d() {
        this.state = EnumC0055a.f3376B;
        this.timer.cancel();
        MeaterLinkService meaterLinkServiceE = MeaterLinkService.e();
        if (meaterLinkServiceE != null) {
            meaterLinkServiceE.j();
        }
    }
}
