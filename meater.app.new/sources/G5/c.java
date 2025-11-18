package G5;

import android.content.Context;
import android.net.Uri;
import com.apptionlabs.meater_app.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 G5.c, still in use, count: 1, list:
  (r0v2 G5.c) from 0x00db: SPUT (r0v2 G5.c) (LINE:220) G5.c.P G5.c
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: ToneType.java */
/* loaded from: classes2.dex */
public final class c {
    BLEEP("bleep_sound", R.string.ringtone_bleep, R.raw.bleep),
    BRIGHT("bright_sound", R.string.ringtone_bright, R.raw.bright),
    CLICK("click_sound", R.string.ringtone_click, R.raw.click),
    DIVE("dive", R.string.ringtone_dive, R.raw.dive),
    HARP("harp_sound", R.string.ringtone_harp, R.raw.harp),
    HEY("hey", R.string.title_hey, R.raw.hey),
    NOTIFICATION("notification_sound", R.string.ringtone_notification, R.raw.notification),
    PING("ping_sound", R.string.ringtone_ping, R.raw.ping),
    RING("ring_sound", R.string.ringtone_ring, R.raw.ring),
    SHIMMER("shimmer_sound", R.string.ringtone_shimmer, R.raw.shimmer),
    TELEPHONE("telephone_sound", R.string.ringtone_telephone, R.raw.telephone);


    /* renamed from: P, reason: collision with root package name */
    public static final c f4969P = new c("click_sound", R.string.ringtone_click, R.raw.click);

    /* renamed from: Q, reason: collision with root package name */
    public static final c f4970Q = new c("dive", R.string.ringtone_dive, R.raw.dive);

    /* renamed from: R, reason: collision with root package name */
    public static final c f4971R = new c("harp_sound", R.string.ringtone_harp, R.raw.harp);

    /* renamed from: S, reason: collision with root package name */
    public static final c f4972S = new c("hey", R.string.title_hey, R.raw.hey);

    /* renamed from: B, reason: collision with root package name */
    public final String f4974B;

    /* renamed from: C, reason: collision with root package name */
    public final int f4975C;

    /* renamed from: D, reason: collision with root package name */
    public final int f4976D;

    static {
    }

    private c(String str, int i10, int i11) {
        this.f4974B = str;
        this.f4975C = i10;
        this.f4976D = i11;
    }

    public static c s(String str, c cVar) {
        for (c cVar2 : values()) {
            if (cVar2.f4974B.equalsIgnoreCase(str)) {
                return cVar2;
            }
        }
        return cVar;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f4973T.clone();
    }

    public int j() {
        return this.f4975C;
    }

    public int n() {
        return this.f4976D;
    }

    public Uri p(Context context) {
        return Uri.parse("android.resource://" + context.getPackageName() + "/" + n());
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + ", " + this.f4974B;
    }
}
