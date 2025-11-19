package d0;

import kotlin.Metadata;

/* compiled from: ContentCaptureManager.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0001\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Ld0/l;", "", "x", "a", "Ld0/b;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f39647a;

    /* compiled from: ContentCaptureManager.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ld0/l$a;", "", "<init>", "()V", "", "<set-?>", "b", "Z", "a", "()Z", "setEnabled", "(Z)V", "isEnabled$annotations", "isEnabled", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: d0.l$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f39647a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static boolean isEnabled = true;

        private Companion() {
        }

        public final boolean a() {
            return isEnabled;
        }
    }
}
