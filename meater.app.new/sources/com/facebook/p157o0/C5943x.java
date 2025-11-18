package com.facebook.p157o0;

import android.content.Context;
import android.util.Log;
import com.facebook.C5641a0;
import com.facebook.internal.C5696p0;
import com.facebook.p157o0.C5928t;
import com.facebook.p157o0.C5941v;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AppEventDiskStore.kt */
/* renamed from: com.facebook.o0.x */
/* loaded from: classes.dex */
public final class C5943x {

    /* renamed from: a */
    public static final C5943x f15541a = new C5943x();

    /* renamed from: b */
    private static final String f15542b = C5943x.class.getName();

    /* compiled from: AppEventDiskStore.kt */
    /* renamed from: com.facebook.o0.x$a */
    private static final class a extends ObjectInputStream {

        /* renamed from: f */
        public static final C11463a f15543f = new C11463a(null);

        /* compiled from: AppEventDiskStore.kt */
        /* renamed from: com.facebook.o0.x$a$a, reason: collision with other inner class name */
        public static final class C11463a {
            private C11463a() {
            }

            public /* synthetic */ C11463a(C9789g c9789g) {
                this();
            }
        }

        public a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
            ObjectStreamClass classDescriptor = super.readClassDescriptor();
            if (C9801m.m32341a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                classDescriptor = ObjectStreamClass.lookup(C5928t.b.class);
            } else if (C9801m.m32341a(classDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                classDescriptor = ObjectStreamClass.lookup(C5941v.b.class);
            }
            C9801m.m32345e(classDescriptor, "resultClassDescriptor");
            return classDescriptor;
        }
    }

    private C5943x() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x0003, B:10:0x002c, B:11:0x0031, B:45:0x00a5, B:14:0x003c, B:25:0x005c, B:26:0x0061, B:29:0x006c, B:30:0x0070, B:32:0x0075, B:33:0x007a, B:37:0x008c, B:36:0x0085, B:39:0x008e, B:40:0x0093, B:43:0x009e), top: B:63:0x0003, inners: #1, #4, #5, #6 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized com.facebook.p157o0.C5827h0 m12851a() {
        /*
            java.lang.Class<com.facebook.o0.x> r0 = com.facebook.p157o0.C5943x.class
            monitor-enter(r0)
            com.facebook.o0.q0.g r1 = com.facebook.p157o0.p165q0.C5902g.f15370a     // Catch: java.lang.Throwable -> Lac
            com.facebook.p157o0.p165q0.C5902g.m12625b()     // Catch: java.lang.Throwable -> Lac
            com.facebook.a0 r1 = com.facebook.C5641a0.f14199a     // Catch: java.lang.Throwable -> Lac
            android.content.Context r1 = com.facebook.C5641a0.m11284c()     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.C9801m.m32345e(r3, r4)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            com.facebook.o0.x$a r4 = new com.facebook.o0.x$a     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L53 java.io.FileNotFoundException -> L8d
            java.lang.Object r3 = r4.readObject()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            if (r3 == 0) goto L45
            com.facebook.o0.h0 r3 = (com.facebook.p157o0.C5827h0) r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            com.facebook.internal.p0 r2 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> Lac
            com.facebook.internal.C5696p0.m11570h(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L3b java.lang.Throwable -> Lac
            goto L43
        L3b:
            r1 = move-exception
            java.lang.String r2 = com.facebook.p157o0.C5943x.f15542b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch: java.lang.Throwable -> Lac
        L43:
            r2 = r3
            goto La3
        L45:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
            throw r3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L74 java.io.FileNotFoundException -> L8e
        L4d:
            r3 = move-exception
            goto L55
        L4f:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L75
        L53:
            r3 = move-exception
            r4 = r2
        L55:
            java.lang.String r5 = com.facebook.p157o0.C5943x.f15542b     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> L74
            com.facebook.internal.p0 r3 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> Lac
            com.facebook.internal.C5696p0.m11570h(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L6b java.lang.Throwable -> Lac
            goto La3
        L6b:
            r1 = move-exception
            java.lang.String r3 = com.facebook.p157o0.C5943x.f15542b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L70:
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> Lac
            goto La3
        L74:
            r2 = move-exception
        L75:
            com.facebook.internal.p0 r3 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> Lac
            com.facebook.internal.C5696p0.m11570h(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> Lac
            goto L8c
        L84:
            r1 = move-exception
            java.lang.String r3 = com.facebook.p157o0.C5943x.f15542b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch: java.lang.Throwable -> Lac
        L8c:
            throw r2     // Catch: java.lang.Throwable -> Lac
        L8d:
            r4 = r2
        L8e:
            com.facebook.internal.p0 r3 = com.facebook.internal.C5696p0.f14478a     // Catch: java.lang.Throwable -> Lac
            com.facebook.internal.C5696p0.m11570h(r4)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lac
            r1.delete()     // Catch: java.lang.Exception -> L9d java.lang.Throwable -> Lac
            goto La3
        L9d:
            r1 = move-exception
            java.lang.String r3 = com.facebook.p157o0.C5943x.f15542b     // Catch: java.lang.Throwable -> Lac
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L70
        La3:
            if (r2 != 0) goto Laa
            com.facebook.o0.h0 r2 = new com.facebook.o0.h0     // Catch: java.lang.Throwable -> Lac
            r2.<init>()     // Catch: java.lang.Throwable -> Lac
        Laa:
            monitor-exit(r0)
            return r2
        Lac:
            r1 = move-exception
            monitor-exit(r0)
            goto Lb0
        Laf:
            throw r1
        Lb0:
            goto Laf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.C5943x.m12851a():com.facebook.o0.h0");
    }

    /* renamed from: b */
    public static final void m12852b(C5827h0 c5827h0) throws IOException {
        ObjectOutputStream objectOutputStream;
        C5641a0 c5641a0 = C5641a0.f14199a;
        Context contextM11284c = C5641a0.m11284c();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextM11284c.openFileOutput("AppEventsLogger.persistedevents", 0)));
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeObject(c5827h0);
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11570h(objectOutputStream);
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            try {
                Log.w(f15542b, "Got unexpected exception while persisting events: ", th);
                try {
                    contextM11284c.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused) {
                }
            } finally {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11570h(objectOutputStream2);
            }
        }
    }
}
