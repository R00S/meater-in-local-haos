package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SessionSubscriber.kt */
@Metadata(m32266d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m32267d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", HttpUrl.FRAGMENT_ENCODE_SET, "isDataCollectionEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "sessionSubscriberName", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "onSessionChanged", HttpUrl.FRAGMENT_ENCODE_SET, "sessionDetails", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.l0.b, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface SessionSubscriber {

    /* compiled from: SessionSubscriber.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.l0.b$a */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m32267d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.l0.b$b, reason: from toString */
    public static final /* data */ class SessionDetails {

        /* renamed from: a, reason: from toString */
        private final String sessionId;

        public SessionDetails(String str) {
            C9801m.m32346f(str, "sessionId");
            this.sessionId = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionDetails) && C9801m.m32341a(this.sessionId, ((SessionDetails) other).sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }
    }

    /* renamed from: a */
    boolean mo25364a();

    /* renamed from: b */
    a mo25365b();

    /* renamed from: c */
    void mo25366c(SessionDetails sessionDetails);
}
