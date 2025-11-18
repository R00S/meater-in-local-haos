package com.google.firebase.crashlytics.internal.p185p.p186h0;

import android.util.Base64;
import android.util.JsonReader;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.crashlytics.internal.p185p.C8247a;
import com.google.firebase.encoders.InterfaceC8325a;
import com.google.firebase.encoders.json.C8336d;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.p.h0.j */
/* loaded from: classes2.dex */
public class C8271j {

    /* renamed from: a */
    private static final InterfaceC8325a f31385a = new C8336d().m26101g(C8247a.f31124a).m26102h(true).m26100f();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.h0.j$a */
    interface a<T> {
        /* renamed from: a */
        T mo25908a(JsonReader jsonReader) throws IOException;
    }

    /* renamed from: A */
    private static AbstractC8258f0.e.d.f m25909A(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.f.a aVarM25889a = AbstractC8258f0.e.d.f.m25889a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("assignments")) {
                aVarM25889a.mo25892b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.b
                    @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                    /* renamed from: a */
                    public final Object mo25908a(JsonReader jsonReader2) {
                        return C8271j.m25943z(jsonReader2);
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25889a.mo25891a();
    }

    /* renamed from: B */
    private static AbstractC8258f0.e.d.a.b.AbstractC11506d m25910B(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.AbstractC11506d.AbstractC11507a abstractC11507aM25810a = AbstractC8258f0.e.d.a.b.AbstractC11506d.m25810a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "address":
                    abstractC11507aM25810a.mo25815b(jsonReader.nextLong());
                    break;
                case "code":
                    abstractC11507aM25810a.mo25816c(jsonReader.nextString());
                    break;
                case "name":
                    abstractC11507aM25810a.mo25817d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11507aM25810a.mo25814a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static AbstractC8258f0.e.d.a.b.AbstractC11508e m25911C(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11509a abstractC11509aM25818a = AbstractC8258f0.e.d.a.b.AbstractC11508e.m25818a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC11509aM25818a.mo25823b(m25931n(jsonReader, C8265d.f31379a));
                    break;
                case "name":
                    abstractC11509aM25818a.mo25825d(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC11509aM25818a.mo25824c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11509aM25818a.mo25822a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static AbstractC8258f0.d.b m25912D(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.d.b.a aVarM25675a = AbstractC8258f0.d.b.m25675a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                aVarM25675a.mo25680c(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                aVarM25675a.mo25679b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25675a.mo25678a();
    }

    /* renamed from: E */
    private static AbstractC8258f0.d m25913E(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.d.a aVarM25674a = AbstractC8258f0.d.m25674a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                aVarM25674a.mo25661b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.g
                    @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                    /* renamed from: a */
                    public final Object mo25908a(JsonReader jsonReader2) {
                        return C8271j.m25912D(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                aVarM25674a.mo25662c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25674a.mo25660a();
    }

    /* renamed from: F */
    private static AbstractC8258f0.e.AbstractC11515e m25914F(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.AbstractC11515e.a aVarM25893a = AbstractC8258f0.e.AbstractC11515e.m25893a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildVersion":
                    aVarM25893a.mo25899b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    aVarM25893a.mo25900c(jsonReader.nextBoolean());
                    break;
                case "version":
                    aVarM25893a.mo25902e(jsonReader.nextString());
                    break;
                case "platform":
                    aVarM25893a.mo25901d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM25893a.mo25898a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static AbstractC8258f0.e.d.a.c m25915G(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.c.AbstractC11512a abstractC11512aM25838a = AbstractC8258f0.e.d.a.c.m25838a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "pid":
                    abstractC11512aM25838a.mo25846d(jsonReader.nextInt());
                    break;
                case "processName":
                    abstractC11512aM25838a.mo25847e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    abstractC11512aM25838a.mo25844b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    abstractC11512aM25838a.mo25845c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11512aM25838a.mo25843a();
    }

    /* renamed from: H */
    private static AbstractC8258f0 m25916H(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.b bVarM25664b = AbstractC8258f0.m25664b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "ndkPayload":
                    bVarM25664b.mo25602i(m25913E(jsonReader));
                    break;
                case "sdkVersion":
                    bVarM25664b.mo25604k(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    bVarM25664b.mo25596c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    bVarM25664b.mo25595b(m25930m(jsonReader));
                    break;
                case "buildVersion":
                    bVarM25664b.mo25597d(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    bVarM25664b.mo25600g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    bVarM25664b.mo25601h(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    bVarM25664b.mo25599f(jsonReader.nextString());
                    break;
                case "platform":
                    bVarM25664b.mo25603j(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    bVarM25664b.mo25598e(jsonReader.nextString());
                    break;
                case "session":
                    bVarM25664b.mo25605l(m25918J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM25664b.mo25594a();
    }

    /* renamed from: I */
    private static AbstractC8258f0.e.d.AbstractC11514e.b m25917I(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.AbstractC11514e.b.a aVarM25883a = AbstractC8258f0.e.d.AbstractC11514e.b.m25883a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("variantId")) {
                aVarM25883a.mo25888c(jsonReader.nextString());
            } else if (strNextName.equals("rolloutId")) {
                aVarM25883a.mo25887b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25883a.mo25886a();
    }

    /* renamed from: J */
    private static AbstractC8258f0.e m25918J(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.b bVarM25681a = AbstractC8258f0.e.m25681a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "startedAt":
                    bVarM25681a.mo25727m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    bVarM25681a.mo25717c(jsonReader.nextString());
                    break;
                case "identifier":
                    bVarM25681a.m25725k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    bVarM25681a.mo25720f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    bVarM25681a.mo25719e(m25934q(jsonReader));
                    break;
                case "events":
                    bVarM25681a.mo25721g(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.a
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25935r(jsonReader2);
                        }
                    }));
                    break;
                case "os":
                    bVarM25681a.mo25726l(m25914F(jsonReader));
                    break;
                case "app":
                    bVarM25681a.mo25716b(m25929l(jsonReader));
                    break;
                case "user":
                    bVarM25681a.mo25728n(m25919K(jsonReader));
                    break;
                case "generator":
                    bVarM25681a.mo25722h(jsonReader.nextString());
                    break;
                case "crashed":
                    bVarM25681a.mo25718d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    bVarM25681a.mo25723i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM25681a.mo25715a();
    }

    /* renamed from: K */
    private static AbstractC8258f0.e.f m25919K(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.f.a aVarM25903a = AbstractC8258f0.e.f.m25903a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                aVarM25903a.mo25581b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25903a.mo25580a();
    }

    /* renamed from: l */
    private static AbstractC8258f0.e.a m25929l(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.a.AbstractC11500a abstractC11500aM25699a = AbstractC8258f0.e.a.m25699a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "identifier":
                    abstractC11500aM25699a.mo25711e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    abstractC11500aM25699a.mo25708b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    abstractC11500aM25699a.mo25709c(jsonReader.nextString());
                    break;
                case "version":
                    abstractC11500aM25699a.mo25713g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    abstractC11500aM25699a.mo25712f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    abstractC11500aM25699a.mo25710d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11500aM25699a.mo25707a();
    }

    /* renamed from: m */
    private static AbstractC8258f0.a m25930m(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.a.b bVarM25671a = AbstractC8258f0.a.m25671a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    bVarM25671a.mo25619b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.c
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25932o(jsonReader2);
                        }
                    }));
                    break;
                case "pid":
                    bVarM25671a.mo25621d(jsonReader.nextInt());
                    break;
                case "pss":
                    bVarM25671a.mo25623f(jsonReader.nextLong());
                    break;
                case "rss":
                    bVarM25671a.mo25625h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    bVarM25671a.mo25626i(jsonReader.nextLong());
                    break;
                case "processName":
                    bVarM25671a.mo25622e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    bVarM25671a.mo25624g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    bVarM25671a.mo25627j(jsonReader.nextString());
                    break;
                case "importance":
                    bVarM25671a.mo25620c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM25671a.mo25618a();
    }

    /* renamed from: n */
    private static <T> List<T> m25931n(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo25908a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static AbstractC8258f0.a.AbstractC11498a m25932o(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.a.AbstractC11498a.AbstractC11499a abstractC11499aM25672a = AbstractC8258f0.a.AbstractC11498a.m25672a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    abstractC11499aM25672a.mo25640d(jsonReader.nextString());
                    break;
                case "arch":
                    abstractC11499aM25672a.mo25638b(jsonReader.nextString());
                    break;
                case "buildId":
                    abstractC11499aM25672a.mo25639c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11499aM25672a.mo25637a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static AbstractC8258f0.c m25933p(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.c.a aVarM25673a = AbstractC8258f0.c.m25673a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals(RoomNotification.KEY)) {
                aVarM25673a.mo25653b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                aVarM25673a.mo25654c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25673a.mo25652a();
    }

    /* renamed from: q */
    private static AbstractC8258f0.e.c m25934q(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.c.a aVarM25729a = AbstractC8258f0.e.c.m25729a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "simulator":
                    aVarM25729a.mo25747i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    aVarM25729a.mo25743e(jsonReader.nextString());
                    break;
                case "ram":
                    aVarM25729a.mo25746h(jsonReader.nextLong());
                    break;
                case "arch":
                    aVarM25729a.mo25740b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    aVarM25729a.mo25742d(jsonReader.nextLong());
                    break;
                case "cores":
                    aVarM25729a.mo25741c(jsonReader.nextInt());
                    break;
                case "model":
                    aVarM25729a.mo25744f(jsonReader.nextString());
                    break;
                case "state":
                    aVarM25729a.mo25748j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    aVarM25729a.mo25745g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM25729a.mo25739a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static AbstractC8258f0.e.d m25935r(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.b bVarM25749a = AbstractC8258f0.e.d.m25749a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "device":
                    bVarM25749a.mo25850c(m25938u(jsonReader));
                    break;
                case "rollouts":
                    bVarM25749a.mo25852e(m25909A(jsonReader));
                    break;
                case "app":
                    bVarM25749a.mo25849b(m25936s(jsonReader));
                    break;
                case "log":
                    bVarM25749a.mo25851d(m25942y(jsonReader));
                    break;
                case "type":
                    bVarM25749a.mo25854g(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVarM25749a.mo25853f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVarM25749a.mo25848a();
    }

    /* renamed from: s */
    private static AbstractC8258f0.e.d.a m25936s(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.AbstractC11501a abstractC11501aM25757a = AbstractC8258f0.e.d.a.m25757a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appProcessDetails":
                    abstractC11501aM25757a.mo25767b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.e
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25915G(jsonReader2);
                        }
                    }));
                    break;
                case "background":
                    abstractC11501aM25757a.mo25768c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    abstractC11501aM25757a.mo25771f(m25939v(jsonReader));
                    break;
                case "internalKeys":
                    abstractC11501aM25757a.mo25772g(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.i
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25933p(jsonReader2);
                        }
                    }));
                    break;
                case "customAttributes":
                    abstractC11501aM25757a.mo25770e(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.i
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25933p(jsonReader2);
                        }
                    }));
                    break;
                case "uiOrientation":
                    abstractC11501aM25757a.mo25773h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    abstractC11501aM25757a.mo25769d(m25915G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11501aM25757a.mo25766a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static AbstractC8258f0.e.d.a.b.AbstractC11502a m25937t(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.AbstractC11502a.AbstractC11503a abstractC11503aM25780a = AbstractC8258f0.e.d.a.b.AbstractC11502a.m25780a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "name":
                    abstractC11503aM25780a.mo25788c(jsonReader.nextString());
                    break;
                case "size":
                    abstractC11503aM25780a.mo25789d(jsonReader.nextLong());
                    break;
                case "uuid":
                    abstractC11503aM25780a.m25791f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    abstractC11503aM25780a.mo25787b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11503aM25780a.mo25786a();
    }

    /* renamed from: u */
    private static AbstractC8258f0.e.d.c m25938u(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.c.a aVarM25855a = AbstractC8258f0.e.d.c.m25855a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "batteryLevel":
                    aVarM25855a.mo25863b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    aVarM25855a.mo25864c(jsonReader.nextInt());
                    break;
                case "orientation":
                    aVarM25855a.mo25866e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    aVarM25855a.mo25865d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    aVarM25855a.mo25868g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    aVarM25855a.mo25867f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM25855a.mo25862a();
    }

    /* renamed from: v */
    private static AbstractC8258f0.e.d.a.b m25939v(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.AbstractC11504b abstractC11504bM25774a = AbstractC8258f0.e.d.a.b.m25774a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "appExitInfo":
                    abstractC11504bM25774a.mo25793b(m25930m(jsonReader));
                    break;
                case "threads":
                    abstractC11504bM25774a.mo25797f(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.f
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25911C(jsonReader2);
                        }
                    }));
                    break;
                case "signal":
                    abstractC11504bM25774a.mo25796e(m25910B(jsonReader));
                    break;
                case "binaries":
                    abstractC11504bM25774a.mo25794c(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.h
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8271j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            return C8271j.m25937t(jsonReader2);
                        }
                    }));
                    break;
                case "exception":
                    abstractC11504bM25774a.mo25795d(m25940w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11504bM25774a.mo25792a();
    }

    /* renamed from: w */
    private static AbstractC8258f0.e.d.a.b.c m25940w(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.c.AbstractC11505a abstractC11505aM25798a = AbstractC8258f0.e.d.a.b.c.m25798a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    abstractC11505aM25798a.mo25806c(m25931n(jsonReader, C8265d.f31379a));
                    break;
                case "reason":
                    abstractC11505aM25798a.mo25808e(jsonReader.nextString());
                    break;
                case "type":
                    abstractC11505aM25798a.mo25809f(jsonReader.nextString());
                    break;
                case "causedBy":
                    abstractC11505aM25798a.mo25805b(m25940w(jsonReader));
                    break;
                case "overflowCount":
                    abstractC11505aM25798a.mo25807d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11505aM25798a.mo25804a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b m25941x(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.AbstractC11511a abstractC11511aM25826a = AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.m25826a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "offset":
                    abstractC11511aM25826a.mo25835d(jsonReader.nextLong());
                    break;
                case "symbol":
                    abstractC11511aM25826a.mo25837f(jsonReader.nextString());
                    break;
                case "pc":
                    abstractC11511aM25826a.mo25836e(jsonReader.nextLong());
                    break;
                case "file":
                    abstractC11511aM25826a.mo25833b(jsonReader.nextString());
                    break;
                case "importance":
                    abstractC11511aM25826a.mo25834c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return abstractC11511aM25826a.mo25832a();
    }

    /* renamed from: y */
    private static AbstractC8258f0.e.d.AbstractC11513d m25942y(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.AbstractC11513d.a aVarM25869a = AbstractC8258f0.e.d.AbstractC11513d.m25869a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                aVarM25869a.mo25872b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return aVarM25869a.mo25871a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static AbstractC8258f0.e.d.AbstractC11514e m25943z(JsonReader jsonReader) throws IOException {
        AbstractC8258f0.e.d.AbstractC11514e.a aVarM25873a = AbstractC8258f0.e.d.AbstractC11514e.m25873a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "parameterKey":
                    aVarM25873a.mo25879b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    aVarM25873a.mo25882e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    aVarM25873a.mo25881d(m25917I(jsonReader));
                    break;
                case "parameterValue":
                    aVarM25873a.mo25880c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return aVarM25873a.mo25878a();
    }

    /* renamed from: L */
    public AbstractC8258f0 m25944L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC8258f0 abstractC8258f0M25916H = m25916H(jsonReader);
                jsonReader.close();
                return abstractC8258f0M25916H;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: M */
    public String m25945M(AbstractC8258f0 abstractC8258f0) {
        return f31385a.mo26075b(abstractC8258f0);
    }

    /* renamed from: a */
    public AbstractC8258f0.e.d m25946a(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC8258f0.e.d dVarM25935r = m25935r(jsonReader);
                jsonReader.close();
                return dVarM25935r;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: b */
    public String m25947b(AbstractC8258f0.e.d dVar) {
        return f31385a.mo26075b(dVar);
    }
}
