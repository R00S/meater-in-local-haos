package cm.aptoide.p092pt.download.view;

import cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C9801m;

/* compiled from: DownloadEvent.kt */
@Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m32267d2 = {"toDownloadEvent", "Lcm/aptoide/pt/download/view/DownloadEvent;", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "app_vanillaProdRelease"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class DownloadEventKt {

    /* compiled from: DownloadEvent.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadEventListener.Action.Type.values().length];
            iArr[DownloadEventListener.Action.Type.CANCEL.ordinal()] = 1;
            iArr[DownloadEventListener.Action.Type.RESUME.ordinal()] = 2;
            iArr[DownloadEventListener.Action.Type.PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DownloadEvent toDownloadEvent(DownloadEventListener.Action action) {
        C9801m.m32346f(action, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
        if (i2 == 1) {
            return DownloadEvent.CANCEL;
        }
        if (i2 == 2) {
            return DownloadEvent.RESUME;
        }
        if (i2 == 3) {
            return DownloadEvent.PAUSE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
