package cm.aptoide.aptoideviews.downloadprogressview;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: DownloadEventListener.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener;", HttpUrl.FRAGMENT_ENCODE_SET, "onActionClick", HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", "Action", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface DownloadEventListener {

    /* compiled from: DownloadEventListener.kt */
    @Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action;", HttpUrl.FRAGMENT_ENCODE_SET, "type", "Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", "payload", "(Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;Ljava/lang/Object;)V", "getPayload", "()Ljava/lang/Object;", "getType", "()Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "Type", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final /* data */ class Action {
        private final Object payload;
        private final Type type;

        /* compiled from: DownloadEventListener.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m32267d2 = {"Lcm/aptoide/aptoideviews/downloadprogressview/DownloadEventListener$Action$Type;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CANCEL", "RESUME", "PAUSE", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
        public enum Type {
            CANCEL,
            RESUME,
            PAUSE
        }

        public Action(Type type, Object obj) {
            C9801m.m32346f(type, "type");
            this.type = type;
            this.payload = obj;
        }

        public static /* synthetic */ Action copy$default(Action action, Type type, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                type = action.type;
            }
            if ((i2 & 2) != 0) {
                obj = action.payload;
            }
            return action.copy(type, obj);
        }

        /* renamed from: component1, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final Object getPayload() {
            return this.payload;
        }

        public final Action copy(Type type, Object payload) {
            C9801m.m32346f(type, "type");
            return new Action(type, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Action)) {
                return false;
            }
            Action action = (Action) other;
            return this.type == action.type && C9801m.m32341a(this.payload, action.payload);
        }

        public final Object getPayload() {
            return this.payload;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            Object obj = this.payload;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Action(type=" + this.type + ", payload=" + this.payload + ')';
        }
    }

    void onActionClick(Action action);
}
