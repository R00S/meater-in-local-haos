package com.apptionlabs.meater_app.cloud;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.m0;
import di.j;
import kotlin.Metadata;
import wh.d0;
import wh.g;
import wh.m;
import wh.q;
import zh.a;
import zh.d;

/* compiled from: MEATERFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/MEATERFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "token", "Lih/u;", "t", "Lcom/google/firebase/messaging/m0;", "remoteMessage", "r", "<init>", "()V", "x", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class MEATERFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: y, reason: collision with root package name */
    private static final d<Object, String> f9606y;

    /* compiled from: MEATERFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR/\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/apptionlabs/meater_app/cloud/MEATERFirebaseMessagingService$a;", "", "", "<set-?>", "fcmToken$delegate", "Lzh/d;", "a", "()Ljava/lang/String;", "b", "(Ljava/lang/String;)V", "fcmToken", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.cloud.MEATERFirebaseMessagingService$a, reason: from kotlin metadata */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ j<Object>[] f9607a = {d0.e(new q(Companion.class, "fcmToken", "getFcmToken()Ljava/lang/String;", 0))};

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final String a() {
            return (String) MEATERFirebaseMessagingService.f9606y.a(this, f9607a[0]);
        }

        public final void b(String str) {
            MEATERFirebaseMessagingService.f9606y.b(this, f9607a[0], str);
        }
    }

    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/apptionlabs/meater_app/cloud/MEATERFirebaseMessagingService$b", "Lzh/b;", "Ldi/j;", "property", "oldValue", "newValue", "Lih/u;", "c", "(Ldi/j;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class b extends zh.b<String> {
        public b(Object obj) {
            super(obj);
        }

        protected void c(j<?> property, String oldValue, String newValue) {
            m.f(property, "property");
            k6.b.j("Firebase token set: " + newValue, new Object[0]);
        }
    }

    static {
        a aVar = a.a;
        f9606y = new b(null);
    }

    public void r(m0 m0Var) {
        m.f(m0Var, "remoteMessage");
        k6.b.j("From:  " + m0Var.p0(), new Object[0]);
        m.e(m0Var.i0(), "getData(...)");
        if (!r0.isEmpty()) {
            k6.b.j("Message data payload: " + m0Var.i0(), new Object[0]);
        }
        m0.b w02 = m0Var.w0();
        if (w02 != null) {
            k6.b.j("Message Notification Body: " + w02.a(), new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t(String str) {
        m.f(str, "token");
        INSTANCE.b(str);
        y5.g.F(getApplicationContext()).C0();
    }
}
