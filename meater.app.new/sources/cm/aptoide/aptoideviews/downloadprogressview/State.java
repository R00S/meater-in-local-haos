package cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import okhttp3.HttpUrl;

/* compiled from: States.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "Canceled", "InProgress", "InitialPaused", "Installing", "Paused", "Queue", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public abstract class State {

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Canceled;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Canceled extends State {
        public static final Canceled INSTANCE = new Canceled();

        private Canceled() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$InProgress;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class InProgress extends State {
        public static final InProgress INSTANCE = new InProgress();

        private InProgress() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$InitialPaused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class InitialPaused extends State {
        public static final InitialPaused INSTANCE = new InitialPaused();

        private InitialPaused() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Installing;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Installing extends State {
        public static final Installing INSTANCE = new Installing();

        private Installing() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Paused;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Paused extends State {
        public static final Paused INSTANCE = new Paused();

        private Paused() {
            super(null);
        }
    }

    /* compiled from: States.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/State$Queue;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "()V", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Queue extends State {
        public static final Queue INSTANCE = new Queue();

        private Queue() {
            super(null);
        }
    }

    private State() {
    }

    public /* synthetic */ State(C9789g c9789g) {
        this();
    }
}
