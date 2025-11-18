package E4;

import E4.e;
import P5.C1608p;
import android.content.Context;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.SavedCook;
import com.apptionlabs.meater_app.versions.VersionNodeApp;
import com.apptionlabs.meater_app.versions.VersionRequest;
import com.apptionlabs.meater_app.versions.Versions;
import com.google.gson.Gson;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.E;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VersionsRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LE4/m;", "", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: VersionsRequest.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J=\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b!\u0010\"J[\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010#\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000e¨\u0006*"}, d2 = {"LE4/m$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "r", "()Lorg/json/JSONObject;", "jsonObject", "s", "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "LE4/m$b;", "serverRequestCallBack", "Loa/F;", "p", "(LE4/m$b;)V", "Lcom/apptionlabs/meater_app/versions/Versions;", "versions", "k", "(Lcom/apptionlabs/meater_app/versions/Versions;LE4/m$b;)V", "Ljava/nio/ByteBuffer;", "firmwarePlus", "l", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;LE4/m$b;)V", "firmwarePlusSE", "m", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;LE4/m$b;)V", "firmwarePlusV2", "n", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;LE4/m$b;)V", "firmwarePro", "h", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;LE4/m$b;)V", "firmwareBlock", "j", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;LE4/m$b;)V", "firmwareDuo", "i", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;LE4/m$b;)V", "", "q", "()Ljava/lang/String;", "o", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E4.m$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: VersionsRequest.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0069a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3936a;

            static {
                int[] iArr = new int[MEATERDeviceType.values().length];
                try {
                    iArr[MEATERDeviceType.PLUS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MEATERDeviceType.BLOCK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MEATERDeviceType.AMBER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MEATERDeviceType.PROBE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MEATERDeviceType.BLOCK_PROBE_ONE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MEATERDeviceType.BLOCK_PROBE_TWO.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MEATERDeviceType.BLOCK_PROBE_THREE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MEATERDeviceType.BLOCK_PROBE_FOUR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_PROBE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_ONE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_TWO.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_THREE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[MEATERDeviceType.SECOND_GENERATION_BLOCK_PROBE_FOUR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                f3936a = iArr;
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$b", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$b */
        public static final class b implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3937a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3938b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3939c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3940d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3941e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3942f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3943g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b f3944h;

            b(Context context, String str, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, b bVar) {
                this.f3937a = context;
                this.f3938b = str;
                this.f3939c = versions;
                this.f3940d = byteBuffer;
                this.f3941e = byteBuffer2;
                this.f3942f = byteBuffer3;
                this.f3943g = byteBuffer4;
                this.f3944h = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.j(this.f3939c, this.f3940d, this.f3941e, this.f3942f, this.f3943g, null, this.f3944h);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3937a, this.f3938b, firmwareImage);
                m.INSTANCE.j(this.f3939c, this.f3940d, this.f3941e, this.f3942f, this.f3943g, firmwareImage, this.f3944h);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$c", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$c */
        public static final class c implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3945a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3946b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f3947c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Versions f3948d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3949e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3950f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3951g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3952h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3953i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3954j;

            c(Context context, String str, b bVar, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6) {
                this.f3945a = context;
                this.f3946b = str;
                this.f3947c = bVar;
                this.f3948d = versions;
                this.f3949e = byteBuffer;
                this.f3950f = byteBuffer2;
                this.f3951g = byteBuffer3;
                this.f3952h = byteBuffer4;
                this.f3953i = byteBuffer5;
                this.f3954j = byteBuffer6;
            }

            @Override // E4.e.b
            public void a() {
                this.f3947c.onFetchVersionInformation(this.f3948d, this.f3949e, this.f3950f, this.f3951g, this.f3952h, this.f3953i, this.f3954j, null);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3945a, this.f3946b, firmwareImage);
                this.f3947c.onFetchVersionInformation(this.f3948d, this.f3949e, this.f3950f, this.f3951g, this.f3952h, this.f3953i, this.f3954j, firmwareImage);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$d", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$d */
        public static final class d implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3956b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3957c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3958d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3959e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3960f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3961g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3962h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ b f3963i;

            d(Context context, String str, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, b bVar) {
                this.f3955a = context;
                this.f3956b = str;
                this.f3957c = versions;
                this.f3958d = byteBuffer;
                this.f3959e = byteBuffer2;
                this.f3960f = byteBuffer3;
                this.f3961g = byteBuffer4;
                this.f3962h = byteBuffer5;
                this.f3963i = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.i(this.f3957c, this.f3958d, this.f3959e, this.f3960f, this.f3961g, this.f3962h, null, this.f3963i);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3955a, this.f3956b, firmwareImage);
                m.INSTANCE.i(this.f3957c, this.f3958d, this.f3959e, this.f3960f, this.f3961g, this.f3962h, firmwareImage, this.f3963i);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$e", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$e */
        public static final class e implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3964a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3965b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3966c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ b f3967d;

            e(Context context, String str, Versions versions, b bVar) {
                this.f3964a = context;
                this.f3965b = str;
                this.f3966c = versions;
                this.f3967d = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.l(this.f3966c, null, this.f3967d);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3964a, this.f3965b, firmwareImage);
                m.INSTANCE.l(this.f3966c, firmwareImage, this.f3967d);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$f", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$f */
        public static final class f implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3968a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3969b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3970c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3971d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f3972e;

            f(Context context, String str, Versions versions, ByteBuffer byteBuffer, b bVar) {
                this.f3968a = context;
                this.f3969b = str;
                this.f3970c = versions;
                this.f3971d = byteBuffer;
                this.f3972e = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.m(this.f3970c, this.f3971d, null, this.f3972e);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3968a, this.f3969b, firmwareImage);
                m.INSTANCE.m(this.f3970c, this.f3971d, firmwareImage, this.f3972e);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$g", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$g */
        public static final class g implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3973a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3974b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3975c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3976d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3977e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f3978f;

            g(Context context, String str, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, b bVar) {
                this.f3973a = context;
                this.f3974b = str;
                this.f3975c = versions;
                this.f3976d = byteBuffer;
                this.f3977e = byteBuffer2;
                this.f3978f = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.n(this.f3975c, this.f3976d, this.f3977e, null, this.f3978f);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3973a, this.f3974b, firmwareImage);
                m.INSTANCE.n(this.f3975c, this.f3976d, this.f3977e, firmwareImage, this.f3978f);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"E4/m$a$h", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$h */
        public static final class h implements e.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f3979a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f3980b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Versions f3981c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3982d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3983e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f3984f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f3985g;

            h(Context context, String str, Versions versions, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, b bVar) {
                this.f3979a = context;
                this.f3980b = str;
                this.f3981c = versions;
                this.f3982d = byteBuffer;
                this.f3983e = byteBuffer2;
                this.f3984f = byteBuffer3;
                this.f3985g = bVar;
            }

            @Override // E4.e.b
            public void a() {
                m.INSTANCE.h(this.f3981c, this.f3982d, this.f3983e, this.f3984f, null, this.f3985g);
            }

            @Override // E4.e.b
            public void b(ByteBuffer firmwareImage) throws Throwable {
                C1608p.m(this.f3979a, this.f3980b, firmwareImage);
                m.INSTANCE.h(this.f3981c, this.f3982d, this.f3983e, this.f3984f, firmwareImage, this.f3985g);
            }
        }

        /* compiled from: VersionsRequest.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"E4/m$a$i", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.m$a$i */
        public static final class i implements nd.d<E> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f3986a;

            i(b bVar) {
                this.f3986a = bVar;
            }

            @Override // nd.d
            public void onFailure(nd.b<E> call, Throwable t10) {
                C3862t.g(call, "call");
                C3862t.g(t10, "t");
                U4.b.x("[VERSION-CHECK] onFailure >>> " + t10.getLocalizedMessage(), new Object[0]);
            }

            @Override // nd.d
            public void onResponse(nd.b<E> call, s<E> response) {
                Versions versions;
                VersionNodeApp versionNodeApp;
                C3862t.g(call, "call");
                C3862t.g(response, "response");
                if (!response.f()) {
                    U4.b.x("[VERSION-CHECK] response code %s", Integer.valueOf(response.b()));
                    return;
                }
                try {
                    E eA = response.a();
                    if (eA == null || (versionNodeApp = (versions = (Versions) new Gson().k(eA.j(), Versions.class)).app) == null || versionNodeApp.version == null) {
                        return;
                    }
                    b bVar = this.f3986a;
                    Companion companion = m.INSTANCE;
                    C3862t.d(versions);
                    companion.k(versions, bVar);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    U4.b.x("[VERSION-CHECK] parsing response failed %s", e10.getLocalizedMessage());
                }
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, ByteBuffer firmwarePlusV2, ByteBuffer firmwarePro, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.block.url;
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (byteBufferA != null) {
                j(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, byteBufferA, serverRequestCallBack);
                return;
            }
            e.Companion companion = E4.e.INSTANCE;
            C3862t.d(str);
            companion.c(str, new b(contextH, strB, versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, serverRequestCallBack));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, ByteBuffer firmwarePlusV2, ByteBuffer firmwarePro, ByteBuffer firmwareBlock, ByteBuffer firmwareDuo, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.blockV2.url;
            if (str == null) {
                U4.b.x("[VERSION-CHECK] OOPS , blockV2Url is null let's download please investigate  ", new Object[0]);
                serverRequestCallBack.onFetchVersionInformation(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, firmwareDuo, null);
                return;
            }
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (byteBufferA != null) {
                serverRequestCallBack.onFetchVersionInformation(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, firmwareDuo, byteBufferA);
            } else {
                E4.e.INSTANCE.c(str, new c(contextH, strB, serverRequestCallBack, versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, firmwareDuo));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void j(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, ByteBuffer firmwarePlusV2, ByteBuffer firmwarePro, ByteBuffer firmwareBlock, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.duo.url;
            if (str == null) {
                i(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, null, serverRequestCallBack);
                return;
            }
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (byteBufferA != null) {
                i(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, byteBufferA, serverRequestCallBack);
            } else {
                E4.e.INSTANCE.c(str, new d(contextH, strB, versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, firmwarePro, firmwareBlock, serverRequestCallBack));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k(Versions versions, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.plus.url;
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (byteBufferA != null) {
                l(versions, byteBufferA, serverRequestCallBack);
                return;
            }
            e.Companion companion = E4.e.INSTANCE;
            C3862t.d(str);
            companion.c(str, new e(contextH, strB, versions, serverRequestCallBack));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void l(Versions versions, ByteBuffer firmwarePlus, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.se.url;
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (str == null) {
                U4.b.x("[VERSION-CHECK] OOPS, plusUrlV2 is null let's download blockfirmware,  please investigate  ", new Object[0]);
                m(versions, firmwarePlus, null, serverRequestCallBack);
            } else if (byteBufferA != null) {
                m(versions, firmwarePlus, byteBufferA, serverRequestCallBack);
            } else {
                E4.e.INSTANCE.c(str, new f(contextH, strB, versions, firmwarePlus, serverRequestCallBack));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.plusV2.url;
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (str == null) {
                U4.b.x("[VERSION-CHECK] OOPS, plusUrlV2 is null let's download blockfirmware,  please investigate  ", new Object[0]);
                n(versions, firmwarePlus, firmwarePlusSE, null, serverRequestCallBack);
            } else if (byteBufferA != null) {
                n(versions, firmwarePlus, firmwarePlusSE, byteBufferA, serverRequestCallBack);
            } else {
                E4.e.INSTANCE.c(str, new g(contextH, strB, versions, firmwarePlus, firmwarePlusSE, serverRequestCallBack));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, ByteBuffer firmwarePlusV2, b serverRequestCallBack) {
            Context contextH = x4.g.h();
            String str = versions.pro.url;
            String strB = C1608p.b(str);
            ByteBuffer byteBufferA = C1608p.a(contextH, strB);
            if (str == null) {
                U4.b.x("[VERSION-CHECK] OOPS, plusUrlV2 is null let's download blockfirmware,  please investigate  ", new Object[0]);
                h(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, null, serverRequestCallBack);
            } else if (byteBufferA != null) {
                h(versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, byteBufferA, serverRequestCallBack);
            } else {
                E4.e.INSTANCE.c(str, new h(contextH, strB, versions, firmwarePlus, firmwarePlusSE, firmwarePlusV2, serverRequestCallBack));
            }
        }

        private final void p(b serverRequestCallBack) throws JSONException {
            nd.b<E> bVarL;
            JSONObject jSONObjectR = r();
            if (jSONObjectR == null) {
                return;
            }
            U4.b.x("[VERSION-CHECK] request " + jSONObjectR, new Object[0]);
            com.google.gson.j jVarA = new com.google.gson.m().a(jSONObjectR.toString());
            F5.a aVarG = x4.f.g(x4.f.f52783a, false, null, 3, null);
            if (aVarG == null || (bVarL = aVarG.l(jVarA)) == null) {
                return;
            }
            bVarL.enqueue(new i(serverRequestCallBack));
        }

        private final String q() {
            SavedCook savedCookG = LocalStorage.sharedStorage().savedCookDAO().g();
            if (savedCookG == null) {
                return null;
            }
            return DateExtensionKt.getDateFormatWithTimeZone().format(new Date(savedCookG.getCookStartTime() * 1000));
        }

        private final JSONObject r() throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject(new Gson().t(new VersionRequest()));
                String strQ = q();
                if (strQ != null) {
                    jSONObject.put("first_cook_date", strQ);
                }
                MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
                if (mEATERCloudAccountL != null) {
                    jSONObject.put("email", mEATERCloudAccountL.email);
                }
                jSONObject.put("temp_scale", x4.g.t().n1() ? "F" : "C");
                return s(jSONObject);
            } catch (JSONException unused) {
                return null;
            }
        }

        private final JSONObject s(JSONObject jsonObject) throws JSONException {
            try {
                Iterator<MEATERDevice> it = M4.h.f11978a.K().iterator();
                while (it.hasNext()) {
                    MEATERDeviceType mEATERDeviceType = it.next().getMEATERDeviceType();
                    C3862t.f(mEATERDeviceType, "getMEATERDeviceType(...)");
                    switch (C0069a.f3936a[mEATERDeviceType.ordinal()]) {
                        case 1:
                            jsonObject.put("have_meater_plus", true);
                            break;
                        case 2:
                            jsonObject.put("have_meater_block", true);
                            break;
                        case 3:
                            jsonObject.put("have_amber", true);
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                        case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                        case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                            jsonObject.put("have_meater_probe", true);
                            break;
                        default:
                            return jsonObject;
                    }
                }
                return jsonObject;
            } catch (JSONException unused) {
                throw new IllegalStateException("Failed updateRequestJSONObjectForPairedDeviceType");
            }
        }

        public final void o(b serverRequestCallBack) {
            C3862t.g(serverRequestCallBack, "serverRequestCallBack");
            p(serverRequestCallBack);
        }

        private Companion() {
        }
    }

    /* compiled from: VersionsRequest.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J_\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LE4/m$b;", "", "Lcom/apptionlabs/meater_app/versions/Versions;", "versions", "Ljava/nio/ByteBuffer;", "firmwarePlus", "firmwarePlusSE", "firmwarePlusV2", "firmwarePro", "firmwareBlock", "firmwareDuo", "firmwareBlockV2", "Loa/F;", "onFetchVersionInformation", "(Lcom/apptionlabs/meater_app/versions/Versions;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void onFetchVersionInformation(Versions versions, ByteBuffer firmwarePlus, ByteBuffer firmwarePlusSE, ByteBuffer firmwarePlusV2, ByteBuffer firmwarePro, ByteBuffer firmwareBlock, ByteBuffer firmwareDuo, ByteBuffer firmwareBlockV2);
    }
}
