package P5;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: SoundHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LP5/G;", "", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: SoundHelper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LP5/G$a;", "", "<init>", "()V", "Loa/F;", "a", "Landroid/content/Context;", "context", "LP5/G$b;", "b", "(Landroid/content/Context;)LP5/G$b;", "", "c", "(Landroid/content/Context;)I", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: P5.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final void a() {
            Context contextH = x4.g.h();
            C3862t.d(contextH);
            b bVarB = b(contextH);
            if (bVarB == b.f14002D) {
                return;
            }
            Intent intent = new Intent(MEATERIntent.SHOW_DIALOG_MESSAGE);
            intent.putExtra(MEATERIntent.EXTRA_TITLE, contextH.getString(bVarB.n()));
            intent.putExtra(MEATERIntent.EXTRA_MESSAGE, contextH.getString(bVarB.j()));
            intent.setPackage(x4.g.h().getPackageName());
            contextH.sendBroadcast(intent);
        }

        public final b b(Context context) {
            C3862t.g(context, "context");
            Object systemService = context.getSystemService("audio");
            C3862t.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            return streamVolume < 1 ? b.f14000B : streamVolume < audioManager.getStreamMaxVolume(3) / 2 ? b.f14001C : b.f14002D;
        }

        public final int c(Context context) {
            C3862t.g(context, "context");
            Object systemService = context.getSystemService("audio");
            C3862t.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getStreamVolume(3);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SoundHelper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LP5/G$b;", "", "<init>", "(Ljava/lang/String;I)V", "", "n", "()I", "title", "j", "text", "B", "C", "D", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: B, reason: collision with root package name */
        public static final b f14000B = new b("MuteVolume", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f14001C = new b("LowVolume", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final b f14002D = new b("Normal", 2);

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ b[] f14003E;

        /* renamed from: F, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f14004F;

        /* compiled from: SoundHelper.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f14005a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.f14000B.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.f14001C.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.f14002D.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f14005a = iArr;
            }
        }

        static {
            b[] bVarArrC = c();
            f14003E = bVarArrC;
            f14004F = C4929b.a(bVarArrC);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f14000B, f14001C, f14002D};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f14003E.clone();
        }

        public final int j() {
            int i10 = a.f14005a[ordinal()];
            if (i10 == 1) {
                return R.string.sound_mute_alert_text;
            }
            if (i10 == 2 || i10 == 3) {
                return R.string.sound_low_alert_text;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final int n() {
            int i10 = a.f14005a[ordinal()];
            if (i10 == 1) {
                return R.string.sound_mute_alert_title;
            }
            if (i10 == 2 || i10 == 3) {
                return R.string.sound_low_alert_title;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
