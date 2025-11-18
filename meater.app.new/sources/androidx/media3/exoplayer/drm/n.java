package androidx.media3.exoplayer.drm;

import U1.C1732h;
import U1.C1738n;
import X1.C1804a;
import X1.L;
import X1.y;
import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import androidx.media3.exoplayer.drm.m;
import e2.v1;
import i2.q;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: FrameworkMediaDrm.java */
/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final m.c f27137d = new m.c() { // from class: i2.n
        @Override // androidx.media3.exoplayer.drm.m.c
        public final androidx.media3.exoplayer.drm.m a(UUID uuid) {
            return androidx.media3.exoplayer.drm.n.C(uuid);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final UUID f27138a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaDrm f27139b;

    /* renamed from: c, reason: collision with root package name */
    private int f27140c;

    /* compiled from: FrameworkMediaDrm.java */
    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, v1 v1Var) {
            LogSessionId logSessionIdA = v1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            q.a(C1804a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private n(UUID uuid) {
        C1804a.e(uuid);
        C1804a.b(!C1732h.f17048b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f27138a = uuid;
        MediaDrm mediaDrm = new MediaDrm(v(uuid));
        this.f27139b = mediaDrm;
        this.f27140c = 1;
        if (C1732h.f17050d.equals(uuid) && D()) {
            x(mediaDrm);
        }
    }

    private boolean A() {
        if (!this.f27138a.equals(C1732h.f17050d)) {
            return this.f27138a.equals(C1732h.f17049c);
        }
        String strY = y("version");
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(m.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.a(this, bArr, i10, i11, bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ m C(UUID uuid) {
        try {
            return E(uuid);
        } catch (UnsupportedDrmException unused) {
            X1.n.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new k();
        }
    }

    private static boolean D() {
        return "ASUS_Z00AD".equals(L.f18629d);
    }

    public static n E(UUID uuid) throws UnsupportedDrmException {
        try {
            return new n(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new UnsupportedDrmException(1, e10);
        } catch (Exception e11) {
            throw new UnsupportedDrmException(2, e11);
        }
    }

    private static byte[] q(byte[] bArr) {
        y yVar = new y(bArr);
        int iU = yVar.u();
        short sW = yVar.w();
        short sW2 = yVar.w();
        if (sW != 1 || sW2 != 1) {
            X1.n.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = yVar.w();
        Charset charset = StandardCharsets.UTF_16LE;
        String strF = yVar.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            X1.n.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i10 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String r(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (L.f18626a >= 33 && "https://default.url".equals(str)) {
            String strY = y("version");
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        return C1732h.f17049c.equals(uuid) ? androidx.media3.exoplayer.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] t(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = U1.C1732h.f17051e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = P2.o.e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = q(r4)
            byte[] r4 = P2.o.a(r0, r4)
        L18:
            int r1 = X1.L.f18626a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = U1.C1732h.f17050d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = X1.L.f18628c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5f
            java.lang.String r0 = X1.L.f18629d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = P2.o.e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.n.t(java.util.UUID, byte[]):byte[]");
    }

    private static String u(UUID uuid, String str) {
        return (L.f18626a < 26 && C1732h.f17049c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID v(UUID uuid) {
        return (L.f18626a >= 27 || !C1732h.f17049c.equals(uuid)) ? uuid : C1732h.f17048b;
    }

    private static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static C1738n.b z(UUID uuid, List<C1738n.b> list) {
        if (!C1732h.f17050d.equals(uuid)) {
            return list.get(0);
        }
        if (L.f18626a >= 28 && list.size() > 1) {
            C1738n.b bVar = list.get(0);
            int length = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                C1738n.b bVar2 = list.get(i10);
                byte[] bArr = (byte[]) C1804a.e(bVar2.f17095F);
                if (L.d(bVar2.f17094E, bVar.f17094E) && L.d(bVar2.f17093D, bVar.f17093D) && P2.o.c(bArr)) {
                    length += bArr.length;
                }
            }
            byte[] bArr2 = new byte[length];
            int i11 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                byte[] bArr3 = (byte[]) C1804a.e(list.get(i12).f17095F);
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, bArr2, i11, length2);
                i11 += length2;
            }
            return bVar.b(bArr2);
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            C1738n.b bVar3 = list.get(i13);
            int iG = P2.o.g((byte[]) C1804a.e(bVar3.f17095F));
            int i14 = L.f18626a;
            if (i14 < 23 && iG == 0) {
                return bVar3;
            }
            if (i14 >= 23 && iG == 1) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public Map<String, String> a(byte[] bArr) {
        return this.f27139b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public m.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f27139b.getProvisionRequest();
        return new m.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // androidx.media3.exoplayer.drm.m
    public synchronized void c() {
        int i10 = this.f27140c - 1;
        this.f27140c = i10;
        if (i10 == 0) {
            this.f27139b.release();
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] e() {
        return this.f27139b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.m
    public boolean f(byte[] bArr, String str) throws Throwable {
        MediaCrypto mediaCrypto;
        if (L.f18626a >= 31 && A()) {
            MediaDrm mediaDrm = this.f27139b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            mediaCrypto = new MediaCrypto(this.f27138a, bArr);
        } catch (MediaCryptoException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void g(byte[] bArr, byte[] bArr2) {
        this.f27139b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void h(byte[] bArr) {
        this.f27139b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public byte[] i(byte[] bArr, byte[] bArr2) throws JSONException {
        if (C1732h.f17049c.equals(this.f27138a)) {
            bArr2 = androidx.media3.exoplayer.drm.a.b(bArr2);
        }
        return this.f27139b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void j(final m.b bVar) {
        this.f27139b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: i2.o
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                this.f43058a.B(bVar, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void k(byte[] bArr) throws DeniedByServerException {
        this.f27139b.provideProvisionResponse(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.m
    @SuppressLint({"WrongConstant"})
    public m.a l(byte[] bArr, List<C1738n.b> list, int i10, HashMap<String, String> map) throws NotProvisionedException {
        C1738n.b bVarZ;
        byte[] bArrT;
        String strU;
        if (list != null) {
            bVarZ = z(this.f27138a, list);
            bArrT = t(this.f27138a, (byte[]) C1804a.e(bVarZ.f17095F));
            strU = u(this.f27138a, bVarZ.f17094E);
        } else {
            bVarZ = null;
            bArrT = null;
            strU = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f27139b.getKeyRequest(bArr, bArrT, strU, i10, map);
        byte[] bArrS = s(this.f27138a, keyRequest.getData());
        String strR = r(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strR) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f17093D)) {
            strR = bVarZ.f17093D;
        }
        return new m.a(bArrS, strR, L.f18626a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // androidx.media3.exoplayer.drm.m
    public void m(byte[] bArr, v1 v1Var) {
        if (L.f18626a >= 31) {
            try {
                a.b(this.f27139b, bArr, v1Var);
            } catch (UnsupportedOperationException unused) {
                X1.n.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.m
    public int n() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.m
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public i2.l d(byte[] bArr) {
        return new i2.l(v(this.f27138a), bArr);
    }

    public String y(String str) {
        return this.f27139b.getPropertyString(str);
    }
}
