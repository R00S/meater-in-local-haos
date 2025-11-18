package cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: States.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CancelClick", "DownloadStart", "InstallStart", "PauseClick", "PauseStart", "Reset", "ResumeClick", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$ResumeClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$DownloadStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$InstallStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class Event {

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$CancelClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class CancelClick extends Event {
        public static final CancelClick INSTANCE = new CancelClick();

        private CancelClick() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$DownloadStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class DownloadStart extends Event {
        public static final DownloadStart INSTANCE = new DownloadStart();

        private DownloadStart() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$InstallStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class InstallStart extends Event {
        public static final InstallStart INSTANCE = new InstallStart();

        private InstallStart() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class PauseClick extends Event {
        public static final PauseClick INSTANCE = new PauseClick();

        private PauseClick() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$PauseStart;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class PauseStart extends Event {
        public static final PauseStart INSTANCE = new PauseStart();

        private PauseStart() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$Reset;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Reset extends Event {
        public static final Reset INSTANCE = new Reset();

        private Reset() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/Event$ResumeClick;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class ResumeClick extends Event {
        public static final ResumeClick INSTANCE = new ResumeClick();

        private ResumeClick() {
            super(null);
        }
    }

    private Event() {
    }

    public /* synthetic */ Event(C9789g c9789g) {
        this();
    }
}
